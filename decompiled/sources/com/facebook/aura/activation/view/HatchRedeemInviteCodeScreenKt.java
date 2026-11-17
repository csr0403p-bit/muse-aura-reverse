package com.facebook.aura.activation.view;

import X.AKQ;
import X.ARK;
import X.AT5;
import X.AT8;
import X.AVy;
import X.AbstractC1103AYp;
import X.AbstractC1742Apf;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
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
import X.C01N;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1SA;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.HatchRedeemInviteCodeCopy;
import com.facebook.aura.activation.data.HatchRedeemInviteCodeSuccessCopy;
import com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel;
import com.facebook.aura.activation.model.InviteCodeError;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.HatchTabBarPaddingKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.input.AuraCodeInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchRedeemInviteCodeScreenKt {
    public static final int CopyFadeDelayMs = 90;
    public static final int CopyFadeInMs = 420;

    /* renamed from: com.facebook.aura.activation.view.HatchRedeemInviteCodeScreenKt$HatchRedeemInviteCodeScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onCodeChange;
        public final /* synthetic */ Function0<Unit> $onConfirmClick;
        public final /* synthetic */ Function0<Unit> $onRetryClick;
        public final /* synthetic */ HatchRedeemInviteCodeViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchRedeemInviteCodeViewModel.UiState uiState, Function0<Unit> function0, G0U<? super String, Unit> g0u, Function0<Unit> function02) {
            super(4);
            this.$uiState = uiState;
            this.$onRetryClick = function0;
            this.$onCodeChange = g0u;
            this.$onConfirmClick = function02;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m144invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m144invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            HatchRedeemInviteCodeViewModel.RedeemPhase redeemPhase = this.$uiState.phase;
            if (C7384Etj.areEqual(redeemPhase, HatchRedeemInviteCodeViewModel.RedeemPhase.Loading.INSTANCE)) {
                bfm.AgE(1389431657);
                HatchRedeemInviteCodeScreenKt.RedeemLoadingContent(null, bfm, 0, 1);
            } else if (C7384Etj.areEqual(redeemPhase, HatchRedeemInviteCodeViewModel.RedeemPhase.LoadFailed.INSTANCE)) {
                bfm.AgE(1389433792);
                HatchRedeemInviteCodeScreenKt.m139RedeemLoadFailedContentuFdPcIQ(this.$onRetryClick, f, null, bfm, (iA04 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
            } else if (redeemPhase instanceof HatchRedeemInviteCodeViewModel.RedeemPhase.Redeemed) {
                bfm.AgE(1389437739);
                HatchRedeemInviteCodeScreenKt.m140RedeemedContent73KfpEQ(((HatchRedeemInviteCodeViewModel.RedeemPhase.Redeemed) redeemPhase).successCopy, f, f2, bfm, (iA04 << 3) & 1008);
            } else {
                if (!(redeemPhase instanceof HatchRedeemInviteCodeViewModel.RedeemPhase.Entry)) {
                    AnonymousClass004.A1A(bfm, 1389430312);
                    throw C3cG.A0q();
                }
                bfm.AgE(1389444039);
                HatchRedeemInviteCodeScreenKt.m138RedeemInviteCodeContentNuRrP5Q(((HatchRedeemInviteCodeViewModel.RedeemPhase.Entry) redeemPhase).copy, this.$uiState, this.$onCodeChange, this.$onConfirmClick, f, f2, bfm, (iA04 << 12) & 516096);
            }
            AnonymousClass002.A19(bfm);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.HatchRedeemInviteCodeScreenKt$HatchRedeemInviteCodeScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ G0U<String, Unit> $onCodeChange;
        public final /* synthetic */ Function0<Unit> $onConfirmClick;
        public final /* synthetic */ Function0<Unit> $onRetryClick;
        public final /* synthetic */ HatchRedeemInviteCodeViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchRedeemInviteCodeViewModel.UiState uiState, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = uiState;
            this.$onCodeChange = g0u;
            this.$onConfirmClick = function0;
            this.$onRetryClick = function02;
            this.$onBackClick = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchRedeemInviteCodeScreenKt.HatchRedeemInviteCodeScreen(this.$uiState, this.$onCodeChange, this.$onConfirmClick, this.$onRetryClick, this.$onBackClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.activation.view.HatchRedeemInviteCodeScreenKt$RedeemLoadingContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C107282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107282(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchRedeemInviteCodeScreenKt.RedeemLoadingContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: RedeemLoadFailedContent-uFdPcIQ, reason: not valid java name */
    public static final void m139RedeemLoadFailedContentuFdPcIQ(Function0<Unit> function0, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1354998978);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f56);
            BRg bRgA04 = C3U4.A04(AnonymousClass001.A0T(bRg2), f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchRedeemInviteCodeScreenKt$RedeemLoadFailedContent$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            HatchScreenErrorStateKt.HatchScreenErrorState(strA01, function0, AnonymousClass001.A0Y(bRgA04, objAaT, false), HatchSurface.SETTINGS, null, HatchScreen.REDEEM_INVITE_CODE, null, bfm, ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 199680, 80);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchRedeemInviteCodeScreenKt$RedeemLoadFailedContent$2(function0, f, bRg2, i, i2);
        }
    }

    public static final void HatchRedeemInviteCodeScreen(HatchRedeemInviteCodeViewModel.UiState uiState, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(uiState, 0);
        AnonymousClass005.A11(g0u, function0, function02, 1);
        C7384Etj.A0Y(function03, 4);
        bfm.AgG(695040856);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function03);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z = uiState.phase instanceof HatchRedeemInviteCodeViewModel.RedeemPhase.Redeemed;
            AuraWaitlistCelebrationState auraWaitlistCelebrationStateRememberAuraWaitlistCelebrationState = AuraWaitlistConfettiKt.rememberAuraWaitlistCelebrationState(z ? 1 : 0, z, AuraConfettiDensity.DENSE, bfm, 384, 0);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            AuraContentRole auraContentRole = AuraContentRole.Focused;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f57);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchRedeemInviteCodeScreenKt$HatchRedeemInviteCodeScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, HatchImpressionModifierKt.hatchImpression(AuraWaitlistConfettiKt.auraWaitlistConfetti(bRg2, auraWaitlistCelebrationStateRememberAuraWaitlistCelebrationState, (Function0) objAaT, bfm, ((iA0T >> 15) & 14) | 384), HatchOrigin.SETTINGS, HatchSurface.SETTINGS, HatchSubsurface.REDEEM_INVITE_CODE, HatchScreen.REDEEM_INVITE_CODE, HatchComponent.INVITE_CODE_FORM, null, null, null, 500L, 0.0f, null, null, null), auraContentRole, 0L, strA01, null, function03, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass2(uiState, function02, g0u, function0), 551165875), bfm, (3670016 & (iA0T << 6)) | 390, 0, 805306368, 536870824);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(uiState, g0u, function0, function02, function03, bRg2, i, i2);
        }
    }

    /* renamed from: RedeemInviteCodeContent-NuRrP5Q, reason: not valid java name */
    public static final void m138RedeemInviteCodeContentNuRrP5Q(HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, HatchRedeemInviteCodeViewModel.UiState uiState, G0U<? super String, Unit> g0u, Function0<Unit> function0, float f, float f2, BFM bfm, int i) {
        String strA0s;
        bfm.AgG(1154214979);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchRedeemInviteCodeCopy) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, uiState);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A08(bfm, f);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A09(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f55);
            boolean zA01 = AbstractC1742Apf.A01(bfm);
            BS0 bs0 = BRg.A00;
            BRg bRgHatchTabImePadding = HatchTabBarPaddingKt.hatchTabImePadding(C10G.A01, false, bfm, 54);
            C3TH c3th = C2VU.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchTabImePadding);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            InviteCodeError inviteCodeError = uiState.error;
            Integer numValueOf = Integer.valueOf(c1110AYwA00.A01.AGd());
            boolean zA1N = AnonymousClass003.A1N(bfm, uiState, c1110AYwA00);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$1$1(uiState, c1110AYwA00, null);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, inviteCodeError, numValueOf);
            BRg bRgA02 = AbstractC1103AYp.A02(c1110AYwA00, ARK.A00(bs0), true);
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bRgA02, f3, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C01N.A08(bfm, bs0, f);
            C1SA.A00(bfm, null, C10G.A0C(bs0, 204.0f, 120.0f), null, BOf.A00(bfm, R.drawable.hatch_invite_gift_illustration, 0), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, f3);
            String str = hatchRedeemInviteCodeCopy.title;
            if (str == null) {
                bfm.AgE(1917060144);
                BBI.A0R(bbi, false);
            } else {
                C1822Arm c1822Arm = C3cH.A0X(bfm, auraTheme, 1917060145).title1Emphasized;
                long j = colors.primaryText;
                C1062ATq c1062ATq = C10G.A02;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(c1062ATq, objAaT2, false), j, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingSmall, false);
            }
            String str2 = hatchRedeemInviteCodeCopy.subtitle;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long j2 = colors.secondaryText;
            C1062ATq c1062ATq2 = C10G.A02;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, c1062ATq2, j2, c1822ArmA0B, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            AuraCodeInputKt.m2586AuraCodeInputOOXMnFM(uiState.inviteCode, g0u, 6, null, 0.0f, false, uiState.error != null, 2, 1, false, false, !uiState.isLoading, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12042e), null, bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 113246592, 6, 8760);
            InviteCodeError inviteCodeError2 = uiState.error;
            if (inviteCodeError2 == null) {
                bfm.AgE(1918186746);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1918186747);
                if (inviteCodeError2 instanceof InviteCodeError.Invalid) {
                    bfm.AgE(-942537242);
                    strA0s = ((InviteCodeError.Invalid) inviteCodeError2).serverMessage;
                    if (strA0s == null) {
                        bfm.AgE(-861687025);
                        strA0s = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12042b);
                    } else {
                        bfm.AgE(-861688420);
                    }
                    BBI.A0R(bbi, false);
                    BBI.A0R(bbi, false);
                } else {
                    if (!inviteCodeError2.equals(InviteCodeError.Generic.INSTANCE)) {
                        throw AnonymousClass003.A0k(bfm, bbi, -861690673);
                    }
                    bfm.AgE(-861683185);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12042a);
                }
                C1822Arm c1822Arm2 = auraTheme.getTypography(bfm, 6).caption1Regular;
                long j3 = colors.negativeAccent;
                BRg bRgA0C = C3U4.A0C(c1062ATq2, 0.0f, AuraDimensKt.SpacingMedium, 0.0f, 0.0f);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$2$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0s, AnonymousClass001.A0Y(bRgA0C, objAaT3, false), j3, c1822Arm2, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                BBI.A0R(bbi, false);
            }
            C01N.A04(bfm, bbi, bs0, f3, true);
            if (C7BY.A0j(hatchRedeemInviteCodeCopy.disclaimer) || zA01) {
                bfm.AgE(986540053);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(986276553);
                AuraTextKt.m2639AuraTextUY9GdpU(hatchRedeemInviteCodeCopy.disclaimer, C3U4.A0B(c1062ATq2, f3, 0.0f), colors.secondaryText, auraTheme.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                BBI.A0R(bbi, false);
            }
            BRg bRgA013 = C1b8.A01(c1062ATq2, colors.background);
            float f4 = AuraDimensKt.SpacingMedium;
            BRg bRgA0C2 = C3U4.A0C(bRgA013, f3, f4, f3, 0.0f);
            boolean zA1J = AnonymousClass003.A1J(bfm, strA01, uiState) | AnonymousClass004.A1M(iA0T);
            Object objAaT4 = bfm.AaT();
            if (zA1J || objAaT4 == C78N.A00) {
                objAaT4 = new HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$1$3$1(strA01, uiState, function0);
                BBI.A0O(bbi, objAaT4);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0C2, null, null, null, null, null, null, true, (G0U) objAaT4, bfm, 12582912, 126);
            if (!zA01) {
                f4 = f2 + f3;
            }
            C01N.A04(bfm, bbi, bs0, f4, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$2(hatchRedeemInviteCodeCopy, uiState, g0u, function0, f, f2, i);
        }
    }

    public static final void RedeemLoadingContent(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1991912717);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            BRg bRgA0T = AnonymousClass001.A0T(bRg);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchRedeemInviteCodeScreenKt$RedeemLoadingContent$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0Y(bRgA0T, objAaT, false), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107282(bRg, i, i2);
        }
    }

    /* renamed from: RedeemedContent-73KfpEQ, reason: not valid java name */
    public static final void m140RedeemedContent73KfpEQ(HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy, float f, float f2, BFM bfm, int i) {
        bfm.AgG(-675646521);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchRedeemInviteCodeSuccessCopy) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            BS0 bs0 = BRg.A00;
            BRg bRgA0T = AnonymousClass005.A0T(bfm, C10G.A01);
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bRgA0T, f3, 0.0f);
            C3TH c3th = C2VU.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C01N.A08(bfm, bs0, f);
            C1SA.A00(bfm, null, C10G.A0C(bs0, 204.0f, 120.0f), null, BOf.A00(bfm, R.drawable.hatch_invite_gift_illustration, 0), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, f3);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AT8.A00(0.0f);
                bfm.Ai0(objAaT);
            }
            AT5 at5 = (AT5) objAaT;
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(at5);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchRedeemInviteCodeScreenKt$RedeemedContent$1$1$1(at5, null);
                BBI.A0O(bbi, objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            boolean zA672 = bfm.A67(at5);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new HatchRedeemInviteCodeScreenKt$RedeemedContent$1$2$1(at5);
                BBI.A0O(bbi, objAaT3);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bs0, objAaT3);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0W);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = hatchRedeemInviteCodeSuccessCopy.title;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title1Emphasized;
            long j = colors.primaryText;
            C1062ATq c1062ATq = C10G.A02;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = HatchRedeemInviteCodeScreenKt$RedeemedContent$1$3$1$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(c1062ATq, objAaT4, false), j, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingSmall);
            AuraTextKt.m2639AuraTextUY9GdpU(hatchRedeemInviteCodeSuccessCopy.subtitle, c1062ATq, colors.secondaryText, C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
            C01N.A04(bfm, bbi, bs0, f2, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchRedeemInviteCodeScreenKt$RedeemedContent$2(hatchRedeemInviteCodeSuccessCopy, f, f2, i);
        }
    }
}
