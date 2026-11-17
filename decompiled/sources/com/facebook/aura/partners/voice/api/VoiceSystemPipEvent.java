package com.facebook.aura.partners.voice.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceSystemPipEvent {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceSystemPipEvent[] $VALUES;
    public static final VoiceSystemPipEvent DISMISSED;
    public static final VoiceSystemPipEvent ENTERED;
    public static final VoiceSystemPipEvent ENTRY_FAILED;
    public static final VoiceSystemPipEvent EXITED;
    public static final VoiceSystemPipEvent HIDE_RELEASE_TIMEOUT;
    public static final VoiceSystemPipEvent HOST_STOPPED;
    public static final VoiceSystemPipEvent PAUSED_GATE_DISABLED;
    public static final VoiceSystemPipEvent PAUSED_IN_PIP;
    public static final VoiceSystemPipEvent PAUSED_NOT_ARMED;
    public static final VoiceSystemPipEvent PAUSED_OUTBOUND_LAUNCH;
    public static final VoiceSystemPipEvent PAUSED_PARAMS_FAILED;
    public static final VoiceSystemPipEvent PAUSED_PERMISSION_DENIED;
    public static final VoiceSystemPipEvent PAUSED_PERMISSION_UNKNOWN;
    public static final VoiceSystemPipEvent PAUSED_READY;
    public static final VoiceSystemPipEvent PAUSED_SOURCE_HIDDEN;
    public static final VoiceSystemPipEvent PAUSED_UNAVAILABLE;
    public static final VoiceSystemPipEvent SESSION_CLEARED;
    public static final VoiceSystemPipEvent TASK_REMOVED;
    public static final VoiceSystemPipEvent TRANSITION_STARTED;
    public static final VoiceSystemPipEvent UI_RELEASED;
    public final String pointName;

    static {
        VoiceSystemPipEvent voiceSystemPipEvent = new VoiceSystemPipEvent("TRANSITION_STARTED", 0, "system_pip_transition_started");
        TRANSITION_STARTED = voiceSystemPipEvent;
        VoiceSystemPipEvent voiceSystemPipEvent2 = new VoiceSystemPipEvent("PAUSED_IN_PIP", 1, "system_pip_pause_active");
        PAUSED_IN_PIP = voiceSystemPipEvent2;
        VoiceSystemPipEvent voiceSystemPipEvent3 = new VoiceSystemPipEvent("PAUSED_GATE_DISABLED", 2, "system_pip_pause_gate_disabled");
        PAUSED_GATE_DISABLED = voiceSystemPipEvent3;
        VoiceSystemPipEvent voiceSystemPipEvent4 = new VoiceSystemPipEvent("PAUSED_UNAVAILABLE", 3, "system_pip_pause_unavailable");
        PAUSED_UNAVAILABLE = voiceSystemPipEvent4;
        VoiceSystemPipEvent voiceSystemPipEvent5 = new VoiceSystemPipEvent("PAUSED_SOURCE_HIDDEN", 4, "system_pip_pause_source_hidden");
        PAUSED_SOURCE_HIDDEN = voiceSystemPipEvent5;
        VoiceSystemPipEvent voiceSystemPipEvent6 = new VoiceSystemPipEvent("PAUSED_NOT_ARMED", 5, "system_pip_pause_not_armed");
        PAUSED_NOT_ARMED = voiceSystemPipEvent6;
        VoiceSystemPipEvent voiceSystemPipEvent7 = new VoiceSystemPipEvent("PAUSED_PARAMS_FAILED", 6, "system_pip_pause_params_failed");
        PAUSED_PARAMS_FAILED = voiceSystemPipEvent7;
        VoiceSystemPipEvent voiceSystemPipEvent8 = new VoiceSystemPipEvent("PAUSED_PERMISSION_DENIED", 7, "system_pip_pause_permission_denied");
        PAUSED_PERMISSION_DENIED = voiceSystemPipEvent8;
        VoiceSystemPipEvent voiceSystemPipEvent9 = new VoiceSystemPipEvent("PAUSED_PERMISSION_UNKNOWN", 8, "system_pip_pause_permission_unknown");
        PAUSED_PERMISSION_UNKNOWN = voiceSystemPipEvent9;
        VoiceSystemPipEvent voiceSystemPipEvent10 = new VoiceSystemPipEvent("PAUSED_READY", 9, "system_pip_pause_ready");
        PAUSED_READY = voiceSystemPipEvent10;
        VoiceSystemPipEvent voiceSystemPipEvent11 = new VoiceSystemPipEvent("PAUSED_OUTBOUND_LAUNCH", 10, "system_pip_pause_outbound_launch");
        PAUSED_OUTBOUND_LAUNCH = voiceSystemPipEvent11;
        VoiceSystemPipEvent voiceSystemPipEvent12 = new VoiceSystemPipEvent("HOST_STOPPED", 11, "system_pip_host_stopped");
        HOST_STOPPED = voiceSystemPipEvent12;
        VoiceSystemPipEvent voiceSystemPipEvent13 = new VoiceSystemPipEvent("UI_RELEASED", 12, "system_pip_ui_released");
        UI_RELEASED = voiceSystemPipEvent13;
        VoiceSystemPipEvent voiceSystemPipEvent14 = new VoiceSystemPipEvent("TASK_REMOVED", 13, "system_pip_task_removed");
        TASK_REMOVED = voiceSystemPipEvent14;
        VoiceSystemPipEvent voiceSystemPipEvent15 = new VoiceSystemPipEvent("SESSION_CLEARED", 14, "system_pip_session_cleared");
        SESSION_CLEARED = voiceSystemPipEvent15;
        VoiceSystemPipEvent voiceSystemPipEvent16 = new VoiceSystemPipEvent("ENTERED", 15, "system_pip_entered");
        ENTERED = voiceSystemPipEvent16;
        VoiceSystemPipEvent voiceSystemPipEvent17 = new VoiceSystemPipEvent("ENTRY_FAILED", 16, "system_pip_entry_failed");
        ENTRY_FAILED = voiceSystemPipEvent17;
        VoiceSystemPipEvent voiceSystemPipEvent18 = new VoiceSystemPipEvent("EXITED", 17, "system_pip_exited");
        EXITED = voiceSystemPipEvent18;
        VoiceSystemPipEvent voiceSystemPipEvent19 = new VoiceSystemPipEvent("DISMISSED", 18, "system_pip_dismissed");
        DISMISSED = voiceSystemPipEvent19;
        VoiceSystemPipEvent voiceSystemPipEvent20 = new VoiceSystemPipEvent("HIDE_RELEASE_TIMEOUT", 19, "system_pip_hide_release_timeout");
        HIDE_RELEASE_TIMEOUT = voiceSystemPipEvent20;
        VoiceSystemPipEvent[] voiceSystemPipEventArr = {voiceSystemPipEvent, voiceSystemPipEvent2, voiceSystemPipEvent3, voiceSystemPipEvent4, voiceSystemPipEvent5, voiceSystemPipEvent6, voiceSystemPipEvent7, voiceSystemPipEvent8, voiceSystemPipEvent9, voiceSystemPipEvent10, voiceSystemPipEvent11, voiceSystemPipEvent12, voiceSystemPipEvent13, voiceSystemPipEvent14, voiceSystemPipEvent15, voiceSystemPipEvent16, voiceSystemPipEvent17, voiceSystemPipEvent18, voiceSystemPipEvent19, voiceSystemPipEvent20};
        $VALUES = voiceSystemPipEventArr;
        $ENTRIES = C3cG.A0w(voiceSystemPipEventArr);
    }

    public static Ey9<VoiceSystemPipEvent> getEntries() {
        return $ENTRIES;
    }

    public static VoiceSystemPipEvent valueOf(String str) {
        return (VoiceSystemPipEvent) Enum.valueOf(VoiceSystemPipEvent.class, str);
    }

    public static VoiceSystemPipEvent[] values() {
        return (VoiceSystemPipEvent[]) $VALUES.clone();
    }

    public final String getPointName() {
        return this.pointName;
    }

    public VoiceSystemPipEvent(String str, int i, String str2) {
        this.pointName = str2;
    }
}
