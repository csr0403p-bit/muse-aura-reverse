package com.facebook.aura.agentpermission;

import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BS0;
import X.C3U4;
import X.C3cG;
import X.F60;
import X.G0V;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengersSheetKt$PassengerSeatsSection$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ List<FlightCheckoutPassengerSeat> $seats;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightCheckoutPassengersSheetKt$PassengerSeatsSection$2$1(List<FlightCheckoutPassengerSeat> list) {
        super(2);
        this.$seats = list;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        float f;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            int i2 = 0;
            for (FlightCheckoutPassengerSeat flightCheckoutPassengerSeat : this.$seats) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                FlightCheckoutPassengerSeat flightCheckoutPassengerSeat2 = flightCheckoutPassengerSeat;
                if (i2 > 0) {
                    BS0 bs0A09 = C3cG.A09(bfm, 1527126755);
                    if (flightCheckoutPassengerSeat2.airlineIconUrl != null) {
                        f = FlightCheckoutPassengersSheetKt.SeatRowTextStart;
                    } else {
                        f = AuraDimensKt.SpacingMedium;
                    }
                    AuraDividerKt.AuraRowDivider(C3U4.A0C(bs0A09, f, 0.0f, AuraDimensKt.SpacingMedium, 0.0f), bfm, 0, 0);
                } else {
                    bfm.AgE(1527390069);
                }
                AnonymousClass001.A1D(bfm);
                FlightCheckoutPassengersSheetKt.PassengerSeatRow(flightCheckoutPassengerSeat2, null, bfm, FlightCheckoutPassengerSeat.$stable, 2);
                i2 = i3;
            }
            return;
        }
        bfm.Afo();
    }
}
