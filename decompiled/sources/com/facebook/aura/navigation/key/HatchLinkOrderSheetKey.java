package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchLinkOrderSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final HatchLinkOrderEntryPoint entryPoint;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, HatchLinkOrderSheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchLinkOrderSheetKey> serializer() {
            return HatchLinkOrderSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchLinkOrderSheetKey copy(HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint) {
        C7384Etj.A0Y(hatchLinkOrderEntryPoint, 0);
        return new HatchLinkOrderSheetKey(hatchLinkOrderEntryPoint);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchLinkOrderSheetKey) && this.entryPoint == ((HatchLinkOrderSheetKey) obj).entryPoint);
    }

    public /* synthetic */ HatchLinkOrderSheetKey(int i, HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchLinkOrderSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.entryPoint = hatchLinkOrderEntryPoint;
    }

    public static /* synthetic */ HatchLinkOrderSheetKey copy$default(HatchLinkOrderSheetKey hatchLinkOrderSheetKey, HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchLinkOrderEntryPoint = hatchLinkOrderSheetKey.entryPoint;
        }
        C7384Etj.A0Y(hatchLinkOrderEntryPoint, 0);
        return new HatchLinkOrderSheetKey(hatchLinkOrderEntryPoint);
    }

    public final HatchLinkOrderEntryPoint component1() {
        return this.entryPoint;
    }

    public final HatchLinkOrderEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public int hashCode() {
        return this.entryPoint.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public HatchLinkOrderSheetKey(HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint) {
        C7384Etj.A0Y(hatchLinkOrderEntryPoint, 0);
        this.entryPoint = hatchLinkOrderEntryPoint;
    }
}
