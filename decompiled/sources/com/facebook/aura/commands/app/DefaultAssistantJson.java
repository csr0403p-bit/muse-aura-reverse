package com.facebook.aura.commands.app;

import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DefaultAssistantJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean can_request;
    public final boolean is_default;

    public final class Companion {
        public final C9hr<DefaultAssistantJson> serializer() {
            return DefaultAssistantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_app_app(DefaultAssistantJson defaultAssistantJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, defaultAssistantJson.is_default);
        c9j5.AA7(c9iZ, 1, defaultAssistantJson.can_request);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DefaultAssistantJson) {
                DefaultAssistantJson defaultAssistantJson = (DefaultAssistantJson) obj;
                if (this.is_default != defaultAssistantJson.is_default || this.can_request != defaultAssistantJson.can_request) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DefaultAssistantJson copy$default(DefaultAssistantJson defaultAssistantJson, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = defaultAssistantJson.is_default;
        }
        if ((i & 2) != 0) {
            z2 = defaultAssistantJson.can_request;
        }
        return new DefaultAssistantJson(z, z2);
    }

    public final boolean component1() {
        return this.is_default;
    }

    public final boolean component2() {
        return this.can_request;
    }

    public final DefaultAssistantJson copy(boolean z, boolean z2) {
        return new DefaultAssistantJson(z, z2);
    }

    public final boolean getCan_request() {
        return this.can_request;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A02(this.is_default), this.can_request);
    }

    public final boolean is_default() {
        return this.is_default;
    }

    public DefaultAssistantJson(boolean z, boolean z2) {
        this.is_default = z;
        this.can_request = z2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DefaultAssistantJson(int i, boolean z, boolean z2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DefaultAssistantJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.is_default = z;
        this.can_request = z2;
    }
}
