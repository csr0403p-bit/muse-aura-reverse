package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BBI;
import X.BFM;
import X.C3cG;
import X.C3cH;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.model.FlightRowData;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightBookingSectionsKt$FlightBookingPriceSection$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ FlightRowData $offer;
    public final /* synthetic */ String $price;
    public final /* synthetic */ int $travelers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightBookingSectionsKt$FlightBookingPriceSection$1$2(FlightRowData flightRowData, int i, String str) {
        super(2);
        this.$offer = flightRowData;
        this.$travelers = i;
        this.$price = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        String strA0t;
        BBI bbiA07;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            String str = FlightBookingSectionsKt.totalLabel(this.$offer, bfm, 0);
            String str2 = this.$offer.pricePerPassenger;
            if (str2 == null) {
                bbiA07 = AnonymousClass002.A0M(bfm, 1905843735);
            } else {
                bfm.AgE(1905843736);
                strA0t = AnonymousClass001.A0t(bfm, str2, R.string._name_removed__res_0x7f120a51);
                bbiA07 = C3cG.A07(bfm);
                if (strA0t != null) {
                    bfm.AgE(-77069230);
                }
                BBI.A0R(bbiA07, false);
                FlightBookingSectionsKt.m944FlightPriceRowuDo3WH8(str, strA0t, this.$price, C3cH.A0W(bfm).primaryText, null, bfm, 0, 16);
                return;
            }
            bfm.AgE(-77066781);
            strA0t = FlightBookingSectionsKt.travelersLabel(this.$travelers, bfm, 0);
            BBI.A0R(bbiA07, false);
            FlightBookingSectionsKt.m944FlightPriceRowuDo3WH8(str, strA0t, this.$price, C3cH.A0W(bfm).primaryText, null, bfm, 0, 16);
            return;
        }
        bfm.Afo();
    }
}
