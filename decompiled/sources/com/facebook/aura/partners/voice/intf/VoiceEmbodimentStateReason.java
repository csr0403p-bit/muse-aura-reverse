package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceEmbodimentStateReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceEmbodimentStateReason[] $VALUES;
    public static final VoiceEmbodimentStateReason ACTIVITY_CHANGE;
    public static final VoiceEmbodimentStateReason APP_BACKGROUND;
    public static final VoiceEmbodimentStateReason APP_FOREGROUND;
    public static final VoiceEmbodimentStateReason BACK;
    public static final VoiceEmbodimentStateReason CALL_CONNECTED;
    public static final VoiceEmbodimentStateReason CALL_END;
    public static final VoiceEmbodimentStateReason COLLAPSE_BUTTON;
    public static final VoiceEmbodimentStateReason DISPLAY_TOGGLE;
    public static final VoiceEmbodimentStateReason EXPAND_BUTTON;
    public static final VoiceEmbodimentStateReason HANDLE_DRAG;
    public static final VoiceEmbodimentStateReason HANDLE_TAP;
    public static final VoiceEmbodimentStateReason MEDIA;
    public static final VoiceEmbodimentStateReason NAVIGATION;
    public static final VoiceEmbodimentStateReason PIP_DISMISSED;
    public static final VoiceEmbodimentStateReason PIP_ENTER;
    public static final VoiceEmbodimentStateReason PIP_EXIT;
    public static final VoiceEmbodimentStateReason PIP_HIDE_AVATAR;
    public static final VoiceEmbodimentStateReason RECONNECT;
    public static final VoiceEmbodimentStateReason SYSTEM;
    public static final VoiceEmbodimentStateReason TAP;
    public static final VoiceEmbodimentStateReason TASK_REMOVED;
    public final String value;

    static {
        VoiceEmbodimentStateReason voiceEmbodimentStateReason = new VoiceEmbodimentStateReason("CALL_CONNECTED", 0, "call_connected");
        CALL_CONNECTED = voiceEmbodimentStateReason;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason2 = new VoiceEmbodimentStateReason("CALL_END", 1, "call_end");
        CALL_END = voiceEmbodimentStateReason2;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason3 = new VoiceEmbodimentStateReason("TAP", 2, "tap");
        TAP = voiceEmbodimentStateReason3;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason4 = new VoiceEmbodimentStateReason("BACK", 3, "back");
        BACK = voiceEmbodimentStateReason4;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason5 = new VoiceEmbodimentStateReason("COLLAPSE_BUTTON", 4, "collapse_button");
        COLLAPSE_BUTTON = voiceEmbodimentStateReason5;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason6 = new VoiceEmbodimentStateReason("EXPAND_BUTTON", 5, "expand_button");
        EXPAND_BUTTON = voiceEmbodimentStateReason6;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason7 = new VoiceEmbodimentStateReason("HANDLE_DRAG", 6, "handle_drag");
        HANDLE_DRAG = voiceEmbodimentStateReason7;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason8 = new VoiceEmbodimentStateReason("HANDLE_TAP", 7, "handle_tap");
        HANDLE_TAP = voiceEmbodimentStateReason8;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason9 = new VoiceEmbodimentStateReason("DISPLAY_TOGGLE", 8, "display_toggle");
        DISPLAY_TOGGLE = voiceEmbodimentStateReason9;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason10 = new VoiceEmbodimentStateReason("PIP_HIDE_AVATAR", 9, "pip_hide_avatar");
        PIP_HIDE_AVATAR = voiceEmbodimentStateReason10;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason11 = new VoiceEmbodimentStateReason("PIP_DISMISSED", 10, "pip_dismissed");
        PIP_DISMISSED = voiceEmbodimentStateReason11;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason12 = new VoiceEmbodimentStateReason("TASK_REMOVED", 11, "task_removed");
        TASK_REMOVED = voiceEmbodimentStateReason12;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason13 = new VoiceEmbodimentStateReason("APP_BACKGROUND", 12, VoiceCallConnectionTracker.END_REASON_APP_BACKGROUND);
        APP_BACKGROUND = voiceEmbodimentStateReason13;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason14 = new VoiceEmbodimentStateReason("APP_FOREGROUND", 13, "app_foreground");
        APP_FOREGROUND = voiceEmbodimentStateReason14;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason15 = new VoiceEmbodimentStateReason("PIP_ENTER", 14, "pip_enter");
        PIP_ENTER = voiceEmbodimentStateReason15;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason16 = new VoiceEmbodimentStateReason("PIP_EXIT", 15, "pip_exit");
        PIP_EXIT = voiceEmbodimentStateReason16;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason17 = new VoiceEmbodimentStateReason("NAVIGATION", 16, "navigation");
        NAVIGATION = voiceEmbodimentStateReason17;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason18 = new VoiceEmbodimentStateReason("RECONNECT", 17, "reconnect");
        RECONNECT = voiceEmbodimentStateReason18;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason19 = new VoiceEmbodimentStateReason("ACTIVITY_CHANGE", 18, "activity_change");
        ACTIVITY_CHANGE = voiceEmbodimentStateReason19;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason20 = new VoiceEmbodimentStateReason("MEDIA", 19, HatchFileOperations.LibraryPreset.media);
        MEDIA = voiceEmbodimentStateReason20;
        VoiceEmbodimentStateReason voiceEmbodimentStateReason21 = new VoiceEmbodimentStateReason("SYSTEM", 20, PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM);
        SYSTEM = voiceEmbodimentStateReason21;
        VoiceEmbodimentStateReason[] voiceEmbodimentStateReasonArr = {voiceEmbodimentStateReason, voiceEmbodimentStateReason2, voiceEmbodimentStateReason3, voiceEmbodimentStateReason4, voiceEmbodimentStateReason5, voiceEmbodimentStateReason6, voiceEmbodimentStateReason7, voiceEmbodimentStateReason8, voiceEmbodimentStateReason9, voiceEmbodimentStateReason10, voiceEmbodimentStateReason11, voiceEmbodimentStateReason12, voiceEmbodimentStateReason13, voiceEmbodimentStateReason14, voiceEmbodimentStateReason15, voiceEmbodimentStateReason16, voiceEmbodimentStateReason17, voiceEmbodimentStateReason18, voiceEmbodimentStateReason19, voiceEmbodimentStateReason20, voiceEmbodimentStateReason21};
        $VALUES = voiceEmbodimentStateReasonArr;
        $ENTRIES = C3cG.A0w(voiceEmbodimentStateReasonArr);
    }

    public static Ey9<VoiceEmbodimentStateReason> getEntries() {
        return $ENTRIES;
    }

    public static VoiceEmbodimentStateReason valueOf(String str) {
        return (VoiceEmbodimentStateReason) Enum.valueOf(VoiceEmbodimentStateReason.class, str);
    }

    public static VoiceEmbodimentStateReason[] values() {
        return (VoiceEmbodimentStateReason[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceEmbodimentStateReason(String str, int i, String str2) {
        this.value = str2;
    }
}
