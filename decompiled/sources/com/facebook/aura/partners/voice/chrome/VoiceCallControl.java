package com.facebook.aura.partners.voice.chrome;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.R;
import com.facebook.aura.header.api.HeaderActionIcon;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallControl {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallControl[] $VALUES;
    public static final VoiceCallControl COLLAPSE;
    public static final VoiceCallControl END;
    public static final VoiceCallControl EXPAND;
    public static final VoiceCallControl MIC_PAUSED;
    public static final VoiceCallControl MUTE;
    public static final VoiceCallControl UNMUTE;
    public final HeaderActionIcon icon;
    public final String testTag;

    static {
        VoiceCallControl voiceCallControl = new VoiceCallControl("END", 0, new HeaderActionIcon(R.drawable.header_voice_hang_up_filled_24, R.string._name_removed__res_0x7f120661, true, true), "hatch-voice-end-call-button");
        END = voiceCallControl;
        VoiceCallControl voiceCallControl2 = new VoiceCallControl("MUTE", 1, new HeaderActionIcon(R.drawable.microphone_wght400_outline_24, R.string._name_removed__res_0x7f120670, false, true), "hatch-voice-mute-button");
        MUTE = voiceCallControl2;
        VoiceCallControl voiceCallControl3 = new VoiceCallControl("UNMUTE", 2, new HeaderActionIcon(R.drawable.microphoneslash_outline_24_wght400, R.string._name_removed__res_0x7f120670, false, true), "hatch-voice-unmute-button");
        UNMUTE = voiceCallControl3;
        VoiceCallControl voiceCallControl4 = new VoiceCallControl("MIC_PAUSED", 3, new HeaderActionIcon(R.drawable.microphoneslash_outline_24_wght400, R.string._name_removed__res_0x7f12066b, false, false), "hatch-voice-mic-paused-button");
        MIC_PAUSED = voiceCallControl4;
        VoiceCallControl voiceCallControl5 = new VoiceCallControl("COLLAPSE", 4, new HeaderActionIcon(R.drawable.arrows_in_upper_right_lower_left_outline_24, R.string._name_removed__res_0x7f12066e, false, true), "hatch-voice-minimize-button");
        COLLAPSE = voiceCallControl5;
        VoiceCallControl voiceCallControl6 = new VoiceCallControl("EXPAND", 5, new HeaderActionIcon(R.drawable.arrows_out_upper_right_lower_left_outline_24, R.string._name_removed__res_0x7f120663, false, true), "hatch-voice-expand-button");
        EXPAND = voiceCallControl6;
        VoiceCallControl[] voiceCallControlArr = {voiceCallControl, voiceCallControl2, voiceCallControl3, voiceCallControl4, voiceCallControl5, voiceCallControl6};
        $VALUES = voiceCallControlArr;
        $ENTRIES = C3cG.A0w(voiceCallControlArr);
    }

    public static Ey9<VoiceCallControl> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallControl valueOf(String str) {
        return (VoiceCallControl) Enum.valueOf(VoiceCallControl.class, str);
    }

    public static VoiceCallControl[] values() {
        return (VoiceCallControl[]) $VALUES.clone();
    }

    public final HeaderActionIcon getIcon() {
        return this.icon;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public VoiceCallControl(String str, int i, HeaderActionIcon headerActionIcon, String str2) {
        this.icon = headerActionIcon;
        this.testTag = str2;
    }
}
