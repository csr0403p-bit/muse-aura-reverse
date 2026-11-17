package com.facebook.aura.settings.support;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
/* loaded from: classes4.dex */
public final class HelpTicketRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String description;
    public final String email;
    public final String name;
    public final String topic;

    public final class Companion {
        public final C9hr<HelpTicketRequestJson> serializer() {
            return HelpTicketRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_support_support(HelpTicketRequestJson helpTicketRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(helpTicketRequestJson.name, c9iZ, 0);
        c9j5.AAV(helpTicketRequestJson.email, c9iZ, 1);
        c9j5.AAV(helpTicketRequestJson.topic, c9iZ, 2);
        c9j5.AAV(helpTicketRequestJson.description, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HelpTicketRequestJson) {
                HelpTicketRequestJson helpTicketRequestJson = (HelpTicketRequestJson) obj;
                if (!C7384Etj.areEqual(this.name, helpTicketRequestJson.name) || !C7384Etj.areEqual(this.email, helpTicketRequestJson.email) || !C7384Etj.areEqual(this.topic, helpTicketRequestJson.topic) || !C7384Etj.areEqual(this.description, helpTicketRequestJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HelpTicketRequestJson copy$default(HelpTicketRequestJson helpTicketRequestJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpTicketRequestJson.name;
        }
        if ((i & 2) != 0) {
            str2 = helpTicketRequestJson.email;
        }
        if ((i & 4) != 0) {
            str3 = helpTicketRequestJson.topic;
        }
        if ((i & 8) != 0) {
            str4 = helpTicketRequestJson.description;
        }
        return helpTicketRequestJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.topic;
    }

    public final String component4() {
        return this.description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.description, AnonymousClass005.A0I(this.topic, AnonymousClass005.A0I(this.email, AnonymousClass001.A0G(this.name))));
    }

    public HelpTicketRequestJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.name = str;
        this.email = str2;
        this.topic = str3;
        this.description = str4;
    }

    public final HelpTicketRequestJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new HelpTicketRequestJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HelpTicketRequestJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(HelpTicketRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.email = str2;
        this.topic = str3;
        this.description = str4;
    }
}
