package com.facebook.aura.graphql;

import X.AbstractC3358CGz;
import X.C06H;
import X.C3291C9t;
import X.C3cG;
import X.C7384Etj;
import X.C9v;
import X.CEV;
import X.CH0;
import java.io.File;

/* loaded from: classes5.dex */
public final class AuraGraphQLCacheFileStash extends C3291C9t<C9v> {
    public static final Companion Companion = new Companion();
    public static final File graphQLCacheDir = C3cG.A0O(C3cG.A06().getCacheDir(), "graphql_response_cache");

    public final class Companion {
        public final boolean clearGraphQLCache() {
            return CEV.A03(AuraGraphQLCacheFileStash.graphQLCacheDir);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraGraphQLCacheFileStash(String str, AbstractC3358CGz abstractC3358CGz) {
        super(C3cG.A0O(C3cG.A0O(graphQLCacheDir, str), abstractC3358CGz != null ? ((CH0) abstractC3358CGz).A01 : "anonymous"), new C9v() { // from class: com.facebook.aura.graphql.AuraGraphQLCacheFileStash.1
            @Override // X.C9v
            public boolean deletePath(File file) {
                C7384Etj.A0Y(file, 0);
                return CEV.A03(file);
            }
        });
        C7384Etj.A0Y(str, 0);
    }
}
