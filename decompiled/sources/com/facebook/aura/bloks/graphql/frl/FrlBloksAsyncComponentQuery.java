package com.facebook.aura.bloks.graphql.frl;

import X.C06H;
import X.DYI;
import X.Hzd;
import X.InterfaceC5183Dbc;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQueryImpl;

/* loaded from: classes5.dex */
public final class FrlBloksAsyncComponentQuery {
    public static final Companion Companion = new Companion();

    public interface Builder extends BuilderForParams, BuilderForBkContext, InterfaceC5183Dbc<DYI<FrlBloksAsyncComponentQueryResponse>, FrlBloksAsyncComponentQueryResponse> {
        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.BuilderForBkContext
        Builder setBkContext(Hzd hzd);

        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.BuilderForParams
        Builder setParams(Hzd hzd);

        /* renamed from: com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery$Builder$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
        }
    }

    public interface BuilderForBkContext {
        Builder setBkContext(Hzd hzd);
    }

    public interface BuilderForParams {
        BuilderForBkContext setParams(Hzd hzd);
    }

    public final class Companion {
        public final BuilderForParams create() {
            return new FrlBloksAsyncComponentQueryImpl.Builder();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final BuilderForParams create() {
        return new FrlBloksAsyncComponentQueryImpl.Builder();
    }
}
