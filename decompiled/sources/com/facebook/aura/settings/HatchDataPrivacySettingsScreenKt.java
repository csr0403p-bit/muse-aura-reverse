package com.facebook.aura.settings;

import X.AKH;
import X.AKL;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C06G;
import X.C06H;
import X.C07C;
import X.C11S;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1BO;
import X.C1DG;
import X.C1OR;
import X.C1YL;
import X.C1er;
import X.C2CK;
import X.C31t;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.settings.HatchDataExportState;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchDataPrivacySettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$AiTrainingHelperText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLocked;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$isLocked = z;
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
            HatchDataPrivacySettingsScreenKt.AiTrainingHelperText(this.$isLocked, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$AiTrainingHelperText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLocked;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$isLocked = z;
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
            HatchDataPrivacySettingsScreenKt.AiTrainingHelperText(this.$isLocked, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$AiTrainingLoadingCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135052(BRg bRg, int i, int i2) {
            super(2);
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
            HatchDataPrivacySettingsScreenKt.AiTrainingLoadingCard(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$AiTrainingObjectionHelperText$2, reason: invalid class name and case insensitive filesystem */
    public final class C135062 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135062(BRg bRg, int i, int i2) {
            super(2);
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
            HatchDataPrivacySettingsScreenKt.AiTrainingObjectionHelperText(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel.AiTrainingUiState $aiTraining;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onEnabledChange;
        public final /* synthetic */ Function0<Unit> $onRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135072(HatchDataPrivacySettingsViewModel.AiTrainingUiState aiTrainingUiState, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$aiTraining = aiTrainingUiState;
            this.$onRefresh = function0;
            this.$onEnabledChange = g0u;
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
            HatchDataPrivacySettingsScreenKt.AiTrainingToggleCard(this.$aiTraining, this.$onRefresh, this.$onEnabledChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel.AiTrainingUiState $aiTraining;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onEnabledChange;
        public final /* synthetic */ Function0<Unit> $onRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(HatchDataPrivacySettingsViewModel.AiTrainingUiState aiTrainingUiState, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$aiTraining = aiTrainingUiState;
            this.$onRefresh = function0;
            this.$onEnabledChange = g0u;
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
            HatchDataPrivacySettingsScreenKt.AiTrainingToggleCard(this.$aiTraining, this.$onRefresh, this.$onEnabledChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$DataExportResultDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C135081 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $dismissText;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135081(String str, Function0<Unit> function0) {
            super(2);
            this.$dismissText = str;
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A65(this.$dismissText));
                String str = this.$dismissText;
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$DataExportResultDialog$1$1$1(str, function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$DataExportResultDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C135092 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $body;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135092(String str, String str2, Function0<Unit> function0, int i) {
            super(2);
            this.$title = str;
            this.$body = str2;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDataPrivacySettingsScreenKt.DataExportResultDialog(this.$title, this.$body, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$DownloadAgentDataConfirmationDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C135101 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135101(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmText))));
                String str = this.$confirmText;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$DownloadAgentDataConfirmationDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$DownloadAgentDataConfirmationDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C135112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135112(Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDataPrivacySettingsScreenKt.DownloadAgentDataConfirmationDialog(this.$onConfirm, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C135121 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isExporting;
        public final /* synthetic */ boolean $isResetting;
        public final /* synthetic */ MutableState<Boolean> $showDownloadDialog$delegate;
        public final /* synthetic */ MutableState<Boolean> $showResetDialog$delegate;
        public final /* synthetic */ C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> $uiState$delegate;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135121(C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> c1bo, HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, boolean z, boolean z2, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(4);
            this.$uiState$delegate = c1bo;
            this.$viewModel = hatchDataPrivacySettingsViewModel;
            this.$isExporting = z;
            this.$isResetting = z2;
            this.$showDownloadDialog$delegate = mutableState;
            this.$showResetDialog$delegate = mutableState2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1948invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1948invokei1RSzL4(float r36, float r37, X.BFM r38, int r39) {
            /*
                Method dump skipped, instructions count: 407
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt.C135121.m1948invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(Function0<Unit> function0, HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
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
            HatchDataPrivacySettingsScreenKt.HatchDataPrivacySettingsScreen(this.$onBack, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$PrivacyNoticeCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135132(BRg bRg, int i, int i2) {
            super(2);
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
            HatchDataPrivacySettingsScreenKt.PrivacyNoticeCard(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$ResetHatchConfirmationBottomSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C135141 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $botName;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135141(String str, Function0<Unit> function0, boolean z) {
            super(3);
            this.$botName = str;
            this.$onConfirm = function0;
            this.$isLoading = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ResetHatchConfirmationSheetKt.ResetHatchConfirmationSheetContent(this.$botName, this.$onConfirm, null, this.$isLoading, bfm, 0, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$ResetHatchConfirmationBottomSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C135152 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $botName;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135152(String str, Function0<Unit> function0, Function0<Unit> function02, boolean z, int i, int i2) {
            super(2);
            this.$botName = str;
            this.$onDismiss = function0;
            this.$onConfirm = function02;
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
            HatchDataPrivacySettingsScreenKt.ResetHatchConfirmationBottomSheet(this.$botName, this.$onDismiss, this.$onConfirm, this.$isLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$ResetHatchErrorDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C135161 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $dismissText;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135161(String str, Function0<Unit> function0) {
            super(2);
            this.$dismissText = str;
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A65(this.$dismissText));
                String str = this.$dismissText;
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$ResetHatchErrorDialog$1$1$1(str, function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$ResetHatchErrorDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C135172 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135172(Function0<Unit> function0, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDataPrivacySettingsScreenKt.ResetHatchErrorDialog(this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$ResetHelperText$2, reason: invalid class name and case insensitive filesystem */
    public final class C135182 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135182(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDataPrivacySettingsScreenKt.ResetHelperText(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$TurnOffAiTrainingConfirmationDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C135191 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135191(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmText))));
                String str = this.$confirmText;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$TurnOffAiTrainingConfirmationDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$TurnOffAiTrainingConfirmationDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C135202 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135202(Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDataPrivacySettingsScreenKt.TurnOffAiTrainingConfirmationDialog(this.$onConfirm, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void AiTrainingHelperText(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        BRg bRg2 = bRg;
        bfm.AgG(-1664471366);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(-868937727);
                AiTrainingObjectionHelperText(bRg2, bfm, (iA0n >> 3) & 14, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(z, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -868869496);
            HatchSettingsDescriptionKt.HatchSettingsDescription(AnonymousClass005.A0X(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1208ab)), bRg2, null, bfm, iA0n & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(z, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass2;
        }
    }

    public static final void ResetHatchErrorDialog(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(519953649);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208c8), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208c6), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C135161(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208c7), function0), 520839808), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A02(iA0T << 18), 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135172(function0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AiTrainingLoadingCard(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(566657135);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208ac);
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            BO6 bo6 = null;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchDataPrivacySettingsScreenKt$AiTrainingLoadingCard$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            long j = 0;
            AuraCardKt.m2484AuraCardjQVUvHA(AnonymousClass001.A0Y(bRgA0R, objAaT, false), SettingsKt.cardStyleForSettings(null, bfm, 0, 1), new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f1208b2), AuraIconAndHeadlineStyle.BODY_REGULAR, bo6, (B6A) (objArr16 == true ? 1 : 0), (ApQ) (objArr15 == true ? 1 : 0), (G0U) (objArr14 == true ? 1 : 0), (AuraIconAndBodyStyle) (objArr13 == true ? 1 : 0), (B6A) (objArr12 == true ? 1 : 0), (String) (objArr11 == true ? 1 : 0), (C1822Arm) (objArr10 == true ? 1 : 0), i4, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (objArr9 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (objArr8 == true ? 1 : 0), (C1822Arm) (objArr7 == true ? 1 : 0), j, j, (C1YL) (objArr6 == true ? 1 : 0), 2097148, (C06H) (objArr5 == true ? 1 : 0)), none, null, ComposableSingletons$HatchDataPrivacySettingsScreenKt.f236lambda$81489604, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 199680, 0, 262096);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135052(bRg2, i, i2);
        }
    }

    public static final void AiTrainingObjectionHelperText(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1820895559);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            long jA07 = C06G.A07(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12043a);
            String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f1208ad);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA0t, strA01) | bfm.A64(jA07);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA0t);
                int iA09 = AnonymousClass007.A09(strA0t, strA01);
                if (iA09 >= 0) {
                    C1736ApY c1736ApY = C1736ApY.A03;
                    long j = C1809ArT.A01;
                    c1731ApSA0X.A0A(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, jA07, j, j, B6A.A07), iA09, strA01.length() + iA09);
                }
                objAaT = c1731ApSA0X.A04();
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchDataPrivacySettingsScreenKt$AiTrainingObjectionHelperText$1$1(contextA0H);
                bfm.Ai0(objAaT2);
            }
            HatchSettingsDescriptionKt.HatchSettingsDescription(apQ, bRg2, (Function0) objAaT2, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135062(bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AiTrainingToggleCard(HatchDataPrivacySettingsViewModel.AiTrainingUiState aiTrainingUiState, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass6;
        BRg bRg2 = bRg;
        bfm.AgG(329024527);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aiTrainingUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            BO6 bo6 = null;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            C1BO c1boA01 = C31t.A01(null, bfm, aiTrainingUiState == null ? 0.0f : 1.0f, 3072, 22);
            Unit unit = Unit.INSTANCE;
            boolean zA1C = AnonymousClass003.A1C(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$1$1(function0);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            if (aiTrainingUiState == null) {
                bfm.AgE(855127796);
                AiTrainingLoadingCard(bRg2, bfm, (iA05 >> 9) & 14, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass6 = new C135072(aiTrainingUiState, function0, g0u, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass6;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 855188339);
            boolean z = aiTrainingUiState.isChecked;
            AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
            BRg bRgA00 = C11S.A00(AnonymousClass001.A0R(bRg2), C1BO.A01(c1boA01));
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f1208b2), AuraIconAndHeadlineStyle.BODY_REGULAR, bo6, (B6A) (objArr16 == true ? 1 : 0), (ApQ) (objArr15 == true ? 1 : 0), (G0U) (objArr14 == true ? 1 : 0), (AuraIconAndBodyStyle) (objArr13 == true ? 1 : 0), (B6A) (objArr12 == true ? 1 : 0), (String) (objArr11 == true ? 1 : 0), (C1822Arm) (objArr10 == true ? 1 : 0), i4, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (objArr9 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (objArr8 == true ? 1 : 0), (C1822Arm) (objArr7 == true ? 1 : 0), j, j, (C1YL) (objArr6 == true ? 1 : 0), 2097148, (C06H) (objArr5 == true ? 1 : 0));
            boolean z2 = !aiTrainingUiState.isLocked;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = iA05 & 896;
            boolean zA66 = bfm.A66(z) | AnonymousClass002.A1Q(i5, 256);
            Object objAaT3 = bfm.AaT();
            if (zA66 || objAaT3 == obj) {
                objAaT3 = new HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$3$1(z, g0u, mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA00, auraCardStyleCardStyleForSettings, auraCardContent, toggle, null, null, null, boolValueOf, (G0U) objAaT3, null, z2, false, null, null, 0L, false, null, null, bfm, 3072, 0, 260720);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(856233597);
                boolean z3 = i5 == 256;
                Object objAaT4 = bfm.AaT();
                if (z3 || objAaT4 == obj) {
                    objAaT4 = new HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$4$1(g0u, mutableState);
                    bfm.Ai0(objAaT4);
                }
                Function0 function02 = (Function0) objAaT4;
                Object objAaT5 = bfm.AaT();
                if (objAaT5 == obj) {
                    objAaT5 = new HatchDataPrivacySettingsScreenKt$AiTrainingToggleCard$5$1(mutableState);
                    bfm.Ai0(objAaT5);
                }
                TurnOffAiTrainingConfirmationDialog(function02, (Function0) objAaT5, bfm, 48);
            } else {
                bfm.AgE(856962035);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(aiTrainingUiState, function0, g0u, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass6;
        }
    }

    public static final void HatchDataPrivacySettingsScreen(Function0<Unit> function0, HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, hatchDataPrivacySettingsViewModel);
        bfm.AgG(-1299386319);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchDataPrivacySettingsViewModel, bfm, i) ? 1 : 0);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, zA1b);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, zA1b);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            C1BO c1boA02 = C2CK.A02(bfm, hatchDataPrivacySettingsViewModel.uiState);
            HatchDataPrivacySettingsViewModel.ResetState resetState = ((HatchDataPrivacySettingsViewModel.DataPrivacyUiState) c1boA02.getValue()).resetState;
            boolean z = resetState instanceof HatchDataPrivacySettingsViewModel.ResetState.Loading;
            HatchDataExportState hatchDataExportState = ((HatchDataPrivacySettingsViewModel.DataPrivacyUiState) c1boA02.getValue()).exportState;
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee7), null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.DATA_CONTROLS), zA1b, B1V.A00(bfm, new C135121(c1boA02, hatchDataPrivacySettingsViewModel, hatchDataExportState instanceof HatchDataExportState.Running, z, mutableState2, mutableState), 1113308918), bfm, AnonymousClass007.A03(iA0T >> 3, iA0T), zA1b ? 1 : 0, C06G.A02(), 402653100);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(529963446);
                String str = ((HatchDataPrivacySettingsViewModel.DataPrivacyUiState) c1boA02.getValue()).botName;
                boolean zA66 = bfm.A66(z);
                Object objAaT2 = bfm.AaT();
                if (zA66 || objAaT2 == obj) {
                    objAaT2 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$2$1(z, mutableState);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) objAaT2;
                i3 = 32;
                boolean zA1S = AnonymousClass001.A1S(bfm, activity, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchDataPrivacySettingsViewModel)));
                Object objAaT3 = bfm.AaT();
                if (zA1S || objAaT3 == obj) {
                    objAaT3 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$3$1(hatchDataPrivacySettingsViewModel, activity);
                    bfm.Ai0(objAaT3);
                }
                ResetHatchConfirmationBottomSheet(str, function02, (Function0) objAaT3, z, bfm, zA1b ? 1 : 0, zA1b ? 1 : 0);
            } else {
                i3 = 32;
                bfm.AgE(530788945);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, zA1b);
            boolean zA67 = bfm.A67(resetState);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$4$1(resetState, mutableState, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, resetState);
            if (resetState instanceof HatchDataPrivacySettingsViewModel.ResetState.Error) {
                bfm.AgE(531164913);
                boolean z2 = (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == i3 || ((iA0T & 64) != 0 && bfm.A67(hatchDataPrivacySettingsViewModel));
                Object objAaT5 = bfm.AaT();
                if (z2 || objAaT5 == obj) {
                    objAaT5 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$5$1(hatchDataPrivacySettingsViewModel);
                    bfm.Ai0(objAaT5);
                }
                ResetHatchErrorDialog((Function0) objAaT5, bfm, zA1b ? 1 : 0);
            } else {
                bfm.AgE(531533937);
            }
            BBI.A0R(bbi, zA1b);
            if (MutableState.A0A(mutableState2)) {
                bfm.AgE(531587505);
                Context contextA0H = AnonymousClass002.A0H(bfm);
                boolean zA1S2 = AnonymousClass001.A1S(bfm, contextA0H, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == i3 || ((iA0T & 64) != 0 && bfm.A67(hatchDataPrivacySettingsViewModel)));
                Object objAaT6 = bfm.AaT();
                if (zA1S2 || objAaT6 == obj) {
                    objAaT6 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$6$1(hatchDataPrivacySettingsViewModel, contextA0H, mutableState2);
                    bfm.Ai0(objAaT6);
                }
                Function0 function03 = (Function0) objAaT6;
                Object objAaT7 = bfm.AaT();
                if (objAaT7 == obj) {
                    objAaT7 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$7$1(mutableState2);
                    bfm.Ai0(objAaT7);
                }
                DownloadAgentDataConfirmationDialog(function03, (Function0) objAaT7, bfm, 48);
            } else {
                bfm.AgE(532387057);
            }
            BBI.A0R(bbi, zA1b);
            if (hatchDataExportState instanceof HatchDataExportState.Error) {
                bfm.AgE(532454637);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b9);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b8);
                boolean z3 = (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == i3 || ((iA0T & 64) != 0 && bfm.A67(hatchDataPrivacySettingsViewModel));
                Object objAaT8 = bfm.AaT();
                if (z3 || objAaT8 == obj) {
                    objAaT8 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$8$1(hatchDataPrivacySettingsViewModel);
                    bfm.Ai0(objAaT8);
                }
                DataExportResultDialog(strA01, strA012, (Function0) objAaT8, bfm, zA1b ? 1 : 0);
            } else {
                bfm.AgE(532981265);
            }
            BBI.A0R(bbi, zA1b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass9(function0, hatchDataPrivacySettingsViewModel, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void PrivacyNoticeCard(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1869178315);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).link;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208bc);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12043a);
            String dataControlsPrivacyUrl = HatchUtil.INSTANCE.getDataControlsPrivacyUrl();
            boolean zA1W = AnonymousClass002.A1W(bfm, dataControlsPrivacyUrl, AnonymousClass003.A1K(bfm, strA01, strA012), bfm.A64(j));
            Object objAaT = bfm.AaT();
            BO6 bo6 = null;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            if (zA1W || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA01);
                c1731ApSA0X.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
                C1736ApY c1736ApY = C1736ApY.A03;
                long j2 = C1809ArT.A01;
                int iA02 = c1731ApSA0X.A02(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, B6A.A07));
                try {
                    int iA03 = c1731ApSA0X.A03(new C1OR(dataControlsPrivacyUrl));
                    try {
                        c1731ApSA0X.A0E(strA012);
                        c1731ApSA0X.A06(iA03);
                        c1731ApSA0X.A06(iA02);
                        objAaT = c1731ApSA0X.A04();
                        bfm.Ai0(objAaT);
                    } catch (Throwable th) {
                        c1731ApSA0X.A06(iA03);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c1731ApSA0X.A06(iA02);
                    throw th2;
                }
            }
            ApQ apQ = (ApQ) objAaT;
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            ApQ apQA0Y = AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f1208bd);
            long jA0L = C06G.A0L(bfm, akh);
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchDataPrivacySettingsScreenKt$PrivacyNoticeCard$1$1(contextA0H);
                bfm.Ai0(objAaT2);
            }
            long j3 = 0;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, new AuraCardContent(apQA0Y, auraIconAndHeadlineStyle, bo6, (B6A) (objArr13 == true ? 1 : 0), apQ, (G0U) objAaT2, (AuraIconAndBodyStyle) (objArr12 == true ? 1 : 0), new B6A(jA0L), (String) (objArr11 == true ? 1 : 0), (C1822Arm) (objArr10 == true ? 1 : 0), i4, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (objArr9 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (objArr8 == true ? 1 : 0), (C1822Arm) (objArr7 == true ? 1 : 0), j3, j3, (C1YL) (objArr6 == true ? 1 : 0), 2096972, (C06H) (objArr5 == true ? 1 : 0)), none, ComposableSingletons$HatchDataPrivacySettingsScreenKt.f233lambda$149179175, null, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27648, 0, 262112);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135132(bRg2, i, i2);
        }
    }

    public static final void ResetHatchConfirmationBottomSheet(String str, Function0<Unit> function0, Function0<Unit> function02, boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        bfm.AgG(-874613339);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                z2 = false;
            }
            MutableState mutableStateA00 = C1er.A00(bfm, Boolean.valueOf(z2));
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchDataPrivacySettingsScreenKt$ResetHatchConfirmationBottomSheet$sheetState$1$1(mutableStateA00);
                bfm.Ai0(objAaT);
            }
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(AuraContainer.SecondaryBottomSheet.INSTANCE, null, function0, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, (G0U) objAaT, false, bfm, 0, 5), null, null, null, null, null, null, false, false, false, B1V.A00(bfm, new C135141(str, function02, z2), -1241118360), bfm, ((iA0d << 3) & 896) | 6, 3072, 8178);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135152(str, function0, function02, z2, i, i2);
        }
    }

    public static final void DataExportResultDialog(String str, String str2, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1898105809);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            int i2 = iA0d << 3;
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, str, str2, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C135081(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b7), function0), 2117441122), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass001.A05(iA0d << 12, (i2 & 896) | (i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608), 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135092(str, str2, function0, i);
        }
    }

    public static final void DownloadAgentDataConfirmationDialog(Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-635977056);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b6), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b5), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C135101(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b4), function0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6), function02), -1306440913), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A02(iA0T << 15), 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135112(function0, function02, i);
        }
    }

    public static final void ResetHelperText(BFM bfm, int i) {
        bfm.AgG(1347169798);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            bfm.A6v(AKL.A00);
            bfm.A6v(AuraColorsKt.LocalAuraColors);
            bfm.AgE(1845026805);
            C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
            c1731ApSA0W.A0E(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1208be));
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 789913578);
            ApQ apQA04 = c1731ApSA0W.A04();
            BBI.A0R(bbiA0M, false);
            bfm.AgE(1362163262);
            BBI.A0R(bbiA0M, false);
            HatchSettingsDescriptionKt.HatchSettingsDescription(apQA04, null, null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135182(i);
        }
    }

    public static final void TurnOffAiTrainingConfirmationDialog(Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(1539973235);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b1), AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1208ae), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C135191(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b0), function0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208af), function02), 869509378), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A02(iA0T << 15), 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135202(function0, function02, i);
        }
    }

    public static final /* synthetic */ HatchDataPrivacySettingsViewModel.DataPrivacyUiState access$HatchDataPrivacySettingsScreen$lambda$6(C1BO c1bo) {
        return (HatchDataPrivacySettingsViewModel.DataPrivacyUiState) c1bo.getValue();
    }
}
