package com.facebook.aura.settings;

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
public final class AcceptChannelTosRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String tos_name;

    public final class Companion {
        public final C9hr<AcceptChannelTosRequestJson> serializer() {
            return AcceptChannelTosRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final AcceptChannelTosRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AcceptChannelTosRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AcceptChannelTosRequestJson) && C7384Etj.areEqual(this.tos_name, ((AcceptChannelTosRequestJson) obj).tos_name));
    }

    public /* synthetic */ AcceptChannelTosRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AcceptChannelTosRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.tos_name = str;
    }

    public static /* synthetic */ AcceptChannelTosRequestJson copy$default(AcceptChannelTosRequestJson acceptChannelTosRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acceptChannelTosRequestJson.tos_name;
        }
        C7384Etj.A0Y(str, 0);
        return new AcceptChannelTosRequestJson(str);
    }

    public final String component1() {
        return this.tos_name;
    }

    public final String getTos_name() {
        return this.tos_name;
    }

    public int hashCode() {
        return this.tos_name.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public AcceptChannelTosRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.tos_name = str;
    }
}
