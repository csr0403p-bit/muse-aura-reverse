package com.facebook.aura.flights;

import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BBI;
import X.BFM;
import X.C3U4;
import X.C3cG;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightBookingSectionsKt$FlightBookingItinerarySection$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Map<Integer, String> $changeTargets;
    public final /* synthetic */ FlightRowData $offer;
    public final /* synthetic */ G0U<String, Unit> $onChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightBookingSectionsKt$FlightBookingItinerarySection$1$1(FlightRowData flightRowData, Map<Integer, String> map, G0U<? super String, Unit> g0u) {
        super(2);
        this.$offer = flightRowData;
        this.$changeTargets = map;
        this.$onChange = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        Function0 function0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            FlightRowData flightRowData = this.$offer;
            List<FlightRowSlice> list = flightRowData.slices;
            Map<Integer, String> map = this.$changeTargets;
            G0U<String, Unit> g0u = this.$onChange;
            int i2 = 0;
            for (FlightRowSlice flightRowSlice : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                FlightRowSlice flightRowSlice2 = flightRowSlice;
                if (i2 > 0) {
                    AuraDividerKt.AuraRowDivider(C3U4.A0C(C3cG.A09(bfm, 1363364012), 56.0f, 0.0f, AuraDimensKt.SpacingMedium, 0.0f), bfm, 0, 0);
                } else {
                    bfm.AgE(1363461073);
                }
                BBI bbiA07 = C3cG.A07(bfm);
                String str = map.get(Integer.valueOf(i2));
                if (str == null) {
                    bfm.AgE(1363592202);
                    BBI.A0R(bbiA07, false);
                    function0 = null;
                } else {
                    bfm.AgE(1363592203);
                    boolean zA1K = AnonymousClass003.A1K(bfm, g0u, str);
                    Object objAaT = bfm.AaT();
                    if (zA1K || objAaT == C78N.A00) {
                        objAaT = new FlightBookingSectionsKt$FlightBookingItinerarySection$1$1$1$1$1$1(g0u, str);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                    BBI.A0R(bbiA07, false);
                }
                FlightBookingSectionsKt.FlightBookingSliceRow(flightRowData, flightRowSlice2, function0, null, bfm, 0, 8);
                i2 = i3;
            }
            return;
        }
        bfm.Afo();
    }
}
