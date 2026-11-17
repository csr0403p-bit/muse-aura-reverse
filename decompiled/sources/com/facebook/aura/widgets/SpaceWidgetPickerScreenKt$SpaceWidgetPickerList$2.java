package com.facebook.aura.widgets;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.spaces.repo.SpaceCard;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<SpaceCard, Unit> $onSpacePicked;
    public final /* synthetic */ AHD<SpaceCard> $spaces;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$2(AHD<SpaceCard> ahd, float f, float f2, G0U<? super SpaceCard, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$spaces = ahd;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onSpacePicked = g0u;
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
        SpaceWidgetPickerScreenKt.m3160SpaceWidgetPickerListo3XDK20(this.$spaces, this.$topPadding, this.$bottomPadding, this.$onSpacePicked, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
