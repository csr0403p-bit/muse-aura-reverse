package X;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class E2S implements InterfaceC5458Dit, InterfaceC5509Djl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public E1P A0B;
    public InterfaceC6413E4p A0C;
    public ImmutableList<DQC> A0D;
    public boolean A0E;
    public boolean A0F;
    public E3R[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final E1P A0J;
    public final E1P A0K;
    public final E1P A0L;
    public final E1P A0M;
    public final C6410E4m A0N;
    public final ArrayDeque<C6358E2k> A0O;
    public final List<InterfaceC5403Dhw> A0P;
    public final InterfaceC5885DrL A0Q;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        DQC dqcA00 = AbstractC6360E2m.A00(e2k, false);
        this.A0D = dqcA00 != null ? ImmutableList.of(dqcA00) : ImmutableList.of();
        return dqcA00 == null;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Deprecated
    public E2S() {
        this(InterfaceC5885DrL.A00, 16);
    }

    private void A00(long j) throws ParserException, NumberFormatException {
        C5402Dhv c5402DhvA04;
        int i;
        while (true) {
            ArrayDeque<C6358E2k> arrayDeque = this.A0O;
            if (arrayDeque.isEmpty() || arrayDeque.peek().A00 != j) {
                break;
            }
            C6358E2k c6358E2kPop = arrayDeque.pop();
            if (((AbstractC6398E4a) c6358E2kPop).A00 == 1836019574) {
                C6358E2k c6358E2kA00 = c6358E2kPop.A00(1835365473);
                C5402Dhv c5402DhvA03 = c6358E2kA00 != null ? E2Q.A03(c6358E2kA00) : null;
                ArrayList arrayListA0h = C3cG.A0h();
                boolean zA1Q = AnonymousClass002.A1Q(this.A02, 1);
                C6361E2n c6361E2n = new C6361E2n();
                C6419E4v c6419E4vA01 = c6358E2kPop.A01(1969517665);
                if (c6419E4vA01 != null) {
                    c5402DhvA04 = E2Q.A04(c6419E4vA01);
                    c6361E2n.A00(c5402DhvA04);
                } else {
                    c5402DhvA04 = null;
                }
                C5402Dhv c5402DhvA00 = C5402Dhv.A00(c6358E2kPop);
                int i2 = this.A0I;
                ArrayList arrayListA09 = E2Q.A09(null, c6358E2kPop, c6361E2n, new F5K(8), -9223372036854775807L, zA1Q);
                String strA00 = E22.A00(arrayListA09);
                int size = -1;
                int i3 = 0;
                int i4 = 0;
                long jMax = -9223372036854775807L;
                while (i4 < arrayListA09.size()) {
                    C6366E2t c6366E2t = (C6366E2t) arrayListA09.get(i4);
                    if (c6366E2t.A01 == 0) {
                        i = i3;
                    } else {
                        E3P e3p = c6366E2t.A03;
                        i = i3 + 1;
                        E3R e3r = new E3R(this.A0C.AhC(i3, e3p.A03), e3p, c6366E2t);
                        long j2 = e3p.A04 != -9223372036854775807L ? e3p.A04 : c6366E2t.A02;
                        InterfaceC5563Dkg interfaceC5563Dkg = e3r.A01;
                        interfaceC5563Dkg.A9m(j2);
                        jMax = Math.max(jMax, j2);
                        boolean zEquals = "audio/true-hd".equals(e3p.A08.A0b);
                        int i5 = c6366E2t.A00;
                        int i6 = i5 + 30;
                        if (zEquals) {
                            i6 = i5 * 16;
                        }
                        C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(e3p.A08);
                        c6162Dx5A01.A0C = i6;
                        if (e3p.A03 == 2) {
                            int i7 = e3p.A08.A0J;
                            if ((i2 & 8) != 0) {
                                i7 |= size == -1 ? 1 : 2;
                            }
                            c6162Dx5A01.A0H = i7;
                        }
                        int i8 = e3p.A03;
                        E2L.A01(c6162Dx5A01, c6361E2n, i8);
                        C5402Dhv c5402Dhv = e3p.A08.A0U;
                        List<InterfaceC5403Dhw> list = this.A0P;
                        E2L.A00(c6162Dx5A01, c5402DhvA03, c5402Dhv, new C5402Dhv[]{list.isEmpty() ? null : new C5402Dhv(list), c5402DhvA04, c5402DhvA00}, i8);
                        c6162Dx5A01.A05(strA00);
                        InterfaceC5563Dkg.A00(c6162Dx5A01, interfaceC5563Dkg);
                        if (e3p.A03 == 2 && size == -1) {
                            size = arrayListA0h.size();
                        }
                        arrayListA0h.add(e3r);
                    }
                    i4++;
                    i3 = i;
                }
                this.A03 = size;
                this.A0A = jMax;
                E3R[] e3rArr = (E3R[]) arrayListA0h.toArray(new E3R[0]);
                this.A0G = e3rArr;
                int length = e3rArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i9 = 0; i9 < length; i9++) {
                    jArr[i9] = new long[e3rArr[i9].A04.A01];
                    jArr2[i9] = e3rArr[i9].A04.A07[0];
                }
                long j3 = 0;
                int i10 = 0;
                while (i10 < length) {
                    long j4 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                    int i11 = -1;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (!zArr[i12]) {
                            long j5 = jArr2[i12];
                            if (j5 <= j4) {
                                i11 = i12;
                                j4 = j5;
                            }
                        }
                    }
                    int i13 = iArr[i11];
                    long[] jArr3 = jArr[i11];
                    jArr3[i13] = j3;
                    C6366E2t c6366E2t2 = e3rArr[i11].A04;
                    j3 += c6366E2t2.A05[i13];
                    int i14 = i13 + 1;
                    iArr[i11] = i14;
                    if (i14 < jArr3.length) {
                        jArr2[i11] = c6366E2t2.A07[i14];
                    } else {
                        zArr[i11] = true;
                        i10++;
                    }
                }
                this.A0H = jArr;
                this.A0C.AAe();
                this.A0C.AcM(this);
                arrayDeque.clear();
                this.A04 = 2;
            } else if (!arrayDeque.isEmpty()) {
                arrayDeque.peek().A01.add(c6358E2kPop);
            }
        }
        if (this.A04 != 2) {
            this.A04 = 0;
            this.A00 = 0;
        }
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r7 == (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        r5 = java.lang.Math.min(r14.A06[r3], r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[EDGE_INSN: B:56:0x00bf->B:50:0x00bf BREAK  A[LOOP:1: B:25:0x0058->B:46:0x00a5], SYNTHETIC] */
    @Override // X.InterfaceC5509Djl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.DkQ AK7(long r18) {
        /*
            r17 = this;
            r13 = r17
            X.E3R[] r3 = r13.A0G
            int r0 = r3.length
            if (r0 == 0) goto L31
            r12 = -1
            int r2 = r13.A03
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r18
            if (r2 == r12) goto Lb1
            r2 = r3[r2]
            X.E2t r8 = r2.A04
            long[] r3 = r8.A07
            r2 = 0
            int r7 = androidx.media3.common.util.Util.A08(r3, r0, r2)
        L1e:
            if (r7 < 0) goto L2b
            int[] r2 = r8.A04
            r2 = r2[r7]
            r2 = r2 & 1
            if (r2 != 0) goto L39
            int r7 = r7 + (-1)
            goto L1e
        L2b:
            int r7 = r8.A00(r0)
            if (r7 != r12) goto L39
        L31:
            X.E29 r3 = X.E29.A02
        L33:
            X.DkQ r0 = new X.DkQ
            r0.<init>(r3, r3)
            return r0
        L39:
            long[] r4 = r8.A07
            r9 = r4[r7]
            long[] r3 = r8.A06
            r5 = r3[r7]
            int r2 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r2 >= 0) goto Lb7
            int r2 = r8.A01
            int r2 = r2 + (-1)
            if (r7 >= r2) goto Lb7
            int r0 = r8.A00(r0)
            if (r0 == r12) goto Lb7
            if (r0 == r7) goto Lb7
            r7 = r4[r0]
            r1 = r3[r0]
        L57:
            r11 = 0
        L58:
            X.E3R[] r3 = r13.A0G
            int r0 = r3.length
            if (r11 >= r0) goto Lbf
            int r0 = r13.A03
            if (r11 == r0) goto La5
            r0 = r3[r11]
            X.E2t r14 = r0.A04
            long[] r0 = r14.A07
            r15 = 0
            int r3 = androidx.media3.common.util.Util.A08(r0, r9, r15)
        L6c:
            if (r3 < 0) goto L79
            int[] r0 = r14.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L96
            int r3 = r3 + (-1)
            goto L6c
        L79:
            int r3 = r14.A00(r9)
            if (r3 != r12) goto L96
        L7f:
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 == 0) goto La5
            long[] r0 = r14.A07
            int r3 = androidx.media3.common.util.Util.A08(r0, r7, r15)
        L89:
            if (r3 < 0) goto L9f
            int[] r0 = r14.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto La8
            int r3 = r3 + (-1)
            goto L89
        L96:
            long[] r0 = r14.A06
            r3 = r0[r3]
            long r5 = java.lang.Math.min(r3, r5)
            goto L7f
        L9f:
            int r3 = r14.A00(r7)
            if (r3 != r12) goto La8
        La5:
            int r11 = r11 + 1
            goto L58
        La8:
            long[] r0 = r14.A06
            r3 = r0[r3]
            long r1 = java.lang.Math.min(r3, r1)
            goto La5
        Lb1:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r0
        Lb7:
            r1 = -1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L57
        Lbf:
            X.E29 r3 = new X.E29
            r3.<init>(r9, r5)
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 == 0) goto L33
            X.DkQ r0 = X.DkQ.A00(r3, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2S.AK7(long):X.DkQ");
    }

    @Override // X.InterfaceC5458Dit
    public final /* bridge */ /* synthetic */ List AKl() {
        return this.A0D;
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        if ((this.A0I & 16) == 0) {
            interfaceC6413E4p = new C6195Dxf(interfaceC6413E4p, this.A0Q);
        }
        this.A0C = interfaceC6413E4p;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[PHI: r1
  0x0065: PHI (r1v6 boolean) = (r1v8 boolean), (r1v9 boolean) binds: [B:20:0x0063, B:18:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r27, X.C5542DkK r28) throws androidx.media3.common.ParserException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2S.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        this.A0E = false;
        if (j == 0) {
            this.A04 = 0;
            this.A00 = 0;
            return;
        }
        for (E3R e3r : this.A0G) {
            C6366E2t c6366E2t = e3r.A04;
            int iA08 = Util.A08(c6366E2t.A07, j2, false);
            while (true) {
                if (iA08 < 0) {
                    iA08 = c6366E2t.A00(j2);
                    break;
                } else if ((c6366E2t.A04[iA08] & 1) != 0) {
                    break;
                } else {
                    iA08--;
                }
            }
            e3r.A00 = iA08;
            E3U e3u = e3r.A02;
            if (e3u != null) {
                e3u.A01 = false;
                e3u.A00 = 0;
            }
        }
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }

    public E2S(InterfaceC5885DrL interfaceC5885DrL, int i) {
        this.A0Q = interfaceC5885DrL;
        this.A0I = i;
        this.A0D = ImmutableList.of();
        this.A04 = 0;
        this.A0N = new C6410E4m();
        this.A0P = C3cG.A0h();
        this.A0J = BV6.A0Y(16);
        this.A0O = BV4.A0s();
        this.A0L = BV6.A0Z(AbstractC6381E3i.A01);
        this.A0K = BV6.A0Y(6);
        this.A0M = BV6.A0X();
        this.A08 = -1;
        this.A0C = InterfaceC6413E4p.A00;
        this.A0G = new E3R[0];
    }
}
