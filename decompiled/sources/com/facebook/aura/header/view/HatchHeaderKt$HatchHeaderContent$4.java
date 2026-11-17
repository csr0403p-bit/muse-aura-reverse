package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1AC;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchHeaderKt$HatchHeaderContent$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
    public final /* synthetic */ Function0<Boolean> $actionsVisible;
    public final /* synthetic */ float $minTitleSideInset;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $navigationButton;
    public final /* synthetic */ C1AC $sideContentVerticalAlignment;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $title;
    public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
    public final /* synthetic */ boolean $trackActionBounds;
    public final /* synthetic */ boolean $trackSideContentBounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchHeaderKt$HatchHeaderContent$4(HatchHeaderTitleAlignment hatchHeaderTitleAlignment, BRg bRg, float f, C1AC c1ac, Function0<Boolean> function0, boolean z, boolean z2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, int i, int i2) {
        super(2);
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$modifier = bRg;
        this.$minTitleSideInset = f;
        this.$sideContentVerticalAlignment = c1ac;
        this.$actionsVisible = function0;
        this.$trackSideContentBounds = z;
        this.$trackActionBounds = z2;
        this.$navigationButton = g0v;
        this.$title = g0v2;
        this.$actions = g0v3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchHeaderKt.m993HatchHeaderContentyBXNGS4(this.$titleAlignment, this.$modifier, this.$minTitleSideInset, this.$sideContentVerticalAlignment, this.$actionsVisible, this.$trackSideContentBounds, this.$trackActionBounds, this.$navigationButton, this.$title, this.$actions, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
