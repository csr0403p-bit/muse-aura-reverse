package com.facebook.aura.file.view;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface HtmlHostJarvisPath extends JarvisPath.Extension {

    public final class Call implements HtmlHostJarvisPath {
        public static final int $stable = 0;
        public static final Call INSTANCE = new Call();
        public static final String value = "call";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Call);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Call";
        }

        public int hashCode() {
            return 1384019528;
        }
    }
}
