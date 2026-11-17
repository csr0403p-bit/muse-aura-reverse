package com.meta.health.core;

import X.AIG;
import X.C3cG;
import X.C7384Etj;
import X.C9258GBl;
import X.G0U;
import X.G0V;
import X.HxE;
import X.InterfaceC2261BLa;
import java.time.Instant;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class ObserverAnchorManager {
    public final Map<String, Instant> A00;
    public final Map<String, String> A01;
    public final AIG<HxE<UUID, Map<String, String>>> A02;
    public final G0U<String, String> A03;
    public final G0U<String, Instant> A04;
    public final G0V<String, String, Unit> A05;
    public final G0V<String, Instant, Unit> A06;
    public final InterfaceC2261BLa A07;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/time/Instant;>;LX/G0U<-Ljava/lang/String;Ljava/lang/String;>;LX/G0V<-Ljava/lang/String;-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Ljava/time/Instant;>;LX/G0V<-Ljava/lang/String;-Ljava/time/Instant;Lkotlin/Unit;>;)V */
    public ObserverAnchorManager(Map map, G0U g0u, G0U g0u2, G0V g0v, G0V g0v2) {
        C7384Etj.A0Y(map, 0);
        this.A00 = map;
        this.A03 = g0u;
        this.A05 = g0v;
        this.A04 = g0u2;
        this.A06 = g0v2;
        this.A07 = new C9258GBl();
        this.A01 = C3cG.A0j();
        this.A02 = new AIG<>();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/UUID;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.util.Map r8, java.util.UUID r9, X.HtJ r10) {
        /*
            r7 = this;
            r3 = 15
            boolean r0 = r10 instanceof X.C8911FtT
            if (r0 == 0) goto L30
            r6 = r10
            X.FtT r6 = (X.C8911FtT) r6
            int r0 = r6.$t
            if (r0 != r3) goto L30
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r5 = r6.A04
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L3b
            if (r1 != r0) goto L36
            java.lang.Object r2 = r6.A03
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r8 = r6.A02
            java.lang.Object r9 = r6.A01
            X.Hwg.A00(r5)
            goto L4a
        L30:
            X.FtT r6 = new X.FtT
            r6.<init>(r7, r10, r3)
            goto L18
        L36:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3b:
            X.Hwg.A00(r5)
            X.BLa r2 = r7.A07
            X.C8911FtT.A00(r9, r8, r2, r6, r0)
            java.lang.Object r0 = r2.APs(r3, r6)
            if (r0 != r4) goto L4a
            return r4
        L4a:
            X.AIG<X.HxE<java.util.UUID, java.util.Map<java.lang.String, java.lang.String>>> r1 = r7.A02     // Catch: java.lang.Throwable -> L59
            X.HxE r0 = X.C3cG.A0r(r9, r8)     // Catch: java.lang.Throwable -> L59
            r1.addLast(r0)     // Catch: java.lang.Throwable -> L59
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
            r2.Ahe(r3)
            return r4
        L59:
            r0 = move-exception
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.ObserverAnchorManager.A00(java.util.Map, java.util.UUID, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.util.Map<java.lang.String, java.lang.String> r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r3 = 14
            boolean r0 = r8 instanceof X.C8912FtU
            if (r0 == 0) goto L30
            r5 = r8
            X.FtU r5 = (X.C8912FtU) r5
            int r0 = r5.$t
            if (r0 != r3) goto L30
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r4 = r5.A03
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.A00
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L3b
            if (r1 != r0) goto L36
            java.lang.Object r1 = r5.A02
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r7 = r5.A01
            java.util.Map r7 = (java.util.Map) r7
            X.Hwg.A00(r4)
            goto L4a
        L30:
            X.FtU r5 = new X.FtU
            r5.<init>(r6, r8, r3)
            goto L18
        L36:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3b:
            X.Hwg.A00(r4)
            X.BLa r1 = r6.A07
            X.C8912FtU.A00(r7, r1, r5, r0)
            java.lang.Object r0 = r1.APs(r2, r5)
            if (r0 != r3) goto L4a
            return r3
        L4a:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.A01     // Catch: java.lang.Throwable -> L55
            r0.putAll(r7)     // Catch: java.lang.Throwable -> L55
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L55
            r1.Ahe(r2)
            return r3
        L55:
            r0 = move-exception
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.ObserverAnchorManager.A01(java.util.Map, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.util.UUID r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            r3 = 13
            boolean r0 = r10 instanceof X.C8912FtU
            if (r0 == 0) goto L2e
            r4 = r10
            X.FtU r4 = (X.C8912FtU) r4
            int r0 = r4.$t
            if (r0 != r3) goto L2e
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r3 = r4.A03
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r6 = 0
            r0 = 1
            if (r1 == 0) goto L39
            if (r1 != r0) goto L34
            java.lang.Object r5 = r4.A02
            X.BLa r5 = (X.InterfaceC2261BLa) r5
            java.lang.Object r9 = r4.A01
            X.Hwg.A00(r3)
            goto L48
        L2e:
            X.FtU r4 = new X.FtU
            r4.<init>(r8, r10, r3)
            goto L18
        L34:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L39:
            X.Hwg.A00(r3)
            X.BLa r5 = r8.A07
            X.C8912FtU.A00(r9, r5, r4, r0)
            java.lang.Object r0 = r5.APs(r6, r4)
            if (r0 != r2) goto L48
            return r2
        L48:
            X.AIG<X.HxE<java.util.UUID, java.util.Map<java.lang.String, java.lang.String>>> r7 = r8.A02     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r4 = r7.A0U()     // Catch: java.lang.Throwable -> Ld6
            X.HxE r4 = (X.HxE) r4     // Catch: java.lang.Throwable -> Ld6
            if (r4 == 0) goto Ld0
            A r0 = r4.first     // Catch: java.lang.Throwable -> Ld6
            boolean r0 = X.C7384Etj.areEqual(r0, r9)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto Lca
            B r0 = r4.second     // Catch: java.lang.Throwable -> Ld6
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Ld6
            java.util.Iterator r3 = X.AnonymousClass002.A0n(r0)     // Catch: java.lang.Throwable -> Ld6
        L62:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L95
            java.util.Map$Entry r0 = X.C3cH.A0l(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = X.C60O.A0t(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Ld6
            X.G0V<java.lang.String, java.lang.String, kotlin.Unit> r0 = r8.A05     // Catch: java.lang.Throwable -> Ld6
            r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> Ld6
            java.util.Map<java.lang.String, java.time.Instant> r0 = r8.A00     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> Ld6
            java.time.Instant r1 = (java.time.Instant) r1     // Catch: java.lang.Throwable -> Ld6
            if (r1 != 0) goto L8f
            X.G0U<java.lang.String, java.time.Instant> r0 = r8.A04     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r1 = r0.invoke(r2)     // Catch: java.lang.Throwable -> Ld6
            java.time.Instant r1 = (java.time.Instant) r1     // Catch: java.lang.Throwable -> Ld6
            if (r1 == 0) goto L62
        L8f:
            X.G0V<java.lang.String, java.time.Instant, kotlin.Unit> r0 = r8.A06     // Catch: java.lang.Throwable -> Ld6
            r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> Ld6
            goto L62
        L95:
            r7.removeFirst()     // Catch: java.lang.Throwable -> Ld6
            B r0 = r4.second     // Catch: java.lang.Throwable -> Ld6
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Ld6
            java.util.Iterator r4 = X.AnonymousClass002.A0n(r0)     // Catch: java.lang.Throwable -> Ld6
        La0:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto Lc4
            java.util.Map$Entry r0 = X.C3cH.A0l(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = X.C60O.A0t(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld6
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.A01     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld6
            boolean r0 = X.C7384Etj.areEqual(r0, r2)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto La0
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld6
            goto La0
        Lc4:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld6
            r5.Ahe(r6)
            return r2
        Lca:
            com.meta.health.core.MetaHealthError$OutOfOrderCommit r0 = new com.meta.health.core.MetaHealthError$OutOfOrderCommit     // Catch: java.lang.Throwable -> Ld6
            r0.<init>()     // Catch: java.lang.Throwable -> Ld6
            throw r0     // Catch: java.lang.Throwable -> Ld6
        Ld0:
            com.meta.health.core.MetaHealthError$OutOfOrderCommit r0 = new com.meta.health.core.MetaHealthError$OutOfOrderCommit     // Catch: java.lang.Throwable -> Ld6
            r0.<init>()     // Catch: java.lang.Throwable -> Ld6
            throw r0     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            r0 = move-exception
            r5.Ahe(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.ObserverAnchorManager.A02(java.util.UUID, X.HtJ):java.lang.Object");
    }
}
