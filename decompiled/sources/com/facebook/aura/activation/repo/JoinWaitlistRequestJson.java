package com.facebook.aura.activation.repo;

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
public final class JoinWaitlistRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String source;

    public final class Companion {
        public final C9hr<JoinWaitlistRequestJson> serializer() {
            return JoinWaitlistRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final JoinWaitlistRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new JoinWaitlistRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof JoinWaitlistRequestJson) && C7384Etj.areEqual(this.source, ((JoinWaitlistRequestJson) obj).source));
    }

    public /* synthetic */ JoinWaitlistRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(JoinWaitlistRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.source = str;
    }

    public static /* synthetic */ JoinWaitlistRequestJson copy$default(JoinWaitlistRequestJson joinWaitlistRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joinWaitlistRequestJson.source;
        }
        C7384Etj.A0Y(str, 0);
        return new JoinWaitlistRequestJson(str);
    }

    public final String component1() {
        return this.source;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public JoinWaitlistRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.source = str;
    }
}
