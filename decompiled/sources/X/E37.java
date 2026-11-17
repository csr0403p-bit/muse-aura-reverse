package X;

import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class E37 implements InterfaceC5458Dit {
    public InterfaceC6413E4p A00;
    public E5R A01;
    public boolean A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final E3J A09 = new E3J(0);
    public final E1P A08 = BV6.A0Y(4096);
    public final SparseArray<E4J> A07 = BV4.A0B();
    public final E3N A0A = new E3N();

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Override // X.InterfaceC5458Dit
    public final int AZ4(E2K e2k, C5542DkK c5542DkK) {
        int iA05;
        int iA0D;
        InterfaceC6401E4d c6384E3l;
        InterfaceC5509Djl e2a;
        long j;
        long jA00;
        long jA002;
        InterfaceC6413E4p interfaceC6413E4p = this.A00;
        C1G.A05(interfaceC6413E4p);
        long length = e2k.getLength();
        if (length != -1) {
            E3N e3n = this.A0A;
            if (!e3n.A03) {
                if (!e3n.A05) {
                    int iA01 = BV4.A01(20000L, length);
                    j = length - iA01;
                    if (e2k.AIu() == j) {
                        E1P e1p = e3n.A06;
                        e1p.A0P(iA01);
                        e2k.AbN();
                        e2k.AXi(e1p.A02, 0, iA01);
                        int i = e1p.A01;
                        int i2 = e1p.A00 - 4;
                        while (true) {
                            if (i2 < i) {
                                jA002 = -9223372036854775807L;
                                break;
                            }
                            if (BV8.A0E(e1p.A02, i2) == 442) {
                                e1p.A0R(i2 + 4);
                                jA002 = E3N.A00(e1p);
                                if (jA002 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i2--;
                        }
                        e3n.A02 = jA002;
                        e3n.A05 = true;
                        return 0;
                    }
                    c5542DkK.A00 = j;
                    return 1;
                }
                if (e3n.A02 == -9223372036854775807L) {
                    e3n.A06.A0T(Util.A07, 0);
                    e3n.A03 = true;
                    e2k.AbN();
                } else {
                    if (!e3n.A04) {
                        int iA012 = BV4.A01(20000L, length);
                        j = 0;
                        if (e2k.AIu() == 0) {
                            E1P e1p2 = e3n.A06;
                            e1p2.A0P(iA012);
                            e2k.AbN();
                            E2K.A01(e1p2, e2k, iA012);
                            int i3 = e1p2.A01;
                            int i4 = e1p2.A00;
                            while (true) {
                                if (i3 >= i4 - 3) {
                                    jA00 = -9223372036854775807L;
                                    break;
                                }
                                if (BV8.A0E(e1p2.A02, i3) == 442) {
                                    e1p2.A0R(i3 + 4);
                                    jA00 = E3N.A00(e1p2);
                                    if (jA00 != -9223372036854775807L) {
                                        break;
                                    }
                                }
                                i3++;
                            }
                            e3n.A01 = jA00;
                            e3n.A04 = true;
                        }
                        c5542DkK.A00 = j;
                        return 1;
                    }
                    long j2 = e3n.A01;
                    if (j2 != -9223372036854775807L) {
                        E3J e3j = e3n.A07;
                        e3n.A00 = e3j.A04(e3n.A02) - e3j.A03(j2);
                    }
                    e3n.A06.A0T(Util.A07, 0);
                    e3n.A03 = true;
                    e2k.AbN();
                }
                return 0;
            }
        }
        if (!this.A02) {
            this.A02 = true;
            E3N e3n2 = this.A0A;
            long j3 = e3n2.A00;
            if (j3 != -9223372036854775807L) {
                E5R e5r = new E5R(new E5X(), new E3D(e3n2.A07), 1000, j3, j3 + 1, 0L, length, 188L);
                this.A01 = e5r;
                e2a = e5r.A01;
            } else {
                e2a = new E2A(j3, 0L);
            }
            interfaceC6413E4p.AcM(e2a);
        }
        E5R e5r2 = this.A01;
        if (e5r2 != null && e5r2.A00 != null) {
            return e5r2.A00(e2k, c5542DkK);
        }
        e2k.AbN();
        long jAIf = length != -1 ? length - e2k.AIf() : -1L;
        if (jAIf != -1 && jAIf < 4) {
            return -1;
        }
        E1P e1p3 = this.A08;
        if (!e2k.AXj(e1p3.A02, 0, 4, true) || (iA05 = BV6.A05(e1p3, 0)) == 441) {
            return -1;
        }
        if (iA05 == 442) {
            e2k.AXi(e1p3.A02, 0, 10);
            e1p3.A0R(9);
            iA0D = (e1p3.A0A() & 7) + 14;
        } else if (iA05 == 443) {
            E2K.A01(e1p3, e2k, 2);
            e1p3.A0R(0);
            iA0D = e1p3.A0D() + 6;
        } else {
            if (((iA05 & (-256)) >> 8) != 1) {
                e2k.Afm(1);
                return 0;
            }
            int i5 = iA05 & 255;
            SparseArray<E4J> sparseArray = this.A07;
            E4J e4j = sparseArray.get(i5);
            if (!this.A04) {
                if (e4j == null) {
                    if (i5 == 189) {
                        c6384E3l = new E2W(null, 0, "video/mp2p");
                    } else if ((iA05 & 224) == 192) {
                        c6384E3l = new E2F(null, 0, "video/mp2p");
                    } else if ((iA05 & 240) == 224) {
                        c6384E3l = new C6384E3l(null, "video/mp2p");
                        this.A06 = true;
                        this.A03 = e2k.AIu();
                        c6384E3l.A84(this.A00, new E4I(Integer.MIN_VALUE, i5, 256));
                        e4j = new E4J(this.A09, c6384E3l);
                        sparseArray.put(i5, e4j);
                    }
                    this.A05 = true;
                    this.A03 = e2k.AIu();
                    c6384E3l.A84(this.A00, new E4I(Integer.MIN_VALUE, i5, 256));
                    e4j = new E4J(this.A09, c6384E3l);
                    sparseArray.put(i5, e4j);
                }
                if (e2k.AIu() > ((this.A05 && this.A06) ? this.A03 + 8192 : 1048576L)) {
                    this.A04 = true;
                    this.A00.AAe();
                }
            }
            E2K.A01(e1p3, e2k, 2);
            e1p3.A0R(0);
            iA0D = e1p3.A0D() + 6;
            if (e4j != null) {
                e1p3.A0P(iA0D);
                e2k.readFully(e1p3.A02, 0, iA0D);
                e1p3.A0R(6);
                C6340E1q c6340E1q = e4j.A03;
                e1p3.A0U(c6340E1q.A03, 0, 3);
                c6340E1q.A0B(0);
                e4j.A01 = C6340E1q.A05(c6340E1q, 8);
                e4j.A00 = c6340E1q.A0I();
                e1p3.A0U(c6340E1q.A03, 0, C6340E1q.A01(c6340E1q, 6, 8));
                c6340E1q.A0B(0);
                long jA03 = 0;
                if (e4j.A01) {
                    c6340E1q.A0C(4);
                    c6340E1q.A0C(1);
                    long jA02 = C6340E1q.A02(c6340E1q, c6340E1q.A08(3) << 30);
                    if (!e4j.A02 && e4j.A00) {
                        c6340E1q.A0C(1);
                        e4j.A04.A03(C6340E1q.A02(c6340E1q, C6340E1q.A01(c6340E1q, 4, 3) << 30));
                        e4j.A02 = true;
                    }
                    jA03 = e4j.A04.A03(jA02);
                }
                InterfaceC6401E4d interfaceC6401E4d = e4j.A05;
                interfaceC6401E4d.AXZ(jA03, 4);
                interfaceC6401E4d.A6w(e1p3);
                interfaceC6401E4d.AXY(false);
                e1p3.A0Q(e1p3.A02.length);
                return 0;
            }
        }
        e2k.Afm(iA0D);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AcL(long r8, long r10) {
        /*
            r7 = this;
            X.E3J r6 = r7.A09
            long r3 = r6.A01()
            r5 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L22
            long r3 = r6.A00()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L25
        L22:
            r6.A05(r10)
        L25:
            X.E5R r0 = r7.A01
            if (r0 == 0) goto L2c
            r0.A01(r10)
        L2c:
            android.util.SparseArray<X.E4J> r1 = r7.A07
            int r0 = r1.size()
            if (r5 >= r0) goto L45
            java.lang.Object r1 = r1.valueAt(r5)
            X.E4J r1 = (X.E4J) r1
            r0 = 0
            r1.A02 = r0
            X.E4d r0 = r1.A05
            r0.AcK()
            int r5 = r5 + 1
            goto L2c
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E37.AcL(long, long):void");
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        byte[] bArr = new byte[14];
        e2k.AXi(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            e2k.A47(bArr[13] & 7);
            e2k.AXi(bArr, 0, 3);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A00 = interfaceC6413E4p;
    }
}
