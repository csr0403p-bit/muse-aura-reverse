package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageImageLoad {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public CaptureCrop bounds;
    public String frame;
    public int intrinsicHeight;
    public int intrinsicWidth;
    public PageImageLoadState state;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageImageLoad) {
                PageImageLoad pageImageLoad = (PageImageLoad) obj;
                if (!C7384Etj.areEqual(this.frame, pageImageLoad.frame) || this.state != pageImageLoad.state || this.intrinsicWidth != pageImageLoad.intrinsicWidth || this.intrinsicHeight != pageImageLoad.intrinsicHeight || !C7384Etj.areEqual(this.bounds, pageImageLoad.bounds)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setFrame(String str) {
        C7384Etj.A0Y(str, 0);
        this.frame = str;
    }

    public final void setState(PageImageLoadState pageImageLoadState) {
        C7384Etj.A0Y(pageImageLoadState, 0);
        this.state = pageImageLoadState;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-yOCu0fQ$default, reason: not valid java name */
    public static /* synthetic */ PageImageLoad m3650copyyOCu0fQ$default(PageImageLoad pageImageLoad, String str, PageImageLoadState pageImageLoadState, int i, int i2, CaptureCrop captureCrop, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = pageImageLoad.frame;
        }
        if ((i3 & 2) != 0) {
            pageImageLoadState = pageImageLoad.state;
        }
        if ((i3 & 4) != 0) {
            i = pageImageLoad.intrinsicWidth;
        }
        if ((i3 & 8) != 0) {
            i2 = pageImageLoad.intrinsicHeight;
        }
        if ((i3 & 16) != 0) {
            captureCrop = pageImageLoad.bounds;
        }
        return pageImageLoad.m3653copyyOCu0fQ(str, pageImageLoadState, i, i2, captureCrop);
    }

    public final String component1() {
        return this.frame;
    }

    public final PageImageLoadState component2() {
        return this.state;
    }

    /* renamed from: component3-pVg5ArA, reason: not valid java name */
    public final int m3651component3pVg5ArA() {
        return this.intrinsicWidth;
    }

    /* renamed from: component4-pVg5ArA, reason: not valid java name */
    public final int m3652component4pVg5ArA() {
        return this.intrinsicHeight;
    }

    public final CaptureCrop component5() {
        return this.bounds;
    }

    public final CaptureCrop getBounds() {
        return this.bounds;
    }

    public final String getFrame() {
        return this.frame;
    }

    /* renamed from: getIntrinsicHeight-pVg5ArA, reason: not valid java name */
    public final int m3654getIntrinsicHeightpVg5ArA() {
        return this.intrinsicHeight;
    }

    /* renamed from: getIntrinsicWidth-pVg5ArA, reason: not valid java name */
    public final int m3655getIntrinsicWidthpVg5ArA() {
        return this.intrinsicWidth;
    }

    public final PageImageLoadState getState() {
        return this.state;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.state, AnonymousClass001.A0G(this.frame)) + this.intrinsicWidth) * 31) + this.intrinsicHeight) * 31) + AnonymousClass006.A0D(this.bounds);
    }

    public final void setBounds(CaptureCrop captureCrop) {
        this.bounds = captureCrop;
    }

    /* renamed from: setIntrinsicHeight-WZ4Q5Ns, reason: not valid java name */
    public final void m3656setIntrinsicHeightWZ4Q5Ns(int i) {
        this.intrinsicHeight = i;
    }

    /* renamed from: setIntrinsicWidth-WZ4Q5Ns, reason: not valid java name */
    public final void m3657setIntrinsicWidthWZ4Q5Ns(int i) {
        this.intrinsicWidth = i;
    }

    public String toString() {
        String str = this.frame;
        PageImageLoadState pageImageLoadState = this.state;
        String strValueOf = String.valueOf(BV4.A03(this.intrinsicWidth));
        String strValueOf2 = String.valueOf(BV4.A03(this.intrinsicHeight));
        CaptureCrop captureCrop = this.bounds;
        StringBuilder sbA0x = C3cI.A0x("PageImageLoad(frame=", str);
        sbA0x.append(", state=");
        sbA0x.append(pageImageLoadState);
        sbA0x.append(", intrinsicWidth=");
        sbA0x.append(strValueOf);
        sbA0x.append(", intrinsicHeight=");
        sbA0x.append(strValueOf2);
        return C3cJ.A0L(captureCrop, ", bounds=", sbA0x);
    }

    public PageImageLoad(String str, PageImageLoadState pageImageLoadState, int i, int i2, CaptureCrop captureCrop) {
        AnonymousClass003.A0u(str, pageImageLoadState);
        this.frame = str;
        this.state = pageImageLoadState;
        this.intrinsicWidth = i;
        this.intrinsicHeight = i2;
        this.bounds = captureCrop;
    }

    /* renamed from: copy-yOCu0fQ, reason: not valid java name */
    public final PageImageLoad m3653copyyOCu0fQ(String str, PageImageLoadState pageImageLoadState, int i, int i2, CaptureCrop captureCrop) {
        AnonymousClass003.A0u(str, pageImageLoadState);
        return new PageImageLoad(str, pageImageLoadState, i, i2, captureCrop);
    }

    public /* synthetic */ PageImageLoad(String str, PageImageLoadState pageImageLoadState, int i, int i2, CaptureCrop captureCrop, C06H c06h) {
        this(str, pageImageLoadState, i, i2, captureCrop);
    }
}
