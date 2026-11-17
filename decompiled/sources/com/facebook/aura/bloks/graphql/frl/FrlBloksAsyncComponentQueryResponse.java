package com.facebook.aura.bloks.graphql.frl;

import X.A7N;
import X.A7O;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class FrlBloksAsyncComponentQueryResponse extends A7N {
    public static final String BUILD_CONFIG_NAME = "frl-android";
    public static final Companion Companion = new Companion();
    public static final int FRAGMENT_NAME_HASH = -1777363526;

    /* loaded from: classes6.dex */
    public final class BloksComponentQuery extends A7N {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloksComponentQuery(A7O a7o) {
            super(a7o);
            C7384Etj.A0Y(a7o, 0);
        }

        public final FrlBloksComponentQueryFragment asFrlBloksComponentQueryFragment() {
            return new FrlBloksComponentQueryFragment(this.innerData.Aa6(187742728));
        }
    }

    public final class Companion {
        public final String getBUILD_CONFIG_NAME() {
            return FrlBloksAsyncComponentQueryResponse.BUILD_CONFIG_NAME;
        }

        public final int getFRAGMENT_NAME_HASH() {
            return FrlBloksAsyncComponentQueryResponse.FRAGMENT_NAME_HASH;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrlBloksAsyncComponentQueryResponse(A7O a7o) {
        super(a7o);
        C7384Etj.A0Y(a7o, 0);
    }

    public final BloksComponentQuery getBloksComponentQuery() {
        A7O a7oAIK = this.innerData.AIK(-1241741228);
        if (a7oAIK != null) {
            return new BloksComponentQuery(a7oAIK);
        }
        return null;
    }
}
