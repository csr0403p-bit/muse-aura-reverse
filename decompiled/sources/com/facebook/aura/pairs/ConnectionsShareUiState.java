package com.facebook.aura.pairs;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.BQI;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0953AJg;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ConnectionsShareUiState extends C06G {
    public static final int $stable = ConnectionsShareTarget.$stable;
    public final boolean isLoadingMore;
    public final String next;
    public final ConnectionsSharePhase phase;
    public final BQI<String> selected;
    public final BO6<String, ConnectionsShareStatus> statuses;
    public final AHD<ConnectionsShareTarget> targets;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionsShareUiState) {
                ConnectionsShareUiState connectionsShareUiState = (ConnectionsShareUiState) obj;
                if (this.phase != connectionsShareUiState.phase || !C7384Etj.areEqual(this.targets, connectionsShareUiState.targets) || !C7384Etj.areEqual(this.selected, connectionsShareUiState.selected) || !C7384Etj.areEqual(this.statuses, connectionsShareUiState.statuses) || !C7384Etj.areEqual(this.next, connectionsShareUiState.next) || this.isLoadingMore != connectionsShareUiState.isLoadingMore) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectionsShareUiState copy$default(ConnectionsShareUiState connectionsShareUiState, ConnectionsSharePhase connectionsSharePhase, AHD ahd, BQI bqi, BO6 bo6, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionsSharePhase = connectionsShareUiState.phase;
        }
        if ((i & 2) != 0) {
            ahd = connectionsShareUiState.targets;
        }
        if ((i & 4) != 0) {
            bqi = connectionsShareUiState.selected;
        }
        if ((i & 8) != 0) {
            bo6 = connectionsShareUiState.statuses;
        }
        if ((i & 16) != 0) {
            str = connectionsShareUiState.next;
        }
        if ((i & 32) != 0) {
            z = connectionsShareUiState.isLoadingMore;
        }
        return connectionsShareUiState.copy(connectionsSharePhase, ahd, bqi, bo6, str, z);
    }

    public final ConnectionsSharePhase component1() {
        return this.phase;
    }

    public final AHD<ConnectionsShareTarget> component2() {
        return this.targets;
    }

    public final BQI<String> component3() {
        return this.selected;
    }

    public final BO6<String, ConnectionsShareStatus> component4() {
        return this.statuses;
    }

    public final String component5() {
        return this.next;
    }

    public final boolean component6() {
        return this.isLoadingMore;
    }

    public final boolean getHasStarted() {
        return !this.statuses.isEmpty();
    }

    public final String getNext() {
        return this.next;
    }

    public final ConnectionsSharePhase getPhase() {
        return this.phase;
    }

    public final Set<String> getRetryable() {
        BO6<String, ConnectionsShareStatus> bo6 = this.statuses;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(bo6);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (entryA0l.getValue() == ConnectionsShareStatus.FAILED) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        return linkedHashMapA0j.keySet();
    }

    public final BQI<String> getSelected() {
        return this.selected;
    }

    public final BO6<String, ConnectionsShareStatus> getStatuses() {
        return this.statuses;
    }

    public final AHD<ConnectionsShareTarget> getTargets() {
        return this.targets;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.statuses, AnonymousClass005.A0F(this.selected, AnonymousClass005.A0F(this.targets, AnonymousClass005.A0E(this.phase)))) + AnonymousClass006.A0G(this.next)) * 31, this.isLoadingMore);
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsShareUiState(ConnectionsSharePhase connectionsSharePhase, AHD<ConnectionsShareTarget> ahd, BQI<String> bqi, BO6<String, ? extends ConnectionsShareStatus> bo6, String str, boolean z) {
        AnonymousClass005.A14(connectionsSharePhase, ahd, bqi, bo6);
        this.phase = connectionsSharePhase;
        this.targets = ahd;
        this.selected = bqi;
        this.statuses = bo6;
        this.next = str;
        this.isLoadingMore = z;
    }

    public final ConnectionsShareUiState copy(ConnectionsSharePhase connectionsSharePhase, AHD<ConnectionsShareTarget> ahd, BQI<String> bqi, BO6<String, ? extends ConnectionsShareStatus> bo6, String str, boolean z) {
        AnonymousClass005.A14(connectionsSharePhase, ahd, bqi, bo6);
        return new ConnectionsShareUiState(connectionsSharePhase, ahd, bqi, bo6, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionsShareUiState(ConnectionsSharePhase connectionsSharePhase, AHD ahd, BQI bqi, BO6 bo6, String str, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? ConnectionsSharePhase.LOADING : connectionsSharePhase, (i & 2) != 0 ? AHI.A01 : ahd, (i & 4) != 0 ? C0943AIw.A03 : bqi, (i & 8) != 0 ? C0953AJg.A00() : bo6, (i & 16) != 0 ? null : str, AnonymousClass002.A1R(i, z));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsShareUiState() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, false, 63, 0 == true ? 1 : 0);
    }
}
