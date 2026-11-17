package com.facebook.aura.graphql;

import X.C3cI;
import X.C7384Etj;
import X.CPS;
import X.G0U;
import X.Ht9;
import X.InterfaceC2349BUy;

/* loaded from: classes5.dex */
public final /* synthetic */ class AuraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0 implements InterfaceC2349BUy, CPS {
    public final /* synthetic */ G0U function;

    public AuraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0(G0U g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.function = g0u;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CPS) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, this.function);
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return this.function.hashCode();
    }

    @Override // X.CPS
    public final /* synthetic */ void invoke(Throwable th) {
        this.function.invoke(th);
    }
}
