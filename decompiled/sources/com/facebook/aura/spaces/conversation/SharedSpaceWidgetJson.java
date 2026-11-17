package com.facebook.aura.spaces.conversation;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SharedSpaceWidgetJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String host_muse;
    public final String icon_url;
    public final String sender_name;
    public final String space_id;
    public final String title;

    public final class Companion {
        public final C9hr<SharedSpaceWidgetJson> serializer() {
            return SharedSpaceWidgetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_conversation_conversation(SharedSpaceWidgetJson sharedSpaceWidgetJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || sharedSpaceWidgetJson.host_muse != null) {
            c9j5.AAP(sharedSpaceWidgetJson.host_muse, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || sharedSpaceWidgetJson.space_id != null) {
            c9j5.AAP(sharedSpaceWidgetJson.space_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || sharedSpaceWidgetJson.title != null) {
            c9j5.AAP(sharedSpaceWidgetJson.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || sharedSpaceWidgetJson.sender_name != null) {
            c9j5.AAP(sharedSpaceWidgetJson.sender_name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || sharedSpaceWidgetJson.icon_url != null) {
            c9j5.AAP(sharedSpaceWidgetJson.icon_url, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedSpaceWidgetJson) {
                SharedSpaceWidgetJson sharedSpaceWidgetJson = (SharedSpaceWidgetJson) obj;
                if (!C7384Etj.areEqual(this.host_muse, sharedSpaceWidgetJson.host_muse) || !C7384Etj.areEqual(this.space_id, sharedSpaceWidgetJson.space_id) || !C7384Etj.areEqual(this.title, sharedSpaceWidgetJson.title) || !C7384Etj.areEqual(this.sender_name, sharedSpaceWidgetJson.sender_name) || !C7384Etj.areEqual(this.icon_url, sharedSpaceWidgetJson.icon_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SharedSpaceWidgetJson copy$default(SharedSpaceWidgetJson sharedSpaceWidgetJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedSpaceWidgetJson.host_muse;
        }
        if ((i & 2) != 0) {
            str2 = sharedSpaceWidgetJson.space_id;
        }
        if ((i & 4) != 0) {
            str3 = sharedSpaceWidgetJson.title;
        }
        if ((i & 8) != 0) {
            str4 = sharedSpaceWidgetJson.sender_name;
        }
        if ((i & 16) != 0) {
            str5 = sharedSpaceWidgetJson.icon_url;
        }
        return sharedSpaceWidgetJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.host_muse;
    }

    public final String component2() {
        return this.space_id;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.sender_name;
    }

    public final String component5() {
        return this.icon_url;
    }

    public final SharedSpaceWidgetJson copy(String str, String str2, String str3, String str4, String str5) {
        return new SharedSpaceWidgetJson(str, str2, str3, str4, str5);
    }

    public final String getHost_muse() {
        return this.host_muse;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getSender_name() {
        return this.sender_name;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.host_muse) * 31) + AnonymousClass006.A0G(this.space_id)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.sender_name)) * 31) + AnonymousClass005.A0H(this.icon_url);
    }

    public SharedSpaceWidgetJson(String str, String str2, String str3, String str4, String str5) {
        this.host_muse = str;
        this.space_id = str2;
        this.title = str3;
        this.sender_name = str4;
        this.icon_url = str5;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedSpaceWidgetJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ SharedSpaceWidgetJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.host_muse = null;
        } else {
            this.host_muse = str;
        }
        if ((i & 2) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.sender_name = null;
        } else {
            this.sender_name = str4;
        }
        if ((i & 16) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str5;
        }
    }

    public SharedSpaceWidgetJson() {
        this(null, null, null, null, null);
    }
}
