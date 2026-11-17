package com.facebook.aura.commands.sms;

import X.AnonymousClass002;
import X.BFI;
import X.C06827l3;
import X.C06847l8;
import X.C60Q;
import X.C7384Etj;
import X.C9tI;
import X.FGI;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class DeviceSmsReaderKt {
    public static final String ATTACHMENT_AUDIO = "audio";
    public static final String ATTACHMENT_CONTACT = "contact";
    public static final String ATTACHMENT_ID_PREFIX = "mms-part-";
    public static final C06827l3 ATTACHMENT_ID_REGEX;
    public static final String ATTACHMENT_IMAGE = "image";
    public static final String ATTACHMENT_OTHER = "other";
    public static final String ATTACHMENT_TEXT = "text";
    public static final String ATTACHMENT_VIDEO = "video";
    public static final String MMS_ADDR_TYPE_CC = "130";
    public static final String MMS_ADDR_TYPE_FROM = "137";
    public static final String MMS_ADDR_TYPE_TO = "151";
    public static final String MMS_CT_SMIL = "application/smil";
    public static final String MMS_CT_TEXT = "text/plain";
    public static final String MMS_INSERT_ADDRESS_TOKEN = "insert-address-token";
    public static final String MMS_URI_PREFIX = "content://mms/";
    public static final int NARROW_DIGIT_COUNT = 7;
    public static final Set<Integer> RCS_CONTENT_CLASSES;
    public static final String SMS_URI_PREFIX = "content://sms/";
    public static final String TAG = "DeviceSmsReader";

    public static final Long partIdForAttachmentId(String str) {
        List<String> listAG1;
        String strA0n;
        C7384Etj.A0Y(str, 0);
        C06847l8 c06847l8A06 = ATTACHMENT_ID_REGEX.A06(AnonymousClass002.A0l(str));
        if (c06847l8A06 == null || (listAG1 = c06847l8A06.AG1()) == null || (strA0n = C60Q.A0n(listAG1, 1)) == null) {
            return null;
        }
        return C9tI.A0s(strA0n);
    }

    static {
        String strQuote = Pattern.quote(ATTACHMENT_ID_PREFIX);
        C7384Etj.A0U(strQuote);
        ATTACHMENT_ID_REGEX = C06827l3.A02(FGI.A0U("^", strQuote, "(\\d{1,18})$"));
        RCS_CONTENT_CLASSES = BFI.A0H(new Integer[]{130, 132, 135});
    }

    public static final String attachmentIdForPart(long j) {
        return FGI.A0B(j, ATTACHMENT_ID_PREFIX);
    }
}
