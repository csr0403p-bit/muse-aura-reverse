package com.facebook.aura.bloks.graphql.frl;

import X.A7O;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;

/* loaded from: classes5.dex */
public final /* synthetic */ class FrlBloksAsyncActionQueryImpl$Builder$build$1 extends C7438Evz implements G0U<A7O, FrlBloksAsyncActionQueryResponse> {
    public static final FrlBloksAsyncActionQueryImpl$Builder$build$1 INSTANCE = new FrlBloksAsyncActionQueryImpl$Builder$build$1();

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final FrlBloksAsyncActionQueryResponse invoke2(A7O a7o) {
        C7384Etj.A0Y(a7o, 0);
        return new FrlBloksAsyncActionQueryResponse(a7o);
    }

    public FrlBloksAsyncActionQueryImpl$Builder$build$1() {
        super(1, FrlBloksAsyncActionQueryResponse.class, "<init>", "<init>(Lcom/facebook/graphql/modelutil/GraphQLData;)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ FrlBloksAsyncActionQueryResponse invoke(A7O a7o) {
        return new FrlBloksAsyncActionQueryResponse(C7384Etj.A0A(a7o));
    }
}
