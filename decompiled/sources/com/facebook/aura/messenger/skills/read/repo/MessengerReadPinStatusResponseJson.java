package com.facebook.aura.messenger.skills.read.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class MessengerReadPinStatusResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean has_pin;

    public final class Companion {
        public final C9hr<MessengerReadPinStatusResponseJson> serializer() {
            return MessengerReadPinStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MessengerReadPinStatusResponseJson) && this.has_pin == ((MessengerReadPinStatusResponseJson) obj).has_pin);
    }

    public /* synthetic */ MessengerReadPinStatusResponseJson(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(MessengerReadPinStatusResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.has_pin = z;
    }

    public static /* synthetic */ MessengerReadPinStatusResponseJson copy$default(MessengerReadPinStatusResponseJson messengerReadPinStatusResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = messengerReadPinStatusResponseJson.has_pin;
        }
        return new MessengerReadPinStatusResponseJson(z);
    }

    public final boolean component1() {
        return this.has_pin;
    }

    public final MessengerReadPinStatusResponseJson copy(boolean z) {
        return new MessengerReadPinStatusResponseJson(z);
    }

    public final boolean getHas_pin() {
        return this.has_pin;
    }

    public int hashCode() {
        return this.has_pin ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public MessengerReadPinStatusResponseJson(boolean z) {
        this.has_pin = z;
    }
}
