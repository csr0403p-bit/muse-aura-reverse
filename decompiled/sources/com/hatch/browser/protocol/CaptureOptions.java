package com.hatch.browser.protocol;

import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import X.C8j5;
import X.FKC;

/* loaded from: classes6.dex */
public final class CaptureOptions {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean imageLoads;
    public FKC maxHeight;
    public FKC maxWidth;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaptureOptions) {
                CaptureOptions captureOptions = (CaptureOptions) obj;
                if (!C7384Etj.areEqual(this.maxWidth, captureOptions.maxWidth) || !C7384Etj.areEqual(this.maxHeight, captureOptions.maxHeight) || this.imageLoads != captureOptions.imageLoads) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-DR-6lps$default, reason: not valid java name */
    public static /* synthetic */ CaptureOptions m3291copyDR6lps$default(CaptureOptions captureOptions, FKC fkc, FKC fkc2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fkc = captureOptions.maxWidth;
        }
        if ((i & 2) != 0) {
            fkc2 = captureOptions.maxHeight;
        }
        if ((i & 4) != 0) {
            z = captureOptions.imageLoads;
        }
        return new CaptureOptions(fkc, fkc2, z);
    }

    /* renamed from: component1-0hXNFcg, reason: not valid java name */
    public final FKC m3292component10hXNFcg() {
        return this.maxWidth;
    }

    /* renamed from: component2-0hXNFcg, reason: not valid java name */
    public final FKC m3293component20hXNFcg() {
        return this.maxHeight;
    }

    public final boolean component3() {
        return this.imageLoads;
    }

    /* renamed from: copy-DR-6lps, reason: not valid java name */
    public final CaptureOptions m3294copyDR6lps(FKC fkc, FKC fkc2, boolean z) {
        return new CaptureOptions(fkc, fkc2, z);
    }

    public final boolean getImageLoads() {
        return this.imageLoads;
    }

    /* renamed from: getMaxHeight-0hXNFcg, reason: not valid java name */
    public final FKC m3295getMaxHeight0hXNFcg() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-0hXNFcg, reason: not valid java name */
    public final FKC m3296getMaxWidth0hXNFcg() {
        return this.maxWidth;
    }

    public int hashCode() {
        FKC fkc = this.maxWidth;
        int i = (fkc == null ? 0 : fkc.A00) * 31;
        FKC fkc2 = this.maxHeight;
        return C0KA.A00((i + (fkc2 != null ? fkc2.A00 : 0)) * 31, this.imageLoads);
    }

    public final void setImageLoads(boolean z) {
        this.imageLoads = z;
    }

    /* renamed from: setMaxHeight-ExVfyTY, reason: not valid java name */
    public final void m3297setMaxHeightExVfyTY(FKC fkc) {
        this.maxHeight = fkc;
    }

    /* renamed from: setMaxWidth-ExVfyTY, reason: not valid java name */
    public final void m3298setMaxWidthExVfyTY(FKC fkc) {
        this.maxWidth = fkc;
    }

    public String toString() {
        FKC fkc = this.maxWidth;
        FKC fkc2 = this.maxHeight;
        boolean z = this.imageLoads;
        StringBuilder sbA0f = C3cG.A0f(fkc, "CaptureOptions(maxWidth=");
        sbA0f.append(", maxHeight=");
        sbA0f.append(fkc2);
        return C8j5.A0W(", imageLoads=", sbA0f, z);
    }

    public /* synthetic */ CaptureOptions(FKC fkc, FKC fkc2, boolean z, C06H c06h) {
        this(fkc, fkc2, z);
    }

    public CaptureOptions(FKC fkc, FKC fkc2, boolean z) {
        this.maxWidth = fkc;
        this.maxHeight = fkc2;
        this.imageLoads = z;
    }
}
