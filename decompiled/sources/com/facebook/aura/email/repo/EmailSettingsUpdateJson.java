package com.facebook.aura.email.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailSettingsUpdateJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean include_signature;

    public final class Companion {
        public final C9hr<EmailSettingsUpdateJson> serializer() {
            return EmailSettingsUpdateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailSettingsUpdateJson) && this.include_signature == ((EmailSettingsUpdateJson) obj).include_signature);
    }

    public /* synthetic */ EmailSettingsUpdateJson(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailSettingsUpdateJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.include_signature = z;
    }

    public static /* synthetic */ EmailSettingsUpdateJson copy$default(EmailSettingsUpdateJson emailSettingsUpdateJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailSettingsUpdateJson.include_signature;
        }
        return new EmailSettingsUpdateJson(z);
    }

    public final boolean component1() {
        return this.include_signature;
    }

    public final EmailSettingsUpdateJson copy(boolean z) {
        return new EmailSettingsUpdateJson(z);
    }

    public final boolean getInclude_signature() {
        return this.include_signature;
    }

    public int hashCode() {
        return this.include_signature ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public EmailSettingsUpdateJson(boolean z) {
        this.include_signature = z;
    }
}
