package com.facebook.aura.spaces.repo;

import com.facebook.aura.network.api.RpcMethod;

/* loaded from: classes3.dex */
public interface SpacesRpcMethod extends RpcMethod.Extension {

    public final class DataInvalidated implements SpacesRpcMethod {
        public static final DataInvalidated INSTANCE = new DataInvalidated();
        public static final String value = "spaces.data_invalidated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DataInvalidated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DataInvalidated";
        }

        public int hashCode() {
            return 398259295;
        }
    }

    public final class Updated implements SpacesRpcMethod {
        public static final Updated INSTANCE = new Updated();
        public static final String value = "spaces.updated";

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
            return 1580766363;
        }
    }
}
