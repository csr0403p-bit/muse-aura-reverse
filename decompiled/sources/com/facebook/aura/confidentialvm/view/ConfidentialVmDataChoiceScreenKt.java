package com.facebook.aura.confidentialvm.view;

import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ConfidentialVmDataChoiceScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceScreenKt$ConfidentialVmDataChoiceScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, C1BO<ConfidentialVmSwitchUiState> c1bo) {
            super(4);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m461invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m461invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (!this.$uiState$delegate.getValue().isLoadingDataMigrationCopy) {
                AnonymousClass003.A0l(bfm, -72396759);
                ConfidentialVmDataChoiceContentKt.m460ConfidentialVmDataChoiceContentvz2T9sI(this.$uiState$delegate.getValue(), this.$viewModel, f, f2, null, bfm, AnonymousClass002.A08(iA04 << 6, ConfidentialVmSwitchUiState.$stable | (ConfidentialVmSwitchViewModel.$stable << 3)), 16);
                return;
            }
            bfm.AgE(-72732148);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            C1062ATq c1062ATq = C10G.A01;
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmDataChoiceScreenKt$ConfidentialVmDataChoiceScreen$3$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0Y(c1062ATq, objAaT, false), bfm, 0, 0);
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceScreenKt$ConfidentialVmDataChoiceScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmDataChoiceScreenKt.ConfidentialVmDataChoiceScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceScreenKt$ConfidentialVmSwitchErrorText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            ConfidentialVmDataChoiceScreenKt.ConfidentialVmSwitchErrorText(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmDataChoiceScreen(X.BRg r45, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceScreenKt.ConfidentialVmDataChoiceScreen(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, X.BFM, int, int):void");
    }

    public static final void ConfidentialVmSwitchErrorText(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-743733495);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19);
            C1822Arm c1822ArmA0S = C06G.A0S(bfm);
            long j = AnonymousClass002.A0c(bfm).destructiveText;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConfidentialVmDataChoiceScreenKt$ConfidentialVmSwitchErrorText$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRg2, (G0U) objAaT, false), j, c1822ArmA0S, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConfidentialVmSwitchUiState access$ConfidentialVmDataChoiceScreen$lambda$0(C1BO c1bo) {
        return (ConfidentialVmSwitchUiState) c1bo.getValue();
    }
}
