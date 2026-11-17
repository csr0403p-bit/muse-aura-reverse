package com.facebook.aura.ui;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
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
import X.C07C;
import X.C0A8;
import X.C0fG;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.view.View;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPublishSuccessBottomSheetKt {

    /* renamed from: com.facebook.aura.ui.HatchPublishSuccessBottomSheetKt$HatchPublishSuccessBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C0fG $clipboardManager;
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ String $copiedMessage;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ AuraTypography $typography;
        public final /* synthetic */ String $url;
        public final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraColors auraColors, AuraTypography auraTypography, Function0<Unit> function0, Function0<Unit> function02, String str, C0fG c0fG, View view, String str2) {
            super(3);
            this.$colors = auraColors;
            this.$typography = auraTypography;
            this.$onShare = function0;
            this.$onDismiss = function02;
            this.$url = str;
            this.$clipboardManager = c0fG;
            this.$view = view;
            this.$copiedMessage = str2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, 24.0f);
                C3TH c3th = C2VU.A00;
                AuraColors auraColors = this.$colors;
                AuraTypography auraTypography = this.$typography;
                Function0<Unit> function0 = this.$onShare;
                Function0<Unit> function02 = this.$onDismiss;
                String str = this.$url;
                C0fG c0fG = this.$clipboardManager;
                View view = this.$view;
                String str2 = this.$copiedMessage;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                int iA00 = C01N.A00(bfm, bs0, 8.0f);
                BRg bRgA03 = C1b8.A03(C10G.A07(bs0, 40.0f), C1D8.A00(8.0f), auraColors.background);
                Alignment alignment = C2VU.A09;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA03);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA01, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.aura_wand, 0);
                AuraIconSize auraIconSize = AuraIconSize.X_SMALL;
                long j2 = auraColors.primaryIcon.enabled;
                int i3 = AVy.$stable;
                AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, j2, null, bfm, (i3 << 3) | 3456, 33);
                BBI.A0R(bbi, true);
                C01N.A08(bfm, bs0, 16.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba1), null, auraColors.primaryText, auraTypography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 8.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba3), null, auraColors.secondaryText, auraTypography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 24.0f);
                BRg bRgA0C = C3U4.A0C(C1b8.A03(c1062ATq, C1D8.A00(12.0f), auraColors.highlight), 16.0f, 4.0f, 4.0f, 4.0f);
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                C90m c90m = C90m.A00;
                C1822Arm c1822Arm = auraTypography.bodyRegular;
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, bs0, true), auraColors.secondaryText, c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, iA00, 14832);
                C01N.A09(bfm, bs0, 8.0f);
                BRg bRgA072 = C10G.A07(bs0, 48.0f);
                boolean zA1U = AnonymousClass005.A1U(bfm, str, view, str2, bfm.A67(c0fG));
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new HatchPublishSuccessBottomSheetKt$HatchPublishSuccessBottomSheet$1$1$2$1$1(c0fG, str, view, str2);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA04 = C0v5.A04(bRgA072, null, null, (Function0) objAaT, true);
                InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgA04);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA012, g0v);
                BPg.A02(bfm, akqA044, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA014, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), auraIconSize, null, auraColors.primaryIcon.enabled, null, bfm, (i3 << 3) | 3456, 33);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                C01N.A08(bfm, bs0, 24.0f);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba0);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                boolean zA65 = bfm.A65(function0);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchPublishSuccessBottomSheetKt$HatchPublishSuccessBottomSheet$1$1$3$1(function0);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                C01N.A08(bfm, bs0, 8.0f);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9b), null, c1062ATq, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                C01N.A04(bfm, bbi, bs0, 16.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchPublishSuccessBottomSheetKt$HatchPublishSuccessBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$url = str;
            this.$onShare = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSuccessBottomSheetKt.HatchPublishSuccessBottomSheet(this.$url, this.$onShare, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchPublishSuccessBottomSheet(String str, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        AnonymousClass005.A10(str, function0, function02);
        bfm.AgG(402404171);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(AuraContainer.SecondaryBottomSheet.INSTANCE, null, function02, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7), null, null, null, null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass1(AnonymousClass002.A0c(bfm), AnonymousClass002.A0f(bfm), function0, function02, str, (C0fG) bfm.A6v(Am0.A02), AnonymousClass001.A0J(bfm), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9e)), -1887505112), bfm, (iA0d & 896) | 6, 3072, 8178);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, function02, i);
        }
    }
}
