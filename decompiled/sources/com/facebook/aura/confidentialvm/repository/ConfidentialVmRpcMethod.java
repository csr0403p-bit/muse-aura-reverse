package com.facebook.aura.confidentialvm.repository;

import com.facebook.aura.network.api.RpcMethod;

/* loaded from: classes3.dex */
public interface ConfidentialVmRpcMethod extends RpcMethod.Extension {

    public final class PinUpdated implements ConfidentialVmRpcMethod {
        public static final PinUpdated INSTANCE = new PinUpdated();
        public static final String value = "pin.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PinUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PinUpdated";
        }

        public int hashCode() {
            return 854155314;
        }
    }

    public final class SshOperatorUpdated implements ConfidentialVmRpcMethod {
        public static final SshOperatorUpdated INSTANCE = new SshOperatorUpdated();
        public static final String value = "ssh.operator.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SshOperatorUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SshOperatorUpdated";
        }

        public int hashCode() {
            return -1815525605;
        }
    }
}
