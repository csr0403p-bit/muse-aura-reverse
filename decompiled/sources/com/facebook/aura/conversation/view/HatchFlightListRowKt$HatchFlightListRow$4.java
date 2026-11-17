package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.FlightRowData;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchFlightListRowKt$HatchFlightListRow$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ FlightRowData $flight;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<FlightRowData, Unit> $onOpen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFlightListRowKt$HatchFlightListRow$4(FlightRowData flightRowData, long j, BRg bRg, G0U<? super FlightRowData, Unit> g0u, int i, int i2) {
        super(2);
        this.$flight = flightRowData;
        this.$backgroundColor = j;
        this.$modifier = bRg;
        this.$onOpen = g0u;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchFlightListRowKt.m600HatchFlightListRowsW7UJKQ(this.$flight, this.$backgroundColor, this.$modifier, this.$onOpen, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
