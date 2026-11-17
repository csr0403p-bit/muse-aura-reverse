package com.facebook.aura.feedback.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import com.facebook.aura.feedback.FeedbackTarget;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FeedbackWriteSheetKey;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedbackWriteSheetKt$FeedbackWriteSheet$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FeedbackWriteSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AtomicBoolean $submitted;
    public final /* synthetic */ String $trimmedReason;
    public final /* synthetic */ HatchFeedbackViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackWriteSheetKt$FeedbackWriteSheet$2$1$1$1(FeedbackWriteSheetKey feedbackWriteSheetKey, AtomicBoolean atomicBoolean, HatchFeedbackViewModel hatchFeedbackViewModel, String str, AuraNavigator auraNavigator) {
        super(0);
        this.$navKey = feedbackWriteSheetKey;
        this.$submitted = atomicBoolean;
        this.$viewModel = hatchFeedbackViewModel;
        this.$trimmedReason = str;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FeedbackWriteSheetKt.logIdeaWriteSheetSubmitClick(this.$navKey);
        this.$submitted.set(true);
        HatchFeedbackViewModel hatchFeedbackViewModel = this.$viewModel;
        String str = this.$navKey.entityType;
        C7384Etj.A0Y(str, 0);
        FeedbackWriteSheetKey feedbackWriteSheetKey = this.$navKey;
        hatchFeedbackViewModel.submit(new FeedbackTarget(str, feedbackWriteSheetKey.entityId, feedbackWriteSheetKey.surface, feedbackWriteSheetKey.metadata), FeedbackWriteSheetKt.verdictFor(this.$navKey.verdict), this.$trimmedReason);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
