package com.facebook.aura.browsertask.data;

import X.AnonymousClass001;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchDesktopImage {
    public static final int $stable = 0;
    public final int height;
    public final String url;
    public final int width;

    public HatchDesktopImage(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public final HatchDesktopImage copy(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        return new HatchDesktopImage(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDesktopImage) {
                HatchDesktopImage hatchDesktopImage = (HatchDesktopImage) obj;
                if (!C7384Etj.areEqual(this.url, hatchDesktopImage.url) || this.width != hatchDesktopImage.width || this.height != hatchDesktopImage.height) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchDesktopImage copy$default(HatchDesktopImage hatchDesktopImage, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hatchDesktopImage.url;
        }
        if ((i3 & 2) != 0) {
            i = hatchDesktopImage.width;
        }
        if ((i3 & 4) != 0) {
            i2 = hatchDesktopImage.height;
        }
        return hatchDesktopImage.copy(str, i, i2);
    }

    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.url) + this.width) * 31) + this.height;
    }

    public String toString() {
        String str = this.url;
        int i = this.width;
        int i2 = this.height;
        StringBuilder sbA0x = C3cI.A0x("HatchDesktopImage(url=", str);
        sbA0x.append(", width=");
        sbA0x.append(i);
        sbA0x.append(", height=");
        sbA0x.append(i2);
        return AnonymousClass001.A0v(")", sbA0x);
    }
}
