package com.facebook.aura.partners.voice.screen;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy;
import com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallErrorToastReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallErrorToastReason[] $VALUES;
    public static final VoiceCallErrorToastReason ALREADY_ON_CALL;
    public static final VoiceCallErrorToastReason CAPACITY;
    public static final VoiceCallErrorToastReason CONNECT_TIMEOUT;
    public static final VoiceCallErrorToastReason GENERIC_FAILURE;
    public static final VoiceCallErrorToastReason LIVE_AVATAR_UNAVAILABLE;
    public static final VoiceCallErrorToastReason NETWORK_LOST;
    public static final VoiceCallErrorToastReason NO_NETWORK;
    public static final VoiceCallErrorToastReason OUT_OF_CREDITS;
    public static final VoiceCallErrorToastReason SERVER_VIDEO_DISABLED;
    public static final VoiceCallErrorToastReason WEAK_NETWORK;
    public final String value;

    static {
        VoiceCallErrorToastReason voiceCallErrorToastReason = new VoiceCallErrorToastReason("CAPACITY", 0, "capacity");
        CAPACITY = voiceCallErrorToastReason;
        VoiceCallErrorToastReason voiceCallErrorToastReason2 = new VoiceCallErrorToastReason("CONNECT_TIMEOUT", 1, VoiceCallConnectionTracker.END_REASON_CONNECT_TIMEOUT);
        CONNECT_TIMEOUT = voiceCallErrorToastReason2;
        VoiceCallErrorToastReason voiceCallErrorToastReason3 = new VoiceCallErrorToastReason("NO_NETWORK", 2, VoiceCallConnectionTracker.END_REASON_NO_NETWORK);
        NO_NETWORK = voiceCallErrorToastReason3;
        VoiceCallErrorToastReason voiceCallErrorToastReason4 = new VoiceCallErrorToastReason("GENERIC_FAILURE", 3, "generic_failure");
        GENERIC_FAILURE = voiceCallErrorToastReason4;
        VoiceCallErrorToastReason voiceCallErrorToastReason5 = new VoiceCallErrorToastReason("OUT_OF_CREDITS", 4, "out_of_credits");
        OUT_OF_CREDITS = voiceCallErrorToastReason5;
        VoiceCallErrorToastReason voiceCallErrorToastReason6 = new VoiceCallErrorToastReason("ALREADY_ON_CALL", 5, "already_on_call");
        ALREADY_ON_CALL = voiceCallErrorToastReason6;
        VoiceCallErrorToastReason voiceCallErrorToastReason7 = new VoiceCallErrorToastReason("NETWORK_LOST", 6, "network_lost");
        NETWORK_LOST = voiceCallErrorToastReason7;
        VoiceCallErrorToastReason voiceCallErrorToastReason8 = new VoiceCallErrorToastReason("WEAK_NETWORK", 7, "weak_network");
        WEAK_NETWORK = voiceCallErrorToastReason8;
        VoiceCallErrorToastReason voiceCallErrorToastReason9 = new VoiceCallErrorToastReason("LIVE_AVATAR_UNAVAILABLE", 8, "live_avatar_unavailable");
        LIVE_AVATAR_UNAVAILABLE = voiceCallErrorToastReason9;
        VoiceCallErrorToastReason voiceCallErrorToastReason10 = new VoiceCallErrorToastReason("SERVER_VIDEO_DISABLED", 9, HatchWsSignalingTransportProxy.AUDIO_ONLY_REASON_SERVER_VIDEO_DISABLED);
        SERVER_VIDEO_DISABLED = voiceCallErrorToastReason10;
        VoiceCallErrorToastReason[] voiceCallErrorToastReasonArr = {voiceCallErrorToastReason, voiceCallErrorToastReason2, voiceCallErrorToastReason3, voiceCallErrorToastReason4, voiceCallErrorToastReason5, voiceCallErrorToastReason6, voiceCallErrorToastReason7, voiceCallErrorToastReason8, voiceCallErrorToastReason9, voiceCallErrorToastReason10};
        $VALUES = voiceCallErrorToastReasonArr;
        $ENTRIES = C3cG.A0w(voiceCallErrorToastReasonArr);
    }

    public static Ey9<VoiceCallErrorToastReason> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallErrorToastReason valueOf(String str) {
        return (VoiceCallErrorToastReason) Enum.valueOf(VoiceCallErrorToastReason.class, str);
    }

    public static VoiceCallErrorToastReason[] values() {
        return (VoiceCallErrorToastReason[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceCallErrorToastReason(String str, int i, String str2) {
        this.value = str2;
    }
}
