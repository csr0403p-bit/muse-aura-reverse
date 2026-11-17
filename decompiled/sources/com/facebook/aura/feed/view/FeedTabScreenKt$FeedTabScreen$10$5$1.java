package com.facebook.aura.feed.view;

import X.C7438Evz;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class FeedTabScreenKt$FeedTabScreen$10$5$1 extends C7438Evz implements Function0<Unit> {
    public FeedTabScreenKt$FeedTabScreen$10$5$1(Object obj) {
        super(0, obj, FeedViewModel.class, "loadNextPage", "loadNextPage()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FeedViewModel) this.receiver).loadNextPage();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
