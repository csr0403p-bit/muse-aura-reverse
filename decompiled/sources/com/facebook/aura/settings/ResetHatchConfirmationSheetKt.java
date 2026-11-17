package com.facebook.aura.settings;

import X.AKL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import android.app.Activity;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ResetHatchConfirmationSheetKt {

    /* renamed from: com.facebook.aura.settings.ResetHatchConfirmationSheetKt$ResetHatchConfirmationSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Activity $activity;
        public final /* synthetic */ boolean $isResetting;
        public final /* synthetic */ C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> $uiState$delegate;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, Activity activity, boolean z, C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> c1bo) {
            super(3);
            this.$viewModel = hatchDataPrivacySettingsViewModel;
            this.$activity = activity;
            this.$isResetting = z;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                String str = this.$uiState$delegate.getValue().botName;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$activity, bfm.A67(this.$viewModel));
                HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel = this.$viewModel;
                Activity activity = this.$activity;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new ResetHatchConfirmationSheetKt$ResetHatchConfirmationSheet$1$1$1(hatchDataPrivacySettingsViewModel, activity);
                    bfm.Ai0(objAaT);
                }
                ResetHatchConfirmationSheetKt.ResetHatchConfirmationSheetContent(str, (Function0) objAaT, null, this.$isResetting, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.ResetHatchConfirmationSheetKt$ResetHatchConfirmationSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchDataPrivacySettingsViewModel;
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
            ResetHatchConfirmationSheetKt.ResetHatchConfirmationSheet(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.ResetHatchConfirmationSheetKt$ResetHatchConfirmationSheetContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $botName;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$botName = str;
            this.$onConfirm = function0;
            this.$modifier = bRg;
            this.$isLoading = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ResetHatchConfirmationSheetKt.ResetHatchConfirmationSheetContent(this.$botName, this.$onConfirm, this.$modifier, this.$isLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ResetHatchConfirmationSheet(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchDataPrivacySettingsViewModel, 0);
        bfm.AgG(1789319315);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(AnonymousClass004.A1X(hatchDataPrivacySettingsViewModel, bfm, i) ? 1 : 0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            C1BO c1boA02 = C2CK.A02(bfm, hatchDataPrivacySettingsViewModel.uiState);
            HatchDataPrivacySettingsViewModel.ResetState resetState = ((HatchDataPrivacySettingsViewModel.DataPrivacyUiState) c1boA02.getValue()).resetState;
            boolean z = resetState instanceof HatchDataPrivacySettingsViewModel.ResetState.Loading;
            boolean z2 = false;
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, null, null, null, null, !z, false, false, null, B1V.A00(bfm, new AnonymousClass1(hatchDataPrivacySettingsViewModel, activity, z, c1boA02), -533466762), bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 1916);
            if (resetState instanceof HatchDataPrivacySettingsViewModel.ResetState.Error) {
                bfm.AgE(773325958);
                if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchDataPrivacySettingsViewModel))) {
                    z2 = true;
                }
                Object objAaT = bfm.AaT();
                if (z2 || objAaT == C78N.A00) {
                    objAaT = new ResetHatchConfirmationSheetKt$ResetHatchConfirmationSheet$2$1(hatchDataPrivacySettingsViewModel);
                    bfm.Ai0(objAaT);
                }
                HatchDataPrivacySettingsScreenKt.ResetHatchErrorDialog((Function0) objAaT, bfm, 0);
            } else {
                bfm.AgE(773396111);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchDataPrivacySettingsViewModel, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ResetHatchConfirmationSheetContent(java.lang.String r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, X.BRg r68, boolean r69, X.BFM r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.ResetHatchConfirmationSheetKt.ResetHatchConfirmationSheetContent(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, boolean, X.BFM, int, int):void");
    }

    public static final /* synthetic */ HatchDataPrivacySettingsViewModel.DataPrivacyUiState access$ResetHatchConfirmationSheet$lambda$0(C1BO c1bo) {
        return (HatchDataPrivacySettingsViewModel.DataPrivacyUiState) c1bo.getValue();
    }
}
