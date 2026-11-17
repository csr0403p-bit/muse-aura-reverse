package com.facebook.aura.partners.voice.uicontrol;

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
public final class SetLiveAvatarParamsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String live_avatar_status;

    public final class Companion {
        public final C9hr<SetLiveAvatarParamsJson> serializer() {
            return SetLiveAvatarParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_uicontrol_uicontrol(SetLiveAvatarParamsJson setLiveAvatarParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || setLiveAvatarParamsJson.live_avatar_status != null) {
            c9j5.AAP(setLiveAvatarParamsJson.live_avatar_status, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SetLiveAvatarParamsJson) && C7384Etj.areEqual(this.live_avatar_status, ((SetLiveAvatarParamsJson) obj).live_avatar_status));
    }

    public static /* synthetic */ SetLiveAvatarParamsJson copy$default(SetLiveAvatarParamsJson setLiveAvatarParamsJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setLiveAvatarParamsJson.live_avatar_status;
        }
        return new SetLiveAvatarParamsJson(str);
    }

    public final String component1() {
        return this.live_avatar_status;
    }

    public final SetLiveAvatarParamsJson copy(String str) {
        return new SetLiveAvatarParamsJson(str);
    }

    public final String getLive_avatar_status() {
        return this.live_avatar_status;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.live_avatar_status);
    }

    public /* synthetic */ SetLiveAvatarParamsJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.live_avatar_status = null;
        } else {
            this.live_avatar_status = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SetLiveAvatarParamsJson(String str) {
        this.live_avatar_status = str;
    }

    public /* synthetic */ SetLiveAvatarParamsJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public SetLiveAvatarParamsJson() {
        this(null);
    }
}
