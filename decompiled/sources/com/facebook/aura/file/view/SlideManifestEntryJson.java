package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class SlideManifestEntryJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String absolute_path;
    public final String id;
    public final String page_title;

    public final class Companion {
        public final C9hr<SlideManifestEntryJson> serializer() {
            return SlideManifestEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_file_view_view(SlideManifestEntryJson slideManifestEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(slideManifestEntryJson.id)) {
            c9j5.AAV(slideManifestEntryJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(slideManifestEntryJson.page_title)) {
            c9j5.AAV(slideManifestEntryJson.page_title, c9iZ, 1);
        }
        if (zAfR || !"".equals(slideManifestEntryJson.absolute_path)) {
            c9j5.AAV(slideManifestEntryJson.absolute_path, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SlideManifestEntryJson) {
                SlideManifestEntryJson slideManifestEntryJson = (SlideManifestEntryJson) obj;
                if (!C7384Etj.areEqual(this.id, slideManifestEntryJson.id) || !C7384Etj.areEqual(this.page_title, slideManifestEntryJson.page_title) || !C7384Etj.areEqual(this.absolute_path, slideManifestEntryJson.absolute_path)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SlideManifestEntryJson copy$default(SlideManifestEntryJson slideManifestEntryJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slideManifestEntryJson.id;
        }
        if ((i & 2) != 0) {
            str2 = slideManifestEntryJson.page_title;
        }
        if ((i & 4) != 0) {
            str3 = slideManifestEntryJson.absolute_path;
        }
        return slideManifestEntryJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.page_title;
    }

    public final String component3() {
        return this.absolute_path;
    }

    public final String getAbsolute_path() {
        return this.absolute_path;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPage_title() {
        return this.page_title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.absolute_path, AnonymousClass005.A0I(this.page_title, AnonymousClass001.A0G(this.id)));
    }

    public SlideManifestEntryJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.page_title = str2;
        this.absolute_path = str3;
    }

    public final SlideManifestEntryJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new SlideManifestEntryJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SlideManifestEntryJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.page_title = "";
        } else {
            this.page_title = str2;
        }
        if ((i & 4) == 0) {
            this.absolute_path = "";
        } else {
            this.absolute_path = str3;
        }
    }

    public /* synthetic */ SlideManifestEntryJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public SlideManifestEntryJson() {
        this("", "", "");
    }
}
