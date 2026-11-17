package com.facebook.aura.network.endpoint;

import X.AnonymousClass001;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.C9g;
import com.facebook.aura.network.sandbox.AuraSandbox;

/* loaded from: classes5.dex */
public final class AuraEndpointSelector implements C9g {
    public static final Companion Companion = new Companion();
    public static final String DEFAULT_DOMAIN_SUFFIX = "graph.meta.com";
    public static final String DEFAULT_SCHEME = "https";

    @Override // X.C9g
    public String facebookAuthority(String str) {
        C7384Etj.A0Y(str, 0);
        String graphqlHost = AuraSandbox.INSTANCE.getGraphqlHost();
        int length = graphqlHost.length();
        StringBuilder sbA0w = C60O.A0w();
        if (length == 0) {
            sbA0w.append(str);
        } else {
            sbA0w.append(str);
            sbA0w.append(".");
            sbA0w.append(graphqlHost);
        }
        return AnonymousClass001.A0v(".graph.meta.com", sbA0w);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public String scheme() {
        return "https";
    }
}
