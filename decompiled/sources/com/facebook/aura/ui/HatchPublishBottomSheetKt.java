package com.facebook.aura.ui;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPublishBottomSheetKt {

    /* renamed from: com.facebook.aura.ui.HatchPublishBottomSheetKt$HatchPublishBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onPublish;
        public final /* synthetic */ AuraTypography $typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AuraTypography auraTypography, AuraColors auraColors, Function0<Unit> function0, Function0<Unit> function02) {
            super(3);
            this.$fileName = str;
            this.$typography = auraTypography;
            this.$colors = auraColors;
            this.$onPublish = function0;
            this.$onDismiss = function02;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
                String str = this.$fileName;
                AuraTypography auraTypography = this.$typography;
                AuraColors auraColors = this.$colors;
                Function0<Unit> function0 = this.$onPublish;
                Function0<Unit> function02 = this.$onDismiss;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120ba4);
                C1822Arm c1822Arm = auraTypography.title3Emphasized;
                AuraTextKt.m2639AuraTextUY9GdpU(strA0t, C3U4.A0B(bs0, 0.0f, 16.0f), auraColors.primaryText, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                C01N.A08(bfm, bs0, 24.0f);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b97);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                B1U b1uA00 = B1V.A00(bfm, new HatchPublishBottomSheetKt$HatchPublishBottomSheet$1$1$1(auraColors), 1623931796);
                boolean zA65 = bfm.A65(function0);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchPublishBottomSheetKt$HatchPublishBottomSheet$1$1$2$1(function0);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, b1uA00, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 1772544, 0, 0, 134201221);
                C01N.A08(bfm, bs0, 8.0f);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b98), null, c1062ATq, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                C01N.A04(bfm, bbi, bs0, 16.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchPublishBottomSheetKt$HatchPublishBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onPublish;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$fileName = str;
            this.$onPublish = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishBottomSheetKt.HatchPublishBottomSheet(this.$fileName, this.$onPublish, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchPublishBottomSheet(String str, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        AnonymousClass005.A10(str, function0, function02);
        bfm.AgG(-1169669515);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(AuraContainer.SecondaryBottomSheet.INSTANCE, null, function02, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7), null, null, null, null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass1(str, AnonymousClass002.A0f(bfm), AnonymousClass002.A0c(bfm), function0, function02), 1076157202), bfm, (iA0d & 896) | 6, 3072, 8178);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, function02, i);
        }
    }
}
