package com.facebook.aura.hotels;

/* loaded from: classes3.dex */
public abstract class HotelDetailsPrefetchModifierKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg prefetchHotelDetailsOnImpression(X.BRg r13, X.AHD<com.facebook.aura.hotels.HotelReviewSource> r14, X.BFM r15, int r16) {
        /*
            r11 = r13
            boolean r10 = X.AnonymousClass004.A1b(r13, r14)
            r0 = 312582540(0x12a1a18c, float:1.0200353E-27)
            r2 = r15
            r15.AgE(r0)
            X.CGz r1 = X.AnonymousClass002.A0h(r15)
            boolean r0 = r15.A65(r1)
            java.lang.Object r4 = r15.AaT()
            if (r0 != 0) goto L1e
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L27
        L1e:
            com.facebook.aura.hotels.HotelRepository$Companion r0 = com.facebook.aura.hotels.HotelRepository.Companion
            com.facebook.aura.hotels.HotelRepository r4 = r0.getInstance(r1)
            r15.Ai0(r4)
        L27:
            com.facebook.aura.hotels.HotelRepository r4 = (com.facebook.aura.hotels.HotelRepository) r4
            boolean r9 = r15.A65(r1)
            r0 = r16 & 112(0x70, float:1.57E-43)
            r8 = r0 ^ 48
            r7 = 1
            r6 = 32
            if (r8 <= r6) goto L3c
            boolean r0 = r15.A65(r14)
            if (r0 != 0) goto L41
        L3c:
            r1 = r16 & 48
            r0 = 0
            if (r1 != r6) goto L42
        L41:
            r0 = 1
        L42:
            r9 = r9 | r0
            java.lang.Object r3 = r15.AaT()
            if (r9 != 0) goto L4d
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L51
        L4d:
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AnonymousClass005.A0S(r15, r10)
        L51:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r3)
            if (r0 != 0) goto L92
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L92
            boolean r1 = X.AnonymousClass003.A1J(r15, r3, r4)
            if (r8 <= r6) goto L6b
            boolean r0 = r15.A67(r14)
            if (r0 != 0) goto L70
        L6b:
            r0 = r16 & 48
            if (r0 == r6) goto L70
            r7 = 0
        L70:
            r1 = r1 | r7
            java.lang.Object r13 = r15.AaT()
            if (r1 != 0) goto L7b
            java.lang.Object r0 = X.C78N.A00
            if (r13 != r0) goto L83
        L7b:
            com.facebook.aura.hotels.HotelDetailsPrefetchModifierKt$prefetchHotelDetailsOnImpression$1$1 r13 = new com.facebook.aura.hotels.HotelDetailsPrefetchModifierKt$prefetchHotelDetailsOnImpression$1$1
            r13.<init>(r4, r14, r3)
            r15.Ai0(r13)
        L83:
            X.G0U r13 = (X.G0U) r13
            r15 = 500(0x1f4, double:2.47E-321)
            r14 = 0
            X.Huf r12 = X.EnumC10573Huf.A06
            X.BRg r0 = X.BPc.A00(r11, r12, r13, r14, r15)
            X.AnonymousClass001.A1D(r2)
            return r0
        L92:
            X.AnonymousClass001.A1D(r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelDetailsPrefetchModifierKt.prefetchHotelDetailsOnImpression(X.BRg, X.AHD, X.BFM, int):X.BRg");
    }
}
