package com.facebook.aura.appupdate;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$launcher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ AuraPlayUpdateController $controller;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        C7384Etj.A0Y(activityResult, 0);
        this.$controller.onUpdateResult(activityResult.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$launcher$1$1(AuraPlayUpdateController auraPlayUpdateController) {
        super(1);
        this.$controller = auraPlayUpdateController;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
