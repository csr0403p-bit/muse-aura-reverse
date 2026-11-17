package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchSearchScrollAnchor extends C06G {
    public final int firstVisibleItemIndex;
    public final int firstVisibleItemScrollOffset;
    public final String query;

    public HatchSearchScrollAnchor(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.query = str;
        this.firstVisibleItemIndex = i;
        this.firstVisibleItemScrollOffset = i2;
    }

    public final HatchSearchScrollAnchor copy(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        return new HatchSearchScrollAnchor(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSearchScrollAnchor) {
                HatchSearchScrollAnchor hatchSearchScrollAnchor = (HatchSearchScrollAnchor) obj;
                if (!C7384Etj.areEqual(this.query, hatchSearchScrollAnchor.query) || this.firstVisibleItemIndex != hatchSearchScrollAnchor.firstVisibleItemIndex || this.firstVisibleItemScrollOffset != hatchSearchScrollAnchor.firstVisibleItemScrollOffset) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSearchScrollAnchor copy$default(HatchSearchScrollAnchor hatchSearchScrollAnchor, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hatchSearchScrollAnchor.query;
        }
        if ((i3 & 2) != 0) {
            i = hatchSearchScrollAnchor.firstVisibleItemIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = hatchSearchScrollAnchor.firstVisibleItemScrollOffset;
        }
        return hatchSearchScrollAnchor.copy(str, i, i2);
    }

    public final String component1() {
        return this.query;
    }

    public final int component2() {
        return this.firstVisibleItemIndex;
    }

    public final int component3() {
        return this.firstVisibleItemScrollOffset;
    }

    public final int getFirstVisibleItemIndex() {
        return this.firstVisibleItemIndex;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.query) + this.firstVisibleItemIndex) * 31) + this.firstVisibleItemScrollOffset;
    }

    public String toString() {
        return super.toString();
    }
}
