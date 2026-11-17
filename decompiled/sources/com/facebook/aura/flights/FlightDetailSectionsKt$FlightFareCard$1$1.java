package com.facebook.aura.flights;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BBI;
import X.BFM;
import X.C3cG;
import X.G0V;
import X.HxE;
import com.facebook.aura.R;
import com.facebook.aura.model.FlightRowSlice;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightDetailSectionsKt$FlightFareCard$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $price;
    public final /* synthetic */ FlightRowSlice $slice;
    public final /* synthetic */ List<HxE<String, String>> $terms;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightDetailSectionsKt$FlightFareCard$1$1(FlightRowSlice flightRowSlice, String str, List<HxE<String, String>> list) {
        super(2);
        this.$slice = flightRowSlice;
        this.$price = str;
        this.$terms = list;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            String strA01 = this.$slice.fareBrand;
            if (strA01 == null) {
                bfm.AgE(1034533161);
                strA01 = FlightDetailSectionsKt.cabinLabel(this.$slice, bfm, 0);
            } else {
                bfm.AgE(1034531828);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            if (strA01 == null) {
                bfm.AgE(1034534292);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a08);
            } else {
                bfm.AgE(1034531905);
            }
            BBI.A0R(bbiA07, false);
            FlightDetailSectionsKt.FlightDetailRow(strA01, this.$price, null, bfm, 0, 4);
            if (!this.$terms.isEmpty()) {
                bfm.AgE(1034538194);
                FlightDetailSectionsKt.FlightDetailDivider(null, bfm, 0, 1);
            } else {
                bfm.AgE(2005933125);
            }
            BBI.A0R(bbiA07, false);
            for (HxE<String, String> hxE : this.$terms) {
                FlightDetailSectionsKt.FlightFareTerm(hxE.first, hxE.second, null, bfm, 0, 4);
            }
            return;
        }
        bfm.Afo();
    }
}
