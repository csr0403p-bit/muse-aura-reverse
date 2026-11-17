package com.facebook.aura.skills.connect.config;

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
/* loaded from: classes4.dex */
public final class CustomConnectorNameJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String name;

    public final class Companion {
        public final C9hr<CustomConnectorNameJson> serializer() {
            return CustomConnectorNameJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorNameJson customConnectorNameJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(customConnectorNameJson.name)) {
            c9j5.AAV(customConnectorNameJson.name, c9iZ, 0);
        }
    }

    public final CustomConnectorNameJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new CustomConnectorNameJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CustomConnectorNameJson) && C7384Etj.areEqual(this.name, ((CustomConnectorNameJson) obj).name));
    }

    public static /* synthetic */ CustomConnectorNameJson copy$default(CustomConnectorNameJson customConnectorNameJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorNameJson.name;
        }
        C7384Etj.A0Y(str, 0);
        return new CustomConnectorNameJson(str);
    }

    public final String component1() {
        return this.name;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public /* synthetic */ CustomConnectorNameJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorNameJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
    }

    public /* synthetic */ CustomConnectorNameJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public CustomConnectorNameJson() {
        this("");
    }
}
