package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedTapKind;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedTapReportingKt$rememberFeedTapReporter$1$1 extends AbstractC7559F3s implements G0U<FeedTapKind, Unit> {
    public final /* synthetic */ String $unitId;
    public final /* synthetic */ FeedViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FeedTapKind feedTapKind) {
        C7384Etj.A0Y(feedTapKind, 0);
        this.$viewModel.recordTap(this.$unitId, feedTapKind);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTapReportingKt$rememberFeedTapReporter$1$1(FeedViewModel feedViewModel, String str) {
        super(1);
        this.$viewModel = feedViewModel;
        this.$unitId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(FeedTapKind feedTapKind) {
        invoke2(feedTapKind);
        return Unit.INSTANCE;
    }
}
