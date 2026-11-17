package com.facebook.aura.pause;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C07C;
import X.C0fG;
import X.C10G;
import X.C1822Arm;
import X.C3U4;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.pause.HatchPauseViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPauseBottomSheetContentKt {

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$HatchPauseErrorDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $okText;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0) {
            super(2);
            this.$okText = str;
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A65(this.$okText));
                String str = this.$okText;
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchPauseBottomSheetContentKt$HatchPauseErrorDialog$1$1$1(str, function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$HatchPauseErrorDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchPauseViewModel.PauseErrorDialog $error;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchPauseViewModel.PauseErrorDialog pauseErrorDialog, Function0<Unit> function0, int i) {
            super(2);
            this.$error = pauseErrorDialog;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPauseBottomSheetContentKt.HatchPauseErrorDialog(this.$error, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchConfirmDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C133961 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ boolean $isPausing;
        public final /* synthetic */ String $lockText;
        public final /* synthetic */ Function0<Unit> $onConfirmPause;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133961(boolean z, String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$isPausing = z;
            this.$lockText = str;
            this.$onConfirmPause = function0;
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
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirmPause, AnonymousClass001.A1R(bfm, this.$lockText, bfm.A66(this.$isPausing)))));
                boolean z = this.$isPausing;
                String str = this.$lockText;
                Function0<Unit> function0 = this.$onConfirmPause;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchPauseBottomSheetContentKt$PauseHatchConfirmDialog$1$1$1(z, str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchConfirmDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isPausing;
        public final /* synthetic */ Function0<Unit> $onConfirmPause;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, Function0<Unit> function02, boolean z, int i, int i2) {
            super(2);
            this.$onDismiss = function0;
            this.$onConfirmPause = function02;
            this.$isPausing = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPauseBottomSheetContentKt.PauseHatchConfirmDialog(this.$onDismiss, this.$onConfirmPause, this.$isPausing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchOverviewPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C133971 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133971(Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$onContinue = function0;
            this.$onCancel = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BRg bRgA0B = C3U4.A0B(C3U4.A0C(BRg.A00, 0.0f, AuraDimensKt.SpacingXlarge, 0.0f, 0.0f), AuraDimensKt.SpacingLarge, 0.0f);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCancel, bfm.A65(this.$onContinue));
                Function0<Unit> function0 = this.$onContinue;
                Function0<Unit> function02 = this.$onCancel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchPauseBottomSheetContentKt$PauseHatchOverviewPage$1$1$1(function0, function02);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bRgA0B, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 126);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchOverviewPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C133982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133982(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onContinue = function0;
            this.$onCancel = function02;
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
            HatchPauseBottomSheetContentKt.PauseHatchOverviewPage(this.$onContinue, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchSaveRecoveryKeyPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C133991 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C0fG $clipboardManager;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onCopyKey;
        public final /* synthetic */ String $recoveryKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133991(C0fG c0fG, String str, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$clipboardManager = c0fG;
            this.$recoveryKey = str;
            this.$onCopyKey = function0;
            this.$onContinue = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BRg bRgA0B = C3U4.A0B(C3U4.A0C(BRg.A00, 0.0f, AuraDimensKt.SpacingXlarge, 0.0f, 0.0f), AuraDimensKt.SpacingLarge, 0.0f);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onContinue, AnonymousClass001.A1R(bfm, this.$onCopyKey, AnonymousClass001.A1R(bfm, this.$recoveryKey, bfm.A67(this.$clipboardManager))));
                Function0<Unit> function0 = this.$onContinue;
                C0fG c0fG = this.$clipboardManager;
                String str = this.$recoveryKey;
                Function0<Unit> function02 = this.$onCopyKey;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchPauseBottomSheetContentKt$PauseHatchSaveRecoveryKeyPage$1$1$1(function0, c0fG, str, function02);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bRgA0B, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 126);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchSaveRecoveryKeyPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C134002 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $recoveryKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134002(String str) {
            super(3);
            this.$recoveryKey = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f2f);
                C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Medium;
                long jA0C = C06G.A0C(bfm);
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingLarge;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(bs0, f, 0.0f), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f2b);
                C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
                AuraTextKt.m2639AuraTextUY9GdpU(strA0v, C3U4.A0B(bs0, f, 0.0f), C06G.A0C(bfm), c1822ArmA0Z, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                C1822Arm c1822ArmA00 = C1822Arm.A00(null, AnonymousClass002.A0f(bfm).monoRegular, null, null, null, null, null, null, null, null, 3, 0, 0, 16744447, 0L, 0L, 0L, 0L);
                BRg bRgA0B = C3U4.A0B(C10G.A02, f, 0.0f);
                String str = this.$recoveryKey;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchPauseBottomSheetContentKt$PauseHatchSaveRecoveryKeyPage$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextInputKt.AuraTextInput(str, null, bRgA0B, null, null, null, null, c1822ArmA00, false, 0, 0, null, null, null, null, false, true, false, false, null, (G0U) objAaT, bfm, 100663296, 1572864, 6, 982650);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchSaveRecoveryKeyPage$3, reason: invalid class name and case insensitive filesystem */
    public final class C134013 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onCopyKey;
        public final /* synthetic */ String $recoveryKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134013(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$recoveryKey = str;
            this.$onCopyKey = function0;
            this.$onContinue = function02;
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
            HatchPauseBottomSheetContentKt.PauseHatchSaveRecoveryKeyPage(this.$recoveryKey, this.$onCopyKey, this.$onContinue, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchSetupRecoveryKeyBiometricsPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C134021 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onNext;
        public final /* synthetic */ Function0<Unit> $onSkip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134021(Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$onNext = function0;
            this.$onSkip = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BRg bRgA0B = C3U4.A0B(C3U4.A0C(BRg.A00, 0.0f, AuraDimensKt.SpacingXlarge, 0.0f, 0.0f), AuraDimensKt.SpacingLarge, 0.0f);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onSkip, bfm.A65(this.$onNext));
                Function0<Unit> function0 = this.$onNext;
                Function0<Unit> function02 = this.$onSkip;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchPauseBottomSheetContentKt$PauseHatchSetupRecoveryKeyBiometricsPage$1$1$1(function0, function02);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bRgA0B, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 126);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchSetupRecoveryKeyBiometricsPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C134032 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onNext;
        public final /* synthetic */ Function0<Unit> $onSkip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134032(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onNext = function0;
            this.$onSkip = function02;
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
            HatchPauseBottomSheetContentKt.PauseHatchSetupRecoveryKeyBiometricsPage(this.$onNext, this.$onSkip, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchPauseErrorDialog(HatchPauseViewModel.PauseErrorDialog pauseErrorDialog, Function0<Unit> function0, BFM bfm, int i) {
        int i2;
        boolean zA1b = AnonymousClass004.A1b(pauseErrorDialog, function0);
        bfm.AgG(-499203591);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(AnonymousClass004.A1X(pauseErrorDialog, bfm, i) ? 1 : 0) : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (pauseErrorDialog.equals(HatchPauseViewModel.PauseErrorDialog.LockFailed.INSTANCE)) {
                i2 = R.string._name_removed__res_0x7f120f28;
            } else {
                if (!pauseErrorDialog.equals(HatchPauseViewModel.PauseErrorDialog.UnlockFailed.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string._name_removed__res_0x7f120f2a;
            }
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AnonymousClass006.A0v(bfm, i2), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f27), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f29), function0), -2074253048), function0, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A02(iA05 << 15), zA1b ? 1 : 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(pauseErrorDialog, function0, i);
        }
    }

    public static final void PauseHatchConfirmDialog(Function0<Unit> function0, Function0<Unit> function02, boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        boolean zA1b = AnonymousClass004.A1b(function0, function02);
        bfm.AgG(1851663871);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                z2 = false;
            }
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f26);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f24);
            B1U b1uA00 = B1V.A00(bfm, new C133961(z2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f25), function02, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6), function0), 2070999184);
            boolean zA1D = AnonymousClass003.A1D(iA0T) | AnonymousClass001.A1L(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new HatchPauseBottomSheetContentKt$PauseHatchConfirmDialog$2$1(z2, function0);
                bfm.Ai0(objAaT);
            }
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA0v, strA01, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, b1uA00, (Function0<Unit>) objAaT, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, 196608, zA1b ? 1 : 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, function02, z2, i, i2);
        }
    }

    public static final void PauseHatchOverviewPage(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, function02);
        bfm.AgG(-1460122882);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, B1V.A00(bfm, new C133971(function0, function02), -984128393), null, function02, zA1b, zA1b, zA1b, null, ComposableSingletons$HatchPauseBottomSheetContentKt.f224lambda$1515845061, bfm, AnonymousClass001.A05(iA0T << 15, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND), 48, 1965);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C133982(function0, function02, bRg2, i, i2);
        }
    }

    public static final void PauseHatchSaveRecoveryKeyPage(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(str, function0, function02);
        bfm.AgG(-2054761043);
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
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, null, B1V.A00(bfm, new C133991((C0fG) bfm.A6v(Am0.A02), str, function0, function02), -172267674), null, null, false, false, false, null, B1V.A00(bfm, new C134002(str), 1828890154), bfm, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 24582, 48, 2028);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134013(str, function0, function02, bRg2, i, i2);
        }
    }

    public static final void PauseHatchSetupRecoveryKeyBiometricsPage(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, function02);
        bfm.AgG(-592906961);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, B1V.A00(bfm, new C134021(function0, function02), 408683112), null, null, zA1b, zA1b, zA1b, null, ComposableSingletons$HatchPauseBottomSheetContentKt.lambda$144588588, bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND, 48, 2029);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134032(function0, function02, bRg2, i, i2);
        }
    }
}
