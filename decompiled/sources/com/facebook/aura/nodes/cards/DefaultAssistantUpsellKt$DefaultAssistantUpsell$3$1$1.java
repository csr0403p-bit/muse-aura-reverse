package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.C7OU;
import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DefaultAssistantUpsellKt$DefaultAssistantUpsell$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $roleRequestLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAssistantUpsellKt$DefaultAssistantUpsell$3$1$1(Context context, C7OU<Intent, ActivityResult> c7ou) {
        super(0);
        this.$context = context;
        this.$roleRequestLauncher = c7ou;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Intent intentCreateRequestRoleIntent;
        RoleManager roleManager = (RoleManager) this.$context.getSystemService(RoleManager.class);
        if (roleManager == null || !roleManager.isRoleAvailable("android.app.role.ASSISTANT") || (intentCreateRequestRoleIntent = roleManager.createRequestRoleIntent("android.app.role.ASSISTANT")) == null) {
            DefaultAssistantUpsellKt.launchDefaultAssistantSettings(this.$context);
        } else {
            A02(intentCreateRequestRoleIntent);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
