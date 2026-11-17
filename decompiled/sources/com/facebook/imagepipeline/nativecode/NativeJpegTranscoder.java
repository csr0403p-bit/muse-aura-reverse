package com.facebook.imagepipeline.nativecode;

import X.AbstractC6992Edt;
import X.AbstractC6994Edv;
import X.AnonymousClass002;
import X.C1bk;
import X.C6988Edo;
import X.C7003Ee6;
import X.C7481Exe;
import X.C8j3;
import X.InterfaceC7026EeX;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class NativeJpegTranscoder implements InterfaceC7026EeX {
    public int mMaxBitmapSize;
    public boolean mResizingEnabled;
    public boolean mUseDownsamplingRatio;

    public static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // X.InterfaceC7026EeX
    public boolean canResize(C6988Edo c6988Edo, C1bk c1bk, C7481Exe c7481Exe) {
        if (c1bk == null) {
            c1bk = C1bk.A01;
        }
        return C8j3.A1T(AbstractC6992Edt.A00(c7481Exe, c1bk, c6988Edo, this.mResizingEnabled), 8);
    }

    @Override // X.InterfaceC7026EeX
    public boolean canTranscode(C7003Ee6 c7003Ee6) {
        return AnonymousClass002.A1Z(c7003Ee6, AbstractC6994Edv.A07);
    }

    @Override // X.InterfaceC7026EeX
    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    @Override // X.InterfaceC7026EeX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C6997Edy transcode(X.C6988Edo r9, java.io.OutputStream r10, X.C1bk r11, X.C7481Exe r12, X.C7003Ee6 r13, java.lang.Integer r14, android.graphics.ColorSpace r15) throws java.io.IOException {
        /*
            r8 = this;
            if (r14 != 0) goto L8
            r0 = 85
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L8:
            if (r11 != 0) goto Lc
            X.1bk r11 = X.C1bk.A01
        Lc:
            int r0 = r8.mMaxBitmapSize
            int r4 = X.AbstractC6995Edw.A00(r12, r11, r9, r0)
            r3 = 0
            boolean r0 = r8.mResizingEnabled     // Catch: java.lang.Throwable -> Ldb
            int r5 = X.AbstractC6992Edt.A00(r12, r11, r9, r0)     // Catch: java.lang.Throwable -> Ldb
            r6 = 8
            int r0 = r6 / r4
            r2 = 1
            int r1 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> Ldb
            boolean r0 = r8.mUseDownsamplingRatio     // Catch: java.lang.Throwable -> Ldb
            if (r0 == 0) goto L27
            r5 = r1
        L27:
            java.io.InputStream r3 = r9.A07()     // Catch: java.lang.Throwable -> Ldb
            boolean r1 = X.C6988Edo.A04(r9)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = "Cannot transcode from null input stream!"
            if (r1 == 0) goto L78
            int r7 = X.AbstractC6992Edt.A01(r11, r9)     // Catch: java.lang.Throwable -> Ldb
            if (r3 == 0) goto Ld6
            int r8 = r14.intValue()     // Catch: java.lang.Throwable -> Ldb
            X.C7007EeE.A00()     // Catch: java.lang.Throwable -> Ldb
            r1 = 0
            boolean r0 = X.BV5.A1P(r5, r2)
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            r0 = 16
            boolean r0 = X.BV7.A1S(r5, r0)
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            boolean r0 = X.C8j3.A1Q(r8)
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            r0 = 100
            boolean r0 = X.BV7.A1S(r8, r0)
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            switch(r7) {
                case 1: goto L66;
                case 2: goto L66;
                case 3: goto L66;
                case 4: goto L66;
                case 5: goto L66;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L66;
                default: goto L64;
            }     // Catch: java.lang.Throwable -> Ldb
        L64:
            r0 = 0
            goto L67
        L66:
            r0 = 1
        L67:
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            if (r5 != r6) goto L6e
            if (r7 == r2) goto L6f
        L6e:
            r1 = 1
        L6f:
            java.lang.String r0 = "no transformation requested"
            X.CVn.A04(r1, r0)     // Catch: java.lang.Throwable -> Ldb
            nativeTranscodeJpegWithExifOrientation(r3, r10, r7, r5, r8)     // Catch: java.lang.Throwable -> Ldb
            goto Lc2
        L78:
            int r8 = X.AbstractC6992Edt.A02(r11, r9)     // Catch: java.lang.Throwable -> Ldb
            if (r3 == 0) goto Ld1
            int r9 = r14.intValue()     // Catch: java.lang.Throwable -> Ldb
            X.C7007EeE.A00()     // Catch: java.lang.Throwable -> Ldb
            r7 = 0
            boolean r0 = X.BV5.A1P(r5, r2)
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            r0 = 16
            boolean r0 = X.BV7.A1S(r5, r0)
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            boolean r0 = X.C8j3.A1Q(r9)
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            r0 = 100
            boolean r0 = X.BV7.A1S(r9, r0)
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            if (r8 < 0) goto Lb1
            r0 = 270(0x10e, float:3.78E-43)
            if (r8 > r0) goto Lb1
            int r1 = r8 % 90
            r0 = 1
            if (r1 == 0) goto Lb2
        Lb1:
            r0 = 0
        Lb2:
            X.CVn.A02(r0)     // Catch: java.lang.Throwable -> Ldb
            if (r5 != r6) goto Lb9
            if (r8 == 0) goto Lba
        Lb9:
            r7 = 1
        Lba:
            java.lang.String r0 = "no transformation requested"
            X.CVn.A04(r7, r0)     // Catch: java.lang.Throwable -> Ldb
            nativeTranscodeJpeg(r3, r10, r8, r5, r9)     // Catch: java.lang.Throwable -> Ldb
        Lc2:
            X.CVO.A00(r3)
            boolean r2 = X.BV5.A1O(r4, r2)
            X.Ee6 r1 = X.AbstractC6994Edv.A07
            X.Edy r0 = new X.Edy
            r0.<init>(r1, r2)
            return r0
        Ld1:
            java.lang.NullPointerException r0 = X.BV5.A0Y(r0)     // Catch: java.lang.Throwable -> Ldb
            goto Lda
        Ld6:
            java.lang.NullPointerException r0 = X.BV5.A0Y(r0)     // Catch: java.lang.Throwable -> Ldb
        Lda:
            throw r0     // Catch: java.lang.Throwable -> Ldb
        Ldb:
            r0 = move-exception
            X.CVO.A00(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.nativecode.NativeJpegTranscoder.transcode(X.Edo, java.io.OutputStream, X.1bk, X.Exe, X.Ee6, java.lang.Integer, android.graphics.ColorSpace):X.Edy");
    }
}
