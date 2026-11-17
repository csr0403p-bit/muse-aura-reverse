package com.facebook.aura.bloks.graphql.frl;

import X.A7N;
import X.A7O;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class FrlBloksAppRootQueryResponse extends A7N {
    public static final String BUILD_CONFIG_NAME = "frl-android";
    public static final Companion Companion = new Companion();
    public static final int FRAGMENT_NAME_HASH = -1929553678;

    public final class BloksApp extends A7N {

        public final class BloksBundle extends A7N {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BloksBundle(A7O a7o) {
                super(a7o);
                C7384Etj.A0Y(a7o, 0);
            }

            public final String getBloksBundleTree() {
                return this.innerData.AIJ(1502950793);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloksApp(A7O a7o) {
            super(a7o);
            C7384Etj.A0Y(a7o, 0);
        }

        public final BloksBundle getBloksBundle() {
            A7O a7oAIK = this.innerData.AIK(-1603960972);
            if (a7oAIK != null) {
                return new BloksBundle(a7oAIK);
            }
            return null;
        }
    }

    public final class Companion {
        public final String getBUILD_CONFIG_NAME() {
            return FrlBloksAppRootQueryResponse.BUILD_CONFIG_NAME;
        }

        public final int getFRAGMENT_NAME_HASH() {
            return FrlBloksAppRootQueryResponse.FRAGMENT_NAME_HASH;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrlBloksAppRootQueryResponse(A7O a7o) {
        super(a7o);
        C7384Etj.A0Y(a7o, 0);
    }

    public final BloksApp getBloksApp() {
        A7O a7oAIK = this.innerData.AIK(1109188719);
        if (a7oAIK != null) {
            return new BloksApp(a7oAIK);
        }
        return null;
    }
}
