package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class MicroFirmwareUpdateScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final boolean autoStart;

    public final class Companion {
        public final C9hr<MicroFirmwareUpdateScreenKey> serializer() {
            return MicroFirmwareUpdateScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MicroFirmwareUpdateScreenKey) && this.autoStart == ((MicroFirmwareUpdateScreenKey) obj).autoStart);
    }

    public /* synthetic */ MicroFirmwareUpdateScreenKey(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(MicroFirmwareUpdateScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.autoStart = z;
    }

    public static /* synthetic */ MicroFirmwareUpdateScreenKey copy$default(MicroFirmwareUpdateScreenKey microFirmwareUpdateScreenKey, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = microFirmwareUpdateScreenKey.autoStart;
        }
        return new MicroFirmwareUpdateScreenKey(z);
    }

    public final boolean component1() {
        return this.autoStart;
    }

    public final MicroFirmwareUpdateScreenKey copy(boolean z) {
        return new MicroFirmwareUpdateScreenKey(z);
    }

    public final boolean getAutoStart() {
        return this.autoStart;
    }

    public int hashCode() {
        return this.autoStart ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public MicroFirmwareUpdateScreenKey(boolean z) {
        this.autoStart = z;
    }
}
