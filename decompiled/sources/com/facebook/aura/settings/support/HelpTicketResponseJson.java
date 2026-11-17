package com.facebook.aura.settings.support;

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
/* loaded from: classes4.dex */
public final class HelpTicketResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String case_id;

    public final class Companion {
        public final C9hr<HelpTicketResponseJson> serializer() {
            return HelpTicketResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_support_support(HelpTicketResponseJson helpTicketResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(helpTicketResponseJson.case_id)) {
            c9j5.AAV(helpTicketResponseJson.case_id, c9iZ, 0);
        }
    }

    public final HelpTicketResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new HelpTicketResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HelpTicketResponseJson) && C7384Etj.areEqual(this.case_id, ((HelpTicketResponseJson) obj).case_id));
    }

    public static /* synthetic */ HelpTicketResponseJson copy$default(HelpTicketResponseJson helpTicketResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpTicketResponseJson.case_id;
        }
        C7384Etj.A0Y(str, 0);
        return new HelpTicketResponseJson(str);
    }

    public final String component1() {
        return this.case_id;
    }

    public final String getCase_id() {
        return this.case_id;
    }

    public int hashCode() {
        return this.case_id.hashCode();
    }

    public /* synthetic */ HelpTicketResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.case_id = "";
        } else {
            this.case_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HelpTicketResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.case_id = str;
    }

    public /* synthetic */ HelpTicketResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public HelpTicketResponseJson() {
        this("");
    }
}
