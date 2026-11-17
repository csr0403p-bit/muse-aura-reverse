package com.facebook.aura.bugreport;

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
/* loaded from: classes3.dex */
public final class StefiBugResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String bug_id;

    public final class Companion {
        public final C9hr<StefiBugResponseJson> serializer() {
            return StefiBugResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(StefiBugResponseJson stefiBugResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(stefiBugResponseJson.bug_id)) {
            c9j5.AAV(stefiBugResponseJson.bug_id, c9iZ, 0);
        }
    }

    public final StefiBugResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new StefiBugResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StefiBugResponseJson) && C7384Etj.areEqual(this.bug_id, ((StefiBugResponseJson) obj).bug_id));
    }

    public static /* synthetic */ StefiBugResponseJson copy$default(StefiBugResponseJson stefiBugResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stefiBugResponseJson.bug_id;
        }
        C7384Etj.A0Y(str, 0);
        return new StefiBugResponseJson(str);
    }

    public final String component1() {
        return this.bug_id;
    }

    public final String getBug_id() {
        return this.bug_id;
    }

    public int hashCode() {
        return this.bug_id.hashCode();
    }

    public /* synthetic */ StefiBugResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.bug_id = "";
        } else {
            this.bug_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public StefiBugResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.bug_id = str;
    }

    public /* synthetic */ StefiBugResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public StefiBugResponseJson() {
        this("");
    }
}
