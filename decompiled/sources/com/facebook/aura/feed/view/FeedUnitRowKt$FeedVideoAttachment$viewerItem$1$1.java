package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.feed.repo.FeedTapKind;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoAttachment$viewerItem$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedVideoAttachment$viewerItem$1$1(G0U<? super FeedTapKind, Unit> g0u) {
        super(0);
        this.$reportTap = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$reportTap.invoke(FeedTapKind.SOCIAL_SOURCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
