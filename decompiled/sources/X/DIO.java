package X;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class DIO {
    public static volatile DIO A06;
    public File A00;
    public F18 A01;
    public boolean A02;
    public C4965DIt[] A03;
    public final Lock A05 = new ReentrantLock(true);
    public final Map A04 = C3cG.A0j();

    public static DJK A00(DIe dIe, ByteBuffer byteBuffer, int i, int i2, int i3) {
        byteBuffer.position(((i * i2) + i3) * dIe.A00);
        K k = dIe.A02;
        k.AZ8(byteBuffer);
        return k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0155, code lost:
    
        r8 = r8 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.DIS[] A02(X.DIT r23, java.io.RandomAccessFile r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DIO.A02(X.DIT, java.io.RandomAccessFile, long, long):X.DIS[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        r11 = r11 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.DIS[] A03(X.DIT r25, java.io.RandomAccessFile r26, long r27, long r29) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DIO.A03(X.DIT, java.io.RandomAccessFile, long, long):X.DIS[]");
    }

    public final void A04(DHu dHu, DIA dia) {
        C7384Etj.A0Y(dia, 1);
        DID did = (DID) dia;
        Lock lock = this.A05;
        lock.lock();
        try {
            if (this.A00 != null) {
                int size = this.A04.size();
                File file = this.A00;
                C7384Etj.A0X(file);
                did.ANg(file, String.valueOf(size));
            }
            this.A04.put(did, dHu);
            C4965DIt[] c4965DItArr = this.A03;
            if (c4965DItArr != null) {
                this.A03 = null;
                A05((C4965DIt[]) Arrays.copyOf(c4965DItArr, c4965DItArr.length));
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x035e, code lost:
    
        if (java.lang.Long.class.equals(r3) == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0360, code lost:
    
        r10.A03(r9, r12.getLong());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0368, code lost:
    
        r12.position(r11 + r2);
        r20.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0374, code lost:
    
        r32.addAll(r20);
        r3 = new X.DJ5();
        r3.A00 = -1;
        r3.A01 = r31;
        r3.A02 = r30;
        r3.A04 = r29;
        r3.A03 = r20.size();
        r3.A00 = r30 - r20.size();
        r4.A0B.add(r3);
        r36.seek(r36.getFilePointer() + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03b1, code lost:
    
        r36.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03b5, code lost:
    
        r2 = new java.lang.StringBuilder("Unsupported annotation type ");
        r2.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03c8, code lost:
    
        throw new java.lang.IllegalStateException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03c9, code lost:
    
        r36.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03cd, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03ce, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03cf, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03d5, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03d6, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03d7, code lost:
    
        r4.A01();
        r4.A0C = false;
        r4.A0A = r2.getMessage();
        r8 = new X.DIS[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03e5, code lost:
    
        r4.A0C = true;
        r8 = (X.DIS[]) r32.toArray(new X.DIS[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03f5, code lost:
    
        X.DI8.A01("qpl.cr.composite.ReadResilientMarkersStorage2");
        r8 = X.DIP.A02(r4, r36, r2, r47);
        X.DI8.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x041d, code lost:
    
        r3 = (X.DIS[]) r37.toArray(new X.DIS[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0427, code lost:
    
        r36.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x042a, code lost:
    
        if (r3 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x042d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0436, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0437, code lost:
    
        r14.A01();
        r14.A0C = false;
        r14.A0A = r2.getMessage();
        r37.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0449, code lost:
    
        r2 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x044a, code lost:
    
        if (r2 <= 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x044c, code lost:
    
        r39.addAll(X.AbstractC0885AGm.A11(java.util.Arrays.copyOf(r3, r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f2, code lost:
    
        r3 = X.FGI.A0M("qpl_resilience_storage", r5);
        r37 = new java.util.ArrayList();
        r4 = new java.io.File(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x010a, code lost:
    
        if (r4.exists() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010c, code lost:
    
        r14.A0C = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b2, code lost:
    
        r36 = new java.io.RandomAccessFile(r4, "r");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01bb, code lost:
    
        r6 = r36.readInt();
        r2 = new int[r6];
        r2 = new int[r6];
        r2 = new long[r6];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01cc, code lost:
    
        if (r2 >= r6) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ce, code lost:
    
        r2[r2] = r36.readLong();
        r2[r2] = r36.readInt();
        r2[r2] = r36.readInt();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e3, code lost:
    
        r8 = null;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e6, code lost:
    
        if (r5 >= r6) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e8, code lost:
    
        r7 = r2[r5];
        r9 = r2[r5];
        r2 = r2[r5];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01f0, code lost:
    
        if (r5 >= r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f2, code lost:
    
        r47 = r2[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f4, code lost:
    
        r4 = new X.DIT();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01fa, code lost:
    
        r47 = r36.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ff, code lost:
    
        if (r7 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0203, code lost:
    
        if (r9 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0208, code lost:
    
        if (r9 != 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020a, code lost:
    
        X.DI8.A01("qpl.cr.composite.ReadResilientMarkersStorage3");
        r8 = A03(r4, r36, r2, r47);
        X.DI8.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x021f, code lost:
    
        if (r9 != 4) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0221, code lost:
    
        X.DI8.A01("qpl.cr.composite.ReadResilientMarkersStorage4");
        r8 = A02(r4, r36, r2, r47);
        X.DI8.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0235, code lost:
    
        if (r7 != 1) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0237, code lost:
    
        if (r9 != 1) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0239, code lost:
    
        X.DI8.A01("qpl.cr.composite.ReadHigherGuaranteeResilientMarkerStorage");
        r4.A00 = 1;
        r32 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0245, code lost:
    
        r36.seek(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0250, code lost:
    
        if (r36.readInt() == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0252, code lost:
    
        r8 = new X.DIS[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025c, code lost:
    
        if (r36.getFilePointer() >= r47) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x025e, code lost:
    
        r31 = r36.readInt();
        r2 = X.DIz.A01.get(new X.DJD(r31, r36.readInt()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0275, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0277, code lost:
    
        r8 = (X.DIS[]) r32.toArray(new X.DIS[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0283, code lost:
    
        r7 = (X.DIY) r2.A04.getValue();
        r30 = r36.readInt();
        r29 = r36.readInt();
        X.C7384Etj.A0Y(r7, 0);
        r2 = r7.A00;
        r2 = r2 * r7.A02;
        r12 = r36.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, r36.getFilePointer(), r2);
        X.C7384Etj.A0X(r12);
        r2 = 0;
        r20 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02ba, code lost:
    
        r12.position(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c7, code lost:
    
        if ((r12.position() + r2) > r12.limit()) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02c9, code lost:
    
        r11 = r12.position();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02d1, code lost:
    
        if (r12.get() == 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d3, code lost:
    
        r2 = (r12.position() + r2) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02db, code lost:
    
        r10 = new X.DIS(r7.A01, r12.getInt(), -1);
        r10.A02("qpl_cr_schema_version", r7.A03);
        r2 = r7.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f0, code lost:
    
        if (r2 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02f2, code lost:
    
        r2 = X.AGH.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02f6, code lost:
    
        r16 = r2.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0302, code lost:
    
        if (r16.hasNext() == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0304, code lost:
    
        r2 = (java.util.Map.Entry) r16.next();
        r9 = (java.lang.String) r2.getKey();
        r8 = (X.AbstractC4959DId) r2.getValue();
        r12.position(r8.A00 + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0320, code lost:
    
        if (r12.get() != 1) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0322, code lost:
    
        r3 = r8.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x032a, code lost:
    
        if (java.lang.String.class.equals(r3) == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x032c, code lost:
    
        r3 = new byte[((X.DJ1) r8).A00];
        r12.get(r3);
        r10.A04(r9, X.C7BY.A0F(new java.lang.String(r3, X.DCl.A05)).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x034e, code lost:
    
        if (java.lang.Integer.class.equals(r3) == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0350, code lost:
    
        r10.A02(r9, r12.getInt());
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0642  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C4965DIt... r59) {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DIO.A05(X.DIt[]):void");
    }

    public static final DIO A01() {
        if (A06 == null) {
            synchronized (DIO.class) {
                if (A06 == null) {
                    A06 = new DIO();
                }
            }
        }
        DIO dio = A06;
        C7384Etj.A0X(dio);
        return dio;
    }
}
