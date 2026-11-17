package com.facebook.aura.email.repo;

import X.AGI;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
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
import com.facebook.aura.email.model.EmailThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailThreadJson extends C06G {
    public final List<EmailMessageJson> messages;
    public final EmailSummaryJson summary;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, EmailThreadJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<EmailThreadJson> serializer() {
            return EmailThreadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailThreadJson) {
                EmailThreadJson emailThreadJson = (EmailThreadJson) obj;
                if (!C7384Etj.areEqual(this.summary, emailThreadJson.summary) || !C7384Etj.areEqual(this.messages, emailThreadJson.messages)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailThreadJson copy$default(EmailThreadJson emailThreadJson, EmailSummaryJson emailSummaryJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            emailSummaryJson = emailThreadJson.summary;
        }
        if ((i & 2) != 0) {
            list = emailThreadJson.messages;
        }
        AnonymousClass003.A0u(emailSummaryJson, list);
        return new EmailThreadJson(emailSummaryJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailThreadJson emailThreadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(emailThreadJson.summary, EmailSummaryJson$$serializer.INSTANCE, c9iZ, 0);
        if (c9j5.AfR() || !C7384Etj.areEqual(emailThreadJson.messages, C0881AGi.A00)) {
            c9j5.AAQ(emailThreadJson.messages, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
    }

    public final EmailSummaryJson component1() {
        return this.summary;
    }

    public final List<EmailMessageJson> component2() {
        return this.messages;
    }

    public final List<EmailMessageJson> getMessages() {
        return this.messages;
    }

    public final EmailSummaryJson getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.messages, AnonymousClass005.A0E(this.summary));
    }

    public final EmailThread toDomain() {
        EmailSummary domain = this.summary.toDomain();
        List<EmailMessageJson> list = this.messages;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<EmailMessageJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new EmailThread(domain, AGI.A07(arrayListA0i));
    }

    public EmailThreadJson(EmailSummaryJson emailSummaryJson, List<EmailMessageJson> list) {
        AnonymousClass003.A0u(emailSummaryJson, list);
        this.summary = emailSummaryJson;
        this.messages = list;
    }

    public final EmailThreadJson copy(EmailSummaryJson emailSummaryJson, List<EmailMessageJson> list) {
        AnonymousClass003.A0u(emailSummaryJson, list);
        return new EmailThreadJson(emailSummaryJson, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailThreadJson(EmailSummaryJson emailSummaryJson, List list, int i, C06H c06h) {
        this(emailSummaryJson, (i & 2) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ EmailThreadJson(int i, EmailSummaryJson emailSummaryJson, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailThreadJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.summary = emailSummaryJson;
        if ((i & 2) == 0) {
            this.messages = C0881AGi.A00;
        } else {
            this.messages = list;
        }
    }
}
