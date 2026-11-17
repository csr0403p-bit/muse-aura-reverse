package com.facebook.aura.partners.voice.api;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PersistedVoiceSelectionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String voice_id;

    public final class Companion {
        public final C9hr<PersistedVoiceSelectionJson> serializer() {
            return PersistedVoiceSelectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PersistedVoiceSelectionJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PersistedVoiceSelectionJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PersistedVoiceSelectionJson) && C7384Etj.areEqual(this.voice_id, ((PersistedVoiceSelectionJson) obj).voice_id));
    }

    public /* synthetic */ PersistedVoiceSelectionJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PersistedVoiceSelectionJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.voice_id = str;
    }

    public static /* synthetic */ PersistedVoiceSelectionJson copy$default(PersistedVoiceSelectionJson persistedVoiceSelectionJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = persistedVoiceSelectionJson.voice_id;
        }
        C7384Etj.A0Y(str, 0);
        return new PersistedVoiceSelectionJson(str);
    }

    public final String component1() {
        return this.voice_id;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public int hashCode() {
        return this.voice_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public PersistedVoiceSelectionJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.voice_id = str;
    }
}
