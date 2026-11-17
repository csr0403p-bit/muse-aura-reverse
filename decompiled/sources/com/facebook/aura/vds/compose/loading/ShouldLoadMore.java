package com.facebook.aura.vds.compose.loading;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ShouldLoadMore extends C06G {
    public final Integer itemIndex;
    public final Integer itemSize;
    public final boolean shouldLoadMore;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShouldLoadMore) {
                ShouldLoadMore shouldLoadMore = (ShouldLoadMore) obj;
                if (this.shouldLoadMore != shouldLoadMore.shouldLoadMore || !C7384Etj.areEqual(this.itemIndex, shouldLoadMore.itemIndex) || !C7384Etj.areEqual(this.itemSize, shouldLoadMore.itemSize)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShouldLoadMore copy$default(ShouldLoadMore shouldLoadMore, boolean z, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shouldLoadMore.shouldLoadMore;
        }
        if ((i & 2) != 0) {
            num = shouldLoadMore.itemIndex;
        }
        if ((i & 4) != 0) {
            num2 = shouldLoadMore.itemSize;
        }
        return new ShouldLoadMore(z, num, num2);
    }

    public final boolean component1() {
        return this.shouldLoadMore;
    }

    public final Integer component2() {
        return this.itemIndex;
    }

    public final Integer component3() {
        return this.itemSize;
    }

    public final ShouldLoadMore copy(boolean z, Integer num, Integer num2) {
        return new ShouldLoadMore(z, num, num2);
    }

    public final Integer getItemIndex() {
        return this.itemIndex;
    }

    public final Integer getItemSize() {
        return this.itemSize;
    }

    public final boolean getShouldLoadMore() {
        return this.shouldLoadMore;
    }

    public int hashCode() {
        return ((C0KA.A02(this.shouldLoadMore) + AnonymousClass006.A0D(this.itemIndex)) * 31) + C3cH.A02(this.itemSize);
    }

    public ShouldLoadMore(boolean z, Integer num, Integer num2) {
        this.shouldLoadMore = z;
        this.itemIndex = num;
        this.itemSize = num2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShouldLoadMore(boolean z, Integer num, Integer num2, int i, C06H c06h) {
        this(z, num, (i & 4) != 0 ? null : num2);
    }
}
