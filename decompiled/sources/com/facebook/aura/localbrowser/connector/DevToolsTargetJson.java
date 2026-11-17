package com.facebook.aura.localbrowser.connector;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C8j2;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DevToolsTargetJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String id;
    public final String title;
    public final String type;
    public final String url;

    public final class Companion {
        public final C9hr<DevToolsTargetJson> serializer() {
            return DevToolsTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_connector_connector(DevToolsTargetJson devToolsTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(devToolsTargetJson.id, c9iZ, 0);
        c9j5.AAV(devToolsTargetJson.type, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(devToolsTargetJson.url)) {
            c9j5.AAV(devToolsTargetJson.url, c9iZ, 2);
        }
        if (zAfR || !"".equals(devToolsTargetJson.title)) {
            c9j5.AAV(devToolsTargetJson.title, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevToolsTargetJson) {
                DevToolsTargetJson devToolsTargetJson = (DevToolsTargetJson) obj;
                if (!C7384Etj.areEqual(this.id, devToolsTargetJson.id) || !C7384Etj.areEqual(this.type, devToolsTargetJson.type) || !C7384Etj.areEqual(this.url, devToolsTargetJson.url) || !C7384Etj.areEqual(this.title, devToolsTargetJson.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DevToolsTargetJson copy$default(DevToolsTargetJson devToolsTargetJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = devToolsTargetJson.id;
        }
        if ((i & 2) != 0) {
            str2 = devToolsTargetJson.type;
        }
        if ((i & 4) != 0) {
            str3 = devToolsTargetJson.url;
        }
        if ((i & 8) != 0) {
            str4 = devToolsTargetJson.title;
        }
        return devToolsTargetJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.title;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass005.A0I(this.url, AnonymousClass005.A0I(this.type, AnonymousClass001.A0G(this.id))));
    }

    public String toString() {
        return FGI.A0m("DevToolsTargetJson(id=", this.id, ", type=", this.type, ", url=", this.url, C8j2.A00(15), this.title, ")");
    }

    public DevToolsTargetJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.id = str;
        this.type = str2;
        this.url = str3;
        this.title = str4;
    }

    public final DevToolsTargetJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new DevToolsTargetJson(str, str2, str3, str4);
    }

    public /* synthetic */ DevToolsTargetJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DevToolsTargetJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.type = str2;
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
        if ((i & 8) == 0) {
            this.title = "";
        } else {
            this.title = str4;
        }
    }

    public /* synthetic */ DevToolsTargetJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
