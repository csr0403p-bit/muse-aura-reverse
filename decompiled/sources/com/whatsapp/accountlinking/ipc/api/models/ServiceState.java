package com.whatsapp.accountlinking.ipc.api.models;

import X.C2hx;
import X.C9h3;
import X.C9hr;
import X.C9iI;
import X.F60;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ServiceState {
    public static final Companion Companion = new Companion();
    public final boolean enabled;

    public final class Companion {
        public final C9hr<ServiceState> serializer() {
            return C9h3.A00;
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ServiceState) && this.enabled == ((ServiceState) obj).enabled);
    }

    public /* synthetic */ ServiceState(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(C9h3.A01, i, 1);
            throw F60.createAndThrow();
        }
        this.enabled = z;
    }

    public static /* synthetic */ ServiceState copy$default(ServiceState serviceState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = serviceState.enabled;
        }
        return new ServiceState(z);
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final ServiceState copy(boolean z) {
        return new ServiceState(z);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return this.enabled ? 1231 : 1237;
    }

    public String toString() {
        return FGI.A0q("ServiceState(enabled=", ")", this.enabled);
    }

    public ServiceState(boolean z) {
        this.enabled = z;
    }
}
