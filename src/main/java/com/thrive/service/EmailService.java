package com.thrive.service;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import com.thrive.model.EmailRequest;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmailService {

    @ConfigProperty(name = "mail.sender")
    private String sender;

    @ConfigProperty(name = "mail.api.key")
    private String apiKey;

    @ConfigProperty(name = "mail.api.secret")
    private String apiSecretKey;


    public MailjetResponse sendEmail(EmailRequest emailRequest, String Subject, String Content) throws MailjetException, MailjetSocketTimeoutException {
        MailjetRequest request;
        MailjetResponse response;

        ClientOptions options = ClientOptions.builder()
                .apiKey(apiKey)
                .apiSecretKey(apiSecretKey)
                .build();

        MailjetClient client = new MailjetClient(options);

        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", sender)
                                        .put("Name", "Me"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", emailRequest.getEmail())
                                                .put("Name", emailRequest.getNama())))
                                .put(Emailv31.Message.SUBJECT, Subject)
                                .put(Emailv31.Message.TEXTPART, Content)
                                .put(Emailv31.Message.HTMLPART, Content)));
        response = client.post(request);

        return response;
    }
}
