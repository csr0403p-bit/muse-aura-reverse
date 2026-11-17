package X;

import android.graphics.Bitmap;

/* renamed from: X.EiA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7198EiA {
    public static final C7198EiA A04 = new C7198EiA(new C7210EiV());
    public final Bitmap.Config A00;
    public final Bitmap.Config A01;
    public final InterfaceC7068EfO A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C7198EiA c7198EiA = (C7198EiA) obj;
                if (this.A03 != c7198EiA.A03 || this.A01 != c7198EiA.A01 || this.A02 != c7198EiA.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        C7200EiD c7200EiD = new C7200EiD(C3cI.A0Y(this));
        C7200EiD.A01(c7200EiD, "minDecodeIntervalMs", 100);
        C7200EiD.A01(c7200EiD, "maxDimensionPx", Integer.MAX_VALUE);
        c7200EiD.A02("decodePreviewFrame", false);
        c7200EiD.A02("useLastFrameForPreview", false);
        c7200EiD.A02("useEncodedImageForPreview", false);
        c7200EiD.A02("decodeAllFrames", false);
        c7200EiD.A02("forceStaticImage", this.A03);
        C7200EiD.A00(c7200EiD, this.A01.name(), "bitmapConfigName");
        C7200EiD.A00(c7200EiD, this.A00.name(), "animatedBitmapConfigName");
        C7200EiD.A00(c7200EiD, this.A02, "customImageDecoder");
        C7200EiD.A00(c7200EiD, null, "bitmapTransformation");
        C7200EiD.A00(c7200EiD, null, "intermediateImageBitmapTransformation");
        C7200EiD.A00(c7200EiD, null, "colorSpace");
        return FGI.A0U("ImageDecodeOptions{", c7200EiD.toString(), "}");
    }

    public C7198EiA(C7210EiV c7210EiV) {
        this.A03 = c7210EiV.A03;
        this.A01 = c7210EiV.A01;
        this.A00 = c7210EiV.A00;
        this.A02 = c7210EiV.A02;
    }

    public final int hashCode() {
        return (((((((674909381 + (this.A03 ? 1 : 0)) * 31) + this.A01.ordinal()) * 31) + this.A00.ordinal()) * 31) + C60R.A01(this.A02)) * 31 * 31 * 31;
    }
}
