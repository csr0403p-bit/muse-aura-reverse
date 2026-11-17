package com.facebook.aura.partners.voice.infra;

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
/* loaded from: classes4.dex */
public final class StartCallErrorJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;

    public final class Companion {
        public final C9hr<StartCallErrorJson> serializer() {
            return StartCallErrorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(StartCallErrorJson startCallErrorJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || startCallErrorJson.code != null) {
            c9j5.AAP(startCallErrorJson.code, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StartCallErrorJson) && C7384Etj.areEqual(this.code, ((StartCallErrorJson) obj).code));
    }

    public static /* synthetic */ StartCallErrorJson copy$default(StartCallErrorJson startCallErrorJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startCallErrorJson.code;
        }
        return new StartCallErrorJson(str);
    }

    public final String component1() {
        return this.code;
    }

    public final StartCallErrorJson copy(String str) {
        return new StartCallErrorJson(str);
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.code);
    }

    public /* synthetic */ StartCallErrorJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public StartCallErrorJson(String str) {
        this.code = str;
    }

    public /* synthetic */ StartCallErrorJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public StartCallErrorJson() {
        this(null);
    }
}
