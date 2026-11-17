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
public final class EmailIntroKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String environmentId;

    public final class Companion {
        public final C9hr<EmailIntroKey> serializer() {
            return EmailIntroKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailIntroKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new EmailIntroKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailIntroKey) && C7384Etj.areEqual(this.environmentId, ((EmailIntroKey) obj).environmentId));
    }

    public /* synthetic */ EmailIntroKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailIntroKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.environmentId = str;
    }

    public static /* synthetic */ EmailIntroKey copy$default(EmailIntroKey emailIntroKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailIntroKey.environmentId;
        }
        C7384Etj.A0Y(str, 0);
        return new EmailIntroKey(str);
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

    public EmailIntroKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.environmentId = str;
    }
}
