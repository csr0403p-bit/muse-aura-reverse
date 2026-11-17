package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class ObservationSignal {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String ruleId;
    public SignalKind signal;

    public ObservationSignal(SignalKind signalKind, String str) {
        C7384Etj.A0Y(signalKind, 0);
        this.signal = signalKind;
        this.ruleId = str;
    }

    public final ObservationSignal copy(SignalKind signalKind, String str) {
        C7384Etj.A0Y(signalKind, 0);
        return new ObservationSignal(signalKind, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ObservationSignal) {
                ObservationSignal observationSignal = (ObservationSignal) obj;
                if (this.signal != observationSignal.signal || !C7384Etj.areEqual(this.ruleId, observationSignal.ruleId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setSignal(SignalKind signalKind) {
        C7384Etj.A0Y(signalKind, 0);
        this.signal = signalKind;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ ObservationSignal copy$default(ObservationSignal observationSignal, SignalKind signalKind, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            signalKind = observationSignal.signal;
        }
        if ((i & 2) != 0) {
            str = observationSignal.ruleId;
        }
        C7384Etj.A0Y(signalKind, 0);
        return new ObservationSignal(signalKind, str);
    }

    public final SignalKind component1() {
        return this.signal;
    }

    public final String component2() {
        return this.ruleId;
    }

    public final String getRuleId() {
        return this.ruleId;
    }

    public final SignalKind getSignal() {
        return this.signal;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.signal) + AnonymousClass006.A0G(this.ruleId);
    }

    public final void setRuleId(String str) {
        this.ruleId = str;
    }

    public String toString() {
        return C3cJ.A0N(", ruleId=", this.ruleId, C3cG.A0f(this.signal, "ObservationSignal(signal="));
    }
}
