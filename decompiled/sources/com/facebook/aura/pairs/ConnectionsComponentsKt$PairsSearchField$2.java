package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsComponentsKt$PairsSearchField$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $borderColor;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onQueryChange;
    public final /* synthetic */ String $placeholder;
    public final /* synthetic */ String $query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsComponentsKt$PairsSearchField$2(String str, G0U<? super String, Unit> g0u, BRg bRg, String str2, long j, long j2, int i, int i2) {
        super(2);
        this.$query = str;
        this.$onQueryChange = g0u;
        this.$modifier = bRg;
        this.$placeholder = str2;
        this.$backgroundColor = j;
        this.$borderColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ConnectionsComponentsKt.m1651PairsSearchFieldwBJOh4Y(this.$query, this.$onQueryChange, this.$modifier, this.$placeholder, this.$backgroundColor, this.$borderColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
