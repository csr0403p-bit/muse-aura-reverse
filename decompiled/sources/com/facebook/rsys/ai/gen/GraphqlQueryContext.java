package com.facebook.rsys.ai.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class GraphqlQueryContext {
    public static G50<GraphqlQueryContext> CONVERTER = C8923Ftf.A00(6);
    public static long sMcfTypeId;
    public final String clientDocId;
    public final GraphqlQueryOptions queryOptions;
    public final String queryParams;

    public class Builder {
        public String clientDocId;
        public GraphqlQueryOptions queryOptions;
        public String queryParams;

        public GraphqlQueryContext build() {
            return new GraphqlQueryContext(this);
        }
    }

    public static native GraphqlQueryContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphqlQueryContext) {
                GraphqlQueryContext graphqlQueryContext = (GraphqlQueryContext) obj;
                if (!this.queryParams.equals(graphqlQueryContext.queryParams) || !this.queryOptions.equals(graphqlQueryContext.queryOptions) || !this.clientDocId.equals(graphqlQueryContext.clientDocId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.clientDocId, AnonymousClass005.A0F(this.queryOptions, BV8.A0B(this.queryParams)));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("GraphqlQueryContext{queryParams=");
        sbA0x.append(this.queryParams);
        sbA0x.append(",queryOptions=");
        sbA0x.append(this.queryOptions);
        sbA0x.append(",clientDocId=");
        return AbstractC7610F5x.A0w(this.clientDocId, sbA0x);
    }

    public GraphqlQueryContext(Builder builder) {
        builder.queryParams.getClass();
        builder.queryOptions.getClass();
        builder.clientDocId.getClass();
        this.queryParams = builder.queryParams;
        this.queryOptions = builder.queryOptions;
        this.clientDocId = builder.clientDocId;
    }
}
