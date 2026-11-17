package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class BugReportModelGetPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String selected_model;

    public final class Companion {
        public final C9hr<BugReportModelGetPayloadJson> serializer() {
            return BugReportModelGetPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(BugReportModelGetPayloadJson bugReportModelGetPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(bugReportModelGetPayloadJson.selected_model)) {
            c9j5.AAV(bugReportModelGetPayloadJson.selected_model, c9iZ, 0);
        }
        if (zAfR || !"".equals(bugReportModelGetPayloadJson.display_name)) {
            c9j5.AAV(bugReportModelGetPayloadJson.display_name, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BugReportModelGetPayloadJson) {
                BugReportModelGetPayloadJson bugReportModelGetPayloadJson = (BugReportModelGetPayloadJson) obj;
                if (!C7384Etj.areEqual(this.selected_model, bugReportModelGetPayloadJson.selected_model) || !C7384Etj.areEqual(this.display_name, bugReportModelGetPayloadJson.display_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BugReportModelGetPayloadJson copy$default(BugReportModelGetPayloadJson bugReportModelGetPayloadJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bugReportModelGetPayloadJson.selected_model;
        }
        if ((i & 2) != 0) {
            str2 = bugReportModelGetPayloadJson.display_name;
        }
        AnonymousClass003.A0u(str, str2);
        return new BugReportModelGetPayloadJson(str, str2);
    }

    public final String component1() {
        return this.selected_model;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getSelected_model() {
        return this.selected_model;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.display_name, AnonymousClass001.A0G(this.selected_model));
    }

    public BugReportModelGetPayloadJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.selected_model = str;
        this.display_name = str2;
    }

    public final BugReportModelGetPayloadJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new BugReportModelGetPayloadJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BugReportModelGetPayloadJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.selected_model = "";
        } else {
            this.selected_model = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
    }

    public /* synthetic */ BugReportModelGetPayloadJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public BugReportModelGetPayloadJson() {
        this("", "");
    }
}
