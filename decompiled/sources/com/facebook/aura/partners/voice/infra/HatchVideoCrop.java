package com.facebook.aura.partners.voice.infra;

import X.C06G;

/* loaded from: classes2.dex */
public final class HatchVideoCrop extends C06G {
    public final int bottom;
    public final int top;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchVideoCrop) {
                HatchVideoCrop hatchVideoCrop = (HatchVideoCrop) obj;
                if (this.top != hatchVideoCrop.top || this.bottom != hatchVideoCrop.bottom) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchVideoCrop copy$default(HatchVideoCrop hatchVideoCrop, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hatchVideoCrop.top;
        }
        if ((i3 & 2) != 0) {
            i2 = hatchVideoCrop.bottom;
        }
        return new HatchVideoCrop(i, i2);
    }

    public final int component1() {
        return this.top;
    }

    public final int component2() {
        return this.bottom;
    }

    public final HatchVideoCrop copy(int i, int i2) {
        return new HatchVideoCrop(i, i2);
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (this.top * 31) + this.bottom;
    }

    public HatchVideoCrop(int i, int i2) {
        this.top = i;
        this.bottom = i2;
    }

    public String toString() {
        return super.toString();
    }
}
