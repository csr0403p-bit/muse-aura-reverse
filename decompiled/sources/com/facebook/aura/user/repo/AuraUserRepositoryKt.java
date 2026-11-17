package com.facebook.aura.user.repo;

import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.json.NetworkException;
import kotlinx.serialization.SerializationException;

/* loaded from: classes2.dex */
public abstract class AuraUserRepositoryKt {
    public static final String ACTIVATION_STATUS_CHECK = "activation_status_check";
    public static final String RESOLUTION_MODE_BLOCKING = "blocking";
    public static final String RESOLUTION_MODE_NON_BLOCKING = "non_blocking";
    public static final String TAG = "AuraUserRepository";
    public static final String SURFACE_ONBOARDING = HatchSurface.ONBOARDING.getValue();
    public static final String EVENT_TYPE_STATUS_CHECK = HatchEventType.STATUS_CHECK.getValue();

    public static final String errorTypeFor(Exception exc) {
        return exc instanceof NetworkException ? exc.getCause() instanceof SerializationException ? "decode_error" : "http_error" : "unknown";
    }
}
