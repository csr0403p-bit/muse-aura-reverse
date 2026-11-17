package com.facebook.aura.feed.repo;

import com.facebook.aura.network.api.RpcMethod;

/* loaded from: classes3.dex */
public interface FeedRpcMethod extends RpcMethod.Extension {

    public final class Changed implements FeedRpcMethod {
        public static final int $stable = 0;
        public static final Changed INSTANCE = new Changed();
        public static final String value = "feed.changed";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Changed);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Changed";
        }

        public int hashCode() {
            return -1708993934;
        }
    }

    public final class Updated implements FeedRpcMethod {
        public static final int $stable = 0;
        public static final Updated INSTANCE = new Updated();
        public static final String value = "feed.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Updated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Updated";
        }

        public int hashCode() {
            return 1612599417;
        }
    }
}
