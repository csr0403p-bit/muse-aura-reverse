package com.facebook.aura.pairs;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectionsCollaboratingUiState extends C06G {
    public static final int $stable = ConnectionsResource.$stable;
    public final boolean isLoading;
    public final AHD<ConnectionsResource> items;
    public final String next;
    public final BO6<String, ConnectionsSpaceIcon> spaceIcons;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionsCollaboratingUiState) {
                ConnectionsCollaboratingUiState connectionsCollaboratingUiState = (ConnectionsCollaboratingUiState) obj;
                if (!C7384Etj.areEqual(this.items, connectionsCollaboratingUiState.items) || !C7384Etj.areEqual(this.spaceIcons, connectionsCollaboratingUiState.spaceIcons) || !C7384Etj.areEqual(this.next, connectionsCollaboratingUiState.next) || this.isLoading != connectionsCollaboratingUiState.isLoading) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ConnectionsCollaboratingUiState(AHD ahd, BO6 bo6, String str, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? C0953AJg.A00() : bo6, AnonymousClass006.A0t(i, str), AnonymousClass005.A1P(i, z));
    }

    public static /* synthetic */ ConnectionsCollaboratingUiState copy$default(ConnectionsCollaboratingUiState connectionsCollaboratingUiState, AHD ahd, BO6 bo6, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = connectionsCollaboratingUiState.items;
        }
        if ((i & 2) != 0) {
            bo6 = connectionsCollaboratingUiState.spaceIcons;
        }
        if ((i & 4) != 0) {
            str = connectionsCollaboratingUiState.next;
        }
        if ((i & 8) != 0) {
            z = connectionsCollaboratingUiState.isLoading;
        }
        AnonymousClass003.A0u(ahd, bo6);
        return new ConnectionsCollaboratingUiState(ahd, bo6, str, z);
    }

    public final AHD<ConnectionsResource> component1() {
        return this.items;
    }

    public final BO6<String, ConnectionsSpaceIcon> component2() {
        return this.spaceIcons;
    }

    public final String component3() {
        return this.next;
    }

    public final boolean component4() {
        return this.isLoading;
    }

    public final AHD<ConnectionsResource> getItems() {
        return this.items;
    }

    public final String getNext() {
        return this.next;
    }

    public final BO6<String, ConnectionsSpaceIcon> getSpaceIcons() {
        return this.spaceIcons;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.spaceIcons, AnonymousClass005.A0E(this.items)) + AnonymousClass006.A0G(this.next)) * 31, this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ConnectionsCollaboratingUiState copy(AHD<ConnectionsResource> ahd, BO6<String, ConnectionsSpaceIcon> bo6, String str, boolean z) {
        AnonymousClass003.A0u(ahd, bo6);
        return new ConnectionsCollaboratingUiState(ahd, bo6, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public ConnectionsCollaboratingUiState(AHD<ConnectionsResource> ahd, BO6<String, ConnectionsSpaceIcon> bo6, String str, boolean z) {
        AnonymousClass003.A0u(ahd, bo6);
        this.items = ahd;
        this.spaceIcons = bo6;
        this.next = str;
        this.isLoading = z;
    }

    public ConnectionsCollaboratingUiState() {
        this(AHI.A01, C0953AJg.A00(), null, false);
    }
}
