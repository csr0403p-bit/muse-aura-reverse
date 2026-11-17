package com.facebook.aura.modellock;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface ModelLockJarvisPath extends JarvisPath.Extension {

    /* loaded from: classes5.dex */
    public final class SafetyAppealFile implements ModelLockJarvisPath {
        public static final SafetyAppealFile INSTANCE = new SafetyAppealFile();
        public static final String value = "api/safety-appeals/file";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SafetyAppealFile);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SafetyAppealFile";
        }

        public int hashCode() {
            return -766907593;
        }
    }

    /* loaded from: classes5.dex */
    public final class SafetyAppeals implements ModelLockJarvisPath {
        public static final SafetyAppeals INSTANCE = new SafetyAppeals();
        public static final String value = "api/safety-appeals";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SafetyAppeals);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SafetyAppeals";
        }

        public int hashCode() {
            return 455695544;
        }
    }
}
