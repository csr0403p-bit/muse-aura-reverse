package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.C0CD;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.model.FlightRowSlice;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightResultsScreenKt$FlightResultsList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ FlightResults $results;

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightResultsList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ FlightResults $results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlightResults flightResults) {
            super(3);
            this.$results = flightResults;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                FlightResultsScreenKt.m949FlightSectionLabel6a0pyJM(FlightResultsScreenKt.selectionLabel(this.$results, bfm, 0), null, 0.0f, bfm, 0, 6);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightResultsScreenKt$FlightResultsList$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ FlightResults $results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FlightResults flightResults) {
            super(3);
            this.$results = flightResults;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
            } else {
                FlightResults flightResults = this.$results;
                FlightResultsScreenKt.FlightOffersCard(flightResults.presentationId, flightResults.offers, flightResults.getFocusSliceIndex(), AnonymousClass002.A1Z(flightResults.stage, FlightSelectionStage.COMPLETE), null, bfm, 0, 16);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        FlightRowSlice departingSlice = this.$results.getDepartingSlice();
        if (departingSlice != null) {
            c0cd.APJ("departing", null, B1V.A01(new FlightResultsScreenKt$FlightResultsList$1$1$1$1(this.$results, departingSlice), 1413572155, true));
        }
        c0cd.APJ("label", null, B1V.A01(new AnonymousClass2(this.$results), 2021611716, true));
        c0cd.APJ("offers", null, B1V.A01(new AnonymousClass3(this.$results), -2099108229, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightResultsScreenKt$FlightResultsList$1$1(FlightResults flightResults) {
        super(1);
        this.$results = flightResults;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
