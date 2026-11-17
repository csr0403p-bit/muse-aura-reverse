package com.facebook.aura.flights;

import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1DP;
import X.C1YY;
import X.C1b8;
import X.C2VU;
import X.C3TQ;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.FlightStopsLabelKt;
import com.facebook.aura.conversation.view.FlightTimeLabelKt;
import com.facebook.aura.conversation.view.HatchFlightListRowKt;
import com.facebook.aura.conversation.view.richcontent.LocalConversationSessionIdKt;
import com.facebook.aura.header.view.ScrimConfig;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSegment;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.model.FlightTimestamp;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightResultsScreenKt {

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$DepartingFlightSummary$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ FlightRowSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FlightRowData flightRowData, FlightRowSlice flightRowSlice, BRg bRg, int i, int i2) {
            super(2);
            this.$offer = flightRowData;
            this.$slice = flightRowSlice;
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
            FlightResultsScreenKt.DepartingFlightSummary(this.$offer, this.$slice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightOffersCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $focusSliceIndex;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<FlightRowData> $offers;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ boolean $showsWholeTrip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, List<FlightRowData> list, int i, boolean z, BRg bRg, int i2, int i3) {
            super(2);
            this.$presentationId = str;
            this.$offers = list;
            this.$focusSliceIndex = i;
            this.$showsWholeTrip = z;
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
            FlightResultsScreenKt.FlightOffersCard(this.$presentationId, this.$offers, this.$focusSliceIndex, this.$showsWholeTrip, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightPrice$2, reason: invalid class name and case insensitive filesystem */
    public final class C120192 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isPerPerson;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120192(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$price = str;
            this.$isPerPerson = z;
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
            FlightResultsScreenKt.FlightPrice(this.$price, this.$isPerPerson, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightPrimaryLine$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1822Arm $style;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$style = c1822Arm;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightResultsScreenKt.FlightPrimaryLine(this.$text, this.$modifier, this.$style, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightResultLeg$2, reason: invalid class name and case insensitive filesystem */
    public final class C120202 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ FlightRowSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120202(FlightRowData flightRowData, FlightRowSlice flightRowSlice, BRg bRg, int i, int i2) {
            super(2);
            this.$offer = flightRowData;
            this.$slice = flightRowSlice;
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
            FlightResultsScreenKt.FlightResultLeg(this.$offer, this.$slice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightResultListItem$3, reason: invalid class name and case insensitive filesystem */
    public final class C120213 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ List<FlightRowSlice> $slices;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120213(FlightRowData flightRowData, List<FlightRowSlice> list, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$offer = flightRowData;
            this.$slices = list;
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
            FlightResultsScreenKt.FlightResultListItem(this.$offer, this.$slices, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightResultsList$2, reason: invalid class name and case insensitive filesystem */
    public final class C120222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C3TQ $padding;
        public final /* synthetic */ FlightResults $results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120222(FlightResults flightResults, C3TQ c3tq, BRg bRg, int i, int i2) {
            super(2);
            this.$results = flightResults;
            this.$padding = c3tq;
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
            FlightResultsScreenKt.FlightResultsList(this.$results, this.$padding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightResultsScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C120233 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ FlightResultsScreenKey $key;
        public final /* synthetic */ FlightResults $results;

        /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightResultsScreen$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ float $bottom;
            public final /* synthetic */ FlightResults $results;
            public final /* synthetic */ float $top;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FlightResults flightResults, float f, float f2) {
                super(2);
                this.$results = flightResults;
                this.$top = f;
                this.$bottom = f2;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    FlightResults flightResults = this.$results;
                    float f = AuraDimensKt.SpacingMedium;
                    FlightResultsScreenKt.FlightResultsList(flightResults, new C1DP(f, this.$top, f, this.$bottom), null, bfm, 0, 4);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120233(FlightResults flightResults, FlightResultsScreenKey flightResultsScreenKey) {
            super(4);
            this.$results = flightResults;
            this.$key = flightResultsScreenKey;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m950invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m950invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$results != null) {
                AnonymousClass003.A0l(bfm, -1381165224);
                AnonymousClass003.A0m(bfm, LocalConversationSessionIdKt.LocalConversationSessionId.A04(this.$key.sessionId), new AnonymousClass1(this.$results, f, f2), 113773866);
            } else {
                bfm.AgE(-1381370878);
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a42), null, C3U4.A04(C10G.A01, f), null, null, null, null, bfm, 0, 122);
                AnonymousClass001.A1D(bfm);
            }
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightResultsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ FlightResultsScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FlightResultsScreenKey flightResultsScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = flightResultsScreenKey;
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
            FlightResultsScreenKt.FlightResultsScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightSecondaryLine$1, reason: invalid class name and case insensitive filesystem */
    public final class C120241 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1822Arm $style;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120241(String str, C1822Arm c1822Arm, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$style = c1822Arm;
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
            FlightResultsScreenKt.FlightSecondaryLine(this.$text, this.$style, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightSecondaryLine$2, reason: invalid class name and case insensitive filesystem */
    public final class C120252 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1822Arm $style;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120252(String str, C1822Arm c1822Arm, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$style = c1822Arm;
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
            FlightResultsScreenKt.FlightSecondaryLine(this.$text, this.$style, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightTertiaryLine$1, reason: invalid class name and case insensitive filesystem */
    public final class C120261 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120261(String str, BRg bRg, int i, int i2) {
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
            FlightResultsScreenKt.FlightTertiaryLine(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightTertiaryLine$2, reason: invalid class name and case insensitive filesystem */
    public final class C120272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120272(String str, BRg bRg, int i, int i2) {
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
            FlightResultsScreenKt.FlightTertiaryLine(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FlightResultsList(FlightResults flightResults, C3TQ c3tq, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-11698833);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightResults) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c3tq);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            boolean zA1M = AnonymousClass001.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new FlightResultsScreenKt$FlightResultsList$1$1(flightResults);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c3tq, null, bfm, null, bRgA0T, (G0U) objAaT, (iA0d << 3) & 896, 506, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120222(flightResults, c3tq, bRg2, i, i2);
        }
    }

    public static final List<String> carrierIcons(FlightRowSlice flightRowSlice) {
        C7384Etj.A0Y(flightRowSlice, 0);
        List<FlightRowSegment> list = flightRowSlice.segments;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<FlightRowSegment> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().airlineIcon;
            if (str != null) {
                arrayListA0h.add(str);
            }
        }
        return C3cG.A0m(arrayListA0h);
    }

    public static final void DepartingFlightSummary(FlightRowData flightRowData, FlightRowSlice flightRowSlice, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(287735430);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, flightRowSlice);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a3f);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(C11U.A03(bRgA0R, auraTheme.getShapes(bfm, 6).card), auraTheme.getColors(bfm, 6).card);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA09 = C3U4.A09(bRgA01, f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightResultsScreenKt$DepartingFlightSummary$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
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
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C90m c90m = C90m.A00;
            List<String> listCarrierIcons = carrierIcons(flightRowSlice);
            String strAirlineLabel = HatchFlightListRowKt.airlineLabel(flightRowData, flightRowSlice, bfm, iA0d & 126);
            long j = auraTheme.getColors(bfm, 6).card;
            List<String> listDistinctCarriers = HatchFlightListRowKt.distinctCarriers(flightRowSlice.segments);
            BS0 bs0 = BRg.A00;
            HatchFlightListRowKt.m599HatchFlightCarrierIconsRZJR0o8(listCarrierIcons, strAirlineLabel, j, listDistinctCarriers, C10G.A07(bs0, 32.0f), 0.0f, null, 32.0f, bfm, 12607488, 96);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            int i4 = (iA0d >> 3) & 14;
            String strTimeRange = FlightResultsFormattingKt.timeRange(flightRowSlice, bfm, i4);
            if (strTimeRange == null) {
                bfm.AgE(627226981);
                BBI.A0R(bbi, false);
            } else {
                FlightPrimaryLine(strTimeRange, null, C3cH.A0X(bfm, auraTheme, 627226982).bodyRegular, bfm, 0, 2);
                BBI.A0R(bbi, false);
            }
            String strFlightNumbers = FlightResultsFormattingKt.flightNumbers(flightRowSlice, strA01);
            FlightTimestamp flightTimestamp = flightRowSlice.depart;
            FlightSecondaryLine(FlightResultsFormattingKt.detailPair(strFlightNumbers, FlightResultsFormattingKt.detailPair(flightTimestamp != null ? flightTimestamp.dateString : null, FlightStopsLabelKt.flightStopsLabel(flightRowSlice, bfm, i4 & 14), bfm, 0), bfm, 0), C3cH.A0E(bfm, auraTheme), null, bfm, 0, 4);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(flightRowData, flightRowSlice, bRg2, i, i2);
        }
    }

    public static final void FlightOffersCard(String str, List<FlightRowData> list, int i, boolean z, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1435989129);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            String str2 = (String) bfm.A6v(LocalConversationSessionIdKt.LocalConversationSessionId);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(C11U.A03(bRgA0R, auraTheme.getShapes(bfm, 6).card), auraTheme.getColors(bfm, 6).card);
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
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1630448773);
                int i5 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        FlightRowData flightRowData = (FlightRowData) next;
                        if (i5 > 0) {
                            BS0 bs0A09 = C3cG.A09(bfm, 1573378375);
                            float f = AuraDimensKt.SpacingMedium;
                            AuraDividerKt.AuraRowDivider(C3U4.A0C(bs0A09, f + AuraDimensKt.SpacingLargePlusMicro + AuraDimensKt.SpacingXsmallPlusNano, 0.0f, f, 0.0f), bfm, 0, 0);
                        } else {
                            bfm.AgE(1573619586);
                        }
                        BBI.A0R(bbi, false);
                        List<FlightRowSlice> listSingletonList = flightRowData.slices;
                        if (!z) {
                            listSingletonList = Collections.singletonList(listSingletonList.get(i));
                        }
                        boolean zA1P = AnonymousClass003.A1P(bfm, flightRowData, str2, bfm.A67(auraNavigatorA0b) | AnonymousClass004.A1F(iA0d));
                        Object objAaT = bfm.AaT();
                        if (zA1P || objAaT == C78N.A00) {
                            objAaT = new FlightResultsScreenKt$FlightOffersCard$1$1$1$1(auraNavigatorA0b, str, flightRowData, str2);
                            bfm.Ai0(objAaT);
                        }
                        FlightResultListItem(flightRowData, listSingletonList, (Function0) objAaT, null, bfm, 0, 8);
                        i5 = i6;
                    }
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, list, i, z, bRg2, i2, i3);
        }
    }

    public static final void FlightPrice(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(89624798);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, C2VU.A01);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            int i4 = R.string._name_removed__res_0x7f120a41;
            if (z) {
                i4 = R.string._name_removed__res_0x7f120a38;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i4), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120192(str, z, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlightPrimaryLine(java.lang.String r20, X.BRg r21, X.C1822Arm r22, X.BFM r23, int r24, int r25) {
        /*
            r8 = r21
            r11 = r22
            r0 = 635184221(0x25dc245d, float:3.8188557E-16)
            r3 = r23
            r3.AgG(r0)
            r2 = r24
            r0 = r24 & 6
            r7 = r20
            if (r0 != 0) goto Lb7
            int r5 = X.AnonymousClass004.A0d(r3, r7)
            r5 = r5 | r24
        L1a:
            r1 = r25
            r6 = r25 & 2
            if (r6 == 0) goto Lac
            r5 = r5 | 48
        L22:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L35
            r0 = r25 & 4
            if (r0 != 0) goto L32
            boolean r4 = r3.A65(r11)
            r0 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L34
        L32:
            r0 = 128(0x80, float:1.794E-43)
        L34:
            r5 = r5 | r0
        L35:
            boolean r0 = X.AnonymousClass004.A1J(r5)
            boolean r0 = X.AnonymousClass001.A1b(r0, r3, r5)
            if (r0 == 0) goto La8
            r3.Afy()
            r0 = r24 & 1
            r4 = 6
            if (r0 == 0) goto L95
            boolean r0 = r3.AEk()
            if (r0 != 0) goto L95
            int r5 = X.AnonymousClass003.A0B(r1, r3, r5)
        L51:
            r3.AAb()
            com.facebook.aura.vds.compose.theme.AuraTheme r0 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            long r9 = X.C3cH.A06(r3, r0)
            r18 = 2
            int r23 = X.AnonymousClass005.A01(r5)
            r0 = r5 & 112(0x70, float:1.57E-43)
            r23 = r23 | r0
            int r0 = r5 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r23 = r23 | r0
            r25 = 14832(0x39f0, float:2.0784E-41)
            r12 = 0
            r15 = 0
            r17 = 1
            r13 = r12
            r14 = r12
            r16 = r15
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r3
            r24 = r4
            com.facebook.aura.vds.compose.text.AuraTextKt.m2639AuraTextUY9GdpU(r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L81:
            X.BBb r3 = r3.AAc()
            if (r3 == 0) goto L94
            com.facebook.aura.flights.FlightResultsScreenKt$FlightPrimaryLine$1 r0 = new com.facebook.aura.flights.FlightResultsScreenKt$FlightPrimaryLine$1
            r4 = r0
            r5 = r7
            r6 = r8
            r7 = r11
            r8 = r2
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A06 = r0
        L94:
            return
        L95:
            if (r6 == 0) goto L99
            X.BS0 r8 = X.BRg.A00
        L99:
            r0 = r25 & 4
            if (r0 == 0) goto L51
            com.facebook.aura.vds.compose.theme.AuraTheme r0 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            com.facebook.aura.vds.compose.theme.AuraTypography r0 = r0.getTypography(r3, r4)
            X.Arm r11 = r0.bodyMedium
            r5 = r5 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L51
        La8:
            r3.Afo()
            goto L81
        Lac:
            r0 = r24 & 48
            if (r0 != 0) goto L22
            int r0 = X.AnonymousClass004.A0e(r3, r8)
            r5 = r5 | r0
            goto L22
        Lb7:
            r5 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.flights.FlightResultsScreenKt.FlightPrimaryLine(java.lang.String, X.BRg, X.Arm, X.BFM, int, int):void");
    }

    public static final void FlightResultLeg(FlightRowData flightRowData, FlightRowSlice flightRowSlice, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-952120471);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, flightRowSlice);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a3f);
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
            int i4 = (iA0d >> 3) & 14;
            String strTimeRange = FlightResultsFormattingKt.timeRange(flightRowSlice, bfm, i4);
            if (strTimeRange == null) {
                bfm.AgE(-1962139350);
            } else {
                bfm.AgE(-1962139349);
                FlightPrimaryLine(strTimeRange, null, null, bfm, 0, 6);
            }
            BBI.A0R(bbi, false);
            String strCompactRoute = FlightResultsFormattingKt.compactRoute(flightRowSlice, bfm, i4);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            FlightSecondaryLine(strCompactRoute, C3cH.A0B(bfm, auraTheme), null, bfm, 0, 4);
            FlightSecondaryLine(FlightResultsFormattingKt.detailPair(HatchFlightListRowKt.airlineLabel(flightRowData, flightRowSlice, bfm, iA0d & 126), FlightStopsLabelKt.flightStopsWithAirports(flightRowSlice, bfm, AnonymousClass006.A0E(flightRowSlice, i4)), bfm, 0), C3cH.A0B(bfm, auraTheme), null, bfm, 0, 4);
            FlightTertiaryLine(FlightResultsFormattingKt.detailPair(flightRowSlice.duration, FlightResultsFormattingKt.flightNumbers(flightRowSlice, strA01), bfm, 0), null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120202(flightRowData, flightRowSlice, bRg2, i, i2);
        }
    }

    public static final void FlightResultListItem(FlightRowData flightRowData, List<FlightRowSlice> list, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strFlightFromPrice;
        boolean z;
        BRg bRg2 = bRg;
        bfm.AgG(-1759259214);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<FlightRowSlice> it = list.iterator();
            while (it.hasNext()) {
                AbstractC0882AGj.A0r(it.next().segments, arrayListA0h);
            }
            BRg bRgA05 = C0v5.A05(AnonymousClass001.A0R(bRg2), null, function0, true);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingXsmallPlusNano;
            BRg bRgA0B = C3U4.A0B(bRgA05, f, f2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightResultsScreenKt$FlightResultListItem$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f2), bfm, C2VU.A05, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator<FlightRowSlice> it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC0882AGj.A0r(carrierIcons(it2.next()), arrayListA0h2);
            }
            List listA0m = C3cG.A0m(arrayListA0h2);
            int i4 = iA0d & 14;
            String strAirlineLabel = HatchFlightListRowKt.airlineLabel(flightRowData, (FlightRowSlice) AbstractC0878AGe.A0F(list), bfm, i4);
            long j = C3cH.A0W(bfm).card;
            List<String> listDistinctCarriers = HatchFlightListRowKt.distinctCarriers(arrayListA0h);
            BS0 bs0 = BRg.A00;
            HatchFlightListRowKt.m599HatchFlightCarrierIconsRZJR0o8(listA0m, strAirlineLabel, j, listDistinctCarriers, C10G.A07(bs0, 24.0f), 0.0f, null, 24.0f, bfm, 12607488, 96);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 159077166);
            while (itA0w.hasNext()) {
                FlightResultLeg(flightRowData, (FlightRowSlice) itA0w.next(), null, bfm, i4, 4);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            String str = flightRowData.price;
            String str2 = flightRowData.fromPrice;
            if (str != null) {
                bfm.AgE(360325192);
                strFlightFromPrice = flightRowData.pricePerPassenger;
                if (strFlightFromPrice == null) {
                    strFlightFromPrice = str;
                }
            } else if (str2 != null) {
                bfm.AgE(360333157);
                String str3 = flightRowData.fromPricePerPassenger;
                if (str3 != null) {
                    str2 = str3;
                }
                strFlightFromPrice = FlightTimeLabelKt.flightFromPrice(str2, bfm, 0);
                z = flightRowData.fromPricePerPassenger != null;
            } else {
                bfm.AgE(-1714338388);
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
            }
            FlightPrice(strFlightFromPrice, z, c90m.A4D(C2VU.A04, bs0), bfm, 0, 0);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120213(flightRowData, list, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlightResultsScreen(com.facebook.aura.flights.FlightResultsScreenKey r44, X.BRg r45, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.flights.FlightResultsScreenKt.FlightResultsScreen(com.facebook.aura.flights.FlightResultsScreenKey, X.BRg, X.BFM, int, int):void");
    }

    public static final void FlightSecondaryLine(String str, C1822Arm c1822Arm, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c120252;
        BRg bRg2 = bRg;
        bfm.AgG(71768411);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c120252 = new C120241(str, c1822Arm, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c120252);
                }
                return;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A07(bfm, AuraTheme.INSTANCE), c1822Arm, null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0d << 6) & 7168), 6, 14832);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c120252 = new C120252(str, c1822Arm, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c120252);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* renamed from: FlightSectionLabel-6a0pyJM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m949FlightSectionLabel6a0pyJM(java.lang.String r23, X.BRg r24, float r25, X.BFM r26, int r27, int r28) {
        /*
            r3 = r24
            r2 = r25
            r1 = 0
            r10 = r23
            X.C7384Etj.A0Y(r10, r1)
            r0 = 943764598(0x3840b476, float:4.5944435E-5)
            r6 = r26
            r6.AgG(r0)
            r5 = r27
            r0 = r27 & 6
            if (r0 != 0) goto Lcd
            int r7 = X.AnonymousClass004.A0d(r6, r10)
            r7 = r7 | r27
        L1e:
            r4 = r28
            r9 = r28 & 2
            if (r9 == 0) goto Lc2
            r7 = r7 | 48
        L26:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L39
            r0 = r28 & 4
            if (r0 != 0) goto L36
            boolean r8 = r6.A62(r2)
            r0 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L38
        L36:
            r0 = 128(0x80, float:1.794E-43)
        L38:
            r7 = r7 | r0
        L39:
            boolean r0 = X.AnonymousClass004.A1J(r7)
            boolean r0 = X.AnonymousClass001.A1b(r0, r6, r7)
            if (r0 == 0) goto Lbe
            r6.Afy()
            r0 = r27 & 1
            if (r0 == 0) goto Lb1
            boolean r0 = r6.AEk()
            if (r0 != 0) goto Lb1
            int r7 = X.AnonymousClass003.A0B(r4, r6, r7)
        L54:
            r6.AAb()
            com.facebook.aura.vds.compose.theme.AuraTheme r8 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            r0 = 6
            com.facebook.aura.vds.compose.theme.AuraTypography r0 = r8.getTypography(r6, r0)
            X.Arm r14 = r0.footnoteMedium
            long r12 = X.C3cH.A07(r6, r8)
            float r8 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingMedium
            float r0 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingXsmall
            X.BRg r9 = X.C3U4.A0C(r3, r8, r2, r8, r0)
            java.lang.Object r8 = r6.AaT()
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L79
            com.facebook.aura.flights.FlightResultsScreenKt$FlightSectionLabel$1$1 r8 = com.facebook.aura.flights.FlightResultsScreenKt$FlightSectionLabel$1$1.INSTANCE
            r6.Ai0(r8)
        L79:
            X.G0U r8 = (X.G0U) r8
            r15 = 0
            X.BRg r11 = X.ARD.A01(r9, r8, r1)
            r26 = r7 & 14
            r28 = 16368(0x3ff0, float:2.2936E-41)
            r16 = r15
            r17 = r15
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r15
            r23 = r15
            r24 = r15
            r25 = r6
            r27 = r1
            r18 = r1
            com.facebook.aura.vds.compose.text.AuraTextKt.m2639AuraTextUY9GdpU(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L9d:
            X.BBb r1 = r6.AAc()
            if (r1 == 0) goto Lb0
            com.facebook.aura.flights.FlightResultsScreenKt$FlightSectionLabel$2 r0 = new com.facebook.aura.flights.FlightResultsScreenKt$FlightSectionLabel$2
            r6 = r10
            r9 = r5
            r10 = r4
            r5 = r0
            r7 = r3
            r8 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r1.A06 = r0
        Lb0:
            return
        Lb1:
            if (r9 == 0) goto Lb5
            X.BS0 r3 = X.BRg.A00
        Lb5:
            r0 = r28 & 4
            if (r0 == 0) goto L54
            float r2 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingXsmall
            r7 = r7 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L54
        Lbe:
            r6.Afo()
            goto L9d
        Lc2:
            r0 = r27 & 48
            if (r0 != 0) goto L26
            int r0 = X.AnonymousClass004.A0e(r6, r3)
            r7 = r7 | r0
            goto L26
        Lcd:
            r7 = r5
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.flights.FlightResultsScreenKt.m949FlightSectionLabel6a0pyJM(java.lang.String, X.BRg, float, X.BFM, int, int):void");
    }

    public static final void FlightTertiaryLine(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c120272;
        BRg bRg2 = bRg;
        bfm.AgG(-1125424247);
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
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c120272 = new C120261(str, bRg2, i, i2);
                    bBbAAc.A06 = c120272;
                }
                return;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A05(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14832);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c120272 = new C120272(str, bRg2, i, i2);
            bBbAAc.A06 = c120272;
        }
    }

    public static final String selectionLabel(FlightResults flightResults, BFM bfm, int i) {
        int i2;
        if (flightResults.stage == FlightSelectionStage.DEPARTING || flightResults.isOneWay()) {
            i2 = R.string._name_removed__res_0x7f120a33;
        } else {
            FlightSelectionStage flightSelectionStage = flightResults.stage;
            FlightSelectionStage flightSelectionStage2 = FlightSelectionStage.RETURNING;
            i2 = R.string._name_removed__res_0x7f120a3e;
            if (flightSelectionStage == flightSelectionStage2) {
                i2 = R.string._name_removed__res_0x7f120a39;
            }
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }

    public static final ScrimConfig flightHeaderScrim(BFM bfm, int i) {
        long j = C3cH.A0W(bfm).highlight;
        return new ScrimConfig.CustomStops(new HxE[]{AnonymousClass007.A0g(0.0f, j), AnonymousClass007.A0g(1.0f, j)});
    }
}
