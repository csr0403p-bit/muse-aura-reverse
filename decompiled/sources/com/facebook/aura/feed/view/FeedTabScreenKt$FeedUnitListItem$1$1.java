package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BL5;
import X.C2BR;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedUnitListItem$1$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ G0V<FeedUnitViewportContext, Boolean, Unit> $onUnitVisibilityChanged;
    public final /* synthetic */ Function0<Integer> $totalCount;
    public final /* synthetic */ FeedUnit $unit;

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedUnitListItem$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0V<FeedUnitViewportContext, Boolean, Unit> $onUnitVisibilityChanged;
        public final /* synthetic */ FeedUnitViewportContext $viewportContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super FeedUnitViewportContext, ? super Boolean, Unit> g0v, FeedUnitViewportContext feedUnitViewportContext) {
            super(0);
            this.$onUnitVisibilityChanged = g0v;
            this.$viewportContext = feedUnitViewportContext;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onUnitVisibilityChanged.invoke(this.$viewportContext, AnonymousClass001.A0h());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final BL5 invoke(C2BR c2br) {
        C7384Etj.A0Y(c2br, 0);
        FeedUnitViewportContext feedUnitViewportContextFeedCardViewportContext = FeedTabScreenKt.feedCardViewportContext(this.$unit, this.$absolutePosition, AnonymousClass001.A0F(this.$totalCount.invoke()));
        this.$onUnitVisibilityChanged.invoke(feedUnitViewportContextFeedCardViewportContext, AnonymousClass001.A0i());
        return new BL5(new AnonymousClass1(this.$onUnitVisibilityChanged, feedUnitViewportContextFeedCardViewportContext));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedTabScreenKt$FeedUnitListItem$1$1(FeedUnit feedUnit, int i, Function0<Integer> function0, G0V<? super FeedUnitViewportContext, ? super Boolean, Unit> g0v) {
        super(1);
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$totalCount = function0;
        this.$onUnitVisibilityChanged = g0v;
    }
}
