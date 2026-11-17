package androidx.glance.state;

import X.C3cG;
import X.C6JO;
import X.C6PR;
import X.C9258GBl;
import X.InterfaceC2261BLa;
import java.util.Map;

/* loaded from: classes3.dex */
public final class GlanceState implements C6PR {
    public static final GlanceState A00 = new GlanceState();
    public static final InterfaceC2261BLa A02 = new C9258GBl();
    public static final Map<String, C6JO<?>> A01 = C3cG.A0j();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r8, androidx.glance.state.GlanceState r9, X.C6PQ r10, java.lang.String r11, X.HtJ r12) throws java.lang.Throwable {
        /*
            r7 = 1
            boolean r0 = r12 instanceof X.C8iX
            if (r0 == 0) goto L30
            r6 = r12
            X.8iX r6 = (X.C8iX) r6
            int r0 = r6.$t
            if (r0 != r7) goto L30
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A05
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 0
            if (r0 == 0) goto L4e
            if (r0 == r7) goto L3b
            if (r0 != r4) goto L36
            java.lang.Object r11 = r6.A03
            java.lang.Object r0 = r6.A02
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r6.A01
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            goto L7d
        L30:
            X.8iX r6 = new X.8iX
            r6.<init>(r9, r12, r7)
            goto L17
        L36:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3b:
            java.lang.Object r2 = r6.A04
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r11 = r6.A03
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r6.A02
            X.6PQ r10 = (X.C6PQ) r10
            java.lang.Object r0 = r6.A01
            android.content.Context r8 = X.C60P.A02(r0, r1)
            goto L64
        L4e:
            X.Hwg.A00(r1)
            X.BLa r2 = androidx.glance.state.GlanceState.A02
            r6.A01 = r8
            r6.A02 = r10
            r6.A03 = r11
            r6.A04 = r2
            r6.A00 = r7
            java.lang.Object r0 = r2.APs(r3, r6)
            if (r0 != r5) goto L64
            return r5
        L64:
            java.util.Map<java.lang.String, X.6JO<?>> r0 = androidx.glance.state.GlanceState.A01     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r0.get(r11)     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L85
            r6.A01 = r2     // Catch: java.lang.Throwable -> L90
            r6.A02 = r0     // Catch: java.lang.Throwable -> L90
            r6.A03 = r11     // Catch: java.lang.Throwable -> L90
            r6.A04 = r3     // Catch: java.lang.Throwable -> L90
            r6.A00 = r4     // Catch: java.lang.Throwable -> L90
            X.6JO r1 = r10.AEd(r8, r11)     // Catch: java.lang.Throwable -> L90
            if (r1 != r5) goto L80
            return r5
        L7d:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L92
        L80:
            X.6JO r1 = (X.C6JO) r1     // Catch: java.lang.Throwable -> L92
            r0.put(r11, r1)     // Catch: java.lang.Throwable -> L92
        L85:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>"
            X.C7384Etj.A0Z(r1, r0)     // Catch: java.lang.Throwable -> L92
            X.6JO r1 = (X.C6JO) r1     // Catch: java.lang.Throwable -> L92
            r2.Ahe(r3)
            return r1
        L90:
            r0 = move-exception
            goto L93
        L92:
            r0 = move-exception
        L93:
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.state.GlanceState.A00(android.content.Context, androidx.glance.state.GlanceState, X.6PQ, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(android.content.Context r7, X.C6PQ<?> r8, java.lang.String r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = r10 instanceof X.C8iX
            if (r0 == 0) goto L36
            r5 = r10
            X.8iX r5 = (X.C8iX) r5
            int r0 = r5.$t
            if (r0 != r3) goto L36
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A05
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.A00
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L41
            if (r1 != r0) goto L3c
            java.lang.Object r1 = r5.A04
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r9 = r5.A03
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.A02
            X.6PQ r8 = (X.C6PQ) r8
            java.lang.Object r0 = r5.A01
            android.content.Context r7 = X.C60P.A02(r0, r4)
            goto L57
        L36:
            X.8iX r5 = new X.8iX
            r5.<init>(r6, r10, r3)
            goto L17
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L41:
            X.Hwg.A00(r4)
            X.BLa r1 = androidx.glance.state.GlanceState.A02
            r5.A01 = r7
            r5.A02 = r8
            r5.A03 = r9
            r5.A04 = r1
            r5.A00 = r0
            java.lang.Object r0 = r1.APs(r2, r5)
            if (r0 != r3) goto L57
            return r3
        L57:
            java.util.Map<java.lang.String, X.6JO<?>> r0 = androidx.glance.state.GlanceState.A01     // Catch: java.lang.Throwable -> L69
            r0.remove(r9)     // Catch: java.lang.Throwable -> L69
            java.io.File r0 = r8.AHB(r7, r9)     // Catch: java.lang.Throwable -> L69
            r0.delete()     // Catch: java.lang.Throwable -> L69
            r1.Ahe(r2)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L69:
            r0 = move-exception
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.state.GlanceState.A01(android.content.Context, X.6PQ, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/content/Context;LX/6PQ<TT;>;Ljava/lang/String;LX/G0V<-TT;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(android.content.Context r7, X.C6PQ r8, java.lang.String r9, X.HtJ r10, X.G0V r11) throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 7
            boolean r0 = r10 instanceof X.C8iP
            if (r0 == 0) goto L29
            r5 = r10
            X.8iP r5 = (X.C8iP) r5
            int r0 = r5.$t
            if (r0 != r3) goto L29
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L34
            if (r2 == r0) goto L42
            if (r2 != r1) goto L2f
            X.Hwg.A00(r4)
            return r4
        L29:
            X.8iP r5 = new X.8iP
            r5.<init>(r6, r10, r3)
            goto L17
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            X.Hwg.A00(r4)
            r5.A01 = r11
            r5.A00 = r0
            java.lang.Object r4 = A00(r7, r6, r8, r9, r5)
            if (r4 != r3) goto L49
        L41:
            return r3
        L42:
            java.lang.Object r11 = r5.A01
            X.G0V r11 = (X.G0V) r11
            X.Hwg.A00(r4)
        L49:
            X.6JO r4 = (X.C6JO) r4
            r0 = 0
            r5.A01 = r0
            r5.A00 = r1
            java.lang.Object r0 = r4.Ahr(r11, r5)
            if (r0 == r3) goto L41
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.state.GlanceState.A02(android.content.Context, X.6PQ, java.lang.String, X.HtJ, X.G0V):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    @Override // X.C6PR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object AMM(android.content.Context r7, X.C6PQ<T> r8, java.lang.String r9, X.HtJ<? super T> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 3
            boolean r0 = r10 instanceof X.C8iO
            if (r0 == 0) goto L29
            r5 = r10
            X.8iO r5 = (X.C8iO) r5
            int r0 = r5.$t
            if (r0 != r3) goto L29
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L34
            if (r2 == r0) goto L40
            if (r2 != r1) goto L2f
            X.Hwg.A00(r4)
            return r4
        L29:
            X.8iO r5 = new X.8iO
            r5.<init>(r6, r10, r3)
            goto L17
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            X.Hwg.A00(r4)
            r5.A00 = r0
            java.lang.Object r4 = A00(r7, r6, r8, r9, r5)
            if (r4 != r3) goto L43
        L3f:
            return r3
        L40:
            X.Hwg.A00(r4)
        L43:
            X.6JO r4 = (X.C6JO) r4
            X.20Q r0 = r4.AEa()
            r5.A00 = r1
            java.lang.Object r0 = X.AbstractC9777Gfy.A02(r0, r5)
            if (r0 == r3) goto L3f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.state.GlanceState.AMM(android.content.Context, X.6PQ, java.lang.String, X.HtJ):java.lang.Object");
    }
}
