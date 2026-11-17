package com.facebook.aura.bloks.graphql.frl;

import X.A7N;
import X.A7O;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class FrlBloksAsyncActionQueryResponse extends A7N {
    public static final String BUILD_CONFIG_NAME = "frl-android";
    public static final Companion Companion = new Companion();
    public static final int FRAGMENT_NAME_HASH = -649771357;

    public final class BloksAction extends A7N {

        public final class Action extends A7N {

            public final class ActionBundle extends A7N {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ActionBundle(A7O a7o) {
                    super(a7o);
                    C7384Etj.A0Y(a7o, 0);
                }

                public final String getBloksBundleAction() {
                    return this.innerData.AIJ(669348193);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(A7O a7o) {
                super(a7o);
                C7384Etj.A0Y(a7o, 0);
            }

            public final ActionBundle getActionBundle() {
                A7O a7oAIK = this.innerData.AIK(1054172843);
                if (a7oAIK != null) {
                    return new ActionBundle(a7oAIK);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloksAction(A7O a7o) {
            super(a7o);
            C7384Etj.A0Y(a7o, 0);
        }

        public final Action getAction() {
            A7O a7oAIK = this.innerData.AIK(-1422950858);
            if (a7oAIK != null) {
                return new Action(a7oAIK);
            }
            return null;
        }
    }

    public final class Companion {
        public final String getBUILD_CONFIG_NAME() {
            return FrlBloksAsyncActionQueryResponse.BUILD_CONFIG_NAME;
        }

        public final int getFRAGMENT_NAME_HASH() {
            return FrlBloksAsyncActionQueryResponse.FRAGMENT_NAME_HASH;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrlBloksAsyncActionQueryResponse(A7O a7o) {
        super(a7o);
        C7384Etj.A0Y(a7o, 0);
    }

    public final BloksAction getBloksAction() {
        A7O a7oAIK = this.innerData.AIK(-1649029848);
        if (a7oAIK != null) {
            return new BloksAction(a7oAIK);
        }
        return null;
    }
}
