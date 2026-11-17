package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C11U;
import X.C1515AkP;
import X.C1b8;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.DeliveryCheckoutStop;
import com.facebook.aura.gateway.DeliveryCheckoutStopRole;
import com.facebook.aura.gateway.DeliveryCheckoutTime;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class DeliveryCheckoutStopsKt {

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutStopsKt$DeliveryCheckoutStops$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ List<DeliveryCheckoutStop> $stops;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, List<DeliveryCheckoutStop> list, HatchScreen hatchScreen, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$stops = list;
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
            DeliveryCheckoutStopsKt.DeliveryCheckoutStops(this.$approval, this.$stops, this.$screen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryCheckoutStopRole.values().length];
            try {
                AnonymousClass002.A13(DeliveryCheckoutStopRole.PICKUP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DeliveryCheckoutStopRole.DROPOFF, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void DeliveryCheckoutStops(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, List<DeliveryCheckoutStop> list, HatchScreen hatchScreen, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRgA0Q = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(agentPermissionApproval, list, hatchScreen);
        bfm.AgG(1507725778);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass005.A0A(bfm, hatchScreen);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA01 = C1b8.A01(C11U.A03(AnonymousClass001.A0R(bRgA0Q), CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).secondaryButtonBackground);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, -380144333);
                int i5 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        DeliveryCheckoutStop deliveryCheckoutStop = (DeliveryCheckoutStop) next;
                        if (i5 > 0) {
                            C3cJ.A0Z(bfm, -1676389208);
                        } else {
                            bfm.AgE(-428389663);
                        }
                        BBI.A0R(bbi, false);
                        String str = deliveryCheckoutStop.compactAddress;
                        String strDeliveryStopSubtitle = deliveryStopSubtitle(deliveryCheckoutStop, bfm, DeliveryCheckoutStop.$stable);
                        boolean zA1Y = AnonymousClass005.A1Y(bfm, auraNavigatorA0b, deliveryCheckoutStop, AnonymousClass004.A1K(iA05), (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
                        Object objAaT = bfm.AaT();
                        if (zA1Y || objAaT == C78N.A00) {
                            objAaT = new DeliveryCheckoutStopsKt$DeliveryCheckoutStops$1$1$1$1(hatchScreen, agentPermissionApproval, auraNavigatorA0b, deliveryCheckoutStop);
                            bfm.Ai0(objAaT);
                        }
                        Function0 function02 = (Function0) objAaT;
                        int iOrdinal = deliveryCheckoutStop.role.ordinal();
                        if (iOrdinal == 0) {
                            i3 = R.string._name_removed__res_0x7f1200bf;
                        } else {
                            if (iOrdinal != zA1Z) {
                                throw C3cG.A0q();
                            }
                            i3 = R.string._name_removed__res_0x7f1200be;
                        }
                        CheckoutRowPrimitivesKt.CheckoutIconRow(R.drawable.locationpin_outline_24_wght400, str, strDeliveryStopSubtitle, null, function02, AbstractC2271BQs.A01(bfm, i3), bfm, 0, 8);
                        i5 = i6;
                    }
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1Z);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionApproval, list, hatchScreen, bRgA0Q, i, i2);
        }
    }

    public static final String deliveryStopSubtitle(DeliveryCheckoutStop deliveryCheckoutStop, BFM bfm, int i) {
        BBI bbiA07;
        String strDeliveryStopLabel = deliveryStopLabel(deliveryCheckoutStop.role, bfm, 0);
        DeliveryCheckoutTime deliveryCheckoutTime = deliveryCheckoutStop.time;
        if (deliveryCheckoutTime == null) {
            bbiA07 = AnonymousClass002.A0M(bfm, -663880983);
        } else {
            bfm.AgE(-663880982);
            boolean z = deliveryCheckoutTime.estimated;
            int i2 = R.string._name_removed__res_0x7f1200ba;
            if (z) {
                i2 = R.string._name_removed__res_0x7f1200b9;
            }
            String strA0w = AnonymousClass006.A0w(bfm, strDeliveryStopLabel, DeliveryCheckoutFormattingKt.deliveryStopTimeText(deliveryCheckoutTime, bfm, DeliveryCheckoutTime.$stable), i2);
            bbiA07 = C3cG.A07(bfm);
            if (strA0w != null) {
                strDeliveryStopLabel = strA0w;
            }
        }
        String str = deliveryCheckoutStop.contactName;
        if (str == null) {
            bfm.AgE(-663579849);
            BBI.A0R(bbiA07, false);
        } else {
            bfm.AgE(-663579848);
            String strA0w2 = AnonymousClass006.A0w(bfm, strDeliveryStopLabel, str, R.string._name_removed__res_0x7f1200de);
            BBI.A0R(bbiA07, false);
            if (strA0w2 != null) {
                return strA0w2;
            }
        }
        return strDeliveryStopLabel;
    }

    public static final String deliveryStopLabel(DeliveryCheckoutStopRole deliveryCheckoutStopRole, BFM bfm, int i) {
        int i2;
        int iOrdinal = deliveryCheckoutStopRole.ordinal();
        if (iOrdinal == 0) {
            i2 = R.string._name_removed__res_0x7f1200b5;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            i2 = R.string._name_removed__res_0x7f1200aa;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }
}
