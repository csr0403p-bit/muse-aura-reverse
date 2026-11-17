package com.meta.maps.fancypins;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C60R;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinClusterVariantSelectionRule {
    public final Long maxMemberCount;
    public final long minMemberCount;
    public final String variantId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinClusterVariantSelectionRule(String str, long j) {
        this(str, j, null);
        C7384Etj.A0Y(str, 0);
    }

    public final FancyPinClusterVariantSelectionRule copy(String str, long j, Long l) {
        C7384Etj.A0Y(str, 0);
        return new FancyPinClusterVariantSelectionRule(str, j, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinClusterVariantSelectionRule) {
                FancyPinClusterVariantSelectionRule fancyPinClusterVariantSelectionRule = (FancyPinClusterVariantSelectionRule) obj;
                if (!C7384Etj.areEqual(this.variantId, fancyPinClusterVariantSelectionRule.variantId) || this.minMemberCount != fancyPinClusterVariantSelectionRule.minMemberCount || !C7384Etj.areEqual(this.maxMemberCount, fancyPinClusterVariantSelectionRule.maxMemberCount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinClusterVariantSelectionRule copy$default(FancyPinClusterVariantSelectionRule fancyPinClusterVariantSelectionRule, String str, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fancyPinClusterVariantSelectionRule.variantId;
        }
        if ((i & 2) != 0) {
            j = fancyPinClusterVariantSelectionRule.minMemberCount;
        }
        if ((i & 4) != 0) {
            l = fancyPinClusterVariantSelectionRule.maxMemberCount;
        }
        return fancyPinClusterVariantSelectionRule.copy(str, j, l);
    }

    public final String component1() {
        return this.variantId;
    }

    public final long component2() {
        return this.minMemberCount;
    }

    public final Long component3() {
        return this.maxMemberCount;
    }

    public final Long getMaxMemberCount() {
        return this.maxMemberCount;
    }

    public final long getMinMemberCount() {
        return this.minMemberCount;
    }

    public final String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        return C60R.A00(this.minMemberCount, AnonymousClass001.A0G(this.variantId)) + AnonymousClass006.A0D(this.maxMemberCount);
    }

    public String toString() {
        String str = this.variantId;
        long j = this.minMemberCount;
        Long l = this.maxMemberCount;
        StringBuilder sbA0x = C3cI.A0x("FancyPinClusterVariantSelectionRule(variantId=", str);
        sbA0x.append(", minMemberCount=");
        sbA0x.append(j);
        return C3cJ.A0L(l, ", maxMemberCount=", sbA0x);
    }

    public FancyPinClusterVariantSelectionRule(String str, long j, Long l) {
        C7384Etj.A0Y(str, 0);
        this.variantId = str;
        this.minMemberCount = j;
        this.maxMemberCount = l;
    }

    public /* synthetic */ FancyPinClusterVariantSelectionRule(String str, long j, Long l, int i, C06H c06h) {
        this(str, j, (i & 4) != 0 ? null : l);
    }
}
