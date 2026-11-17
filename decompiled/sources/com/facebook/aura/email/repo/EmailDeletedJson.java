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
public final class EmailDeletedJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean deleted;

    public final class Companion {
        public final C9hr<EmailDeletedJson> serializer() {
            return EmailDeletedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailDeletedJson) && this.deleted == ((EmailDeletedJson) obj).deleted);
    }

    public /* synthetic */ EmailDeletedJson(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailDeletedJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.deleted = z;
    }

    public static /* synthetic */ EmailDeletedJson copy$default(EmailDeletedJson emailDeletedJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailDeletedJson.deleted;
        }
        return new EmailDeletedJson(z);
    }

    public final boolean component1() {
        return this.deleted;
    }

    public final EmailDeletedJson copy(boolean z) {
        return new EmailDeletedJson(z);
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public int hashCode() {
        return this.deleted ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public EmailDeletedJson(boolean z) {
        this.deleted = z;
    }
}
