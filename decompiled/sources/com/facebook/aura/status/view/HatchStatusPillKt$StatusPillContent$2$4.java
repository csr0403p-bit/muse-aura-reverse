package com.facebook.aura.status.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06c;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.F60;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$StatusPillContent$2$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ float $hiddenPillNameRowHeight;
    public final /* synthetic */ boolean $isAvatarVisible;
    public final /* synthetic */ HatchStatusPillUiState $state;
    public final /* synthetic */ AuraTypography $typography;

    /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$StatusPillContent$2$4$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C06c, String, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ float $hiddenPillNameRowHeight;
        public final /* synthetic */ boolean $isAvatarVisible;
        public final /* synthetic */ String $pillTitle;
        public final /* synthetic */ HatchStatusPillUiState $state;
        public final /* synthetic */ AuraTypography $typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraTypography auraTypography, AuraColors auraColors, boolean z, float f, String str, HatchStatusPillUiState hatchStatusPillUiState) {
            super(4);
            this.$typography = auraTypography;
            this.$colors = auraColors;
            this.$isAvatarVisible = z;
            this.$hiddenPillNameRowHeight = f;
            this.$pillTitle = str;
            this.$state = hatchStatusPillUiState;
        }

        public final void invoke(C06c c06c, String str, BFM bfm, int i) {
            BRg bRgA01;
            int iA0e = i;
            C7384Etj.A0Y(c06c, 0);
            if ((i & 48) == 0) {
                iA0e = i | AnonymousClass004.A0e(bfm, str);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0e & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0e)) {
                bfm.Afo();
                return;
            }
            C3TH c3th = C2VU.A00;
            AuraTypography auraTypography = this.$typography;
            AuraColors auraColors = this.$colors;
            boolean z = this.$isAvatarVisible;
            float f = this.$hiddenPillNameRowHeight;
            String str2 = this.$pillTitle;
            HatchStatusPillUiState hatchStatusPillUiState = this.$state;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA012, iA0J);
            C1822Arm c1822Arm = auraTypography.subheadlineEmphasized;
            long j = auraColors.primaryText;
            if (z) {
                bRgA01 = bs0;
            } else {
                bRgA01 = C10G.A01(C2VU.A04, AnonymousClass001.A0U(bs0, f), false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, bRgA01, j, c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (str != null) {
                bfm.AgE(872168644);
                AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A04(bs0, AuraDimensKt.SpacingMicro), HatchStatusPillKt.getSubtitleColor(hatchStatusPillUiState.pillState, auraColors), auraTypography.footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0e >> 3) & 14) | 805306368, 6, 14832);
            } else {
                bfm.AgE(872650477);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, String str, BFM bfm, Integer num) {
            invoke(c06c, str, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$StatusPillContent$2$4(HatchStatusPillUiState hatchStatusPillUiState, AuraTypography auraTypography, AuraColors auraColors, boolean z, float f) {
        super(2);
        this.$state = hatchStatusPillUiState;
        this.$typography = auraTypography;
        this.$colors = auraColors;
        this.$isAvatarVisible = z;
        this.$hiddenPillNameRowHeight = f;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[PHI: r1 r4
  0x0099: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v7 java.lang.String) binds: [B:23:0x0096, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r4v2 X.BBI) = (r4v1 X.BBI), (r4v4 X.BBI) binds: [B:23:0x0096, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r17, int r18) {
        /*
            r16 = this;
            r2 = r18
            r1 = r18 & 3
            r0 = 2
            r5 = 0
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            r6 = r17
            boolean r0 = X.AnonymousClass001.A1b(r0, r6, r2)
            if (r0 == 0) goto Lae
            X.CGz r1 = X.AnonymousClass002.A0h(r6)
            r3 = r16
            com.facebook.aura.status.viewmodel.HatchStatusPillUiState r0 = r3.$state
            java.lang.String r2 = r0.botName
            if (r2 != 0) goto L24
            com.facebook.aura.gateway.JarvisUtils r0 = com.facebook.aura.gateway.JarvisUtils.INSTANCE
            java.lang.String r2 = r0.getSelectedAssistantName(r1)
        L24:
            com.facebook.aura.status.viewmodel.HatchStatusPillUiState r0 = r3.$state
            java.lang.Integer r1 = r0.subtitleRes
            r9 = 0
            if (r1 != 0) goto L89
            r0 = 1907771682(0x71b64922, float:1.8052699E30)
            X.BBI r4 = X.AnonymousClass002.A0M(r6, r0)
        L32:
            com.facebook.aura.status.viewmodel.HatchStatusPillUiState r0 = r3.$state
            java.lang.String r1 = r0.subtitleText
            if (r1 != 0) goto L99
            r0 = 1907853739(0x71b789ab, float:1.81767E30)
            r6.AgE(r0)
        L3e:
            X.BBI.A0R(r4, r5)
            com.facebook.aura.status.viewmodel.HatchStatusPillUiState r0 = r3.$state
            java.lang.String r1 = r0.activityEmoji
            if (r1 == 0) goto L4f
            if (r9 == 0) goto L4f
            java.lang.String r0 = " "
            java.lang.String r9 = X.FGI.A0U(r1, r0, r9)
        L4f:
            java.lang.Object r11 = r6.AaT()
            java.lang.Object r0 = X.C78N.A00
            if (r11 != r0) goto L5c
            com.facebook.aura.status.view.HatchStatusPillKt$StatusPillContent$2$4$1$1 r11 = com.facebook.aura.status.view.HatchStatusPillKt$StatusPillContent$2$4$1$1.INSTANCE
            r6.Ai0(r11)
        L5c:
            X.G0U r11 = (X.G0U) r11
            androidx.compose.ui.Alignment r7 = X.C2VU.A0C
            com.facebook.aura.vds.compose.theme.AuraTypography r13 = r3.$typography
            com.facebook.aura.vds.compose.theme.AuraColors r14 = r3.$colors
            boolean r15 = r3.$isAvatarVisible
            float r1 = r3.$hiddenPillNameRowHeight
            com.facebook.aura.status.viewmodel.HatchStatusPillUiState r0 = r3.$state
            com.facebook.aura.status.view.HatchStatusPillKt$StatusPillContent$2$4$2 r12 = new com.facebook.aura.status.view.HatchStatusPillKt$StatusPillContent$2$4$2
            r18 = r0
            r17 = r2
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0 = -83357633(0xfffffffffb08103f, float:-7.064819E35)
            X.B1U r13 = X.B1V.A00(r6, r12, r0)
            r14 = 1600896(0x186d80, float:2.243333E-39)
            r15 = 34
            r8 = 0
            java.lang.String r10 = "pill-content"
            r12 = r8
            X.ANR.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L89:
            r0 = 1907771683(0x71b64923, float:1.80527E30)
            java.lang.String r1 = X.AnonymousClass003.A0g(r6, r1, r0)
            r4 = r6
            X.BBI r4 = (X.BBI) r4
            X.BBI.A0R(r4, r5)
            if (r1 != 0) goto L99
            goto L32
        L99:
            r0 = 1907853740(0x71b789ac, float:1.8176701E30)
            r6.AgE(r0)
            r0 = 2131886425(0x7f120159, float:1.9407428E38)
            java.lang.String r0 = X.AbstractC2271BQs.A01(r6, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3e
            r9 = r1
            goto L3e
        Lae:
            r6.Afo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillKt$StatusPillContent$2$4.invoke(X.BFM, int):void");
    }
}
