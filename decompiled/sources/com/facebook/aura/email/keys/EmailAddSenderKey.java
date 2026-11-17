package com.facebook.aura.email.keys;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailAddSenderKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String environmentId;

    public final class Companion {
        public final C9hr<EmailAddSenderKey> serializer() {
            return EmailAddSenderKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailAddSenderKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new EmailAddSenderKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailAddSenderKey) && C7384Etj.areEqual(this.environmentId, ((EmailAddSenderKey) obj).environmentId));
    }

    public /* synthetic */ EmailAddSenderKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailAddSenderKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.environmentId = str;
    }

    public static /* synthetic */ EmailAddSenderKey copy$default(EmailAddSenderKey emailAddSenderKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailAddSenderKey.environmentId;
        }
        C7384Etj.A0Y(str, 0);
        return new EmailAddSenderKey(str);
    }

    public final String component1() {
        return this.environmentId;
    }

    public final String getEnvironmentId() {
        return this.environmentId;
    }

    public int hashCode() {
        return this.environmentId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EmailAddSenderKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.environmentId = str;
    }
}
