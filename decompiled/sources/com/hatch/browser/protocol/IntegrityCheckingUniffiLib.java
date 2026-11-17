package com.hatch.browser.protocol;

import com.sun.jna.Native;

/* loaded from: classes6.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_hatch_browser_protocol_uniffi_contract_version();

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, Hatch_browser_protocolKt.findLibraryName("hatch_browser_protocol"));
        Hatch_browser_protocolKt.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }

    public final void ensureInitialized$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
    }
}
