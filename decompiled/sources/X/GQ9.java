package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes6.dex */
public final class GQ9 {
    public final GQA A00;
    public final GQA A01;
    public final GQA A02;
    public final GQA A03;

    public static void A00(GQ9 gq9) {
        long[] jArr;
        int i = 0;
        int i2 = 0;
        do {
            int i3 = i2 * 16;
            int i4 = i3 + 1;
            int i5 = i3 + 2;
            int i6 = i3 + 3;
            int i7 = i3 + 4;
            int i8 = i3 + 5;
            int i9 = i3 + 6;
            int i10 = i3 + 7;
            int i11 = i3 + 8;
            int i12 = i3 + 9;
            int i13 = i3 + 10;
            int i14 = i3 + 11;
            int i15 = i3 + 12;
            int i16 = i3 + 13;
            int i17 = i3 + 14;
            int i18 = i3 + 15;
            jArr = gq9.A01.A00;
            GQ6.A02(jArr, i3, i7, i11, i15);
            GQ6.A02(jArr, i4, i8, i12, i16);
            GQ6.A02(jArr, i5, i9, i13, i17);
            GQ6.A02(jArr, i6, i10, i14, i18);
            GQ6.A02(jArr, i3, i8, i13, i18);
            GQ6.A02(jArr, i4, i9, i14, i15);
            GQ6.A02(jArr, i5, i10, i11, i16);
            GQ6.A02(jArr, i6, i7, i12, i17);
            i2++;
        } while (i2 < 8);
        do {
            int i19 = i * 2;
            int i20 = i19 + 1;
            int i21 = i19 + 16;
            int i22 = i19 + 17;
            int i23 = i19 + 32;
            int i24 = i19 + 33;
            int i25 = i19 + 48;
            int i26 = i19 + 49;
            int i27 = i19 + 64;
            int i28 = i19 + 65;
            int i29 = i19 + 80;
            int i30 = i19 + 81;
            int i31 = i19 + 96;
            int i32 = i19 + 97;
            int i33 = i19 + HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i34 = i19 + 113;
            GQ6.A02(jArr, i19, i23, i27, i31);
            GQ6.A02(jArr, i20, i24, i28, i32);
            GQ6.A02(jArr, i21, i25, i29, i33);
            GQ6.A02(jArr, i22, i26, i30, i34);
            GQ6.A02(jArr, i19, i24, i29, i34);
            GQ6.A02(jArr, i20, i25, i30, i31);
            GQ6.A02(jArr, i21, i26, i27, i32);
            GQ6.A02(jArr, i22, i23, i28, i33);
            i++;
        } while (i < 8);
    }

    public GQ9(GQ8 gq8) {
        this.A00 = gq8.A00();
        this.A01 = gq8.A00();
        this.A02 = gq8.A00();
        this.A03 = gq8.A00();
    }
}
