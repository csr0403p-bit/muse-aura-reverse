package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.feedback.FeedbackReason;
import com.facebook.aura.feedback.FeedbackVerdict;
import com.facebook.aura.feedback.view.HatchFeedbackViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$5$2$1 extends AbstractC7559F3s implements G0V<FeedbackReason, String, Unit> {
    public final /* synthetic */ HatchFeedbackViewModel $feedbackViewModel;
    public final /* synthetic */ String $unitId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$5$2$1(HatchFeedbackViewModel hatchFeedbackViewModel, String str) {
        super(2);
        this.$feedbackViewModel = hatchFeedbackViewModel;
        this.$unitId = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(FeedbackReason feedbackReason, String str) {
        invoke2(feedbackReason, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FeedbackReason feedbackReason, String str) {
        C7384Etj.A0Y(str, 1);
        this.$feedbackViewModel.submit(FeedTabScreenKt.feedUnitFeedbackTarget(this.$unitId), FeedbackVerdict.DOWN, str);
    }
}
