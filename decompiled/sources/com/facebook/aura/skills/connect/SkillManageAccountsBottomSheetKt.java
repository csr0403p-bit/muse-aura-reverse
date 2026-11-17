package com.facebook.aura.skills.connect;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SkillManageAccountsBottomSheetKt {

    /* renamed from: com.facebook.aura.skills.connect.SkillManageAccountsBottomSheetKt$ManageAccountsEmptyRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SkillManageAccountsBottomSheetKt.ManageAccountsEmptyRow(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<SkillAccountsUiState> $uiState$delegate;
        public final /* synthetic */ SkillLinkedAccountsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, AuraNavigator auraNavigator, C1BO<SkillAccountsUiState> c1bo) {
            super(2);
            this.$viewModel = skillLinkedAccountsViewModel;
            this.$navigator = auraNavigator;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, AuraDimensKt.SpacingLarge, 0.0f, 0.0f);
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
                SkillLinkedAccountsViewModel skillLinkedAccountsViewModel = this.$viewModel;
                AuraNavigator auraNavigator = this.$navigator;
                C1BO<SkillAccountsUiState> c1bo = this.$uiState$delegate;
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
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b78);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
                boolean canUpdateAccountSelection = c1bo.getValue().getCanUpdateAccountSelection();
                boolean z = c1bo.getValue().isUpdating;
                boolean zA1M = AnonymousClass003.A1M(bfm, skillLinkedAccountsViewModel, auraNavigator);
                Object objAaT = bfm.AaT();
                if (zA1M || objAaT == C78N.A00) {
                    objAaT = new SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$2$1$1$1(skillLinkedAccountsViewModel, auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0B, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, canUpdateAccountSelection, z, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134199749);
                String strA0r = AnonymousClass001.A0r(bfm);
                AuraLabelButtonStyle auraLabelButtonStyleTertiary = auraButtonStyles.tertiary(null, bfm, 48, 1);
                BRg bRgA0B2 = C3U4.A0B(c1062ATq, AuraDimensKt.SpacingLargePlusMicro, 0.0f);
                boolean zA1M2 = AnonymousClass003.A1M(bfm, skillLinkedAccountsViewModel, auraNavigator);
                Object objAaT2 = bfm.AaT();
                if (zA1M2 || objAaT2 == C78N.A00) {
                    objAaT2 = new SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$2$1$2$1(skillLinkedAccountsViewModel, auraNavigator);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0r, null, bRgA0B2, auraLabelButtonStyleTertiary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<SkillAccountsUiState> $uiState$delegate;
        public final /* synthetic */ SkillLinkedAccountsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C1BO<SkillAccountsUiState> c1bo, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel) {
            super(3);
            this.$uiState$delegate = c1bo;
            this.$viewModel = skillLinkedAccountsViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA07 = C3U4.A07(C10G.A02, AuraDimensKt.SpacingLargePlusMicro);
                C1BO<SkillAccountsUiState> c1bo = this.$uiState$delegate;
                SkillLinkedAccountsViewModel skillLinkedAccountsViewModel = this.$viewModel;
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
                C90l c90l = C90l.A00;
                boolean zA1J = AnonymousClass003.A1J(bfm, c1bo, skillLinkedAccountsViewModel);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$3$1$1$1(c1bo, skillLinkedAccountsViewModel);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A0q(c90l, (G0U) objAaT, bfm, 6);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $connectorId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, int i) {
            super(2);
            this.$connectorId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SkillManageAccountsBottomSheetKt.SkillManageAccountsScreen(this.$connectorId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SkillManageAccountsScreen(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1368231603);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            String strA0M = FGI.A0M("SkillLinkedAccountsViewModel:", str);
            SkillLinkedAccountsViewModel.Factory factory = new SkillLinkedAccountsViewModel.Factory(abstractC3358CGzA0h, str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SkillLinkedAccountsViewModel skillLinkedAccountsViewModel = (SkillLinkedAccountsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), SkillLinkedAccountsViewModel.class, strA0M);
            C1BO c1boA02 = C2CK.A02(bfm, skillLinkedAccountsViewModel.uiState);
            boolean zA67 = bfm.A67(skillLinkedAccountsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$1$1(skillLinkedAccountsViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, skillLinkedAccountsViewModel);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, null, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b77), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new AnonymousClass2(skillLinkedAccountsViewModel, auraNavigatorA0b, c1boA02), -1338305594), null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(c1boA02, skillLinkedAccountsViewModel), -1596080758), bfm, 24582, 48, 2022);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, i);
        }
    }

    public static final void ManageAccountsEmptyRow(BFM bfm, int i) {
        bfm.AgG(-1666176726);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d3a);
            C1822Arm c1822ArmA0V = C06G.A0V(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(C10G.A02, 16.0f, 36.0f), C06G.A0C(bfm), c1822ArmA0V, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i);
        }
    }

    public static final /* synthetic */ SkillAccountsUiState access$SkillManageAccountsScreen$lambda$0(C1BO c1bo) {
        return (SkillAccountsUiState) c1bo.getValue();
    }
}
