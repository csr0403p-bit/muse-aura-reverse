package com.facebook.aura.agentpermission;

import X.AKQ;
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
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C1515AkP;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.gateway.CheckoutLodgingCancellation;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutApprovalSummaryBodyKt {

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSummaryBodyKt$CheckoutSummaryGroups$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CheckoutSummaryPresentation $data;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheckoutSummaryPresentation checkoutSummaryPresentation, BRg bRg, int i, int i2) {
            super(2);
            this.$data = checkoutSummaryPresentation;
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
            CheckoutApprovalSummaryBodyKt.CheckoutSummaryGroups(this.$data, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CheckoutSummaryGroups(CheckoutSummaryPresentation checkoutSummaryPresentation, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(checkoutSummaryPresentation, 0);
        bfm.AgG(-1358010832);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(checkoutSummaryPresentation, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1Z = AnonymousClass002.A1Z(checkoutSummaryPresentation.kind, CheckoutPresentationKind.LODGING);
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), zA1Z ? AuraDimensKt.SpacingMedium : AuraDimensKt.SpacingLarge);
            C9m9 c9m9A00 = AcQ.A00(zA1Z ? AuraDimensKt.SpacingMicro : AuraDimensKt.SpacingNone);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C9m9 c9m9A002 = AcQ.A00(AuraDimensKt.SpacingMedium);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90l c90l = C90l.A00;
            bfm.AgE(-156608479);
            for (List<CheckoutAmountPresentation> list : checkoutSummaryPresentation.groups) {
                boolean zA67 = bfm.A67(list);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new CheckoutApprovalSummaryBodyKt$CheckoutSummaryGroups$1$1$1$1$1(list);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A0q(c90l, (G0U) objAaT, bfm, 6);
            }
            boolean zA1V = AnonymousClass003.A1V(bbi);
            CheckoutLodgingCancellation checkoutLodgingCancellation = checkoutSummaryPresentation.cancellation;
            if (checkoutLodgingCancellation == null) {
                bfm.AgE(-796911361);
            } else {
                bfm.AgE(-796911360);
                LodgingCheckoutRowsKt.LodgingCheckoutCancellation(checkoutLodgingCancellation, null, null, bfm, CheckoutLodgingCancellation.$stable | 48, 4);
            }
            BBI.A0R(bbi, false);
            if (zA1Z) {
                bfm.AgE(-796803108);
            } else {
                bfm.AgE(112843014);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingLarge, bfm, 0);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(checkoutSummaryPresentation, bRg2, i, i2);
        }
    }
}
