package com.facebook.aura.bugreport;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06H;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ShakeToReportBottomSheetKt {

    /* renamed from: com.facebook.aura.bugreport.ShakeToReportBottomSheetKt$ShakeToReportBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ Function0<Unit> $onSubmitReport;
        public final /* synthetic */ SharedPreferences $prefs;
        public final /* synthetic */ MutableState<Boolean> $shakeToReportEnabled$delegate;
        public final /* synthetic */ AuraTypography $typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraTypography auraTypography, AuraColors auraColors, SharedPreferences sharedPreferences, Function0<Unit> function0, MutableState<Boolean> mutableState) {
            super(3);
            this.$typography = auraTypography;
            this.$colors = auraColors;
            this.$prefs = sharedPreferences;
            this.$onSubmitReport = function0;
            this.$shakeToReportEnabled$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, 24.0f);
                AuraTypography auraTypography = this.$typography;
                AuraColors auraColors = this.$colors;
                SharedPreferences sharedPreferences = this.$prefs;
                Function0<Unit> function0 = this.$onSubmitReport;
                MutableState<Boolean> mutableState = this.$shakeToReportEnabled$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C01N.A08(bfm, bs0, 16.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb1), null, auraColors.primaryText, auraTypography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 8.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120bb0), null, auraColors.secondaryText, auraTypography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 12.0f);
                AuraDividerKt.AuraRowDivider(null, bfm, 0, 1);
                C01N.A08(bfm, bs0, 12.0f);
                AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
                long j = 0;
                AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(null, 0L, null, bfm, 3072, 7);
                ApQ apQA0Y = AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120bb3);
                Object[] objArr5 = objArr4 == true ? 1 : 0;
                Object[] objArr6 = objArr3 == true ? 1 : 0;
                Object[] objArr7 = objArr2 == true ? 1 : 0;
                Object[] objArr8 = objArr == true ? 1 : 0;
                AuraCardContent auraCardContent = new AuraCardContent(apQA0Y, (AuraIconAndHeadlineStyle) null, (BO6) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097150, (C06H) (0 == true ? 1 : 0));
                Boolean boolValueOf = Boolean.valueOf(MutableState.A0A((MutableState) mutableState));
                boolean zA67 = bfm.A67(sharedPreferences);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ShakeToReportBottomSheetKt$ShakeToReportBottomSheet$2$1$1$1(sharedPreferences, mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleM2500listoAWOtXo, auraCardContent, toggle, null, null, null, boolValueOf, (G0U) objAaT, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 261744);
                C01N.A08(bfm, bs0, 12.0f);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb2);
                AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = AuraButtonStyles.INSTANCE.primaryAlt(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                boolean zA65 = bfm.A65(function0);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new ShakeToReportBottomSheetKt$ShakeToReportBottomSheet$2$1$2$1(function0);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                C01N.A04(bfm, bbi, bs0, 24.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.bugreport.ShakeToReportBottomSheetKt$ShakeToReportBottomSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSubmitReport;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onSubmitReport = function0;
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
            ShakeToReportBottomSheetKt.ShakeToReportBottomSheet(this.$onSubmitReport, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ShakeToReportBottomSheet(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(1784157959);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = contextA0H.getSharedPreferences(AuraRageShakeManager.PREFS_NAME, 0);
                bfm.Ai0(objAaT);
            }
            SharedPreferences sharedPreferences = (SharedPreferences) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass005.A0S(bfm, sharedPreferences.getBoolean(AuraRageShakeManager.PREF_KEY_ENABLED, true));
            }
            MutableState mutableState = (MutableState) objAaT2;
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new ShakeToReportBottomSheetKt$ShakeToReportBottomSheet$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRg2, null, null, null, null, (Function0) objAaT3, false, false, false, null, B1V.A00(bfm, new AnonymousClass2(auraTypographyA0f, auraColorsA0c, sharedPreferences, function0, mutableState), 1556308804), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 1980);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, bRg2, i, i2);
        }
    }
}
