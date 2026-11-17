package com.facebook.aura.settings;

import X.AKQ;
import X.AZ3;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C08R;
import X.C0CD;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1YL;
import X.C1YY;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import com.facebook.aura.ui.HatchRowSpinnerKt;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchWalletScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$HatchWalletScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HatchWalletViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchWalletViewModel hatchWalletViewModel) {
            super(4);
            this.$viewModel = hatchWalletViewModel;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1971invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1971invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                HatchWalletScreenKt.m1969WalletContentdjqsMU(this.$viewModel, f, f2, null, bfm, AnonymousClass002.A07(iA04 << 3, HatchWalletViewModel.$stable), 8);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$HatchWalletScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchWalletViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, HatchWalletViewModel hatchWalletViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = hatchWalletViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWalletScreenKt.HatchWalletScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$PaymentMethodRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorCatalogRowUiState $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectorCatalogRowUiState connectorCatalogRowUiState) {
            super(3);
            this.$row = connectorCatalogRowUiState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
            invoke(c08r, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C08R c08r, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c08r), bfm, i)) {
                if (this.$row.loading) {
                    bfm.AgE(2066034536);
                    HatchRowSpinnerKt.HatchRowSpinner(AnonymousClass001.A0t(bfm, this.$row.title, R.string._name_removed__res_0x7f120aca), null, bfm, 0, 2);
                } else {
                    bfm.AgE(2066335670);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f67), null, C06G.A0D(bfm), C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$PaymentMethodRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorCatalogRowUiState $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectorCatalogRowUiState connectorCatalogRowUiState) {
            super(2);
            this.$row = connectorCatalogRowUiState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ConnectorCatalogRowUiState connectorCatalogRowUiState = this.$row;
                HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(connectorCatalogRowUiState.iconUrl, connectorCatalogRowUiState.iconRes, null, 0.0f, 0.0f, 0, 0.0f, null, null, bfm, 0, 508);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$PaymentMethodRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ ConnectorCatalogRowUiState $row;
        public final /* synthetic */ String $testTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConnectorCatalogRowUiState connectorCatalogRowUiState, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$row = connectorCatalogRowUiState;
            this.$testTag = str;
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
            HatchWalletScreenKt.PaymentMethodRow(this.$row, this.$testTag, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$WalletHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C136042 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $agentName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136042(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$agentName = str;
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
            HatchWalletScreenKt.WalletHeader(this.$agentName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$walletPageStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C136051 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ HatchWalletUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136051(HatchWalletUiState hatchWalletUiState) {
            super(3);
            this.$state = hatchWalletUiState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120adc);
                C1062ATq c1062ATq = C10G.A02;
                int i2 = 240;
                if (this.$state.hasLoaded) {
                    i2 = 64;
                }
                BRg bRgA04 = C10G.A04(c1062ATq, i2);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchWalletScreenKt$walletPageStatus$1$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0Y(bRgA04, objAaT, false), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$walletPageStatus$2, reason: invalid class name and case insensitive filesystem */
    public final class C136062 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136062(Function0<Unit> function0) {
            super(3);
            this.$onRetry = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f8c), this.$onRetry, C3U4.A06(C10G.A02, AuraDimensKt.SpacingXlarge), HatchSurface.SETTINGS, HatchSubsurface.WALLET, HatchScreen.WALLET, null, bfm, 224256, 64);
            } else {
                bfm.Afo();
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectorCatalogActionLabel.values().length];
            try {
                AnonymousClass002.A13(ConnectorCatalogActionLabel.VIEW, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectorCatalogActionLabel.COMING_SOON, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectorCatalogActionLabel.CONNECT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchWalletScreen(X.BRg r43, com.facebook.aura.settings.HatchWalletViewModel r44, X.BFM r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWalletScreenKt.HatchWalletScreen(X.BRg, com.facebook.aura.settings.HatchWalletViewModel, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PaymentMethodRow(com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState r57, java.lang.String r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, X.BRg r60, X.BFM r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWalletScreenKt.PaymentMethodRow(com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState, java.lang.String, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: WalletContent-djqs-MU, reason: not valid java name */
    public static final void m1969WalletContentdjqsMU(HatchWalletViewModel hatchWalletViewModel, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1693617356);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchWalletViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchWalletViewModel.uiState);
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            if (((HatchWalletUiState) c1boA02.getValue()).canLoadMore) {
                bfm.AgE(1574094233);
                boolean z = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchWalletViewModel));
                Object objAaT = bfm.AaT();
                if (z || objAaT == C78N.A00) {
                    objAaT = new HatchWalletScreenKt$WalletContent$1$1(hatchWalletViewModel);
                    bfm.Ai0(objAaT);
                }
                AutoLoadMoreKt.AutoLoadMore(lazyListStateA00, 0, (Function0<Unit>) objAaT, bfm, 0, 1);
            } else {
                bfm.AgE(1574152854);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgA0M = C06G.A0M(bfm, AnonymousClass001.A0T(bRg2));
            boolean zA1R = AnonymousClass001.A1R(bfm, c1boA02, AnonymousClass004.A1I(iA05)) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchWalletViewModel))) | AnonymousClass004.A1K(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new HatchWalletScreenKt$WalletContent$2$1(hatchWalletViewModel, f, c1boA02, f2);
                bfm.Ai0(objAaT2);
            }
            C1YY.A01(null, null, null, null, lazyListStateA00, bfm, null, bRgA0M, (G0U) objAaT2, 0, 508, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchWalletScreenKt$WalletContent$3(hatchWalletViewModel, f, f2, bRg2, i, i2);
        }
    }

    public static final void WalletHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-630232408);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingMedium), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.wallet_outline_24_wght400, 0), AuraIconSize.MEDIUM, null, 0L, null, bfm, AnonymousClass001.A04(), 49);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120235), c1062ATq, C06G.A0C(bfm), C06G.A0U(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120f69), c1062ATq, C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136042(str, bRg2, i, i2);
        }
    }

    public static final void walletPageStatus(C0CD c0cd, HatchWalletUiState hatchWalletUiState, Function0<Unit> function0) {
        if (hatchWalletUiState.showLoading) {
            c0cd.APJ(AuraButtonKt.LOADING_TAG, AuraDeeplinkRouteMapper.STATUS_ROUTE, B1V.A01(new C136051(hatchWalletUiState), 2100096298, true));
        }
        if (hatchWalletUiState.showError) {
            c0cd.APJ("error", AuraDeeplinkRouteMapper.STATUS_ROUTE, B1V.A01(new C136062(function0), -739844255, true));
        }
        if (hatchWalletUiState.showEmpty) {
            c0cd.APJ("empty", AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$HatchWalletScreenKt.lambda$1190386594);
        }
    }

    public static final /* synthetic */ HatchWalletUiState access$WalletContent_djqs_MU$lambda$0(C1BO c1bo) {
        return (HatchWalletUiState) c1bo.getValue();
    }
}
