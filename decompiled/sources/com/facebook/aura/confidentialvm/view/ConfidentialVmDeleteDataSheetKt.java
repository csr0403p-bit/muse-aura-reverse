package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmDeleteDataSheetKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isDeleting;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, C1BO<ConfidentialVmSwitchUiState> c1bo, boolean z, AuraNavigator auraNavigator) {
            super(2);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$uiState$delegate = c1bo;
            this.$isDeleting = z;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1S(bfm, this.$viewModel, AnonymousClass001.A1U(bfm, this.$isDeleting, bfm.A65(this.$uiState$delegate))));
                boolean z = this.$isDeleting;
                ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
                C1BO<ConfidentialVmSwitchUiState> c1bo = this.$uiState$delegate;
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$1$1$1(z, confidentialVmSwitchViewModel, c1bo, auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel $dataPrivacyViewModel;
        public final /* synthetic */ boolean $isDeleting;
        public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, boolean z, Context context, C1BO<ConfidentialVmSwitchUiState> c1bo) {
            super(3);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$dataPrivacyViewModel = hatchDataPrivacySettingsViewModel;
            this.$isDeleting = z;
            this.$context = context;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingLarge;
                float f2 = AuraDimensKt.SpacingXHugePlus;
                float f3 = AuraDimensKt.SpacingMedium;
                BRg bRgA0C = C3U4.A0C(c1062ATq, f, 0.0f, f, f2 + f3);
                C9m9 c9m9A00 = AcQ.A00(f3);
                ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
                HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel = this.$dataPrivacyViewModel;
                boolean z = this.$isDeleting;
                Context context = this.$context;
                C1BO<ConfidentialVmSwitchUiState> c1bo = this.$uiState$delegate;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                C90l c90l = C90l.A00;
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120742), null, C06G.A0C(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                boolean zA1V = AnonymousClass005.A1V(bfm, confidentialVmSwitchViewModel, hatchDataPrivacySettingsViewModel, context, bfm.A66(z));
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$3$1$1$1(z, confidentialVmSwitchViewModel, hatchDataPrivacySettingsViewModel, context);
                    bfm.Ai0(objAaT);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
                if (c1bo.getValue().hasError) {
                    bfm.AgE(-1677360136);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19), null, AnonymousClass002.A0c(bfm).destructiveText, C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                } else {
                    bfm.AgE(-1677150390);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDataPrivacySettingsViewModel $dataPrivacyViewModel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$dataPrivacyViewModel = hatchDataPrivacySettingsViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmDeleteDataSheetKt.ConfidentialVmDeleteDataSheet(this.$modifier, this.$viewModel, this.$dataPrivacyViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmDeleteDataSheet(X.BRg r22, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r23, com.facebook.aura.settings.HatchDataPrivacySettingsViewModel r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmDeleteDataSheetKt.ConfidentialVmDeleteDataSheet(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, com.facebook.aura.settings.HatchDataPrivacySettingsViewModel, X.BFM, int, int):void");
    }

    public static final /* synthetic */ ConfidentialVmSwitchUiState access$ConfidentialVmDeleteDataSheet$lambda$0(C1BO c1bo) {
        return (ConfidentialVmSwitchUiState) c1bo.getValue();
    }
}
