package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FlightResultsCardKt$FlightResultsCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ FlightResults $results;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightResultsCardKt$FlightResultsCard$2(FlightResults flightResults, String str, long j, C1D3 c1d3, BRg bRg, int i, int i2) {
        super(2);
        this.$results = flightResults;
        this.$sessionId = str;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
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
        FlightResultsCardKt.m948FlightResultsCardT042LqI(this.$results, this.$sessionId, this.$backgroundColor, this.$containerShape, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
