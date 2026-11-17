package com.meta.maps.fancypins;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinClusteringPolicy {
    public final String clusterBlueprintId;
    public final String group;
    public final RectInsets joinInsets;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinClusteringPolicy) {
                FancyPinClusteringPolicy fancyPinClusteringPolicy = (FancyPinClusteringPolicy) obj;
                if (!C7384Etj.areEqual(this.group, fancyPinClusteringPolicy.group) || !C7384Etj.areEqual(this.clusterBlueprintId, fancyPinClusteringPolicy.clusterBlueprintId) || !C7384Etj.areEqual(this.joinInsets, fancyPinClusteringPolicy.joinInsets)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinClusteringPolicy copy$default(FancyPinClusteringPolicy fancyPinClusteringPolicy, String str, String str2, RectInsets rectInsets, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fancyPinClusteringPolicy.group;
        }
        if ((i & 2) != 0) {
            str2 = fancyPinClusteringPolicy.clusterBlueprintId;
        }
        if ((i & 4) != 0) {
            rectInsets = fancyPinClusteringPolicy.joinInsets;
        }
        return fancyPinClusteringPolicy.copy(str, str2, rectInsets);
    }

    public final String component1() {
        return this.group;
    }

    public final String component2() {
        return this.clusterBlueprintId;
    }

    public final RectInsets component3() {
        return this.joinInsets;
    }

    public final String getClusterBlueprintId() {
        return this.clusterBlueprintId;
    }

    public final String getGroup() {
        return this.group;
    }

    public final RectInsets getJoinInsets() {
        return this.joinInsets;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.clusterBlueprintId, AnonymousClass001.A0G(this.group)) + AnonymousClass006.A0D(this.joinInsets);
    }

    public String toString() {
        String str = this.group;
        String str2 = this.clusterBlueprintId;
        RectInsets rectInsets = this.joinInsets;
        StringBuilder sbA0x = C3cI.A0x("FancyPinClusteringPolicy(group=", str);
        sbA0x.append(", clusterBlueprintId=");
        sbA0x.append(str2);
        return C3cJ.A0L(rectInsets, ", joinInsets=", sbA0x);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinClusteringPolicy(String str, String str2) {
        this(str, str2, null);
        AnonymousClass003.A0u(str, str2);
    }

    public final FancyPinClusteringPolicy copy(String str, String str2, RectInsets rectInsets) {
        AnonymousClass003.A0u(str, str2);
        return new FancyPinClusteringPolicy(str, str2, rectInsets);
    }

    public FancyPinClusteringPolicy(String str, String str2, RectInsets rectInsets) {
        AnonymousClass003.A0u(str, str2);
        this.group = str;
        this.clusterBlueprintId = str2;
        this.joinInsets = rectInsets;
    }

    public /* synthetic */ FancyPinClusteringPolicy(String str, String str2, RectInsets rectInsets, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : rectInsets);
    }
}
