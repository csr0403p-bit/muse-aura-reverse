package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PdpVariantOption extends C06G {
    public static final int $stable = 8;
    public final String id;
    public final boolean isAvailable;
    public final String label;
    public final List<String> productIds;
    public final Integer swatchRgb;
    public final String value;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, PdpVariantOption$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<PdpVariantOption> serializer() {
            return PdpVariantOption$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpVariantOption) {
                PdpVariantOption pdpVariantOption = (PdpVariantOption) obj;
                if (!C7384Etj.areEqual(this.label, pdpVariantOption.label) || !C7384Etj.areEqual(this.value, pdpVariantOption.value) || this.isAvailable != pdpVariantOption.isAvailable || !C7384Etj.areEqual(this.productIds, pdpVariantOption.productIds) || !C7384Etj.areEqual(this.id, pdpVariantOption.id) || !C7384Etj.areEqual(this.swatchRgb, pdpVariantOption.swatchRgb)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdpVariantOption copy$default(PdpVariantOption pdpVariantOption, String str, String str2, boolean z, List list, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpVariantOption.label;
        }
        if ((i & 2) != 0) {
            str2 = pdpVariantOption.value;
        }
        if ((i & 4) != 0) {
            z = pdpVariantOption.isAvailable;
        }
        if ((i & 8) != 0) {
            list = pdpVariantOption.productIds;
        }
        if ((i & 16) != 0) {
            str3 = pdpVariantOption.id;
        }
        if ((i & 32) != 0) {
            num = pdpVariantOption.swatchRgb;
        }
        return pdpVariantOption.copy(str, str2, z, list, str3, num);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpVariantOption pdpVariantOption, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(pdpVariantOption.label, c9iZ, 0);
        c9j5.AAV(pdpVariantOption.value, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, pdpVariantOption.isAvailable);
        c9j5.AAQ(pdpVariantOption.productIds, C3cH.A15(f0cArr, 3), c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(pdpVariantOption.id, pdpVariantOption.value)) {
            c9j5.AAV(pdpVariantOption.id, c9iZ, 4);
        }
        if (zAfR || pdpVariantOption.swatchRgb != null) {
            c9j5.AAP(pdpVariantOption.swatchRgb, C07729ii.A00, c9iZ, 5);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.isAvailable;
    }

    public final List<String> component4() {
        return this.productIds;
    }

    public final String component5() {
        return this.id;
    }

    public final Integer component6() {
        return this.swatchRgb;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final Integer getSwatchRgb() {
        return this.swatchRgb;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.id, AnonymousClass005.A0F(this.productIds, C0KA.A01(AnonymousClass005.A0I(this.value, AnonymousClass001.A0G(this.label)), this.isAvailable))) + AnonymousClass006.A0D(this.swatchRgb);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public PdpVariantOption(String str, String str2, boolean z, List<String> list, String str3, Integer num) {
        AnonymousClass005.A0y(str, str2, list);
        C7384Etj.A0Y(str3, 4);
        this.label = str;
        this.value = str2;
        this.isAvailable = z;
        this.productIds = list;
        this.id = str3;
        this.swatchRgb = num;
    }

    public final PdpVariantOption copy(String str, String str2, boolean z, List<String> list, String str3, Integer num) {
        AnonymousClass005.A0y(str, str2, list);
        C7384Etj.A0Y(str3, 4);
        return new PdpVariantOption(str, str2, z, list, str3, num);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpVariantOption(String str, String str2, boolean z, List list, String str3, Integer num, int i, C06H c06h) {
        this(str, str2, z, list, (i & 16) != 0 ? str2 : str3, (i & 32) != 0 ? null : num);
    }

    public /* synthetic */ PdpVariantOption(int i, String str, String str2, boolean z, List list, String str3, Integer num, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(PdpVariantOption$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.label = str;
        this.value = str2;
        this.isAvailable = z;
        this.productIds = list;
        if ((i & 16) == 0) {
            this.id = str2;
        } else {
            this.id = str3;
        }
        if ((i & 32) == 0) {
            this.swatchRgb = null;
        } else {
            this.swatchRgb = num;
        }
    }
}
