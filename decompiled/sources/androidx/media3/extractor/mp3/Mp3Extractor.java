package androidx.media3.extractor.mp3;

import X.AbstractC6411E4n;
import X.BV6;
import X.C5402Dhv;
import X.C5551DkU;
import X.C60Q;
import X.C6361E2n;
import X.E1P;
import X.E26;
import X.E2C;
import X.E2H;
import X.E2K;
import X.E2M;
import X.E2V;
import X.E5T;
import X.InterfaceC5403Dhw;
import X.InterfaceC5458Dit;
import X.InterfaceC5563Dkg;
import X.InterfaceC6413E4p;
import X.InterfaceC6418E4u;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.util.List;

/* loaded from: classes5.dex */
public final class Mp3Extractor implements InterfaceC5458Dit {
    public static final E5T A0K = new E5T() { // from class: X.E5J
        @Override // X.E5T
        public final boolean AAs(int i, int i2, int i3, int i4, int i5) {
            if (i2 == 67) {
                if (i3 == 79 && i4 == 77) {
                    return i5 == 77 || i == 2;
                }
                return false;
            }
            if (i2 == 77 && i3 == 76 && i4 == 76) {
                return i5 == 84 || i == 2;
            }
            return false;
        }
    };
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C5402Dhv A07;
    public InterfaceC6413E4p A08;
    public InterfaceC5563Dkg A09;
    public InterfaceC5563Dkg A0A;
    public InterfaceC6418E4u A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final E1P A0F;
    public final C6361E2n A0G;
    public final E2M A0H;
    public final E2H A0I;
    public final InterfaceC5563Dkg A0J;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A05 = 0L;
        this.A00 = 0;
        this.A06 = j2;
        InterfaceC6418E4u interfaceC6418E4u = this.A0B;
        if (!(interfaceC6418E4u instanceof E26) || ((E26) interfaceC6418E4u).A00(j2)) {
            return;
        }
        this.A0C = true;
        this.A09 = this.A0J;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        return A03(e2k, true);
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    public static long A00(C5402Dhv c5402Dhv) {
        if (c5402Dhv == null) {
            return -9223372036854775807L;
        }
        for (InterfaceC5403Dhw interfaceC5403Dhw : c5402Dhv.A01) {
            if (interfaceC5403Dhw instanceof E2V) {
                E2V e2v = (E2V) interfaceC5403Dhw;
                if (((AbstractC6411E4n) e2v).A00.equals("TLEN")) {
                    return Util.A0A(Long.parseLong(C60Q.A0n(e2v.A00, 0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private void A01() {
        InterfaceC6418E4u interfaceC6418E4u = this.A0B;
        if ((interfaceC6418E4u instanceof E2C) && interfaceC6418E4u.isSeekable()) {
            long j = this.A03;
            if (j == -1 || j == interfaceC6418E4u.AEb()) {
                return;
            }
            E2C e2c = (E2C) interfaceC6418E4u;
            this.A0B = new E2C(j, e2c.A00, e2c.A01, e2c.A02, e2c.A03);
            InterfaceC6413E4p interfaceC6413E4p = this.A08;
            interfaceC6413E4p.getClass();
            interfaceC6413E4p.AcM(this.A0B);
            InterfaceC5563Dkg interfaceC5563Dkg = this.A0A;
            interfaceC5563Dkg.getClass();
            interfaceC5563Dkg.A9m(this.A0B.AEy());
        }
    }

    private boolean A02(E2K e2k) {
        InterfaceC6418E4u interfaceC6418E4u = this.A0B;
        boolean z = true;
        if (interfaceC6418E4u != null) {
            long jAEb = interfaceC6418E4u.AEb();
            if (jAEb != -1 && e2k.AIf() > jAEb - 4) {
                return true;
            }
        }
        try {
            z = !e2k.AXj(this.A0F.A02, 0, 4, true);
            return z;
        } catch (EOFException unused) {
            return z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r16 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r15.Afm(r4 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r14.A01 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        r15.AbN();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A03(X.E2K r15, boolean r16) throws java.lang.NumberFormatException, java.io.EOFException {
        /*
            r14 = this;
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r16 == 0) goto L7
            r6 = 32768(0x8000, float:4.5918E-41)
        L7:
            r15.AbN()
            long r3 = r15.AIu()
            r1 = 0
            r5 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La4
            int r0 = r14.A0D
            r0 = r0 & 8
            if (r0 != 0) goto La0
            r1 = 0
        L1c:
            X.E2H r0 = r14.A0I
            X.Dhv r1 = r0.A00(r15, r1)
            r14.A07 = r1
            if (r1 == 0) goto L2b
            X.E2n r0 = r14.A0G
            r0.A00(r1)
        L2b:
            long r0 = r15.AIf()
            int r4 = (int) r0
            if (r16 != 0) goto L35
            r15.Afm(r4)
        L35:
            r10 = 0
        L36:
            r9 = 0
            r8 = 0
        L38:
            boolean r0 = r14.A02(r15)
            r7 = 1
            if (r0 == 0) goto L4a
            if (r9 > 0) goto L7a
            r14.A01()
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L4a:
            X.E1P r0 = r14.A0F
            int r11 = X.BV6.A05(r0, r5)
            if (r10 == 0) goto L60
            long r2 = (long) r10
            r0 = -128000(0xfffffffffffe0c00, float:NaN)
            r0 = r0 & r11
            long r0 = (long) r0
            r12 = -128000(0xfffffffffffe0c00, double:NaN)
            long r2 = r2 & r12
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L87
        L60:
            int r1 = X.E2N.A00(r11)
            r0 = -1
            if (r1 == r0) goto L87
            int r9 = r9 + 1
            if (r9 != r7) goto L77
            X.E2M r0 = r14.A0H
            r0.A00(r11)
            r10 = r11
        L71:
            int r0 = r1 + (-4)
            r15.A47(r0)
            goto L38
        L77:
            r0 = 4
            if (r9 != r0) goto L71
        L7a:
            if (r16 == 0) goto L83
            int r4 = r4 + r8
            r15.Afm(r4)
        L80:
            r14.A01 = r10
            return r7
        L83:
            r15.AbN()
            goto L80
        L87:
            int r1 = r8 + 1
            if (r8 != r6) goto L8e
            if (r16 == 0) goto La7
            return r5
        L8e:
            if (r16 == 0) goto L9c
            r15.AbN()
            int r0 = r4 + r1
            r15.A47(r0)
        L98:
            r8 = r1
            r10 = 0
            r9 = 0
            goto L38
        L9c:
            r15.Afm(r7)
            goto L98
        La0:
            X.E5T r1 = androidx.media3.extractor.mp3.Mp3Extractor.A0K
            goto L1c
        La4:
            r10 = 0
            r4 = 0
            goto L36
        La7:
            r14.A01()
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp3.Mp3Extractor.A03(X.E2K, boolean):boolean");
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A08 = interfaceC6413E4p;
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(0, 1);
        this.A0A = interfaceC5563DkgAhC;
        this.A09 = interfaceC5563DkgAhC;
        this.A08.AAe();
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04a0 A[PHI: r7
  0x04a0: PHI (r7v26 int) = (r7v2 int), (r7v27 int) binds: [B:198:0x049e, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r38, X.C5542DkK r39) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp3.Mp3Extractor.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    public Mp3Extractor(int i) {
        this(i, -9223372036854775807L);
    }

    public Mp3Extractor(int i, long j) {
        this.A0D = (i & 2) != 0 ? i | 1 : i;
        this.A0E = j;
        this.A0F = BV6.A0Y(10);
        this.A0H = new E2M();
        this.A0G = new C6361E2n();
        this.A02 = -9223372036854775807L;
        this.A0I = new E2H();
        C5551DkU c5551DkU = new C5551DkU();
        this.A0J = c5551DkU;
        this.A09 = c5551DkU;
        this.A03 = -1L;
    }

    public Mp3Extractor() {
        this(0);
    }
}
