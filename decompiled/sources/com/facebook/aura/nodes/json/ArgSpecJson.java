package com.facebook.aura.nodes.json;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ArgSpecJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String description;
    public final int type;

    public final class Companion {
        public final C9hr<ArgSpecJson> serializer() {
            return ArgSpecJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(ArgSpecJson argSpecJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAK(c9iZ, 0, argSpecJson.type);
        if (c9j5.AfR() || argSpecJson.description != null) {
            c9j5.AAP(argSpecJson.description, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArgSpecJson) {
                ArgSpecJson argSpecJson = (ArgSpecJson) obj;
                if (this.type != argSpecJson.type || !C7384Etj.areEqual(this.description, argSpecJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArgSpecJson copy$default(ArgSpecJson argSpecJson, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = argSpecJson.type;
        }
        if ((i2 & 2) != 0) {
            str = argSpecJson.description;
        }
        return new ArgSpecJson(i, str);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.description;
    }

    public final ArgSpecJson copy(int i, String str) {
        return new ArgSpecJson(i, str);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + AnonymousClass006.A0G(this.description);
    }

    public ArgSpecJson(int i, String str) {
        this.type = i;
        this.description = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArgSpecJson(int i, int i2, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ArgSpecJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.type = i2;
        this.description = (i & 2) == 0 ? null : str;
    }

    public /* synthetic */ ArgSpecJson(int i, String str, int i2, C06H c06h) {
        this(i, AnonymousClass006.A0s(i2, str));
    }
}
