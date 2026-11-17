package com.facebook.aura.browsertask.data;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface BrowserTaskJarvisPath extends JarvisPath.Extension {

    public final class BrowserLease implements BrowserTaskJarvisPath {
        public static final int $stable = 0;
        public static final BrowserLease INSTANCE = new BrowserLease();
        public static final String value = "api/browser/lease";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BrowserLease);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "BrowserLease";
        }

        public int hashCode() {
            return 826675900;
        }
    }

    public final class ComputerContext implements BrowserTaskJarvisPath {
        public static final int $stable = 0;
        public static final ComputerContext INSTANCE = new ComputerContext();
        public static final String value = "api/computer/context";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ComputerContext);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ComputerContext";
        }

        public int hashCode() {
            return 435850026;
        }
    }

    public final class ComputerSubscribe implements BrowserTaskJarvisPath {
        public static final int $stable = 0;
        public static final ComputerSubscribe INSTANCE = new ComputerSubscribe();
        public static final String value = "api/computer/subscribe";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ComputerSubscribe);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ComputerSubscribe";
        }

        public int hashCode() {
            return -1133264891;
        }
    }
}
