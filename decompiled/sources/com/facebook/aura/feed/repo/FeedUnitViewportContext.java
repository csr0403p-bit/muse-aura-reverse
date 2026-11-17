package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes.dex */
public final class FeedUnitViewportContext extends C06G {
    public static final int $stable = 0;
    public final int absolutePosition;
    public final Map<String, String> impressionMetadata;
    public final String unitId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedUnitViewportContext) {
                FeedUnitViewportContext feedUnitViewportContext = (FeedUnitViewportContext) obj;
                if (!C7384Etj.areEqual(this.unitId, feedUnitViewportContext.unitId) || this.absolutePosition != feedUnitViewportContext.absolutePosition || !C7384Etj.areEqual(this.impressionMetadata, feedUnitViewportContext.impressionMetadata)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedUnitViewportContext copy$default(FeedUnitViewportContext feedUnitViewportContext, String str, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedUnitViewportContext.unitId;
        }
        if ((i2 & 2) != 0) {
            i = feedUnitViewportContext.absolutePosition;
        }
        if ((i2 & 4) != 0) {
            map = feedUnitViewportContext.impressionMetadata;
        }
        return feedUnitViewportContext.copy(str, i, map);
    }

    public final String component1() {
        return this.unitId;
    }

    public final int component2() {
        return this.absolutePosition;
    }

    public final Map<String, String> component3() {
        return this.impressionMetadata;
    }

    public final int getAbsolutePosition() {
        return this.absolutePosition;
    }

    public final Map<String, String> getImpressionMetadata() {
        return this.impressionMetadata;
    }

    public final String getUnitId() {
        return this.unitId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.impressionMetadata, (AnonymousClass001.A0G(this.unitId) + this.absolutePosition) * 31);
    }

    public FeedUnitViewportContext(String str, int i, Map<String, String> map) {
        AnonymousClass003.A0v(str, map);
        this.unitId = str;
        this.absolutePosition = i;
        this.impressionMetadata = map;
    }

    public final FeedUnitViewportContext copy(String str, int i, Map<String, String> map) {
        AnonymousClass003.A0v(str, map);
        return new FeedUnitViewportContext(str, i, map);
    }

    public String toString() {
        return super.toString();
    }
}
