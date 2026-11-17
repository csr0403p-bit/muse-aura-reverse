package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.Aue, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1941Aue implements InterfaceC2043AxB {
    public C1958Aux A01;
    public final long A02;
    public final Function0<C1958Aux> A03;
    public final Function0<InterfaceC1497Ak4> A05;
    public final Object A04 = this;
    public int A00 = -1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.C1941Aue r6, X.C1958Aux r7) {
        /*
            java.lang.Object r4 = r6.A04
            monitor-enter(r4)
            X.Aux r0 = r6.A01     // Catch: java.lang.Throwable -> L50
            if (r0 == r7) goto L4c
            X.Auv r5 = r7.A03     // Catch: java.lang.Throwable -> L50
            boolean r2 = r5.A07     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L1b
            long r0 = r7.A02     // Catch: java.lang.Throwable -> L50
            int r0 = X.AnonymousClass002.A09(r0)     // Catch: java.lang.Throwable -> L50
            float r1 = (float) r0     // Catch: java.lang.Throwable -> L50
            float r0 = r5.A00     // Catch: java.lang.Throwable -> L50
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L1c
        L1b:
            r0 = 1
        L1c:
            r3 = 1
            if (r0 == 0) goto L41
            if (r2 != 0) goto L41
            long r0 = r7.A02     // Catch: java.lang.Throwable -> L50
            int r0 = X.AnonymousClass002.A09(r0)     // Catch: java.lang.Throwable -> L50
            float r2 = (float) r0     // Catch: java.lang.Throwable -> L50
            int r1 = r5.A08(r2)     // Catch: java.lang.Throwable -> L50
            int r0 = r5.A02     // Catch: java.lang.Throwable -> L50
            int r0 = r0 - r3
            if (r1 <= r0) goto L32
            r1 = r0
        L32:
            if (r1 < 0) goto L3f
            float r0 = r5.A07(r1)     // Catch: java.lang.Throwable -> L50
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L44
            int r1 = r1 + (-1)
            goto L32
        L3f:
            r1 = 0
            goto L44
        L41:
            int r1 = r5.A02     // Catch: java.lang.Throwable -> L50
            int r1 = r1 - r3
        L44:
            int r0 = r5.A0A(r1, r3)     // Catch: java.lang.Throwable -> L50
            r6.A00 = r0     // Catch: java.lang.Throwable -> L50
            r6.A01 = r7     // Catch: java.lang.Throwable -> L50
        L4c:
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L50
            monitor-exit(r4)
            return r0
        L50:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1941Aue.A00(X.Aue, X.Aux):int");
    }

    @Override // X.InterfaceC2043AxB
    public final long AG2(C1940Aud c1940Aud, boolean z) {
        C1958Aux c1958AuxInvoke;
        if (z) {
            if (c1940Aud.A01.A01 != this.A02) {
                return 9205357640488583168L;
            }
        } else if (c1940Aud.A00.A01 != this.A02) {
            return 9205357640488583168L;
        }
        if (AGx() == null || (c1958AuxInvoke = this.A03.invoke()) == null) {
            return 9205357640488583168L;
        }
        return AbstractC1886At3.A00(c1958AuxInvoke, ATD.A04((z ? c1940Aud.A01 : c1940Aud.A00).A00, 0, A00(this, c1958AuxInvoke)), z, c1940Aud.A02);
    }

    @Override // X.InterfaceC2043AxB
    public final InterfaceC1497Ak4 AGx() {
        InterfaceC1497Ak4 interfaceC1497Ak4Invoke = this.A05.invoke();
        if (interfaceC1497Ak4Invoke == null || !interfaceC1497Ak4Invoke.isAttached()) {
            return null;
        }
        return interfaceC1497Ak4Invoke;
    }

    @Override // X.InterfaceC2043AxB
    public final C1940Aud AKD() {
        C1958Aux c1958AuxInvoke = this.A03.invoke();
        if (c1958AuxInvoke == null) {
            return null;
        }
        int iA00 = C1870Ask.A00(c1958AuxInvoke);
        Integer numA08 = c1958AuxInvoke.A08(0);
        long j = this.A02;
        return new C1940Aud(new C1962AvE(numA08, 0, j), new C1962AvE(c1958AuxInvoke.A08(Math.max(iA00 - 1, 0)), iA00, j), false);
    }

    @Override // X.InterfaceC2043AxB
    public final ApQ ALZ() {
        C1958Aux c1958AuxInvoke = this.A03.invoke();
        return c1958AuxInvoke == null ? AnonymousClass005.A0X("") : c1958AuxInvoke.A04.A03;
    }

    /* JADX WARN: Incorrect types in method signature: (JLkotlin/jvm/functions/Function0<+LX/Ak4;>;Lkotlin/jvm/functions/Function0<LX/Aux;>;)V */
    public C1941Aue(Function0 function0, Function0 function02, long j) {
        this.A02 = j;
        this.A05 = function0;
        this.A03 = function02;
    }
}
