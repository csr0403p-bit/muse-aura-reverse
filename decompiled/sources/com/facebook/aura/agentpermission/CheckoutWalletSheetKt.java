package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0ob;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1SA;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel;
import com.facebook.aura.gateway.WalletPaymentOption;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutWalletSheetKt {
    public static final C1D3 WalletBrandMarkShape = C1D8.A02(33);
    public static final float WalletCheckSlotSize = 24.0f;
    public static final float WalletIneligibleAlpha = 0.5f;
    public static final float WalletOptionLeadingSlotSize = 32.0f;

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$CheckoutWalletCardSelectionSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ WalletPaymentMethodGroup $group;
        public final /* synthetic */ C1BO<WalletSheetUiState> $uiState$delegate;
        public final /* synthetic */ CheckoutWalletSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheckoutWalletSheetViewModel checkoutWalletSheetViewModel, WalletPaymentMethodGroup walletPaymentMethodGroup, C1BO<WalletSheetUiState> c1bo) {
            super(3);
            this.$viewModel = checkoutWalletSheetViewModel;
            this.$group = walletPaymentMethodGroup;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (!C3cH.A0K(this.$uiState$delegate).loaded) {
                bfm.AgE(-540767113);
                CheckoutWalletSheetKt.WalletLoadingState(null, bfm, 0, 1);
            } else if (C3cH.A0K(this.$uiState$delegate).loadFailed) {
                bfm.AgE(-540765513);
                CheckoutWalletSheetViewModel checkoutWalletSheetViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(checkoutWalletSheetViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new CheckoutWalletSheetKt$CheckoutWalletCardSelectionSheet$3$1$1(checkoutWalletSheetViewModel);
                    bfm.Ai0(objAaT);
                }
                CheckoutWalletSheetKt.WalletErrorState((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
            } else if (this.$group == null) {
                bfm.AgE(-540763115);
                CheckoutWalletSheetKt.WalletEmptyState(null, bfm, 0, 1);
            } else {
                bfm.AgE(-540761523);
                WalletPaymentMethodGroup walletPaymentMethodGroup = this.$group;
                WalletOptionKey walletOptionKey = C3cH.A0K(this.$uiState$delegate).currentSelectionKey;
                WalletOptionKey walletOptionKey2 = C3cH.A0K(this.$uiState$delegate).requestedKey;
                CheckoutWalletSheetViewModel checkoutWalletSheetViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(checkoutWalletSheetViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new CheckoutWalletSheetKt$CheckoutWalletCardSelectionSheet$3$2$1(checkoutWalletSheetViewModel2);
                    bfm.Ai0(objAaT2);
                }
                int i2 = WalletOptionKey.$stable;
                CheckoutWalletSheetKt.WalletCardSelectionContent(walletPaymentMethodGroup, walletOptionKey, walletOptionKey2, (G0U) ((InterfaceC7353EnQ) objAaT2), bfm, (i2 << 3) | (i2 << 6));
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$CheckoutWalletCardSelectionSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ String $paymentMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, int i) {
            super(2);
            this.$approvalId = str;
            this.$paymentMethod = str2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutWalletSheetKt.CheckoutWalletCardSelectionSheet(this.$approvalId, this.$paymentMethod, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$CheckoutWalletSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<WalletSheetUiState> $uiState$delegate;
        public final /* synthetic */ CheckoutWalletSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheckoutWalletSheetViewModel checkoutWalletSheetViewModel, AuraNavigator auraNavigator, String str, C1BO<WalletSheetUiState> c1bo) {
            super(3);
            this.$viewModel = checkoutWalletSheetViewModel;
            this.$navigator = auraNavigator;
            this.$approvalId = str;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (!C3cH.A0K(this.$uiState$delegate).loaded) {
                bfm.AgE(332973508);
                CheckoutWalletSheetKt.WalletLoadingState(null, bfm, 0, 1);
            } else if (C3cH.A0K(this.$uiState$delegate).loadFailed) {
                bfm.AgE(332975108);
                CheckoutWalletSheetViewModel checkoutWalletSheetViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(checkoutWalletSheetViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new CheckoutWalletSheetKt$CheckoutWalletSheet$2$1$1(checkoutWalletSheetViewModel);
                    bfm.Ai0(objAaT);
                }
                CheckoutWalletSheetKt.WalletErrorState((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
            } else if (C3cH.A0K(this.$uiState$delegate).groups.isEmpty()) {
                bfm.AgE(332977570);
                CheckoutWalletSheetKt.WalletEmptyState(null, bfm, 0, 1);
            } else {
                bfm.AgE(332979413);
                WalletSheetUiState walletSheetUiStateA0K = C3cH.A0K(this.$uiState$delegate);
                CheckoutWalletSheetViewModel checkoutWalletSheetViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(checkoutWalletSheetViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new CheckoutWalletSheetKt$CheckoutWalletSheet$2$2$1(checkoutWalletSheetViewModel2);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT2);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$approvalId, AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$viewModel)));
                CheckoutWalletSheetViewModel checkoutWalletSheetViewModel3 = this.$viewModel;
                AuraNavigator auraNavigator = this.$navigator;
                String str = this.$approvalId;
                Object objAaT3 = bfm.AaT();
                if (zA1R || objAaT3 == C78N.A00) {
                    objAaT3 = new CheckoutWalletSheetKt$CheckoutWalletSheet$2$3$1(checkoutWalletSheetViewModel3, auraNavigator, str);
                    bfm.Ai0(objAaT3);
                }
                CheckoutWalletSheetKt.WalletLoadedContent(walletSheetUiStateA0K, g0u, (G0U) objAaT3, null, bfm, 0, 8);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$CheckoutWalletSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C108123 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108123(String str, int i) {
            super(2);
            this.$approvalId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutWalletSheetKt.CheckoutWalletSheet(this.$approvalId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletCardSelectionContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C108132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ WalletOptionKey $currentSelectionKey;
        public final /* synthetic */ WalletPaymentMethodGroup $group;
        public final /* synthetic */ G0U<WalletOptionKey, Unit> $onSelect;
        public final /* synthetic */ WalletOptionKey $requestedKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108132(WalletPaymentMethodGroup walletPaymentMethodGroup, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, G0U<? super WalletOptionKey, Unit> g0u, int i) {
            super(2);
            this.$group = walletPaymentMethodGroup;
            this.$currentSelectionKey = walletOptionKey;
            this.$requestedKey = walletOptionKey2;
            this.$onSelect = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutWalletSheetKt.WalletCardSelectionContent(this.$group, this.$currentSelectionKey, this.$requestedKey, this.$onSelect, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletChooseDifferentCardRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C108142 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108142(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            CheckoutWalletSheetKt.WalletChooseDifferentCardRow(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletEmptyState$2, reason: invalid class name and case insensitive filesystem */
    public final class C108152 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108152(BRg bRg, int i, int i2) {
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
            CheckoutWalletSheetKt.WalletEmptyState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletErrorState$2, reason: invalid class name and case insensitive filesystem */
    public final class C108162 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108162(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onRetry = function0;
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
            CheckoutWalletSheetKt.WalletErrorState(this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletLoadedContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C108172 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChooseDifferentCard;
        public final /* synthetic */ G0U<WalletOptionKey, Unit> $onSelectCard;
        public final /* synthetic */ WalletSheetUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108172(WalletSheetUiState walletSheetUiState, G0U<? super WalletOptionKey, Unit> g0u, G0U<? super String, Unit> g0u2, BRg bRg, int i, int i2) {
            super(2);
            this.$state = walletSheetUiState;
            this.$onSelectCard = g0u;
            this.$onChooseDifferentCard = g0u2;
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
            CheckoutWalletSheetKt.WalletLoadedContent(this.$state, this.$onSelectCard, this.$onChooseDifferentCard, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletLoadingState$3, reason: invalid class name and case insensitive filesystem */
    public final class C108183 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108183(BRg bRg, int i, int i2) {
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
            CheckoutWalletSheetKt.WalletLoadingState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletOptionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C108192 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ WalletPaymentOption $option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108192(WalletPaymentOption walletPaymentOption, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$option = walletPaymentOption;
            this.$isSelected = z;
            this.$isLoading = z2;
            this.$onSelect = function0;
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
            CheckoutWalletSheetKt.WalletOptionRow(this.$option, this.$isSelected, this.$isLoading, this.$onSelect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletProviderRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C108202 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $brandMarkRes;
        public final /* synthetic */ boolean $isEligible;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108202(String str, String str2, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Integer num, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$isSelected = z;
            this.$isLoading = z2;
            this.$isEligible = z3;
            this.$onSelect = function0;
            this.$brandMarkRes = num;
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
            CheckoutWalletSheetKt.WalletProviderRow(this.$title, this.$subtitle, this.$isSelected, this.$isLoading, this.$isEligible, this.$onSelect, this.$brandMarkRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletProviderSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C108212 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ WalletOptionKey $currentSelectionKey;
        public final /* synthetic */ WalletPaymentMethodGroup $group;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onChooseDifferentCard;
        public final /* synthetic */ G0U<WalletOptionKey, Unit> $onSelectCard;
        public final /* synthetic */ WalletOptionKey $requestedKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108212(WalletPaymentMethodGroup walletPaymentMethodGroup, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, G0U<? super WalletOptionKey, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$group = walletPaymentMethodGroup;
            this.$currentSelectionKey = walletOptionKey;
            this.$requestedKey = walletOptionKey2;
            this.$onSelectCard = g0u;
            this.$onChooseDifferentCard = function0;
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
            CheckoutWalletSheetKt.WalletProviderSection(this.$group, this.$currentSelectionKey, this.$requestedKey, this.$onSelectCard, this.$onChooseDifferentCard, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$WalletSelectionIndicator$2, reason: invalid class name and case insensitive filesystem */
    public final class C108222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108222(boolean z, BRg bRg, boolean z2, int i, int i2) {
            super(2);
            this.$isSelected = z;
            this.$modifier = bRg;
            this.$isLoading = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutWalletSheetKt.WalletSelectionIndicator(this.$isSelected, this.$modifier, this.$isLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$dismissWalletSheets$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r1) {
            /*
                r0 = this;
                r0 = 0
                X.C7384Etj.A0Y(r1, r0)
                boolean r0 = r1 instanceof com.facebook.aura.navigation.key.CheckoutWalletSheetKey
                if (r0 != 0) goto Ld
                boolean r1 = r1 instanceof com.facebook.aura.navigation.key.CheckoutWalletCardSelectionSheetKey
                r0 = 0
                if (r1 == 0) goto Le
            Ld:
                r0 = 1
            Le:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutWalletSheetKt.AnonymousClass1.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
        }
    }

    public static final void CheckoutWalletSheet(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1703487821);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            CheckoutWalletSheetViewModel.Factory factory = new CheckoutWalletSheetViewModel.Factory(AnonymousClass002.A0g(bfm), str, null);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            CheckoutWalletSheetViewModel checkoutWalletSheetViewModel = (CheckoutWalletSheetViewModel) C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), CheckoutWalletSheetViewModel.class);
            C1BO c1boA02 = C2CK.A02(bfm, checkoutWalletSheetViewModel.uiState);
            Boolean boolValueOf = Boolean.valueOf(C3cH.A0K(c1boA02).dismissed);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new CheckoutWalletSheetKt$CheckoutWalletSheet$1$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
            boolean zA1M = AnonymousClass003.A1M(bfm, checkoutWalletSheetViewModel, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new CheckoutWalletSheetKt$CheckoutWalletSheet$onClose$1$1(checkoutWalletSheetViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, null, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120157), null, null, walletCloseButton(function0), null, AuraBottomSheetHeaderConfig.Style.LARGE_START_ALIGNED, null), null, null, function0, false, false, false, null, B1V.A00(bfm, new AnonymousClass2(checkoutWalletSheetViewModel, auraNavigatorA0b, str, c1boA02), 1072970992), bfm, 6, 48, 1974);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108123(str, i);
        }
    }

    public static final void CheckoutWalletCardSelectionSheet(String str, String str2, BFM bfm, int i) {
        String strWalletGroupLabel;
        BBI bbiA07;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        bfm.AgG(1714892454);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            CheckoutWalletSheetViewModel.Factory factory = new CheckoutWalletSheetViewModel.Factory(AnonymousClass002.A0h(bfm), str, str2);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            CheckoutWalletSheetViewModel checkoutWalletSheetViewModel = (CheckoutWalletSheetViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(CheckoutWalletSheetViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, checkoutWalletSheetViewModel.uiState);
            Boolean boolValueOf = Boolean.valueOf(C3cH.A0K(c1boA02).dismissed);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new CheckoutWalletSheetKt$CheckoutWalletCardSelectionSheet$1$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
            boolean zA1M = AnonymousClass003.A1M(bfm, checkoutWalletSheetViewModel, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new CheckoutWalletSheetKt$CheckoutWalletCardSelectionSheet$onClose$1$1(checkoutWalletSheetViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            WalletPaymentMethodGroup providerGroup = C3cH.A0K(c1boA02).getProviderGroup();
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            if (providerGroup == null) {
                bbiA07 = AnonymousClass002.A0M(bfm, -274085409);
            } else {
                bfm.AgE(-274085408);
                strWalletGroupLabel = walletGroupLabel(providerGroup, bfm, zA1b ? 1 : 0);
                bbiA07 = C3cG.A07(bfm);
                if (strWalletGroupLabel != null) {
                    bfm.AgE(-1255767576);
                }
                BBI.A0R(bbiA07, zA1b);
                AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, null, null, new AuraBottomSheetHeaderConfig(strWalletGroupLabel, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120155), null, walletCloseButton(function0), null, AuraBottomSheetHeaderConfig.Style.LARGE_START_ALIGNED, null), null, null, function0, zA1b, zA1b, zA1b, null, B1V.A00(bfm, new AnonymousClass3(checkoutWalletSheetViewModel, providerGroup, c1boA02), 1568150627), bfm, 6, 48, 1974);
            }
            bfm.AgE(-1255765685);
            strWalletGroupLabel = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12008f);
            BBI.A0R(bbiA07, zA1b);
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, null, null, new AuraBottomSheetHeaderConfig(strWalletGroupLabel, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120155), null, walletCloseButton(function0), null, AuraBottomSheetHeaderConfig.Style.LARGE_START_ALIGNED, null), null, null, function0, zA1b, zA1b, zA1b, null, B1V.A00(bfm, new AnonymousClass3(checkoutWalletSheetViewModel, providerGroup, c1boA02), 1568150627), bfm, 6, 48, 1974);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, str2, i);
        }
    }

    public static final void WalletChooseDifferentCardRow(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1218535062);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRgA04, f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA02);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA06 = C3cH.A06(bfm, auraTheme);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            BS0 bs0 = BRg.A00;
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bs0, WalletOptionLeadingSlotSize), aVyA00, auraIconSize, null, jA06, null, bfm, (AVy.$stable << 3) | 3462, 32);
            C01N.A09(bfm, bs0, f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12014e), AnonymousClass001.A0O(c90m, bs0, true), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108142(function0, bRg2, i, i2);
        }
    }

    public static final void WalletEmptyState(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-767441626);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12014f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = CheckoutWalletSheetKt$WalletEmptyState$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0R, objAaT, false);
            float f = AuraDimensKt.SpacingLarge;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(bRgA0Y, f, f), jA07, c1822ArmA0B, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108152(bRg2, i, i2);
        }
    }

    public static final void WalletErrorState(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(391807703);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRg2.then(c1062ATq), AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMedium, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120150);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = CheckoutWalletSheetKt$WalletErrorState$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA06, c1822ArmA0B, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120154), null, c1062ATq, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), AuraButtonSize.MEDIUM, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 12) & 57344, 0, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108162(function0, bRg2, i, i2);
        }
    }

    public static final void WalletLoadedContent(WalletSheetUiState walletSheetUiState, G0U<? super WalletOptionKey, Unit> g0u, G0U<? super String, Unit> g0u2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(1785209763);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, walletSheetUiState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0R(bRgA0Q), 0.0f, 0.0f, 0.0f, walletSheetUiState.groups.size() > 1 ? AuraDimensKt.SpacingLarge : 0.0f);
            float f = AuraDimensKt.SpacingLarge;
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            bfm.AgE(-993766266);
            for (WalletPaymentMethodGroup walletPaymentMethodGroup : walletSheetUiState.groups) {
                WalletOptionKey walletOptionKey = walletSheetUiState.currentSelectionKey;
                WalletOptionKey walletOptionKey2 = walletSheetUiState.requestedKey;
                boolean zA1R = AnonymousClass001.A1R(bfm, walletPaymentMethodGroup, AnonymousClass003.A1D(iA0d));
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new CheckoutWalletSheetKt$WalletLoadedContent$1$1$1$1(g0u2, walletPaymentMethodGroup);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0B = C3U4.A0B(BRg.A00, f, 0.0f);
                int i4 = WalletOptionKey.$stable;
                WalletProviderSection(walletPaymentMethodGroup, walletOptionKey, walletOptionKey2, g0u, (Function0) objAaT, bRgA0B, bfm, ((iA0d << 6) & 7168) | (i4 << 3) | (i4 << 6), 0);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108172(walletSheetUiState, g0u, g0u2, bRgA0Q, i, i2);
        }
    }

    public static final void WalletOptionRow(WalletPaymentOption walletPaymentOption, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2061648947);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(walletPaymentOption, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strWalletFundingLabel = WalletFundingPresentationKt.walletFundingLabel(walletPaymentOption, bfm, WalletPaymentOption.$stable | (iA05 & 14));
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean z3 = walletPaymentOption.isEligible;
            BRg bRgWalletIneligible = walletIneligible(C0ob.A00(bRgA0R, C3cG.A0A(3), function0, z, z3), z3);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRgWalletIneligible, f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, WalletOptionLeadingSlotSize);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if ("balance".equals(walletPaymentOption.paymentType)) {
                bfm.AgE(-1050459733);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.wallet_outline_24_wght400, 0), AuraIconSize.SMALL, null, 0L, null, bfm, AnonymousClass001.A04(), 49);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(935943087);
                CheckoutApprovalSharedKt.PaymentCardBrandLogo(walletPaymentOption.cardBrand, null, bfm, 0, 2);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            C01N.A09(bfm, bs0, f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strWalletFundingLabel, AnonymousClass001.A0O(c90m, bs0, true), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14832);
            C01N.A09(bfm, bs0, f);
            WalletSelectionIndicator(z, null, z2, bfm, ((iA05 >> 3) & 14) | (iA05 & 896), 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108192(walletPaymentOption, z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void WalletProviderRow(String str, String str2, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Integer num, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-527180032);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z3);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, num);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0d, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgWalletIneligible = walletIneligible(C0ob.A00(AnonymousClass001.A0R(bRg2), C3cG.A0A(3), function0, z, z3), z3);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRgWalletIneligible, f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            float f2 = WalletOptionLeadingSlotSize;
            BRg bRgA07 = C10G.A07(bs0, f2);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (num != null) {
                bfm.AgE(470428203);
                C1SA.A00(bfm, null, C11U.A03(C10G.A07(bs0, f2), WalletBrandMarkShape), null, BOf.A00(bfm, num.intValue(), (iA0d >> 18) & 14), B18.A02, null, 0.0f, AVy.$stable | 25008, 104);
            } else {
                bfm.AgE(470686712);
            }
            boolean zA1V = AnonymousClass003.A1V(bbi);
            C01N.A09(bfm, bs0, f);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, zA1V);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, zA1V ? 1 : 0, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            if (str2 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -208919742).footnoteRegular, null, null, null, false, 0, zA1V ? 1 : 0, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-208690776);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, zA1V);
            C01N.A09(bfm, bs0, f);
            WalletSelectionIndicator(z, null, z2, bfm, ((iA0d >> 6) & 14) | ((iA0d >> 3) & 896), 2);
            BBI.A0R(bbi, zA1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108202(str, str2, z, z2, z3, function0, num, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.ApY] */
    /* JADX WARN: Type inference failed for: r23v1, types: [X.1YL] */
    /* JADX WARN: Type inference failed for: r25v1, types: [X.G0V] */
    /* JADX WARN: Type inference failed for: r28v3, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r29v3, types: [X.ArU] */
    /* JADX WARN: Type inference failed for: r30v3, types: [X.013] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WalletProviderSection(com.facebook.aura.agentpermission.WalletPaymentMethodGroup r31, com.facebook.aura.agentpermission.WalletOptionKey r32, com.facebook.aura.agentpermission.WalletOptionKey r33, X.G0U<? super com.facebook.aura.agentpermission.WalletOptionKey, kotlin.Unit> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.BRg r36, X.BFM r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutWalletSheetKt.WalletProviderSection(com.facebook.aura.agentpermission.WalletPaymentMethodGroup, com.facebook.aura.agentpermission.WalletOptionKey, com.facebook.aura.agentpermission.WalletOptionKey, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void dismissWalletSheets(AuraNavigator auraNavigator) {
        auraNavigator.popAll(AnonymousClass1.INSTANCE);
    }

    public static final Integer getBrandMarkRes(WalletPaymentMethodGroup walletPaymentMethodGroup) {
        return Integer.valueOf(WalletFundingPresentationKt.walletProviderLogo(walletPaymentMethodGroup.paymentMethod));
    }

    public static final boolean isShopPay(WalletPaymentMethodGroup walletPaymentMethodGroup) {
        return CheckoutApprovalSharedKt.isShopPayPaymentMethod(walletPaymentMethodGroup.paymentMethod);
    }

    public static final boolean isStripeLink(WalletPaymentMethodGroup walletPaymentMethodGroup) {
        String str = walletPaymentMethodGroup.paymentMethod;
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("stripe_link");
    }

    public static final String walletGroupLabel(WalletPaymentMethodGroup walletPaymentMethodGroup, BFM bfm, int i) {
        int i2;
        String str = walletPaymentMethodGroup.displayName;
        if (str != null) {
            return str;
        }
        if (isStripeLink(walletPaymentMethodGroup)) {
            bfm.AgE(1211026441);
            i2 = R.string._name_removed__res_0x7f120151;
        } else if (CheckoutApprovalSharedKt.isShopPayPaymentMethod(walletPaymentMethodGroup.paymentMethod)) {
            bfm.AgE(1211029421);
            i2 = R.string._name_removed__res_0x7f120156;
        } else {
            bfm.AgE(1211032175);
            i2 = R.string._name_removed__res_0x7f12008f;
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    public static final BRg walletIneligible(BRg bRg, boolean z) {
        return !z ? C11S.A00(bRg, 0.5f) : bRg;
    }

    public static final void WalletCardSelectionContent(WalletPaymentMethodGroup walletPaymentMethodGroup, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, G0U<? super WalletOptionKey, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(1315763630);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, walletPaymentMethodGroup) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(walletOptionKey, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(walletOptionKey2, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            BRg bRgA07 = C3U4.A07(C10G.A02, AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            C90l c90l = C90l.A00;
            boolean zA1B = AnonymousClass003.A1B(iA0d) | ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(walletOptionKey))) | ((iA0d & 896) == 256 || ((iA0d & 512) != 0 && bfm.A67(walletOptionKey2))) | AnonymousClass004.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new CheckoutWalletSheetKt$WalletCardSelectionContent$1$1$1(walletPaymentMethodGroup, walletOptionKey, walletOptionKey2, g0u);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0q(c90l, (G0U) objAaT, bfm, 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108132(walletPaymentMethodGroup, walletOptionKey, walletOptionKey2, g0u, i);
        }
    }

    public static final void WalletLoadingState(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-517392681);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120152);
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg), AuraDimensKt.SpacingLarge);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new CheckoutWalletSheetKt$WalletLoadingState$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108183(bRg, i, i2);
        }
    }

    public static final void WalletSelectionIndicator(boolean z, BRg bRg, boolean z2, BFM bfm, int i, int i2) {
        bfm.AgG(346598981);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            z2 = C3cG.A1K(i4, z2);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120158);
            float f = WalletCheckSlotSize;
            BRg bRgA07 = C10G.A07(bRg, f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            if (z2) {
                BRg bRgA072 = C10G.A07(C3cG.A09(bfm, 469861876), f);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new CheckoutWalletSheetKt$WalletSelectionIndicator$1$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A0v(bfm, bRgA072, (G0U) objAaT);
            } else if (z) {
                bfm.AgE(1681089783);
                AnonymousClass007.A0z(bfm, BOf.A00(bfm, R.drawable.check_outline_24_wght400, 0), AuraIconSize.SMALL, C3cH.A0W(bfm).primaryText);
            } else {
                bfm.AgE(1681322531);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108222(z, bRg, z2, i, i2);
        }
    }

    public static final AuraBottomSheetHeaderConfig.AccessoryButton walletCloseButton(Function0<Unit> function0) {
        return new AuraBottomSheetHeaderConfig.AccessoryButton(R.drawable.aura_nav_close_20, R.string._name_removed__res_0x7f1206ed, function0);
    }

    public static final String walletIneligibleNote(WalletPaymentMethodGroup walletPaymentMethodGroup, BFM bfm, int i) {
        if (walletPaymentMethodGroup.isEligible()) {
            AnonymousClass004.A1A(bfm, 744709594);
            return null;
        }
        bfm.AgE(993854737);
        return AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120153);
    }
}
