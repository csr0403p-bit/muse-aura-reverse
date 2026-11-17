package com.facebook.aura.bugreport;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HomeLinkBugReportsJson extends C06G {
    public static final int $stable = 8;
    public final List<HomeLinkBugReportJson> reports;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, HomeLinkBugReportsJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HomeLinkBugReportsJson> serializer() {
            return HomeLinkBugReportsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HomeLinkBugReportsJson copy(List<HomeLinkBugReportJson> list) {
        C7384Etj.A0Y(list, 0);
        return new HomeLinkBugReportsJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HomeLinkBugReportsJson) && C7384Etj.areEqual(this.reports, ((HomeLinkBugReportsJson) obj).reports));
    }

    public /* synthetic */ HomeLinkBugReportsJson(int i, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HomeLinkBugReportsJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.reports = list;
    }

    public static /* synthetic */ HomeLinkBugReportsJson copy$default(HomeLinkBugReportsJson homeLinkBugReportsJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = homeLinkBugReportsJson.reports;
        }
        C7384Etj.A0Y(list, 0);
        return new HomeLinkBugReportsJson(list);
    }

    public final List<HomeLinkBugReportJson> component1() {
        return this.reports;
    }

    public final List<HomeLinkBugReportJson> getReports() {
        return this.reports;
    }

    public int hashCode() {
        return this.reports.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public HomeLinkBugReportsJson(List<HomeLinkBugReportJson> list) {
        C7384Etj.A0Y(list, 0);
        this.reports = list;
    }
}
