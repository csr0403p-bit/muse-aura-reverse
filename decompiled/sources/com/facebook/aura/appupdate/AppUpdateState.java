package com.facebook.aura.appupdate;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface AppUpdateState {

    public final class HardBlock extends C06G implements AppUpdateState {
        public static final int $stable = 0;
        public final String recommendedVersion;

        public HardBlock(String str) {
            C7384Etj.A0Y(str, 0);
            this.recommendedVersion = str;
        }

        public final HardBlock copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new HardBlock(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof HardBlock) && C7384Etj.areEqual(this.recommendedVersion, ((HardBlock) obj).recommendedVersion));
        }

        public static /* synthetic */ HardBlock copy$default(HardBlock hardBlock, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hardBlock.recommendedVersion;
            }
            C7384Etj.A0Y(str, 0);
            return new HardBlock(str);
        }

        public final String component1() {
            return this.recommendedVersion;
        }

        public final String getRecommendedVersion() {
            return this.recommendedVersion;
        }

        public int hashCode() {
            return this.recommendedVersion.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes5.dex */
    public final class None implements AppUpdateState {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return -2042656117;
        }
    }

    /* loaded from: classes5.dex */
    public final class SoftBlock extends C06G implements AppUpdateState {
        public static final int $stable = 0;
        public final String recommendedVersion;

        public SoftBlock(String str) {
            C7384Etj.A0Y(str, 0);
            this.recommendedVersion = str;
        }

        public final SoftBlock copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SoftBlock(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SoftBlock) && C7384Etj.areEqual(this.recommendedVersion, ((SoftBlock) obj).recommendedVersion));
        }

        public static /* synthetic */ SoftBlock copy$default(SoftBlock softBlock, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = softBlock.recommendedVersion;
            }
            C7384Etj.A0Y(str, 0);
            return new SoftBlock(str);
        }

        public final String component1() {
            return this.recommendedVersion;
        }

        public final String getRecommendedVersion() {
            return this.recommendedVersion;
        }

        public int hashCode() {
            return this.recommendedVersion.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
