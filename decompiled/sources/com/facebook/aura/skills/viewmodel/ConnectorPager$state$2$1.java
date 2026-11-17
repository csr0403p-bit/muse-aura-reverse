package com.facebook.aura.skills.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import com.facebook.aura.skills.viewmodel.ConnectorPager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.viewmodel.ConnectorPager$state$2$1", f = "ConnectorPager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConnectorPager$state$2$1 extends AbstractC07127nr implements G0W<ConnectorCatalogPage, ConnectorPager.Request, HtJ<? super ConnectorPagerState>, Object> {
    public final /* synthetic */ ConnectorCatalogQuery $query;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectorPager$state$2$1(ConnectorCatalogQuery connectorCatalogQuery, HtJ<? super ConnectorPager$state$2$1> htJ) {
        super(3, htJ);
        this.$query = connectorCatalogQuery;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ConnectorCatalogPage connectorCatalogPage = (ConnectorCatalogPage) this.L$0;
        ConnectorPager.Request request = (ConnectorPager.Request) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (C7384Etj.areEqual(request.query, this.$query)) {
            return new ConnectorPagerState(this.$query, connectorCatalogPage, request.status);
        }
        return null;
    }

    @Override // X.G0W
    public final Object invoke(ConnectorCatalogPage connectorCatalogPage, ConnectorPager.Request request, HtJ<? super ConnectorPagerState> htJ) {
        ConnectorPager$state$2$1 connectorPager$state$2$1 = new ConnectorPager$state$2$1(this.$query, htJ);
        connectorPager$state$2$1.L$0 = connectorCatalogPage;
        connectorPager$state$2$1.L$1 = request;
        return connectorPager$state$2$1.invokeSuspend(Unit.INSTANCE);
    }
}
