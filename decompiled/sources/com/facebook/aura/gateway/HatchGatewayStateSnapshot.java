package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchCvmAuthenticationState;
import com.facebook.aura.gateway.HatchGatewayConnectionState;

/* loaded from: classes3.dex */
public final class HatchGatewayStateSnapshot extends C06G {
    public static final int $stable = 0;
    public final HatchCvmAuthenticationState authentication;
    public final HatchGatewayConnectionState connection;
    public final int connectionCycle;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchGatewayStateSnapshot) {
                HatchGatewayStateSnapshot hatchGatewayStateSnapshot = (HatchGatewayStateSnapshot) obj;
                if (!C7384Etj.areEqual(this.connection, hatchGatewayStateSnapshot.connection) || !C7384Etj.areEqual(this.authentication, hatchGatewayStateSnapshot.authentication) || this.connectionCycle != hatchGatewayStateSnapshot.connectionCycle) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchGatewayStateSnapshot copy$default(HatchGatewayStateSnapshot hatchGatewayStateSnapshot, HatchGatewayConnectionState hatchGatewayConnectionState, HatchCvmAuthenticationState hatchCvmAuthenticationState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hatchGatewayConnectionState = hatchGatewayStateSnapshot.connection;
        }
        if ((i2 & 2) != 0) {
            hatchCvmAuthenticationState = hatchGatewayStateSnapshot.authentication;
        }
        if ((i2 & 4) != 0) {
            i = hatchGatewayStateSnapshot.connectionCycle;
        }
        return hatchGatewayStateSnapshot.copy(hatchGatewayConnectionState, hatchCvmAuthenticationState, i);
    }

    public final HatchGatewayConnectionState component1() {
        return this.connection;
    }

    public final HatchCvmAuthenticationState component2() {
        return this.authentication;
    }

    public final int component3() {
        return this.connectionCycle;
    }

    public final HatchCvmAuthenticationState getAuthentication() {
        return this.authentication;
    }

    public final HatchGatewayConnectionState getConnection() {
        return this.connection;
    }

    public final int getConnectionCycle() {
        return this.connectionCycle;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.authentication, AnonymousClass005.A0E(this.connection)) + this.connectionCycle;
    }

    public HatchGatewayStateSnapshot(HatchGatewayConnectionState hatchGatewayConnectionState, HatchCvmAuthenticationState hatchCvmAuthenticationState, int i) {
        AnonymousClass003.A0u(hatchGatewayConnectionState, hatchCvmAuthenticationState);
        this.connection = hatchGatewayConnectionState;
        this.authentication = hatchCvmAuthenticationState;
        this.connectionCycle = i;
    }

    public final HatchGatewayStateSnapshot copy(HatchGatewayConnectionState hatchGatewayConnectionState, HatchCvmAuthenticationState hatchCvmAuthenticationState, int i) {
        AnonymousClass003.A0u(hatchGatewayConnectionState, hatchCvmAuthenticationState);
        return new HatchGatewayStateSnapshot(hatchGatewayConnectionState, hatchCvmAuthenticationState, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchGatewayStateSnapshot(HatchGatewayConnectionState hatchGatewayConnectionState, HatchCvmAuthenticationState hatchCvmAuthenticationState, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? new HatchGatewayConnectionState.Disconnected(HatchGatewayConnectionState.Reason.NONE) : hatchGatewayConnectionState, (i2 & 2) != 0 ? HatchCvmAuthenticationState.Disabled.INSTANCE : hatchCvmAuthenticationState, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGatewayStateSnapshot() {
        Object[] objArr = 0 == true ? 1 : 0;
        this(null, objArr, 0, 7, 0 == true ? 1 : 0);
    }
}
