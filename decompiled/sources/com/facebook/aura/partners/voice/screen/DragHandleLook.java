package com.facebook.aura.partners.voice.screen;

import X.AOW;
import X.AT5;
import X.AT8;
import X.B6A;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.HDi;
import X.HxS;

/* loaded from: classes2.dex */
public final class DragHandleLook {
    public final long base;
    public final long baseShadow;
    public final VoiceDragHandleCandidates candidates;
    public final long onDarkArt;
    public final long onLightArt;
    public final VoiceAvatarTakeoverState takeoverState;
    public final AT5<Float, AOW> toneWeight;

    public DragHandleLook(VoiceAvatarTakeoverState voiceAvatarTakeoverState, long j, long j2, long j3, long j4) {
        C7384Etj.A0Y(voiceAvatarTakeoverState, 0);
        this.takeoverState = voiceAvatarTakeoverState;
        this.base = j;
        this.baseShadow = j2;
        this.onLightArt = j3;
        this.onDarkArt = j4;
        this.candidates = new VoiceDragHandleCandidates(HxS.A01(j3), HxS.A01(j4));
        this.toneWeight = AT8.A00(tones() != null ? 1.0f : 0.0f);
    }

    public final VoiceDragHandleCandidates getCandidates() {
        return this.candidates;
    }

    public final AT5<Float, AOW> getToneWeight() {
        return this.toneWeight;
    }

    public final VoiceDragHandleTones tones() {
        VoiceDragHandleMeasurement dragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen = this.takeoverState.getDragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen();
        if (dragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen == null || dragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen.source != this.takeoverState.getDragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen()) {
            return null;
        }
        return dragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen.tones;
    }

    /* renamed from: fill-0d7_KjU, reason: not valid java name */
    public final long m1725fill0d7_KjU() {
        VoiceDragHandleTones voiceDragHandleTones = tones();
        if (voiceDragHandleTones == null) {
            return this.base;
        }
        return HxS.A03(this.base, HxS.A03(voiceDragHandleTones.halfScreenOnLightArt ? this.onLightArt : this.onDarkArt, voiceDragHandleTones.fullScreenOnLightArt ? this.onLightArt : this.onDarkArt, this.takeoverState.fullScreen.getProgress()), C3cH.A00(this.toneWeight));
    }

    /* renamed from: shadow-0d7_KjU, reason: not valid java name */
    public final long m1726shadow0d7_KjU() {
        VoiceDragHandleTones voiceDragHandleTones = tones();
        long j = this.baseShadow;
        return voiceDragHandleTones == null ? j : HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), B6A.A00(j) * (1.0f - C3cH.A00(this.toneWeight)));
    }

    public /* synthetic */ DragHandleLook(VoiceAvatarTakeoverState voiceAvatarTakeoverState, long j, long j2, long j3, long j4, C06H c06h) {
        this(voiceAvatarTakeoverState, j, j2, j3, j4);
    }
}
