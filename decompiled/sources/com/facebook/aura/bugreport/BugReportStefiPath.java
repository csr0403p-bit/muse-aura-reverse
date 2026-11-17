package com.facebook.aura.bugreport;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes3.dex */
public interface BugReportStefiPath extends StefiHatchPath.Extension {

    public final class BugReport implements BugReportStefiPath {
        public static final int $stable = 0;
        public static final BugReport INSTANCE = new BugReport();
        public static final String value = "/hatch/bug_report";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BugReport);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "BugReport";
        }

        public int hashCode() {
            return 210675636;
        }
    }

    public final class BugReportAttachment implements BugReportStefiPath {
        public static final int $stable = 0;
        public static final BugReportAttachment INSTANCE = new BugReportAttachment();
        public static final String value = "/hatch/bug_report_attachment";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BugReportAttachment);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "BugReportAttachment";
        }

        public int hashCode() {
            return 373345271;
        }
    }
}
