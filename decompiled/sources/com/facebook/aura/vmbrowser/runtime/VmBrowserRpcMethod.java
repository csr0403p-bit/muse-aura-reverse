package com.facebook.aura.vmbrowser.runtime;

import com.facebook.aura.network.api.RpcMethod;

/* loaded from: classes3.dex */
public interface VmBrowserRpcMethod extends RpcMethod.Extension {

    /* loaded from: classes2.dex */
    public final class BrowserInputFocus implements VmBrowserRpcMethod {
        public static final int $stable = 0;
        public static final BrowserInputFocus INSTANCE = new BrowserInputFocus();
        public static final String value = "browser.input_focus";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BrowserInputFocus);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "BrowserInputFocus";
        }

        public int hashCode() {
            return 1908159776;
        }
    }
}
