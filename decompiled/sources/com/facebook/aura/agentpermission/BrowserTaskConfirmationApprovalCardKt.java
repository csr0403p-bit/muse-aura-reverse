package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
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
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class BrowserTaskConfirmationApprovalCardKt {
    public static final C1D3 BrowserTaskConfirmationPreviewShape = C1D8.A00(24.0f);

    /* renamed from: com.facebook.aura.agentpermission.BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationApprovalCard$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $attentionLabel;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ String $narrative;
        public final /* synthetic */ String $reviewText;
        public final /* synthetic */ BrowserTaskConfirmationTreatment $treatment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, BrowserTaskConfirmationTreatment browserTaskConfirmationTreatment, ApQ apQ) {
            super(3);
            this.$narrative = str;
            this.$attentionLabel = str2;
            this.$reviewText = str3;
            this.$treatment = browserTaskConfirmationTreatment;
            this.$headline = apQ;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                float f = AuraDimensKt.SpacingMedium;
                C9m9 c9m9A00 = AcQ.A00(f);
                String str = this.$narrative;
                String str2 = this.$attentionLabel;
                String str3 = this.$reviewText;
                BrowserTaskConfirmationTreatment browserTaskConfirmationTreatment = this.$treatment;
                ApQ apQ = this.$headline;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                C1062ATq c1062ATq = C10G.A02;
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A05, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, browserTaskConfirmationTreatment.getIconRes(), 0), AuraIconSize.MEDIUM, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A04(), 33);
                C1822Arm c1822ArmA0V = C06G.A0V(bfm);
                long jA0C = C06G.A0C(bfm);
                BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationApprovalCard$1$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2640AuraTextVmYn7U0(apQ, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA0C, c1822ArmA0V, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32752);
                BBI.A0R(bbi, true);
                if (str == null) {
                    bfm.AgE(810953097);
                    BBI.A0R(bbi, false);
                } else {
                    AuraTextKt.m2639AuraTextUY9GdpU(str, c1062ATq, C06G.A0C(bfm), AnonymousClass006.A0k(bfm, 810953098).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                    BBI.A0R(bbi, false);
                }
                AgentPermissionPendingCardKt.AgentPermissionAttentionBanner(str2, null, null, bfm, 48, 4);
                AgentPermissionPendingCardKt.AgentPermissionReviewText(str3, null, false, bfm, 0, 6);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationApprovalCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval $confirmation;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, Function0<Unit> function0) {
            super(3);
            this.$confirmation = browserTaskConfirmationApproval;
            this.$onOpenBrowserClick = function0;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                BrowserTaskConfirmationApprovalCardKt.BrowserTaskConfirmationPreview(this.$confirmation, this.$onOpenBrowserClick, null, bfm, HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval.$stable, 4);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationApprovalCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $attentionLabel;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval $confirmation;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $decisionOptions;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $narrative;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;
        public final /* synthetic */ String $reviewText;
        public final /* synthetic */ RichApprovalSurface $surface;
        public final /* synthetic */ BrowserTaskConfirmationTreatment $treatment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, ApQ apQ, String str, String str2, String str3, BrowserTaskConfirmationTreatment browserTaskConfirmationTreatment, List<AgentPermissionDecisionOption> list, RichApprovalSurface richApprovalSurface, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$confirmation = browserTaskConfirmationApproval;
            this.$headline = apQ;
            this.$narrative = str;
            this.$attentionLabel = str2;
            this.$reviewText = str3;
            this.$treatment = browserTaskConfirmationTreatment;
            this.$decisionOptions = list;
            this.$surface = richApprovalSurface;
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
            BrowserTaskConfirmationApprovalCardKt.BrowserTaskConfirmationApprovalCard(this.$confirmation, this.$headline, this.$narrative, this.$attentionLabel, this.$reviewText, this.$treatment, this.$decisionOptions, this.$surface, this.$onOpenBrowserClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C107781 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval $confirmation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107781(HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$confirmation = browserTaskConfirmationApproval;
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
            BrowserTaskConfirmationApprovalCardKt.BrowserTaskConfirmationPreview(this.$confirmation, this.$onOpenBrowserClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C107792 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ BrowserTaskNavigation $actions;
        public final /* synthetic */ BrowserTaskPresentation $browserTask;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval $confirmation;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;
        public final /* synthetic */ String $screenshotUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107792(String str, HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, BrowserTaskNavigation browserTaskNavigation, BrowserTaskPresentation browserTaskPresentation, Function0<Unit> function0, AuraNavigator auraNavigator) {
            super(3);
            this.$screenshotUri = str;
            this.$confirmation = browserTaskConfirmationApproval;
            this.$actions = browserTaskNavigation;
            this.$browserTask = browserTaskPresentation;
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
            if (this.$screenshotUri == null) {
                bfm.AgE(-401316465);
                AuraIconKt.m2567AuraIconFHprtrg(interfaceC05151eP.A4C(C2VU.A09, BRg.A00), BOf.A00(bfm, R.drawable.globe_wght400_outline_24, 0), AuraIconSize.LARGE, null, C3cH.A0W(bfm).secondaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 32);
            } else {
                bfm.AgE(-401040472);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval = this.$confirmation;
            String str = browserTaskConfirmationApproval.browserActionLabel;
            if (str == null || !this.$actions.canOpenTask(browserTaskConfirmationApproval.browserTaskId)) {
                bfm.AgE(-400911637);
            } else {
                bfm.AgE(-400911636);
                BrowserTaskPresentation browserTaskPresentation = this.$browserTask;
                Function0<Unit> function0 = this.$onOpenBrowserClick;
                BrowserTaskNavigation browserTaskNavigation = this.$actions;
                HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval2 = this.$confirmation;
                AuraNavigator auraNavigator = this.$navigator;
                String strCheckoutFaviconUri = CheckoutApprovalSharedKt.checkoutFaviconUri(browserTaskPresentation != null ? browserTaskPresentation.siteDomain : null, null);
                boolean zA1V = AnonymousClass005.A1V(bfm, browserTaskNavigation, browserTaskConfirmationApproval2, auraNavigator, bfm.A65(function0));
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationPreview$2$2$1$1(function0, browserTaskNavigation, browserTaskConfirmationApproval2, auraNavigator);
                    bfm.Ai0(objAaT);
                }
                CheckoutApprovalCardKt.BrowserTaskActionPill(str, strCheckoutFaviconUri, (Function0) objAaT, C3U4.A0C(interfaceC05151eP.A4C(C2VU.A07, BRg.A00), 0.0f, 0.0f, 8.0f, 8.0f), bfm, 0, 0);
            }
            BBI.A0R(bbiA07, false);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.BrowserTaskConfirmationApprovalCardKt$BrowserTaskConfirmationPreview$3, reason: invalid class name and case insensitive filesystem */
    public final class C107803 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval $confirmation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenBrowserClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107803(HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$confirmation = browserTaskConfirmationApproval;
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
            BrowserTaskConfirmationApprovalCardKt.BrowserTaskConfirmationPreview(this.$confirmation, this.$onOpenBrowserClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserTaskConfirmationTreatment.values().length];
            try {
                AnonymousClass002.A13(BrowserTaskConfirmationTreatment.BROWSER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserTaskConfirmationTreatment.CHECKOUT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BrowserTaskConfirmationPreview(com.facebook.aura.gateway.HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, X.BRg r21, X.BFM r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.BrowserTaskConfirmationApprovalCardKt.BrowserTaskConfirmationPreview(com.facebook.aura.gateway.HatchAgentPermissionsRepository$BrowserTaskConfirmationApproval, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void BrowserTaskConfirmationApprovalCard(HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, ApQ apQ, String str, String str2, String str3, BrowserTaskConfirmationTreatment browserTaskConfirmationTreatment, List<AgentPermissionDecisionOption> list, RichApprovalSurface richApprovalSurface, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        int iA0b;
        ApprovalCardActionsStyle approvalCardActionsStyle;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(browserTaskConfirmationApproval, apQ);
        AnonymousClass005.A0z(browserTaskConfirmationTreatment, list, richApprovalSurface);
        C7384Etj.A0Y(function0, 8);
        bfm.AgG(24857588);
        if ((i & 6) == 0) {
            iA0b = AnonymousClass002.A05(AnonymousClass004.A1X(browserTaskConfirmationApproval, bfm, i) ? 1 : 0) | i;
        } else {
            iA0b = i;
        }
        if ((i & 48) == 0) {
            iA0b |= AnonymousClass004.A0e(bfm, apQ);
        }
        if ((i & 384) == 0) {
            iA0b |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0b |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0b |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA0b |= AnonymousClass004.A0H(bfm, browserTaskConfirmationTreatment.ordinal());
        }
        if ((1572864 & i) == 0) {
            iA0b |= AnonymousClass002.A01(AnonymousClass004.A1R(bfm, list, 2097152, i) ? 1 : 0);
        }
        if ((12582912 & i) == 0) {
            iA0b |= AnonymousClass004.A1R(bfm, richApprovalSurface, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, i) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            iA0b |= AnonymousClass004.A0b(bfm, function0);
        }
        int i3 = i2 & 512;
        int iA0m = 805306368;
        if (i3 != 0) {
            iA0b |= iA0m;
        } else if ((805306368 & i) == 0) {
            iA0m = AnonymousClass004.A0m(bfm, bRg2);
            iA0b |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0b), bfm, iA0b)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int iOrdinal = browserTaskConfirmationTreatment.ordinal();
            if (iOrdinal == 0) {
                approvalCardActionsStyle = ApprovalCardActionsStyle.PERMISSION;
            } else if (iOrdinal == zA1a) {
                approvalCardActionsStyle = ApprovalCardActionsStyle.CHECKOUT;
            } else {
                throw C3cG.A0q();
            }
            int i4 = iA0b >> 18;
            ApprovalCardScaffoldKt.ApprovalCardScaffold(list, richApprovalSurface, B1V.A00(bfm, new AnonymousClass1(str, str2, str3, browserTaskConfirmationTreatment, apQ), -723016372), bRg2, approvalCardActionsStyle, null, B1V.A00(bfm, new AnonymousClass2(browserTaskConfirmationApproval, function0), 2129775304), bfm, (i4 & 14) | 1573248 | (RichApprovalSurface.$stable << 3) | (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 7168), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(browserTaskConfirmationApproval, apQ, str, str2, str3, browserTaskConfirmationTreatment, list, richApprovalSurface, function0, bRg2, i, i2);
        }
    }
}
