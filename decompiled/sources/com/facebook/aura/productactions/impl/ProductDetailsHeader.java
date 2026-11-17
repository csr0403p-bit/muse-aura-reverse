package com.facebook.aura.productactions.impl;

import X.AKO;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.LocalResultEventBus;
import com.facebook.aura.navigation.ResultEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductDetailsHeader {
    public static final int $stable = 0;
    public static final ProductDetailsHeader INSTANCE = new ProductDetailsHeader();

    public final void Content(final ProductDetailsActions productDetailsActions, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(productDetailsActions, 0);
        bfm.AgG(585014408);
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
            bfm.Ag8(-441865217, productDetailsActionsViewModel);
            Function0 function0 = null;
            C1BO c1boA02 = C2CK.A02(bfm, productDetailsActionsViewModel.uiState);
            BBI bbi = (BBI) bfm;
            final AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            final ResultEventBus current = LocalResultEventBus.INSTANCE.getCurrent(bfm, 6);
            final Context contextA01 = AKO.A01(bbi);
            final G0U<Boolean, Unit> g0uProductSaveToast = ProductActionToastKt.productSaveToast(bfm, 0);
            Function0 function02 = null;
            if (((ProductDetailsActionsUiState) c1boA02.getValue()).replyContext == null) {
                bfm.AgE(-812597624);
            } else {
                bfm.AgE(-812597623);
                boolean zA1S = AnonymousClass005.A1S(bfm, productDetailsActionsViewModel, auraNavigatorA05, current);
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new Function0() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeader$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            productDetailsActionsViewModel.reply(auraNavigatorA05, current);
                            return Unit.INSTANCE;
                        }
                    };
                    BBI.A0O(bbi, objAaT);
                }
                function0 = (Function0) objAaT;
            }
            BBI.A0R(bbi, false);
            Boolean bool = ((ProductDetailsActionsUiState) c1boA02.getValue()).isSaved;
            if (((ProductDetailsActionsUiState) c1boA02.getValue()).shareUrl == null) {
                bfm.AgE(-812413298);
            } else {
                bfm.AgE(-812413297);
                boolean zA1M = AnonymousClass003.A1M(bfm, productDetailsActionsViewModel, contextA01);
                Object objAaT2 = bfm.AaT();
                if (zA1M || objAaT2 == C78N.A00) {
                    objAaT2 = new Function0() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeader$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            productDetailsActionsViewModel.share(contextA01);
                            return Unit.INSTANCE;
                        }
                    };
                    BBI.A0O(bbi, objAaT2);
                }
                function02 = (Function0) objAaT2;
            }
            BBI.A0R(bbi, false);
            boolean z = ((ProductDetailsActionsUiState) c1boA02.getValue()).actionsEnabled;
            boolean zA1N = AnonymousClass003.A1N(bfm, productDetailsActionsViewModel, g0uProductSaveToast);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == C78N.A00) {
                objAaT3 = new Function0() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeader$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        productDetailsActionsViewModel.toggleSave(g0uProductSaveToast);
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0O(bbi, objAaT3);
            }
            ProductDetailsHeaderKt.ProductDetailsTopBar(function0, bool, (Function0) objAaT3, function02, z, bRg2, bfm, (iA0d << 12) & 458752, 0);
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeader$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    ProductDetailsHeader productDetailsHeader = this.f$0;
                    ProductDetailsActions productDetailsActions2 = productDetailsActions;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    productDetailsHeader.Content(productDetailsActions2, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static /* synthetic */ Unit $r8$lambda$5d8lGiKm0SdEw97x__kqDJMvoJw(ProductDetailsActionsViewModel productDetailsActionsViewModel, G0U g0u) {
        productDetailsActionsViewModel.toggleSave(g0u);
        return Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lMSg-UPDQVHhKS_WjCluQVZqf4M, reason: not valid java name */
    public static /* synthetic */ Unit m1863$r8$lambda$lMSgUPDQVHhKS_WjCluQVZqf4M(ProductDetailsActionsViewModel productDetailsActionsViewModel, Context context) {
        productDetailsActionsViewModel.share(context);
        return Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zl1KKTdfC2-vCr2tDVPAkGTliCM, reason: not valid java name */
    public static /* synthetic */ Unit m1864$r8$lambda$zl1KKTdfC2vCr2tDVPAkGTliCM(ProductDetailsActionsViewModel productDetailsActionsViewModel, AuraNavigator auraNavigator, ResultEventBus resultEventBus) {
        productDetailsActionsViewModel.reply(auraNavigator, resultEventBus);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$1$0$0(ProductDetailsActionsViewModel productDetailsActionsViewModel, AuraNavigator auraNavigator, ResultEventBus resultEventBus) {
        productDetailsActionsViewModel.reply(auraNavigator, resultEventBus);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$2$0$0(ProductDetailsActionsViewModel productDetailsActionsViewModel, Context context) {
        productDetailsActionsViewModel.share(context);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$3$0(ProductDetailsActionsViewModel productDetailsActionsViewModel, G0U g0u) {
        productDetailsActionsViewModel.toggleSave(g0u);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$4(ProductDetailsHeader productDetailsHeader, ProductDetailsActions productDetailsActions, BRg bRg, int i, int i2, BFM bfm, int i3) {
        productDetailsHeader.Content(productDetailsActions, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
