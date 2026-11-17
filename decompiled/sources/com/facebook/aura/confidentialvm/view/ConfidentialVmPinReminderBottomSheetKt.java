package com.facebook.aura.confidentialvm.view;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmPinReminderViewModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetStateKt;
import com.facebook.aura.vds.compose.input.AuraCodeInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmPinReminderBottomSheetKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ C1BO<ConfidentialVmPinReminderViewModel.ConfidentialVmPinReminderUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmPinReminderViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraColors auraColors, ConfidentialVmPinReminderViewModel confidentialVmPinReminderViewModel, C1BO<ConfidentialVmPinReminderViewModel.ConfidentialVmPinReminderUiState> c1bo) {
            super(3);
            this.$colors = auraColors;
            this.$viewModel = confidentialVmPinReminderViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            boolean zIsSettled;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, AuraDimensKt.SpacingLarge);
                AuraColors auraColors = this.$colors;
                ConfidentialVmPinReminderViewModel confidentialVmPinReminderViewModel = this.$viewModel;
                C1BO<ConfidentialVmPinReminderViewModel.ConfidentialVmPinReminderUiState> c1bo = this.$uiState$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120795);
                AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
                C1822Arm c1822Arm = AnonymousClass001.A0g(bfm, akh).title3Medium;
                long j = auraColors.primaryText;
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT, false), j, c1822Arm, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14832);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120794), c1062ATq, auraColors.secondaryText, AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                float f = AuraDimensKt.SpacingMedium;
                C01N.A08(bfm, bs0, f);
                String str = c1bo.getValue().pin;
                boolean zA67 = bfm.A67(confidentialVmPinReminderViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == obj) {
                    objAaT2 = new ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$2$1$2$1(confidentialVmPinReminderViewModel);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT2);
                boolean z = c1bo.getValue().isError;
                AuraSheetState auraSheetState = (AuraSheetState) bfm.A6v(AuraSheetStateKt.LocalAuraSheetState);
                if (auraSheetState != null) {
                    zIsSettled = auraSheetState.isSettled();
                } else {
                    zIsSettled = true;
                }
                AuraCodeInputKt.m2586AuraCodeInputOOXMnFM(str, g0u, 6, null, 4.0f, true, z, 3, 0, false, zIsSettled, false, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120783), null, bfm, 12804480, 0, 11016);
                if (c1bo.getValue().isError) {
                    bfm.AgE(13066967);
                    C01N.A08(bfm, bs0, f);
                    String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120796);
                    C1822Arm c1822Arm2 = AnonymousClass001.A0g(bfm, akh).caption1Regular;
                    long j2 = auraColors.destructiveText;
                    Object objAaT3 = bfm.AaT();
                    if (objAaT3 == obj) {
                        objAaT3 = ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$2$1$3$1.INSTANCE;
                        bfm.Ai0(objAaT3);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(strA012, AnonymousClass001.A0Y(c1062ATq, objAaT3, false), j2, c1822Arm2, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                } else {
                    bfm.AgE(13473470);
                }
                BBI.A0R(bbi, false);
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingLargePlusMicro, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinReminderBottomSheetKt$ConfidentialVmPinReminderBottomSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmPinReminderViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, ConfidentialVmPinReminderViewModel confidentialVmPinReminderViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmPinReminderViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmPinReminderBottomSheetKt.ConfidentialVmPinReminderBottomSheet(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmPinReminderBottomSheet(X.BRg r22, com.facebook.aura.confidentialvm.model.ConfidentialVmPinReminderViewModel r23, X.BFM r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmPinReminderBottomSheetKt.ConfidentialVmPinReminderBottomSheet(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmPinReminderViewModel, X.BFM, int, int):void");
    }

    public static final /* synthetic */ ConfidentialVmPinReminderViewModel.ConfidentialVmPinReminderUiState access$ConfidentialVmPinReminderBottomSheet$lambda$0(C1BO c1bo) {
        return (ConfidentialVmPinReminderViewModel.ConfidentialVmPinReminderUiState) c1bo.getValue();
    }
}
