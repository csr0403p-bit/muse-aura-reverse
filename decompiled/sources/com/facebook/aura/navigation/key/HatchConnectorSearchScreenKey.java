package com.facebook.aura.navigation.key;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
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
public final class HatchConnectorSearchScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String categoryId;
    public final boolean deviceOnly;

    public final class Companion {
        public final C9hr<HatchConnectorSearchScreenKey> serializer() {
            return HatchConnectorSearchScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchConnectorSearchScreenKey) {
                HatchConnectorSearchScreenKey hatchConnectorSearchScreenKey = (HatchConnectorSearchScreenKey) obj;
                if (!C7384Etj.areEqual(this.categoryId, hatchConnectorSearchScreenKey.categoryId) || this.deviceOnly != hatchConnectorSearchScreenKey.deviceOnly) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchConnectorSearchScreenKey copy$default(HatchConnectorSearchScreenKey hatchConnectorSearchScreenKey, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchConnectorSearchScreenKey.categoryId;
        }
        if ((i & 2) != 0) {
            z = hatchConnectorSearchScreenKey.deviceOnly;
        }
        return new HatchConnectorSearchScreenKey(str, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(HatchConnectorSearchScreenKey hatchConnectorSearchScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAP(hatchConnectorSearchScreenKey.categoryId, C07779iq.A01, c9iZ, 0);
        c9j5.AA7(c9iZ, 1, hatchConnectorSearchScreenKey.deviceOnly);
    }

    public final String component1() {
        return this.categoryId;
    }

    public final boolean component2() {
        return this.deviceOnly;
    }

    public final HatchConnectorSearchScreenKey copy(String str, boolean z) {
        return new HatchConnectorSearchScreenKey(str, z);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final boolean getDeviceOnly() {
        return this.deviceOnly;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A0G(this.categoryId) * 31, this.deviceOnly);
    }

    public HatchConnectorSearchScreenKey(String str, boolean z) {
        this.categoryId = str;
        this.deviceOnly = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchConnectorSearchScreenKey(int i, String str, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchConnectorSearchScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.categoryId = str;
        this.deviceOnly = z;
    }
}
