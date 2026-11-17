package androidx.room.coroutines;

import X.AIG;
import X.C6602EJe;
import X.C6604EJg;
import X.C7384Etj;
import X.EIK;
import X.EJ9;
import X.EJA;
import X.EJB;
import X.EJE;
import X.EJF;
import X.EJR;
import X.EJV;
import X.EJW;
import X.F60;
import X.G0U;
import X.G0V;
import X.HtJ;

/* loaded from: classes5.dex */
public final class PooledConnectionImpl implements EJA, EJF {
    public final C6604EJg A00;
    public final EJR A01;
    public final boolean A02;
    public final AIG<EJW> A03;
    public volatile boolean A04;

    public final class TransactionImpl<T> implements EJE<T>, EJF {
        public TransactionImpl() {
        }

        @Override // X.EJF
        public final EJV AJP() {
            return PooledConnectionImpl.this.A01;
        }

        @Override // X.EJD
        public final <R> Object AiF(String str, G0U<? super EIK, ? extends R> g0u, HtJ<? super R> htJ) {
            return PooledConnectionImpl.this.AiF(str, g0u, htJ);
        }
    }

    public PooledConnectionImpl(C6604EJg c6604EJg, EJR ejr, boolean z) {
        C7384Etj.A0Y(c6604EJg, 0);
        this.A00 = c6604EJg;
        this.A01 = ejr;
        this.A02 = z;
        this.A03 = new AIG<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.BLa] */
    @Override // X.EJD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object AiF(java.lang.String r9, X.G0U<? super X.EIK, ? extends R> r10, X.HtJ<? super R> r11) {
        /*
            r8 = this;
            r3 = 4
            boolean r0 = r11 instanceof X.C8911FtT
            if (r0 == 0) goto Ld
            r0 = r11
            X.FtT r0 = (X.C8911FtT) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L3a
            r7 = r11
            X.FtT r7 = (X.C8911FtT) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r7.A00 = r2
        L1e:
            java.lang.Object r1 = r7.A04
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.A00
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L45
            if (r0 != r5) goto L40
            java.lang.Object r4 = r7.A03
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            java.lang.Object r10 = r7.A02
            X.G0U r10 = (X.G0U) r10
            java.lang.Object r9 = r7.A01
            java.lang.String r9 = (java.lang.String) r9
            X.Hwg.A00(r1)
            goto L73
        L3a:
            X.FtT r7 = new X.FtT
            r7.<init>(r8, r11, r3)
            goto L1e
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L45:
            X.Hwg.A00(r1)
            boolean r0 = r8.A04
            r2 = 21
            if (r0 != 0) goto L98
            X.78T r1 = r7.getContext()
            X.EJg r0 = r8.A00
            X.78X r0 = r1.get(r0)
            X.EJe r0 = (X.C6602EJe) r0
            if (r0 == 0) goto L95
            androidx.room.coroutines.PooledConnectionImpl r0 = r0.A00
            if (r0 != r8) goto L95
            X.EJR r4 = r8.A01
            r7.A01 = r9
            r7.A02 = r10
            r7.A03 = r4
            r7.A00 = r5
            X.BLa r0 = r4.A04
            java.lang.Object r0 = r0.APs(r3, r7)
            if (r0 != r6) goto L73
            return r6
        L73:
            X.EJR r0 = r8.A01     // Catch: java.lang.Throwable -> L90
            X.EIK r0 = r0.AYO(r9)     // Catch: java.lang.Throwable -> L90
            X.EIM r2 = new X.EIM     // Catch: java.lang.Throwable -> L90
            r2.<init>(r8, r0)     // Catch: java.lang.Throwable -> L90
            java.lang.Object r6 = r10.invoke(r2)     // Catch: java.lang.Throwable -> L89
            r2.close()     // Catch: java.lang.Throwable -> L90
            r4.Ahe(r3)
            return r6
        L89:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            X.Hsg.A00(r2, r1)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        L90:
            r0 = move-exception
            r4.Ahe(r3)
            throw r0
        L95:
            java.lang.String r0 = "Attempted to use connection on a different coroutine"
            goto L9a
        L98:
            java.lang.String r0 = "Connection is recycled"
        L9a:
            X.EJB.A00(r0, r2)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.AiF(java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.BLa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.EJ9 r9, androidx.room.coroutines.PooledConnectionImpl r10, X.HtJ r11) {
        /*
            java.lang.String r7 = "SAVEPOINT '"
            r8 = 1
            boolean r0 = r11 instanceof X.EZF
            if (r0 == 0) goto L31
            r5 = r11
            X.EZF r5 = (X.EZF) r5
            int r0 = r5.$t
            if (r0 != r8) goto L31
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r5.A00 = r2
        L19:
            java.lang.Object r4 = r5.A03
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 0
            r6 = 0
            if (r0 == 0) goto L3c
            if (r0 != r8) goto L37
            java.lang.Object r2 = r5.A02
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r9 = r5.A01
            X.EJ9 r9 = (X.EJ9) r9
            X.Hwg.A00(r4)
            goto L50
        L31:
            X.EZF r5 = new X.EZF
            r5.<init>(r10, r11, r8)
            goto L19
        L37:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3c:
            X.Hwg.A00(r4)
            X.EJR r2 = r10.A01
            r5.A01 = r9
            r5.A02 = r2
            r5.A00 = r8
            X.BLa r0 = r2.A04
            java.lang.Object r0 = r0.APs(r3, r5)
            if (r0 != r1) goto L50
            return r1
        L50:
            X.AIG<X.EJW> r5 = r10.A03     // Catch: java.lang.Throwable -> L9d
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L9d
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L7c
            int r1 = r9.ordinal()     // Catch: java.lang.Throwable -> L9d
            if (r1 == r6) goto L74
            if (r1 == r8) goto L88
            r0 = 2
            if (r1 != r0) goto L6f
            X.EJR r1 = r10.A01     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "BEGIN EXCLUSIVE TRANSACTION"
            X.EIW.A00(r1, r0)     // Catch: java.lang.Throwable -> L9d
            goto L8f
        L6f:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L74:
            X.EJR r1 = r10.A01     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "BEGIN DEFERRED TRANSACTION"
            X.EIW.A00(r1, r0)     // Catch: java.lang.Throwable -> L9d
            goto L8f
        L7c:
            X.EJR r1 = r10.A01     // Catch: java.lang.Throwable -> L9d
            r0 = 39
            java.lang.String r0 = X.FGI.A0G(r7, r0, r4)     // Catch: java.lang.Throwable -> L9d
            X.EIW.A00(r1, r0)     // Catch: java.lang.Throwable -> L9d
            goto L8f
        L88:
            X.EJR r1 = r10.A01     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "BEGIN IMMEDIATE TRANSACTION"
            X.EIW.A00(r1, r0)     // Catch: java.lang.Throwable -> L9d
        L8f:
            X.EJW r0 = new X.EJW     // Catch: java.lang.Throwable -> L9d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L9d
            r5.addLast(r0)     // Catch: java.lang.Throwable -> L9d
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9d
            r2.Ahe(r3)
            return r1
        L9d:
            r0 = move-exception
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.A00(X.EJ9, androidx.room.coroutines.PooledConnectionImpl, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.EJ9 r11, androidx.room.coroutines.PooledConnectionImpl r12, X.HtJ r13, X.G0V r14) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof X.EJS
            if (r0 == 0) goto L80
            r7 = r13
            X.EJS r7 = (X.EJS) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r8 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r10 = r7.label
            r5 = 5
            r0 = 4
            r9 = 3
            r4 = 2
            r3 = 0
            r2 = 0
            r1 = 1
            if (r10 == 0) goto L3e
            if (r10 == r1) goto L36
            if (r10 == r4) goto L30
            if (r10 == r9) goto L92
            if (r10 == r0) goto L92
            if (r10 == r5) goto L86
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
        L2f:
            throw r2
        L30:
            int r0 = r7.I$0
            X.Hwg.A00(r8)     // Catch: java.lang.Throwable -> L70
            goto L62
        L36:
            java.lang.Object r14 = r7.L$0
            X.G0V r14 = (X.G0V) r14
            X.Hwg.A00(r8)
            goto L50
        L3e:
            X.Hwg.A00(r8)
            if (r11 != 0) goto L45
            X.EJ9 r11 = X.EJ9.A02
        L45:
            r7.L$0 = r14
            r7.label = r1
            java.lang.Object r0 = A00(r11, r12, r7)
            if (r0 != r6) goto L50
        L4f:
            return r6
        L50:
            androidx.room.coroutines.PooledConnectionImpl$TransactionImpl r0 = new androidx.room.coroutines.PooledConnectionImpl$TransactionImpl     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            r7.L$0 = r2     // Catch: java.lang.Throwable -> L70
            r7.I$0 = r1     // Catch: java.lang.Throwable -> L70
            r7.label = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r8 = r14.invoke(r0, r7)     // Catch: java.lang.Throwable -> L70
            if (r8 == r6) goto L4f
            r0 = 1
        L62:
            if (r0 == 0) goto L65
            r3 = 1
        L65:
            r7.L$0 = r8
            r7.label = r9
            java.lang.Object r0 = A02(r12, r7, r3)
            if (r0 == r6) goto L4f
            return r8
        L70:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r2 = move-exception
            r7.L$0 = r0     // Catch: android.database.SQLException -> L99
            r7.L$1 = r2     // Catch: android.database.SQLException -> L99
            r7.label = r5     // Catch: android.database.SQLException -> L99
            java.lang.Object r0 = A02(r12, r7, r3)     // Catch: android.database.SQLException -> L99
            if (r0 != r6) goto L2f
            goto L98
        L80:
            X.EJS r7 = new X.EJS
            r7.<init>(r12, r13)
            goto L12
        L86:
            java.lang.Object r2 = r7.L$1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r0 = r7.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.Hwg.A00(r8)     // Catch: android.database.SQLException -> L99
            throw r2
        L92:
            java.lang.Object r0 = r7.L$0
            X.Hwg.A00(r8)
            return r0
        L98:
            return r6
        L99:
            r1 = move-exception
            if (r0 == 0) goto La0
            X.CU7.A01(r0, r1)
            throw r2
        La0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.A01(X.EJ9, androidx.room.coroutines.PooledConnectionImpl, X.HtJ, X.G0V):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.BLa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(androidx.room.coroutines.PooledConnectionImpl r9, X.HtJ r10, boolean r11) {
        /*
            java.lang.String r6 = "RELEASE SAVEPOINT '"
            java.lang.String r5 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            r3 = 3
            boolean r0 = r10 instanceof X.C2313BTn
            if (r0 == 0) goto L31
            r8 = r10
            X.BTn r8 = (X.C2313BTn) r8
            int r0 = r8.$t
            if (r0 != r3) goto L31
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r8.A00 = r2
        L1b:
            java.lang.Object r7 = r8.A02
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r8.A00
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto L37
            boolean r11 = r8.A04
            java.lang.Object r3 = r8.A01
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            X.Hwg.A00(r7)
            goto L50
        L31:
            X.BTn r8 = new X.BTn
            r8.<init>(r9, r10, r3)
            goto L1b
        L37:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3c:
            X.Hwg.A00(r7)
            X.EJR r3 = r9.A01
            r8.A01 = r3
            r8.A04 = r11
            r8.A00 = r0
            X.BLa r0 = r3.A04
            java.lang.Object r0 = r0.APs(r4, r8)
            if (r0 != r2) goto L50
            return r2
        L50:
            X.AIG<X.EJW> r2 = r9.A03     // Catch: java.lang.Throwable -> La0
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L99
            java.lang.Object r1 = X.AbstractC0882AGj.A0p(r2)     // Catch: java.lang.Throwable -> La0
            X.EJW r1 = (X.EJW) r1     // Catch: java.lang.Throwable -> La0
            if (r11 == 0) goto L6e
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> La0
            X.EJR r2 = r9.A01
            if (r0 == 0) goto L88
            java.lang.String r0 = "END TRANSACTION"
            X.EIW.A00(r2, r0)     // Catch: java.lang.Throwable -> La0
            goto L93
        L6e:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> La0
            X.EJR r2 = r9.A01
            if (r0 == 0) goto L7c
            java.lang.String r0 = "ROLLBACK TRANSACTION"
            X.EIW.A00(r2, r0)     // Catch: java.lang.Throwable -> La0
            goto L93
        L7c:
            int r1 = r1.A00     // Catch: java.lang.Throwable -> La0
            r0 = 39
            java.lang.String r0 = X.FGI.A0G(r5, r0, r1)     // Catch: java.lang.Throwable -> La0
            X.EIW.A00(r2, r0)     // Catch: java.lang.Throwable -> La0
            goto L93
        L88:
            int r1 = r1.A00     // Catch: java.lang.Throwable -> La0
            r0 = 39
            java.lang.String r0 = X.FGI.A0G(r6, r0, r1)     // Catch: java.lang.Throwable -> La0
            X.EIW.A00(r2, r0)     // Catch: java.lang.Throwable -> La0
        L93:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La0
            r3.Ahe(r4)
            return r2
        L99:
            java.lang.String r0 = "Not in a transaction"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            r3.Ahe(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.A02(androidx.room.coroutines.PooledConnectionImpl, X.HtJ, boolean):java.lang.Object");
    }

    @Override // X.EJF
    public final EJV AJP() {
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // X.EJA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ANS(X.HtJ<? super java.lang.Boolean> r4) {
        /*
            r3 = this;
            boolean r0 = r3.A04
            r2 = 21
            if (r0 != 0) goto L31
            X.78T r1 = r4.getContext()
            X.EJg r0 = r3.A00
            X.78X r0 = r1.get(r0)
            X.EJe r0 = (X.C6602EJe) r0
            if (r0 == 0) goto L34
            androidx.room.coroutines.PooledConnectionImpl r0 = r0.A00
            if (r0 != r3) goto L34
            X.AIG<X.EJW> r0 = r3.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2b
            X.EJR r0 = r3.A01
            X.EJV r0 = r0.A03
            boolean r1 = r0.ANT()
            r0 = 0
            if (r1 == 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L31:
            java.lang.String r0 = "Connection is recycled"
            goto L36
        L34:
            java.lang.String r0 = "Attempted to use connection on a different coroutine"
        L36:
            X.EJB.A00(r0, r2)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.ANS(X.HtJ):java.lang.Boolean");
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(LX/EJ9;LX/G0V<-LX/EJE<TR;>;-LX/HtJ<-TR;>;+Ljava/lang/Object;>;LX/HtJ<-TR;>;)Ljava/lang/Object; */
    @Override // X.EJA
    public final Object AiV(EJ9 ej9, HtJ htJ, G0V g0v) {
        String str;
        if (this.A04) {
            str = "Connection is recycled";
        } else {
            C6602EJe c6602EJe = (C6602EJe) htJ.getContext().get(this.A00);
            if (c6602EJe != null && c6602EJe.A00 == this) {
                return A01(ej9, this, htJ, g0v);
            }
            str = "Attempted to use connection on a different coroutine";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }
}
