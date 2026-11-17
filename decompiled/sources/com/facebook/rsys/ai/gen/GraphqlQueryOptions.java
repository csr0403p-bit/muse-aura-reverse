package com.facebook.rsys.ai.gen;

import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class GraphqlQueryOptions {
    public static G50<GraphqlQueryOptions> CONVERTER = C8923Ftf.A00(7);
    public static long sMcfTypeId;
    public final boolean useCanonicalNaming;

    public class Builder {
        public boolean useCanonicalNaming;

        public GraphqlQueryOptions build() {
            return new GraphqlQueryOptions(this);
        }
    }

    public static native GraphqlQueryOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GraphqlQueryOptions) && this.useCanonicalNaming == ((GraphqlQueryOptions) obj).useCanonicalNaming);
    }

    public int hashCode() {
        return 527 + (this.useCanonicalNaming ? 1 : 0);
    }

    public String toString() {
        return FGI.A0q("GraphqlQueryOptions{useCanonicalNaming=", "}", this.useCanonicalNaming);
    }

    public GraphqlQueryOptions(Builder builder) {
        this.useCanonicalNaming = builder.useCanonicalNaming;
    }
}
