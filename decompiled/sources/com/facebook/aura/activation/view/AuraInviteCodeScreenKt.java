package com.facebook.aura.activation.view;

import X.AGI;
import X.AHH;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
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
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1SA;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy;
import com.facebook.aura.activation.model.InviteCodeError;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.input.AuraCodeInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraInviteCodeScreenKt {
    public static final AHH<HeaderButton> InviteCodeHeaderButtons = AGI.A0E(HeaderButton.Settings);
    public static final float TitleWidthFraction = 0.72f;

    /* renamed from: com.facebook.aura.activation.view.AuraInviteCodeScreenKt$AuraInviteCodeScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $code;
        public final /* synthetic */ InviteCodeError $error;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ G0U<String, Unit> $onCodeChange;
        public final /* synthetic */ Function0<Unit> $onContinueClick;
        public final /* synthetic */ HatchActivationWaitlistInviteCopy.Screen $screenCopy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, boolean z, InviteCodeError inviteCodeError, HatchActivationWaitlistInviteCopy.Screen screen) {
            super(4);
            this.$code = str;
            this.$onCodeChange = g0u;
            this.$onContinueClick = function0;
            this.$isLoading = z;
            this.$error = inviteCodeError;
            this.$screenCopy = screen;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m126invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m126invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            String str = this.$code;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onContinueClick, AnonymousClass001.A1R(bfm, this.$onCodeChange, bfm.A65(str)));
            String str2 = this.$code;
            G0U<String, Unit> g0u = this.$onCodeChange;
            Function0<Unit> function0 = this.$onContinueClick;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new AuraInviteCodeScreenKt$AuraInviteCodeScreen$5$1$1(str2, g0u, function0);
                bfm.Ai0(objAaT);
            }
            AuraInviteCodeScreenKt.m124InviteCodeContentlVwrFTI(f, f2, str, (G0U) objAaT, this.$onContinueClick, this.$isLoading, this.$code.length() >= 6, this.$error, this.$screenCopy, bfm, iA04 & 126);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteCodeScreenKt$AuraInviteCodeScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $code;
        public final /* synthetic */ InviteCodeError $error;
        public final /* synthetic */ String $initialCode;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ G0U<String, Unit> $onCodeChange;
        public final /* synthetic */ Function0<Unit> $onContinueClick;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ HatchActivationWaitlistInviteCopy.Screen $screenCopy;
        public final /* synthetic */ boolean $showBackButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z, InviteCodeError inviteCodeError, HatchActivationWaitlistInviteCopy.Screen screen, BRg bRg, String str2, boolean z2, int i, int i2, int i3) {
            super(2);
            this.$code = str;
            this.$onCodeChange = g0u;
            this.$onContinueClick = function0;
            this.$onBackClick = function02;
            this.$onSettingsClick = function03;
            this.$isLoading = z;
            this.$error = inviteCodeError;
            this.$screenCopy = screen;
            this.$modifier = bRg;
            this.$initialCode = str2;
            this.$showBackButton = z2;
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
            AuraInviteCodeScreenKt.AuraInviteCodeScreen(this.$code, this.$onCodeChange, this.$onContinueClick, this.$onBackClick, this.$onSettingsClick, this.$isLoading, this.$error, this.$screenCopy, this.$modifier, this.$initialCode, this.$showBackButton, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraInviteCodeScreen(java.lang.String r67, X.G0U<? super java.lang.String, kotlin.Unit> r68, kotlin.jvm.functions.Function0<kotlin.Unit> r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, kotlin.jvm.functions.Function0<kotlin.Unit> r71, boolean r72, com.facebook.aura.activation.model.InviteCodeError r73, com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy.Screen r74, X.BRg r75, java.lang.String r76, boolean r77, X.BFM r78, int r79, int r80, int r81) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraInviteCodeScreenKt.AuraInviteCodeScreen(java.lang.String, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, com.facebook.aura.activation.model.InviteCodeError, com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy$Screen, X.BRg, java.lang.String, boolean, X.BFM, int, int, int):void");
    }

    /* renamed from: InviteCodeContent-lVwrFTI, reason: not valid java name */
    public static final void m124InviteCodeContentlVwrFTI(float f, float f2, String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, boolean z, boolean z2, InviteCodeError inviteCodeError, HatchActivationWaitlistInviteCopy.Screen screen, BFM bfm, int i) {
        String strA01;
        bfm.AgG(-1633872381);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA04 |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA04 |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i) == 0) {
            iA04 |= AnonymousClass004.A0t(bfm, z2);
        }
        if ((12582912 & i) == 0) {
            iA04 |= AnonymousClass004.A1R(bfm, inviteCodeError, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, i) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            iA04 |= AnonymousClass004.A0b(bfm, screen);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 38347923, 38347922), bfm, iA04)) {
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12022e);
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = AnonymousClass006.A0M(bfm);
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(bRgA0M, f3, 0.0f), 0.0f, 0.0f, 0.0f, f3 + f2);
            C3TH c3th = C2VU.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 54);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            BPg.A03(bfm, g0u2);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
            C01N.A0B(bfm, bs0, bRgA01, g0v3, f);
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v3);
            C1SA.A00(bfm, null, C10G.A04(bs0, 52.0f), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, f3);
            String str2 = screen.title;
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            C1822Arm c1822Arm = AnonymousClass001.A0g(bfm, akh).title1Emphasized;
            long j2 = auraColorsA0c.primaryText;
            BRg bRgA03 = C10G.A03(bs0, 0.72f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AuraInviteCodeScreenKt$InviteCodeContent$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0Y(bRgA03, objAaT, false), j2, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(screen.subtitle, null, auraColorsA0c.secondaryText, AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A08(bfm, bs0, 26.0f);
            int i3 = iA04 >> 6;
            AuraCodeInputKt.m2586AuraCodeInputOOXMnFM(str, g0u, 6, null, 0.0f, false, AnonymousClass002.A1X(inviteCodeError), 2, 1, false, false, !z, screen.title, null, bfm, (i3 & 14) | 113246592 | (i3 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0, 9784);
            if (inviteCodeError != null) {
                bfm.AgE(-1694895812);
                if (inviteCodeError instanceof InviteCodeError.Invalid) {
                    bfm.AgE(-1694802998);
                    strA01 = ((InviteCodeError.Invalid) inviteCodeError).serverMessage;
                    if (strA01 == null) {
                        bfm.AgE(499519659);
                        strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12042b);
                    } else {
                        bfm.AgE(499518264);
                    }
                    BBI.A0R(bbi, false);
                } else {
                    if (!inviteCodeError.equals(InviteCodeError.Generic.INSTANCE)) {
                        throw AnonymousClass003.A0k(bfm, bbi, 499516011);
                    }
                    bfm.AgE(499523499);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12042a);
                }
                BBI.A0R(bbi, false);
                C1822Arm c1822Arm2 = AnonymousClass001.A0g(bfm, akh).caption1Regular;
                long j3 = auraColorsA0c.negativeAccent;
                float f4 = AuraDimensKt.SpacingMedium;
                BRg bRgA0C2 = C3U4.A0C(c1062ATq, f4, f4, f4, 0.0f);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = AuraInviteCodeScreenKt$InviteCodeContent$1$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C2, objAaT2, false), j3, c1822Arm2, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1694135661);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v3);
            boolean zA65 = bfm.A65(strA012) | AnonymousClass005.A1C(iA04) | AnonymousClass007.A1I(iA04) | AnonymousClass005.A1M(iA04);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new AuraInviteCodeScreenKt$InviteCodeContent$1$2$1$1(strA012, z2, z, function0);
                bfm.Ai0(objAaT3);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(c1062ATq, null, null, null, null, null, null, true, (G0U) objAaT3, bfm, 12582918, 126);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraInviteCodeScreenKt$InviteCodeContent$2(f, f2, str, g0u, function0, z, z2, inviteCodeError, screen, i);
        }
    }
}
