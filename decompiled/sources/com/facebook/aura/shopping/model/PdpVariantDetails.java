package com.facebook.aura.shopping.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
/* loaded from: classes4.dex */
public final class PdpVariantDetails extends C06G {
    public static final int $stable = 8;
    public final List<PdpImage> images;
    public final String name;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, PdpVariantDetails$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PdpVariantDetails> serializer() {
            return PdpVariantDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PdpVariantDetails(String str, String str2, List<PdpImage> list) {
        C7384Etj.A0Y(list, 2);
        this.name = str;
        this.url = str2;
        this.images = list;
    }

    public final PdpVariantDetails copy(String str, String str2, List<PdpImage> list) {
        C7384Etj.A0Y(list, 2);
        return new PdpVariantDetails(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpVariantDetails) {
                PdpVariantDetails pdpVariantDetails = (PdpVariantDetails) obj;
                if (!C7384Etj.areEqual(this.name, pdpVariantDetails.name) || !C7384Etj.areEqual(this.url, pdpVariantDetails.url) || !C7384Etj.areEqual(this.images, pdpVariantDetails.images)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdpVariantDetails copy$default(PdpVariantDetails pdpVariantDetails, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpVariantDetails.name;
        }
        if ((i & 2) != 0) {
            str2 = pdpVariantDetails.url;
        }
        if ((i & 4) != 0) {
            list = pdpVariantDetails.images;
        }
        return pdpVariantDetails.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpVariantDetails pdpVariantDetails, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(pdpVariantDetails.name, c07779iq, c9iZ, 0);
        c9j5.AAP(pdpVariantDetails.url, c07779iq, c9iZ, 1);
        c9j5.AAQ(pdpVariantDetails.images, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final List<PdpImage> component3() {
        return this.images;
    }

    public final List<PdpImage> getImages() {
        return this.images;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.images, ((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.url)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpVariantDetails(int i, String str, String str2, List list, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PdpVariantDetails$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.url = str2;
        this.images = list;
    }
}
