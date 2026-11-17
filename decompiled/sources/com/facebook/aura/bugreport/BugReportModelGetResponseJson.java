package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
public final class BugReportModelGetResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final BugReportModelGetPayloadJson payload;
    public final String selected_model;

    public final class Companion {
        public final C9hr<BugReportModelGetResponseJson> serializer() {
            return BugReportModelGetResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(BugReportModelGetResponseJson bugReportModelGetResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || bugReportModelGetResponseJson.payload != null) {
            c9j5.AAP(bugReportModelGetResponseJson.payload, BugReportModelGetPayloadJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !"".equals(bugReportModelGetResponseJson.selected_model)) {
            c9j5.AAV(bugReportModelGetResponseJson.selected_model, c9iZ, 1);
        }
        if (zAfR || !"".equals(bugReportModelGetResponseJson.display_name)) {
            c9j5.AAV(bugReportModelGetResponseJson.display_name, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BugReportModelGetResponseJson) {
                BugReportModelGetResponseJson bugReportModelGetResponseJson = (BugReportModelGetResponseJson) obj;
                if (!C7384Etj.areEqual(this.payload, bugReportModelGetResponseJson.payload) || !C7384Etj.areEqual(this.selected_model, bugReportModelGetResponseJson.selected_model) || !C7384Etj.areEqual(this.display_name, bugReportModelGetResponseJson.display_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BugReportModelGetResponseJson copy$default(BugReportModelGetResponseJson bugReportModelGetResponseJson, BugReportModelGetPayloadJson bugReportModelGetPayloadJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bugReportModelGetPayloadJson = bugReportModelGetResponseJson.payload;
        }
        if ((i & 2) != 0) {
            str = bugReportModelGetResponseJson.selected_model;
        }
        if ((i & 4) != 0) {
            str2 = bugReportModelGetResponseJson.display_name;
        }
        return bugReportModelGetResponseJson.copy(bugReportModelGetPayloadJson, str, str2);
    }

    public final BugReportModelGetPayloadJson component1() {
        return this.payload;
    }

    public final String component2() {
        return this.selected_model;
    }

    public final String component3() {
        return this.display_name;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final BugReportModelGetPayloadJson getPayload() {
        return this.payload;
    }

    public final String getSelected_model() {
        return this.selected_model;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.display_name, AnonymousClass005.A0I(this.selected_model, AnonymousClass006.A0D(this.payload) * 31));
    }

    public BugReportModelGetResponseJson(BugReportModelGetPayloadJson bugReportModelGetPayloadJson, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        this.payload = bugReportModelGetPayloadJson;
        this.selected_model = str;
        this.display_name = str2;
    }

    public final BugReportModelGetResponseJson copy(BugReportModelGetPayloadJson bugReportModelGetPayloadJson, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        return new BugReportModelGetResponseJson(bugReportModelGetPayloadJson, str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BugReportModelGetResponseJson(int i, BugReportModelGetPayloadJson bugReportModelGetPayloadJson, String str, String str2, C2hx c2hx) {
        this.payload = (i & 1) == 0 ? null : bugReportModelGetPayloadJson;
        if ((i & 2) == 0) {
            this.selected_model = "";
        } else {
            this.selected_model = str;
        }
        if ((i & 4) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
    }

    public /* synthetic */ BugReportModelGetResponseJson(BugReportModelGetPayloadJson bugReportModelGetPayloadJson, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bugReportModelGetPayloadJson, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public BugReportModelGetResponseJson() {
        this(null, "", "");
    }
}
