package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C07C;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.CheckoutPriceDetailsUiState;
import com.facebook.aura.agentpermission.CheckoutPriceDetailsViewModel;
import com.facebook.aura.gateway.DeliveryCheckoutMoney;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightCheckoutSummarySheetKt {

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutSummarySheetKt$FlightCheckoutSummarySheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ List<HatchAgentPermissionsRepository.CheckoutTotal> $totals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<HatchAgentPermissionsRepository.CheckoutTotal> list) {
            super(3);
            this.$totals = list;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                CheckoutRowPrimitivesKt.CheckoutSummaryBody(this.$totals, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutSummarySheetKt$FlightCheckoutSummarySheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
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
            FlightCheckoutSummarySheetKt.FlightCheckoutSummarySheet(this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FlightCheckoutSummarySheet(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        List<HatchAgentPermissionsRepository.CheckoutTotal> listPriceDetailsTotals;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1401337812);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            CheckoutPriceDetailsViewModel.Factory factory = new CheckoutPriceDetailsViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            CheckoutPriceDetailsViewModel checkoutPriceDetailsViewModel = (CheckoutPriceDetailsViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(CheckoutPriceDetailsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, checkoutPriceDetailsViewModel.uiState);
            Object value = c1boA02.getValue();
            CheckoutPriceDetailsUiState.Dismissed dismissed = CheckoutPriceDetailsUiState.Dismissed.INSTANCE;
            Boolean boolValueOf = Boolean.valueOf(C7384Etj.areEqual(value, dismissed));
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new FlightCheckoutSummarySheetKt$FlightCheckoutSummarySheet$1$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
            CheckoutPriceDetailsUiState checkoutPriceDetailsUiState = (CheckoutPriceDetailsUiState) c1boA02.getValue();
            if (checkoutPriceDetailsUiState instanceof CheckoutPriceDetailsUiState.Flight) {
                AnonymousClass003.A0l(bfm, 1934114322);
                listPriceDetailsTotals = ((CheckoutPriceDetailsUiState.Flight) checkoutPriceDetailsUiState).totals;
            } else {
                if (!(checkoutPriceDetailsUiState instanceof CheckoutPriceDetailsUiState.Delivery)) {
                    if (checkoutPriceDetailsUiState instanceof CheckoutPriceDetailsUiState.ConnectorOrder) {
                        bfm.AgE(-171818887);
                        listPriceDetailsTotals = ConnectorOrderCheckoutRowsKt.priceDetailsTotals(((CheckoutPriceDetailsUiState.ConnectorOrder) checkoutPriceDetailsUiState).checkout, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120099));
                        AnonymousClass001.A1D(bfm);
                        if (listPriceDetailsTotals == null) {
                            bBbAAc = bfm.AAc();
                            if (bBbAAc == null) {
                                return;
                            } else {
                                anonymousClass4 = new FlightCheckoutSummarySheetKt$FlightCheckoutSummarySheet$totals$1(str, bRg2, i, i2);
                            }
                        }
                    } else {
                        if (!C7384Etj.areEqual(checkoutPriceDetailsUiState, dismissed)) {
                            throw AnonymousClass005.A0k(bfm, 1934112109);
                        }
                        AnonymousClass003.A0l(bfm, -171618224);
                        bBbAAc = bfm.AAc();
                        if (bBbAAc == null) {
                            return;
                        } else {
                            anonymousClass4 = new FlightCheckoutSummarySheetKt$FlightCheckoutSummarySheet$totals$2(str, bRg2, i, i2);
                        }
                    }
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                bfm.AgE(1934116220);
                CheckoutPriceDetailsUiState.Delivery delivery = (CheckoutPriceDetailsUiState.Delivery) checkoutPriceDetailsUiState;
                listPriceDetailsTotals = DeliveryCheckoutPriceTotalsKt.deliveryCheckoutTotals(delivery.items, delivery.total, bfm, DeliveryCheckoutMoney.$stable << 3);
                AnonymousClass001.A1D(bfm);
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200eb), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            boolean zA1M = AnonymousClass003.A1M(bfm, checkoutPriceDetailsViewModel, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new FlightCheckoutSummarySheetKt$FlightCheckoutSummarySheet$2$1(checkoutPriceDetailsViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRg2, null, auraBottomSheetHeaderConfig, null, null, (Function0) objAaT2, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(listPriceDetailsTotals), -710398641), bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 1972);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(str, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final /* synthetic */ CheckoutPriceDetailsUiState access$FlightCheckoutSummarySheet$lambda$0(C1BO c1bo) {
        return (CheckoutPriceDetailsUiState) c1bo.getValue();
    }
}
