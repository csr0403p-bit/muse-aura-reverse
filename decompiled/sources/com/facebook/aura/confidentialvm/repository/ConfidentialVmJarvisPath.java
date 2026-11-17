package com.facebook.aura.confidentialvm.repository;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public interface ConfidentialVmJarvisPath extends JarvisPath.Extension {

    /* loaded from: classes2.dex */
    public final class CvmEnableExport implements ConfidentialVmJarvisPath {
        public static final CvmEnableExport INSTANCE = new CvmEnableExport();
        public static final String value = "yolk/v1/rv-migration/enable-export";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CvmEnableExport);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CvmEnableExport";
        }

        public int hashCode() {
            return -1954006447;
        }
    }

    public final class PinReminderConfirm implements ConfidentialVmJarvisPath {
        public static final PinReminderConfirm INSTANCE = new PinReminderConfirm();
        public static final String value = "api/pin-reminder/confirm";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PinReminderConfirm);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PinReminderConfirm";
        }

        public int hashCode() {
            return 1270728665;
        }
    }

    public final class PinReminderUpdate implements ConfidentialVmJarvisPath {
        public static final PinReminderUpdate INSTANCE = new PinReminderUpdate();
        public static final String value = "api/pin-reminder/update";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PinReminderUpdate);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PinReminderUpdate";
        }

        public int hashCode() {
            return 834031760;
        }
    }

    public final class SshOperatorDisable implements ConfidentialVmJarvisPath {
        public static final SshOperatorDisable INSTANCE = new SshOperatorDisable();
        public static final String value = "v1/ssh/operator/disable";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SshOperatorDisable);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SshOperatorDisable";
        }

        public int hashCode() {
            return -1722122564;
        }
    }

    public final class SshOperatorEnable implements ConfidentialVmJarvisPath {
        public static final SshOperatorEnable INSTANCE = new SshOperatorEnable();
        public static final String value = "v1/ssh/operator/enable";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SshOperatorEnable);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SshOperatorEnable";
        }

        public int hashCode() {
            return 1085538095;
        }
    }

    /* loaded from: classes2.dex */
    public final class VmMigrationsLatest implements ConfidentialVmJarvisPath {
        public static final VmMigrationsLatest INSTANCE = new VmMigrationsLatest();
        public static final String value = "api/vm-migrations/latest";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VmMigrationsLatest);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VmMigrationsLatest";
        }

        public int hashCode() {
            return 1948953443;
        }
    }
}
