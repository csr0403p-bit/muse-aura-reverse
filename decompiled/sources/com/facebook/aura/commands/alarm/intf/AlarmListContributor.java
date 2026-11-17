package com.facebook.aura.commands.alarm.intf;

import android.content.Context;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes.dex */
public interface AlarmListContributor {
    JsonObject fields(Context context);

    String getDescriptionNote();

    String getResultDescriptionNote();
}
