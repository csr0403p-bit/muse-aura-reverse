package com.facebook.aura.email.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailPagingJson extends C06G {
    public static final Companion Companion = new Companion();
    public final EmailCursorsJson cursors;

    public final class Companion {
        public final C9hr<EmailPagingJson> serializer() {
            return EmailPagingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailPagingJson emailPagingJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || emailPagingJson.cursors != null) {
            c9j5.AAP(emailPagingJson.cursors, EmailCursorsJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailPagingJson) && C7384Etj.areEqual(this.cursors, ((EmailPagingJson) obj).cursors));
    }

    public static /* synthetic */ EmailPagingJson copy$default(EmailPagingJson emailPagingJson, EmailCursorsJson emailCursorsJson, int i, Object obj) {
        if ((i & 1) != 0) {
            emailCursorsJson = emailPagingJson.cursors;
        }
        return new EmailPagingJson(emailCursorsJson);
    }

    public final EmailCursorsJson component1() {
        return this.cursors;
    }

    public final EmailPagingJson copy(EmailCursorsJson emailCursorsJson) {
        return new EmailPagingJson(emailCursorsJson);
    }

    public final EmailCursorsJson getCursors() {
        return this.cursors;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.cursors);
    }

    public /* synthetic */ EmailPagingJson(int i, EmailCursorsJson emailCursorsJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.cursors = null;
        } else {
            this.cursors = emailCursorsJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public EmailPagingJson(EmailCursorsJson emailCursorsJson) {
        this.cursors = emailCursorsJson;
    }

    public /* synthetic */ EmailPagingJson(EmailCursorsJson emailCursorsJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : emailCursorsJson);
    }

    public EmailPagingJson() {
        this(null);
    }
}
