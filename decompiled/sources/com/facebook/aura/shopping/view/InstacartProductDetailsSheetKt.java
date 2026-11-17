package com.facebook.aura.shopping.view;

import X.AHD;
import X.AKO;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOD;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DK;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C9jH;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey;
import com.facebook.aura.productactions.impl.ProductDetailsHeader;
import com.facebook.aura.productactions.impl.ProductDetailsHeaderKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.PdpProductInfo;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.viewmodel.InstacartProductAction;
import com.facebook.aura.shopping.viewmodel.InstacartProductCtaState;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel;
import com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class InstacartProductDetailsSheetKt {

    /* renamed from: com.facebook.aura.shopping.view.InstacartProductDetailsSheetKt$InstacartProductCtaRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ InstacartProductDetailsSheetKey $productKey;
        public final /* synthetic */ InstacartProductDetailsUiState $uiState;
        public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, InstacartProductDetailsViewModel instacartProductDetailsViewModel, InstacartProductDetailsUiState instacartProductDetailsUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$productKey = instacartProductDetailsSheetKey;
            this.$viewModel = instacartProductDetailsViewModel;
            this.$uiState = instacartProductDetailsUiState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            InstacartProductDetailsSheetKt.InstacartProductCtaRow(this.$productKey, this.$viewModel, this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.InstacartProductDetailsSheetKt$InstacartProductCtaRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ InstacartProductDetailsSheetKey $productKey;
        public final /* synthetic */ InstacartProductDetailsUiState $uiState;
        public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, InstacartProductDetailsViewModel instacartProductDetailsViewModel, InstacartProductDetailsUiState instacartProductDetailsUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$productKey = instacartProductDetailsSheetKey;
            this.$viewModel = instacartProductDetailsViewModel;
            this.$uiState = instacartProductDetailsUiState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            InstacartProductDetailsSheetKt.InstacartProductCtaRow(this.$productKey, this.$viewModel, this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.InstacartProductDetailsSheetKt$InstacartProductDetailsSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ InstacartProductDetailsSheetKey $productKey;
        public final /* synthetic */ C1BO<InstacartProductDetailsUiState> $uiState$delegate;
        public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, InstacartProductDetailsViewModel instacartProductDetailsViewModel, C1BO<InstacartProductDetailsUiState> c1bo) {
            super(2);
            this.$productKey = instacartProductDetailsSheetKey;
            this.$viewModel = instacartProductDetailsViewModel;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                InstacartProductDetailsSheetKt.InstacartProductCtaRow(this.$productKey, this.$viewModel, this.$uiState$delegate.getValue(), C3U4.A04(BRg.A00, ProductDetailsSectionsKt.PdpSectionSpacing), bfm, InstacartProductDetailsViewModel.$stable << 3, 0);
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

    /* renamed from: com.facebook.aura.shopping.view.InstacartProductDetailsSheetKt$InstacartProductDetailsSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ InstacartProductDetailsSheetKey $productKey;
        public final /* synthetic */ C1BO<InstacartProductDetailsUiState> $uiState$delegate;
        public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InstacartProductDetailsViewModel instacartProductDetailsViewModel, C1BO<InstacartProductDetailsUiState> c1bo, InstacartProductDetailsSheetKey instacartProductDetailsSheetKey) {
            super(3);
            this.$viewModel = instacartProductDetailsViewModel;
            this.$uiState$delegate = c1bo;
            this.$productKey = instacartProductDetailsSheetKey;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            BRg bRgThen = C10G.A02.then(ProductDetailsSectionsKt.rememberProductDetailsImpression(this.$uiState$delegate.getValue().presentation, this.$viewModel.analytics, bfm, 0));
            InstacartProductDetailsSheetKey instacartProductDetailsSheetKey = this.$productKey;
            InstacartProductDetailsViewModel instacartProductDetailsViewModel = this.$viewModel;
            C1BO<InstacartProductDetailsUiState> c1bo = this.$uiState$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            InstacartProductDetailsSheetKt.InstacartProductHero(instacartProductDetailsSheetKey, instacartProductDetailsViewModel, c1bo.getValue(), null, bfm, InstacartProductDetailsViewModel.$stable << 3, 8);
            InstacartProductDetailsSheetKt.InstacartProductSummary(c1bo.getValue(), null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.InstacartProductDetailsSheetKt$InstacartProductDetailsSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ InstacartProductDetailsSheetKey $productKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$productKey = instacartProductDetailsSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            InstacartProductDetailsSheetKt.InstacartProductDetailsSheet(this.$productKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.InstacartProductDetailsSheetKt$InstacartProductHero$2, reason: invalid class name and case insensitive filesystem */
    public final class C137412 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ InstacartProductDetailsSheetKey $productKey;
        public final /* synthetic */ InstacartProductDetailsUiState $uiState;
        public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137412(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, InstacartProductDetailsViewModel instacartProductDetailsViewModel, InstacartProductDetailsUiState instacartProductDetailsUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$productKey = instacartProductDetailsSheetKey;
            this.$viewModel = instacartProductDetailsViewModel;
            this.$uiState = instacartProductDetailsUiState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            InstacartProductDetailsSheetKt.InstacartProductHero(this.$productKey, this.$viewModel, this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.InstacartProductDetailsSheetKt$InstacartProductSummary$2, reason: invalid class name and case insensitive filesystem */
    public final class C137422 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ InstacartProductDetailsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137422(InstacartProductDetailsUiState instacartProductDetailsUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = instacartProductDetailsUiState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            InstacartProductDetailsSheetKt.InstacartProductSummary(this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void InstacartProductCtaRow(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, InstacartProductDetailsViewModel instacartProductDetailsViewModel, InstacartProductDetailsUiState instacartProductDetailsUiState, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        String str;
        Function0 function0;
        BRg bRg2 = bRg;
        bfm.AgG(-1395255996);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, instacartProductDetailsSheetKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(instacartProductDetailsViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, instacartProductDetailsUiState);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InstacartProductCtaState instacartProductCtaState = instacartProductDetailsUiState.cta;
            if (instacartProductCtaState.addToCart == null && instacartProductCtaState.link == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(instacartProductDetailsSheetKey, instacartProductDetailsViewModel, instacartProductDetailsUiState, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            Context contextA01 = AKO.A01(bbi);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            boolean zA1R = AnonymousClass005.A1R(bfm, abstractC3358CGzA06, contextA01, auraNavigatorA05);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new ProductActionHandler(abstractC3358CGzA06, contextA01, auraNavigatorA05);
                BBI.A0O(bbi, objAaT);
            }
            ProductActionHandler productActionHandler = (ProductActionHandler) objAaT;
            boolean zA1K = AnonymousClass003.A1K(bfm, instacartProductDetailsViewModel.analytics, instacartProductDetailsUiState.presentation);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == C78N.A00) {
                ProductDetailsAnalytics productDetailsAnalytics = instacartProductDetailsViewModel.analytics;
                ProductDetailsPresentation productDetailsPresentation = instacartProductDetailsUiState.presentation;
                objAaT2 = productDetailsAnalytics.metadata(productDetailsPresentation.product.url, productDetailsPresentation.productType, C9jH.A00);
                bfm.Ai0(objAaT2);
            }
            BO6 bo6 = (BO6) objAaT2;
            boolean zA1X = AnonymousClass005.A1X(bfm, bo6, productActionHandler, bfm.A67(instacartProductDetailsSheetKey), (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(instacartProductDetailsViewModel)));
            Object objAaT3 = bfm.AaT();
            if (zA1X || objAaT3 == C78N.A00) {
                objAaT3 = new InstacartProductDetailsSheetKt$InstacartProductCtaRow$openLink$1$1(instacartProductDetailsSheetKey, instacartProductDetailsViewModel, bo6, productActionHandler);
                BBI.A0O(bbi, objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0D);
            if (instacartProductCtaState.addToCart != null) {
                bfm.AgE(-32327340);
                InstacartProductAction.OpenLink openLink = instacartProductCtaState.websiteArrow;
                if (openLink != null) {
                    str = openLink.label;
                    bfm.AgE(-32213756);
                    boolean zA1K2 = AnonymousClass003.A1K(bfm, g0u, openLink);
                    Object objAaT4 = bfm.AaT();
                    if (zA1K2 || objAaT4 == C78N.A00) {
                        objAaT4 = new InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$1$1$1(g0u, openLink);
                        BBI.A0O(bbi, objAaT4);
                    }
                    function0 = (Function0) objAaT4;
                    BBI.A0R(bbi, false);
                } else {
                    str = null;
                    bfm.AgE(-32213757);
                    BBI.A0R(bbi, false);
                    function0 = null;
                }
                ProductDetailsSectionsKt.ProductCtaWithWebsiteArrow(str, function0, null, B1V.A00(bfm, new InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$2(instacartProductDetailsUiState, instacartProductDetailsViewModel), -229826525), bfm, 3072, 4);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-31816088);
                BBI.A0R(bbi, false);
            }
            InstacartProductAction.OpenLink openLink2 = instacartProductCtaState.link;
            if (openLink2 == null) {
                bfm.AgE(-31794637);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-31794636);
                String strA01 = openLink2.label;
                if (strA01 == null) {
                    bfm.AgE(-1522991617);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dee);
                } else {
                    bfm.AgE(-1522992051);
                }
                BBI.A0R(bbi, false);
                boolean z = instacartProductCtaState.linkEmphasized;
                boolean zA1K3 = AnonymousClass003.A1K(bfm, g0u, openLink2);
                Object objAaT5 = bfm.AaT();
                if (zA1K3 || objAaT5 == C78N.A00) {
                    objAaT5 = new InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$3$1$1(g0u, openLink2);
                    BBI.A0O(bbi, objAaT5);
                }
                ProductDetailsSectionsKt.PdpLinkButton(strA01, z, (Function0) objAaT5, null, bfm, 0, 8);
                BBI.A0R(bbi, false);
            }
            if (instacartProductDetailsUiState.addToCartFailed) {
                bfm.AgE(-31554448);
                ProductDetailsSectionsKt.ProductCtaError(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dba), null, bfm, 0, 2);
            } else {
                bfm.AgE(-31469880);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(instacartProductDetailsSheetKey, instacartProductDetailsViewModel, instacartProductDetailsUiState, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void InstacartProductDetailsSheet(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(instacartProductDetailsSheetKey, 0);
        bfm.AgG(376628490);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, instacartProductDetailsSheetKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            InstacartProductDetailsViewModel.Factory factory = new InstacartProductDetailsViewModel.Factory(instacartProductDetailsSheetKey, AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            InstacartProductDetailsViewModel instacartProductDetailsViewModel = (InstacartProductDetailsViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(InstacartProductDetailsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, instacartProductDetailsViewModel.uiState);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            boolean z = ((InstacartProductDetailsUiState) c1boA02.getValue()).addToCartSucceeded;
            String sessionId = instacartProductDetailsSheetKey.getSessionId();
            boolean zA67 = bfm.A67(instacartProductDetailsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new InstacartProductDetailsSheetKt$InstacartProductDetailsSheet$1$1(instacartProductDetailsViewModel);
                BBI.A0O(bbi, objAaT);
            }
            ProductDetailsSectionsKt.AddToCartDismissEffect(z, sessionId, (Function0) ((InterfaceC7353EnQ) objAaT), bfm, 0);
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass2(instacartProductDetailsSheetKey, instacartProductDetailsViewModel, c1boA02), 1812310339);
            G0W<C1DG, BFM, Integer, Unit> g0w = ComposableSingletons$InstacartProductDetailsSheetKt.f272lambda$1478119592;
            boolean zA1M = AnonymousClass003.A1M(bfm, instacartProductDetailsViewModel, auraNavigatorA05);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new InstacartProductDetailsSheetKt$InstacartProductDetailsSheet$3$1(instacartProductDetailsViewModel, auraNavigatorA05);
                BBI.A0O(bbi, objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRg2, null, null, b1uA00, g0w, (Function0) objAaT2, false, true, false, null, B1V.A00(bfm, new AnonymousClass4(instacartProductDetailsViewModel, c1boA02, instacartProductDetailsSheetKey), -2001673721), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 100884486, 48, 1676);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(instacartProductDetailsSheetKey, bRg2, i, i2);
        }
    }

    public static final void InstacartProductHero(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, InstacartProductDetailsViewModel instacartProductDetailsViewModel, InstacartProductDetailsUiState instacartProductDetailsUiState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-465717132);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, instacartProductDetailsSheetKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(instacartProductDetailsViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, instacartProductDetailsUiState);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            ProductDetailsPresentation productDetailsPresentation = instacartProductDetailsUiState.presentation;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0P.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            C0z7 c0z7 = C0z7.A00;
            String str = productDetailsPresentation.productId;
            String str2 = productDetailsPresentation.product.url;
            boolean zA1Z = AnonymousClass002.A1Z(productDetailsPresentation.productType, ShoppingProductType.BROWSER);
            AHD<String> ahd = instacartProductDetailsUiState.imageUrls;
            String str3 = (String) AbstractC0878AGe.A0G(ahd);
            String str4 = productDetailsPresentation.product.name;
            int i4 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1O = AnonymousClass003.A1O(bfm, auraNavigatorA05, productDetailsPresentation, i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(instacartProductDetailsViewModel)));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new InstacartProductDetailsSheetKt$InstacartProductHero$1$1$1(instacartProductDetailsViewModel, auraNavigatorA05, productDetailsPresentation);
                BBI.A0O(bbi, objAaT);
            }
            G0V g0v = (G0V) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = InstacartProductDetailsSheetKt$InstacartProductHero$1$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            HatchProductDetailsHeroKt.m2021HatchProductDetailsHeroiAN7k5M(str, str2, zA1Z, ahd, str3, str4, g0v, (Function0) objAaT2, 0.0f, new C1DK(0), ComposableSingletons$InstacartProductDetailsSheetKt.f273lambda$753763058, null, null, false, bfm, 113246208, 6, 14336);
            ProductDetailsHeader.INSTANCE.Content(ProductDetailsHeaderKt.rememberInstacartProductDetailsActions(instacartProductDetailsSheetKey, instacartProductDetailsViewModel, bfm, (iA0T & 14) | (InstacartProductDetailsViewModel.$stable << 3) | i4), C10G.A00(C2VU.A01, C3U4.A09(c0z7.A4C(C2VU.A0C, BRg.A00).then(c1062ATq), AuraDimensKt.SpacingMedium), false), bfm, 384, 0);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137412(instacartProductDetailsSheetKey, instacartProductDetailsViewModel, instacartProductDetailsUiState, bRgA0P, i, i2);
        }
    }

    public static final void InstacartProductSummary(InstacartProductDetailsUiState instacartProductDetailsUiState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-990190500);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, instacartProductDetailsUiState) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ProductDetailsPresentation productDetailsPresentation = instacartProductDetailsUiState.presentation;
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            ProductDetailsSectionsKt.ProductEyebrow(instacartProductDetailsUiState.eyebrow, productDetailsPresentation.productType, null, bfm, 0, 4);
            ProductDetailsSectionsKt.ProductName(productDetailsPresentation.product.name, null, bfm, 0, 2);
            PdpPrice pdpPrice = productDetailsPresentation.product.currentPrice;
            if (pdpPrice == null) {
                bfm.AgE(-685759217);
            } else {
                bfm.AgE(-685759216);
                PdpProductInfo pdpProductInfo = productDetailsPresentation.product;
                PdpPrice pdpPrice2 = pdpProductInfo.originalPrice;
                Integer num = pdpProductInfo.pricePercentOff;
                int i4 = PdpPrice.$stable;
                ProductDetailsSectionsKt.ProductPriceRow(pdpPrice, pdpPrice2, num, null, null, bfm, i4 | 3072 | (i4 << 3), 16);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137422(instacartProductDetailsUiState, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ InstacartProductDetailsUiState access$InstacartProductDetailsSheet$lambda$0(C1BO c1bo) {
        return (InstacartProductDetailsUiState) c1bo.getValue();
    }
}
