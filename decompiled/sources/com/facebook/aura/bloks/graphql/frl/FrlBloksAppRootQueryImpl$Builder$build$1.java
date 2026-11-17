package com.facebook.aura.bloks.graphql.frl;

import X.A7O;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;

/* loaded from: classes5.dex */
public final /* synthetic */ class FrlBloksAppRootQueryImpl$Builder$build$1 extends C7438Evz implements G0U<A7O, FrlBloksAppRootQueryResponse> {
    public static final FrlBloksAppRootQueryImpl$Builder$build$1 INSTANCE = new FrlBloksAppRootQueryImpl$Builder$build$1();

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final FrlBloksAppRootQueryResponse invoke2(A7O a7o) {
        C7384Etj.A0Y(a7o, 0);
        return new FrlBloksAppRootQueryResponse(a7o);
    }

    public FrlBloksAppRootQueryImpl$Builder$build$1() {
        super(1, FrlBloksAppRootQueryResponse.class, "<init>", "<init>(Lcom/facebook/graphql/modelutil/GraphQLData;)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ FrlBloksAppRootQueryResponse invoke(A7O a7o) {
        return new FrlBloksAppRootQueryResponse(C7384Etj.A0A(a7o));
    }
}
