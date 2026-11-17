package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class GatewayVmRetryPolicy extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final GatewayVmRetryPolicy NONE = new GatewayVmRetryPolicy(null, null);
    public final Long clientDelayMs;
    public final Long serverDelayMs;

    public final class Companion {
        public final GatewayVmRetryPolicy getNONE() {
            return GatewayVmRetryPolicy.NONE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GatewayVmRetryPolicy) {
                GatewayVmRetryPolicy gatewayVmRetryPolicy = (GatewayVmRetryPolicy) obj;
                if (!C7384Etj.areEqual(this.serverDelayMs, gatewayVmRetryPolicy.serverDelayMs) || !C7384Etj.areEqual(this.clientDelayMs, gatewayVmRetryPolicy.clientDelayMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GatewayVmRetryPolicy copy$default(GatewayVmRetryPolicy gatewayVmRetryPolicy, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = gatewayVmRetryPolicy.serverDelayMs;
        }
        if ((i & 2) != 0) {
            l2 = gatewayVmRetryPolicy.clientDelayMs;
        }
        return new GatewayVmRetryPolicy(l, l2);
    }

    public final Long component1() {
        return this.serverDelayMs;
    }

    public final Long component2() {
        return this.clientDelayMs;
    }

    public final GatewayVmRetryPolicy copy(Long l, Long l2) {
        return new GatewayVmRetryPolicy(l, l2);
    }

    public final Long getClientDelayMs() {
        return this.clientDelayMs;
    }

    public final Long getServerDelayMs() {
        return this.serverDelayMs;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.serverDelayMs) * 31) + C3cH.A02(this.clientDelayMs);
    }

    public GatewayVmRetryPolicy(Long l, Long l2) {
        this.serverDelayMs = l;
        this.clientDelayMs = l2;
    }

    public String toString() {
        return super.toString();
    }
}
