package com.facebook.aura.flights;

import X.AKQ;
import X.AbstractC0878AGe;
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
import X.BOD;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1DM;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.HatchFlightListRowKt;
import com.facebook.aura.flights.FlightResultsCardViewModel;
import com.facebook.aura.flights.FlightResultsViewModel;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightResultsCardKt {
    public static final int VISIBLE_CARD_FLIGHTS = 3;

    /* renamed from: com.facebook.aura.flights.FlightResultsCardKt$FlightResultsHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightResults $results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlightResults flightResults, BRg bRg, int i, int i2) {
            super(2);
            this.$results = flightResults;
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
            FlightResultsCardKt.FlightResultsHeader(this.$results, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsCardKt$FlightResultsHeaderDetail$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            FlightResultsCardKt.FlightResultsHeaderDetail(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsCardKt$FlightResultsSeeAllButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C120182 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightResults $results;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120182(FlightResults flightResults, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$results = flightResults;
            this.$sessionId = str;
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
            FlightResultsCardKt.FlightResultsSeeAllButton(this.$results, this.$sessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: FlightResultsCard-T042LqI, reason: not valid java name */
    public static final void m948FlightResultsCardT042LqI(FlightResults flightResults, String str, long j, C1D3 c1d3, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        C1DM c1dm;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(flightResults, str);
        bfm.AgG(10429421);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightResults) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c1d3);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            if (c1d3 == null) {
                bfm.AgE(1432749009);
                c1dm = AuraTheme.INSTANCE.getShapes(bfm, 6).card;
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 1432747924);
                c1dm = c1d3;
            }
            BRg bRgA06 = C3U4.A06(C1b8.A01(C11U.A03(bRgA0R, c1dm), j), AuraDimensKt.SpacingMicro);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA02 = C3cG.A02(bbiA0M.A06);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingXsmall;
            int i4 = iA0d & 14;
            FlightResultsHeader(flightResults, C3U4.A0C(bs0, f, f2, f, f2), bfm, i4, 0);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA0M = FGI.A0M("flightResultsCard:", flightResults.presentationId);
            FlightResultsCardViewModel.Factory factory = new FlightResultsCardViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            FlightResultsCardViewModel flightResultsCardViewModel = (FlightResultsCardViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), FlightResultsCardViewModel.class, strA0M);
            bfm.AgE(1008673995);
            for (FlightRowData flightRowData : AbstractC0878AGe.A0a(flightResults.offers, 3)) {
                boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, bfm.A67(flightResultsCardViewModel), AnonymousClass003.A17(i4)) | AnonymousClass003.A1C(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new FlightResultsCardKt$FlightResultsCard$1$1$1$1(flightResultsCardViewModel, flightResults, auraNavigatorA0b, str);
                    bfm.Ai0(objAaT);
                }
                HatchFlightListRowKt.m600HatchFlightListRowsW7UJKQ(flightRowData, j, null, (G0U) objAaT, bfm, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
            }
            BBI.A0R(bbiA0M, false);
            if (flightResults.offers.size() > 3) {
                bfm.AgE(1204470347);
                FlightResultsSeeAllButton(flightResults, str, C3U4.A0C(bs0, f, AuraDimensKt.SpacingXsmall, f, AuraDimensKt.SpacingSmall), bfm, iA0d & 126, 0);
            } else {
                bfm.AgE(1204797087);
            }
            BBI.A0R(bbiA0M, false);
            BBI.A0R(bbiA0M, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FlightResultsCardKt$FlightResultsCard$2(flightResults, str, j, c1d3, bRg2, i, i2);
        }
    }

    public static final void FlightResultsHeader(FlightResults flightResults, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(705878067);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, flightResults) : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i4 != 0) {
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
            int i5 = iA0d & 14;
            String strFlightResultsCardTitle = FlightResultsFormattingKt.flightResultsCardTitle(flightResults, bfm, i5);
            if (strFlightResultsCardTitle == null) {
                bfm.AgE(-122933681);
                BBI.A0R(bbi, false);
                i3 = 2;
            } else {
                bfm.AgE(-122933680);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineMedium;
                long jA06 = C3cH.A06(bfm, auraTheme);
                BS0 bs0 = BRg.A00;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = FlightResultsCardKt$FlightResultsHeader$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                i3 = 2;
                AuraTextKt.m2639AuraTextUY9GdpU(strFlightResultsCardTitle, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
                BBI.A0R(bbi, false);
            }
            String strFlightResultsTripDates = FlightResultsFormattingKt.flightResultsTripDates(flightResults, bfm, i5);
            if (strFlightResultsTripDates == null) {
                bfm.AgE(-122609204);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-122609203);
                FlightResultsHeaderDetail(strFlightResultsTripDates, null, bfm, 0, i3);
                BBI.A0R(bbi, false);
            }
            String strFlightResultsPartySummary = FlightResultsFormattingKt.flightResultsPartySummary(flightResults, bfm, i5);
            if (strFlightResultsPartySummary == null) {
                bfm.AgE(-122524884);
            } else {
                bfm.AgE(-122524883);
                FlightResultsHeaderDetail(strFlightResultsPartySummary, null, bfm, 0, i3);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(flightResults, bRg2, i, i2);
        }
    }

    public static final void FlightResultsHeaderDetail(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-661728397);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    public static final void FlightResultsSeeAllButton(FlightResults flightResults, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1235077769);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightResults) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String str2 = flightResults.presentationId;
            String strA0d = FGI.A0d("flight_results_card:", str2, ":", str);
            FlightResultsViewModel.Factory factory = new FlightResultsViewModel.Factory(str2, AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            FlightResultsViewModel flightResultsViewModel = (FlightResultsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0d, C3cG.A0x(FlightResultsViewModel.class));
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a3d);
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, bfm.A67(flightResultsViewModel), AnonymousClass004.A1F(iA0d)) | AnonymousClass006.A1V(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new FlightResultsCardKt$FlightResultsSeeAllButton$1$1(flightResultsViewModel, flightResults, auraNavigatorA0b, str);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0R, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120182(flightResults, str, bRg2, i, i2);
        }
    }
}
