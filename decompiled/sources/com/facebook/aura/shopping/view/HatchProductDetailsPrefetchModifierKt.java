package com.facebook.aura.shopping.view;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AKO;
import X.AbstractC1798ArH;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BBI;
import X.BFM;
import X.BPc;
import X.BRg;
import X.C31u;
import X.C3cH;
import X.C7384Etj;
import X.C7462Ewq;
import X.C78N;
import X.EnumC10573Huf;
import X.G0U;
import X.InterfaceC7359EnW;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import com.facebook.aura.shopping.view.MC;

/* loaded from: classes4.dex */
public abstract class HatchProductDetailsPrefetchModifierKt {
    public static final long PrefetchDwellMs = 500;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchProductDetailsPrefetchModifierKt.class, "shoppingResultPdpEnabled", "getShoppingResultPdpEnabled()Z", 1), new C7462Ewq(HatchProductDetailsPrefetchModifierKt.class, "productDetailsPrefetchEnabled", "getProductDetailsPrefetchEnabled()Z", 1)};
    public static final C31u shoppingResultPdpEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp);
    public static final C31u productDetailsPrefetchEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_product_details_prefetch);

    public static final BRg prefetchProductDetailsOnImpression(BRg bRg, AHD<ProductDetailsHydrationTarget> ahd, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(bRg, ahd);
        bfm.AgE(526368560);
        BBI bbi = (BBI) bfm;
        AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
        boolean zA65 = bfm.A65(abstractC3358CGzA06);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchProductDetailsRepository.Companion.getInstance(abstractC3358CGzA06);
            bfm.Ai0(objAaT);
        }
        HatchProductDetailsRepository hatchProductDetailsRepository = (HatchProductDetailsRepository) objAaT;
        boolean zA652 = bfm.A65(ahd);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            objAaT2 = AbstractC1798ArH.A05(bbi, zA1b);
        }
        MutableState mutableState = (MutableState) objAaT2;
        if (MutableState.A0A(mutableState) || ahd.isEmpty()) {
            BBI.A0R(bbi, zA1b);
            return bRg;
        }
        boolean zA1O = C3cH.A1O(bfm, mutableState, ahd, hatchProductDetailsRepository);
        Object objAaT3 = bfm.AaT();
        if (zA1O || objAaT3 == C78N.A00) {
            objAaT3 = new HatchProductDetailsPrefetchModifierKt$prefetchProductDetailsOnImpression$2$1(ahd, mutableState, hatchProductDetailsRepository);
            BBI.A0O(bbi, objAaT3);
        }
        BRg bRgA00 = BPc.A00(bRg, EnumC10573Huf.A06, (G0U) objAaT3, 0.0f, 500L);
        BBI.A0R(bbi, zA1b);
        return bRgA00;
    }

    public static final boolean getProductDetailsPrefetchEnabled() {
        return AnonymousClass001.A1X(productDetailsPrefetchEnabled$delegate.getValue(null, $$delegatedProperties[1]));
    }

    public static final boolean getShoppingResultPdpEnabled() {
        return AnonymousClass001.A1X(C31u.A00(shoppingResultPdpEnabled$delegate, $$delegatedProperties));
    }

    public static final BRg prefetchProductDetailsOnImpression(BRg bRg, ProductDetailsHydrationTarget productDetailsHydrationTarget, BFM bfm, int i) {
        AHD ahdA0E;
        C7384Etj.A0Y(bRg, 0);
        if (productDetailsHydrationTarget == null || (ahdA0E = AGI.A0E(productDetailsHydrationTarget)) == null) {
            ahdA0E = AHI.A01;
        }
        return prefetchProductDetailsOnImpression(bRg, (AHD<ProductDetailsHydrationTarget>) ahdA0E, bfm, i & 14);
    }
}
