package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C9Vm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchPlaceGalleryLoader$SourceIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C9Vm $source;
    public final /* synthetic */ long $tint;
    public final /* synthetic */ HatchPlaceGalleryLoader $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPlaceGalleryLoader$SourceIcon$1(HatchPlaceGalleryLoader hatchPlaceGalleryLoader, C9Vm c9Vm, long j, BRg bRg, int i) {
        super(2);
        this.$tmp0_rcvr = hatchPlaceGalleryLoader;
        this.$source = c9Vm;
        this.$tint = j;
        this.$modifier = bRg;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.mo8SourceIconiJQMabo(this.$source, this.$tint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
