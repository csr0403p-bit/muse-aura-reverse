package com.facebook.aura.partners.voice.avatar;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GeneratedHatchIdleAnimationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String uri;

    public final class Companion {
        public final C9hr<GeneratedHatchIdleAnimationJson> serializer() {
            return GeneratedHatchIdleAnimationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(generatedHatchIdleAnimationJson.uri)) {
            c9j5.AAV(generatedHatchIdleAnimationJson.uri, c9iZ, 0);
        }
    }

    public final GeneratedHatchIdleAnimationJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new GeneratedHatchIdleAnimationJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GeneratedHatchIdleAnimationJson) && C7384Etj.areEqual(this.uri, ((GeneratedHatchIdleAnimationJson) obj).uri));
    }

    public static /* synthetic */ GeneratedHatchIdleAnimationJson copy$default(GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generatedHatchIdleAnimationJson.uri;
        }
        C7384Etj.A0Y(str, 0);
        return new GeneratedHatchIdleAnimationJson(str);
    }

    public final String component1() {
        return this.uri;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    public /* synthetic */ GeneratedHatchIdleAnimationJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.uri = "";
        } else {
            this.uri = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public GeneratedHatchIdleAnimationJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.uri = str;
    }

    public /* synthetic */ GeneratedHatchIdleAnimationJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public GeneratedHatchIdleAnimationJson() {
        this("");
    }
}
