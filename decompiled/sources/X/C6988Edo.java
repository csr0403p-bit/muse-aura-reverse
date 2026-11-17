package X;

import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Edo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6988Edo implements InterfaceC7060Ef7, Closeable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorSpace A06;
    public C7003Ee6 A07;
    public EUs A08;
    public String A09;
    public boolean A0A;
    public final InterfaceC7005EeA<FileInputStream> A0B;
    public final EfF A0C;
    public final Map<String, Object> A0D;

    public static final int A00(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw BV4.A0K("no more bytes");
            }
            if (z) {
                i2 = (i5 & 255) << (i4 * 8);
            } else {
                i3 <<= 8;
                i2 = i5 & 255;
            }
            i3 |= i2;
        }
        return i3;
    }

    public static final boolean A05(byte[] bArr, String str) {
        if (4 == str.length()) {
            Iterable aDq = new ADq(0, 3);
            if (!(aDq instanceof Collection) || !((Collection) aDq).isEmpty()) {
                Iterator<Integer> it = aDq.iterator();
                while (it.hasNext()) {
                    int iA00 = ((BNt) it).A00();
                    if (((byte) str.charAt(iA00)) != bArr[iA00]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A09() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.EfF r0 = r2.A0C     // Catch: java.lang.Throwable -> L11
            boolean r0 = X.EfF.A01(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Le
            X.EeA<java.io.FileInputStream> r1 = r2.A0B     // Catch: java.lang.Throwable -> L11
            r0 = 0
            if (r1 == 0) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6988Edo.A09():boolean");
    }

    public static final C6988Edo A01(C6988Edo c6988Edo) throws IOException {
        C6988Edo c6988Edo2;
        InterfaceC7005EeA<FileInputStream> interfaceC7005EeA = c6988Edo.A0B;
        if (interfaceC7005EeA != null) {
            c6988Edo2 = new C6988Edo(interfaceC7005EeA, c6988Edo.A04);
        } else {
            EfF efFA0G = BV5.A0G(c6988Edo.A0C);
            if (efFA0G == null) {
                return null;
            }
            try {
                c6988Edo2 = new C6988Edo(efFA0G);
            } finally {
                efFA0G.close();
            }
        }
        c6988Edo2.A08(c6988Edo);
        return c6988Edo2;
    }

    public static void A03(C6988Edo c6988Edo) throws IOException {
        if (c6988Edo.A05 < 0 || c6988Edo.A01 < 0) {
            A02(c6988Edo);
        }
    }

    public static boolean A04(C6988Edo c6988Edo) throws IOException {
        F0O<Integer> f0o = AbstractC6992Edt.A00;
        A03(c6988Edo);
        return f0o.contains(Integer.valueOf(c6988Edo.A00));
    }

    public final int A06() {
        EfF efF = this.A0C;
        if (efF == null) {
            return this.A04;
        }
        efF.A04();
        return ((C6986Edm) efF.A04()).A03();
    }

    public final InputStream A07() {
        InterfaceC7005EeA<FileInputStream> interfaceC7005EeA = this.A0B;
        if (interfaceC7005EeA != null) {
            return interfaceC7005EeA.get();
        }
        EfF efFA0G = BV5.A0G(this.A0C);
        if (efFA0G == null) {
            return null;
        }
        try {
            return new C6993Edu((C6986Edm) efFA0G.A04());
        } finally {
            efFA0G.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EfF efF = this.A0C;
        if (efF != null) {
            efF.close();
        }
    }

    @Override // X.InterfaceC7060Ef7
    public final <T> T getExtra(String str) {
        return (T) this.A0D.get(str);
    }

    @Override // X.InterfaceC7060Ef7
    public final Map<String, Object> getExtras() {
        return this.A0D;
    }

    @Override // X.InterfaceC7060Ef7
    public final void putExtra(String str, Object obj) {
        this.A0D.put(str, obj);
    }

    @Override // X.InterfaceC7060Ef7
    public final void putExtras(Map<String, ?> map) {
        if (map != null) {
            this.A0D.putAll(map);
        }
    }

    public C6988Edo(EfF efF) {
        this.A07 = C7003Ee6.A02;
        this.A02 = -1;
        this.A00 = 0;
        this.A05 = -1;
        this.A01 = -1;
        this.A03 = 1;
        this.A04 = -1;
        this.A0D = BV4.A0u();
        BeS.A05(EfF.A01(efF));
        this.A0C = efF.clone();
        this.A0B = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [android.graphics.ColorSpace] */
    public static void A02(C6988Edo c6988Edo) throws IOException {
        HxE hxEA0p;
        ColorSpace colorSpaceA0b;
        int iA00;
        int iA002;
        Class<DVS> cls;
        String str;
        C7003Ee6 c7003Ee6A00 = C6991Eds.A00(c6988Edo.A07());
        c6988Edo.A07 = c7003Ee6A00;
        boolean z = false;
        C7384Etj.A0Y(c7003Ee6A00, 0);
        AbstractC7008EeF.A00.get(c7003Ee6A00);
        if (c7003Ee6A00 == AbstractC6994Edv.A0D || c7003Ee6A00 == AbstractC6994Edv.A0C || c7003Ee6A00 == AbstractC6994Edv.A0A || c7003Ee6A00 == AbstractC6994Edv.A0B || c7003Ee6A00 == AbstractC6994Edv.A09) {
            InputStream inputStreamA07 = c6988Edo.A07();
            if (inputStreamA07 == null) {
                hxEA0p = null;
            } else {
                byte[] bArr = new byte[4];
                hxEA0p = null;
                try {
                    try {
                        inputStreamA07.read(bArr);
                        if (A05(bArr, "RIFF")) {
                            inputStreamA07.read();
                            inputStreamA07.read();
                            inputStreamA07.read();
                            inputStreamA07.read();
                            inputStreamA07.read(bArr);
                            if (A05(bArr, "WEBP")) {
                                inputStreamA07.read(bArr);
                                StringBuilder sbA0w = C60O.A0w();
                                int i = 0;
                                do {
                                    sbA0w.append((char) (bArr[i] & 65535));
                                    i++;
                                } while (i < 4);
                                String string = sbA0w.toString();
                                int iHashCode = string.hashCode();
                                if (iHashCode == 2640674) {
                                    boolean zEquals = string.equals("VP8 ");
                                    colorSpaceA0b = string;
                                    if (zEquals) {
                                        inputStreamA07.skip(7L);
                                        int i2 = inputStreamA07.read() & 255;
                                        int i3 = inputStreamA07.read() & 255;
                                        int i4 = inputStreamA07.read() & 255;
                                        colorSpaceA0b = i3;
                                        if (i2 == 157) {
                                            colorSpaceA0b = i3;
                                            if (i3 == 1) {
                                                colorSpaceA0b = i3;
                                                if (i4 == 42) {
                                                    Integer numValueOf = Integer.valueOf(((inputStreamA07.read() & 255) << 8) | (inputStreamA07.read() & 255));
                                                    hxEA0p = AnonymousClass002.A0p(numValueOf, ((inputStreamA07.read() & 255) << 8) | (inputStreamA07.read() & 255));
                                                    colorSpaceA0b = numValueOf;
                                                }
                                            }
                                        }
                                    }
                                } else if (iHashCode != 2640718) {
                                    colorSpaceA0b = string;
                                    if (iHashCode == 2640730) {
                                        boolean zEquals2 = string.equals("VP8X");
                                        colorSpaceA0b = string;
                                        if (zEquals2) {
                                            inputStreamA07.skip(8L);
                                            Integer numValueOf2 = Integer.valueOf((((inputStreamA07.read() & 255) << 16) | ((inputStreamA07.read() & 255) << 8) | (inputStreamA07.read() & 255)) + 1);
                                            int i5 = inputStreamA07.read() & 255;
                                            int i6 = inputStreamA07.read() & 255;
                                            hxEA0p = AnonymousClass002.A0p(numValueOf2, (((inputStreamA07.read() & 255) << 16) | (i6 << 8) | i5) + 1);
                                            colorSpaceA0b = i6;
                                        }
                                    }
                                } else {
                                    boolean zEquals3 = string.equals("VP8L");
                                    colorSpaceA0b = string;
                                    if (zEquals3) {
                                        inputStreamA07.read();
                                        inputStreamA07.read();
                                        inputStreamA07.read();
                                        inputStreamA07.read();
                                        colorSpaceA0b = string;
                                        if ((inputStreamA07.read() & 255) == 47) {
                                            int i7 = inputStreamA07.read() & 255;
                                            int i8 = inputStreamA07.read();
                                            int i9 = (i7 | ((i8 & 63) << 8)) + 1;
                                            hxEA0p = AnonymousClass002.A0p(Integer.valueOf(i9), (((inputStreamA07.read() & 15) << 10) | ((inputStreamA07.read() & 255) << 2) | ((i8 & 192) >> 6)) + 1);
                                            colorSpaceA0b = i9;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        inputStreamA07.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    if (hxEA0p != null) {
                        c6988Edo.A05 = AnonymousClass001.A0F(hxEA0p.first);
                        c6988Edo.A01 = AnonymousClass001.A0F(hxEA0p.second);
                    }
                } catch (Throwable th) {
                    try {
                        inputStreamA07.close();
                        throw th;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        throw th;
                    }
                }
            }
        } else {
            try {
                InputStream inputStreamA072 = c6988Edo.A07();
                try {
                    if (inputStreamA072 == null) {
                        throw BV4.A0U();
                    }
                    F0C f0c = AbstractC7386Etn.A00;
                    ByteBuffer byteBufferAllocate = (ByteBuffer) ((C3110ByZ) f0c.getValue()).A2t();
                    if (byteBufferAllocate == null) {
                        byteBufferAllocate = ByteBuffer.allocate(16384);
                        C7384Etj.A0U(byteBufferAllocate);
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    try {
                        options.inTempStorage = byteBufferAllocate.array();
                        BitmapFactory.decodeStream(inputStreamA072, null, options);
                        colorSpaceA0b = options.outColorSpace;
                        int i10 = options.outWidth;
                        int i11 = options.outHeight;
                        hxEA0p = (i10 == -1 || i11 == -1) ? null : AnonymousClass002.A0p(Integer.valueOf(i10), i11);
                        ((C3110ByZ) f0c.getValue()).AaC(byteBufferAllocate);
                        c6988Edo.A06 = colorSpaceA0b;
                        if (hxEA0p != null) {
                            c6988Edo.A05 = BV6.A07(hxEA0p.first);
                            c6988Edo.A01 = BV6.A07(hxEA0p.second);
                        }
                        try {
                            inputStreamA072.close();
                        } catch (IOException unused) {
                        }
                    } catch (Throwable th2) {
                        ((C3110ByZ) f0c.getValue()).AaC(byteBufferAllocate);
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c7003Ee6A00 == AbstractC6994Edv.A07 && c6988Edo.A02 == -1) {
            if (hxEA0p == null) {
                return;
            }
            InputStream inputStreamA073 = c6988Edo.A07();
            colorSpaceA0b = 0;
            colorSpaceA0b = 0;
            colorSpaceA0b = 0;
            colorSpaceA0b = 0;
            colorSpaceA0b = 0;
            colorSpaceA0b = 0;
            colorSpaceA0b = 0;
            C7384Etj.A0Y(inputStreamA073, 0);
            while (true) {
                if (A00(inputStreamA073, 1, false) != 255) {
                    break;
                }
                do {
                    iA002 = A00(inputStreamA073, 1, false);
                } while (iA002 == 255);
                if (iA002 == 225) {
                    int iA003 = A00(inputStreamA073, 2, false);
                    if (iA003 - 2 > 6) {
                        int iA004 = A00(inputStreamA073, 4, false);
                        int iA005 = A00(inputStreamA073, 2, false);
                        int i12 = iA003 - 8;
                        if (iA004 == 1165519206 && iA005 == 0 && i12 != 0) {
                            int iA006 = 0;
                            if (i12 > 8) {
                                int iA007 = A00(inputStreamA073, 4, false);
                                if (iA007 != 1229531648) {
                                    if (iA007 != 1296891946) {
                                        cls = DVS.class;
                                        str = "Invalid TIFF header";
                                    }
                                    AbstractC3422CMk.A00(cls, str);
                                } else {
                                    z = true;
                                }
                                int iA008 = A00(inputStreamA073, 4, z);
                                int i13 = i12 - 8;
                                if (iA008 < 8 || iA008 - 8 > i13) {
                                    cls = DVS.class;
                                    str = "Invalid offset";
                                    AbstractC3422CMk.A00(cls, str);
                                } else {
                                    int i14 = iA008 - 8;
                                    if (i13 != 0 && i14 <= i13) {
                                        inputStreamA073.skip(i14);
                                        int i15 = i13 - i14;
                                        if (i15 >= 14) {
                                            int iA009 = A00(inputStreamA073, 2, z);
                                            int i16 = i15 - 2;
                                            while (true) {
                                                int i17 = iA009 - 1;
                                                if (iA009 <= 0 || i16 < 12) {
                                                    break;
                                                }
                                                int i18 = i16 - 2;
                                                if (A00(inputStreamA073, 2, z) != 274) {
                                                    inputStreamA073.skip(10L);
                                                    i16 -= 12;
                                                    iA009 = i17;
                                                } else if (i18 >= 10 && A00(inputStreamA073, 2, z) == 3 && A00(inputStreamA073, 4, z) == 1) {
                                                    iA006 = A00(inputStreamA073, 2, z);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            colorSpaceA0b = iA006;
                        }
                    }
                } else if (iA002 != 1 && iA002 != 216) {
                    if (iA002 == 217 || iA002 == 218) {
                        break;
                    } else {
                        inputStreamA073.skip(A00(inputStreamA073, 2, false) - 2);
                    }
                }
            }
        } else {
            if (c7003Ee6A00 != AbstractC6994Edv.A05 || c6988Edo.A02 != -1) {
                if (c6988Edo.A02 == -1) {
                    iA00 = 0;
                    c6988Edo.A02 = iA00;
                }
                return;
            }
            InputStream inputStreamA074 = c6988Edo.A07();
            colorSpaceA0b = 0;
            if (inputStreamA074 != null) {
                colorSpaceA0b = new BqQ(inputStreamA074).A0b("Orientation", 1);
            }
        }
        c6988Edo.A00 = colorSpaceA0b;
        iA00 = DVS.A00(colorSpaceA0b);
        c6988Edo.A02 = iA00;
    }

    public final void A08(C6988Edo c6988Edo) throws IOException {
        A03(c6988Edo);
        this.A07 = c6988Edo.A07;
        A03(c6988Edo);
        this.A05 = c6988Edo.A05;
        A03(c6988Edo);
        this.A01 = c6988Edo.A01;
        A03(c6988Edo);
        this.A02 = c6988Edo.A02;
        A03(c6988Edo);
        this.A00 = c6988Edo.A00;
        this.A03 = c6988Edo.A03;
        this.A04 = c6988Edo.A06();
        this.A08 = c6988Edo.A08;
        A03(c6988Edo);
        this.A06 = c6988Edo.A06;
        this.A0A = c6988Edo.A0A;
        putExtras(c6988Edo.A0D);
    }

    public C6988Edo(InterfaceC7005EeA<FileInputStream> interfaceC7005EeA, int i) {
        this.A07 = C7003Ee6.A02;
        this.A02 = -1;
        this.A00 = 0;
        this.A05 = -1;
        this.A01 = -1;
        this.A03 = 1;
        this.A04 = -1;
        this.A0D = BV4.A0u();
        this.A0C = null;
        this.A0B = interfaceC7005EeA;
        this.A04 = i;
    }
}
