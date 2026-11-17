package com.facebook.aura.bugreport;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface BugReportJarvisPath extends JarvisPath.Extension {

    /* loaded from: classes5.dex */
    public final class BugReportLogs implements BugReportJarvisPath {
        public static final int $stable = 0;
        public static final BugReportLogs INSTANCE = new BugReportLogs();
        public static final String value = "api/debug/bug-report-logs";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BugReportLogs);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "BugReportLogs";
        }

        public int hashCode() {
            return -792267163;
        }
    }

    public final class HomeLinkBugReports implements BugReportJarvisPath {
        public static final int $stable = 0;
        public static final HomeLinkBugReports INSTANCE = new HomeLinkBugReports();
        public static final String value = "api/debug/home-link-bug-reports";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeLinkBugReports);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "HomeLinkBugReports";
        }

        public int hashCode() {
            return -1902373898;
        }
    }
}
