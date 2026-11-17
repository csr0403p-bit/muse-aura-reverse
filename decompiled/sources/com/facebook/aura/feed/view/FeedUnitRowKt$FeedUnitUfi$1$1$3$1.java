package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitUfi$1$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<FeedUnit, Unit> $onComment;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitUfi$1$1$3$1(G0U<? super FeedUnit, Unit> g0u, FeedUnit feedUnit) {
        super(0);
        this.$onComment = g0u;
        this.$unit = feedUnit;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onComment.invoke(this.$unit);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
