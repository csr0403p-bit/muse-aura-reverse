package com.facebook.aura.agentpermission;

import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BBI;
import X.BFM;
import X.C3cG;
import X.C3cJ;
import X.F60;
import X.G0V;
import X.HxE;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengersSheetKt$PassengerSection$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ List<HxE<String, String>> $rows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightCheckoutPassengersSheetKt$PassengerSection$2$1(List<HxE<String, String>> list) {
        super(2);
        this.$rows = list;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            int i2 = 0;
            for (HxE<String, String> hxE : this.$rows) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                HxE<String, String> hxE2 = hxE;
                String str = hxE2.first;
                String str2 = hxE2.second;
                if (i2 > 0) {
                    C3cJ.A0Z(bfm, -1379010564);
                } else {
                    bfm.AgE(200413709);
                }
                BBI bbiA07 = C3cG.A07(bfm);
                if (str2 == null) {
                    bfm.AgE(200443624);
                    CheckoutRowPrimitivesKt.CheckoutTextRow(str, null, null, 0, null, null, bfm, 48, 60);
                } else {
                    bfm.AgE(200518055);
                    FlightCheckoutPassengersSheetKt.PassengerDetailRow(str, str2, null, bfm, 0, 4);
                }
                BBI.A0R(bbiA07, false);
                i2 = i3;
            }
            return;
        }
        bfm.Afo();
    }
}
