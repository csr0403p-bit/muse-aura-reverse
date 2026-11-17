package com.facebook.aura.flights;

import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C3U4;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightResultsScreenKt$FlightResultsList$1$1$1$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ FlightRowSlice $departing;
    public final /* synthetic */ FlightResults $results;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightResultsScreenKt$FlightResultsList$1$1$1$1(FlightResults flightResults, FlightRowSlice flightRowSlice) {
        super(3);
        this.$results = flightResults;
        this.$departing = flightRowSlice;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        BRg bRgA0C = C3U4.A0C(BRg.A00, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall);
        FlightResults flightResults = this.$results;
        FlightRowSlice flightRowSlice = this.$departing;
        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgA0C);
        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function0);
        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
        FlightResultsScreenKt.m949FlightSectionLabel6a0pyJM(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a32), null, 0.0f, bfm, 0, 6);
        FlightResultsScreenKt.DepartingFlightSummary((FlightRowData) AbstractC0878AGe.A0F(flightResults.offers), flightRowSlice, null, bfm, 0, 4);
        BBI.A0R(bbi, true);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
