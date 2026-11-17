package com.facebook.aura.assist.status;

import X.C7384Etj;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class HatchDefaultAssistantSettings {
    public static final HatchDefaultAssistantSettings INSTANCE = new HatchDefaultAssistantSettings();

    public final Intent createIntent(Context context) {
        C7384Etj.A0Y(context, 0);
        Intent intentCreateVoiceInputSettingsIntent = createVoiceInputSettingsIntent(context);
        if (intentCreateVoiceInputSettingsIntent != null) {
            return intentCreateVoiceInputSettingsIntent;
        }
        Intent intentCreateManageDefaultAppsIntent = createManageDefaultAppsIntent(context);
        return intentCreateManageDefaultAppsIntent == null ? new Intent("android.settings.SETTINGS") : intentCreateManageDefaultAppsIntent;
    }

    public final Intent createManageDefaultAppsIntent(Context context) {
        C7384Etj.A0Y(context, 0);
        Intent intent = new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return null;
        }
        return intent;
    }

    public final Intent createVoiceInputSettingsIntent(Context context) {
        C7384Etj.A0Y(context, 0);
        Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return null;
        }
        return intent;
    }
}
