package com.facebook.aura.vmdisabled;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;

/* loaded from: classes.dex */
public final class VmReconnectUiState extends C06G {
    public final boolean isReconnecting;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VmReconnectUiState) && this.isReconnecting == ((VmReconnectUiState) obj).isReconnecting);
    }

    public static /* synthetic */ VmReconnectUiState copy$default(VmReconnectUiState vmReconnectUiState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = vmReconnectUiState.isReconnecting;
        }
        return new VmReconnectUiState(z);
    }

    public final boolean component1() {
        return this.isReconnecting;
    }

    public final VmReconnectUiState copy(boolean z) {
        return new VmReconnectUiState(z);
    }

    public int hashCode() {
        return this.isReconnecting ? 1231 : 1237;
    }

    public final boolean isReconnecting() {
        return this.isReconnecting;
    }

    public /* synthetic */ VmReconnectUiState(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public String toString() {
        return super.toString();
    }

    public VmReconnectUiState(boolean z) {
        this.isReconnecting = z;
    }

    public VmReconnectUiState() {
        this(false);
    }
}
