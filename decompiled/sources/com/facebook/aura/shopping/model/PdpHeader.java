package com.facebook.aura.shopping.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PdpHeader extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String brand;
    public final boolean isPartnerMerchant;
    public final String merchantLogoUrl;
    public final String merchantName;

    public final class Companion {
        public final C9hr<PdpHeader> serializer() {
            return PdpHeader$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpHeader) {
                PdpHeader pdpHeader = (PdpHeader) obj;
                if (!C7384Etj.areEqual(this.merchantName, pdpHeader.merchantName) || !C7384Etj.areEqual(this.merchantLogoUrl, pdpHeader.merchantLogoUrl) || !C7384Etj.areEqual(this.brand, pdpHeader.brand) || this.isPartnerMerchant != pdpHeader.isPartnerMerchant) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpHeader copy$default(PdpHeader pdpHeader, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpHeader.merchantName;
        }
        if ((i & 2) != 0) {
            str2 = pdpHeader.merchantLogoUrl;
        }
        if ((i & 4) != 0) {
            str3 = pdpHeader.brand;
        }
        if ((i & 8) != 0) {
            z = pdpHeader.isPartnerMerchant;
        }
        return new PdpHeader(str, str2, str3, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpHeader pdpHeader, C9j5 c9j5, C9iZ c9iZ) {
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(pdpHeader.merchantName, c07779iq, c9iZ, 0);
        c9j5.AAP(pdpHeader.merchantLogoUrl, c07779iq, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || pdpHeader.brand != null) {
            c9j5.AAP(pdpHeader.brand, c07779iq, c9iZ, 2);
        }
        if (zAfR || pdpHeader.isPartnerMerchant) {
            c9j5.AA7(c9iZ, 3, pdpHeader.isPartnerMerchant);
        }
    }

    public final String component1() {
        return this.merchantName;
    }

    public final String component2() {
        return this.merchantLogoUrl;
    }

    public final String component3() {
        return this.brand;
    }

    public final boolean component4() {
        return this.isPartnerMerchant;
    }

    public final PdpHeader copy(String str, String str2, String str3, boolean z) {
        return new PdpHeader(str, str2, str3, z);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public int hashCode() {
        return C0KA.A00(((((AnonymousClass006.A0G(this.merchantName) * 31) + AnonymousClass006.A0G(this.merchantLogoUrl)) * 31) + AnonymousClass005.A0H(this.brand)) * 31, this.isPartnerMerchant);
    }

    public final boolean isPartnerMerchant() {
        return this.isPartnerMerchant;
    }

    public PdpHeader(String str, String str2, String str3, boolean z) {
        this.merchantName = str;
        this.merchantLogoUrl = str2;
        this.brand = str3;
        this.isPartnerMerchant = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpHeader(int i, String str, String str2, String str3, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PdpHeader$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.merchantName = str;
        this.merchantLogoUrl = str2;
        this.brand = C3cI.A0W(i, str3);
        if ((i & 8) == 0) {
            this.isPartnerMerchant = false;
        } else {
            this.isPartnerMerchant = z;
        }
    }

    public /* synthetic */ PdpHeader(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3), AnonymousClass005.A1P(i, z));
    }
}
