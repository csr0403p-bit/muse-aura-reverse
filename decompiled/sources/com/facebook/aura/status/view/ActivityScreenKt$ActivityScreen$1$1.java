package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.repo.ActivityAction;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ActivityAction $selectedActionFromList;
    public final /* synthetic */ MutableState<ActivityAction> $selectedActionSnapshot$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScreenKt$ActivityScreen$1$1(ActivityAction activityAction, MutableState<ActivityAction> mutableState) {
        super(1);
        this.$selectedActionFromList = activityAction;
        this.$selectedActionSnapshot$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        ActivityAction activityAction = this.$selectedActionFromList;
        if (activityAction != null) {
            this.$selectedActionSnapshot$delegate.Af8(activityAction);
        }
        return new C78g() { // from class: com.facebook.aura.status.view.ActivityScreenKt$ActivityScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
