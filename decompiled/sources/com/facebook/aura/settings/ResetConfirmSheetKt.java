package com.facebook.aura.settings;

import X.AKL;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C07C;
import X.C0861A6i;
import X.C1BO;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import X.InterfaceC7353EnQ;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ResetConfirmSheetKt {

    /* renamed from: com.facebook.aura.settings.ResetConfirmSheetKt$ResetConfirmSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Activity $activity;
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ String $confirmWord;
        public final /* synthetic */ MutableState<String> $enteredText$delegate;
        public final /* synthetic */ String $instruction;
        public final /* synthetic */ MutableState<Boolean> $isExitLogged$delegate;
        public final /* synthetic */ boolean $isPreview;
        public final /* synthetic */ boolean $isResetting;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ HatchSurface $surface;
        public final /* synthetic */ AuraTypography $typography;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraTypography auraTypography, AuraColors auraColors, HatchSurface hatchSurface, String str, boolean z, String str2, boolean z2, AuraNavigator auraNavigator, HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, Activity activity, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
            super(3);
            this.$typography = auraTypography;
            this.$colors = auraColors;
            this.$surface = hatchSurface;
            this.$instruction = str;
            this.$isResetting = z;
            this.$confirmWord = str2;
            this.$isPreview = z2;
            this.$navigator = auraNavigator;
            this.$viewModel = hatchDataPrivacySettingsViewModel;
            this.$activity = activity;
            this.$enteredText$delegate = mutableState;
            this.$isExitLogged$delegate = mutableState2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x017e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r78, X.BFM r79, int r80) {
            /*
                Method dump skipped, instructions count: 602
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.ResetConfirmSheetKt.AnonymousClass2.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.ResetConfirmSheetKt$ResetConfirmSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isPreview;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchSurface hatchSurface, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$surface = hatchSurface;
            this.$modifier = bRg;
            this.$isPreview = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ResetConfirmSheetKt.ResetConfirmSheet(this.$surface, this.$modifier, this.$isPreview, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ResetConfirmSheet(HatchSurface hatchSurface, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchSurface, 0);
        bfm.AgG(-152169909);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSurface) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            HatchDataPrivacySettingsViewModel.Factory factory = new HatchDataPrivacySettingsViewModel.Factory(abstractC3358CGzA0h);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel = (HatchDataPrivacySettingsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchDataPrivacySettingsViewModel.class));
            HatchDataPrivacySettingsViewModel.ResetState resetState = ((HatchDataPrivacySettingsViewModel.DataPrivacyUiState) C1BO.A07(bfm, hatchDataPrivacySettingsViewModel.uiState)).resetState;
            boolean z3 = resetState instanceof HatchDataPrivacySettingsViewModel.ResetState.Loading;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState = (MutableState) objAaT;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e7b);
            String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f120e79);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            boolean zA67 = bfm.A67(hatchDataPrivacySettingsViewModel) | AnonymousClass004.A1F(iA08);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new ResetConfirmSheetKt$ResetConfirmSheet$1$1(hatchDataPrivacySettingsViewModel, hatchSurface, mutableState2);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, hatchSurface);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, null, null, null, null, !z3, false, false, null, B1V.A00(bfm, new AnonymousClass2(auraTypographyA0f, auraColorsA0c, hatchSurface, strA0t, z3, strA01, z2, auraNavigatorA0b, hatchDataPrivacySettingsViewModel, activity, mutableState, mutableState2), 1387988232), bfm, (iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 1916);
            if (resetState instanceof HatchDataPrivacySettingsViewModel.ResetState.Error) {
                boolean zA1Z = AnonymousClass001.A1Z(hatchDataPrivacySettingsViewModel, bfm, -2098343277);
                Object objAaT3 = bfm.AaT();
                if (zA1Z || objAaT3 == obj) {
                    objAaT3 = new ResetConfirmSheetKt$ResetConfirmSheet$3$1(hatchDataPrivacySettingsViewModel);
                    bfm.Ai0(objAaT3);
                }
                HatchDataPrivacySettingsScreenKt.ResetHatchErrorDialog((Function0) ((InterfaceC7353EnQ) objAaT3), bfm, 0);
            } else {
                bfm.AgE(-2098277929);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(hatchSurface, bRg2, z2, i, i2);
        }
    }

    public static final void logDismiss(HatchSurface hatchSurface, HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logDismiss(hatchSurface, null, HatchScreen.RESET_CONFIRMATION_SHEET, hatchComponent, null, null);
    }
}
