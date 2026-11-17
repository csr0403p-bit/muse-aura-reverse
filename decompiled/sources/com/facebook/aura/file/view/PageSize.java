package com.facebook.aura.file.view;

import X.C06G;

/* loaded from: classes3.dex */
public final class PageSize extends C06G {
    public static final int $stable = 0;
    public final float aspectRatio;
    public final int index;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageSize) {
                PageSize pageSize = (PageSize) obj;
                if (this.index != pageSize.index || Float.compare(this.aspectRatio, pageSize.aspectRatio) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PageSize copy$default(PageSize pageSize, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pageSize.index;
        }
        if ((i2 & 2) != 0) {
            f = pageSize.aspectRatio;
        }
        return new PageSize(i, f);
    }

    public final int component1() {
        return this.index;
    }

    public final float component2() {
        return this.aspectRatio;
    }

    public final PageSize copy(int i, float f) {
        return new PageSize(i, f);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return (this.index * 31) + Float.floatToIntBits(this.aspectRatio);
    }

    public PageSize(int i, float f) {
        this.index = i;
        this.aspectRatio = f;
    }

    public String toString() {
        return super.toString();
    }
}
