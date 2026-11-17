package com.facebook.aura.appupdate;

import X.C7384Etj;

/* loaded from: classes5.dex */
public interface OfferedUpdate {

    public final class InHouse implements OfferedUpdate {
        public static final int $stable = 0;
        public final String versionName;

        public InHouse(String str) {
            C7384Etj.A0Y(str, 0);
            this.versionName = str;
        }

        public final String getVersionName() {
            return this.versionName;
        }
    }

    public final class Play implements OfferedUpdate {
        public static final int $stable = 0;
        public final int versionCode;

        public final int getVersionCode() {
            return this.versionCode;
        }

        public Play(int i) {
            this.versionCode = i;
        }
    }
}
