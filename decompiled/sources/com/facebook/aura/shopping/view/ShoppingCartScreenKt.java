package com.facebook.aura.shopping.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1DG;
import X.C1DP;
import X.C1YY;
import X.C3U4;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C8j4;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchShoppingDataState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.CurrentShoppingCart;
import com.facebook.aura.shopping.model.ShoppingCart;
import com.facebook.aura.shopping.model.ShoppingCartPresentation;
import com.facebook.aura.shopping.viewmodel.ShoppingCartRead;
import com.facebook.aura.shopping.viewmodel.ShoppingCartUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ShoppingCartScreenKt {

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartScreenKt$ShoppingCartActionsFooter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checkoutFailed;
        public final /* synthetic */ CurrentShoppingCart $current;
        public final /* synthetic */ boolean $isCheckingOut;
        public final /* synthetic */ ShoppingCheckoutLogContext $logContext;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCheckout;
        public final /* synthetic */ G0U<String, Unit> $onOpenProviderCart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(CurrentShoppingCart currentShoppingCart, boolean z, boolean z2, Function0<Unit> function0, G0U<? super String, Unit> g0u, ShoppingCheckoutLogContext shoppingCheckoutLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$current = currentShoppingCart;
            this.$isCheckingOut = z;
            this.$checkoutFailed = z2;
            this.$onCheckout = function0;
            this.$onOpenProviderCart = g0u;
            this.$logContext = shoppingCheckoutLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartScreenKt.ShoppingCartActionsFooter(this.$current, this.$isCheckingOut, this.$checkoutFailed, this.$onCheckout, this.$onOpenProviderCart, this.$logContext, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartScreenKt$ShoppingCartScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ ShoppingCheckoutLogContext $logContext;
        public final /* synthetic */ Function0<Unit> $onCheckout;
        public final /* synthetic */ G0U<String, Unit> $onOpenProviderCart;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ ShoppingCartUiState $uiState;

        /* renamed from: com.facebook.aura.shopping.view.ShoppingCartScreenKt$ShoppingCartScreen$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ Function0<Unit> $onRetry;
            public final /* synthetic */ ShoppingCartRead $read;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ShoppingCartRead shoppingCartRead, Function0<Unit> function0) {
                super(2);
                this.$read = shoppingCartRead;
                this.$onRetry = function0;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    ShoppingCartRowsKt.ShoppingCartStaleNotice(((ShoppingCartRead.Failed) this.$read).isRetrying, this.$onRetry, null, bfm, 0, 4);
                } else {
                    bfm.Afo();
                }
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ShoppingCartUiState shoppingCartUiState, Function0<Unit> function0, G0U<? super String, Unit> g0u, ShoppingCheckoutLogContext shoppingCheckoutLogContext, Function0<Unit> function02) {
            super(4);
            this.$uiState = shoppingCartUiState;
            this.$onCheckout = function0;
            this.$onOpenProviderCart = g0u;
            this.$logContext = shoppingCheckoutLogContext;
            this.$onRetry = function02;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2068invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2068invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            ShoppingCartRead shoppingCartRead = this.$uiState.read;
            if (C7384Etj.areEqual(shoppingCartRead, ShoppingCartRead.Loading.INSTANCE)) {
                bfm.AgE(-722565544);
                ShoppingCartScreenKt.m2064ShoppingCartLoadingorJrPs(f, null, bfm, iA04 & 14, 2);
            } else if (shoppingCartRead instanceof ShoppingCartRead.Loaded) {
                bfm.AgE(-722562282);
                CurrentShoppingCart currentShoppingCart = ((ShoppingCartRead.Loaded) shoppingCartRead).current;
                ShoppingCartUiState shoppingCartUiState = this.$uiState;
                ShoppingCartScreenKt.m2063ShoppingCartLoadedikN4xI4(currentShoppingCart, shoppingCartUiState.isCheckingOut, shoppingCartUiState.checkoutFailed, f, f2, this.$onCheckout, this.$onOpenProviderCart, this.$logContext, null, bfm, 64512 & (iA04 << 9), 256);
            } else {
                if (!(shoppingCartRead instanceof ShoppingCartRead.Failed)) {
                    AnonymousClass004.A1A(bfm, -722566778);
                    throw C3cG.A0q();
                }
                bfm.AgE(-722548215);
                ShoppingCartPresentation shoppingCartPresentation = this.$uiState.saved;
                int i2 = iA04 << 3;
                ShoppingCartScreenKt.m2062ShoppingCartListeWuZFaY(shoppingCartPresentation != null ? shoppingCartPresentation.cart : null, f, f2, this.$logContext, HatchShoppingDataState.SAVED, null, false, B1V.A00(bfm, new AnonymousClass1(shoppingCartRead, this.$onRetry), 2054625254), bfm, (i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 12607488 | (i2 & 896), 96);
            }
            AnonymousClass002.A19(bfm);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartScreenKt$ShoppingCartScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingCheckoutLogContext $logContext;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onCheckout;
        public final /* synthetic */ G0U<String, Unit> $onOpenProviderCart;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ ShoppingCartUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(ShoppingCartUiState shoppingCartUiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super String, Unit> g0u, ShoppingCheckoutLogContext shoppingCheckoutLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = shoppingCartUiState;
            this.$onBack = function0;
            this.$onRetry = function02;
            this.$onCheckout = function03;
            this.$onOpenProviderCart = g0u;
            this.$logContext = shoppingCheckoutLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartScreenKt.ShoppingCartScreen(this.$uiState, this.$onBack, this.$onRetry, this.$onCheckout, this.$onOpenProviderCart, this.$logContext, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0  */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ShoppingCartActionsFooter(com.facebook.aura.shopping.model.CurrentShoppingCart r57, boolean r58, boolean r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, X.G0U<? super java.lang.String, kotlin.Unit> r61, com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext r62, X.BRg r63, X.BFM r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingCartScreenKt.ShoppingCartActionsFooter(com.facebook.aura.shopping.model.CurrentShoppingCart, boolean, boolean, kotlin.jvm.functions.Function0, X.G0U, com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: ShoppingCartList-eWuZFaY, reason: not valid java name */
    public static final void m2062ShoppingCartListeWuZFaY(ShoppingCart shoppingCart, float f, float f2, ShoppingCheckoutLogContext shoppingCheckoutLogContext, HatchShoppingDataState hatchShoppingDataState, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        G0V<? super BFM, ? super Integer, Unit> g0v2;
        BRg bRg2 = bRg;
        boolean zA1Q = z;
        bfm.AgG(-111022811);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingCart) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, shoppingCheckoutLogContext);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, hatchShoppingDataState.ordinal());
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0t = 1572864;
        if (i4 != 0) {
            iA0d |= iA0t;
        } else if ((i & 1572864) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, zA1Q);
            iA0d |= iA0t;
        }
        int i5 = i2 & 128;
        int iA0a = 12582912;
        if (i5 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0v);
            iA0d |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            g0v2 = i5 == 0 ? g0v : null;
            float fA01 = C8j4.A01(bfm);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            C1DP c1dp = new C1DP(fA01, f, fA01, f2);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingLarge);
            boolean zA1F = AnonymousClass004.A1F(iA0d) | AnonymousClass005.A1J(iA0d) | AnonymousClass004.A1M(iA0d) | AnonymousClass003.A1F(57344, iA0d, 16384) | AnonymousClass006.A1Y(iA0d, 3670016);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new ShoppingCartScreenKt$ShoppingCartList$1$1(g0v2, shoppingCart, shoppingCheckoutLogContext, hatchShoppingDataState, zA1Q);
                BBI.A0T(bfm, objAaT);
            }
            C1YY.A01(null, null, c9m9A00, c1dp, null, bfm, null, bRgA0T, (G0U) objAaT, 0, 490, false, false);
        } else {
            bfm.Afo();
            g0v2 = g0v;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ShoppingCartScreenKt$ShoppingCartList$2(shoppingCart, f, f2, shoppingCheckoutLogContext, hatchShoppingDataState, bRg2, zA1Q, g0v2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* renamed from: ShoppingCartLoaded-ikN4xI4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2063ShoppingCartLoadedikN4xI4(com.facebook.aura.shopping.model.CurrentShoppingCart r31, boolean r32, boolean r33, float r34, float r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, X.G0U<? super java.lang.String, kotlin.Unit> r37, com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext r38, X.BRg r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingCartScreenKt.m2063ShoppingCartLoadedikN4xI4(com.facebook.aura.shopping.model.CurrentShoppingCart, boolean, boolean, float, float, kotlin.jvm.functions.Function0, X.G0U, com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: ShoppingCartLoading--orJrPs, reason: not valid java name */
    public static final void m2064ShoppingCartLoadingorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-125667618);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205fb);
            BRg bRgA04 = C3U4.A04(AnonymousClass001.A0T(bRg2), f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ShoppingCartScreenKt$ShoppingCartLoading$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ShoppingCartScreenKt$ShoppingCartLoading$3(f, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190 A[PHI: r0 r10
  0x0190: PHI (r0v16 com.facebook.aura.shopping.model.ShoppingResultsAttribution) = 
  (r0v15 com.facebook.aura.shopping.model.ShoppingResultsAttribution)
  (r0v26 com.facebook.aura.shopping.model.ShoppingResultsAttribution)
 binds: [B:68:0x018c, B:40:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0190: PHI (r10v4 com.facebook.aura.shopping.viewmodel.ShoppingCartRead$Loaded) = 
  (r10v3 com.facebook.aura.shopping.viewmodel.ShoppingCartRead$Loaded)
  (r10v17 com.facebook.aura.shopping.viewmodel.ShoppingCartRead$Loaded)
 binds: [B:68:0x018c, B:40:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ShoppingCartScreen(com.facebook.aura.shopping.viewmodel.ShoppingCartUiState r45, kotlin.jvm.functions.Function0<kotlin.Unit> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, X.G0U<? super java.lang.String, kotlin.Unit> r49, com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext r50, X.BRg r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingCartScreenKt.ShoppingCartScreen(com.facebook.aura.shopping.viewmodel.ShoppingCartUiState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext, X.BRg, X.BFM, int, int):void");
    }
}
