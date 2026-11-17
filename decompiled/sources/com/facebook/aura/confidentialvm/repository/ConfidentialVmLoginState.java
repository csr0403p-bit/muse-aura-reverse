package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmLoginState extends C06G {
    public final Integer attemptsRemaining;
    public final Integer lockoutSecondsRemaining;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmLoginState) {
                ConfidentialVmLoginState confidentialVmLoginState = (ConfidentialVmLoginState) obj;
                if (!C7384Etj.areEqual(this.attemptsRemaining, confidentialVmLoginState.attemptsRemaining) || !C7384Etj.areEqual(this.lockoutSecondsRemaining, confidentialVmLoginState.lockoutSecondsRemaining)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmLoginState copy$default(ConfidentialVmLoginState confidentialVmLoginState, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = confidentialVmLoginState.attemptsRemaining;
        }
        if ((i & 2) != 0) {
            num2 = confidentialVmLoginState.lockoutSecondsRemaining;
        }
        return new ConfidentialVmLoginState(num, num2);
    }

    public final Integer component1() {
        return this.attemptsRemaining;
    }

    public final Integer component2() {
        return this.lockoutSecondsRemaining;
    }

    public final ConfidentialVmLoginState copy(Integer num, Integer num2) {
        return new ConfidentialVmLoginState(num, num2);
    }

    public final Integer getAttemptsRemaining() {
        return this.attemptsRemaining;
    }

    public final Integer getLockoutSecondsRemaining() {
        return this.lockoutSecondsRemaining;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.attemptsRemaining) * 31) + C06G.A04(this.lockoutSecondsRemaining);
    }

    public ConfidentialVmLoginState(Integer num, Integer num2) {
        this.attemptsRemaining = num;
        this.lockoutSecondsRemaining = num2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmLoginState(Integer num, Integer num2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    public ConfidentialVmLoginState() {
        this(null, null);
    }
}
