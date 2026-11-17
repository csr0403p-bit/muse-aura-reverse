package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoicePreviewRequest extends C06G {
    public static final int $stable = 0;
    public final boolean designed;
    public final VoicePreviewKey key;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePreviewRequest) {
                VoicePreviewRequest voicePreviewRequest = (VoicePreviewRequest) obj;
                if (!C7384Etj.areEqual(this.key, voicePreviewRequest.key) || !C7384Etj.areEqual(this.text, voicePreviewRequest.text) || this.designed != voicePreviewRequest.designed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoicePreviewRequest copy$default(VoicePreviewRequest voicePreviewRequest, VoicePreviewKey voicePreviewKey, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            voicePreviewKey = voicePreviewRequest.key;
        }
        if ((i & 2) != 0) {
            str = voicePreviewRequest.text;
        }
        if ((i & 4) != 0) {
            z = voicePreviewRequest.designed;
        }
        return voicePreviewRequest.copy(voicePreviewKey, str, z);
    }

    public final VoicePreviewKey component1() {
        return this.key;
    }

    public final String component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.designed;
    }

    public final boolean getDesigned() {
        return this.designed;
    }

    public final VoicePreviewKey getKey() {
        return this.key;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.text, AnonymousClass005.A0E(this.key)), this.designed);
    }

    public VoicePreviewRequest(VoicePreviewKey voicePreviewKey, String str, boolean z) {
        AnonymousClass003.A0u(voicePreviewKey, str);
        this.key = voicePreviewKey;
        this.text = str;
        this.designed = z;
    }

    public final VoicePreviewRequest copy(VoicePreviewKey voicePreviewKey, String str, boolean z) {
        AnonymousClass003.A0u(voicePreviewKey, str);
        return new VoicePreviewRequest(voicePreviewKey, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoicePreviewRequest(VoicePreviewKey voicePreviewKey, String str, boolean z, int i, C06H c06h) {
        this(voicePreviewKey, str, AnonymousClass005.A1O(i, z));
    }
}
