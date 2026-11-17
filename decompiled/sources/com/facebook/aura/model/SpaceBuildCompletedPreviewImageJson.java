package com.facebook.aura.model;

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
public final class SpaceBuildCompletedPreviewImageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String icon_url;
    public final String preview_card_url;
    public final String thumbnail_url;

    public final class Companion {
        public final C9hr<SpaceBuildCompletedPreviewImageJson> serializer() {
            return SpaceBuildCompletedPreviewImageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(SpaceBuildCompletedPreviewImageJson spaceBuildCompletedPreviewImageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(spaceBuildCompletedPreviewImageJson.icon_url)) {
            c9j5.AAV(spaceBuildCompletedPreviewImageJson.icon_url, c9iZ, 0);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPreviewImageJson.thumbnail_url)) {
            c9j5.AAV(spaceBuildCompletedPreviewImageJson.thumbnail_url, c9iZ, 1);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPreviewImageJson.preview_card_url)) {
            c9j5.AAV(spaceBuildCompletedPreviewImageJson.preview_card_url, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceBuildCompletedPreviewImageJson) {
                SpaceBuildCompletedPreviewImageJson spaceBuildCompletedPreviewImageJson = (SpaceBuildCompletedPreviewImageJson) obj;
                if (!C7384Etj.areEqual(this.icon_url, spaceBuildCompletedPreviewImageJson.icon_url) || !C7384Etj.areEqual(this.thumbnail_url, spaceBuildCompletedPreviewImageJson.thumbnail_url) || !C7384Etj.areEqual(this.preview_card_url, spaceBuildCompletedPreviewImageJson.preview_card_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceBuildCompletedPreviewImageJson copy$default(SpaceBuildCompletedPreviewImageJson spaceBuildCompletedPreviewImageJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceBuildCompletedPreviewImageJson.icon_url;
        }
        if ((i & 2) != 0) {
            str2 = spaceBuildCompletedPreviewImageJson.thumbnail_url;
        }
        if ((i & 4) != 0) {
            str3 = spaceBuildCompletedPreviewImageJson.preview_card_url;
        }
        return spaceBuildCompletedPreviewImageJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.icon_url;
    }

    public final String component2() {
        return this.thumbnail_url;
    }

    public final String component3() {
        return this.preview_card_url;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getPreview_card_url() {
        return this.preview_card_url;
    }

    public final String getThumbnail_url() {
        return this.thumbnail_url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.preview_card_url, AnonymousClass005.A0I(this.thumbnail_url, AnonymousClass001.A0G(this.icon_url)));
    }

    public SpaceBuildCompletedPreviewImageJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.icon_url = str;
        this.thumbnail_url = str2;
        this.preview_card_url = str3;
    }

    public final SpaceBuildCompletedPreviewImageJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new SpaceBuildCompletedPreviewImageJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceBuildCompletedPreviewImageJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.icon_url = "";
        } else {
            this.icon_url = str;
        }
        if ((i & 2) == 0) {
            this.thumbnail_url = "";
        } else {
            this.thumbnail_url = str2;
        }
        if ((i & 4) == 0) {
            this.preview_card_url = "";
        } else {
            this.preview_card_url = str3;
        }
    }

    public /* synthetic */ SpaceBuildCompletedPreviewImageJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public SpaceBuildCompletedPreviewImageJson() {
        this("", "", "");
    }
}
