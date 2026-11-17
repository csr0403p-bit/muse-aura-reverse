package com.facebook.aura.commands.app;

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
public final class AppActionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String outcome;

    public final class Companion {
        public final C9hr<AppActionJson> serializer() {
            return AppActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final AppActionJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AppActionJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AppActionJson) && C7384Etj.areEqual(this.outcome, ((AppActionJson) obj).outcome));
    }

    public /* synthetic */ AppActionJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AppActionJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.outcome = str;
    }

    public static /* synthetic */ AppActionJson copy$default(AppActionJson appActionJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appActionJson.outcome;
        }
        C7384Etj.A0Y(str, 0);
        return new AppActionJson(str);
    }

    public final String component1() {
        return this.outcome;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return this.outcome.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public AppActionJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.outcome = str;
    }
}
