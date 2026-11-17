package com.hatch.browser.protocol;

import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ProtectedImage {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public EncodedImage encoded;
    public int height;
    public byte[] png;
    public int width;

    public ProtectedImage(byte[] bArr, int i, int i2, EncodedImage encodedImage) {
        C7384Etj.A0Y(bArr, 0);
        this.png = bArr;
        this.width = i;
        this.height = i2;
        this.encoded = encodedImage;
    }

    /* renamed from: copy-gd2BlFg, reason: not valid java name */
    public final ProtectedImage m3698copygd2BlFg(byte[] bArr, int i, int i2, EncodedImage encodedImage) {
        C7384Etj.A0Y(bArr, 0);
        return new ProtectedImage(bArr, i, i2, encodedImage);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProtectedImage) {
                ProtectedImage protectedImage = (ProtectedImage) obj;
                if (!C7384Etj.areEqual(this.png, protectedImage.png) || this.width != protectedImage.width || this.height != protectedImage.height || !C7384Etj.areEqual(this.encoded, protectedImage.encoded)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setPng(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.png = bArr;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-gd2BlFg$default, reason: not valid java name */
    public static /* synthetic */ ProtectedImage m3695copygd2BlFg$default(ProtectedImage protectedImage, byte[] bArr, int i, int i2, EncodedImage encodedImage, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bArr = protectedImage.png;
        }
        if ((i3 & 2) != 0) {
            i = protectedImage.width;
        }
        if ((i3 & 4) != 0) {
            i2 = protectedImage.height;
        }
        if ((i3 & 8) != 0) {
            encodedImage = protectedImage.encoded;
        }
        C7384Etj.A0Y(bArr, 0);
        return new ProtectedImage(bArr, i, i2, encodedImage);
    }

    public final byte[] component1() {
        return this.png;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3696component2pVg5ArA() {
        return this.width;
    }

    /* renamed from: component3-pVg5ArA, reason: not valid java name */
    public final int m3697component3pVg5ArA() {
        return this.height;
    }

    public final EncodedImage component4() {
        return this.encoded;
    }

    public final EncodedImage getEncoded() {
        return this.encoded;
    }

    /* renamed from: getHeight-pVg5ArA, reason: not valid java name */
    public final int m3699getHeightpVg5ArA() {
        return this.height;
    }

    public final byte[] getPng() {
        return this.png;
    }

    /* renamed from: getWidth-pVg5ArA, reason: not valid java name */
    public final int m3700getWidthpVg5ArA() {
        return this.width;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.png) * 31) + this.width) * 31) + this.height) * 31) + AnonymousClass006.A0D(this.encoded);
    }

    public final void setEncoded(EncodedImage encodedImage) {
        this.encoded = encodedImage;
    }

    /* renamed from: setHeight-WZ4Q5Ns, reason: not valid java name */
    public final void m3701setHeightWZ4Q5Ns(int i) {
        this.height = i;
    }

    /* renamed from: setWidth-WZ4Q5Ns, reason: not valid java name */
    public final void m3702setWidthWZ4Q5Ns(int i) {
        this.width = i;
    }

    public String toString() {
        String string = Arrays.toString(this.png);
        String strValueOf = String.valueOf(BV4.A03(this.width));
        String strValueOf2 = String.valueOf(BV4.A03(this.height));
        EncodedImage encodedImage = this.encoded;
        StringBuilder sbA0x = C3cI.A0x("ProtectedImage(png=", string);
        sbA0x.append(", width=");
        sbA0x.append(strValueOf);
        sbA0x.append(", height=");
        sbA0x.append(strValueOf2);
        return C3cJ.A0L(encodedImage, ", encoded=", sbA0x);
    }

    public /* synthetic */ ProtectedImage(byte[] bArr, int i, int i2, EncodedImage encodedImage, C06H c06h) {
        this(bArr, i, i2, encodedImage);
    }
}
