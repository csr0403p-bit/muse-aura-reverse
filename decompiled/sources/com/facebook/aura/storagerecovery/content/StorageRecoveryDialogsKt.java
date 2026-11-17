package com.facebook.aura.storagerecovery.content;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.C60Q;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.storagerecovery.StorageRecoveryDialog;
import com.facebook.aura.storagerecovery.StorageRecoveryErrorKind;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class StorageRecoveryDialogsKt {

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryDialogsKt$StorageRecoveryDialogs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ String $deleteLabel;
        public final /* synthetic */ Function0<Unit> $onConfirmDelete;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$deleteLabel = str;
            this.$onConfirmDelete = function0;
            this.$cancelLabel = str2;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1R(bfm, this.$onConfirmDelete, bfm.A65(this.$deleteLabel))));
                String str = this.$deleteLabel;
                Function0<Unit> function0 = this.$onConfirmDelete;
                String str2 = this.$cancelLabel;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new StorageRecoveryDialogsKt$StorageRecoveryDialogs$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryDialogsKt$StorageRecoveryDialogs$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ StorageRecoveryDialog $dialog;
        public final /* synthetic */ String $okLabel;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ String $retryLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StorageRecoveryDialog storageRecoveryDialog, String str, Function0<Unit> function0, String str2, Function0<Unit> function02, String str3) {
            super(2);
            this.$dialog = storageRecoveryDialog;
            this.$retryLabel = str;
            this.$onRetry = function0;
            this.$cancelLabel = str2;
            this.$onDismiss = function02;
            this.$okLabel = str3;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (!((StorageRecoveryDialog.Error) this.$dialog).retry) {
                bfm.AgE(-1051969663);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A65(this.$okLabel));
                String str = this.$okLabel;
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new StorageRecoveryDialogsKt$StorageRecoveryDialogs$2$2$1(str, function0);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.AgE(-1052325388);
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1R(bfm, this.$onRetry, bfm.A65(this.$retryLabel))));
            String str2 = this.$retryLabel;
            Function0<Unit> function02 = this.$onRetry;
            String str3 = this.$cancelLabel;
            Function0<Unit> function03 = this.$onDismiss;
            Object objAaT2 = bfm.AaT();
            if (zA1R2 || objAaT2 == C78N.A00) {
                objAaT2 = new StorageRecoveryDialogsKt$StorageRecoveryDialogs$2$1$1(str2, function02, str3, function03);
                bfm.Ai0(objAaT2);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT2, bfm, 0, 255);
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryDialogsKt$StorageRecoveryDialogs$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ StorageRecoveryDialog $dialog;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirmDelete;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(StorageRecoveryDialog storageRecoveryDialog, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$dialog = storageRecoveryDialog;
            this.$onDismiss = function0;
            this.$onConfirmDelete = function02;
            this.$onRetry = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryDialogsKt.StorageRecoveryDialogs(this.$dialog, this.$onDismiss, this.$onConfirmDelete, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StorageRecoveryErrorKind.values().length];
            try {
                AnonymousClass002.A13(StorageRecoveryErrorKind.REQUEST_FAILED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(StorageRecoveryErrorKind.DELETE_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(StorageRecoveryErrorKind.SELECTION_EXPIRED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(StorageRecoveryErrorKind.PARTIAL_DELETE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void StorageRecoveryDialogs(StorageRecoveryDialog storageRecoveryDialog, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A11(function0, function02, function03, 1);
        bfm.AgG(-219121832);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(storageRecoveryDialog, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function03);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12107a);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12107b);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121092);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121089);
            if (storageRecoveryDialog == null) {
                bfm.AgE(-122666532);
            } else if (storageRecoveryDialog instanceof StorageRecoveryDialog.ConfirmDelete) {
                bfm.AgE(492385065);
                StorageRecoveryDialog.ConfirmDelete confirmDelete = (StorageRecoveryDialog.ConfirmDelete) storageRecoveryDialog;
                AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f10003f, new Object[]{C60Q.A0W(confirmDelete.entries)}, bfm, confirmDelete.entries.size()), (String) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(strA012, function02, strA01, function0), -881332598), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA05 >> 12) & 14) | 196608 | ((iA05 << 15) & 3670016), 0, 1948);
            } else {
                if (!(storageRecoveryDialog instanceof StorageRecoveryDialog.Error)) {
                    throw AnonymousClass005.A0k(bfm, -122665711);
                }
                bfm.AgE(493136412);
                StorageRecoveryDialog.Error error = (StorageRecoveryDialog.Error) storageRecoveryDialog;
                AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, titleRes(error.kind)), AbstractC2271BQs.A01(bfm, bodyRes(error.kind)), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass2(storageRecoveryDialog, strA013, function03, strA01, function0, strA014), -578445207), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA05 >> 12) & 14) | 196608 | ((iA05 << 15) & 3670016), 0, 1944);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(storageRecoveryDialog, function0, function02, function03, bRg2, i, i2);
        }
    }

    public static final int bodyRes(StorageRecoveryErrorKind storageRecoveryErrorKind) {
        int iOrdinal = storageRecoveryErrorKind.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return R.string._name_removed__res_0x7f121090;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f121097;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f12108c;
        }
        throw C3cG.A0q();
    }

    public static final int titleRes(StorageRecoveryErrorKind storageRecoveryErrorKind) {
        int iOrdinal = storageRecoveryErrorKind.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f121091;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f12107c;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f121098;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f12108d;
        }
        throw C3cG.A0q();
    }
}
