package com.thrive.resource;

import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.thrive.model.EmailRequest;
import com.thrive.service.EmailService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class EmailResource {
import com.mailjet.client.MailjetClient;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;
import com.thrive.model.EmailRequest;
import com.thrive.service.EmailService;
import com.thrive.service.ItemService;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

    @Path("email")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public class EmailResouce{

        @Inject
        EmailService emailService;

        @Path("default")
        @POST
        public EmailRequest create(EmailRequest email){
            return email;
        }

        @POST
        public MailjetResponse sendEmail(EmailRequest email) throws MailjetException, MailjetSocketTimeoutException {
            return
                    emailService.sendEmail (email,"Subject isi disini","content isi disini");
        }

}
