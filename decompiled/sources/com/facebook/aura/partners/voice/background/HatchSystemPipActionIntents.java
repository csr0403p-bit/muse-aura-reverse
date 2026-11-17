package com.facebook.aura.partners.voice.background;

import X.C7384Etj;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class HatchSystemPipActionIntents {
    public static final String ACTION_END_CALL = "action_voice_end_call";
    public static final String ACTION_HIDE_AVATAR = "action_voice_hide_avatar";
    public static final String ACTION_TOGGLE_MUTE = "action_voice_toggle_mute";
    public static final HatchSystemPipActionIntents INSTANCE = new HatchSystemPipActionIntents();

    public final PendingIntent endCall(Context context) {
        C7384Etj.A0Y(context, 0);
        return pendingIntent(context, 0, ACTION_END_CALL);
    }

    public final PendingIntent hideAvatar(Context context) {
        C7384Etj.A0Y(context, 0);
        return pendingIntent(context, 2, ACTION_HIDE_AVATAR);
    }

    public final PendingIntent toggleMute(Context context) {
        C7384Etj.A0Y(context, 0);
        return pendingIntent(context, 1, ACTION_TOGGLE_MUTE);
    }

    private final PendingIntent pendingIntent(Context context, int i, String str) {
        PendingIntent service = PendingIntent.getService(context.getApplicationContext(), i, new Intent(context.getApplicationContext(), (Class<?>) VoiceCallForegroundService.class).setAction(str), 201326592);
        C7384Etj.A0U(service);
        return service;
    }
}
