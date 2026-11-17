package com.facebook.aura.navigation.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7mU;
import X.G0U;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.assist.HatchAssistantRoleManager;
import com.facebook.aura.nodes.HatchNodeClient;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class SettingsEntryProviderKt$SettingsScreenContent$roleRequestLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsEntryProviderKt$SettingsScreenContent$roleRequestLauncher$1$1(AbstractC3358CGz abstractC3358CGz, Context context) {
        super(1);
        this.$userSession = abstractC3358CGz;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        HatchNodeClient.Companion.getInstance(this.$userSession, this.$context).reregister();
        HatchAssistantRoleManager hatchAssistantRoleManager = HatchAssistantRoleManager.INSTANCE;
        if (hatchAssistantRoleManager.isDefaultAssistant(this.$context)) {
            return;
        }
        Intent intentCreateVoiceInputSettingsIntent = hatchAssistantRoleManager.createVoiceInputSettingsIntent(this.$context);
        if (intentCreateVoiceInputSettingsIntent == null && (intentCreateVoiceInputSettingsIntent = hatchAssistantRoleManager.createManageDefaultAppsIntent(this.$context)) == null) {
            intentCreateVoiceInputSettingsIntent = new Intent("android.settings.SETTINGS");
        }
        C7mU.A00().A03().A05(this.$context, intentCreateVoiceInputSettingsIntent);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
