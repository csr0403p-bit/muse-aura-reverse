package com.facebook.aura.attribution;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ReportAttributionEventsRequestJson extends C06G {
    public final List<AttributionEventJson> events;
    public final String request_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, ReportAttributionEventsRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ReportAttributionEventsRequestJson> serializer() {
            return ReportAttributionEventsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReportAttributionEventsRequestJson) {
                ReportAttributionEventsRequestJson reportAttributionEventsRequestJson = (ReportAttributionEventsRequestJson) obj;
                if (!C7384Etj.areEqual(this.events, reportAttributionEventsRequestJson.events) || !C7384Etj.areEqual(this.request_id, reportAttributionEventsRequestJson.request_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReportAttributionEventsRequestJson copy$default(ReportAttributionEventsRequestJson reportAttributionEventsRequestJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = reportAttributionEventsRequestJson.events;
        }
        if ((i & 2) != 0) {
            str = reportAttributionEventsRequestJson.request_id;
        }
        AnonymousClass003.A0u(list, str);
        return new ReportAttributionEventsRequestJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_attribution_attribution(ReportAttributionEventsRequestJson reportAttributionEventsRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(reportAttributionEventsRequestJson.events)) {
            c9j5.AAQ(reportAttributionEventsRequestJson.events, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cH.A1Q(reportAttributionEventsRequestJson.request_id)) {
            c9j5.AAV(reportAttributionEventsRequestJson.request_id, c9iZ, 1);
        }
    }

    public final List<AttributionEventJson> component1() {
        return this.events;
    }

    public final String component2() {
        return this.request_id;
    }

    public final List<AttributionEventJson> getEvents() {
        return this.events;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.request_id, AnonymousClass005.A0E(this.events));
    }

    public ReportAttributionEventsRequestJson(List<AttributionEventJson> list, String str) {
        AnonymousClass003.A0u(list, str);
        this.events = list;
        this.request_id = str;
    }

    public final ReportAttributionEventsRequestJson copy(List<AttributionEventJson> list, String str) {
        AnonymousClass003.A0u(list, str);
        return new ReportAttributionEventsRequestJson(list, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReportAttributionEventsRequestJson(int i, List list, String str, C2hx c2hx) {
        this.events = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.request_id = "";
        } else {
            this.request_id = str;
        }
    }

    public /* synthetic */ ReportAttributionEventsRequestJson(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? "" : str);
    }

    public ReportAttributionEventsRequestJson() {
        this(C0881AGi.A00, "");
    }
}
