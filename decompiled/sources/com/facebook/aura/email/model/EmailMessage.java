package com.facebook.aura.email.model;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.HsK;

/* loaded from: classes.dex */
public final class EmailMessage extends C06G {
    public final String attachmentStatus;
    public final AHD<EmailAttachment> attachments;
    public final String authenticationVerdict;
    public final AHD<EmailBodyPart> body;
    public final double createdAt;
    public final String deliveryStatus;
    public final String direction;
    public final AHD<String> headerCc;
    public final String headerFrom;
    public final String headerFromName;
    public final AHD<String> headerTo;
    public final String htmlBody;
    public final String htmlFallback;
    public final String htmlPreamble;
    public final String id;
    public final String inReplyTo;
    public final String preview;
    public final AHD<String> references;
    public final String rfcMessageId;
    public final String subject;

    public EmailMessage(String str, double d, String str2, String str3, String str4, AHD<String> ahd, String str5, String str6, String str7, String str8, AHD<String> ahd2, AHD<EmailBodyPart> ahd3, AHD<EmailAttachment> ahd4, String str9, String str10, String str11, String str12, String str13, String str14, AHD<String> ahd5) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, str3, str4, ahd, 2);
        AnonymousClass003.A10(str5, str6);
        AnonymousClass002.A1G(ahd2, 10, ahd3);
        AnonymousClass002.A1H(ahd4, 12, str10);
        C7384Etj.A0Y(ahd5, 19);
        this.id = str;
        this.createdAt = d;
        this.rfcMessageId = str2;
        this.headerFrom = str3;
        this.headerFromName = str4;
        this.headerTo = ahd;
        this.preview = str5;
        this.direction = str6;
        this.deliveryStatus = str7;
        this.inReplyTo = str8;
        this.references = ahd2;
        this.body = ahd3;
        this.attachments = ahd4;
        this.attachmentStatus = str9;
        this.subject = str10;
        this.htmlBody = str11;
        this.htmlPreamble = str12;
        this.htmlFallback = str13;
        this.authenticationVerdict = str14;
        this.headerCc = ahd5;
    }

    public final EmailMessage copy(String str, double d, String str2, String str3, String str4, AHD<String> ahd, String str5, String str6, String str7, String str8, AHD<String> ahd2, AHD<EmailBodyPart> ahd3, AHD<EmailAttachment> ahd4, String str9, String str10, String str11, String str12, String str13, String str14, AHD<String> ahd5) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, str3, str4, ahd, 2);
        AnonymousClass003.A10(str5, str6);
        AnonymousClass002.A1G(ahd2, 10, ahd3);
        AnonymousClass002.A1H(ahd4, 12, str10);
        C7384Etj.A0Y(ahd5, 19);
        return new EmailMessage(str, d, str2, str3, str4, ahd, str5, str6, str7, str8, ahd2, ahd3, ahd4, str9, str10, str11, str12, str13, str14, ahd5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailMessage) {
                EmailMessage emailMessage = (EmailMessage) obj;
                if (!C7384Etj.areEqual(this.id, emailMessage.id) || Double.compare(this.createdAt, emailMessage.createdAt) != 0 || !C7384Etj.areEqual(this.rfcMessageId, emailMessage.rfcMessageId) || !C7384Etj.areEqual(this.headerFrom, emailMessage.headerFrom) || !C7384Etj.areEqual(this.headerFromName, emailMessage.headerFromName) || !C7384Etj.areEqual(this.headerTo, emailMessage.headerTo) || !C7384Etj.areEqual(this.preview, emailMessage.preview) || !C7384Etj.areEqual(this.direction, emailMessage.direction) || !C7384Etj.areEqual(this.deliveryStatus, emailMessage.deliveryStatus) || !C7384Etj.areEqual(this.inReplyTo, emailMessage.inReplyTo) || !C7384Etj.areEqual(this.references, emailMessage.references) || !C7384Etj.areEqual(this.body, emailMessage.body) || !C7384Etj.areEqual(this.attachments, emailMessage.attachments) || !C7384Etj.areEqual(this.attachmentStatus, emailMessage.attachmentStatus) || !C7384Etj.areEqual(this.subject, emailMessage.subject) || !C7384Etj.areEqual(this.htmlBody, emailMessage.htmlBody) || !C7384Etj.areEqual(this.htmlPreamble, emailMessage.htmlPreamble) || !C7384Etj.areEqual(this.htmlFallback, emailMessage.htmlFallback) || !C7384Etj.areEqual(this.authenticationVerdict, emailMessage.authenticationVerdict) || !C7384Etj.areEqual(this.headerCc, emailMessage.headerCc)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.inReplyTo;
    }

    public final AHD<String> component11() {
        return this.references;
    }

    public final AHD<EmailBodyPart> component12() {
        return this.body;
    }

    public final AHD<EmailAttachment> component13() {
        return this.attachments;
    }

    public final String component14() {
        return this.attachmentStatus;
    }

    public final String component15() {
        return this.subject;
    }

    public final String component16() {
        return this.htmlBody;
    }

    public final String component17() {
        return this.htmlPreamble;
    }

    public final String component18() {
        return this.htmlFallback;
    }

    public final String component19() {
        return this.authenticationVerdict;
    }

    public final double component2() {
        return this.createdAt;
    }

    public final AHD<String> component20() {
        return this.headerCc;
    }

    public final String component3() {
        return this.rfcMessageId;
    }

    public final String component4() {
        return this.headerFrom;
    }

    public final String component5() {
        return this.headerFromName;
    }

    public final AHD<String> component6() {
        return this.headerTo;
    }

    public final String component7() {
        return this.preview;
    }

    public final String component8() {
        return this.direction;
    }

    public final String component9() {
        return this.deliveryStatus;
    }

    public final String getAttachmentStatus() {
        return this.attachmentStatus;
    }

    public final AHD<EmailAttachment> getAttachments() {
        return this.attachments;
    }

    public final String getAuthenticationVerdict() {
        return this.authenticationVerdict;
    }

    public final AHD<EmailBodyPart> getBody() {
        return this.body;
    }

    public final double getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final AHD<String> getHeaderCc() {
        return this.headerCc;
    }

    public final String getHeaderFrom() {
        return this.headerFrom;
    }

    public final String getHeaderFromName() {
        return this.headerFromName;
    }

    public final AHD<String> getHeaderTo() {
        return this.headerTo;
    }

    public final String getHtmlBody() {
        return this.htmlBody;
    }

    public final String getHtmlFallback() {
        return this.htmlFallback;
    }

    public final String getHtmlPreamble() {
        return this.htmlPreamble;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInReplyTo() {
        return this.inReplyTo;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final AHD<String> getReferences() {
        return this.references;
    }

    public final String getRfcMessageId() {
        return this.rfcMessageId;
    }

    public final String getSender() {
        String str = this.headerFromName;
        return str.length() == 0 ? this.headerFrom : str;
    }

    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.headerCc, (((((((AnonymousClass005.A0I(this.subject, (AnonymousClass005.A0F(this.attachments, AnonymousClass005.A0F(this.body, AnonymousClass005.A0F(this.references, (((AnonymousClass005.A0I(this.direction, AnonymousClass005.A0I(this.preview, AnonymousClass005.A0F(this.headerTo, AnonymousClass005.A0I(this.headerFromName, AnonymousClass005.A0I(this.headerFrom, AnonymousClass005.A0I(this.rfcMessageId, (AnonymousClass001.A0G(this.id) + HsK.A00(this.createdAt)) * 31)))))) + AnonymousClass006.A0G(this.deliveryStatus)) * 31) + AnonymousClass006.A0G(this.inReplyTo)) * 31))) + AnonymousClass006.A0G(this.attachmentStatus)) * 31) + AnonymousClass006.A0G(this.htmlBody)) * 31) + AnonymousClass006.A0G(this.htmlPreamble)) * 31) + AnonymousClass006.A0G(this.htmlFallback)) * 31) + AnonymousClass005.A0H(this.authenticationVerdict)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ EmailMessage copy$default(EmailMessage emailMessage, String str, double d, String str2, String str3, String str4, AHD ahd, String str5, String str6, String str7, String str8, AHD ahd2, AHD ahd3, AHD ahd4, String str9, String str10, String str11, String str12, String str13, String str14, AHD ahd5, int i, Object obj) {
        String str15 = str;
        double d2 = d;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        AHD ahd6 = ahd;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        AHD ahd7 = ahd2;
        AHD ahd8 = ahd3;
        AHD ahd9 = ahd4;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        AHD ahd10 = ahd5;
        if ((i & 1) != 0) {
            str15 = emailMessage.id;
        }
        if ((i & 2) != 0) {
            d2 = emailMessage.createdAt;
        }
        if ((i & 4) != 0) {
            str16 = emailMessage.rfcMessageId;
        }
        if ((i & 8) != 0) {
            str17 = emailMessage.headerFrom;
        }
        if ((i & 16) != 0) {
            str18 = emailMessage.headerFromName;
        }
        if ((i & 32) != 0) {
            ahd6 = emailMessage.headerTo;
        }
        if ((i & 64) != 0) {
            str19 = emailMessage.preview;
        }
        if ((i & 128) != 0) {
            str20 = emailMessage.direction;
        }
        if ((i & 256) != 0) {
            str21 = emailMessage.deliveryStatus;
        }
        if ((i & 512) != 0) {
            str22 = emailMessage.inReplyTo;
        }
        if ((i & 1024) != 0) {
            ahd7 = emailMessage.references;
        }
        if ((i & 2048) != 0) {
            ahd8 = emailMessage.body;
        }
        if ((i & 4096) != 0) {
            ahd9 = emailMessage.attachments;
        }
        if ((i & 8192) != 0) {
            str23 = emailMessage.attachmentStatus;
        }
        if ((i & 16384) != 0) {
            str24 = emailMessage.subject;
        }
        if ((i & 32768) != 0) {
            str25 = emailMessage.htmlBody;
        }
        if ((i & 65536) != 0) {
            str26 = emailMessage.htmlPreamble;
        }
        if ((i & 131072) != 0) {
            str27 = emailMessage.htmlFallback;
        }
        if ((i & 262144) != 0) {
            str28 = emailMessage.authenticationVerdict;
        }
        if ((i & 524288) != 0) {
            ahd10 = emailMessage.headerCc;
        }
        String str29 = str22;
        AHD ahd11 = ahd7;
        AHD ahd12 = ahd9;
        return emailMessage.copy(str15, d2, str16, str17, str18, ahd6, str19, str20, str21, str29, ahd11, ahd8, ahd12, str23, str24, str25, str26, str27, str28, ahd10);
    }

    public /* synthetic */ EmailMessage(String str, double d, String str2, String str3, String str4, AHD ahd, String str5, String str6, String str7, String str8, AHD ahd2, AHD ahd3, AHD ahd4, String str9, String str10, String str11, String str12, String str13, String str14, AHD ahd5, int i, C06H c06h) {
        this(str, d, str2, str3, str4, ahd, str5, str6, str7, str8, ahd2, ahd3, ahd4, str9, (i & 16384) != 0 ? "" : str10, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : str12, (131072 & i) != 0 ? null : str13, (262144 & i) != 0 ? null : str14, (i & 524288) != 0 ? AHI.A01 : ahd5);
    }
}
