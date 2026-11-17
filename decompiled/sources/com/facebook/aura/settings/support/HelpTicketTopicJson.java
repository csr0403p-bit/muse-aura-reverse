package com.facebook.aura.settings.support;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.settings.support.HatchSupportTopicLabel;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HelpTicketTopicJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String slug;

    public final class Companion {
        public final C9hr<HelpTicketTopicJson> serializer() {
            return HelpTicketTopicJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_support_support(HelpTicketTopicJson helpTicketTopicJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(helpTicketTopicJson.slug)) {
            c9j5.AAV(helpTicketTopicJson.slug, c9iZ, 0);
        }
        if (zAfR || !"".equals(helpTicketTopicJson.display_name)) {
            c9j5.AAV(helpTicketTopicJson.display_name, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HelpTicketTopicJson) {
                HelpTicketTopicJson helpTicketTopicJson = (HelpTicketTopicJson) obj;
                if (!C7384Etj.areEqual(this.slug, helpTicketTopicJson.slug) || !C7384Etj.areEqual(this.display_name, helpTicketTopicJson.display_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HelpTicketTopicJson copy$default(HelpTicketTopicJson helpTicketTopicJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpTicketTopicJson.slug;
        }
        if ((i & 2) != 0) {
            str2 = helpTicketTopicJson.display_name;
        }
        AnonymousClass003.A0u(str, str2);
        return new HelpTicketTopicJson(str, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.display_name, AnonymousClass001.A0G(this.slug));
    }

    public final HatchSupportTopicOption toDomain() {
        return new HatchSupportTopicOption(this.slug, new HatchSupportTopicLabel.Text(this.display_name));
    }

    public HelpTicketTopicJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.slug = str;
        this.display_name = str2;
    }

    public final HelpTicketTopicJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HelpTicketTopicJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HelpTicketTopicJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public /* synthetic */ HelpTicketTopicJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.slug = "";
        } else {
            this.slug = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
    }

    public HelpTicketTopicJson() {
        this("", "");
    }
}
