package com.facebook.aura.localbrowser.core;

import X.CFK;
import X.ETi;
import java.io.File;

/* loaded from: classes5.dex */
public final class BrowserEngineLibrary {
    public static final int $stable = 0;
    public static final BrowserEngineLibrary INSTANCE = new BrowserEngineLibrary();
    public static boolean loaded;

    public final synchronized boolean load() {
        String absolutePath;
        String parent;
        boolean z = true;
        if (!loaded) {
            if (BrowserEngineAvailability.INSTANCE.isSupported()) {
                try {
                    ETi.loadLibrary("jnidispatch");
                    File fileA02 = ETi.A02("jnidispatch");
                    if (fileA02 != null && (parent = fileA02.getParent()) != null) {
                        System.setProperty("jna.boot.library.path", parent);
                    }
                    ETi.loadLibrary("hatch_browser_core_uniffi");
                    File fileA022 = ETi.A02("hatch_browser_core_uniffi");
                    if (fileA022 == null || (absolutePath = fileA022.getAbsolutePath()) == null) {
                        CFK.A06("BrowserEngineLibrary", "Browser native library is not backed by a file");
                    } else {
                        System.setProperty("uniffi.component.hatch_browser_core_uniffi.libraryOverride", absolutePath);
                        System.setProperty("uniffi.component.hatch_browser_protocol.libraryOverride", absolutePath);
                        loaded = true;
                    }
                } catch (UnsatisfiedLinkError e) {
                    CFK.A0A("BrowserEngineLibrary", "Browser native libraries could not be loaded", e);
                    z = false;
                }
            }
            return false;
        }
        return z;
    }
}
