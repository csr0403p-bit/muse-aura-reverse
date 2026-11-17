package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedPost$1$4$1 extends AbstractC7559F3s implements G0U<FeedUnit, Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDelete;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FeedUnit feedUnit) {
        C7384Etj.A0Y(feedUnit, 0);
        AnonymousClass001.A1H(feedUnit, this.$onDelete, this.$absolutePosition);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedTabScreenKt$FeedPost$1$4$1(G0V<? super FeedUnit, ? super Integer, Unit> g0v, int i) {
        super(1);
        this.$onDelete = g0v;
        this.$absolutePosition = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(FeedUnit feedUnit) {
        invoke2(feedUnit);
        return Unit.INSTANCE;
    }
}
