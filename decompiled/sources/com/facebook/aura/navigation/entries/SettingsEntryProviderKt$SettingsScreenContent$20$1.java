package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7OU;
import X.C7mU;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.assist.HatchAssistantRoleManager;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.DefaultAssistantSettingsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SettingsEntryProviderKt$SettingsScreenContent$20$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $roleRequestLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsEntryProviderKt$SettingsScreenContent$20$1(Context context, AuraNavigator auraNavigator, C7OU<Intent, ActivityResult> c7ou) {
        super(0);
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$roleRequestLauncher = c7ou;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchAssistantRoleManager hatchAssistantRoleManager = HatchAssistantRoleManager.INSTANCE;
        if (hatchAssistantRoleManager.isDefaultAssistant(this.$context)) {
            this.$navigator.navigate((AuraNavKey) DefaultAssistantSettingsScreenKey.INSTANCE, false);
            return;
        }
        Intent intentCreateRequestRoleIntent = hatchAssistantRoleManager.createRequestRoleIntent(this.$context);
        if (intentCreateRequestRoleIntent != null) {
            A02(intentCreateRequestRoleIntent);
            return;
        }
        Intent intentCreateVoiceInputSettingsIntent = hatchAssistantRoleManager.createVoiceInputSettingsIntent(this.$context);
        if (intentCreateVoiceInputSettingsIntent == null && (intentCreateVoiceInputSettingsIntent = hatchAssistantRoleManager.createManageDefaultAppsIntent(this.$context)) == null) {
            intentCreateVoiceInputSettingsIntent = new Intent("android.settings.SETTINGS");
        }
        C7mU.A00().A03().A05(this.$context, intentCreateVoiceInputSettingsIntent);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
