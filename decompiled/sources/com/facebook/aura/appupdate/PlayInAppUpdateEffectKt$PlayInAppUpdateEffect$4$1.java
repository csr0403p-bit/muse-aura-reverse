package com.facebook.aura.appupdate;

import X.AbstractC7559F3s;
import X.C7OU;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraPlayUpdateController $controller;
    public final /* synthetic */ C7OU<IntentSenderRequest, ActivityResult> $launcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$4$1(AuraPlayUpdateController auraPlayUpdateController, C7OU<IntentSenderRequest, ActivityResult> c7ou) {
        super(0);
        this.$controller = auraPlayUpdateController;
        this.$launcher = c7ou;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$controller.checkForUpdate(this.$launcher);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
