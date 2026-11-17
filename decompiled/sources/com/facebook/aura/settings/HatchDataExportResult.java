package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import android.net.Uri;

/* loaded from: classes.dex */
public interface HatchDataExportResult {

    public final class Failure extends C06G implements HatchDataExportResult {
        public static final int $stable = 0;
        public final String reason;

        public Failure(String str) {
            C7384Etj.A0Y(str, 0);
            this.reason = str;
        }

        public final Failure copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Failure(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failure) && C7384Etj.areEqual(this.reason, ((Failure) obj).reason));
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            C7384Etj.A0Y(str, 0);
            return new Failure(str);
        }

        public final String component1() {
            return this.reason;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success extends C06G implements HatchDataExportResult {
        public static final int $stable = 8;
        public final String fileName;
        public final String mimeType;
        public final Uri uri;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    if (!C7384Etj.areEqual(this.uri, success.uri) || !C7384Etj.areEqual(this.fileName, success.fileName) || !C7384Etj.areEqual(this.mimeType, success.mimeType)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Success copy$default(Success success, Uri uri, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = success.uri;
            }
            if ((i & 2) != 0) {
                str = success.fileName;
            }
            if ((i & 4) != 0) {
                str2 = success.mimeType;
            }
            return success.copy(uri, str, str2);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final String component2() {
            return this.fileName;
        }

        public final String component3() {
            return this.mimeType;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.mimeType, AnonymousClass005.A0I(this.fileName, AnonymousClass005.A0E(this.uri)));
        }

        public Success(Uri uri, String str, String str2) {
            AnonymousClass005.A0x(uri, str, str2);
            this.uri = uri;
            this.fileName = str;
            this.mimeType = str2;
        }

        public final Success copy(Uri uri, String str, String str2) {
            AnonymousClass005.A0x(uri, str, str2);
            return new Success(uri, str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }
}
