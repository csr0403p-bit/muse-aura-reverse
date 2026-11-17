package X;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.E3n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6386E3n implements InterfaceC5458Dit {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public InterfaceC6413E4p A04;
    public C6420E4w A05;
    public C6391E3t A06;
    public boolean A07;
    public C6391E3t[] A08;
    public int A09;
    public int A0A;
    public int A0B;
    public final E1P A0C;
    public final E5P A0D;
    public final InterfaceC5885DrL A0E;
    public final boolean A0F;

    @Deprecated
    public C6386E3n() {
        this(InterfaceC5885DrL.A00, 1);
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A0B = 0;
        if (this.A0F) {
            interfaceC6413E4p = new C6195Dxf(interfaceC6413E4p, this.A0E);
        }
        this.A04 = interfaceC6413E4p;
        this.A03 = -1L;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Override // X.InterfaceC5458Dit
    public final int AZ4(E2K e2k, C5542DkK c5542DkK) throws ParserException {
        boolean z;
        String strA0H;
        int iA06;
        String str;
        String str2;
        long jAIu;
        int i;
        long jAIu2;
        long j;
        C6391E3t c6391E3t;
        long j2 = this.A03;
        if (j2 != -1) {
            long jAIu3 = e2k.AIu();
            if (j2 < jAIu3 || j2 > 262144 + jAIu3) {
                c5542DkK.A00 = j2;
                z = true;
            } else {
                e2k.Afm((int) (j2 - jAIu3));
                z = false;
            }
        } else {
            z = false;
        }
        this.A03 = -1L;
        if (z) {
            return 1;
        }
        int i2 = 6;
        switch (this.A0B) {
            case 0:
                if (!Afs(e2k)) {
                    strA0H = "AVI Header List not found";
                    throw BV6.A0V(strA0H, null);
                }
                e2k.Afm(12);
                this.A0B = 1;
                return 0;
            case 1:
                E1P e1p = this.A0C;
                e2k.readFully(e1p.A02, 0, 12);
                e1p.A0R(0);
                E5P e5p = this.A0D;
                iA06 = e1p.A06();
                e5p.A00 = iA06;
                int iA062 = e1p.A06();
                e5p.A01 = iA062;
                if (iA06 != 1414744396) {
                    str = "LIST expected, found: ";
                    strA0H = C60O.A0y(str, iA06).toString();
                    throw BV6.A0V(strA0H, null);
                }
                int iA063 = e1p.A06();
                if (iA063 != 1819436136) {
                    strA0H = FGI.A0H("hdrl expected, found: ", iA063);
                    throw BV6.A0V(strA0H, null);
                }
                this.A09 = iA062;
                i2 = 2;
                this.A0B = i2;
                return 0;
            case 2:
                C6385E3m c6385E3mA00 = C6385E3m.A00(E2K.A00(e2k, this.A09 - 4), 1819436136);
                iA06 = c6385E3mA00.A00;
                if (iA06 != 1819436136) {
                    str = "Unexpected header list type ";
                    strA0H = C60O.A0y(str, iA06).toString();
                    throw BV6.A0V(strA0H, null);
                }
                C6420E4w c6420E4w = (C6420E4w) c6385E3mA00.A01(C6420E4w.class);
                if (c6420E4w == null) {
                    strA0H = "AviHeader not found";
                    throw BV6.A0V(strA0H, null);
                }
                this.A05 = c6420E4w;
                this.A00 = c6420E4w.A02 * c6420E4w.A01;
                ArrayList arrayListA0h = C3cG.A0h();
                AbstractC7489Ext<E5W> it = c6385E3mA00.A01.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    E5W next = it.next();
                    if (next.AM8() == 1819440243) {
                        C6385E3m c6385E3m = (C6385E3m) next;
                        int i4 = i3 + 1;
                        E4E e4e = (E4E) c6385E3m.A01(E4E.class);
                        E52 e52 = (E52) c6385E3m.A01(E52.class);
                        if (e4e == null) {
                            str2 = "Missing Stream Header";
                        } else if (e52 == null) {
                            str2 = "Missing Stream Format";
                        } else {
                            long jA0F = Util.A0F(RoundingMode.DOWN, e4e.A00, e4e.A03 * 1000000, e4e.A01);
                            C6154Dwx c6154Dwx = e52.A00;
                            C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
                            c6162Dx5A01.A0W = Integer.toString(i3);
                            int i5 = e4e.A05;
                            if (i5 != 0) {
                                c6162Dx5A01.A0C = i5;
                            }
                            E5E e5e = (E5E) c6385E3m.A01(E5E.class);
                            if (e5e != null) {
                                c6162Dx5A01.A0X = e5e.A00;
                            }
                            int iA01 = AbstractC6161Dx4.A01(c6154Dwx.A0b);
                            if (iA01 == 1 || iA01 == 2) {
                                InterfaceC5563Dkg interfaceC5563DkgAhC = this.A04.AhC(i3, iA01);
                                InterfaceC5563Dkg.A00(c6162Dx5A01, interfaceC5563DkgAhC);
                                interfaceC5563DkgAhC.A9m(jA0F);
                                this.A00 = Math.max(this.A00, jA0F);
                                arrayListA0h.add(new C6391E3t(interfaceC5563DkgAhC, e4e, i3));
                            }
                            i3 = i4;
                        }
                        CNC.A04("AviExtractor", str2);
                        i3 = i4;
                    }
                }
                this.A08 = (C6391E3t[]) arrayListA0h.toArray(new C6391E3t[0]);
                this.A04.AAe();
                i2 = 3;
                this.A0B = i2;
                return 0;
            case 3:
                jAIu = this.A02;
                if (jAIu == -1 || e2k.AIu() == jAIu) {
                    E1P e1p2 = this.A0C;
                    E2K.A01(e1p2, e2k, 12);
                    e2k.AbN();
                    e1p2.A0R(0);
                    E5P e5p2 = this.A0D;
                    int iA064 = e1p2.A06();
                    e5p2.A00 = iA064;
                    int iA065 = e1p2.A06();
                    e5p2.A01 = iA065;
                    int iA066 = e1p2.A06();
                    if (iA064 == 1179011410) {
                        e2k.Afm(12);
                        return 0;
                    }
                    if (iA064 == 1414744396 && iA066 == 1769369453) {
                        long jAIu4 = e2k.AIu();
                        this.A02 = jAIu4;
                        this.A01 = jAIu4 + iA065 + 8;
                        if (!this.A07) {
                            C6420E4w c6420E4w2 = this.A05;
                            c6420E4w2.getClass();
                            if ((c6420E4w2.A00 & 16) == 16) {
                                this.A0B = 4;
                                jAIu = this.A01;
                            } else {
                                E2A.A00(this.A04, this.A00);
                                this.A07 = true;
                            }
                        }
                        this.A03 = e2k.AIu() + 12;
                        this.A0B = i2;
                        return 0;
                    }
                    jAIu = e2k.AIu() + iA065 + 8;
                }
                this.A03 = jAIu;
                return 0;
            case 4:
                E1P e1p3 = this.A0C;
                e2k.readFully(e1p3.A02, 0, 8);
                e1p3.A0R(0);
                int iA067 = e1p3.A06();
                int iA068 = e1p3.A06();
                if (iA067 == 829973609) {
                    this.A0B = 5;
                    this.A0A = iA068;
                    return 0;
                }
                jAIu = e2k.AIu() + iA068;
                this.A03 = jAIu;
                return 0;
            case 5:
                E1P e1pA00 = E2K.A00(e2k, this.A0A);
                if (e1pA00.A04() >= 16) {
                    int i6 = e1pA00.A01;
                    e1pA00.A0S(8);
                    long jA06 = e1pA00.A06();
                    long j3 = this.A02;
                    j = jA06 <= j3 ? 8 + j3 : 0L;
                    e1pA00.A0R(i6);
                }
                while (true) {
                    if (e1pA00.A04() < 16) {
                        C6391E3t[] c6391E3tArr = this.A08;
                        int length = c6391E3tArr.length;
                        while (i < length) {
                            C6391E3t c6391E3t2 = c6391E3tArr[i];
                            c6391E3t2.A08 = Arrays.copyOf(c6391E3t2.A08, c6391E3t2.A05);
                            c6391E3t2.A07 = Arrays.copyOf(c6391E3t2.A07, c6391E3t2.A05);
                            if ((c6391E3t2.A0A & 1651965952) == 1651965952 && c6391E3t2.A0D.A02 != 0 && (i = c6391E3t2.A05) > 0) {
                                c6391E3t2.A01 = i;
                            }
                            i++;
                        }
                        this.A07 = true;
                        int length2 = this.A08.length;
                        InterfaceC6413E4p interfaceC6413E4p = this.A04;
                        long j4 = this.A00;
                        interfaceC6413E4p.AcM(length2 == 0 ? new E2A(j4, 0L) : new E4F(this, j4));
                        this.A0B = 6;
                        jAIu = this.A02;
                        this.A03 = jAIu;
                        return 0;
                    }
                    int iA069 = e1pA00.A06();
                    int iA0610 = e1pA00.A06();
                    long jA062 = e1pA00.A06() + j;
                    e1pA00.A0S(4);
                    for (C6391E3t c6391E3t3 : this.A08) {
                        if (c6391E3t3.A0A == iA069 || c6391E3t3.A09 == iA069) {
                            i = (iA0610 & 16) == 16 ? 1 : 0;
                            if (c6391E3t3.A06 == -1) {
                                c6391E3t3.A06 = jA062;
                            }
                            if (i != 0) {
                                int i7 = c6391E3t3.A05;
                                int[] iArrCopyOf = c6391E3t3.A07;
                                if (i7 == iArrCopyOf.length) {
                                    long[] jArr = c6391E3t3.A08;
                                    c6391E3t3.A08 = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                    int[] iArr = c6391E3t3.A07;
                                    iArrCopyOf = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    c6391E3t3.A07 = iArrCopyOf;
                                }
                                long[] jArr2 = c6391E3t3.A08;
                                int i8 = c6391E3t3.A05;
                                jArr2[i8] = jA062;
                                iArrCopyOf[i8] = c6391E3t3.A04;
                                c6391E3t3.A05 = i8 + 1;
                            }
                            c6391E3t3.A04++;
                        }
                    }
                }
                break;
            default:
                long jAIu5 = e2k.AIu();
                if (jAIu5 >= this.A01) {
                    return -1;
                }
                C6391E3t c6391E3t4 = this.A06;
                if (c6391E3t4 == null) {
                    if ((jAIu5 & 1) == 1) {
                        e2k.Afm(1);
                    }
                    E1P e1p4 = this.A0C;
                    e2k.AXi(e1p4.A02, 0, 12);
                    e1p4.A0R(0);
                    int iA0611 = e1p4.A06();
                    if (iA0611 == 1414744396) {
                        e1p4.A0R(8);
                        e2k.Afm(e1p4.A06() != 1769369453 ? 8 : 12);
                        e2k.AbN();
                        return 0;
                    }
                    int iA0612 = e1p4.A06();
                    if (iA0611 == 1263424842) {
                        jAIu2 = e2k.AIu() + iA0612;
                        j = 8;
                    } else {
                        e2k.Afm(8);
                        e2k.AbN();
                        C6391E3t[] c6391E3tArr2 = this.A08;
                        int length3 = c6391E3tArr2.length;
                        for (int i9 = 0; i9 < length3; i9++) {
                            c6391E3t = c6391E3tArr2[i9];
                            if (c6391E3t.A0A == iA0611 || c6391E3t.A09 == iA0611) {
                                c6391E3t.A03 = iA0612;
                                c6391E3t.A00 = iA0612;
                            }
                        }
                        jAIu2 = e2k.AIu();
                        j = iA0612;
                    }
                    this.A03 = jAIu2 + j;
                    return 0;
                }
                int i10 = c6391E3t4.A00;
                InterfaceC5563Dkg interfaceC5563Dkg = c6391E3t4.A0C;
                int iAbu = i10 - interfaceC5563Dkg.Abu(e2k, i10, false);
                c6391E3t4.A00 = iAbu;
                if (iAbu != 0) {
                    return 0;
                }
                if (c6391E3t4.A03 > 0) {
                    int i11 = c6391E3t4.A02;
                    interfaceC5563Dkg.Abz(null, C8j3.A1Q(Arrays.binarySearch(c6391E3t4.A07, i11)) ? 1 : 0, c6391E3t4.A03, 0, (c6391E3t4.A0B * i11) / c6391E3t4.A01);
                }
                c6391E3t4.A02++;
                c6391E3t = null;
                this.A06 = c6391E3t;
                return 0;
        }
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A03 = -1L;
        this.A06 = null;
        int i = 0;
        for (C6391E3t c6391E3t : this.A08) {
            if (c6391E3t.A05 == 0) {
                c6391E3t.A02 = 0;
            } else {
                c6391E3t.A02 = c6391E3t.A07[Util.A08(c6391E3t.A08, j, true)];
            }
        }
        if (j != 0) {
            i = 6;
        } else if (this.A08.length != 0) {
            i = 3;
        }
        this.A0B = i;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        E1P e1p = this.A0C;
        e2k.AXi(e1p.A02, 0, 12);
        e1p.A0R(0);
        if (e1p.A06() != 1179011410) {
            return false;
        }
        e1p.A0S(4);
        return e1p.A06() == 541677121;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    public C6386E3n(InterfaceC5885DrL interfaceC5885DrL, int i) {
        this.A0E = interfaceC5885DrL;
        this.A0F = (i & 1) == 0;
        this.A0C = BV6.A0Y(12);
        this.A0D = new E5P();
        this.A04 = new C5552DkV();
        this.A08 = new C6391E3t[0];
        this.A02 = -1L;
        this.A01 = -1L;
        this.A09 = -1;
        this.A00 = -9223372036854775807L;
    }
}
