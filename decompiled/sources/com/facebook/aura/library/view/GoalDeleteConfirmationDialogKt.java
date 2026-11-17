package com.facebook.aura.library.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class GoalDeleteConfirmationDialogKt {

    /* renamed from: com.facebook.aura.library.view.GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $deleteText;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismissWithLogging;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HatchScreen hatchScreen, String str2, Function0<Unit> function0, String str3, Function0<Unit> function02) {
            super(2);
            this.$deleteText = str;
            this.$screen = hatchScreen;
            this.$goalId = str2;
            this.$onConfirm = function0;
            this.$cancelText = str3;
            this.$onDismissWithLogging = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismissWithLogging, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, AnonymousClass001.A1R(bfm, this.$goalId, AnonymousClass003.A1H(bfm, this.$screen, bfm.A65(this.$deleteText))))));
                String str = this.$deleteText;
                String str2 = this.$cancelText;
                Function0<Unit> function0 = this.$onDismissWithLogging;
                HatchScreen hatchScreen = this.$screen;
                String str3 = this.$goalId;
                Function0<Unit> function02 = this.$onConfirm;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$1$1$1(str, str2, function0, hatchScreen, str3, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ boolean $hasSubGoals;
        public final /* synthetic */ boolean $isSubGoal;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, HatchScreen hatchScreen, String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$isSubGoal = z;
            this.$hasSubGoals = z2;
            this.$screen = hatchScreen;
            this.$goalId = str;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
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
            GoalDeleteConfirmationDialogKt.GoalDeleteConfirmationDialog(this.$isSubGoal, this.$hasSubGoals, this.$screen, this.$goalId, this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void GoalDeleteConfirmationDialog(boolean z, boolean z2, HatchScreen hatchScreen, String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        int i4;
        BRg bRg2 = bRg;
        AnonymousClass005.A16(hatchScreen, str, function0, function02, 2);
        bfm.AgG(-1644470244);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass005.A0A(bfm, hatchScreen);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((i & 196608) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, function02);
        }
        int i5 = i2 & 64;
        int iA0j = 1572864;
        if (i5 != 0) {
            iA0n |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0n |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 599187, 599186), bfm, iA0n)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            if (!z || z2) {
                bfm.AgE(-2015703489);
                i3 = R.string._name_removed__res_0x7f120a60;
            } else {
                bfm.AgE(-2015787561);
                i3 = R.string._name_removed__res_0x7f120a62;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (z2) {
                bfm.AgE(212075838);
                i4 = R.string._name_removed__res_0x7f120a63;
            } else if (z) {
                bfm.AgE(212078648);
                i4 = R.string._name_removed__res_0x7f120a61;
            } else {
                bfm.AgE(212081104);
                i4 = R.string._name_removed__res_0x7f120a5f;
            }
            String strA0s = AnonymousClass001.A0s(bfm, bbi, i4);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a58);
            String strA0r = AnonymousClass001.A0r(bfm);
            boolean zA1M = AnonymousClass004.A1M(iA0n) | AnonymousClass004.A1K(iA0n) | AnonymousClass007.A1H(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new GoalDeleteConfirmationDialogKt$GoalDeleteConfirmationDialog$onDismissWithLogging$1$1(hatchScreen, str, function02);
                bfm.Ai0(objAaT);
            }
            Function0 function03 = (Function0) objAaT;
            AuraAlertDialogKt.AuraAlertDialog(bRg2, strA01, strA0s, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(strA012, hatchScreen, str, function0, strA0r, function03), -813538131), (Function0<Unit>) function03, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0n >> 18) & 14) | 196608, 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, z2, hatchScreen, str, function0, function02, bRg2, i, i2);
        }
    }
}
