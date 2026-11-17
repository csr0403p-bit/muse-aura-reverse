package com.facebook.aura.partners.voice.intf;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallEntryPoint[] $VALUES;
    public static final VoiceCallEntryPoint CALL_BUTTON;
    public static final VoiceCallEntryPoint CHAT_CTA;
    public static final Companion Companion;
    public static final VoiceCallEntryPoint META_APP;
    public static final VoiceCallEntryPoint NOTIFICATION;
    public static final VoiceCallEntryPoint VOICE_ANNOUNCEMENT;
    public static final VoiceCallEntryPoint WIDGET;
    public final String value;

    static {
        VoiceCallEntryPoint voiceCallEntryPoint = new VoiceCallEntryPoint("CALL_BUTTON", 0, "call_button");
        CALL_BUTTON = voiceCallEntryPoint;
        VoiceCallEntryPoint voiceCallEntryPoint2 = new VoiceCallEntryPoint("CHAT_CTA", 1, "chat_cta");
        CHAT_CTA = voiceCallEntryPoint2;
        VoiceCallEntryPoint voiceCallEntryPoint3 = new VoiceCallEntryPoint("NOTIFICATION", 2, "notification");
        NOTIFICATION = voiceCallEntryPoint3;
        VoiceCallEntryPoint voiceCallEntryPoint4 = new VoiceCallEntryPoint("META_APP", 3, "meta_app");
        META_APP = voiceCallEntryPoint4;
        VoiceCallEntryPoint voiceCallEntryPoint5 = new VoiceCallEntryPoint("WIDGET", 4, "widget");
        WIDGET = voiceCallEntryPoint5;
        VoiceCallEntryPoint voiceCallEntryPoint6 = new VoiceCallEntryPoint("VOICE_ANNOUNCEMENT", 5, "announcement_nux");
        VOICE_ANNOUNCEMENT = voiceCallEntryPoint6;
        VoiceCallEntryPoint[] voiceCallEntryPointArr = {voiceCallEntryPoint, voiceCallEntryPoint2, voiceCallEntryPoint3, voiceCallEntryPoint4, voiceCallEntryPoint5, voiceCallEntryPoint6};
        $VALUES = voiceCallEntryPointArr;
        $ENTRIES = C3cG.A0w(voiceCallEntryPointArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final VoiceCallEntryPoint fromValue(String str) {
            VoiceCallEntryPoint next;
            Iterator<VoiceCallEntryPoint> it = VoiceCallEntryPoint.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<VoiceCallEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallEntryPoint valueOf(String str) {
        return (VoiceCallEntryPoint) Enum.valueOf(VoiceCallEntryPoint.class, str);
    }

    public static VoiceCallEntryPoint[] values() {
        return (VoiceCallEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceCallEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
