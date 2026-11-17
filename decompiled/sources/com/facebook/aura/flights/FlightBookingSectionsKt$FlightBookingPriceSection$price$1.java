package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.model.FlightRowData;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightBookingSectionsKt$FlightBookingPriceSection$price$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ FlightRowData $offer;
    public final /* synthetic */ int $travelers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightBookingSectionsKt$FlightBookingPriceSection$price$1(FlightRowData flightRowData, int i, BRg bRg, int i2, int i3) {
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
