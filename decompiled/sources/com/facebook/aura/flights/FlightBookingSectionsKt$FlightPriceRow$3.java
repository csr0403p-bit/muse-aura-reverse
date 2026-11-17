package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightBookingSectionsKt$FlightPriceRow$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ String $value;
    public final /* synthetic */ long $valueColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightBookingSectionsKt$FlightPriceRow$3(String str, String str2, String str3, long j, BRg bRg, int i, int i2) {
        super(2);
        this.$title = str;
        this.$subtitle = str2;
        this.$value = str3;
        this.$valueColor = j;
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
        FlightBookingSectionsKt.m944FlightPriceRowuDo3WH8(this.$title, this.$subtitle, this.$value, this.$valueColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
