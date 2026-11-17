package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.pause.HatchPauseEnrollmentViewModel;
import com.facebook.aura.pause.HatchPauseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchUnpauseBottomSheetComponentKt {

    /* renamed from: com.facebook.aura.pause.HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
        public final /* synthetic */ String $hatchlingId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str) {
            super(3);
            this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
            this.$hatchlingId = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                boolean zA1S = AnonymousClass001.A1S(bfm, this.$enrollmentViewModel, bfm.A65(this.$hatchlingId));
                String str = this.$hatchlingId;
                HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel = this.$enrollmentViewModel;
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$5$1$1(str, hatchPauseEnrollmentViewModel);
                    bfm.Ai0(objAaT);
                }
                HatchUnpauseBottomSheetContentKt.UnpauseHatchRecoveryKeyPage((G0U) objAaT, null, bfm, 0, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ HatchPauseViewModel $pauseViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Function0<Unit> function0, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, HatchPauseViewModel hatchPauseViewModel, int i, int i2) {
            super(2);
            this.$onDismiss = function0;
            this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
            this.$pauseViewModel = hatchPauseViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchUnpauseBottomSheetComponentKt.HatchUnpauseBottomSheetComponent(this.$onDismiss, this.$enrollmentViewModel, this.$pauseViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchUnpauseBottomSheetComponent(kotlin.jvm.functions.Function0<kotlin.Unit> r30, com.facebook.aura.pause.HatchPauseEnrollmentViewModel r31, com.facebook.aura.pause.HatchPauseViewModel r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchUnpauseBottomSheetComponentKt.HatchUnpauseBottomSheetComponent(kotlin.jvm.functions.Function0, com.facebook.aura.pause.HatchPauseEnrollmentViewModel, com.facebook.aura.pause.HatchPauseViewModel, X.BFM, int, int):void");
    }

    public static final /* synthetic */ HatchPauseViewModel.PauseUiState access$HatchUnpauseBottomSheetComponent$lambda$0(C1BO c1bo) {
        return (HatchPauseViewModel.PauseUiState) c1bo.getValue();
    }

    public static final /* synthetic */ HatchPauseEnrollmentViewModel.DecryptionState access$HatchUnpauseBottomSheetComponent$lambda$1(C1BO c1bo) {
        return (HatchPauseEnrollmentViewModel.DecryptionState) c1bo.getValue();
    }

    public static final /* synthetic */ Boolean access$HatchUnpauseBottomSheetComponent$lambda$3(MutableState mutableState) {
        return (Boolean) mutableState.getValue();
    }
}
