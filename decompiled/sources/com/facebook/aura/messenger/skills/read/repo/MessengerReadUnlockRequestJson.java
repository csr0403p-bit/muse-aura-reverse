package com.facebook.aura.messenger.skills.read.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class MessengerReadUnlockRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String pin;

    public final class Companion {
        public final C9hr<MessengerReadUnlockRequestJson> serializer() {
            return MessengerReadUnlockRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final MessengerReadUnlockRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new MessengerReadUnlockRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MessengerReadUnlockRequestJson) && C7384Etj.areEqual(this.pin, ((MessengerReadUnlockRequestJson) obj).pin));
    }

    public /* synthetic */ MessengerReadUnlockRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(MessengerReadUnlockRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.pin = str;
    }

    public static /* synthetic */ MessengerReadUnlockRequestJson copy$default(MessengerReadUnlockRequestJson messengerReadUnlockRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messengerReadUnlockRequestJson.pin;
        }
        C7384Etj.A0Y(str, 0);
        return new MessengerReadUnlockRequestJson(str);
    }

    public final String component1() {
        return this.pin;
    }

    public final String getPin() {
        return this.pin;
    }

    public int hashCode() {
        return this.pin.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public MessengerReadUnlockRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.pin = str;
    }
}
