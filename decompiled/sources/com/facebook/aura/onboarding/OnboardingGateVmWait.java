package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.gateway.HatchGatewayConnectionState;

/* loaded from: classes3.dex */
public final class OnboardingGateVmWait extends C06G {
    public final HatchGatewayConnectionState connectionState;
    public final Long elapsedMs;
    public final String gatewayLastFailure;
    public final Outcome outcome;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Outcome {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Outcome[] $VALUES;
        public static final Outcome CONNECTED;
        public static final Outcome NOT_STARTED;
        public static final Outcome OFFLINE;
        public static final Outcome TIMED_OUT;
        public final String wireValue;

        static {
            Outcome outcome = new Outcome("NOT_STARTED", 0, "not_started");
            NOT_STARTED = outcome;
            Outcome outcome2 = new Outcome("CONNECTED", 1, "connected");
            CONNECTED = outcome2;
            Outcome outcome3 = new Outcome("OFFLINE", 2, "offline");
            OFFLINE = outcome3;
            Outcome outcome4 = new Outcome("TIMED_OUT", 3, "timed_out");
            TIMED_OUT = outcome4;
            Outcome[] outcomeArr = {outcome, outcome2, outcome3, outcome4};
            $VALUES = outcomeArr;
            $ENTRIES = C3cG.A0w(outcomeArr);
        }

        public static Ey9<Outcome> getEntries() {
            return $ENTRIES;
        }

        public static Outcome valueOf(String str) {
            return (Outcome) Enum.valueOf(Outcome.class, str);
        }

        public static Outcome[] values() {
            return (Outcome[]) $VALUES.clone();
        }

        public final String getWireValue() {
            return this.wireValue;
        }

        public Outcome(String str, int i, String str2) {
            this.wireValue = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingGateVmWait) {
                OnboardingGateVmWait onboardingGateVmWait = (OnboardingGateVmWait) obj;
                if (this.outcome != onboardingGateVmWait.outcome || !C7384Etj.areEqual(this.elapsedMs, onboardingGateVmWait.elapsedMs) || !C7384Etj.areEqual(this.connectionState, onboardingGateVmWait.connectionState) || !C7384Etj.areEqual(this.gatewayLastFailure, onboardingGateVmWait.gatewayLastFailure)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ OnboardingGateVmWait(Outcome outcome, Long l, HatchGatewayConnectionState hatchGatewayConnectionState, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? Outcome.NOT_STARTED : outcome, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : hatchGatewayConnectionState, (i & 8) != 0 ? OnboardingGateLoggingKt.GATEWAY_CONNECT_NOT_STARTED : str);
    }

    public static /* synthetic */ OnboardingGateVmWait copy$default(OnboardingGateVmWait onboardingGateVmWait, Outcome outcome, Long l, HatchGatewayConnectionState hatchGatewayConnectionState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            outcome = onboardingGateVmWait.outcome;
        }
        if ((i & 2) != 0) {
            l = onboardingGateVmWait.elapsedMs;
        }
        if ((i & 4) != 0) {
            hatchGatewayConnectionState = onboardingGateVmWait.connectionState;
        }
        if ((i & 8) != 0) {
            str = onboardingGateVmWait.gatewayLastFailure;
        }
        AnonymousClass003.A0w(outcome, str);
        return new OnboardingGateVmWait(outcome, l, hatchGatewayConnectionState, str);
    }

    public final Outcome component1() {
        return this.outcome;
    }

    public final Long component2() {
        return this.elapsedMs;
    }

    public final HatchGatewayConnectionState component3() {
        return this.connectionState;
    }

    public final String component4() {
        return this.gatewayLastFailure;
    }

    public final HatchGatewayConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final Long getElapsedMs() {
        return this.elapsedMs;
    }

    public final String getGatewayLastFailure() {
        return this.gatewayLastFailure;
    }

    public final Outcome getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.gatewayLastFailure, (((AnonymousClass005.A0E(this.outcome) + AnonymousClass006.A0D(this.elapsedMs)) * 31) + C3cH.A02(this.connectionState)) * 31);
    }

    public final OnboardingGateVmWait copy(Outcome outcome, Long l, HatchGatewayConnectionState hatchGatewayConnectionState, String str) {
        AnonymousClass003.A0w(outcome, str);
        return new OnboardingGateVmWait(outcome, l, hatchGatewayConnectionState, str);
    }

    public String toString() {
        return super.toString();
    }

    public OnboardingGateVmWait(Outcome outcome, Long l, HatchGatewayConnectionState hatchGatewayConnectionState, String str) {
        AnonymousClass003.A0w(outcome, str);
        this.outcome = outcome;
        this.elapsedMs = l;
        this.connectionState = hatchGatewayConnectionState;
        this.gatewayLastFailure = str;
    }

    public OnboardingGateVmWait() {
        this(Outcome.NOT_STARTED, null, null, OnboardingGateLoggingKt.GATEWAY_CONNECT_NOT_STARTED);
    }
}
