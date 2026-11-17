package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitOverflow$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<FeedUnit, Unit> $onDelete;
    public final /* synthetic */ long $tint;
    public final /* synthetic */ FeedUnit $unit;
    public final /* synthetic */ float $verticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitOverflow$2(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, BRg bRg, long j, float f, int i2, int i3) {
        super(2);
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$onDelete = g0u;
        this.$modifier = bRg;
        this.$tint = j;
        this.$verticalPadding = f;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        FeedUnitRowKt.m837FeedUnitOverflowjgcpOPg(this.$unit, this.$absolutePosition, this.$onDelete, this.$modifier, this.$tint, this.$verticalPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
