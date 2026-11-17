package com.facebook.aura.gateway.connection;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;

/* loaded from: classes6.dex */
public final class ConnectionLifecycleSnapshot extends C06G {
    public final boolean isAgentExecutionActive;
    public final boolean isAppForeground;
    public final boolean isAssistOverlayActive;
    public final boolean isBackgroundSessionActive;
    public final boolean isLiveSessionActive;
    public final boolean isNodeOperationActive;

    public static /* synthetic */ ConnectionLifecycleSnapshot copy$default(ConnectionLifecycleSnapshot connectionLifecycleSnapshot, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        boolean z12 = z6;
        if ((i & 1) != 0) {
            z7 = connectionLifecycleSnapshot.isAppForeground;
        }
        if ((i & 2) != 0) {
            z8 = connectionLifecycleSnapshot.isBackgroundSessionActive;
        }
        if ((i & 4) != 0) {
            z9 = connectionLifecycleSnapshot.isAssistOverlayActive;
        }
        if ((i & 8) != 0) {
            z10 = connectionLifecycleSnapshot.isNodeOperationActive;
        }
        if ((i & 16) != 0) {
            z11 = connectionLifecycleSnapshot.isAgentExecutionActive;
        }
        if ((i & 32) != 0) {
            z12 = connectionLifecycleSnapshot.isLiveSessionActive;
        }
        return new ConnectionLifecycleSnapshot(z7, z8, z9, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionLifecycleSnapshot) {
                ConnectionLifecycleSnapshot connectionLifecycleSnapshot = (ConnectionLifecycleSnapshot) obj;
                if (this.isAppForeground != connectionLifecycleSnapshot.isAppForeground || this.isBackgroundSessionActive != connectionLifecycleSnapshot.isBackgroundSessionActive || this.isAssistOverlayActive != connectionLifecycleSnapshot.isAssistOverlayActive || this.isNodeOperationActive != connectionLifecycleSnapshot.isNodeOperationActive || this.isAgentExecutionActive != connectionLifecycleSnapshot.isAgentExecutionActive || this.isLiveSessionActive != connectionLifecycleSnapshot.isLiveSessionActive) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.isAppForeground;
    }

    public final boolean component2() {
        return this.isBackgroundSessionActive;
    }

    public final boolean component3() {
        return this.isAssistOverlayActive;
    }

    public final boolean component4() {
        return this.isNodeOperationActive;
    }

    public final boolean component5() {
        return this.isAgentExecutionActive;
    }

    public final boolean component6() {
        return this.isLiveSessionActive;
    }

    public final ConnectionLifecycleSnapshot copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new ConnectionLifecycleSnapshot(z, z2, z3, z4, z5, z6);
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.isAppForeground), this.isBackgroundSessionActive), this.isAssistOverlayActive), this.isNodeOperationActive), this.isAgentExecutionActive), this.isLiveSessionActive);
    }

    public final boolean isAgentExecutionActive() {
        return this.isAgentExecutionActive;
    }

    public final boolean isAppForeground() {
        return this.isAppForeground;
    }

    public final boolean isAssistOverlayActive() {
        return this.isAssistOverlayActive;
    }

    public final boolean isBackgroundSessionActive() {
        return this.isBackgroundSessionActive;
    }

    public final boolean isLiveSessionActive() {
        return this.isLiveSessionActive;
    }

    public final boolean isNodeOperationActive() {
        return this.isNodeOperationActive;
    }

    public /* synthetic */ ConnectionLifecycleSnapshot(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, C06H c06h) {
        this(z, AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, C3cG.A1K(i & 32, z6));
    }

    public String toString() {
        return super.toString();
    }

    public ConnectionLifecycleSnapshot(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.isAppForeground = z;
        this.isBackgroundSessionActive = z2;
        this.isAssistOverlayActive = z3;
        this.isNodeOperationActive = z4;
        this.isAgentExecutionActive = z5;
        this.isLiveSessionActive = z6;
    }
}
