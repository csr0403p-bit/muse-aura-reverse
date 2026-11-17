package com.facebook.aura.skills.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10649I0t;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C3pU;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.viewmodel.ConnectorPager$special$$inlined$flatMapLatest$1", f = "ConnectorPager.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConnectorPager$special$$inlined$flatMapLatest$1 extends AbstractC07127nr implements G0W<C20Z<? super ConnectorPagerState>, ConnectorCatalogQuery, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ConnectorPager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectorPager$special$$inlined$flatMapLatest$1(HtJ htJ, ConnectorPager connectorPager) {
        super(3, htJ);
        this.this$0 = connectorPager;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Q<ConnectorCatalogPage> c20y;
        C20Z c20z = (C20Z) this.L$0;
        Object obj2 = this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConnectorCatalogQuery connectorCatalogQuery = (ConnectorCatalogQuery) obj2;
            if (connectorCatalogQuery == null || (c20y = this.this$0.repository.observePage(connectorCatalogQuery)) == null) {
                c20y = new C20Y<>(null);
            }
            C10649I0t c10649I0t = new C10649I0t(C3rb.A03(new ConnectorPager$state$2$1(connectorCatalogQuery, null), c20y, this.this$0.request), 2);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (C3pU.A01(this, c10649I0t, c20z) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super ConnectorPagerState> c20z, ConnectorCatalogQuery connectorCatalogQuery, HtJ<? super Unit> htJ) {
        ConnectorPager$special$$inlined$flatMapLatest$1 connectorPager$special$$inlined$flatMapLatest$1 = new ConnectorPager$special$$inlined$flatMapLatest$1(htJ, this.this$0);
        connectorPager$special$$inlined$flatMapLatest$1.L$0 = c20z;
        connectorPager$special$$inlined$flatMapLatest$1.L$1 = connectorCatalogQuery;
        return connectorPager$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
