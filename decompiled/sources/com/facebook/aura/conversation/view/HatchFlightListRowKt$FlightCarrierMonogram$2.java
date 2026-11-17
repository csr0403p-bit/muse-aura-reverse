package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchFlightListRowKt$FlightCarrierMonogram$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $airline;
    public final /* synthetic */ float $letterSize;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFlightListRowKt$FlightCarrierMonogram$2(String str, C1DM c1dm, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$airline = str;
        this.$shape = c1dm;
        this.$letterSize = f;
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
        HatchFlightListRowKt.m598FlightCarrierMonogram942rkJo(this.$airline, this.$shape, this.$letterSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
