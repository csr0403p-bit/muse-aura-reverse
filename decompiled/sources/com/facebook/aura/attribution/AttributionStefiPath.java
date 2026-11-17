package com.facebook.aura.attribution;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes5.dex */
public interface AttributionStefiPath extends StefiHatchPath.Extension {

    public final class AttributionComplianceAction implements AttributionStefiPath {
        public static final AttributionComplianceAction INSTANCE = new AttributionComplianceAction();
        public static final String value = "/hatch/attribution/compliance_action";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AttributionComplianceAction);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AttributionComplianceAction";
        }

        public int hashCode() {
            return 946692846;
        }
    }

    public final class AttributionReportEvents implements AttributionStefiPath {
        public static final AttributionReportEvents INSTANCE = new AttributionReportEvents();
        public static final String value = "/hatch/attribution/report_events";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AttributionReportEvents);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AttributionReportEvents";
        }

        public int hashCode() {
            return 176446122;
        }
    }
}
