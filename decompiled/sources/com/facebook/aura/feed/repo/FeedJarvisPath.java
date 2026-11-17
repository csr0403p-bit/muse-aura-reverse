package com.facebook.aura.feed.repo;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface FeedJarvisPath extends JarvisPath.Extension {

    /* loaded from: classes6.dex */
    public final class Feed implements FeedJarvisPath {
        public static final int $stable = 0;
        public static final Feed INSTANCE = new Feed();
        public static final String value = "api/feed";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Feed);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Feed";
        }

        public int hashCode() {
            return -357905560;
        }
    }

    public final class FeedInfinite implements FeedJarvisPath {
        public static final int $stable = 0;
        public static final FeedInfinite INSTANCE = new FeedInfinite();
        public static final String value = "api/feed/infinite";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedInfinite);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FeedInfinite";
        }

        public int hashCode() {
            return 782872988;
        }
    }

    /* loaded from: classes6.dex */
    public final class FeedPrompt implements FeedJarvisPath {
        public static final int $stable = 0;
        public static final FeedPrompt INSTANCE = new FeedPrompt();
        public static final String value = "api/feed/prompt";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedPrompt);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FeedPrompt";
        }

        public int hashCode() {
            return 1621943020;
        }
    }

    /* loaded from: classes6.dex */
    public final class FeedRegenerate implements FeedJarvisPath {
        public static final int $stable = 0;
        public static final FeedRegenerate INSTANCE = new FeedRegenerate();
        public static final String value = "api/feed/regenerate";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedRegenerate);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FeedRegenerate";
        }

        public int hashCode() {
            return 524273200;
        }
    }

    /* loaded from: classes6.dex */
    public final class FeedSearch implements FeedJarvisPath {
        public static final int $stable = 0;
        public static final FeedSearch INSTANCE = new FeedSearch();
        public static final String value = "api/feed/search";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedSearch);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FeedSearch";
        }

        public int hashCode() {
            return 1695412016;
        }
    }

    /* loaded from: classes6.dex */
    public final class FeedStatus implements FeedJarvisPath {
        public static final int $stable = 0;
        public static final FeedStatus INSTANCE = new FeedStatus();
        public static final String value = "api/feed/status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FeedStatus";
        }

        public int hashCode() {
            return 1709267322;
        }
    }

    /* loaded from: classes6.dex */
    public final class FeedUnit extends C06G implements FeedJarvisPath {
        public static final int $stable = 0;
        public final String unitId;

        public FeedUnit(String str) {
            C7384Etj.A0Y(str, 0);
            this.unitId = str;
        }

        public final FeedUnit copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new FeedUnit(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FeedUnit) && C7384Etj.areEqual(this.unitId, ((FeedUnit) obj).unitId));
        }

        public static /* synthetic */ FeedUnit copy$default(FeedUnit feedUnit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedUnit.unitId;
            }
            C7384Etj.A0Y(str, 0);
            return new FeedUnit(str);
        }

        public final String component1() {
            return this.unitId;
        }

        public final String getUnitId() {
            return this.unitId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("api/feed/units/", Uri.encode(this.unitId));
        }

        public int hashCode() {
            return this.unitId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class FeedUnitReaction extends C06G implements FeedJarvisPath {
        public static final int $stable = 0;
        public final String unitId;

        public FeedUnitReaction(String str) {
            C7384Etj.A0Y(str, 0);
            this.unitId = str;
        }

        public final FeedUnitReaction copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new FeedUnitReaction(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FeedUnitReaction) && C7384Etj.areEqual(this.unitId, ((FeedUnitReaction) obj).unitId));
        }

        public static /* synthetic */ FeedUnitReaction copy$default(FeedUnitReaction feedUnitReaction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedUnitReaction.unitId;
            }
            C7384Etj.A0Y(str, 0);
            return new FeedUnitReaction(str);
        }

        public final String component1() {
            return this.unitId;
        }

        public final String getUnitId() {
            return this.unitId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/feed/units/", Uri.encode(this.unitId), "/reaction");
        }

        public int hashCode() {
            return this.unitId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class FeedUnitTap extends C06G implements FeedJarvisPath {
        public static final int $stable = 0;
        public final String unitId;

        public FeedUnitTap(String str) {
            C7384Etj.A0Y(str, 0);
            this.unitId = str;
        }

        public final FeedUnitTap copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new FeedUnitTap(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FeedUnitTap) && C7384Etj.areEqual(this.unitId, ((FeedUnitTap) obj).unitId));
        }

        public static /* synthetic */ FeedUnitTap copy$default(FeedUnitTap feedUnitTap, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedUnitTap.unitId;
            }
            C7384Etj.A0Y(str, 0);
            return new FeedUnitTap(str);
        }

        public final String component1() {
            return this.unitId;
        }

        public final String getUnitId() {
            return this.unitId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/feed/units/", Uri.encode(this.unitId), "/tap");
        }

        public int hashCode() {
            return this.unitId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class FeedUnitsSeen implements FeedJarvisPath {
        public static final int $stable = 0;
        public static final FeedUnitsSeen INSTANCE = new FeedUnitsSeen();
        public static final String value = "api/feed/units/seen";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedUnitsSeen);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FeedUnitsSeen";
        }

        public int hashCode() {
            return 1266021378;
        }
    }
}
