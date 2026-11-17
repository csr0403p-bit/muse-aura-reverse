package com.facebook.maps.ui.places;

import X.C7384Etj;
import X.InterfaceC5107DYf;

/* loaded from: classes5.dex */
public final class MetaPlaceDetailsService {
    public final InterfaceC5107DYf A00;

    public MetaPlaceDetailsService(InterfaceC5107DYf interfaceC5107DYf) {
        C7384Etj.A0Y(interfaceC5107DYf, 0);
        this.A00 = interfaceC5107DYf;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r11, java.lang.String r12, X.HtJ r13) {
        /*
            r10 = this;
            r6 = 0
            r3 = 2
            boolean r0 = r13 instanceof X.C8906FtO
            if (r0 == 0) goto L92
            r5 = r13
            X.FtO r5 = (X.C8906FtO) r5
            int r0 = r5.$t
            if (r0 != r3) goto L92
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r1 = r5.A06
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L3c
            if (r0 != r7) goto L9d
            X.Hwg.A00(r1)
        L26:
            X.F3i r1 = (X.AbstractC7555F3i) r1
            boolean r0 = r1 instanceof X.F3D
            if (r0 == 0) goto L98
            X.F3D r1 = (X.F3D) r1
            Value r0 = r1.A00
            X.F1G r0 = (X.F1G) r0
            X.CPX r0 = (X.CPX) r0
            T r0 = r0.A01
            X.F3D r4 = new X.F3D
            r4.<init>(r0)
            return r4
        L3c:
            X.Hwg.A00(r1)
            java.lang.String r1 = "HATCH"
            r0 = 16
            X.Hzd r9 = new X.Hzd
            r9.<init>(r1, r6, r0)
            java.lang.String r8 = "FB"
            java.lang.String r3 = "IG"
            java.lang.String r2 = "SEATGEEK"
            java.lang.String r1 = "TRIPADVISOR"
            java.lang.String r0 = "YELP"
            java.lang.String[] r0 = new java.lang.String[]{r8, r3, r2, r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            X.Hzd r3 = new X.Hzd
            r3.<init>(r9, r11, r12, r0)
            java.lang.Class<X.F30> r1 = X.F30.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.BV5.A0d(r0, r1)     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.maps.ui.places.MetaPlaceDetailsQuery.BuilderForInput"
            X.C7384Etj.A0Z(r2, r0)     // Catch: java.lang.Exception -> La2
            X.DbZ r2 = (X.C5180DbZ) r2     // Catch: java.lang.Exception -> La2
            X.DbI r1 = r2.A01
            java.lang.String r0 = "input"
            r1.A01(r3, r0)
            r2.A00 = r7
            X.DYI r2 = r2.build()
            X.DYf r1 = r10.A00
            r5.A01 = r6
            r5.A02 = r6
            r5.A03 = r6
            r5.A04 = r6
            r5.A05 = r6
            r5.A00 = r7
            X.CNw r0 = X.EnumC3451CNw.A01
            java.lang.Object r1 = r1.asCoroutine(r2, r0, r5)
            if (r1 != r4) goto L26
            return r4
        L92:
            X.FtO r5 = new X.FtO
            r5.<init>(r10, r13, r3)
            goto L18
        L98:
            boolean r0 = r1 instanceof X.C7541F0t
            if (r0 == 0) goto Lbc
            return r1
        L9d:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        La2:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.ClassNotFoundException
            if (r0 != 0) goto Lb7
            boolean r0 = r1 instanceof java.lang.IllegalAccessException
            if (r0 != 0) goto Lb7
            boolean r0 = r1 instanceof java.lang.InstantiationException
            if (r0 != 0) goto Lb7
            boolean r0 = r1 instanceof java.lang.reflect.InvocationTargetException
            if (r0 != 0) goto Lb7
            boolean r0 = r1 instanceof java.lang.NoSuchMethodException
            if (r0 == 0) goto Lc0
        Lb7:
            java.lang.RuntimeException r0 = X.BV4.A0e(r1)
            throw r0
        Lbc:
            kotlin.NoWhenBranchMatchedException r1 = X.C3cG.A0q()
        Lc0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.maps.ui.places.MetaPlaceDetailsService.A00(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
