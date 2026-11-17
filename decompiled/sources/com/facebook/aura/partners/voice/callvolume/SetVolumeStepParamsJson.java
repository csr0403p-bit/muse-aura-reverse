package com.facebook.aura.partners.voice.callvolume;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class SetVolumeStepParamsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String step;

    public final class Companion {
        public final C9hr<SetVolumeStepParamsJson> serializer() {
            return SetVolumeStepParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_callvolume_callvolume(SetVolumeStepParamsJson setVolumeStepParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || setVolumeStepParamsJson.step != null) {
            c9j5.AAP(setVolumeStepParamsJson.step, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SetVolumeStepParamsJson) && C7384Etj.areEqual(this.step, ((SetVolumeStepParamsJson) obj).step));
    }

    public static /* synthetic */ SetVolumeStepParamsJson copy$default(SetVolumeStepParamsJson setVolumeStepParamsJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setVolumeStepParamsJson.step;
        }
        return new SetVolumeStepParamsJson(str);
    }

    public final String component1() {
        return this.step;
    }

    public final SetVolumeStepParamsJson copy(String str) {
        return new SetVolumeStepParamsJson(str);
    }

    public final String getStep() {
        return this.step;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.step);
    }

    public /* synthetic */ SetVolumeStepParamsJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.step = null;
        } else {
            this.step = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SetVolumeStepParamsJson(String str) {
        this.step = str;
    }

    public /* synthetic */ SetVolumeStepParamsJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public SetVolumeStepParamsJson() {
        this(null);
    }
}
