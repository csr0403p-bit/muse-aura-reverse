package com.facebook.aura.globaleffects.api;

import X.C06H;
import X.C3cG;
import X.C3cI;
import X.FGI;

/* loaded from: classes4.dex */
public final class AppFloatingInsets {
    public static final int $stable = 0;
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    public AppFloatingInsets() {
        this(0, 0, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppFloatingInsets) {
                AppFloatingInsets appFloatingInsets = (AppFloatingInsets) obj;
                if (this.left != appFloatingInsets.left || this.top != appFloatingInsets.top || this.right != appFloatingInsets.right || this.bottom != appFloatingInsets.bottom) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AppFloatingInsets copy$default(AppFloatingInsets appFloatingInsets, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = appFloatingInsets.left;
        }
        if ((i5 & 2) != 0) {
            i2 = appFloatingInsets.top;
        }
        if ((i5 & 4) != 0) {
            i3 = appFloatingInsets.right;
        }
        if ((i5 & 8) != 0) {
            i4 = appFloatingInsets.bottom;
        }
        return new AppFloatingInsets(i, i2, i3, i4);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    public final AppFloatingInsets copy(int i, int i2, int i3, int i4) {
        return new AppFloatingInsets(i, i2, i3, i4);
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return FGI.A0i("AppFloatingInsets(left=", ", top=", ", right=", ", bottom=", ")", this.left, this.top, this.right, this.bottom);
    }

    public AppFloatingInsets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public /* synthetic */ AppFloatingInsets(int i, int i2, int i3, int i4, int i5, C06H c06h) {
        this(C3cI.A00(i5, i), C3cG.A01(i5, i2), (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
