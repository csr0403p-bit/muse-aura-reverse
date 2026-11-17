package com.facebook.aura.ageverification;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class AgeVerificationStatus {
    public static final int $stable = 8;
    public final String attemptStatus;
    public final List<AgeVerificationMethod> methods;
    public final Integer retriesLeft;
    public final AgeVerificationState state;

    /* JADX WARN: Multi-variable type inference failed */
    public AgeVerificationStatus(AgeVerificationState ageVerificationState, List<? extends AgeVerificationMethod> list, Integer num, String str) {
        C7384Etj.A0Y(list, 1);
        this.state = ageVerificationState;
        this.methods = list;
        this.retriesLeft = num;
        this.attemptStatus = str;
    }

    public final String getAttemptStatus() {
        return this.attemptStatus;
    }

    public final List<AgeVerificationMethod> getMethods() {
        return this.methods;
    }

    public final Integer getRetriesLeft() {
        return this.retriesLeft;
    }

    public final AgeVerificationState getState() {
        return this.state;
    }
}
