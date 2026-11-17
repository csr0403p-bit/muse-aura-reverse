package X;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DE0 implements C1J, InterfaceC4896DDp {
    public static final DEV A0G = new DEV();
    public DEC A00;
    public DDj A01;
    public DE4 A02;
    public final int A03;
    public final int A04;
    public final DE9 A05;
    public final DEV A06;
    public final DDU A07;
    public final CXO A08;
    public final C3159C0h A09;
    public final String A0A;
    public final boolean A0B;
    public final AtomicReference<DE4> A0C;
    public final boolean A0D;
    public final boolean A0E;
    public volatile C1J A0F;

    public static final int A00(C1O c1o, C4906DDz c4906DDz, DE0 de0, String str, String str2) {
        int i;
        byte[] bArr;
        boolean z;
        int i2;
        List listA0z;
        C1O c1oA01 = de0.A01(c1o, str, str2, true);
        C3159C0h c3159C0h = de0.A09;
        Uri uri = c1o.A06;
        DDj dDj = c4906DDz.A02;
        if (dDj != null) {
            dDj.AWl(c1oA01, DEK.NOT_CACHED);
        }
        synchronized (c4906DDz) {
            c4906DDz.A03 = null;
            ((DE1) c4906DDz).A01 = -1;
            ((DE1) c4906DDz).A00 = -1;
            c4906DDz.A00 = -1;
            c4906DDz.A05 = true;
        }
        CXK cxkCreateInstance = c4906DDz.A0A.createInstance(c4906DDz.A0C, c4906DDz.A02, c4906DDz.A0B, c4906DDz.A07, c4906DDz.A08, c3159C0h);
        try {
            long jOpen = cxkCreateInstance.open(c1oA01);
            synchronized (c4906DDz) {
                c4906DDz.A03(c4906DDz.A02);
                int i3 = (int) jOpen;
                ((DE1) c4906DDz).A01 = i3;
                c4906DDz.A04 = AnonymousClass002.A1Q(i3, -1);
                CXK cxk = ((DE1) c4906DDz).A02;
                if (cxk != null && (listA0z = BV4.A0z("X-FB-Video-Livehead", cxk.getResponseHeaders())) != null && !listA0z.isEmpty()) {
                    c4906DDz.A04 = true;
                }
                ((DE1) c4906DDz).A00 = 0;
                i = ((DE1) c4906DDz).A01;
                int i4 = ((DE1) c4906DDz).A04;
                if (i > i4 || i < 0) {
                    i = i4;
                }
                bArr = new byte[i];
                ((DE1) c4906DDz).A02 = cxkCreateInstance;
                ((DE1) c4906DDz).A03 = bArr;
                z = c4906DDz.A0D;
                if (z && i == 0) {
                    c4906DDz.A0E = bArr;
                }
                c4906DDz.notifyAll();
            }
            boolean z2 = false;
            while (c4906DDz.A05 && (i2 = ((DE1) c4906DDz).A00) < i && !z2) {
                int i5 = cxkCreateInstance.read(bArr, i2, i - i2);
                synchronized (c4906DDz) {
                    if (i5 < 0) {
                        ((DE1) c4906DDz).A01 = ((DE1) c4906DDz).A00;
                        if (z) {
                            c4906DDz.A0E = ((DE1) c4906DDz).A03;
                        }
                        z2 = true;
                    } else {
                        int i6 = ((DE1) c4906DDz).A00 + i5;
                        ((DE1) c4906DDz).A00 = i6;
                        if (z && i6 == ((DE1) c4906DDz).A01) {
                            c4906DDz.A0E = ((DE1) c4906DDz).A03;
                        }
                        if (i5 > 0) {
                            c4906DDz.notifyAll();
                        }
                    }
                }
            }
            synchronized (c4906DDz) {
                c4906DDz.A05 = false;
                if (((DE1) c4906DDz).A01 == ((DE1) c4906DDz).A00) {
                    C4906DDz.A01(cxkCreateInstance);
                    ((DE1) c4906DDz).A02 = null;
                    DE9 de9 = c4906DDz.A09;
                    if (z) {
                        byte[] bArrA00 = DE9.A00(uri, de9, C79.A00, c3159C0h.A04, ((DE1) c4906DDz).A03, ((DE1) c4906DDz).A01, true);
                        if (bArrA00 != null) {
                            ((DE1) c4906DDz).A03 = bArrA00;
                        }
                        c4906DDz.A0E = ((DE1) c4906DDz).A03;
                    } else {
                        DE9.A00(uri, de9, C79.A00, c3159C0h.A04, ((DE1) c4906DDz).A03, ((DE1) c4906DDz).A01, false);
                    }
                }
                c4906DDz.notifyAll();
            }
        } catch (IOException e) {
            DDj dDj2 = c4906DDz.A02;
            if (dDj2 != null) {
                dDj2.AWi(e);
            }
            synchronized (c4906DDz) {
                c4906DDz.A05 = false;
                C4906DDz.A01(cxkCreateInstance);
                ((DE1) c4906DDz).A02 = null;
                if (c4906DDz.A00 < 0) {
                    c4906DDz.notifyAll();
                    throw e;
                }
                c4906DDz.A03 = e;
                c4906DDz.notifyAll();
            }
        }
        c4906DDz.A02 = null;
        return ((DE1) c4906DDz).A00;
    }

    @Override // X.C1L
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        AtomicReference<DE4> atomicReference;
        C7384Etj.A0Y(bArr, 0);
        C1J c1j = this.A0F;
        if (c1j != null) {
            i3 = c1j.read(bArr, i, i2);
            if (i3 > 0) {
                DE4 de4 = this.A02;
                if (de4 != null && (atomicReference = this.A0C) != null) {
                    Bs8.A00(null, de4, atomicReference);
                }
                this.A02 = null;
            }
        } else {
            i3 = -1;
        }
        return i3;
    }

    private final C1O A01(C1O c1o, String str, String str2, boolean z) {
        DE6 de6 = new DE6(str, str2, z);
        Map map = Collections.EMPTY_MAP;
        Uri uri = c1o.A06;
        byte[] bArr = c1o.A0A;
        long j = c1o.A02;
        long j2 = c1o.A04;
        long j3 = j - j2;
        long j4 = c1o.A03;
        if (j4 <= 0) {
            j4 = -1;
        }
        int i = c1o.A00;
        C4890DDe c4890DDe = new C4890DDe(DE7.A02, de6, C4890DDe.A00(c1o), C4890DDe.A00(c1o).A0T, C4890DDe.A00(c1o).A0A, C4890DDe.A00(c1o).A08, C4890DDe.A00(c1o).A0W);
        String str3 = c1o.A08;
        String str4 = str3 != null ? str3 : null;
        C1G.A04(uri);
        return new C1O(uri, c4890DDe, str4, map, bArr, 1, i, j3, j2, j4);
    }

    @Override // X.InterfaceC4896DDp
    public final void cancel() {
        InterfaceC4896DDp interfaceC4896DDp;
        C1J c1j = this.A0F;
        if (!(c1j instanceof InterfaceC4896DDp) || (interfaceC4896DDp = (InterfaceC4896DDp) c1j) == null) {
            return;
        }
        interfaceC4896DDp.cancel();
    }

    @Override // X.C1J
    public final synchronized void close() {
        byte[] bArr;
        byte[] bArr2;
        if (this.A0F != null) {
            C1J c1j = this.A0F;
            if (c1j != null) {
                c1j.close();
            }
            if (this.A0F instanceof DE1) {
                DE1 de1 = (DE1) this.A0F;
                if (this.A0E) {
                    DEC dec = this.A00;
                    if (dec != null && de1 != null && de1.A04()) {
                        boolean z = de1 instanceof C4906DDz;
                        if (z) {
                            C4906DDz c4906DDz = (C4906DDz) de1;
                            bArr2 = c4906DDz.A0E;
                            if (bArr2 == null) {
                                synchronized (c4906DDz) {
                                    try {
                                        bArr2 = c4906DDz.A04() ? ((DE1) c4906DDz).A03 : null;
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            bArr2 = de1.A03;
                        }
                        if (bArr2 != null) {
                            int length = bArr2.length;
                            int i = de1.A01;
                            if (length >= i) {
                                if (i <= 0) {
                                    i = de1.A00;
                                }
                                Integer num = z ? C79.A00 : C79.A01;
                                DDj dDj = this.A01;
                                DE9 de9 = this.A05;
                                C4901DDu c4901DDu = new C4901DDu(dDj, num, bArr2, i, de9.A03 ? z : true, this.A0B);
                                DEV dev = this.A06;
                                synchronized (dev) {
                                    dev.A01(c4901DDu, dec);
                                }
                                byte[] bArrA00 = DE9.A00(((EuH) dec).A01, de9, num, dec.A02, bArr2, i, true);
                                if (bArrA00 != null && bArrA00 != bArr2) {
                                    synchronized (dev) {
                                        c4901DDu.A00 = bArrA00;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.A00 != null && de1 != null && de1.A04() && (bArr = de1.A03) != null) {
                    int length2 = bArr.length;
                    int i2 = de1.A01;
                    if (length2 >= i2) {
                        if (i2 <= 0) {
                            i2 = de1.A00;
                        }
                        boolean z2 = de1 instanceof C4906DDz;
                        Integer num2 = z2 ? C79.A00 : C79.A01;
                        DEV dev2 = A0G;
                        synchronized (dev2) {
                            try {
                                DEC dec2 = this.A00;
                                if (dec2 != null) {
                                    dev2.A01(new C4901DDu(this.A01, num2, de1.A03, i2, this.A05.A03 ? z2 : true, this.A0B), dec2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        DEC dec3 = this.A00;
                        if (dec3 != null) {
                            DE9.A00(((EuH) dec3).A01, this.A05, num2, dec3.A02, de1.A03, i2, false);
                        }
                    }
                }
            }
        }
        this.A0F = null;
        this.A02 = null;
    }

    @Override // X.C1J
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // X.C1J
    public final Uri getUri() {
        C1J c1j;
        if (this.A0F == null || (c1j = this.A0F) == null) {
            return null;
        }
        return c1j.getUri();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a A[Catch: all -> 0x01a6, TryCatch #1 {, blocks: (B:6:0x0026, B:8:0x002b, B:9:0x002f, B:13:0x003c, B:15:0x0040, B:17:0x005b, B:18:0x005d, B:45:0x00af, B:21:0x0064, B:24:0x006a, B:26:0x0072, B:28:0x0076, B:30:0x007a, B:39:0x008c, B:36:0x0087, B:37:0x0088, B:40:0x008d, B:42:0x00a4, B:43:0x00a9, B:38:0x0089, B:46:0x00b4, B:48:0x00b8, B:49:0x00bb, B:50:0x00c5, B:52:0x00cd, B:54:0x00d1, B:56:0x00d8, B:59:0x00e2, B:61:0x00f1, B:62:0x00f3, B:64:0x00f7, B:67:0x0102, B:69:0x0106, B:65:0x00fd, B:70:0x010a, B:73:0x011d, B:77:0x012c, B:78:0x012e, B:31:0x007b, B:33:0x0081), top: B:106:0x0026, outer: #2, inners: #0 }] */
    @Override // X.C1J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long open(X.C1O r28) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE0.open(X.C1O):long");
    }

    public DE0(DE9 de9, DDU ddu, DDj dDj, CXO cxo, C3159C0h c3159C0h, String str, AtomicReference atomicReference, int i, int i2, boolean z, boolean z2) {
        AnonymousClass003.A0x(str, de9);
        C7384Etj.A0Y(ddu, 4);
        this.A0C = atomicReference;
        Object obj = de9.A00;
        this.A0E = AnonymousClass002.A1X(obj);
        DEV dev = (DEV) obj;
        this.A06 = dev == null ? A0G : dev;
        this.A09 = c3159C0h;
        this.A0A = str;
        this.A05 = de9;
        this.A01 = dDj;
        this.A08 = cxo;
        this.A07 = ddu;
        this.A0F = null;
        this.A04 = i;
        this.A0B = z;
        this.A03 = i2;
        this.A0D = z2;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        this.A01 = (DDj) C7384Etj.A08(cxb);
    }
}
