package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class Failure {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public FailureCode code;
    public FailureDetail detail;

    public Failure(FailureCode failureCode, FailureDetail failureDetail) {
        C7384Etj.A0Y(failureCode, 0);
        this.code = failureCode;
        this.detail = failureDetail;
    }

    public final Failure copy(FailureCode failureCode, FailureDetail failureDetail) {
        C7384Etj.A0Y(failureCode, 0);
        return new Failure(failureCode, failureDetail);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Failure) {
                Failure failure = (Failure) obj;
                if (this.code != failure.code || !C7384Etj.areEqual(this.detail, failure.detail)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setCode(FailureCode failureCode) {
        C7384Etj.A0Y(failureCode, 0);
        this.code = failureCode;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ Failure copy$default(Failure failure, FailureCode failureCode, FailureDetail failureDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            failureCode = failure.code;
        }
        if ((i & 2) != 0) {
            failureDetail = failure.detail;
        }
        C7384Etj.A0Y(failureCode, 0);
        return new Failure(failureCode, failureDetail);
    }

    public final FailureCode component1() {
        return this.code;
    }

    public final FailureDetail component2() {
        return this.detail;
    }

    public final FailureCode getCode() {
        return this.code;
    }

    public final FailureDetail getDetail() {
        return this.detail;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.code) + AnonymousClass006.A0D(this.detail);
    }

    public final void setDetail(FailureDetail failureDetail) {
        this.detail = failureDetail;
    }

    public String toString() {
        return C3cJ.A0L(this.detail, ", detail=", C3cG.A0f(this.code, "Failure(code="));
    }
}
