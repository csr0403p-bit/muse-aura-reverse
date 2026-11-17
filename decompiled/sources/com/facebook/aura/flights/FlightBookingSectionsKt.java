package com.facebook.aura.flights;

import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.FlightStopsLabelKt;
import com.facebook.aura.conversation.view.FlightTimeLabelKt;
import com.facebook.aura.conversation.view.HatchFlightListRowKt;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowPriceComponent;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.model.FlightTimestamp;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightBookingSectionsKt {

    /* renamed from: com.facebook.aura.flights.FlightBookingSectionsKt$FlightBookingItinerarySection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Map<Integer, String> $changeTargets;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ G0U<String, Unit> $onChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlightRowData flightRowData, Map<Integer, String> map, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$offer = flightRowData;
            this.$changeTargets = map;
            this.$onChange = g0u;
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
            FlightBookingSectionsKt.FlightBookingItinerarySection(this.$offer, this.$changeTargets, this.$onChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightBookingSectionsKt$FlightBookingPriceSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C119982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ int $travelers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119982(FlightRowData flightRowData, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$offer = flightRowData;
            this.$travelers = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightBookingSectionsKt.FlightBookingPriceSection(this.$offer, this.$travelers, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightBookingSectionsKt$FlightBookingSliceRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C119992 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ Function0<Unit> $onChange;
        public final /* synthetic */ FlightRowSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119992(FlightRowData flightRowData, FlightRowSlice flightRowSlice, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$offer = flightRowData;
            this.$slice = flightRowSlice;
            this.$onChange = function0;
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
            FlightBookingSectionsKt.FlightBookingSliceRow(this.$offer, this.$slice, this.$onChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightBookingSectionsKt$FlightChangeLink$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, BRg bRg, int i, int i2) {
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
            FlightBookingSectionsKt.FlightChangeLink(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightBookingSectionsKt$FlightPriceBreakdownCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C120001 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ FlightRowData $offer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120001(FlightRowData flightRowData) {
            super(2);
            this.$offer = flightRowData;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                FlightRowData flightRowData = this.$offer;
                int i2 = 0;
                for (FlightRowPriceComponent flightRowPriceComponent : flightRowData.priceBreakdown) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    FlightRowPriceComponent flightRowPriceComponent2 = flightRowPriceComponent;
                    String strA0t = null;
                    if (i2 > 0) {
                        C3cJ.A0Z(bfm, -165094912);
                    } else {
                        bfm.AgE(-822906743);
                    }
                    BBI bbiA07 = C3cG.A07(bfm);
                    String strPriceComponentLabel = FlightBookingSectionsKt.priceComponentLabel(flightRowData, flightRowPriceComponent2.type, bfm, 0);
                    String str = flightRowPriceComponent2.pricePerPassenger;
                    if (str == null) {
                        bfm.AgE(-822771832);
                    } else {
                        bfm.AgE(-822771831);
                        strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120a51);
                    }
                    BBI.A0R(bbiA07, false);
                    FlightBookingSectionsKt.m944FlightPriceRowuDo3WH8(strPriceComponentLabel, strA0t, flightRowPriceComponent2.price, C3cH.A0W(bfm).secondaryText, null, bfm, 0, 16);
                    i2 = i3;
                }
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightBookingSectionsKt$FlightPriceBreakdownCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C120012 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120012(FlightRowData flightRowData, BRg bRg, int i, int i2) {
            super(2);
            this.$offer = flightRowData;
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
            FlightBookingSectionsKt.FlightPriceBreakdownCard(this.$offer, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FlightBookingItinerarySection(FlightRowData flightRowData, Map<Integer, String> map, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(flightRowData, map, g0u);
        bfm.AgG(-457071987);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(map, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            FlightResultsScreenKt.m949FlightSectionLabel6a0pyJM(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a0b), null, 0.0f, bfm, 0, 6);
            FlightDetailSectionsKt.FlightDetailCard(null, B1V.A00(bfm, new FlightBookingSectionsKt$FlightBookingItinerarySection$1$1(flightRowData, map, g0u), 1827336546), bfm, 48, zA1Z ? 1 : 0);
            BBI.A0R(bbi, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(flightRowData, map, g0u, bRg2, i, i2);
        }
    }

    public static final void FlightBookingPriceSection(FlightRowData flightRowData, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BBb bBbAAc;
        Object c119982;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(flightRowData, 0);
        bfm.AgG(-747097387);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            String str = flightRowData.price;
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c119982 = new FlightBookingSectionsKt$FlightBookingPriceSection$price$1(flightRowData, i, bRg2, i2, i3);
                    C3cG.A1D(bBbAAc, c119982);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMedium);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
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
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A06, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            FlightResultsScreenKt.m949FlightSectionLabel6a0pyJM(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a11), null, 0.0f, bfm, 0, 6);
            if (flightRowData.priceBreakdown.isEmpty()) {
                bfm.AgE(-1064001375);
            } else {
                bfm.AgE(-2112533816);
                FlightPriceBreakdownCard(flightRowData, null, bfm, iA0d & 14, 2);
            }
            boolean zA1V = AnonymousClass003.A1V(bbi);
            FlightDetailSectionsKt.FlightDetailCard(null, B1V.A00(bfm, new FlightBookingSectionsKt$FlightBookingPriceSection$1$2(flightRowData, i, str), -1778849174), bfm, 48, zA1V ? 1 : 0);
            BBI.A0R(bbi, zA1V);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c119982 = new C119982(flightRowData, i, bRg2, i2, i3);
            C3cG.A1D(bBbAAc, c119982);
        }
    }

    /* renamed from: FlightBookingSliceLine-cf5BqRc, reason: not valid java name */
    public static final void m943FlightBookingSliceLinecf5BqRc(String str, C1822Arm c1822Arm, long j, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> flightBookingSectionsKt$FlightBookingSliceLine$2;
        BRg bRg2 = bRg;
        bfm.AgG(1542234956);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    flightBookingSectionsKt$FlightBookingSliceLine$2 = new FlightBookingSectionsKt$FlightBookingSliceLine$1(str, c1822Arm, j, bRg2, i, i2);
                    bBbAAc.A06 = flightBookingSectionsKt$FlightBookingSliceLine$2;
                }
                return;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, j, c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA0d & 896) | ((iA0d << 6) & 7168), 6, 14832);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            flightBookingSectionsKt$FlightBookingSliceLine$2 = new FlightBookingSectionsKt$FlightBookingSliceLine$2(str, c1822Arm, j, bRg2, i, i2);
            bBbAAc.A06 = flightBookingSectionsKt$FlightBookingSliceLine$2;
        }
    }

    public static final void FlightBookingSliceRow(FlightRowData flightRowData, FlightRowSlice flightRowSlice, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        Object next;
        BRg bRgA0Q = bRg;
        bfm.AgG(540777408);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, flightRowSlice);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a3f);
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRgA0R, f, f, AuraDimensKt.SpacingMedium, f);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0K);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            List<String> listCarrierIcons = FlightResultsScreenKt.carrierIcons(flightRowSlice);
            String strAirlineLabel = HatchFlightListRowKt.airlineLabel(flightRowData, flightRowSlice, bfm, iA0d & 126);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).card;
            List<String> listDistinctCarriers = HatchFlightListRowKt.distinctCarriers(flightRowSlice.segments);
            BS0 bs0 = BRg.A00;
            HatchFlightListRowKt.m599HatchFlightCarrierIconsRZJR0o8(listCarrierIcons, strAirlineLabel, j, listDistinctCarriers, c90m.A4D(C2VU.A05, C10G.A07(bs0, 32.0f)), 0.0f, null, 32.0f, bfm, 12582912, 96);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightBookingSectionsKt$FlightBookingSliceRow$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0O, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            int i4 = (iA0d >> 3) & 14;
            int i5 = i4 & 14;
            m943FlightBookingSliceLinecf5BqRc(FlightTimeLabelKt.flightRoute(flightRowSlice, bfm, i5), C3cH.A0C(bfm, auraTheme), C3cH.A06(bfm, auraTheme), null, bfm, 0, 8);
            FlightTimestamp flightTimestamp = flightRowSlice.depart;
            m943FlightBookingSliceLinecf5BqRc(FlightResultsFormattingKt.detailPair(flightTimestamp != null ? flightTimestamp.dateString : null, FlightResultsFormattingKt.flightNumbers(flightRowSlice, strA01), bfm, 0), C3cH.A0B(bfm, auraTheme), C3cH.A07(bfm, auraTheme), null, bfm, 0, 8);
            m943FlightBookingSliceLinecf5BqRc(FlightResultsFormattingKt.timeRange(flightRowSlice, bfm, i4), C3cH.A0E(bfm, auraTheme), C3cH.A05(bfm, auraTheme), null, bfm, 0, 8);
            bfm.AgE(634779693);
            Iterator it = BFI.A0F(new String[]{flightRowSlice.duration, FlightStopsLabelKt.flightStopsLabel(flightRowSlice, bfm, i5), FlightDetailSectionsKt.cabinLabel(flightRowSlice, bfm, i4)}).iterator();
            if (it.hasNext()) {
                next = it.next();
                while (it.hasNext()) {
                    next = FlightResultsFormattingKt.detailPair((String) next, AnonymousClass005.A0j(it), bfm, 0);
                    if (next == null) {
                        next = "";
                    }
                }
            } else {
                next = null;
            }
            BBI.A0R(bbi, false);
            m943FlightBookingSliceLinecf5BqRc((String) next, C3cH.A0E(bfm, auraTheme), C3cH.A05(bfm, auraTheme), null, bfm, 0, 8);
            BBI.A0R(bbi, true);
            if (function0 == null) {
                bfm.AgE(1603936831);
            } else {
                bfm.AgE(1603936832);
                FlightChangeLink(function0, null, bfm, 0, 2);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119992(flightRowData, flightRowSlice, function0, bRgA0Q, i, i2);
        }
    }

    public static final void FlightChangeLink(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1157680487);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a04);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A06(C0v5.A04(bRg2, C3cG.A0A(0), null, function0, true), AuraDimensKt.SpacingXsmall), auraTheme.getColors(bfm, 6).accent, auraTheme.getTypography(bfm, 6).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, bRg2, i, i2);
        }
    }

    /* renamed from: FlightPriceRow-uDo3WH8, reason: not valid java name */
    public static final void m944FlightPriceRowuDo3WH8(String str, String str2, String str3, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-519609104);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(bfm.A64(j) ? 1 : 0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA0R, f, f2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightBookingSectionsKt$FlightPriceRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f2);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0K);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0O = AnonymousClass001.A0O(C90m.A00, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            if (str2 == null) {
                bfm.AgE(-418009783);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -418009782).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, j, C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 0, null, null, null, bfm, AnonymousClass005.A01(iA0d >> 6) | ((iA0d >> 3) & 896), 0, 15858);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FlightBookingSectionsKt$FlightPriceRow$3(str, str2, str3, j, bRg2, i, i2);
        }
    }

    public static final String priceComponentLabel(FlightRowData flightRowData, String str, BFM bfm, int i) {
        String strA01;
        if ("base_fare".equals(str)) {
            bfm.AgE(-2081166898);
            strA01 = singleFlightFareLabel(flightRowData, bfm, i & 14);
            if (strA01 == null) {
                bfm.AgE(71413908);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a01);
            } else {
                bfm.AgE(71412916);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            if (!"taxes".equals(str)) {
                AnonymousClass003.A0l(bfm, -2080996834);
                return "";
            }
            bfm.AgE(71416153);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a15);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final String totalLabel(FlightRowData flightRowData, BFM bfm, int i) {
        int i2;
        int size = flightRowData.slices.size();
        if (size != 1) {
            i2 = R.string._name_removed__res_0x7f120a13;
            if (size != 2) {
                i2 = R.string._name_removed__res_0x7f120a16;
            }
        } else {
            i2 = R.string._name_removed__res_0x7f120a10;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }

    public static final String travelersLabel(int i, BFM bfm, int i2) {
        if (i <= 0) {
            AnonymousClass004.A1A(bfm, 662115675);
            return null;
        }
        bfm.AgE(-117191628);
        String strA00 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f10002d, new Object[]{Integer.valueOf(i)}, bfm, i);
        AnonymousClass001.A1D(bfm);
        return strA00;
    }

    public static final void FlightPriceBreakdownCard(FlightRowData flightRowData, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(653185889);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            FlightDetailSectionsKt.FlightDetailCard(bRg, B1V.A00(bfm, new C120001(flightRowData), -1011710878), bfm, ((iA0d >> 3) & 14) | 48, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120012(flightRowData, bRg, i, i2);
        }
    }

    public static final String singleFlightFareLabel(FlightRowData flightRowData, BFM bfm, int i) {
        bfm.AgE(860499955);
        FlightRowSlice flightRowSlice = (FlightRowSlice) AbstractC0878AGe.A0K(flightRowData.slices);
        if (flightRowSlice == null) {
            AnonymousClass002.A19(bfm);
            return null;
        }
        String strDetailPair = FlightResultsFormattingKt.detailPair(FlightResultsFormattingKt.flightNumbers(flightRowSlice, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a3f)), FlightDetailSectionsKt.cabinLabel(flightRowSlice, bfm, 0), bfm, 0);
        AnonymousClass001.A1D(bfm);
        return strDetailPair;
    }
}
