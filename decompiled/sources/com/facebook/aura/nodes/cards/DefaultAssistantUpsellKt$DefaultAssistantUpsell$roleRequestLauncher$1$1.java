package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.assist.status.HatchDefaultAssistantStatus;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class DefaultAssistantUpsellKt$DefaultAssistantUpsell$roleRequestLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAssistantUpsellKt$DefaultAssistantUpsell$roleRequestLauncher$1$1(Context context) {
        super(1);
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        if (HatchDefaultAssistantStatus.INSTANCE.isDefaultAssistant(this.$context)) {
            return;
        }
        DefaultAssistantUpsellKt.launchDefaultAssistantSettings(this.$context);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
