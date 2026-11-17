package com.facebook.aura.sharedcontent;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface SharedContentEffect {

    public final class SaveFailed extends C06G implements SharedContentEffect {
        public static final int $stable = 0;
        public final String message;

        public SaveFailed(String str) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
        }

        public final SaveFailed copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SaveFailed(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SaveFailed) && C7384Etj.areEqual(this.message, ((SaveFailed) obj).message));
        }

        public static /* synthetic */ SaveFailed copy$default(SaveFailed saveFailed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = saveFailed.message;
            }
            C7384Etj.A0Y(str, 0);
            return new SaveFailed(str);
        }

        public final String component1() {
            return this.message;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SavedToHatch implements SharedContentEffect {
        public static final int $stable = 0;
        public static final SavedToHatch INSTANCE = new SavedToHatch();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SavedToHatch);
        }

        public String toString() {
            return "SavedToHatch";
        }

        public int hashCode() {
            return 946369233;
        }
    }

    public final class ShareUrl extends C06G implements SharedContentEffect {
        public static final int $stable = 0;
        public final String url;

        public ShareUrl(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final ShareUrl copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ShareUrl(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ShareUrl) && C7384Etj.areEqual(this.url, ((ShareUrl) obj).url));
        }

        public static /* synthetic */ ShareUrl copy$default(ShareUrl shareUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareUrl.url;
            }
            C7384Etj.A0Y(str, 0);
            return new ShareUrl(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
