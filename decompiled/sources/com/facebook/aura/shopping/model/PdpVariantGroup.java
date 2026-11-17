package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PdpVariantGroup extends C06G {
    public static final int $stable = 8;
    public final String dimension;
    public final String displayName;
    public final List<PdpVariantOption> options;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, PdpVariantGroup$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PdpVariantGroup> serializer() {
            return PdpVariantGroup$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpVariantGroup) {
                PdpVariantGroup pdpVariantGroup = (PdpVariantGroup) obj;
                if (!C7384Etj.areEqual(this.dimension, pdpVariantGroup.dimension) || !C7384Etj.areEqual(this.displayName, pdpVariantGroup.displayName) || !C7384Etj.areEqual(this.options, pdpVariantGroup.options)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isReportedUnavailable(PdpVariantOption pdpVariantOption) {
        C7384Etj.A0Y(pdpVariantOption, 0);
        return getReportsAvailability() && !pdpVariantOption.isAvailable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdpVariantGroup copy$default(PdpVariantGroup pdpVariantGroup, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpVariantGroup.dimension;
        }
        if ((i & 2) != 0) {
            str2 = pdpVariantGroup.displayName;
        }
        if ((i & 4) != 0) {
            list = pdpVariantGroup.options;
        }
        return pdpVariantGroup.copy(str, str2, list);
    }

    private final boolean getReportsAvailability() {
        List<PdpVariantOption> list = this.options;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<PdpVariantOption> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().isAvailable) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpVariantGroup pdpVariantGroup, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(pdpVariantGroup.dimension, c9iZ, 0);
        c9j5.AAV(pdpVariantGroup.displayName, c9iZ, 1);
        c9j5.AAQ(pdpVariantGroup.options, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final String component1() {
        return this.dimension;
    }

    public final String component2() {
        return this.displayName;
    }

    public final List<PdpVariantOption> component3() {
        return this.options;
    }

    public final String getDimension() {
        return this.dimension;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final PdpVariantDimensionKind getKind() {
        String strA0J = C3cJ.A0J(this.dimension);
        if (strA0J.equals("color")) {
            return PdpVariantDimensionKind.COLOR;
        }
        if (strA0J.equals("size")) {
            return PdpVariantDimensionKind.SIZE;
        }
        return null;
    }

    public final List<PdpVariantOption> getOptions() {
        return this.options;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.options, AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.dimension)));
    }

    public PdpVariantGroup(String str, String str2, List<PdpVariantOption> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.dimension = str;
        this.displayName = str2;
        this.options = list;
    }

    public final PdpVariantGroup copy(String str, String str2, List<PdpVariantOption> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new PdpVariantGroup(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpVariantGroup(int i, String str, String str2, List list, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PdpVariantGroup$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.dimension = str;
        this.displayName = str2;
        this.options = list;
    }
}
