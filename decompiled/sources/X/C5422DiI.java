package X;

import X.InterfaceC5476DjD;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.file.view.MediaViewerContentKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DiI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5422DiI<T extends InterfaceC5476DjD> implements InterfaceC6022DuF, InterfaceC5487DjP, InterfaceC5229Ddn<AbstractC5411Di6>, InterfaceC5346Dgp {
    public int A00;
    public long A01;
    public long A03;
    public Handler A05;
    public C6154Dwx A06;
    public HttpDataSource$HttpDataSourceException A07;
    public HttpDataSource$InvalidResponseCodeException A08;
    public AbstractC5421DiH A09;
    public AbstractC5411Di6 A0B;
    public boolean A0C;
    public boolean A0E;
    public boolean A0F;
    public InterfaceC5365DhH<T> A0H;
    public final int A0I;
    public final C6013Dtw A0J;
    public final C5426DiN A0K;
    public final InterfaceC5495DjX<C5422DiI<T>> A0L;
    public final C5456Dir A0M;
    public final C5456Dir A0N;
    public final InterfaceC5334DgV A0P;
    public final C5342Dgl A0Q;
    public final C5423DiJ A0R;
    public final T A0S;
    public final ArrayList<AbstractC5421DiH> A0T;
    public final List<AbstractC5421DiH> A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final int[] A0X;
    public final C6154Dwx[] A0Z;
    public final C5426DiN[] A0a;
    public final boolean[] A0b;
    public long A02 = -9223372036854775807L;
    public boolean A0D = false;
    public long A04 = -1;
    public boolean A0G = false;
    public final long[] A0Y = {-9223372036854775807L, -9223372036854775807L};
    public AbstractC5421DiH A0A = null;
    public final C5524Dk0 A0O = new C5524Dk0();

    public final int A0D(long j) {
        int i = 0;
        while (true) {
            ArrayList<AbstractC5421DiH> arrayList = this.A0T;
            if (i >= arrayList.size()) {
                break;
            }
            AbstractC5421DiH abstractC5421DiH = arrayList.get(i);
            if (abstractC5421DiH.A04 > j || j >= ((AbstractC5411Di6) abstractC5421DiH).A02) {
                i++;
            } else if (abstractC5421DiH != this.A09 && abstractC5421DiH.A01() && (this.A0V || !(abstractC5421DiH instanceof C5418DiE) || !((C5418DiE) abstractC5421DiH).A07)) {
                C5426DiN c5426DiN = this.A0K;
                int i2 = c5426DiN.A00 + c5426DiN.A03;
                int[] iArr = abstractC5421DiH.A01;
                C1G.A05(iArr);
                if (i2 < iArr[0]) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.InterfaceC5365DhH<T> r5) {
        /*
            r4 = this;
            r0 = 1
            r4.A0C = r0
            android.os.Handler r1 = r4.A05
            if (r1 == 0) goto Lb
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
        Lb:
            r4.A0H = r5
            X.Dlz r0 = X.EnumC5618Dlz.A0i
            boolean r0 = X.AbstractC5653Dmh.A03(r0)
            if (r0 == 0) goto L1f
            X.Dgl r1 = r4.A0Q
            X.Ddm<? extends X.Ddp> r0 = r1.A00
            if (r0 == 0) goto L1f
        L1b:
            r1.A01(r4)
            return
        L1f:
            X.DiN r0 = r4.A0K
            r0.A09()
            X.DiN[] r3 = r4.A0a
            int r2 = r3.length
            r1 = 0
        L28:
            if (r1 >= r2) goto L32
            r0 = r3[r1]
            r0.A09()
            int r1 = r1 + 1
            goto L28
        L32:
            X.Dgl r1 = r4.A0Q
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5422DiI.A0E(X.DhH):void");
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATx(InterfaceC5231Ddp interfaceC5231Ddp, int i, long j) {
        AbstractC5411Di6 abstractC5411Di6 = (AbstractC5411Di6) interfaceC5231Ddp;
        long j2 = abstractC5411Di6.A03;
        C1O c1o = abstractC5411Di6.A06;
        DF4 df4 = abstractC5411Di6.A07;
        C5072DTn c5072DTn = new C5072DTn(df4.A01, c1o, df4.A02, j2, j);
        C6013Dtw c6013Dtw = this.A0J;
        int i2 = abstractC5411Di6.A01;
        int i3 = this.A0I;
        c6013Dtw.A02(abstractC5411Di6.A05, c5072DTn, abstractC5411Di6.A08, i2, i3, abstractC5411Di6.A00, i, abstractC5411Di6.A04, abstractC5411Di6.A02);
    }

    public static int A00(C5422DiI c5422DiI, int i, int i2) {
        while (true) {
            i2++;
            ArrayList<AbstractC5421DiH> arrayList = c5422DiI.A0T;
            if (i2 >= arrayList.size()) {
                i2 = arrayList.size();
                break;
            }
            int[] iArr = arrayList.get(i2).A01;
            C1G.A05(iArr);
            if (iArr[0] > i) {
                break;
            }
        }
        return i2 - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long A01(DpX dpX, C5422DiI c5422DiI, long j) {
        long j2;
        long j3 = dpX.A01;
        long j4 = j - j3;
        if (((j ^ j4) & (j3 ^ j)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        long j5 = dpX.A00;
        long j6 = j + j5;
        if (((j ^ j6) & (j5 ^ j6)) < 0) {
            j6 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        C5426DiN c5426DiN = c5422DiI.A0K;
        synchronized (c5426DiN) {
            j2 = c5426DiN.A02 == 0 ? Long.MIN_VALUE : c5426DiN.A0M[c5426DiN.A04];
        }
        long j7 = -9223372036854775807L;
        int i = 0;
        while (true) {
            ArrayList<AbstractC5421DiH> arrayList = c5422DiI.A0T;
            if (i >= arrayList.size()) {
                return j7;
            }
            AbstractC5421DiH abstractC5421DiH = arrayList.get(i);
            if (abstractC5421DiH != c5422DiI.A09 && abstractC5421DiH.A01() && (abstractC5421DiH instanceof InterfaceC5531Dk8)) {
                C5490DjS c5490DjSAH9 = ((InterfaceC5531Dk8) abstractC5421DiH).AH9();
                int i2 = c5490DjSAH9.A03;
                for (int i3 = 0; i3 < i2; i3++) {
                    long j8 = c5490DjSAH9.A02[i3];
                    if (j8 >= j2 && j8 >= j4 && j8 <= j6 && (j7 == -9223372036854775807L || BV6.A0J(j8, j) < BV6.A0J(j7, j))) {
                        j7 = j8;
                    }
                }
            }
            i++;
        }
    }

    private AbstractC5421DiH A02() {
        ArrayList<AbstractC5421DiH> arrayList = this.A0T;
        return arrayList.get(C8j3.A0K(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.AbstractC5421DiH A03(int r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5422DiI.A03(int):X.DiH");
    }

    private void A04() {
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0l)) {
            long j = this.A02;
            if (j != -9223372036854775807L) {
                boolean z = this.A0F;
                this.A02 = -9223372036854775807L;
                if (A0F()) {
                    return;
                }
                A09(this, j, z);
            }
        }
    }

    private final /* synthetic */ void A05() throws IOException {
        C5342Dgl c5342Dgl = this.A0Q;
        c5342Dgl.AQQ();
        this.A0K.A08();
        if (c5342Dgl.A00 == null) {
            C5425DiL c5425DiL = (C5425DiL) this.A0S;
            IOException iOException = c5425DiL.A0G;
            if (iOException != null) {
                throw iOException;
            }
            c5425DiL.A0e.AQQ();
        }
    }

    private void A06(long j) {
        C5431DiS c5431DiS = this.A0R.A0L;
        int i = this.A0I;
        Integer num = i == 2 ? C79.A00 : i == 1 ? C79.A01 : null;
        if (c5431DiS == null || num == null || !c5431DiS.A04()) {
            return;
        }
        try {
            c5431DiS.A03(A0F() ? 0L : Math.max(0L, AD6(j)), num);
        } catch (RuntimeException e) {
            Log.w("ChunkSampleStream", "Disabling ABR buffer details tracking after sampling failure", e);
            synchronized (c5431DiS) {
                c5431DiS.A04 = true;
            }
        }
    }

    public static void A07(C5422DiI c5422DiI) {
        C6154Dwx c6154Dwx;
        C5426DiN c5426DiN = c5422DiI.A0K;
        int iA00 = A00(c5422DiI, c5426DiN.A00 + c5426DiN.A03, c5422DiI.A00 - 1);
        while (true) {
            int i = c5422DiI.A00;
            if (i > iA00) {
                return;
            }
            c5422DiI.A00 = i + 1;
            if (!c5422DiI.A0W || !c5422DiI.A0T.isEmpty()) {
                AbstractC5421DiH abstractC5421DiH = c5422DiI.A0T.get(i);
                C6154Dwx c6154Dwx2 = abstractC5421DiH.A05;
                if ((!c6154Dwx2.equals(c5422DiI.A06) && !c5422DiI.A0R.A16) || (c5422DiI.A0R.A16 && ((c6154Dwx = c5422DiI.A06) == null || !c6154Dwx2.A0Y.equals(c6154Dwx.A0Y)))) {
                    c5422DiI.A0J.A05(c6154Dwx2, abstractC5421DiH.A08, c5422DiI.A0I, ((AbstractC5411Di6) abstractC5421DiH).A00, abstractC5421DiH.A04);
                }
                c5422DiI.A06 = c6154Dwx2;
            }
        }
    }

    public static void A08(C5422DiI c5422DiI, long j, boolean z) {
        ArrayList<AbstractC5421DiH> arrayList = c5422DiI.A0T;
        int iA0K = C8j3.A0K(arrayList);
        if (iA0K >= 0) {
            if (z || c5422DiI.AD6(j) >= MediaViewerContentKt.DETAIL_IMAGE_MAX_PIXEL_COUNT) {
                AbstractC5421DiH abstractC5421DiH = arrayList.get(iA0K);
                if (abstractC5421DiH.A01()) {
                    return;
                }
                C5342Dgl c5342Dgl = c5422DiI.A0Q;
                if (c5342Dgl.A00 == null || c5422DiI.A0A(iA0K)) {
                    return;
                }
                if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0W)) {
                    c5422DiI.A09 = abstractC5421DiH;
                } else {
                    arrayList.remove(iA0K);
                    if (arrayList.isEmpty()) {
                        c5422DiI.A03 = abstractC5421DiH.A04;
                    }
                }
                HandlerC5228Ddm<? extends InterfaceC5231Ddp> handlerC5228Ddm = c5342Dgl.A00;
                C1G.A05(handlerC5228Ddm);
                handlerC5228Ddm.A01(false);
            }
        }
    }

    public static void A09(C5422DiI c5422DiI, long j, boolean z) {
        AbstractC5421DiH abstractC5421DiH;
        long j2;
        C5426DiN c5426DiN = c5422DiI.A0K;
        int i = c5426DiN.A00;
        c5426DiN.A0C(j, z, true);
        int i2 = c5426DiN.A00;
        if (i2 > i) {
            synchronized (c5426DiN) {
                j2 = c5426DiN.A02 == 0 ? Long.MIN_VALUE : c5426DiN.A0M[c5426DiN.A04];
            }
            int i3 = 0;
            while (true) {
                C5426DiN[] c5426DiNArr = c5422DiI.A0a;
                if (i3 >= c5426DiNArr.length) {
                    break;
                }
                c5426DiNArr[i3].A0C(j2, z, c5422DiI.A0b[i3]);
                i3++;
            }
        }
        int iMin = Math.min(A00(c5422DiI, i2, 0), c5422DiI.A00);
        if (iMin > 0) {
            ArrayList<AbstractC5421DiH> arrayList = c5422DiI.A0T;
            int i4 = iMin - 1;
            if (arrayList.get(i4).A04 > j || j > ((AbstractC5411Di6) arrayList.get(i4)).A02) {
                arrayList.get(i4);
                abstractC5421DiH = null;
            } else {
                abstractC5421DiH = arrayList.get(i4);
            }
            c5422DiI.A0A = abstractC5421DiH;
            if (iMin > arrayList.size()) {
                throw BV4.A0P();
            }
            arrayList.subList(0, iMin).clear();
            c5422DiI.A00 -= iMin;
        }
    }

    private boolean A0A(int i) {
        C5426DiN c5426DiN;
        AbstractC5421DiH abstractC5421DiH = this.A0T.get(i);
        C5426DiN c5426DiN2 = this.A0K;
        int i2 = c5426DiN2.A00 + c5426DiN2.A03;
        int[] iArr = abstractC5421DiH.A01;
        C1G.A05(iArr);
        if (i2 <= iArr[0]) {
            int i3 = 0;
            do {
                C5426DiN[] c5426DiNArr = this.A0a;
                if (i3 >= c5426DiNArr.length) {
                    return false;
                }
                c5426DiN = c5426DiNArr[i3];
                i3++;
            } while (c5426DiN.A00 + c5426DiN.A03 <= iArr[i3]);
        }
        return true;
    }

    public static boolean A0B(C5422DiI c5422DiI) {
        if (!AbstractC5653Dmh.A03(EnumC5618Dlz.A1B)) {
            return false;
        }
        int i = c5422DiI.A0I;
        return (i == 1 || i == 2) && !c5422DiI.A0T.isEmpty() && (c5422DiI.A02() instanceof InterfaceC5531Dk8);
    }

    public static boolean A0C(C5422DiI c5422DiI) {
        if (!AbstractC5653Dmh.A03(EnumC5618Dlz.A1A)) {
            return false;
        }
        int i = c5422DiI.A0I;
        return (i == 1 || i == 2) && !c5422DiI.A0T.isEmpty() && (c5422DiI.A02() instanceof InterfaceC5531Dk8);
    }

    public final boolean A0F() {
        return AnonymousClass002.A1L((this.A03 > (-9223372036854775807L) ? 1 : (this.A03 == (-9223372036854775807L) ? 0 : -1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x01d7, TryCatch #0 {all -> 0x01d7, blocks: (B:3:0x0004, B:5:0x000f, B:7:0x0017, B:9:0x0020, B:10:0x0024, B:14:0x0041, B:17:0x0048, B:19:0x0050, B:21:0x005c, B:23:0x0062, B:26:0x0070, B:28:0x0076, B:25:0x006d, B:39:0x00b5, B:40:0x00c8, B:49:0x00d8, B:51:0x00dc, B:52:0x00e4, B:59:0x00ef, B:61:0x00fd, B:63:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0115, B:70:0x011b, B:71:0x012c, B:73:0x0132, B:75:0x0137, B:77:0x013f, B:79:0x0149, B:80:0x0150, B:82:0x0154, B:84:0x0160, B:92:0x0193, B:93:0x019a, B:103:0x01b0, B:104:0x01b5, B:105:0x01b7, B:107:0x01c3, B:110:0x01c8, B:99:0x01a7, B:85:0x016c, B:87:0x0178, B:88:0x0184, B:89:0x0187, B:91:0x018b, B:32:0x0081, B:38:0x0096, B:11:0x002b), top: B:118:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: all -> 0x01d7, TryCatch #0 {all -> 0x01d7, blocks: (B:3:0x0004, B:5:0x000f, B:7:0x0017, B:9:0x0020, B:10:0x0024, B:14:0x0041, B:17:0x0048, B:19:0x0050, B:21:0x005c, B:23:0x0062, B:26:0x0070, B:28:0x0076, B:25:0x006d, B:39:0x00b5, B:40:0x00c8, B:49:0x00d8, B:51:0x00dc, B:52:0x00e4, B:59:0x00ef, B:61:0x00fd, B:63:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0115, B:70:0x011b, B:71:0x012c, B:73:0x0132, B:75:0x0137, B:77:0x013f, B:79:0x0149, B:80:0x0150, B:82:0x0154, B:84:0x0160, B:92:0x0193, B:93:0x019a, B:103:0x01b0, B:104:0x01b5, B:105:0x01b7, B:107:0x01c3, B:110:0x01c8, B:99:0x01a7, B:85:0x016c, B:87:0x0178, B:88:0x0184, B:89:0x0187, B:91:0x018b, B:32:0x0081, B:38:0x0096, B:11:0x002b), top: B:118:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[Catch: all -> 0x01d7, PHI: r9 r17
  0x00b5: PHI (r9v9 boolean) = (r9v1 boolean), (r9v2 boolean), (r9v10 boolean) binds: [B:37:0x0094, B:33:0x008e, B:29:0x0079] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r17v3 boolean) = (r17v0 boolean), (r17v1 boolean), (r17v4 boolean) binds: [B:37:0x0094, B:33:0x008e, B:29:0x0079] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01d7, blocks: (B:3:0x0004, B:5:0x000f, B:7:0x0017, B:9:0x0020, B:10:0x0024, B:14:0x0041, B:17:0x0048, B:19:0x0050, B:21:0x005c, B:23:0x0062, B:26:0x0070, B:28:0x0076, B:25:0x006d, B:39:0x00b5, B:40:0x00c8, B:49:0x00d8, B:51:0x00dc, B:52:0x00e4, B:59:0x00ef, B:61:0x00fd, B:63:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0115, B:70:0x011b, B:71:0x012c, B:73:0x0132, B:75:0x0137, B:77:0x013f, B:79:0x0149, B:80:0x0150, B:82:0x0154, B:84:0x0160, B:92:0x0193, B:93:0x019a, B:103:0x01b0, B:104:0x01b5, B:105:0x01b7, B:107:0x01c3, B:110:0x01c8, B:99:0x01a7, B:85:0x016c, B:87:0x0178, B:88:0x0184, B:89:0x0187, B:91:0x018b, B:32:0x0081, B:38:0x0096, B:11:0x002b), top: B:118:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[PHI: r16
  0x00d7: PHI (r16v2 boolean) = (r16v0 boolean), (r16v0 boolean), (r16v3 boolean) binds: [B:45:0x00d2, B:47:0x00d5, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    @Override // X.InterfaceC5487DjP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A7A(X.Du1 r29) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5422DiI.A7A(X.Du1):boolean");
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        long jMax;
        long jMax2 = j;
        ArrayList<AbstractC5421DiH> arrayList = this.A0T;
        if (arrayList.isEmpty() || !(A02() instanceof InterfaceC5531Dk8)) {
            Iterator<AbstractC5421DiH> it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                AbstractC5421DiH next = it.next();
                if (A0F()) {
                    jMax = this.A03;
                } else {
                    long jMax3 = this.A01;
                    AbstractC5421DiH abstractC5421DiHA02 = A02();
                    if (abstractC5421DiHA02.A01() || (arrayList.size() > 1 && (abstractC5421DiHA02 = arrayList.get(arrayList.size() - 2)) != null)) {
                        jMax3 = Math.max(jMax3, ((AbstractC5411Di6) abstractC5421DiHA02).A02);
                    }
                    jMax = Math.max(jMax3, this.A0K.A06());
                }
                long jMin = Math.min(jMax, ((AbstractC5411Di6) next).A02) - Math.max(next.A04, jMax2);
                if (jMin > 0) {
                    j2 += jMin;
                }
            }
            AbstractC5421DiH abstractC5421DiH = this.A0A;
            if (abstractC5421DiH == null) {
                return j2;
            }
            long j3 = abstractC5421DiH.A04;
            if (j3 > j) {
                return j2;
            }
            long j4 = ((AbstractC5411Di6) abstractC5421DiH).A02;
            return j <= j4 ? j2 + (j4 - Math.max(j3, jMax2)) : j2;
        }
        Iterator<AbstractC5421DiH> it2 = arrayList.iterator();
        long j5 = -9223372036854775807L;
        long jMax4 = -9223372036854775807L;
        long jA07 = 0;
        while (it2.hasNext()) {
            InterfaceC5231Ddp interfaceC5231Ddp = (AbstractC5421DiH) it2.next();
            if (interfaceC5231Ddp instanceof InterfaceC5531Dk8) {
                C5490DjS c5490DjSAH9 = ((InterfaceC5531Dk8) interfaceC5231Ddp).AH9();
                long j6 = c5490DjSAH9.A05;
                if (j6 != -9223372036854775807L) {
                    long j7 = c5490DjSAH9.A04;
                    if (jMax4 != -9223372036854775807L && j7 > jMax4 && j7 - jMax4 <= 200000) {
                        j7 = jMax4;
                    }
                    if (jMax4 == -9223372036854775807L || j7 > jMax4) {
                        j5 = j7;
                    }
                    jA07 += BV5.A07(j6 - Math.max(j7, jMax2));
                    jMax2 = Math.max(jMax2, j6);
                    jMax4 = Math.max(jMax4, j6);
                }
            }
        }
        long[] jArr = this.A0Y;
        synchronized (jArr) {
            jArr[0] = j5;
            jArr[1] = jMax4;
        }
        return jA07;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[PHI: r0
  0x003b: PHI (r0v7 X.DiH) = (r0v6 X.DiH), (r0v12 X.DiH) binds: [B:13:0x0022, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5487DjP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AD8() {
        /*
            r5 = this;
            boolean r0 = r5.A0E
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L10
            long r0 = r5.A03
            return r0
        L10:
            X.DiH r0 = r5.A02()
            boolean r0 = r0 instanceof X.InterfaceC5531Dk8
            long r1 = r5.A01
            if (r0 != 0) goto L41
            X.DiH r0 = r5.A02()
            boolean r3 = r0.A01()
            if (r3 != 0) goto L3b
            java.util.ArrayList<X.DiH> r4 = r5.A0T
            int r3 = r4.size()
            r0 = 1
            if (r3 <= r0) goto L41
            int r0 = r4.size()
            int r0 = r0 + (-2)
            java.lang.Object r0 = r4.get(r0)
            X.Di6 r0 = (X.AbstractC5411Di6) r0
            if (r0 == 0) goto L41
        L3b:
            long r3 = r0.A02
            long r1 = java.lang.Math.max(r1, r3)
        L41:
            X.DiN r0 = r5.A0K
            long r3 = r0.A06()
            long r0 = java.lang.Math.max(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5422DiI.AD8():long");
    }

    @Override // X.InterfaceC5487DjP
    public final boolean AOd() {
        return AnonymousClass002.A1X(this.A0Q.A00);
    }

    @Override // X.InterfaceC6022DuF
    public final void AQQ() throws Throwable {
        Throwable e;
        C5506Dji c5506Dji = this.A0R.A0Q;
        if (c5506Dji == null) {
            C5342Dgl c5342Dgl = this.A0Q;
            c5342Dgl.AQQ();
            this.A0K.A08();
            if (c5342Dgl.A00 != null) {
                return;
            }
            C5425DiL c5425DiL = (C5425DiL) this.A0S;
            e = c5425DiL.A0G;
            if (e == null) {
                c5425DiL.A0e.AQQ();
                return;
            }
        } else {
            if (!c5506Dji.A05) {
                A05();
                return;
            }
            try {
                A05();
                if (c5506Dji.A03) {
                    c5506Dji.A00 = -9223372036854775807L;
                    return;
                }
                return;
            } catch (HttpDataSource$HttpDataSourceException e2) {
                e = e2;
                if (e.getClass().equals(HttpDataSource$HttpDataSourceException.class)) {
                    long j = c5506Dji.A02;
                    if (j > 0) {
                        long j2 = c5506Dji.A00;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (j2 == -9223372036854775807L) {
                            c5506Dji.A00 = jElapsedRealtime;
                            return;
                        } else if (jElapsedRealtime - j2 <= j) {
                            return;
                        }
                    }
                }
            }
        }
        throw e;
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATt(InterfaceC5231Ddp interfaceC5231Ddp, long j, boolean z) {
        ArrayList<AbstractC5421DiH> arrayList;
        int iIndexOf;
        AbstractC5411Di6 abstractC5411Di6 = (AbstractC5411Di6) interfaceC5231Ddp;
        this.A0B = null;
        AbstractC5421DiH abstractC5421DiH = this.A09;
        if (abstractC5421DiH != abstractC5411Di6) {
            abstractC5421DiH = null;
        }
        this.A09 = null;
        if (!z) {
            if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0g) && A0F()) {
                this.A0K.A07();
                for (C5426DiN c5426DiN : this.A0a) {
                    c5426DiN.A07();
                }
            }
            A04();
        }
        long j2 = abstractC5411Di6.A03;
        C1O c1o = abstractC5411Di6.A06;
        DF4 df4 = abstractC5411Di6.A07;
        this.A0J.A03(abstractC5411Di6.A05, new C5072DTn(df4.A01, c1o, df4.A02, j2, j), abstractC5411Di6.A08, abstractC5411Di6.A01, this.A0I, abstractC5411Di6.A00, abstractC5411Di6.A04, abstractC5411Di6.A02);
        if (z) {
            return;
        }
        if (A0F()) {
            C5426DiN.A03(this.A0K, false);
            for (C5426DiN c5426DiN2 : this.A0a) {
                C5426DiN.A03(c5426DiN2, false);
            }
        } else if (abstractC5421DiH != null && (iIndexOf = (arrayList = this.A0T).indexOf(abstractC5421DiH)) != -1) {
            A03(iIndexOf);
            if (arrayList.isEmpty()) {
                this.A03 = abstractC5421DiH.A04;
            }
        }
        this.A0L.ASS(this);
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATu(InterfaceC5231Ddp interfaceC5231Ddp, long j, long j2) {
        AbstractC5411Di6 abstractC5411Di6 = (AbstractC5411Di6) interfaceC5231Ddp;
        this.A0B = null;
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0g) && A0F()) {
            this.A0K.A07();
            for (C5426DiN c5426DiN : this.A0a) {
                c5426DiN.A07();
            }
        }
        A04();
        this.A07 = null;
        this.A08 = null;
        this.A0S.ASD(abstractC5411Di6);
        long j3 = abstractC5411Di6.A03;
        C1O c1o = abstractC5411Di6.A06;
        DF4 df4 = abstractC5411Di6.A07;
        C5072DTn c5072DTn = new C5072DTn(df4.A01, c1o, df4.A02, j3, j);
        this.A0J.A04(abstractC5411Di6.A05, c5072DTn, abstractC5411Di6.A08, abstractC5411Di6.A01, this.A0I, abstractC5411Di6.A00, abstractC5411Di6.A04, abstractC5411Di6.A02);
        this.A0L.ASS(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0424 A[LOOP:4: B:189:0x041e->B:191:0x0424, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0445 A[LOOP:5: B:193:0x043f->B:195:0x0445, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0207  */
    @Override // X.InterfaceC5229Ddn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C5230Ddo ATv(X.InterfaceC5231Ddp r47, java.io.IOException r48, int r49, long r50, long r52) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5422DiI.ATv(X.Ddp, java.io.IOException, int, long, long):X.Ddo");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x0065, TryCatch #1 {, blocks: (B:11:0x002a, B:13:0x002e, B:18:0x003b, B:20:0x003f, B:22:0x0044, B:28:0x0056, B:30:0x005b, B:32:0x0062, B:23:0x0049, B:25:0x004d, B:27:0x0052), top: B:103:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[Catch: all -> 0x0065, TryCatch #1 {, blocks: (B:11:0x002a, B:13:0x002e, B:18:0x003b, B:20:0x003f, B:22:0x0044, B:28:0x0056, B:30:0x005b, B:32:0x0062, B:23:0x0049, B:25:0x004d, B:27:0x0052), top: B:103:0x002a }] */
    @Override // X.InterfaceC5346Dgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATz() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5422DiI.ATz():void");
    }

    @Override // X.InterfaceC5487DjP
    public final long AI5() {
        if (A0F()) {
            return this.A03;
        }
        if (this.A0E) {
            return Long.MIN_VALUE;
        }
        return ((AbstractC5411Di6) A02()).A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // X.InterfaceC6022DuF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZE(X.Di2 r5, X.C5406Dhz r6, int r7) {
        /*
            r4 = this;
            boolean r0 = r4.A0F()
            r3 = -3
            if (r0 != 0) goto L24
            X.Dlz r0 = X.EnumC5618Dlz.A0W
            boolean r0 = X.AbstractC5653Dmh.A03(r0)
            if (r0 == 0) goto L25
            X.DiH r0 = r4.A09
            if (r0 == 0) goto L25
            r1 = 0
            int[] r0 = r0.A01
            X.C1G.A05(r0)
            r2 = r0[r1]
            X.DiN r0 = r4.A0K
            int r1 = r0.A00
            int r0 = r0.A03
            int r1 = r1 + r0
            if (r2 > r1) goto L25
        L24:
            return r3
        L25:
            X.DiN r1 = r4.A0K
            boolean r0 = r4.A0E
            int r3 = r1.A05(r5, r6, r7, r0)
            r0 = -4
            if (r3 != r0) goto L24
            A07(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5422DiI.AZE(X.Di2, X.Dhz, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    @Override // X.InterfaceC5487DjP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AZv(long r12) {
        /*
            r11 = this;
            r11.A06(r12)
            X.Dgl r4 = r11.A0Q
            java.io.IOException r0 = r4.A01
            if (r0 != 0) goto Lbf
            boolean r0 = r11.A0F()
            if (r0 != 0) goto Lbf
            T extends X.DjD r2 = r11.A0S
            X.Di6 r5 = r11.A0B
            java.util.List<X.DiH> r3 = r11.A0U
            X.DiL r2 = (X.C5425DiL) r2
            X.DiJ r6 = r2.A0i
            boolean r0 = r6.A0w
            if (r0 != 0) goto L21
            boolean r0 = r6.A1A
            if (r0 == 0) goto L43
        L21:
            X.Dic r1 = r2.A0D
            boolean r0 = r1 instanceof X.InterfaceC5546DkO
            if (r0 == 0) goto L43
            X.DkO r1 = (X.InterfaceC5546DkO) r1
            X.DiM r1 = (X.DiM) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L43
            r0 = 0
            r1.A07 = r0
            boolean r0 = r1.A08
            if (r0 != 0) goto L43
            boolean r0 = r6.A1A
            if (r0 == 0) goto L43
            r1 = 2
            int r0 = r2.A04
            int r0 = java.lang.Math.min(r0, r1)
            r2.A04 = r0
        L43:
            java.io.IOException r0 = r2.A0G
            if (r0 != 0) goto L57
            boolean r0 = r6.A0b
            if (r0 == 0) goto L57
            X.Dic r0 = r2.A0D
            boolean r0 = r0.AfM(r5, r3, r12)
            if (r0 == 0) goto L57
            r0 = 0
            A08(r11, r12, r0)
        L57:
            X.Ddm<? extends X.Ddp> r0 = r4.A00
            if (r0 != 0) goto Lbf
            java.io.IOException r0 = r2.A0G
            if (r0 != 0) goto Lc3
            X.Dic r2 = r2.A0D
            int r1 = r2.length()
            r0 = 2
            if (r1 < r0) goto Lc3
            int r6 = r2.AAv(r3, r12)
        L6c:
            java.util.ArrayList<X.DiH> r3 = r11.A0T
            int r0 = r3.size()
            if (r6 >= r0) goto Lbf
            int r2 = r3.size()
        L78:
            r1 = -1
            if (r6 >= r2) goto Lbf
            boolean r0 = r11.A0A(r6)
            if (r0 != 0) goto Lc0
            if (r6 == r1) goto Lbf
            X.DiH r0 = r11.A02()
            long r4 = r0.A02
            X.DiH r2 = r11.A03(r6)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L97
            long r0 = r11.A01
            r11.A03 = r0
        L97:
            r0 = 0
            r11.A0E = r0
            X.Dtw r3 = r11.A0J
            int r8 = r11.A0I
            long r0 = r2.A04
            long r10 = androidx.media3.common.util.Util.A0B(r0)
            long r12 = androidx.media3.common.util.Util.A0B(r4)
            r7 = 1
            r5 = 0
            r9 = 3
            X.Dra r4 = new X.Dra
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r12)
            X.Dy6 r2 = r3.A01
            r2.getClass()
            r1 = 2
            X.F4s r0 = new X.F4s
            r0.<init>(r2, r4, r3, r1)
            r3.A06(r0)
        Lbf:
            return
        Lc0:
            int r6 = r6 + 1
            goto L78
        Lc3:
            int r6 = r3.size()
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5422DiI.AZv(long):void");
    }

    @Override // X.InterfaceC6022DuF
    public final int Afl(long j) {
        AbstractC5421DiH abstractC5421DiH;
        if (A0F()) {
            return 0;
        }
        C5426DiN c5426DiN = this.A0K;
        int iA04 = c5426DiN.A04(j, this.A0E);
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0W) && (abstractC5421DiH = this.A09) != null) {
            iA04 = Math.min(iA04, Math.max(0, C1G.A01(c5426DiN, abstractC5421DiH, 0)));
        }
        c5426DiN.A0B(iA04);
        if (iA04 > 0) {
            A07(this);
        }
        return iA04;
    }

    @Override // X.InterfaceC6022DuF
    public final boolean isReady() {
        return !A0F() && this.A0K.A0E(this.A0E);
    }

    /* JADX WARN: Incorrect types in method signature: (I[I[LX/Dwx;TT;LX/DjX<LX/DiI<TT;>;>;LX/DkF;JLX/Div;LX/Dtx;LX/DgV;LX/Dtw;LX/Ddq;LX/DiJ;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C5422DiI(C6014Dtx c6014Dtx, InterfaceC5460Div interfaceC5460Div, C6013Dtw c6013Dtw, InterfaceC5495DjX interfaceC5495DjX, InterfaceC5538DkF interfaceC5538DkF, InterfaceC5334DgV interfaceC5334DgV, InterfaceExecutorC5232Ddq interfaceExecutorC5232Ddq, C5423DiJ c5423DiJ, InterfaceC5476DjD interfaceC5476DjD, int[] iArr, C6154Dwx[] c6154DwxArr, int i, long j) {
        this.A0I = i;
        this.A0X = iArr;
        this.A0Z = c6154DwxArr;
        this.A0S = interfaceC5476DjD;
        this.A0L = interfaceC5495DjX;
        this.A0J = c6013Dtw;
        this.A0P = interfaceC5334DgV;
        this.A0R = c5423DiJ;
        this.A0Q = new C5342Dgl(interfaceExecutorC5232Ddq);
        ArrayList<AbstractC5421DiH> arrayListA0h = C3cG.A0h();
        this.A0T = arrayListA0h;
        this.A0U = Collections.unmodifiableList(arrayListA0h);
        int length = iArr.length;
        this.A0a = new C5426DiN[length];
        this.A0b = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        C5426DiN[] c5426DiNArr = new C5426DiN[i2];
        interfaceC5460Div.getClass();
        C5426DiN c5426DiN = new C5426DiN(c6014Dtx, interfaceC5460Div, interfaceC5538DkF);
        this.A0K = c5426DiN;
        iArr2[0] = i;
        c5426DiNArr[0] = c5426DiN;
        int i3 = 0;
        while (i3 < length) {
            C5426DiN c5426DiN2 = new C5426DiN(null, null, interfaceC5538DkF);
            this.A0a[i3] = c5426DiN2;
            int i4 = i3 + 1;
            c5426DiNArr[i4] = c5426DiN2;
            iArr2[i4] = this.A0X[i3];
            i3 = i4;
        }
        this.A0M = new C5456Dir(iArr2, c5426DiNArr);
        this.A03 = j;
        this.A01 = j;
        if (c5423DiJ.A0r) {
            C5426DiN[] c5426DiNArr2 = new C5426DiN[i2];
            c5426DiNArr2[0] = new C5426DiN(c6014Dtx, interfaceC5460Div, interfaceC5538DkF);
            this.A0N = new C5456Dir(iArr2, c5426DiNArr2);
        }
        this.A0V = AbstractC5653Dmh.A03(EnumC5618Dlz.A0Y);
        this.A0W = AbstractC5653Dmh.A03(EnumC5618Dlz.A1k);
    }
}
