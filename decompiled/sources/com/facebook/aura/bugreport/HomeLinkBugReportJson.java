package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HomeLinkBugReportJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String node_id;
    public final String report_json;

    public final class Companion {
        public final C9hr<HomeLinkBugReportJson> serializer() {
            return HomeLinkBugReportJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(HomeLinkBugReportJson homeLinkBugReportJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(homeLinkBugReportJson.node_id, c9iZ, 0);
        c9j5.AAV(homeLinkBugReportJson.report_json, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeLinkBugReportJson) {
                HomeLinkBugReportJson homeLinkBugReportJson = (HomeLinkBugReportJson) obj;
                if (!C7384Etj.areEqual(this.node_id, homeLinkBugReportJson.node_id) || !C7384Etj.areEqual(this.report_json, homeLinkBugReportJson.report_json)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HomeLinkBugReportJson copy$default(HomeLinkBugReportJson homeLinkBugReportJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeLinkBugReportJson.node_id;
        }
        if ((i & 2) != 0) {
            str2 = homeLinkBugReportJson.report_json;
        }
        AnonymousClass003.A0u(str, str2);
        return new HomeLinkBugReportJson(str, str2);
    }

    public final String component1() {
        return this.node_id;
    }

    public final String component2() {
        return this.report_json;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getReport_json() {
        return this.report_json;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.report_json, AnonymousClass001.A0G(this.node_id));
    }

    public HomeLinkBugReportJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.node_id = str;
        this.report_json = str2;
    }

    public final HomeLinkBugReportJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HomeLinkBugReportJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HomeLinkBugReportJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HomeLinkBugReportJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.node_id = str;
        this.report_json = str2;
    }
}
