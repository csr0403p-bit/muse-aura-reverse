package com.facebook.aura.login.nativeflow;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ChallengeStructJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String challenge;

    public final class Companion {
        public final C9hr<ChallengeStructJson> serializer() {
            return ChallengeStructJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ChallengeStructJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ChallengeStructJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ChallengeStructJson) && C7384Etj.areEqual(this.challenge, ((ChallengeStructJson) obj).challenge));
    }

    public /* synthetic */ ChallengeStructJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ChallengeStructJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.challenge = str;
    }

    public static /* synthetic */ ChallengeStructJson copy$default(ChallengeStructJson challengeStructJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeStructJson.challenge;
        }
        C7384Etj.A0Y(str, 0);
        return new ChallengeStructJson(str);
    }

    public final String component1() {
        return this.challenge;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public int hashCode() {
        return this.challenge.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ChallengeStructJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.challenge = str;
    }
}
