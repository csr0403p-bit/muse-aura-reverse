package com.facebook.aura.linktext;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchTextLink extends C06G {
    public static final int $stable = 0;
    public final int length;
    public final int offset;
    public final String url;

    public HatchTextLink(int i, int i2, String str) {
        C7384Etj.A0Y(str, 2);
        this.offset = i;
        this.length = i2;
        this.url = str;
    }

    public final HatchTextLink copy(int i, int i2, String str) {
        C7384Etj.A0Y(str, 2);
        return new HatchTextLink(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTextLink) {
                HatchTextLink hatchTextLink = (HatchTextLink) obj;
                if (this.offset != hatchTextLink.offset || this.length != hatchTextLink.length || !C7384Etj.areEqual(this.url, hatchTextLink.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTextLink copy$default(HatchTextLink hatchTextLink, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hatchTextLink.offset;
        }
        if ((i3 & 2) != 0) {
            i2 = hatchTextLink.length;
        }
        if ((i3 & 4) != 0) {
            str = hatchTextLink.url;
        }
        return hatchTextLink.copy(i, i2, str);
    }

    public final int component1() {
        return this.offset;
    }

    public final int component2() {
        return this.length;
    }

    public final String component3() {
        return this.url;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, ((this.offset * 31) + this.length) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
