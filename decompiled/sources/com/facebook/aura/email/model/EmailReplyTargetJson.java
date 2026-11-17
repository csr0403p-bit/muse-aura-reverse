package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailReplyTargetJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String action;
    public final String from;
    public final String fromName;
    public final String from_name;
    public final String messageID;
    public final String messageId;
    public final String message_id;
    public final String sender;
    public final String senderName;
    public final String sender_name;
    public final String subject;
    public final String type;

    public final class Companion {
        public final C9hr<EmailReplyTargetJson> serializer() {
            return EmailReplyTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailReplyTargetJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.message_id = str2;
        this.messageId = str3;
        this.messageID = str4;
        this.action = str5;
        this.sender_name = str6;
        this.senderName = str7;
        this.sender = str8;
        this.from_name = str9;
        this.fromName = str10;
        this.from = str11;
        this.subject = str12;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_model_model(EmailReplyTargetJson emailReplyTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(emailReplyTargetJson.type)) {
            c9j5.AAV(emailReplyTargetJson.type, c9iZ, 0);
        }
        if (zAfR || emailReplyTargetJson.message_id != null) {
            c9j5.AAP(emailReplyTargetJson.message_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || emailReplyTargetJson.messageId != null) {
            c9j5.AAP(emailReplyTargetJson.messageId, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || emailReplyTargetJson.messageID != null) {
            c9j5.AAP(emailReplyTargetJson.messageID, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || emailReplyTargetJson.action != null) {
            c9j5.AAP(emailReplyTargetJson.action, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || emailReplyTargetJson.sender_name != null) {
            c9j5.AAP(emailReplyTargetJson.sender_name, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || emailReplyTargetJson.senderName != null) {
            c9j5.AAP(emailReplyTargetJson.senderName, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || emailReplyTargetJson.sender != null) {
            c9j5.AAP(emailReplyTargetJson.sender, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || emailReplyTargetJson.from_name != null) {
            c9j5.AAP(emailReplyTargetJson.from_name, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || emailReplyTargetJson.fromName != null) {
            c9j5.AAP(emailReplyTargetJson.fromName, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || emailReplyTargetJson.from != null) {
            c9j5.AAP(emailReplyTargetJson.from, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || emailReplyTargetJson.subject != null) {
            c9j5.AAP(emailReplyTargetJson.subject, C07779iq.A01, c9iZ, 11);
        }
    }

    public final EmailReplyTargetJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        C7384Etj.A0Y(str, 0);
        return new EmailReplyTargetJson(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailReplyTargetJson) {
                EmailReplyTargetJson emailReplyTargetJson = (EmailReplyTargetJson) obj;
                if (!C7384Etj.areEqual(this.type, emailReplyTargetJson.type) || !C7384Etj.areEqual(this.message_id, emailReplyTargetJson.message_id) || !C7384Etj.areEqual(this.messageId, emailReplyTargetJson.messageId) || !C7384Etj.areEqual(this.messageID, emailReplyTargetJson.messageID) || !C7384Etj.areEqual(this.action, emailReplyTargetJson.action) || !C7384Etj.areEqual(this.sender_name, emailReplyTargetJson.sender_name) || !C7384Etj.areEqual(this.senderName, emailReplyTargetJson.senderName) || !C7384Etj.areEqual(this.sender, emailReplyTargetJson.sender) || !C7384Etj.areEqual(this.from_name, emailReplyTargetJson.from_name) || !C7384Etj.areEqual(this.fromName, emailReplyTargetJson.fromName) || !C7384Etj.areEqual(this.from, emailReplyTargetJson.from) || !C7384Etj.areEqual(this.subject, emailReplyTargetJson.subject)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailReplyTargetJson copy$default(EmailReplyTargetJson emailReplyTargetJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailReplyTargetJson.type;
        }
        if ((i & 2) != 0) {
            str2 = emailReplyTargetJson.message_id;
        }
        if ((i & 4) != 0) {
            str3 = emailReplyTargetJson.messageId;
        }
        if ((i & 8) != 0) {
            str4 = emailReplyTargetJson.messageID;
        }
        if ((i & 16) != 0) {
            str5 = emailReplyTargetJson.action;
        }
        if ((i & 32) != 0) {
            str6 = emailReplyTargetJson.sender_name;
        }
        if ((i & 64) != 0) {
            str7 = emailReplyTargetJson.senderName;
        }
        if ((i & 128) != 0) {
            str8 = emailReplyTargetJson.sender;
        }
        if ((i & 256) != 0) {
            str9 = emailReplyTargetJson.from_name;
        }
        if ((i & 512) != 0) {
            str10 = emailReplyTargetJson.fromName;
        }
        if ((i & 1024) != 0) {
            str11 = emailReplyTargetJson.from;
        }
        if ((i & 2048) != 0) {
            str12 = emailReplyTargetJson.subject;
        }
        return emailReplyTargetJson.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.fromName;
    }

    public final String component11() {
        return this.from;
    }

    public final String component12() {
        return this.subject;
    }

    public final String component2() {
        return this.message_id;
    }

    public final String component3() {
        return this.messageId;
    }

    public final String component4() {
        return this.messageID;
    }

    public final String component5() {
        return this.action;
    }

    public final String component6() {
        return this.sender_name;
    }

    public final String component7() {
        return this.senderName;
    }

    public final String component8() {
        return this.sender;
    }

    public final String component9() {
        return this.from_name;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getFromName() {
        return this.fromName;
    }

    public final String getFrom_name() {
        return this.from_name;
    }

    public final String getMessageID() {
        return this.messageID;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final String getSender_name() {
        return this.sender_name;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((((((((((((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.message_id)) * 31) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass006.A0G(this.messageID)) * 31) + AnonymousClass006.A0G(this.action)) * 31) + AnonymousClass006.A0G(this.sender_name)) * 31) + AnonymousClass006.A0G(this.senderName)) * 31) + AnonymousClass006.A0G(this.sender)) * 31) + AnonymousClass006.A0G(this.from_name)) * 31) + AnonymousClass006.A0G(this.fromName)) * 31) + AnonymousClass006.A0G(this.from)) * 31) + AnonymousClass005.A0H(this.subject);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailReplyTargetJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str2;
        }
        if ((i & 4) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str3;
        }
        if ((i & 8) == 0) {
            this.messageID = null;
        } else {
            this.messageID = str4;
        }
        if ((i & 16) == 0) {
            this.action = null;
        } else {
            this.action = str5;
        }
        if ((i & 32) == 0) {
            this.sender_name = null;
        } else {
            this.sender_name = str6;
        }
        if ((i & 64) == 0) {
            this.senderName = null;
        } else {
            this.senderName = str7;
        }
        if ((i & 128) == 0) {
            this.sender = null;
        } else {
            this.sender = str8;
        }
        if ((i & 256) == 0) {
            this.from_name = null;
        } else {
            this.from_name = str9;
        }
        if ((i & 512) == 0) {
            this.fromName = null;
        } else {
            this.fromName = str10;
        }
        if ((i & 1024) == 0) {
            this.from = null;
        } else {
            this.from = str11;
        }
        if ((i & 2048) == 0) {
            this.subject = null;
        } else {
            this.subject = str12;
        }
    }

    public /* synthetic */ EmailReplyTargetJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12);
    }

    public EmailReplyTargetJson() {
        this("", null, null, null, null, null, null, null, null, null, null, null);
    }
}
