package com.facebook.aura.productactions.impl;

import X.AFz;
import X.AHD;
import X.AKO;
import X.AKQ;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.LocalResultEventBus;
import com.facebook.aura.navigation.ResultEventBus;
import com.facebook.aura.navigation.ResultEventBusKt;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import com.facebook.aura.productactions.api.ProductMediaAction;
import com.facebook.aura.productactions.api.ProductMediaActionContext;
import com.facebook.aura.productactions.api.ProductMediaActionSize;
import com.facebook.aura.productactions.api.ProductMediaActions;
import com.facebook.aura.productactions.api.ProductMediaActionsKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductMediaActions {
    public static final int $stable = 0;
    public static final ShoppingProductMediaActions INSTANCE = new ShoppingProductMediaActions();

    public static final Unit Content$lambda$3$0(ProductDetailsActionsViewModel productDetailsActionsViewModel, AuraNavigator auraNavigator, ResultEventBus resultEventBus, String str) {
        C7384Etj.A0Y(str, 3);
        productDetailsActionsViewModel.sendReply(auraNavigator, resultEventBus, str);
        return Unit.INSTANCE;
    }

    public final ContentViewerBottomActions rememberLightboxActions(ProductDetailsActions productDetailsActions, BFM bfm, int i) {
        C7384Etj.A0Y(productDetailsActions, 0);
        ProductDetailsActionsViewModel productDetailsActionsViewModel = productDetailsActions.viewModel;
        C1BO c1boA02 = C2CK.A02(bfm, productDetailsActionsViewModel.uiState);
        Object[] objArr = new Object[0];
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new Function0() { // from class: com.facebook.aura.productactions.impl.ShoppingProductMediaActions$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShoppingProductMediaActions.rememberLightboxActions$lambda$1$0();
                }
            };
            BBI.A0T(bfm, objAaT);
        }
        String str = (String) AFz.A03(bfm, (Function0) objAaT, objArr);
        BBI bbi = (BBI) bfm;
        AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
        ResultEventBus current = LocalResultEventBus.INSTANCE.getCurrent(bfm, 6);
        String strProductMediaLightboxReplyKey = ProductMediaActionsKt.productMediaLightboxReplyKey(str);
        boolean zA1S = AnonymousClass005.A1S(bfm, productDetailsActionsViewModel, auraNavigatorA05, current);
        Object objAaT2 = bfm.AaT();
        if (zA1S || objAaT2 == obj) {
            objAaT2 = new ShoppingProductMediaActions$rememberLightboxActions$1$1(productDetailsActionsViewModel, auraNavigatorA05, current, null);
            BBI.A0O(bbi, objAaT2);
        }
        ResultEventBusKt.ResultEffect(strProductMediaLightboxReplyKey, null, (G0V) objAaT2, bfm, 0, 2);
        AHD<String> ahd = ((ProductDetailsActionsUiState) c1boA02.getValue()).mediaActionIds;
        String str2 = ((ProductDetailsActionsUiState) c1boA02.getValue()).productId;
        Map<String, String> map = ((ProductDetailsActionsUiState) c1boA02.getValue()).mediaAnalyticsMetadata;
        boolean zA1T = AnonymousClass005.A1T(bfm, str, str2, map, bfm.A65(ahd));
        Object objAaT3 = bfm.AaT();
        if (zA1T || objAaT3 == obj) {
            Object contentViewerBottomActions = ahd.isEmpty() ? null : new ContentViewerBottomActions(str, ahd, str2, map);
            bfm.Ai0(contentViewerBottomActions);
            objAaT3 = contentViewerBottomActions;
        }
        return (ContentViewerBottomActions) objAaT3;
    }

    public final void Content(final ProductDetailsActions productDetailsActions, BRg bRg, BFM bfm, final int i, final int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        final BRg bRg2 = bRg;
        C7384Etj.A0Y(productDetailsActions, 0);
        bfm.AgG(433760012);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, productDetailsActions) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final ProductDetailsActionsViewModel productDetailsActionsViewModel = productDetailsActions.viewModel;
            C1BO c1boA02 = C2CK.A02(bfm, productDetailsActionsViewModel.uiState);
            AHD<String> ahd = ((ProductDetailsActionsUiState) c1boA02.getValue()).mediaActionIds;
            boolean zA65 = bfm.A65(ahd);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = ProductMediaActions.INSTANCE.withIds(ahd);
                bfm.Ai0(objAaT);
            }
            List list = (List) objAaT;
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    g0v = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingProductMediaActions$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            ShoppingProductMediaActions shoppingProductMediaActions = this.f$0;
                            ProductDetailsActions productDetailsActions2 = productDetailsActions;
                            BRg bRg3 = bRg2;
                            int i4 = i;
                            shoppingProductMediaActions.Content(productDetailsActions2, bRg3, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            BBI bbi = (BBI) bfm;
            final AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            final ResultEventBus current = LocalResultEventBus.INSTANCE.getCurrent(bfm, 6);
            String str = ((ProductDetailsActionsUiState) c1boA02.getValue()).productId;
            Map<String, String> map = ((ProductDetailsActionsUiState) c1boA02.getValue()).mediaAnalyticsMetadata;
            boolean zA1R = AnonymousClass001.A1R(bfm, current, AnonymousClass005.A1T(bfm, str, map, auraNavigatorA05, bfm.A65(productDetailsActionsViewModel)));
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new ProductMediaActionContext(str, ProductMediaActionSize.Compact, HatchScreen.PRODUCT_DETAIL, map, new G0U() { // from class: com.facebook.aura.productactions.impl.ShoppingProductMediaActions$$ExternalSyntheticLambda1
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return ShoppingProductMediaActions.Content$lambda$3$0(productDetailsActionsViewModel, auraNavigatorA05, current, (String) obj);
                    }
                });
                BBI.A0O(bbi, objAaT2);
            }
            ProductMediaActionContext productMediaActionContext = (ProductMediaActionContext) objAaT2;
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingXsmall, 0);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, -486188231);
            while (itA0w.hasNext()) {
                ((ProductMediaAction) itA0w.next()).Content(productMediaActionContext, BRg.A00, bfm, 48);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingProductMediaActions$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    ShoppingProductMediaActions shoppingProductMediaActions = this.f$0;
                    ProductDetailsActions productDetailsActions2 = productDetailsActions;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    shoppingProductMediaActions.Content(productDetailsActions2, bRg3, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final Unit Content$lambda$2(ShoppingProductMediaActions shoppingProductMediaActions, ProductDetailsActions productDetailsActions, BRg bRg, int i, int i2, BFM bfm, int i3) {
        shoppingProductMediaActions.Content(productDetailsActions, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$5(ShoppingProductMediaActions shoppingProductMediaActions, ProductDetailsActions productDetailsActions, BRg bRg, int i, int i2, BFM bfm, int i3) {
        shoppingProductMediaActions.Content(productDetailsActions, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final String rememberLightboxActions$lambda$1$0() {
        return AnonymousClass007.A0a(ProductMediaActionsKt.ProductMediaLightboxOwnerPrefix, UUID.randomUUID());
    }
}
