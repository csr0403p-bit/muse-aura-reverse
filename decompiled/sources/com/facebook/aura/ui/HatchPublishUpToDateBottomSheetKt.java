package com.facebook.aura.ui;

import X.AKQ;
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
import X.C07C;
import X.C0A8;
import X.C0fG;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
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
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPublishUpToDateBottomSheetKt {

    /* renamed from: com.facebook.aura.ui.HatchPublishUpToDateBottomSheetKt$HatchPublishUpToDateBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C0fG $clipboardManager;
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ String $copiedMessage;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isUnpublishing;
        public final /* synthetic */ Function0<Unit> $onUnpublish;
        public final /* synthetic */ Function0<Unit> $onView;
        public final /* synthetic */ AuraTypography $typography;
        public final /* synthetic */ String $url;
        public final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraTypography auraTypography, AuraColors auraColors, String str, Function0<Unit> function0, boolean z, Function0<Unit> function02, String str2, C0fG c0fG, View view, String str3) {
            super(3);
            this.$typography = auraTypography;
            this.$colors = auraColors;
            this.$fileName = str;
            this.$onView = function0;
            this.$isUnpublishing = z;
            this.$onUnpublish = function02;
            this.$url = str2;
            this.$clipboardManager = c0fG;
            this.$view = view;
            this.$copiedMessage = str3;
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
                BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
                AuraTypography auraTypography = this.$typography;
                AuraColors auraColors = this.$colors;
                String str = this.$fileName;
                Function0<Unit> function0 = this.$onView;
                boolean z = this.$isUnpublishing;
                Function0<Unit> function02 = this.$onUnpublish;
                String str2 = this.$url;
                C0fG c0fG = this.$clipboardManager;
                View view = this.$view;
                String str3 = this.$copiedMessage;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(bs0, 0.0f, 16.0f), auraColors.primaryText, auraTypography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                C01N.A08(bfm, bs0, 16.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba7), null, auraColors.secondaryText, auraTypography.subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 8.0f);
                BRg bRgA0C = C3U4.A0C(C1b8.A03(c1062ATq, C1D8.A00(12.0f), auraColors.elevated), 16.0f, 4.0f, 4.0f, 4.0f);
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0O(c90m, bs0, true), auraColors.secondaryText, auraTypography.bodyRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
                C01N.A09(bfm, bs0, 8.0f);
                BRg bRgA07 = C10G.A07(bs0, 48.0f);
                boolean zA1U = AnonymousClass005.A1U(bfm, str2, view, str3, bfm.A67(c0fG));
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new HatchPublishUpToDateBottomSheetKt$HatchPublishUpToDateBottomSheet$1$1$1$1$1(c0fG, str2, view, str3);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA04 = C0v5.A04(bRgA07, null, null, (Function0) objAaT, true);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA04);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, auraColors.primaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 33);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                C01N.A08(bfm, bs0, 24.0f);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba8);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                C01N.A08(bfm, bs0, 8.0f);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba5), null, c1062ATq, auraButtonStyles.destructive(null, bfm, 48, 1), auraButtonSize, null, false, false, !z, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200773);
                C01N.A04(bfm, bbi, bs0, 16.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchPublishUpToDateBottomSheetKt$HatchPublishUpToDateBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isUnpublishing;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onUnpublish;
        public final /* synthetic */ Function0<Unit> $onView;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$fileName = str;
            this.$url = str2;
            this.$isUnpublishing = z;
            this.$onView = function0;
            this.$onUnpublish = function02;
            this.$onDismiss = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishUpToDateBottomSheetKt.HatchPublishUpToDateBottomSheet(this.$fileName, this.$url, this.$isUnpublishing, this.$onView, this.$onUnpublish, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchPublishUpToDateBottomSheet(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, function0, function02, function03, 1);
        bfm.AgG(1945505718);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(AuraContainer.SecondaryBottomSheet.INSTANCE, null, function03, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7), null, null, null, null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass1(AnonymousClass002.A0f(bfm), AnonymousClass002.A0c(bfm), str, function0, z, function02, str2, (C0fG) bfm.A6v(Am0.A02), AnonymousClass001.A0J(bfm), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9e)), -701101127), bfm, ((iA0d >> 9) & 896) | 6, 3072, 8178);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, z, function0, function02, function03, i);
        }
    }
}
