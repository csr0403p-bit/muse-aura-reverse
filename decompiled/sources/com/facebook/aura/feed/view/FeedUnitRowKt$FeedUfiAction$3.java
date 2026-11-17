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
public final class FeedUnitRowKt$FeedUfiAction$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ String $label;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ Boolean $selected;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUfiAction$3(int i, String str, long j, Function0<Unit> function0, BRg bRg, Boolean bool, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, int i2, int i3) {
        super(2);
        this.$iconRes = i;
        this.$contentDescription = str;
        this.$tint = j;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$selected = bool;
        this.$label = str2;
        this.$leading = g0v;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        FeedUnitRowKt.m836FeedUfiActionlVb_Clg(this.$iconRes, this.$contentDescription, this.$tint, this.$onClick, this.$modifier, this.$selected, this.$label, this.$leading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
