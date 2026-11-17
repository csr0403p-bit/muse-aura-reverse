package com.facebook.aura.skills.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;

/* loaded from: classes.dex */
public final class ConnectorPagerState extends C06G {
    public final ConnectorLoadStatus loadStatus;
    public final ConnectorCatalogPage page;
    public final ConnectorCatalogQuery query;

    public ConnectorPagerState(ConnectorCatalogQuery connectorCatalogQuery, ConnectorCatalogPage connectorCatalogPage, ConnectorLoadStatus connectorLoadStatus) {
        C7384Etj.A0Y(connectorLoadStatus, 2);
        this.query = connectorCatalogQuery;
        this.page = connectorCatalogPage;
        this.loadStatus = connectorLoadStatus;
    }

    public final ConnectorPagerState copy(ConnectorCatalogQuery connectorCatalogQuery, ConnectorCatalogPage connectorCatalogPage, ConnectorLoadStatus connectorLoadStatus) {
        C7384Etj.A0Y(connectorLoadStatus, 2);
        return new ConnectorPagerState(connectorCatalogQuery, connectorCatalogPage, connectorLoadStatus);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorPagerState) {
                ConnectorPagerState connectorPagerState = (ConnectorPagerState) obj;
                if (!C7384Etj.areEqual(this.query, connectorPagerState.query) || !C7384Etj.areEqual(this.page, connectorPagerState.page) || this.loadStatus != connectorPagerState.loadStatus) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorPagerState copy$default(ConnectorPagerState connectorPagerState, ConnectorCatalogQuery connectorCatalogQuery, ConnectorCatalogPage connectorCatalogPage, ConnectorLoadStatus connectorLoadStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            connectorCatalogQuery = connectorPagerState.query;
        }
        if ((i & 2) != 0) {
            connectorCatalogPage = connectorPagerState.page;
        }
        if ((i & 4) != 0) {
            connectorLoadStatus = connectorPagerState.loadStatus;
        }
        return connectorPagerState.copy(connectorCatalogQuery, connectorCatalogPage, connectorLoadStatus);
    }

    public final ConnectorCatalogQuery component1() {
        return this.query;
    }

    public final ConnectorCatalogPage component2() {
        return this.page;
    }

    public final ConnectorLoadStatus component3() {
        return this.loadStatus;
    }

    public final boolean getHasMore() {
        ConnectorCatalogPage connectorCatalogPage = this.page;
        return (connectorCatalogPage == null || connectorCatalogPage.nextCursor == null) ? false : true;
    }

    public final ConnectorLoadStatus getLoadStatus() {
        return this.loadStatus;
    }

    public final ConnectorCatalogPage getPage() {
        return this.page;
    }

    public final ConnectorCatalogQuery getQuery() {
        return this.query;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.loadStatus, ((AnonymousClass006.A0D(this.query) * 31) + C06G.A04(this.page)) * 31);
    }

    public final boolean getCanLoadMore() {
        return getHasMore() && this.loadStatus == ConnectorLoadStatus.IDLE;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorPagerState(ConnectorCatalogQuery connectorCatalogQuery, ConnectorCatalogPage connectorCatalogPage, ConnectorLoadStatus connectorLoadStatus, int i, C06H c06h) {
        this((i & 1) != 0 ? null : connectorCatalogQuery, (i & 2) != 0 ? null : connectorCatalogPage, (i & 4) != 0 ? ConnectorLoadStatus.IDLE : connectorLoadStatus);
    }

    public ConnectorPagerState() {
        this(null, null, ConnectorLoadStatus.IDLE);
    }
}
