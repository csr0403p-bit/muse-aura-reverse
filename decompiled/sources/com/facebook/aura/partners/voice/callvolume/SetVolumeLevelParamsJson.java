package com.facebook.aura.partners.voice.callvolume;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class SetVolumeLevelParamsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer level_percent;

    public final class Companion {
        public final C9hr<SetVolumeLevelParamsJson> serializer() {
            return SetVolumeLevelParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_callvolume_callvolume(SetVolumeLevelParamsJson setVolumeLevelParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || setVolumeLevelParamsJson.level_percent != null) {
            c9j5.AAP(setVolumeLevelParamsJson.level_percent, C07729ii.A00, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SetVolumeLevelParamsJson) && C7384Etj.areEqual(this.level_percent, ((SetVolumeLevelParamsJson) obj).level_percent));
    }

    public static /* synthetic */ SetVolumeLevelParamsJson copy$default(SetVolumeLevelParamsJson setVolumeLevelParamsJson, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = setVolumeLevelParamsJson.level_percent;
        }
        return new SetVolumeLevelParamsJson(num);
    }

    public final Integer component1() {
        return this.level_percent;
    }

    public final SetVolumeLevelParamsJson copy(Integer num) {
        return new SetVolumeLevelParamsJson(num);
    }

    public final Integer getLevel_percent() {
        return this.level_percent;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.level_percent);
    }

    public /* synthetic */ SetVolumeLevelParamsJson(int i, Integer num, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.level_percent = null;
        } else {
            this.level_percent = num;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SetVolumeLevelParamsJson(Integer num) {
        this.level_percent = num;
    }

    public /* synthetic */ SetVolumeLevelParamsJson(Integer num, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num);
    }

    public SetVolumeLevelParamsJson() {
        this(null);
    }
}
