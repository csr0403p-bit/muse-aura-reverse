package com.facebook.aura.pairs;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BQI;
import X.C06H;
import X.C0943AIw;
import X.C3cI;

/* loaded from: classes3.dex */
public final class ConnectionsGuidanceUiState {
    public static final int $stable = ConnectionsSharingRule.$stable;
    public final BQI<String> busyIds;
    public final boolean canEdit;
    public final String connectionId;
    public final boolean isUnavailable;
    public final AHD<ConnectionsSharingRule> rules;

    public final BQI<String> getBusyIds() {
        return this.busyIds;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final AHD<ConnectionsSharingRule> getRules() {
        return this.rules;
    }

    public final boolean isUnavailable() {
        return this.isUnavailable;
    }

    public ConnectionsGuidanceUiState(AHD<ConnectionsSharingRule> ahd, BQI<String> bqi, String str, boolean z, boolean z2) {
        AnonymousClass003.A0u(ahd, bqi);
        this.rules = ahd;
        this.busyIds = bqi;
        this.connectionId = str;
        this.canEdit = z;
        this.isUnavailable = z2;
    }

    public /* synthetic */ ConnectionsGuidanceUiState(AHD ahd, BQI bqi, String str, boolean z, boolean z2, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? C0943AIw.A03 : bqi, AnonymousClass006.A0t(i, str), (i & 8) != 0 ? true : z, C3cI.A1S(i, z2));
    }

    public ConnectionsGuidanceUiState() {
        this(AHI.A01, C0943AIw.A03, null, true, false);
    }
}
