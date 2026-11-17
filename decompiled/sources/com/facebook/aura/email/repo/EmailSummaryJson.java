package com.facebook.aura.email.repo;

import X.AGI;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.email.model.EmailSummary;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailSummaryJson extends C06G {
    public final String id;
    public final EmailMessageJson last_message;
    public final int message_count;
    public final List<String> participants;
    public final String subject;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, EmailSummaryJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<EmailSummaryJson> serializer() {
            return EmailSummaryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSummaryJson) {
                EmailSummaryJson emailSummaryJson = (EmailSummaryJson) obj;
                if (!C7384Etj.areEqual(this.id, emailSummaryJson.id) || !C7384Etj.areEqual(this.subject, emailSummaryJson.subject) || this.message_count != emailSummaryJson.message_count || !C7384Etj.areEqual(this.last_message, emailSummaryJson.last_message) || !C7384Etj.areEqual(this.participants, emailSummaryJson.participants)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmailSummaryJson copy$default(EmailSummaryJson emailSummaryJson, String str, String str2, int i, EmailMessageJson emailMessageJson, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = emailSummaryJson.id;
        }
        if ((i2 & 2) != 0) {
            str2 = emailSummaryJson.subject;
        }
        if ((i2 & 4) != 0) {
            i = emailSummaryJson.message_count;
        }
        if ((i2 & 8) != 0) {
            emailMessageJson = emailSummaryJson.last_message;
        }
        if ((i2 & 16) != 0) {
            list = emailSummaryJson.participants;
        }
        return emailSummaryJson.copy(str, str2, i, emailMessageJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSummaryJson emailSummaryJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(emailSummaryJson.id, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(emailSummaryJson.subject)) {
            c9j5.AAV(emailSummaryJson.subject, c9iZ, 1);
        }
        if (zAfR || emailSummaryJson.message_count != 0) {
            c9j5.AAK(c9iZ, 2, emailSummaryJson.message_count);
        }
        c9j5.AAQ(emailSummaryJson.last_message, EmailMessageJson$$serializer.INSTANCE, c9iZ, 3);
        if (zAfR || !C7384Etj.areEqual(emailSummaryJson.participants, C0881AGi.A00)) {
            c9j5.AAQ(emailSummaryJson.participants, C06G.A0e(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.subject;
    }

    public final int component3() {
        return this.message_count;
    }

    public final EmailMessageJson component4() {
        return this.last_message;
    }

    public final List<String> component5() {
        return this.participants;
    }

    public final String getId() {
        return this.id;
    }

    public final EmailMessageJson getLast_message() {
        return this.last_message;
    }

    public final int getMessage_count() {
        return this.message_count;
    }

    public final List<String> getParticipants() {
        return this.participants;
    }

    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.participants, AnonymousClass005.A0F(this.last_message, (AnonymousClass005.A0I(this.subject, AnonymousClass001.A0G(this.id)) + this.message_count) * 31));
    }

    public final EmailSummary toDomain() {
        return new EmailSummary(this.id, this.subject, this.message_count, this.last_message.toDomain(), AGI.A07(this.participants));
    }

    public EmailSummaryJson(String str, String str2, int i, EmailMessageJson emailMessageJson, List<String> list) {
        AnonymousClass005.A0y(str, str2, emailMessageJson);
        C7384Etj.A0Y(list, 4);
        this.id = str;
        this.subject = str2;
        this.message_count = i;
        this.last_message = emailMessageJson;
        this.participants = list;
    }

    public final EmailSummaryJson copy(String str, String str2, int i, EmailMessageJson emailMessageJson, List<String> list) {
        AnonymousClass005.A0y(str, str2, emailMessageJson);
        C7384Etj.A0Y(list, 4);
        return new EmailSummaryJson(str, str2, i, emailMessageJson, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSummaryJson(String str, String str2, int i, EmailMessageJson emailMessageJson, List list, int i2, C06H c06h) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, emailMessageJson, (i2 & 16) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ EmailSummaryJson(int i, String str, String str2, int i2, EmailMessageJson emailMessageJson, List list, C2hx c2hx) {
        if (9 != (i & 9)) {
            C9iI.A00(EmailSummaryJson$$serializer.descriptor, i, 9);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.subject = (i & 2) == 0 ? "" : str2;
        if ((i & 4) == 0) {
            this.message_count = 0;
        } else {
            this.message_count = i2;
        }
        this.last_message = emailMessageJson;
        if ((i & 16) == 0) {
            this.participants = C0881AGi.A00;
        } else {
            this.participants = list;
        }
    }
}
