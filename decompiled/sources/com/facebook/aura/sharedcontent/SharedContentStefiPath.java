package com.facebook.aura.sharedcontent;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes3.dex */
public interface SharedContentStefiPath extends StefiHatchPath.Extension {

    public final class FetchSharedUrl extends C06G implements SharedContentStefiPath {
        public static final int $stable = 0;
        public final String shareKey;
        public final String slug;

        public FetchSharedUrl(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.slug = str;
            this.shareKey = str2;
        }

        public final FetchSharedUrl copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new FetchSharedUrl(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FetchSharedUrl) {
                    FetchSharedUrl fetchSharedUrl = (FetchSharedUrl) obj;
                    if (!C7384Etj.areEqual(this.slug, fetchSharedUrl.slug) || !C7384Etj.areEqual(this.shareKey, fetchSharedUrl.shareKey)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FetchSharedUrl copy$default(FetchSharedUrl fetchSharedUrl, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetchSharedUrl.slug;
            }
            if ((i & 2) != 0) {
                str2 = fetchSharedUrl.shareKey;
            }
            C7384Etj.A0Y(str, 0);
            return new FetchSharedUrl(str, str2);
        }

        public final String component1() {
            return this.slug;
        }

        public final String component2() {
            return this.shareKey;
        }

        public final String getShareKey() {
            return this.shareKey;
        }

        public final String getSlug() {
            return this.slug;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            String str = this.slug;
            String str2 = this.shareKey;
            return FGI.A0U("/hatch/fetch_shared_url/", str, str2 != null ? FGI.A0M("?share_key=", Uri.encode(str2)) : "");
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.slug) + AnonymousClass006.A0G(this.shareKey);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ShareSave extends C06G implements SharedContentStefiPath {
        public static final int $stable = 0;
        public final String shortcode;

        public ShareSave(String str) {
            C7384Etj.A0Y(str, 0);
            this.shortcode = str;
        }

        public final ShareSave copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ShareSave(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ShareSave) && C7384Etj.areEqual(this.shortcode, ((ShareSave) obj).shortcode));
        }

        public static /* synthetic */ ShareSave copy$default(ShareSave shareSave, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareSave.shortcode;
            }
            C7384Etj.A0Y(str, 0);
            return new ShareSave(str);
        }

        public final String component1() {
            return this.shortcode;
        }

        public final String getShortcode() {
            return this.shortcode;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/share/save/", this.shortcode);
        }

        public int hashCode() {
            return this.shortcode.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
