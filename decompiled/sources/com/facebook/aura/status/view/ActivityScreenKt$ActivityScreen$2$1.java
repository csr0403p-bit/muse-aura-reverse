package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.viewmodel.HatchPendingActivityItem;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityScreen$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<HatchPendingActivityItem.Event> $pendingEvent$delegate;
    public final /* synthetic */ MutableState<String> $selectedActionKey$delegate;
    public final /* synthetic */ MutableState<ActivityAction> $selectedActionSnapshot$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScreenKt$ActivityScreen$2$1(C1BO<HatchPendingActivityItem.Event> c1bo, MutableState<String> mutableState, MutableState<ActivityAction> mutableState2) {
        super(1);
        this.$pendingEvent$delegate = c1bo;
        this.$selectedActionKey$delegate = mutableState;
        this.$selectedActionSnapshot$delegate = mutableState2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchPendingActivityItem.Event value = this.$pendingEvent$delegate.getValue();
        if (value != null) {
            MutableState<String> mutableState = this.$selectedActionKey$delegate;
            MutableState<ActivityAction> mutableState2 = this.$selectedActionSnapshot$delegate;
            mutableState.Af8(value.activityId);
            mutableState2.Af8(null);
            HatchPendingActivityItem.INSTANCE.acknowledge(value);
        }
        return new C78g() { // from class: com.facebook.aura.status.view.ActivityScreenKt$ActivityScreen$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
