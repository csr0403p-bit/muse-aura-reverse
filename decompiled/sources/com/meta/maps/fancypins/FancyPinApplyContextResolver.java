package com.meta.maps.fancypins;

/* loaded from: classes6.dex */
public final class FancyPinApplyContextResolver {
    public static final FancyPinApplyContextResolver INSTANCE = new FancyPinApplyContextResolver();
    public static final String UNKNOWN_PART_ID = "unknown";

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meta.maps.fancypins.FancyPinPartApplyContext resolve(com.meta.maps.fancypins.FancyPinRenderFrame r14, int r15, int r16, X.G0U<? super java.lang.Integer, com.meta.maps.fancypins.FancyPinPresentation> r17, X.G0U<? super java.lang.Integer, java.lang.Integer> r18, X.G0U<? super java.lang.Integer, java.lang.Integer> r19) {
        /*
            r13 = this;
            r0 = 0
            r4 = r19
            r5 = r18
            r6 = r17
            X.AnonymousClass005.A16(r14, r6, r5, r4, r0)
            if (r15 < 0) goto Lc5
            int r0 = r14.overlapMaskRowCount
            if (r15 >= r0) goto Lc5
            r1 = r16
            if (r16 < 0) goto Lc5
            int r0 = r14.overlapMaskStride
            if (r1 >= r0) goto Lc5
            long r12 = r14.overlapMaskAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(r15, r1)
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto Lc5
            int r0 = java.lang.Long.bitCount(r12)
            java.util.ArrayList r3 = X.C60O.A11(r0)
        L2a:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto Lb1
            int r2 = java.lang.Long.numberOfTrailingZeros(r12)
            r7 = 1
            long r0 = r12 - r7
            long r12 = r12 & r0
            int r0 = r14.overlapSourceCount
            if (r2 >= r0) goto L2a
            int r1 = r14.overlapSourceSlotAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(r2)
            java.lang.Object r8 = X.C8j4.A0r(r6, r1)
            com.meta.maps.fancypins.FancyPinPresentation r8 = (com.meta.maps.fancypins.FancyPinPresentation) r8
            if (r8 == 0) goto L2a
            java.lang.Object r0 = X.C8j4.A0r(r5, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L57
            java.lang.Object r0 = X.C8j4.A0r(r4, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Lac
        L57:
            java.util.List<java.lang.String> r1 = r14.variantIds
            int r0 = r0.intValue()
            java.lang.Object r7 = X.AbstractC0878AGe.A0A(r0, r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Lac
        L65:
            int r9 = r14.overlapSourcePartIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(r2)
            com.meta.maps.fancypins.FancyPinBlueprint r0 = r8.blueprint
            java.util.List<com.meta.maps.fancypins.FancyPinVariant> r0 = r0.variants
            java.util.Iterator r2 = r0.iterator()
        L71:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.meta.maps.fancypins.FancyPinVariant r0 = (com.meta.maps.fancypins.FancyPinVariant) r0
            java.lang.String r0 = r0.id
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 == 0) goto L71
        L86:
            com.meta.maps.fancypins.FancyPinVariant r1 = (com.meta.maps.fancypins.FancyPinVariant) r1
            if (r1 == 0) goto La7
            java.util.List<com.meta.maps.fancypins.FancyPinPart> r0 = r1.parts
            if (r0 == 0) goto La7
            java.lang.Object r0 = X.AbstractC0878AGe.A0A(r9, r0)
            com.meta.maps.fancypins.FancyPinPart r0 = (com.meta.maps.fancypins.FancyPinPart) r0
            if (r0 == 0) goto La7
            java.lang.String r2 = r0.id
            if (r2 == 0) goto La7
        L9a:
            com.meta.maps.fancypins.FancyPin r0 = r8.pin
            java.lang.String r1 = r0.id
            com.meta.maps.fancypins.FancyPinPartOcclusion$Source r0 = new com.meta.maps.fancypins.FancyPinPartOcclusion$Source
            r0.<init>(r1, r2, r7)
            r3.add(r0)
            goto L2a
        La7:
            java.lang.String r2 = "unknown"
            goto L9a
        Laa:
            r1 = 0
            goto L86
        Lac:
            com.meta.maps.fancypins.FancyPinBlueprint r0 = r8.blueprint
            java.lang.String r7 = r0.defaultVariantId
            goto L65
        Lb1:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lc5
            com.meta.maps.fancypins.FancyPinPartApplyContext r0 = com.meta.maps.fancypins.FancyPinPartApplyContext.CLEAR
            com.meta.maps.fancypins.FancyPinPartOcclusion r1 = new com.meta.maps.fancypins.FancyPinPartOcclusion
            r1.<init>(r3)
            r0 = 0
            com.meta.maps.fancypins.FancyPinPartApplyContext r2 = new com.meta.maps.fancypins.FancyPinPartApplyContext
            r2.<init>(r1, r0, r0)
            return r2
        Lc5:
            com.meta.maps.fancypins.FancyPinPartApplyContext r2 = com.meta.maps.fancypins.FancyPinPartApplyContext.CLEAR
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinApplyContextResolver.resolve(com.meta.maps.fancypins.FancyPinRenderFrame, int, int, X.G0U, X.G0U, X.G0U):com.meta.maps.fancypins.FancyPinPartApplyContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int semanticKey(com.meta.maps.fancypins.FancyPinRenderFrame r15, int r16, int r17, X.G0U<? super java.lang.Integer, com.meta.maps.fancypins.FancyPinPresentation> r18, X.G0U<? super java.lang.Integer, java.lang.Integer> r19, X.G0U<? super java.lang.Integer, java.lang.Integer> r20) {
        /*
            r14 = this;
            r3 = 0
            r5 = r19
            r4 = r20
            r6 = r18
            X.AnonymousClass005.A16(r15, r6, r5, r4, r3)
            r2 = r16
            if (r16 < 0) goto Lb9
            int r0 = r15.overlapMaskRowCount
            if (r2 >= r0) goto Lb9
            r1 = r17
            if (r17 < 0) goto Lb9
            int r0 = r15.overlapMaskStride
            if (r1 >= r0) goto Lb9
            long r13 = r15.overlapMaskAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(r2, r1)
            r1 = 1
            r12 = 0
        L20:
            r7 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 == 0) goto Lb3
            int r9 = java.lang.Long.numberOfTrailingZeros(r13)
            r10 = 1
            long r7 = r13 - r10
            long r13 = r13 & r7
            int r0 = r15.overlapSourceCount
            if (r9 >= r0) goto L20
            int r2 = r15.overlapSourceSlotAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(r9)
            java.lang.Object r8 = X.C8j4.A0r(r6, r2)
            com.meta.maps.fancypins.FancyPinPresentation r8 = (com.meta.maps.fancypins.FancyPinPresentation) r8
            if (r8 == 0) goto L20
            java.lang.Object r0 = X.C8j4.A0r(r5, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L4f
            java.lang.Object r0 = X.C8j4.A0r(r4, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Lae
        L4f:
            java.util.List<java.lang.String> r2 = r15.variantIds
            int r0 = r0.intValue()
            java.lang.Object r7 = X.AbstractC0878AGe.A0A(r0, r2)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Lae
        L5d:
            int r10 = r15.overlapSourcePartIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(r9)
            com.meta.maps.fancypins.FancyPinBlueprint r0 = r8.blueprint
            java.util.List<com.meta.maps.fancypins.FancyPinVariant> r0 = r0.variants
            java.util.Iterator r9 = r0.iterator()
        L69:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r2 = r9.next()
            r0 = r2
            com.meta.maps.fancypins.FancyPinVariant r0 = (com.meta.maps.fancypins.FancyPinVariant) r0
            java.lang.String r0 = r0.id
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 == 0) goto L69
        L7e:
            com.meta.maps.fancypins.FancyPinVariant r2 = (com.meta.maps.fancypins.FancyPinVariant) r2
            if (r2 == 0) goto La9
            java.util.List<com.meta.maps.fancypins.FancyPinPart> r0 = r2.parts
            if (r0 == 0) goto La9
            java.lang.Object r0 = X.AbstractC0878AGe.A0A(r10, r0)
            com.meta.maps.fancypins.FancyPinPart r0 = (com.meta.maps.fancypins.FancyPinPart) r0
            if (r0 == 0) goto La9
            java.lang.String r2 = r0.id
            if (r2 == 0) goto La9
        L92:
            com.meta.maps.fancypins.FancyPin r0 = r8.pin
            java.lang.String r0 = r0.id
            int r0 = X.AnonymousClass001.A0G(r0)
            int r0 = X.AnonymousClass005.A0I(r2, r0)
            int r0 = X.AnonymousClass001.A0H(r7, r0)
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r12 = r12 + 1
            goto L20
        La9:
            java.lang.String r2 = "unknown"
            goto L92
        Lac:
            r2 = 0
            goto L7e
        Lae:
            com.meta.maps.fancypins.FancyPinBlueprint r0 = r8.blueprint
            java.lang.String r7 = r0.defaultVariantId
            goto L5d
        Lb3:
            if (r12 == 0) goto Lb9
            int r0 = r12 * 31
            int r0 = r0 + r1
            return r0
        Lb9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinApplyContextResolver.semanticKey(com.meta.maps.fancypins.FancyPinRenderFrame, int, int, X.G0U, X.G0U, X.G0U):int");
    }
}
