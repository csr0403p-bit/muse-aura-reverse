package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightBookingSectionsKt$FlightBookingSliceLine$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightBookingSectionsKt$FlightBookingSliceLine$2(String str, C1822Arm c1822Arm, long j, BRg bRg, int i, int i2) {
        super(2);
        this.$text = str;
        this.$style = c1822Arm;
        this.$color = j;
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
        FlightBookingSectionsKt.m943FlightBookingSliceLinecf5BqRc(this.$text, this.$style, this.$color, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
