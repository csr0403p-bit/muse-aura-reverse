package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.status.repo.ActivityAction;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityScreen$4$6$1 extends AbstractC7559F3s implements G0U<ActivityAction, Unit> {
    public final /* synthetic */ MutableState<String> $selectedActionKey$delegate;
    public final /* synthetic */ MutableState<ActivityAction> $selectedActionSnapshot$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityAction activityAction) {
        C7384Etj.A0Y(activityAction, 0);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.ACTIVITY_ITEM, null, null, null);
        this.$selectedActionKey$delegate.Af8(ActivityScreenKt.getSelectedActionKey(activityAction));
        this.$selectedActionSnapshot$delegate.Af8(activityAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScreenKt$ActivityScreen$4$6$1(MutableState<String> mutableState, MutableState<ActivityAction> mutableState2) {
        super(1);
        this.$selectedActionKey$delegate = mutableState;
        this.$selectedActionSnapshot$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityAction activityAction) {
        invoke2(activityAction);
        return Unit.INSTANCE;
    }
}
