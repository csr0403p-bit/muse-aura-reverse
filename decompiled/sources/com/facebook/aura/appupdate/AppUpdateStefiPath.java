package com.facebook.aura.appupdate;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes5.dex */
public interface AppUpdateStefiPath extends StefiHatchPath.Extension {

    public final class LatestAppVersion extends C06G implements AppUpdateStefiPath {
        public static final int $stable = 0;
        public final String appId;

        public LatestAppVersion(String str) {
            C7384Etj.A0Y(str, 0);
            this.appId = str;
        }

        public final LatestAppVersion copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new LatestAppVersion(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LatestAppVersion) && C7384Etj.areEqual(this.appId, ((LatestAppVersion) obj).appId));
        }

        public static /* synthetic */ LatestAppVersion copy$default(LatestAppVersion latestAppVersion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = latestAppVersion.appId;
            }
            C7384Etj.A0Y(str, 0);
            return new LatestAppVersion(str);
        }

        public final String component1() {
            return this.appId;
        }

        public final String getAppId() {
            return this.appId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/latest_app_version/", this.appId);
        }

        public int hashCode() {
            return this.appId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
