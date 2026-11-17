package com.meta.mftpaymentssecurity.auth.models;

import com.facebook.aura.gateway.JarvisProtocolKt;
import com.meta.mftpaymentssecurity.ptt.interfaces.Sensitive;
import com.meta.mftpaymentssecurity.ptt.interfaces.SerializedName;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class PttPayload {

    @SerializedName(JarvisProtocolKt.APP_ID_QUERY_PARAM)
    public final String mAppId;

    @SerializedName("at-fbid")
    public final String mAtFBID;

    @SerializedName("auth_ticket_type")
    public final String mAuthTicketType;

    @SerializedName("caps")
    public final List<String> mCaps;

    @SerializedName("cred_id")
    public final String mCredId;

    @Sensitive
    @SerializedName("csc")
    public final String mCsc;

    @SerializedName("device_id")
    public final String mDeviceId;

    @SerializedName("encrypted_paypal_access_token")
    public final String mEncryptedPaypalAccessToken;

    @Sensitive
    @SerializedName("pin")
    public final String mPin;

    @SerializedName("public_key")
    public final String mPublicKey;

    @SerializedName("fx_access_token")
    public final String mSsoAccessToken;

    public static PttPayload deleteBio(String str) {
        return new PttPayload(null, null, null, null, null, null, null, null, null, str, null);
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAuthTicketType() {
        return this.mAuthTicketType;
    }

    public List<String> getCaps() {
        return this.mCaps;
    }

    public String getCredId() {
        return this.mCredId;
    }

    public String getCsc() {
        return this.mCsc;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getPin() {
        return this.mPin;
    }

    public String getPublicKey() {
        return this.mPublicKey;
    }

    public PttPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, String str9, String str10) {
        this.mAuthTicketType = str;
        this.mDeviceId = str2;
        this.mAppId = str3;
        this.mPin = str4;
        this.mCsc = str5;
        this.mCredId = str6;
        this.mEncryptedPaypalAccessToken = str7;
        this.mCaps = list;
        this.mPublicKey = str8;
        this.mAtFBID = str9;
        this.mSsoAccessToken = str10;
    }

    public static PttPayload byBio(String str, String str2, String str3, List<String> list) {
        return new PttPayload("BIO", str, str2, null, null, null, null, Collections.unmodifiableList(list), str3, null, null);
    }

    public static PttPayload byCsc(String str, String str2, String str3, String str4, String str5, List<String> list) {
        return new PttPayload("CSC", str, str2, null, str3, str4, null, Collections.unmodifiableList(list), str5, null, null);
    }

    public static PttPayload byPayPal(String str, String str2, String str3, String str4, String str5, List<String> list) {
        return new PttPayload("PAYPAL_ACCESS_TOKEN", str, str2, null, null, str4, str3, Collections.unmodifiableList(list), str5, null, null);
    }

    public static PttPayload byPin(String str, String str2, String str3, String str4, List<String> list) {
        return new PttPayload("PIN", str, str2, str3, null, null, null, Collections.unmodifiableList(list), str4, null, null);
    }
}
