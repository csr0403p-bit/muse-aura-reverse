package androidx.room.coroutines;

import X.C7384Etj;
import X.EJ9;
import X.EJA;
import X.EJF;
import X.EJV;
import X.G0U;
import X.G0V;
import X.HtJ;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class PassthroughConnection implements EJA, EJF {
    public EJ9 A00;
    public AtomicInteger A01;
    public final EJV A02;
    public final G0V<G0U<? super HtJ<Object>, ? extends Object>, HtJ<Object>, Object> A03;

    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/G0U<-LX/HtJ<Ljava/lang/Object;>;+Ljava/lang/Object;>;-LX/HtJ<Ljava/lang/Object;>;+Ljava/lang/Object;>;LX/EJV;)V */
    public PassthroughConnection(EJV ejv, G0V g0v) {
        C7384Etj.A0Y(ejv, 1);
        this.A03 = g0v;
        this.A02 = ejv;
        this.A01 = new AtomicInteger(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.EJ9 r9, androidx.room.coroutines.PassthroughConnection r10, X.HtJ r11, X.G0V r12) {
        /*
            r8 = 0
            boolean r0 = r11 instanceof X.C6925EcY
            if (r0 == 0) goto Ld
            r0 = r11
            X.EcY r0 = (X.C6925EcY) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r8) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2f
            r5 = r11
            X.EcY r5 = (X.C6925EcY) r5
            int r2 = r5.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r5.A01 = r2
        L1e:
            java.lang.Object r7 = r5.A02
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.A01
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L3e
            if (r0 != r2) goto L39
            int r2 = r5.A00
            goto L35
        L2f:
            X.EcY r5 = new X.EcY
            r5.<init>(r10, r11, r8)
            goto L1e
        L35:
            X.Hwg.A00(r7)     // Catch: java.lang.Throwable -> L90
            goto L78
        L39:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L3e:
            X.Hwg.A00(r7)
            int r1 = r9.ordinal()
            if (r1 == r8) goto L63
            if (r1 == r2) goto L5e
            r0 = 2
            if (r1 != r0) goto La8
            X.EJV r1 = r10.A02
            java.lang.String r0 = "BEGIN EXCLUSIVE TRANSACTION"
        L50:
            X.EIW.A00(r1, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A01
            int r0 = r0.incrementAndGet()
            if (r0 <= 0) goto L68
            r10.A00 = r9
            goto L68
        L5e:
            X.EJV r1 = r10.A02
            java.lang.String r0 = "BEGIN IMMEDIATE TRANSACTION"
            goto L50
        L63:
            X.EJV r1 = r10.A02
            java.lang.String r0 = "BEGIN DEFERRED TRANSACTION"
            goto L50
        L68:
            X.EJT r0 = new X.EJT     // Catch: java.lang.Throwable -> L90
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L90
            r5.A00 = r2     // Catch: java.lang.Throwable -> L90
            r5.A01 = r2     // Catch: java.lang.Throwable -> L90
            java.lang.Object r7 = r12.invoke(r0, r5)     // Catch: java.lang.Throwable -> L90
            if (r7 != r6) goto L78
            return r6
        L78:
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A01
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L82
            r10.A00 = r4
        L82:
            X.EJV r1 = r10.A02
            if (r2 == 0) goto L8c
            java.lang.String r0 = "END TRANSACTION"
            X.EIW.A00(r1, r0)
            return r7
        L8c:
            X.EIW.A00(r1, r3)
            return r7
        L90:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L92
        L92:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A01     // Catch: android.database.SQLException -> La3
            int r0 = r0.decrementAndGet()     // Catch: android.database.SQLException -> La3
            if (r0 != 0) goto L9d
            r10.A00 = r4     // Catch: android.database.SQLException -> La3
        L9d:
            X.EJV r0 = r10.A02     // Catch: android.database.SQLException -> La3
            X.EIW.A00(r0, r3)     // Catch: android.database.SQLException -> La3
            throw r1
        La3:
            r0 = move-exception
            X.CU7.A01(r2, r0)
            throw r1
        La8:
            kotlin.NoWhenBranchMatchedException r1 = X.C3cG.A0q()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PassthroughConnection.A00(X.EJ9, androidx.room.coroutines.PassthroughConnection, X.HtJ, X.G0V):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // X.EJD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object AiF(java.lang.String r8, X.G0U<? super X.EIK, ? extends R> r9, X.HtJ<? super R> r10) {
        /*
            r7 = this;
            r3 = 0
            boolean r0 = r10 instanceof X.EZF
            if (r0 == 0) goto Ld
            r0 = r10
            X.EZF r0 = (X.EZF) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L73
            r6 = r10
            X.EZF r6 = (X.EZF) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r6.A00 = r2
        L1e:
            java.lang.Object r5 = r6.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.A00
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 == r0) goto L40
            if (r1 != r3) goto L79
            X.Hwg.A00(r5)
        L2f:
            return r5
        L30:
            X.Hwg.A00(r5)
            r6.A01 = r8
            r6.A02 = r9
            r6.A00 = r0
            java.lang.Boolean r5 = r7.ANS(r6)
            if (r5 != r4) goto L4b
            return r4
        L40:
            java.lang.Object r9 = r6.A02
            X.G0U r9 = (X.G0U) r9
            java.lang.Object r8 = r6.A01
            java.lang.String r8 = (java.lang.String) r8
            X.Hwg.A00(r5)
        L4b:
            boolean r0 = X.AnonymousClass001.A1X(r5)
            r2 = 0
            if (r0 == 0) goto L66
            X.G0V<X.G0U<? super X.HtJ<java.lang.Object>, ? extends java.lang.Object>, X.HtJ<java.lang.Object>, java.lang.Object> r1 = r7.A03
            androidx.room.coroutines.PassthroughConnection$usePrepared$2 r0 = new androidx.room.coroutines.PassthroughConnection$usePrepared$2
            r0.<init>(r7, r8, r2, r9)
            r6.A01 = r2
            r6.A02 = r2
            r6.A00 = r3
            java.lang.Object r5 = r1.invoke(r0, r6)
            if (r5 != r4) goto L2f
            return r4
        L66:
            X.EJV r0 = r7.A02
            X.EIK r2 = r0.AYO(r8)
            java.lang.Object r5 = r9.invoke(r2)     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L2f
            goto L7e
        L73:
            X.EZF r6 = new X.EZF
            r6.<init>(r7, r10, r3)
            goto L1e
        L79:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7e:
            r2.close()
            return r5
        L82:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            X.Hsg.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PassthroughConnection.AiF(java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    @Override // X.EJF
    public final EJV AJP() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // X.EJA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ANS(X.HtJ<? super java.lang.Boolean> r2) {
        /*
            r1 = this;
            X.EJ9 r0 = r1.A00
            if (r0 != 0) goto Ld
            X.EJV r0 = r1.A02
            boolean r1 = r0.ANT()
            r0 = 0
            if (r1 == 0) goto Le
        Ld:
            r0 = 1
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PassthroughConnection.ANS(X.HtJ):java.lang.Boolean");
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(LX/EJ9;LX/G0V<-LX/EJE<TR;>;-LX/HtJ<-TR;>;+Ljava/lang/Object;>;LX/HtJ<-TR;>;)Ljava/lang/Object; */
    @Override // X.EJA
    public final Object AiV(EJ9 ej9, HtJ htJ, G0V g0v) {
        return this.A03.invoke(new PassthroughConnection$withTransaction$2(ej9, this, null, g0v), htJ);
    }
}
