package com.facebook.aura.bloks.graphql.frl;

import X.AbstractC5177DbK;
import X.C06H;
import X.C3cG;
import X.C5175DbI;
import X.C7384Etj;
import X.DY2;
import X.Hzd;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.base.Preconditions;

/* loaded from: classes5.dex */
public final class FrlBloksAsyncComponentQueryImpl {
    public static final Companion Companion = new Companion();
    public static final String QUERY_NAME = "FrlBloksAsyncComponentQuery";

    public final class Builder implements FrlBloksAsyncComponentQuery.Builder {
        public boolean isBkContextSet;
        public boolean isParamsSet;
        public final C5175DbI params = new C5175DbI();
        public final C5175DbI transientParams = new C5175DbI();

        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.Builder, com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.BuilderForBkContext
        public Builder setBkContext(Hzd hzd) {
            C7384Etj.A0Y(hzd, 0);
            this.params.A01(hzd, "bk_context");
            this.isBkContextSet = true;
            return this;
        }

        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.Builder, com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.BuilderForParams
        public Builder setParams(Hzd hzd) {
            C7384Etj.A0Y(hzd, 0);
            this.params.A01(hzd, AuraBloksDataProps.PARAMS);
            this.isParamsSet = true;
            return this;
        }

        @Override // X.InterfaceC5183Dbc
        public PandoGraphQLRequest build() {
            Preconditions.checkArgument(this.isParamsSet);
            Preconditions.checkArgument(this.isBkContextSet);
            return DY2.A00(AbstractC5177DbK.A00(), FrlBloksAsyncComponentQueryImpl.QUERY_NAME, null, "bloks_component_query", C3cG.A0h(), C5175DbI.A00(this.params), C5175DbI.A00(this.transientParams), FrlBloksAsyncComponentQueryImpl$Builder$build$1.INSTANCE, 0, false);
        }

        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.Builder, com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.BuilderForBkContext
        public /* bridge */ /* synthetic */ FrlBloksAsyncComponentQuery.Builder setBkContext(Hzd hzd) {
            setBkContext(hzd);
            return this;
        }

        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.Builder, com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.BuilderForParams
        public /* bridge */ /* synthetic */ FrlBloksAsyncComponentQuery.Builder setParams(Hzd hzd) {
            setParams(hzd);
            return this;
        }

        @Override // com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQuery.BuilderForParams
        public /* bridge */ /* synthetic */ FrlBloksAsyncComponentQuery.BuilderForBkContext setParams(Hzd hzd) {
            setParams(hzd);
            return this;
        }
    }

    public final class Companion {
        public final FrlBloksAsyncComponentQuery.BuilderForParams create() {
            return new Builder();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final FrlBloksAsyncComponentQuery.BuilderForParams create() {
        return new Builder();
    }
}
