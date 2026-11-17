package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.Dif, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5444Dif implements InterfaceC5487DjP {
    public final boolean A00 = AbstractC5653Dmh.A03(EnumC5618Dlz.A12);
    public final InterfaceC5487DjP[] A01;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // X.InterfaceC5487DjP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A7A(X.Du1 r17) {
        /*
            r16 = this;
            r15 = 0
        L1:
            r1 = r16
            long r13 = r1.AI5()
            r10 = -9223372036854775808
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 == 0) goto L39
            X.DjP[] r9 = r1.A01
            int r8 = r9.length
            r7 = 0
            r6 = 0
        L12:
            if (r7 >= r8) goto L36
            r5 = r9[r7]
            long r3 = r5.AI5()
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r12 = r17
            if (r0 == 0) goto L27
            long r1 = r12.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L28
        L27:
            r1 = 0
        L28:
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L33
        L2e:
            boolean r0 = r5.A7A(r12)
            r6 = r6 | r0
        L33:
            int r7 = r7 + 1
            goto L12
        L36:
            r15 = r15 | r6
            if (r6 != 0) goto L1
        L39:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5444Dif.A7A(X.Du1):boolean");
    }

    private boolean A00(InterfaceC5487DjP interfaceC5487DjP) {
        int i;
        if (!(interfaceC5487DjP instanceof C5422DiI)) {
            if (this.A00 && (interfaceC5487DjP instanceof C5362DhE)) {
                C5414DiA c5414DiA = ((C5362DhE) interfaceC5487DjP).A06;
                if (c5414DiA.A01 == 1) {
                    C5382DhZ c5382DhZA0e = BV7.A0e(c5414DiA, 0);
                    if (c5382DhZA0e.A01 == 1) {
                        i = c5382DhZA0e.A02;
                    }
                }
            }
        }
        i = ((C5422DiI) interfaceC5487DjP).A0I;
        return i == 3;
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        InterfaceC5487DjP[] interfaceC5487DjPArr = this.A01;
        long jMin = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        for (InterfaceC5487DjP interfaceC5487DjP : interfaceC5487DjPArr) {
            if (!A00(interfaceC5487DjP)) {
                long jAD6 = interfaceC5487DjP.AD6(j);
                if (jAD6 == Long.MIN_VALUE) {
                    continue;
                } else {
                    if (jAD6 <= 0) {
                        return 0L;
                    }
                    jMin = Math.min(jMin, jAD6);
                }
            }
        }
        if (jMin == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return 0L;
        }
        return jMin;
    }

    @Override // X.InterfaceC5487DjP
    public final long AD8() {
        InterfaceC5487DjP[] interfaceC5487DjPArr = this.A01;
        long jMin = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        for (InterfaceC5487DjP interfaceC5487DjP : interfaceC5487DjPArr) {
            if (!A00(interfaceC5487DjP)) {
                long jAD8 = interfaceC5487DjP.AD8();
                if (jAD8 != Long.MIN_VALUE) {
                    jMin = Math.min(jMin, jAD8);
                }
            }
        }
        if (jMin == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // X.InterfaceC5487DjP
    public final long AI5() {
        InterfaceC5487DjP[] interfaceC5487DjPArr = this.A01;
        long jMin = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        for (InterfaceC5487DjP interfaceC5487DjP : interfaceC5487DjPArr) {
            if (!A00(interfaceC5487DjP)) {
                long jAI5 = interfaceC5487DjP.AI5();
                if (jAI5 != Long.MIN_VALUE) {
                    jMin = Math.min(jMin, jAI5);
                }
            }
        }
        if (jMin == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // X.InterfaceC5487DjP
    public final boolean AOd() {
        for (InterfaceC5487DjP interfaceC5487DjP : this.A01) {
            if (interfaceC5487DjP.AOd()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC5487DjP
    public final void AZv(long j) {
        for (InterfaceC5487DjP interfaceC5487DjP : this.A01) {
            interfaceC5487DjP.AZv(j);
        }
    }

    public C5444Dif(InterfaceC5487DjP[] interfaceC5487DjPArr) {
        this.A01 = interfaceC5487DjPArr;
    }
}
