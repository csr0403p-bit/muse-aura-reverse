package com.facebook.aura.commands.photos;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class PhotoLabelScan extends C06G {
    public final int failed;
    public final List<PhotoEntry> matched;
    public final boolean modelReady;
    public final int scanned;
    public final boolean truncated;

    public PhotoLabelScan(List<PhotoEntry> list, int i, int i2, boolean z, boolean z2) {
        C7384Etj.A0Y(list, 0);
        this.matched = list;
        this.scanned = i;
        this.failed = i2;
        this.modelReady = z;
        this.truncated = z2;
    }

    public final PhotoLabelScan copy(List<PhotoEntry> list, int i, int i2, boolean z, boolean z2) {
        C7384Etj.A0Y(list, 0);
        return new PhotoLabelScan(list, i, i2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PhotoLabelScan) {
                PhotoLabelScan photoLabelScan = (PhotoLabelScan) obj;
                if (!C7384Etj.areEqual(this.matched, photoLabelScan.matched) || this.scanned != photoLabelScan.scanned || this.failed != photoLabelScan.failed || this.modelReady != photoLabelScan.modelReady || this.truncated != photoLabelScan.truncated) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotoLabelScan copy$default(PhotoLabelScan photoLabelScan, List list, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = photoLabelScan.matched;
        }
        if ((i3 & 2) != 0) {
            i = photoLabelScan.scanned;
        }
        if ((i3 & 4) != 0) {
            i2 = photoLabelScan.failed;
        }
        if ((i3 & 8) != 0) {
            z = photoLabelScan.modelReady;
        }
        if ((i3 & 16) != 0) {
            z2 = photoLabelScan.truncated;
        }
        return photoLabelScan.copy(list, i, i2, z, z2);
    }

    public final List<PhotoEntry> component1() {
        return this.matched;
    }

    public final int component2() {
        return this.scanned;
    }

    public final int component3() {
        return this.failed;
    }

    public final boolean component4() {
        return this.modelReady;
    }

    public final boolean component5() {
        return this.truncated;
    }

    public final int getFailed() {
        return this.failed;
    }

    public final List<PhotoEntry> getMatched() {
        return this.matched;
    }

    public final boolean getModelReady() {
        return this.modelReady;
    }

    public final int getScanned() {
        return this.scanned;
    }

    public final boolean getTruncated() {
        return this.truncated;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((((AnonymousClass005.A0E(this.matched) + this.scanned) * 31) + this.failed) * 31, this.modelReady), this.truncated);
    }

    public String toString() {
        return super.toString();
    }
}
