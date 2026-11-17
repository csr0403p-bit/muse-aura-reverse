package com.facebook.aura.ui;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class DeleteSpaceConfirmationDialogKt {

    /* renamed from: com.facebook.aura.ui.DeleteSpaceConfirmationDialogKt$DeleteSpaceConfirmationDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $deleteText;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$deleteText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onCancel = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCancel, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$deleteText))));
                String str = this.$deleteText;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onCancel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new DeleteSpaceConfirmationDialogKt$DeleteSpaceConfirmationDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.DeleteSpaceConfirmationDialogKt$DeleteSpaceConfirmationDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$onCancel = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DeleteSpaceConfirmationDialogKt.DeleteSpaceConfirmationDialog(this.$onConfirm, this.$onDismiss, this.$onCancel, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void DeleteSpaceConfirmationDialog(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        AnonymousClass005.A10(function0, function02, function03);
        bfm.AgG(412553626);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fd5), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fd4), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fd3), function0, AnonymousClass001.A0r(bfm), function03), 827452267), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A02(iA0T << 15), 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, function03, i);
        }
    }
}
