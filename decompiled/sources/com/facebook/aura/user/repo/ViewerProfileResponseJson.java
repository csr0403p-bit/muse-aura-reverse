package com.facebook.aura.user.repo;

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
/* loaded from: classes2.dex */
public final class ViewerProfileResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String name;
    public final String profile_picture_url;
    public final String username;

    public final class Companion {
        public final C9hr<ViewerProfileResponseJson> serializer() {
            return ViewerProfileResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_user_repo_repo(ViewerProfileResponseJson viewerProfileResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerProfileResponseJson.name != null) {
            c9j5.AAP(viewerProfileResponseJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerProfileResponseJson.username != null) {
            c9j5.AAP(viewerProfileResponseJson.username, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerProfileResponseJson.profile_picture_url != null) {
            c9j5.AAP(viewerProfileResponseJson.profile_picture_url, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerProfileResponseJson) {
                ViewerProfileResponseJson viewerProfileResponseJson = (ViewerProfileResponseJson) obj;
                if (!C7384Etj.areEqual(this.name, viewerProfileResponseJson.name) || !C7384Etj.areEqual(this.username, viewerProfileResponseJson.username) || !C7384Etj.areEqual(this.profile_picture_url, viewerProfileResponseJson.profile_picture_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerProfileResponseJson copy$default(ViewerProfileResponseJson viewerProfileResponseJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerProfileResponseJson.name;
        }
        if ((i & 2) != 0) {
            str2 = viewerProfileResponseJson.username;
        }
        if ((i & 4) != 0) {
            str3 = viewerProfileResponseJson.profile_picture_url;
        }
        return new ViewerProfileResponseJson(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.profile_picture_url;
    }

    public final ViewerProfileResponseJson copy(String str, String str2, String str3) {
        return new ViewerProfileResponseJson(str, str2, str3);
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfile_picture_url() {
        return this.profile_picture_url;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.username)) * 31) + AnonymousClass005.A0H(this.profile_picture_url);
    }

    public ViewerProfileResponseJson(String str, String str2, String str3) {
        this.name = str;
        this.username = str2;
        this.profile_picture_url = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerProfileResponseJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        if ((i & 4) == 0) {
            this.profile_picture_url = null;
        } else {
            this.profile_picture_url = str3;
        }
    }

    public /* synthetic */ ViewerProfileResponseJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public ViewerProfileResponseJson() {
        this(null, null, null);
    }
}
