package com.facebook.aura.bloks.graphql.frl;

import X.C06H;
import X.DYI;
import X.Hzd;
import X.InterfaceC5183Dbc;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncActionQueryImpl;

/* loaded from: classes5.dex */
public final class FrlBloksAsyncActionQuery {
    public static final Companion Companion = new Companion();

    public interface Builder extends BuilderForParams, BuilderForBkContext, InterfaceC5183Dbc<DYI<FrlBloksAsyncActionQueryResponse>, FrlBloksAsyncActionQueryResponse> {
        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncActionQuery.BuilderForBkContext
        Builder setBkContext(Hzd hzd);

        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncActionQuery.BuilderForParams
        Builder setParams(Hzd hzd);

        /* renamed from: com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncActionQuery$Builder$-CC, reason: invalid class name */
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
            return new FrlBloksAsyncActionQueryImpl.Builder();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final BuilderForParams create() {
        return new FrlBloksAsyncActionQueryImpl.Builder();
    }
}
