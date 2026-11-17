package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HotelResultsCardKt$HotelResultsCard$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1DM $containerShape;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ HotelResults $results;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelResultsCardKt$HotelResultsCard$3(HotelResults hotelResults, String str, long j, C1DM c1dm, BRg bRg, int i, int i2) {
        super(2);
        this.$results = hotelResults;
        this.$sessionId = str;
        this.$backgroundColor = j;
        this.$containerShape = c1dm;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HotelResultsCardKt.m1080HotelResultsCardT042LqI(this.$results, this.$sessionId, this.$backgroundColor, this.$containerShape, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
