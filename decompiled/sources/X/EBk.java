package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class EBk implements InterfaceC6304E0a {
    public static final byte[] A07 = {0, 7, 8, 15};
    public static final byte[] A08 = {0, 119, -120, -1};
    public static final byte[] A09 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final EBq A04;
    public final EBo A05;
    public final EBl A06;

    public static EBq A00(C6340E1q c6340E1q, int i) {
        int[] iArr;
        int iA08;
        int iA082;
        int iA083;
        int iA084;
        int iA085 = c6340E1q.A08(8);
        c6340E1q.A0C(8);
        int i2 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrA03 = A03();
        int[] iArrA04 = A04();
        while (i2 > 0) {
            int iA086 = c6340E1q.A08(8);
            int iA087 = c6340E1q.A08(8);
            if ((iA087 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = iArrA04;
                if ((iA087 & 64) != 0) {
                    iArr = iArrA03;
                }
            }
            if ((iA087 & 1) != 0) {
                iA08 = c6340E1q.A08(8);
                iA082 = c6340E1q.A08(8);
                iA083 = c6340E1q.A08(8);
                iA084 = c6340E1q.A08(8);
                i2 -= 6;
            } else {
                iA08 = c6340E1q.A08(6) << 2;
                iA082 = c6340E1q.A08(4) << 4;
                iA083 = c6340E1q.A08(4) << 4;
                iA084 = c6340E1q.A08(2) << 6;
                i2 -= 4;
            }
            if (iA08 == 0) {
                iA082 = 0;
                iA083 = 0;
                iA084 = 255;
            }
            double d = iA08;
            double d2 = iA082 - 128;
            double d3 = iA083 - 128;
            iArr[iA086] = (((byte) (255 - (iA084 & 255))) << 24) | (BV5.A02((int) (d + (1.402d * d2)), 255, 0) << 16) | (BV5.A02((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255, 0) << 8) | BV5.A02((int) (d + (d3 * 1.772d)), 255, 0);
        }
        return new EBq(iArr2, iArrA03, iArrA04, iA085);
    }

    public static EBp A01(C6340E1q c6340E1q) {
        int iA08 = c6340E1q.A08(16);
        c6340E1q.A0C(4);
        int iA082 = c6340E1q.A08(2);
        boolean zA0I = c6340E1q.A0I();
        c6340E1q.A0C(1);
        byte[] bArr = Util.A07;
        byte[] bArr2 = bArr;
        if (iA082 == 1) {
            c6340E1q.A0C(c6340E1q.A08(8) * 16);
        } else if (iA082 == 0) {
            int iA083 = c6340E1q.A08(16);
            int iA084 = c6340E1q.A08(16);
            if (iA083 > 0) {
                bArr = new byte[iA083];
                c6340E1q.A0G(bArr, iA083);
            }
            if (iA084 > 0) {
                bArr2 = new byte[iA084];
                c6340E1q.A0G(bArr2, iA084);
            } else {
                bArr2 = bArr;
            }
        }
        return new EBp(bArr, bArr2, iA08, zA0I);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x013e A[PHI: r0 r10 r14
  0x013e: PHI (r0v20 int) = (r0v13 int), (r0v17 int), (r0v27 int) binds: [B:112:0x01a6, B:98:0x0177, B:85:0x013d] A[DONT_GENERATE, DONT_INLINE]
  0x013e: PHI (r10v10 int) = (r10v1 int), (r10v7 int), (r10v11 int) binds: [B:112:0x01a6, B:98:0x0177, B:85:0x013d] A[DONT_GENERATE, DONT_INLINE]
  0x013e: PHI (r14v9 boolean) = (r14v1 boolean), (r14v5 boolean), (r14v10 boolean) binds: [B:112:0x01a6, B:98:0x0177, B:85:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.graphics.Canvas r23, android.graphics.Paint r24, byte[] r25, int[] r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EBk.A02(android.graphics.Canvas, android.graphics.Paint, byte[], int[], int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r4 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A03() {
        /*
            r7 = 16
            int[] r6 = new int[r7]
            r0 = 0
            r6[r0] = r0
            r5 = 1
        L8:
            r4 = 255(0xff, float:3.57E-43)
        La:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L11
            r3 = 255(0xff, float:3.57E-43)
        L11:
            r0 = r5 & 4
            r2 = 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L18
        L17:
            r2 = 0
        L18:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r4 << 16
            r1 = r1 | r0
            int r0 = r3 << 8
            r1 = r1 | r0
            r1 = r1 | r2
            r6[r5] = r1
            int r5 = r5 + 1
            if (r5 >= r7) goto L44
            r1 = 8
            r0 = r5 & 1
            if (r5 >= r1) goto L31
            r4 = 0
            if (r0 == 0) goto La
            goto L8
        L31:
            r2 = 127(0x7f, float:1.78E-43)
            r4 = 0
            if (r0 == 0) goto L38
            r4 = 127(0x7f, float:1.78E-43)
        L38:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L3f
            r3 = 127(0x7f, float:1.78E-43)
        L3f:
            r0 = r5 & 4
            if (r0 == 0) goto L17
            goto L18
        L44:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EBk.A03():int[]");
    }

    public static int[] A04() {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i5 = 0;
        do {
            if (i5 < 8) {
                i = (i5 & 1) != 0 ? 255 : 0;
                i2 = (i5 & 2) != 0 ? 255 : 0;
                i3 = (i5 & 4) == 0 ? 0 : 255;
                i4 = 1056964608;
            } else {
                int i6 = i5 & 136;
                if (i6 == 0) {
                    i = ((i5 & 1) != 0 ? 85 : 0) + ((i5 & 16) != 0 ? 170 : 0);
                    i2 = ((i5 & 2) != 0 ? 85 : 0) + ((i5 & 32) != 0 ? 170 : 0);
                    i = (i5 & 4) == 0 ? 0 : 85;
                    if ((i5 & 64) == 0) {
                        i = 0;
                    }
                } else if (i6 != 8) {
                    if (i6 != 128) {
                        if (i6 == 136) {
                            i = ((i5 & 1) != 0 ? 43 : 0) + ((i5 & 16) != 0 ? 85 : 0);
                            i2 = ((i5 & 2) != 0 ? 43 : 0) + ((i5 & 32) != 0 ? 85 : 0);
                            if ((i5 & 4) == 0) {
                                i = 0;
                            }
                        }
                        i5++;
                    } else {
                        i = ((i5 & 1) != 0 ? 43 : 0) + 127 + ((i5 & 16) != 0 ? 85 : 0);
                        i2 = ((i5 & 2) != 0 ? 43 : 0) + 127 + ((i5 & 32) != 0 ? 85 : 0);
                        i = ((i5 & 4) == 0 ? 0 : 43) + 127;
                    }
                    if ((i5 & 64) == 0) {
                        i = 0;
                    }
                } else {
                    i = ((i5 & 1) != 0 ? 85 : 0) + ((i5 & 16) != 0 ? 170 : 0);
                    i2 = ((i5 & 2) != 0 ? 85 : 0) + ((i5 & 32) != 0 ? 170 : 0);
                    i3 = ((i5 & 4) == 0 ? 0 : 85) + ((i5 & 64) == 0 ? 0 : 170);
                    i4 = 2130706432;
                }
                i3 = i + i;
                i4 = -16777216;
            }
            iArr[i5] = i4 | (i << 16) | (i2 << 8) | i3;
            i5++;
        } while (i5 < 256);
        return iArr;
    }

    /* JADX WARN: Incorrect types in method signature: ([BIILX/E03;LX/Dgn<LX/E00;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [X.EBm] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v9, types: [X.EBq] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [com.google.common.collect.ImmutableList] */
    @Override // X.InterfaceC6304E0a
    public final void AXd(InterfaceC5344Dgn interfaceC5344Dgn, E03 e03, byte[] bArr, int i, int i2) {
        List listA0h;
        int[] iArr;
        int i3;
        int iA08;
        int iA082;
        int iA083;
        int iA084;
        SparseArray sparseArray;
        EBp eBp;
        int i4;
        ?? r14;
        EBp eBp2;
        EBm eBm;
        C6340E1q c6340E1q = new C6340E1q();
        c6340E1q.A03 = bArr;
        c6340E1q.A01 = i2 + i;
        c6340E1q.A0B(i);
        while (c6340E1q.A06() >= 48 && c6340E1q.A08(8) == 15) {
            EBl eBl = this.A06;
            int iA085 = c6340E1q.A08(8);
            int iA086 = c6340E1q.A08(16);
            int iA087 = c6340E1q.A08(16);
            int iA07 = c6340E1q.A07() + iA087;
            if (iA087 * 8 > c6340E1q.A06()) {
                CNC.A04("DvbParser", "Data field length exceeds limit");
                c6340E1q.A0C(c6340E1q.A06());
            } else {
                switch (iA085) {
                    case 16:
                        if (iA086 == eBl.A03) {
                            EBn eBn = eBl.A01;
                            c6340E1q.A08(8);
                            int iA088 = c6340E1q.A08(4);
                            int iA089 = c6340E1q.A08(2);
                            c6340E1q.A0C(2);
                            int i5 = iA087 - 2;
                            SparseArray sparseArrayA0B = BV4.A0B();
                            while (i5 > 0) {
                                i5 -= 6;
                                sparseArrayA0B.put(c6340E1q.A08(8), new EBs(C6340E1q.A01(c6340E1q, 8, 16), c6340E1q.A08(16)));
                            }
                            EBn eBn2 = new EBn(sparseArrayA0B, iA088, iA089);
                            if (eBn2.A00 != 0) {
                                eBl.A01 = eBn2;
                                eBl.A08.clear();
                                eBl.A06.clear();
                                eBl.A07.clear();
                                break;
                            } else if (eBn != null && eBn.A01 != eBn2.A01) {
                                eBl.A01 = eBn2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        EBn eBn3 = eBl.A01;
                        if (iA086 == eBl.A03 && eBn3 != null) {
                            int iA0810 = c6340E1q.A08(8);
                            boolean zA05 = C6340E1q.A05(c6340E1q, 4);
                            int iA01 = C6340E1q.A01(c6340E1q, 3, 16);
                            int iA0811 = c6340E1q.A08(16);
                            c6340E1q.A08(3);
                            int iA0812 = c6340E1q.A08(3);
                            int iA012 = C6340E1q.A01(c6340E1q, 2, 8);
                            int iA0813 = c6340E1q.A08(8);
                            int iA0814 = c6340E1q.A08(4);
                            int iA0815 = c6340E1q.A08(2);
                            c6340E1q.A0C(2);
                            int i6 = iA087 - 10;
                            SparseArray sparseArrayA0B2 = BV4.A0B();
                            while (i6 > 0) {
                                int iA0816 = c6340E1q.A08(16);
                                int iA0817 = c6340E1q.A08(2);
                                c6340E1q.A08(2);
                                int iA0818 = c6340E1q.A08(12);
                                int iA013 = C6340E1q.A01(c6340E1q, 4, 12);
                                int i7 = i6 - 6;
                                if (iA0817 == 1 || iA0817 == 2) {
                                    c6340E1q.A08(8);
                                    c6340E1q.A08(8);
                                    i6 -= 8;
                                } else {
                                    i6 = i7;
                                }
                                sparseArrayA0B2.put(iA0816, new EBr(iA0818, iA013));
                            }
                            ?? eBm2 = new EBm(sparseArrayA0B2, iA0810, iA01, iA0811, iA0812, iA012, iA0813, iA0814, iA0815, zA05);
                            if (eBn3.A00 == 0 && (eBm = eBl.A08.get(eBm2.A03)) != null) {
                                SparseArray<EBr> sparseArray2 = eBm.A08;
                                for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
                                    eBm2.A08.put(sparseArray2.keyAt(i8), sparseArray2.valueAt(i8));
                                }
                            }
                            sparseArray = eBl.A08;
                            i4 = eBm2.A03;
                            eBp2 = eBm2;
                            sparseArray.put(i4, eBp2);
                            break;
                        }
                        break;
                    case 18:
                        if (iA086 == eBl.A03) {
                            EBq eBqA00 = A00(c6340E1q, iA087);
                            sparseArray = eBl.A06;
                            r14 = eBqA00;
                        } else if (iA086 == eBl.A02) {
                            EBq eBqA002 = A00(c6340E1q, iA087);
                            sparseArray = eBl.A04;
                            r14 = eBqA002;
                        }
                        i4 = r14.A00;
                        eBp2 = r14;
                        sparseArray.put(i4, eBp2);
                        break;
                    case 19:
                        if (iA086 == eBl.A03) {
                            EBp eBpA01 = A01(c6340E1q);
                            sparseArray = eBl.A07;
                            eBp = eBpA01;
                        } else if (iA086 == eBl.A02) {
                            EBp eBpA012 = A01(c6340E1q);
                            sparseArray = eBl.A05;
                            eBp = eBpA012;
                        }
                        i4 = eBp.A00;
                        eBp2 = eBp;
                        sparseArray.put(i4, eBp2);
                        break;
                    case 20:
                        if (iA086 == eBl.A03) {
                            boolean zA052 = C6340E1q.A05(c6340E1q, 4);
                            int iA014 = C6340E1q.A01(c6340E1q, 3, 16);
                            int iA0819 = c6340E1q.A08(16);
                            if (zA052) {
                                iA083 = c6340E1q.A08(16);
                                iA08 = c6340E1q.A08(16);
                                iA084 = c6340E1q.A08(16);
                                iA082 = c6340E1q.A08(16);
                            } else {
                                iA08 = iA014;
                                iA082 = iA0819;
                                iA083 = 0;
                                iA084 = 0;
                            }
                            eBl.A00 = new EBo(iA014, iA0819, iA083, iA08, iA084, iA082);
                            break;
                        }
                        break;
                }
                c6340E1q.A0D(iA07 - c6340E1q.A07());
            }
        }
        EBl eBl2 = this.A06;
        EBn eBn4 = eBl2.A01;
        if (eBn4 == null) {
            listA0h = ImmutableList.of();
        } else {
            EBo eBo = eBl2.A00;
            if (eBo == null) {
                eBo = this.A05;
            }
            Bitmap bitmap = this.A00;
            if (bitmap == null || eBo.A05 + 1 != bitmap.getWidth() || eBo.A00 + 1 != this.A00.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(eBo.A05 + 1, eBo.A00 + 1, Bitmap.Config.ARGB_8888);
                this.A00 = bitmapCreateBitmap;
                this.A01.setBitmap(bitmapCreateBitmap);
            }
            listA0h = C3cG.A0h();
            SparseArray<EBs> sparseArray3 = eBn4.A02;
            for (int i9 = 0; i9 < sparseArray3.size(); i9++) {
                Canvas canvas = this.A01;
                canvas.save();
                EBs eBsValueAt = sparseArray3.valueAt(i9);
                EBm eBm3 = eBl2.A08.get(sparseArray3.keyAt(i9));
                int i10 = eBsValueAt.A00 + eBo.A02;
                int i11 = eBsValueAt.A01 + eBo.A04;
                canvas.clipRect(i10, i11, Math.min(eBm3.A07 + i10, eBo.A01), Math.min(eBm3.A02 + i11, eBo.A03));
                EBq eBq = eBl2.A06.get(eBm3.A00);
                if (eBq == null && (eBq = eBl2.A04.get(eBm3.A00)) == null) {
                    eBq = this.A04;
                }
                SparseArray<EBr> sparseArray4 = eBm3.A08;
                for (int i12 = 0; i12 < sparseArray4.size(); i12++) {
                    int iKeyAt = sparseArray4.keyAt(i12);
                    EBr eBrValueAt = sparseArray4.valueAt(i12);
                    EBp eBp3 = eBl2.A07.get(iKeyAt);
                    if (eBp3 != null || (eBp3 = eBl2.A05.get(iKeyAt)) != null) {
                        Paint paint = eBp3.A01 ? null : this.A02;
                        int i13 = eBm3.A01;
                        int i14 = eBrValueAt.A00 + i10;
                        int i15 = eBrValueAt.A01 + i11;
                        Paint paint2 = paint;
                        int[] iArr2 = i13 == 3 ? eBq.A03 : i13 == 2 ? eBq.A02 : eBq.A01;
                        A02(canvas, paint2, eBp3.A03, iArr2, i13, i14, i15);
                        A02(canvas, paint2, eBp3.A02, iArr2, i13, i14, i15 + 1);
                    }
                }
                if (eBm3.A09) {
                    if (eBm3.A01 == 3) {
                        iArr = eBq.A03;
                        i3 = eBm3.A06;
                    } else if (eBm3.A01 == 2) {
                        iArr = eBq.A02;
                        i3 = eBm3.A05;
                    } else {
                        iArr = eBq.A01;
                        i3 = eBm3.A04;
                    }
                    int i16 = iArr[i3];
                    Paint paint3 = this.A03;
                    paint3.setColor(i16);
                    canvas.drawRect(i10, i11, eBm3.A07 + i10, eBm3.A02 + i11, paint3);
                }
                Bitmap bitmap2 = this.A00;
                int i17 = eBm3.A07;
                int i18 = eBm3.A02;
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2, i10, i11, i17, i18);
                float f = i10;
                float f2 = eBo.A05;
                float f3 = eBo.A00;
                listA0h.add(new E0J(bitmapCreateBitmap2, null, null, null, i11 / f3, f / f2, -3.4028235E38f, i17 / f2, i18 / f3, 0.0f, 0, 0, 0, Integer.MIN_VALUE, -16777216, Integer.MIN_VALUE, 0, false));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
            }
        }
        InterfaceC5344Dgn.A00(interfaceC5344Dgn, listA0h);
    }

    @Override // X.InterfaceC6304E0a
    public final void reset() {
        EBl eBl = this.A06;
        eBl.A08.clear();
        eBl.A06.clear();
        eBl.A07.clear();
        eBl.A04.clear();
        eBl.A05.clear();
        eBl.A00 = null;
        eBl.A01 = null;
    }

    public EBk(List<byte[]> list) {
        char[] cArr = E1P.A04;
        E1P e1pA0Z = BV6.A0Z(list.get(0));
        int iA0D = e1pA0Z.A0D();
        int iA0D2 = e1pA0Z.A0D();
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new EBo(719, 575, 0, 719, 0, 575);
        this.A04 = new EBq(new int[]{0, -1, -16777216, -8421505}, A03(), A04(), 0);
        this.A06 = new EBl(iA0D, iA0D2);
    }

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ E0T AXf(byte[] bArr, int i, int i2) {
        return E0e.A00(this, bArr, i, i2);
    }
}
