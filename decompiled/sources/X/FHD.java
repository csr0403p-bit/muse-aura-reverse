package X;

/* loaded from: classes6.dex */
public final class FHD {
    public FHE A00 = new FHC();

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/HxO<-Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<+TT;>;)TT; */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(kotlin.jvm.functions.Function0 r19, X.HxO r20) {
        /*
            r18 = this;
            r14 = r18
            X.FHE r12 = r14.A00
            if (r12 == 0) goto Lc0
            boolean r0 = r12 instanceof X.FHC
            r13 = r20
            if (r0 == 0) goto L3c
            X.FHC r12 = (X.FHC) r12
            X.HxO<? super kotlin.Unit> r0 = r12.A04
            if (r0 == 0) goto L3c
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L3c
            X.FHB r11 = new X.FHB
            r11.<init>()
            X.HxO<? super kotlin.Unit> r10 = r12.A04
            if (r10 == 0) goto Lbd
            X.AHt<java.lang.Object> r0 = r12.A00
            if (r0 != 0) goto L51
            java.lang.Object r2 = r12.A02
            X.C7384Etj.A0X(r2)
            java.util.List<X.FHH> r1 = r11.A04
            X.FHF r0 = new X.FHF
            r0.<init>(r2, r10)
            r1.add(r0)
        L34:
            r11.A01()
            r12.A02()
            r14.A00 = r11
        L3c:
            X.FHE r3 = r14.A00
            X.C7384Etj.A0X(r3)
            X.G0U r1 = r3.A00(r13)
            androidx.compose.runtime.snapshots.Snapshot r0 = X.BDh.A00()
            androidx.compose.runtime.snapshots.Snapshot r2 = r0.A0B(r1)
            r3.A03(r13)
            goto La1
        L51:
            java.lang.Object[] r9 = r0.A04
            long[] r8 = r0.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L34
            r6 = 0
        L5b:
            r17 = r8[r6]
            r3 = -1
            long r3 = r3 ^ r17
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r17
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L9c
            int r0 = r6 - r7
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L7a:
            if (r3 >= r4) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L95
            int r0 = r6 << 3
            int r0 = r0 + r3
            r2 = r9[r0]
            java.util.List<X.FHH> r1 = r11.A04
            X.FHF r0 = new X.FHF
            r0.<init>(r2, r10)
            r1.add(r0)
        L95:
            long r17 = r17 >> r5
            int r3 = r3 + 1
            goto L7a
        L9a:
            if (r4 != r5) goto L34
        L9c:
            if (r6 == r7) goto L34
            int r6 = r6 + 1
            goto L5b
        La1:
            androidx.compose.runtime.snapshots.Snapshot r1 = r2.A0A()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r19.invoke()     // Catch: java.lang.Throwable -> Lb3
            androidx.compose.runtime.snapshots.Snapshot.A06(r1)     // Catch: java.lang.Throwable -> Lb8
            r2.A0G()
            r3.A01()
            return r0
        Lb3:
            r0 = move-exception
            androidx.compose.runtime.snapshots.Snapshot.A06(r1)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r0 = move-exception
            r2.A0G()
            throw r0
        Lbd:
            java.lang.String r0 = "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"
            goto Lc2
        Lc0:
            java.lang.String r0 = "Called runAndWatch on a manager that has been disposed of"
        Lc2:
            X.AK7.A00(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FHD.A00(kotlin.jvm.functions.Function0, X.HxO):java.lang.Object");
    }
}
