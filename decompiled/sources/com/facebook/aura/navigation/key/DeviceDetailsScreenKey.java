package com.facebook.aura.navigation.key;

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
/* loaded from: classes3.dex */
public final class DeviceDetailsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String displayName;
    public final String nodeId;

    public final class Companion {
        public final C9hr<DeviceDetailsScreenKey> serializer() {
            return DeviceDetailsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(DeviceDetailsScreenKey deviceDetailsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deviceDetailsScreenKey.nodeId, c9iZ, 0);
        c9j5.AAV(deviceDetailsScreenKey.displayName, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceDetailsScreenKey) {
                DeviceDetailsScreenKey deviceDetailsScreenKey = (DeviceDetailsScreenKey) obj;
                if (!C7384Etj.areEqual(this.nodeId, deviceDetailsScreenKey.nodeId) || !C7384Etj.areEqual(this.displayName, deviceDetailsScreenKey.displayName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceDetailsScreenKey copy$default(DeviceDetailsScreenKey deviceDetailsScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceDetailsScreenKey.nodeId;
        }
        if ((i & 2) != 0) {
            str2 = deviceDetailsScreenKey.displayName;
        }
        AnonymousClass003.A0u(str, str2);
        return new DeviceDetailsScreenKey(str, str2);
    }

    public final String component1() {
        return this.nodeId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.displayName, AnonymousClass001.A0G(this.nodeId));
    }

    public DeviceDetailsScreenKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.nodeId = str;
        this.displayName = str2;
    }

    public final DeviceDetailsScreenKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DeviceDetailsScreenKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceDetailsScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DeviceDetailsScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.nodeId = str;
        this.displayName = str2;
    }
}
