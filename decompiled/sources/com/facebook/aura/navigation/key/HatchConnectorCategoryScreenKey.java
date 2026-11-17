package com.facebook.aura.navigation.key;

import X.AnonymousClass006;
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
public final class HatchConnectorCategoryScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String categoryId;

    public final class Companion {
        public final C9hr<HatchConnectorCategoryScreenKey> serializer() {
            return HatchConnectorCategoryScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchConnectorCategoryScreenKey) && C7384Etj.areEqual(this.categoryId, ((HatchConnectorCategoryScreenKey) obj).categoryId));
    }

    public /* synthetic */ HatchConnectorCategoryScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchConnectorCategoryScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.categoryId = str;
    }

    public static /* synthetic */ HatchConnectorCategoryScreenKey copy$default(HatchConnectorCategoryScreenKey hatchConnectorCategoryScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchConnectorCategoryScreenKey.categoryId;
        }
        return new HatchConnectorCategoryScreenKey(str);
    }

    public final String component1() {
        return this.categoryId;
    }

    public final HatchConnectorCategoryScreenKey copy(String str) {
        return new HatchConnectorCategoryScreenKey(str);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.categoryId);
    }

    public String toString() {
        return super.toString();
    }

    public HatchConnectorCategoryScreenKey(String str) {
        this.categoryId = str;
    }
}
