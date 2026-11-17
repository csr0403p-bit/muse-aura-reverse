package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectedDevicesScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final boolean autoStartSetup;

    public final class Companion {
        public final C9hr<ConnectedDevicesScreenKey> serializer() {
            return ConnectedDevicesScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ConnectedDevicesScreenKey connectedDevicesScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || connectedDevicesScreenKey.autoStartSetup) {
            c9j5.AA7(c9iZ, 0, connectedDevicesScreenKey.autoStartSetup);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectedDevicesScreenKey) && this.autoStartSetup == ((ConnectedDevicesScreenKey) obj).autoStartSetup);
    }

    public static /* synthetic */ ConnectedDevicesScreenKey copy$default(ConnectedDevicesScreenKey connectedDevicesScreenKey, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = connectedDevicesScreenKey.autoStartSetup;
        }
        return new ConnectedDevicesScreenKey(z);
    }

    public final boolean component1() {
        return this.autoStartSetup;
    }

    public final ConnectedDevicesScreenKey copy(boolean z) {
        return new ConnectedDevicesScreenKey(z);
    }

    public final boolean getAutoStartSetup() {
        return this.autoStartSetup;
    }

    public int hashCode() {
        return this.autoStartSetup ? 1231 : 1237;
    }

    public /* synthetic */ ConnectedDevicesScreenKey(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.autoStartSetup = false;
        } else {
            this.autoStartSetup = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ConnectedDevicesScreenKey(boolean z) {
        this.autoStartSetup = z;
    }

    public /* synthetic */ ConnectedDevicesScreenKey(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public ConnectedDevicesScreenKey() {
        this(false);
    }
}
