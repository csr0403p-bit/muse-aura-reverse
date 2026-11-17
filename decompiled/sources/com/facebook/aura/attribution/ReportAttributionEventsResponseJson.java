package com.facebook.aura.attribution;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ReportAttributionEventsResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String request_id;

    public final class Companion {
        public final C9hr<ReportAttributionEventsResponseJson> serializer() {
            return ReportAttributionEventsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_attribution_attribution(ReportAttributionEventsResponseJson reportAttributionEventsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(reportAttributionEventsResponseJson.request_id)) {
            c9j5.AAV(reportAttributionEventsResponseJson.request_id, c9iZ, 0);
        }
    }

    public final ReportAttributionEventsResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ReportAttributionEventsResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ReportAttributionEventsResponseJson) && C7384Etj.areEqual(this.request_id, ((ReportAttributionEventsResponseJson) obj).request_id));
    }

    public static /* synthetic */ ReportAttributionEventsResponseJson copy$default(ReportAttributionEventsResponseJson reportAttributionEventsResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportAttributionEventsResponseJson.request_id;
        }
        C7384Etj.A0Y(str, 0);
        return new ReportAttributionEventsResponseJson(str);
    }

    public final String component1() {
        return this.request_id;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public int hashCode() {
        return this.request_id.hashCode();
    }

    public /* synthetic */ ReportAttributionEventsResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.request_id = "";
        } else {
            this.request_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ReportAttributionEventsResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.request_id = str;
    }

    public /* synthetic */ ReportAttributionEventsResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public ReportAttributionEventsResponseJson() {
        this("");
    }
}
