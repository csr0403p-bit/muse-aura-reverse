package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C11U;
import X.C1b8;
import X.C3cH;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.DeliveryCheckoutApproval;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class DeliveryCheckoutTotalKt {

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutTotalKt$DeliveryCheckoutTotal$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ DeliveryCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, DeliveryCheckoutApproval deliveryCheckoutApproval, HatchScreen hatchScreen, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = deliveryCheckoutApproval;
            this.$screen = hatchScreen;
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
            DeliveryCheckoutTotalKt.DeliveryCheckoutTotal(this.$approval, this.$checkout, this.$screen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DeliveryCheckoutTotal(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, DeliveryCheckoutApproval deliveryCheckoutApproval, HatchScreen hatchScreen, BRg bRg, BFM bfm, int i, int i2) {
        Function0 function0;
        BRg bRg2 = bRg;
        AnonymousClass005.A10(agentPermissionApproval, deliveryCheckoutApproval, hatchScreen);
        bfm.AgG(1319335499);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(deliveryCheckoutApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass005.A0A(bfm, hatchScreen);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120099);
            String strDeliveryCheckoutAmount = DeliveryCheckoutFormattingKt.deliveryCheckoutAmount(deliveryCheckoutApproval.total);
            if (deliveryCheckoutApproval.priceDetails == null) {
                AnonymousClass003.A0l(bfm, 1078543421);
                function0 = null;
            } else {
                bfm.AgE(1078543422);
                boolean zA1D = AnonymousClass003.A1D(iA05);
                if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(agentPermissionApproval))) {
                    z = false;
                }
                boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, zA1D, z);
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new DeliveryCheckoutTotalKt$DeliveryCheckoutTotal$1$1$1(hatchScreen, agentPermissionApproval, auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                AnonymousClass001.A1D(bfm);
            }
            CheckoutRowPrimitivesKt.CheckoutTotalRow(strA01, strDeliveryCheckoutAmount, C1b8.A01(C11U.A03(bRg2, CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).secondaryButtonBackground), function0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200f5), null, bfm, 0, 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionApproval, deliveryCheckoutApproval, hatchScreen, bRg2, i, i2);
        }
    }
}
