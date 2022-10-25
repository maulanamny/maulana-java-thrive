package com.thrive.resource;
import com.thrive.model.EmailModel;
import com.thrive.enums.ApiAuthenticationType;
import com.thrive.enums.ApiVersion;


public class Apikey {

    public static EmailModel resource =new EmailModel("apikey", "", ApiVersion.V3, ApiAuthenticationType.Basic);

    public static String ACL = "ACL";
    public static String APIKEY = "APIkey";
    public static String CREATEDAT = "CreatedAt";
    public static String ID = "ID";
    public static String ISACTIVE = "IsActive";
    public static String ISMASTER = "IsMaster";
    public static String NAME = "Name";
    public static String QUARANTINEVALUE = "QuarantineValue";
    public static String RUNLEVEL = "Runlevel";
    public static String SECRETKEY = "SecretKey";
    public static String TRACKHOST = "TrackHost";
    public static String USERID = "UserID";
    public static String CONFIRMKEY = "ConfirmKey";
    public static String CUSTOMSTATUS = "CustomStatus";
    public static String KEYTYPE = "KeyType";
    public static String USER = "User";
    public static String LIMIT = "Limit";
    public static String OFFSET = "Offset";
    public static String COUNTONLY = "CountOnly";

}

