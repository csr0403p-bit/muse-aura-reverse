package com.facebook.aura.email.keys;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailThreadKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String environmentId;
    public final String threadId;

    public final class Companion {
        public final C9hr<EmailThreadKey> serializer() {
            return EmailThreadKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_keys_keys(EmailThreadKey emailThreadKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailThreadKey.environmentId, c9iZ, 0);
        c9j5.AAV(emailThreadKey.threadId, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailThreadKey) {
                EmailThreadKey emailThreadKey = (EmailThreadKey) obj;
                if (!C7384Etj.areEqual(this.environmentId, emailThreadKey.environmentId) || !C7384Etj.areEqual(this.threadId, emailThreadKey.threadId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailThreadKey copy$default(EmailThreadKey emailThreadKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailThreadKey.environmentId;
        }
        if ((i & 2) != 0) {
            str2 = emailThreadKey.threadId;
        }
        AnonymousClass003.A0u(str, str2);
        return new EmailThreadKey(str, str2);
    }

    public final String component1() {
        return this.environmentId;
    }

    public final String component2() {
        return this.threadId;
    }

    public final String getEnvironmentId() {
        return this.environmentId;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.threadId, AnonymousClass001.A0G(this.environmentId));
    }

    public EmailThreadKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.environmentId = str;
        this.threadId = str2;
    }

    public final EmailThreadKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new EmailThreadKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailThreadKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(EmailThreadKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.environmentId = str;
        this.threadId = str2;
    }
}
