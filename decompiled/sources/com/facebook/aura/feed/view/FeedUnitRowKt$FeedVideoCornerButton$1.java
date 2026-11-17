package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoCornerButton$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ float $iconInset;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedVideoCornerButton$1(int i, String str, float f, Function0<Unit> function0, BRg bRg, int i2, int i3) {
        super(2);
        this.$iconRes = i;
        this.$contentDescription = str;
        this.$iconInset = f;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        FeedUnitRowKt.m839FeedVideoCornerButtonTN_CM5M(this.$iconRes, this.$contentDescription, this.$iconInset, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
