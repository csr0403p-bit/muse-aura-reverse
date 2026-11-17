package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class CustomConnectorDetailsUiState extends C06G {
    public static final int $stable = 0;
    public final String disconnectingConnectorName;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CustomConnectorDetailsUiState) && C7384Etj.areEqual(this.disconnectingConnectorName, ((CustomConnectorDetailsUiState) obj).disconnectingConnectorName));
    }

    public static /* synthetic */ CustomConnectorDetailsUiState copy$default(CustomConnectorDetailsUiState customConnectorDetailsUiState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorDetailsUiState.disconnectingConnectorName;
        }
        return new CustomConnectorDetailsUiState(str);
    }

    public final String component1() {
        return this.disconnectingConnectorName;
    }

    public final CustomConnectorDetailsUiState copy(String str) {
        return new CustomConnectorDetailsUiState(str);
    }

    public final String getDisconnectingConnectorName() {
        return this.disconnectingConnectorName;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.disconnectingConnectorName);
    }

    public /* synthetic */ CustomConnectorDetailsUiState(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorDetailsUiState(String str) {
        this.disconnectingConnectorName = str;
    }

    public CustomConnectorDetailsUiState() {
        this(null);
    }
}
