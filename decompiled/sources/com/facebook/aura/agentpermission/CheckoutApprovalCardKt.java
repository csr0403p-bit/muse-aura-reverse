package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AVy;
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
import X.ApQ;
import X.AxM;
import X.B18;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1SA;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutApprovalCardKt {
    public static final float CheckoutReviewFaviconSize = 24.0f;
    public static final float CheckoutScreenshotScrimAlpha = 0.03f;
    public static final C1D3 CheckoutCardShape = C1D8.A00(28.0f);
    public static final C1D3 CheckoutRowShape = C1D8.A00(24.0f);
    public static final C1D3 CheckoutPaymentRowShape = C1D8.A00(22.0f);

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$BrowserTaskActionPill$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ long $contentColor;
        public final /* synthetic */ String $faviconUri;
        public final /* synthetic */ String $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, long j, String str2) {
            super(2);
            this.$faviconUri = str;
            this.$contentColor = j;
            this.$label = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                CheckoutApprovalCardKt.m183CheckoutReviewOrderFaviconRPmYEkk(this.$faviconUri, this.$contentColor, bfm, 0);
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingXsmall;
                C01N.A09(bfm, bs0, f);
                AuraTextKt.m2639AuraTextUY9GdpU(this.$label, null, this.$contentColor, C06G.A0Y(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                C01N.A09(bfm, bs0, f);
                C1SA.A00(bfm, null, C10G.A07(bs0, 12.0f), AnonymousClass002.A0S(C06G.A09(bfm)), BOf.A00(bfm, R.drawable.arrows_expand_wght400_outline, 0), null, null, 0.0f, AVy.$stable | 432, 56);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$BrowserTaskActionPill$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $faviconUri;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$faviconUri = str2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalCardKt.BrowserTaskActionPill(this.$label, this.$faviconUri, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutApprovalCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ String $narrative;
        public final /* synthetic */ String $reviewText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, ApQ apQ, String str, String str2) {
            super(3);
            this.$checkout = browserCheckoutApproval;
            this.$headline = apQ;
            this.$narrative = str;
            this.$reviewText = str2;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
            } else {
                CheckoutApprovalCardKt.CheckoutHeader(this.$checkout, this.$headline, this.$narrative, null, bfm, HatchAgentPermissionsRepository.BrowserCheckoutApproval.$stable, 8);
                AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$reviewText, null, false, bfm, 0, 6);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutApprovalCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C107872 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ Function0<Unit> $onTermsLinkClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107872(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, Function0<Unit> function0) {
            super(3);
            this.$checkout = browserCheckoutApproval;
            this.$onTermsLinkClick = function0;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval = this.$checkout;
            Boolean bool = browserCheckoutApproval.networkTokenEligible;
            HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = browserCheckoutApproval.getPaymentSelection();
            CheckoutTermsDisclosureKt.CheckoutTermsDisclosure(bool, paymentSelection != null ? paymentSelection.paymentMethod : null, this.$onTermsLinkClick, null, bfm, 0, 8);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutApprovalCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C107883 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ String $formattedAmount;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ Function0<Unit> $onShowEstimatedTotalInfo;
        public final /* synthetic */ String $totalPromoCaption;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            CheckoutApprovalCardKt.CheckoutScreenshot(this.$checkout, this.$onOpenBrowserClick, null, bfm, HatchAgentPermissionsRepository.BrowserCheckoutApproval.$stable, 4);
            HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval = this.$checkout;
            String str = browserCheckoutApproval.cardBrand;
            String str2 = browserCheckoutApproval.cardLast4;
            String str3 = browserCheckoutApproval.paymentMethodLabel;
            HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = browserCheckoutApproval.getPaymentSelection();
            CheckoutApprovalSharedKt.CheckoutPaymentRow(str, str2, str3, paymentSelection != null ? paymentSelection.paymentMethod : null, C3U4.A09(C0v5.A04(C1b8.A01(C11U.A03(BRg.A00, CheckoutApprovalCardKt.CheckoutPaymentRowShape), C3cH.A0W(bfm).secondaryButtonBackground), C3cG.A0A(0), null, this.$onShowDetails, true), AuraDimensKt.SpacingMedium), false, bfm, 0, 32);
            CheckoutApprovalSharedKt.CheckoutMaxTotal(this.$formattedAmount, null, this.$onShowEstimatedTotalInfo, CheckoutApprovalSharedKt.gatedTotalPromoCaption(this.$totalPromoCaption), bfm, 0, 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107883(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, Function0<Unit> function0, Function0<Unit> function02, String str, Function0<Unit> function03, String str2) {
            super(3);
            this.$checkout = browserCheckoutApproval;
            this.$onOpenBrowserClick = function0;
            this.$onShowDetails = function02;
            this.$formattedAmount = str;
            this.$onShowEstimatedTotalInfo = function03;
            this.$totalPromoCaption = str2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutApprovalCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $decisionOptions;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $narrative;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ Function0<Unit> $onShowEstimatedTotalInfo;
        public final /* synthetic */ Function0<Unit> $onTermsLinkClick;
        public final /* synthetic */ String $reviewText;
        public final /* synthetic */ RichApprovalSurface $surface;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, ApQ apQ, String str2, String str3, String str4, List<AgentPermissionDecisionOption> list, RichApprovalSurface richApprovalSurface, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$approvalId = str;
            this.$checkout = browserCheckoutApproval;
            this.$headline = apQ;
            this.$narrative = str2;
            this.$reviewText = str3;
            this.$totalPromoCaption = str4;
            this.$decisionOptions = list;
            this.$surface = richApprovalSurface;
            this.$onShowDetails = function0;
            this.$onShowEstimatedTotalInfo = function02;
            this.$onTermsLinkClick = function03;
            this.$onOpenBrowserClick = function04;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalCardKt.CheckoutApprovalCard(this.$approvalId, this.$checkout, this.$headline, this.$narrative, this.$reviewText, this.$totalPromoCaption, this.$decisionOptions, this.$surface, this.$onShowDetails, this.$onShowEstimatedTotalInfo, this.$onTermsLinkClick, this.$onOpenBrowserClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C107892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $narrative;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107892(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, ApQ apQ, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = browserCheckoutApproval;
            this.$headline = apQ;
            this.$narrative = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalCardKt.CheckoutHeader(this.$checkout, this.$headline, this.$narrative, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutScreenshot$1, reason: invalid class name and case insensitive filesystem */
    public final class C107901 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107901(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = browserCheckoutApproval;
            this.$onOpenBrowserClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalCardKt.CheckoutScreenshot(this.$checkout, this.$onOpenBrowserClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutScreenshot$2, reason: invalid class name and case insensitive filesystem */
    public final class C107912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107912(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = browserCheckoutApproval;
            this.$onOpenBrowserClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalCardKt.CheckoutScreenshot(this.$checkout, this.$onOpenBrowserClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutScreenshot$3, reason: invalid class name and case insensitive filesystem */
    public final class C107923 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ BrowserTaskNavigation $actions;
        public final /* synthetic */ String $browserTaskId;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107923(String str, BrowserTaskNavigation browserTaskNavigation, HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, Function0<Unit> function0, AuraNavigator auraNavigator) {
            super(3);
            this.$browserTaskId = str;
            this.$actions = browserTaskNavigation;
            this.$checkout = browserCheckoutApproval;
            this.$onOpenBrowserClick = function0;
            this.$navigator = auraNavigator;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(interfaceC05151eP, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, interfaceC05151eP);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C01N.A07(bfm, C1b8.A00(interfaceC05151eP.AQJ(bs0), 0.03f, B6A.A01));
            String str = this.$browserTaskId;
            if (str == null || !this.$actions.canOpenTask(str)) {
                bfm.AgE(-1361413810);
            } else {
                bfm.AgE(-1361822235);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120090);
                String strCheckoutFaviconUri = CheckoutApprovalSharedKt.checkoutFaviconUri(this.$checkout.merchantUrl, null);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1R(bfm, this.$browserTaskId, AnonymousClass001.A1T(bfm, this.$actions, bfm.A65(this.$onOpenBrowserClick))));
                Function0<Unit> function0 = this.$onOpenBrowserClick;
                BrowserTaskNavigation browserTaskNavigation = this.$actions;
                String str2 = this.$browserTaskId;
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new CheckoutApprovalCardKt$CheckoutScreenshot$3$1$1(function0, browserTaskNavigation, str2, auraNavigator);
                    bfm.Ai0(objAaT);
                }
                CheckoutApprovalCardKt.BrowserTaskActionPill(strA01, strCheckoutFaviconUri, (Function0) objAaT, C3U4.A0C(interfaceC05151eP.A4C(C2VU.A07, bs0), 0.0f, 0.0f, 4.0f, 4.0f), bfm, 0, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCardKt$CheckoutScreenshot$4, reason: invalid class name and case insensitive filesystem */
    public final class C107934 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107934(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = browserCheckoutApproval;
            this.$onOpenBrowserClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalCardKt.CheckoutScreenshot(this.$checkout, this.$onOpenBrowserClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void BrowserTaskActionPill(String str, String str2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 0, function0);
        bfm.AgG(1918402976);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long jA07 = C3cH.A07(bfm, AuraTheme.INSTANCE);
            BRg bRgA09 = C10G.A09(bRg2, 48.0f, 48.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = CheckoutApprovalCardKt$BrowserTaskActionPill$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraElevatedButtonKt.m2420AuraPillButtonq88KkHs(function0, AnonymousClass001.A0Y(bRgA09, objAaT, true), false, 4.0f, 8.0f, 0.0f, false, B1V.A00(bfm, new AnonymousClass2(str2, jA07, str), -2128799298), bfm, ((iA0d >> 6) & 14) | 12610944, 96);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckoutApprovalCard(java.lang.String r30, com.facebook.aura.gateway.HatchAgentPermissionsRepository.BrowserCheckoutApproval r31, X.ApQ r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.List<com.facebook.aura.gateway.AgentPermissionDecisionOption> r36, com.facebook.aura.agentpermission.RichApprovalSurface r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.BRg r42, X.BFM r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutApprovalCardKt.CheckoutApprovalCard(java.lang.String, com.facebook.aura.gateway.HatchAgentPermissionsRepository$BrowserCheckoutApproval, X.ApQ, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.facebook.aura.agentpermission.RichApprovalSurface, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void CheckoutHeader(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, ApQ apQ, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-813619672);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(browserCheckoutApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, apQ);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0Q.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0X);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            CheckoutApprovalSharedKt.CheckoutMerchantFavicon(CheckoutApprovalSharedKt.checkoutFaviconUri(browserCheckoutApproval.merchantUrl, null), null, bfm, 0, 2);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMedium);
            String str2 = apQ.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineMedium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = CheckoutApprovalCardKt$CheckoutHeader$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
            if (str == null) {
                bfm.AgE(1221110399);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str, c1062ATq, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 1221110400).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107892(browserCheckoutApproval, apQ, str, bRgA0Q, i, i2);
        }
    }

    public static final void CheckoutScreenshot(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c107934;
        String str;
        int i3;
        int i4;
        BRg bRg2 = bRg;
        bfm.AgG(1081964687);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(browserCheckoutApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        boolean zIsLiveBrowserPreviewBehindSheet = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            String str2 = browserCheckoutApproval.browserTaskId;
            if (str2 != null) {
                bfm.AgE(385985264);
                zIsLiveBrowserPreviewBehindSheet = AgentPermissionOpenBrowserLinkKt.isLiveBrowserPreviewBehindSheet(bfm, 0);
            } else {
                bfm.AgE(-919357467);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (zIsLiveBrowserPreviewBehindSheet) {
                bfm.AgE(-919321440);
                AgentPermissionOpenBrowserLinkKt.OpenBrowserLink(str2, function0, bRg2, bfm, iA05 & 1008, 0);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc == null) {
                    return;
                } else {
                    c107934 = new C107901(browserCheckoutApproval, function0, bRg2, i, i2);
                }
            } else {
                bfm.AgE(-919210925);
                BBI.A0R(bbi, false);
                AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
                AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
                boolean zA65 = bfm.A65(abstractC3358CGzA0h);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new BrowserTaskNavigation(abstractC3358CGzA0h);
                    bfm.Ai0(objAaT);
                }
                BrowserTaskNavigation browserTaskNavigation = (BrowserTaskNavigation) objAaT;
                HatchAgentPermissionsRepository.CheckoutScreenshot checkoutScreenshot = browserCheckoutApproval.screenshot;
                Float fValueOf = null;
                boolean zA1K = AnonymousClass003.A1K(bfm, checkoutScreenshot != null ? checkoutScreenshot.url : null, abstractC3358CGzA0h);
                Object objAaT2 = bfm.AaT();
                if (zA1K || objAaT2 == C78N.A00) {
                    objAaT2 = (checkoutScreenshot == null || (str = checkoutScreenshot.url) == null || C7BY.A0j(str)) ? null : WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(str, abstractC3358CGzA0h);
                    bfm.Ai0(objAaT2);
                }
                String str3 = (String) objAaT2;
                if (str3 == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        c107934 = new C107912(browserCheckoutApproval, function0, bRg2, i, i2);
                    }
                } else {
                    if (checkoutScreenshot != null && (i3 = checkoutScreenshot.width) > 0 && (i4 = checkoutScreenshot.height) > 0) {
                        fValueOf = Float.valueOf(i3 / i4);
                    }
                    ApprovalBrowserScreenshotKt.ApprovalBrowserScreenshot(str3, fValueOf, CheckoutRowShape, bRg2, B1V.A00(bfm, new C107923(browserCheckoutApproval.browserTaskId, browserTaskNavigation, browserCheckoutApproval, function0, auraNavigatorA0b), -470904812), bfm, ((iA05 << 3) & 7168) | 24960, 0);
                }
            }
            C3cG.A1D(bBbAAc, c107934);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c107934 = new C107934(browserCheckoutApproval, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c107934);
        }
    }

    public static final C1D3 getCheckoutCardShape() {
        return CheckoutCardShape;
    }

    /* renamed from: CheckoutReviewOrderFavicon-RPmYEkk, reason: not valid java name */
    public static final void m183CheckoutReviewOrderFaviconRPmYEkk(String str, long j, BFM bfm, int i) {
        bfm.AgG(1167358841);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            BRg bRgA01 = C1b8.A01(C11U.A02(BRg.A00, CheckoutReviewFaviconSize), C3cH.A0W(bfm).background);
            if (str != null) {
                bfm.AgE(437295402);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, bRgA01, B18.A00, null, null, false, null, 0L, true, false, false, null, null, null, null, bfm, (iA0d & 14) | 100666752, 0, 32496);
            } else {
                bfm.AgE(437498297);
                AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(bRgA01, AuraDimensKt.SpacingMicro), BOf.A00(bfm, R.drawable.globe_wght400_outline_24, 0), AuraIconSize.SMALL, null, j, null, bfm, AnonymousClass001.A0B(iA0d << 9, AnonymousClass001.A04()), 32);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new CheckoutApprovalCardKt$CheckoutReviewOrderFavicon$1(str, j, i);
        }
    }
}
