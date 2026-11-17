package com.facebook.aura.browsertask.control;

import X.AnonymousClass001;
import X.HsK;

/* loaded from: classes2.dex */
public final class BrowserViewerPreference {
    public static final int $stable = 0;
    public final double devicePixelRatio;
    public final int height;
    public final int width;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserViewerPreference) {
                BrowserViewerPreference browserViewerPreference = (BrowserViewerPreference) obj;
                if (this.width != browserViewerPreference.width || this.height != browserViewerPreference.height || Double.compare(this.devicePixelRatio, browserViewerPreference.devicePixelRatio) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserViewerPreference copy$default(BrowserViewerPreference browserViewerPreference, int i, int i2, double d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = browserViewerPreference.width;
        }
        if ((i3 & 2) != 0) {
            i2 = browserViewerPreference.height;
        }
        if ((i3 & 4) != 0) {
            d = browserViewerPreference.devicePixelRatio;
        }
        return new BrowserViewerPreference(i, i2, d);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final double component3() {
        return this.devicePixelRatio;
    }

    public final BrowserViewerPreference copy(int i, int i2, double d) {
        return new BrowserViewerPreference(i, i2, d);
    }

    public final double getDevicePixelRatio() {
        return this.devicePixelRatio;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.width * 31) + this.height) * 31) + HsK.A00(this.devicePixelRatio);
    }

    public String toString() {
        int i = this.width;
        int i2 = this.height;
        double d = this.devicePixelRatio;
        StringBuilder sb = new StringBuilder("BrowserViewerPreference(width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", devicePixelRatio=");
        sb.append(d);
        return AnonymousClass001.A0v(")", sb);
    }

    public BrowserViewerPreference(int i, int i2, double d) {
        this.width = i;
        this.height = i2;
        this.devicePixelRatio = d;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (Math.abs(d) > Double.MAX_VALUE || d <= 0.0d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
