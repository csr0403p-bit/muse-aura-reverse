package com.facebook.aura.nodes;

import X.C60O;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class HatchNodeClientKt {
    public static final String COMMAND_DATA_SOURCE_BACKFILL = "data_source.backfill";
    public static final JsonObject EMPTY_PAYLOAD = C60O.A1G();
    public static final long HITL_RESERVE_MS = 12000;
    public static final long INVOKE_RECEIVED_AT_TTL_MS = 600000;
    public static final int MAX_REGISTER_ATTEMPTS = 6;
    public static final double REGISTER_BACKOFF_MULTIPLIER = 3.0d;
    public static final String REGISTER_EVENT_NAME = "node_registration";
    public static final String REGISTER_EVENT_TYPE = "capability_registration";
    public static final long REGISTER_INITIAL_BACKOFF_MS = 5000;
    public static final long REGISTER_MAX_BACKOFF_MS = 60000;
    public static final String REGISTER_SURFACE = "nodes";
    public static final String TAG = "HatchNodeClient";
    public static final String UI_CONTROL_COMMAND_PREFIX = "ui.";
}
