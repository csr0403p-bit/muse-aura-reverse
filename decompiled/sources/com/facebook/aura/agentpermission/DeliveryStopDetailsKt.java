package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C3U4;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.gateway.DeliveryCheckoutHandoff;
import com.facebook.aura.gateway.DeliveryCheckoutTime;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class DeliveryStopDetailsKt {

    /* renamed from: com.facebook.aura.agentpermission.DeliveryStopDetailsKt$DeliveryStopDetails$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ DeliveryStopDetailsUiState $details;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DeliveryStopDetailsUiState deliveryStopDetailsUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$details = deliveryStopDetailsUiState;
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
            DeliveryStopDetailsKt.DeliveryStopDetails(this.$details, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryCheckoutHandoff.values().length];
            try {
                AnonymousClass002.A13(DeliveryCheckoutHandoff.MEET_AT_DOOR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DeliveryCheckoutHandoff.LEAVE_AT_DOOR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void DeliveryStopDetails(DeliveryStopDetailsUiState deliveryStopDetailsUiState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(deliveryStopDetailsUiState, 0);
        bfm.AgG(442808806);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(deliveryStopDetailsUiState, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingLarge);
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).card;
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(deliveryStopDetailsUiState))) {
                z = false;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new DeliveryStopDetailsKt$DeliveryStopDetails$1$1$1(deliveryStopDetailsUiState);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, j, (G0U) objAaT, bfm, 6, 3);
            DeliveryStopInstructionsUiState deliveryStopInstructionsUiState = deliveryStopDetailsUiState.instructions;
            if (deliveryStopInstructionsUiState == null) {
                bfm.AgE(356494797);
            } else {
                bfm.AgE(356494798);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingMedium, bfm, 0);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$DeliveryStopDetailsKt.lambda$1717221376;
                long j2 = auraTheme.getColors(bfm, 6).card;
                boolean zA67 = bfm.A67(deliveryStopInstructionsUiState);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new DeliveryStopDetailsKt$DeliveryStopDetails$1$2$1$1(deliveryStopInstructionsUiState);
                    bfm.Ai0(objAaT2);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, g0v, j2, (G0U) objAaT2, bfm, 390, 1);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(deliveryStopDetailsUiState, bRg2, i, i2);
        }
    }

    public static final String deliveryStopDetailTimeText(DeliveryCheckoutTime deliveryCheckoutTime, BFM bfm, int i) {
        String strDeliveryStopTimeText = DeliveryCheckoutFormattingKt.deliveryStopTimeText(deliveryCheckoutTime, bfm, (i & 14) | DeliveryCheckoutTime.$stable);
        if (deliveryCheckoutTime.estimated) {
            bfm.AgE(-188410683);
            strDeliveryStopTimeText = AnonymousClass001.A0t(bfm, strDeliveryStopTimeText, R.string._name_removed__res_0x7f1200bc);
        } else {
            bfm.AgE(-188408129);
        }
        AnonymousClass002.A19(bfm);
        return strDeliveryStopTimeText;
    }

    public static final String deliveryHandoffText(DeliveryCheckoutHandoff deliveryCheckoutHandoff, BFM bfm, int i) {
        int i2;
        int iOrdinal = deliveryCheckoutHandoff.ordinal();
        if (iOrdinal == 0) {
            i2 = R.string._name_removed__res_0x7f1200b4;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            i2 = R.string._name_removed__res_0x7f1200b0;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }
}
