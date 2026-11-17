package com.facebook.aura.partners.voice.session.impl;

import com.facebook.aura.network.api.RpcMethod;

/* loaded from: classes3.dex */
public interface VoiceRpcMethod extends RpcMethod.Extension {

    /* loaded from: classes6.dex */
    public final class CallsJoin implements VoiceRpcMethod {
        public static final CallsJoin INSTANCE = new CallsJoin();
        public static final String value = "voice.calls.join";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CallsJoin);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CallsJoin";
        }

        public int hashCode() {
            return 2095243660;
        }
    }
}
