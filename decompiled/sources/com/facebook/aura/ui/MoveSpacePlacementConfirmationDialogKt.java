package com.facebook.aura.ui;

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
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class MoveSpacePlacementConfirmationDialogKt {

    /* renamed from: com.facebook.aura.ui.MoveSpacePlacementConfirmationDialogKt$MoveSpacePlacementConfirmationDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmText = str;
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
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCancel, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmText))));
                String str = this.$confirmText;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onCancel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new MoveSpacePlacementConfirmationDialogKt$MoveSpacePlacementConfirmationDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.MoveSpacePlacementConfirmationDialogKt$MoveSpacePlacementConfirmationDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ ArtifactPlacement $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ArtifactPlacement artifactPlacement, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$placement = artifactPlacement;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$onCancel = function03;
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
            MoveSpacePlacementConfirmationDialogKt.MoveSpacePlacementConfirmationDialog(this.$placement, this.$onConfirm, this.$onDismiss, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArtifactPlacement.values().length];
            try {
                AnonymousClass002.A13(ArtifactPlacement.LIBRARY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ArtifactPlacement.SPACES, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void MoveSpacePlacementConfirmationDialog(ArtifactPlacement artifactPlacement, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(artifactPlacement, 0);
        AnonymousClass005.A11(function0, function02, function03, 1);
        bfm.AgG(1877444360);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, artifactPlacement) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function03);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA08), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            int iOrdinal = artifactPlacement.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string._name_removed__res_0x7f12048a;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string._name_removed__res_0x7f12048d;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            int i5 = R.string._name_removed__res_0x7f120488;
            if (iOrdinal != 0) {
                i5 = R.string._name_removed__res_0x7f12048b;
            }
            String strA012 = AbstractC2271BQs.A01(bfm, i5);
            int i6 = R.string._name_removed__res_0x7f120489;
            if (iOrdinal != 0) {
                i6 = R.string._name_removed__res_0x7f12048c;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, strA01, strA012, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, i6), function0, AnonymousClass001.A0r(bfm), function03), -1005245353), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA08 >> 12) & 14) | 196608 | ((iA08 << 12) & 3670016), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(artifactPlacement, function0, function02, function03, bRg2, i, i2);
        }
    }
}
