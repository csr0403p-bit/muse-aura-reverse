package com.facebook.aura.feed.view;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class FeedTabScreenKt$FeedTabScreen$10$11$1 extends C7438Evz implements G0V<FeedUnitViewportContext, Boolean, Unit> {
    public FeedTabScreenKt$FeedTabScreen$10$11$1(Object obj) {
        super(2, obj, FeedViewModel.class, "onUnitVisibilityChanged", "onUnitVisibilityChanged(Lcom/facebook/aura/feed/repo/FeedUnitViewportContext;Z)V", 0);
    }

    public final void invoke(FeedUnitViewportContext feedUnitViewportContext, boolean z) {
        ((FeedViewModel) AnonymousClass006.A0o(feedUnitViewportContext, this)).onUnitVisibilityChanged(feedUnitViewportContext, z);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(FeedUnitViewportContext feedUnitViewportContext, Boolean bool) {
        invoke(feedUnitViewportContext, AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
