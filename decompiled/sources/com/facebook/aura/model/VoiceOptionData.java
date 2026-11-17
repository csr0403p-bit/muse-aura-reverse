package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoiceOptionData extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String name;
    public final String voiceId;

    public final class Companion {
        public final C9hr<VoiceOptionData> serializer() {
            return VoiceOptionData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(VoiceOptionData voiceOptionData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(voiceOptionData.voiceId, c9iZ, 0);
        c9j5.AAV(voiceOptionData.name, c9iZ, 1);
        if (c9j5.AfR() || voiceOptionData.label != null) {
            c9j5.AAP(voiceOptionData.label, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOptionData) {
                VoiceOptionData voiceOptionData = (VoiceOptionData) obj;
                if (!C7384Etj.areEqual(this.voiceId, voiceOptionData.voiceId) || !C7384Etj.areEqual(this.name, voiceOptionData.name) || !C7384Etj.areEqual(this.label, voiceOptionData.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceOptionData copy$default(VoiceOptionData voiceOptionData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceOptionData.voiceId;
        }
        if ((i & 2) != 0) {
            str2 = voiceOptionData.name;
        }
        if ((i & 4) != 0) {
            str3 = voiceOptionData.label;
        }
        return voiceOptionData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.voiceId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.label;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.voiceId)) + AnonymousClass006.A0G(this.label);
    }

    public VoiceOptionData(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.voiceId = str;
        this.name = str2;
        this.label = str3;
    }

    public final VoiceOptionData copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new VoiceOptionData(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceOptionData(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(VoiceOptionData$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.voiceId = str;
        this.name = str2;
        this.label = C3cI.A0W(i, str3);
    }

    public /* synthetic */ VoiceOptionData(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
