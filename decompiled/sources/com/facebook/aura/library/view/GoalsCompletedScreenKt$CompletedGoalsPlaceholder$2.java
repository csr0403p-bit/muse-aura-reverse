package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKt$CompletedGoalsPlaceholder$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalsCompletedScreenKt$CompletedGoalsPlaceholder$2(float f, BRg bRg, String str, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$topPadding = f;
        this.$modifier = bRg;
        this.$contentDescription = str;
        this.$content = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        GoalsCompletedScreenKt.m1153CompletedGoalsPlaceholderAjpBEmI(this.$topPadding, this.$modifier, this.$contentDescription, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
