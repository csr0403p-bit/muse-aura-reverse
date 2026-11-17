package com.facebook.aura.modellock;

import com.facebook.aura.network.api.RpcMethod;

/* loaded from: classes3.dex */
public interface ModelLockRpcMethod extends RpcMethod.Extension {

    public final class Updated implements ModelLockRpcMethod {
        public static final Updated INSTANCE = new Updated();
        public static final String value = "model_lock.updated";

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
            return -141499191;
        }
    }
}
