package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorAuthResult extends C06G {
    public final boolean authenticationSucceeded;
    public final String connectorId;
    public final boolean refreshSucceeded;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorAuthResult) {
                ConnectorAuthResult connectorAuthResult = (ConnectorAuthResult) obj;
                if (!C7384Etj.areEqual(this.connectorId, connectorAuthResult.connectorId) || this.authenticationSucceeded != connectorAuthResult.authenticationSucceeded || this.refreshSucceeded != connectorAuthResult.refreshSucceeded) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorAuthResult copy$default(ConnectorAuthResult connectorAuthResult, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorAuthResult.connectorId;
        }
        if ((i & 2) != 0) {
            z = connectorAuthResult.authenticationSucceeded;
        }
        if ((i & 4) != 0) {
            z2 = connectorAuthResult.refreshSucceeded;
        }
        return new ConnectorAuthResult(str, z, z2);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final boolean component2() {
        return this.authenticationSucceeded;
    }

    public final boolean component3() {
        return this.refreshSucceeded;
    }

    public final ConnectorAuthResult copy(String str, boolean z, boolean z2) {
        return new ConnectorAuthResult(str, z, z2);
    }

    public final boolean getAuthenticationSucceeded() {
        return this.authenticationSucceeded;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final boolean getRefreshSucceeded() {
        return this.refreshSucceeded;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass006.A0G(this.connectorId) * 31, this.authenticationSucceeded), this.refreshSucceeded);
    }

    public ConnectorAuthResult(String str, boolean z, boolean z2) {
        this.connectorId = str;
        this.authenticationSucceeded = z;
        this.refreshSucceeded = z2;
    }

    public String toString() {
        return super.toString();
    }
}
