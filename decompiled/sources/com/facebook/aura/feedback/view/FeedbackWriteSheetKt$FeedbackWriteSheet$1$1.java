package com.facebook.aura.feedback.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FeedbackWriteSheetKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class FeedbackWriteSheetKt$FeedbackWriteSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ FeedbackWriteSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AtomicBoolean $submitted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackWriteSheetKt$FeedbackWriteSheet$1$1(AtomicBoolean atomicBoolean, AuraNavigator auraNavigator, FeedbackWriteSheetKey feedbackWriteSheetKey) {
        super(1);
        this.$submitted = atomicBoolean;
        this.$navigator = auraNavigator;
        this.$navKey = feedbackWriteSheetKey;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AtomicBoolean atomicBoolean = this.$submitted;
        final AuraNavigator auraNavigator = this.$navigator;
        final FeedbackWriteSheetKey feedbackWriteSheetKey = this.$navKey;
        return new C78g() { // from class: com.facebook.aura.feedback.view.FeedbackWriteSheetKt$FeedbackWriteSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (atomicBoolean.get() || auraNavigator.isInBackStack(feedbackWriteSheetKey)) {
                    return;
                }
                FeedbackWriteSheetKt.logIdeaWriteSheetClosed(feedbackWriteSheetKey);
            }
        };
    }
}
