package com.meta.maps.fancypins;

/* loaded from: classes6.dex */
public final class FancyPinAnimationHintResolver {
    public static final FancyPinAnimationHintResolver INSTANCE = new FancyPinAnimationHintResolver();
    public static final int NO_VARIANT = 255;

    public final FancyPinPartAnimationHint compute(FancyPinPartRenderState fancyPinPartRenderState, boolean z, int i, int i2, boolean z2) {
        Boolean boolValueOf;
        int i3;
        int i4;
        if (fancyPinPartRenderState != null) {
            boolValueOf = Boolean.valueOf(fancyPinPartRenderState.isVisible);
            i3 = fancyPinPartRenderState.placementIndex;
            i4 = fancyPinPartRenderState.variantIndex;
        } else {
            boolValueOf = null;
            i3 = 0;
            i4 = 255;
        }
        return compute(boolValueOf, i3, i4, z, i, i2, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meta.maps.fancypins.FancyPinPartAnimationHint compute(java.lang.Boolean r1, int r2, int r3, boolean r4, int r5, int r6, boolean r7) {
        /*
            r0 = this;
            if (r1 == 0) goto L29
            r0 = 255(0xff, float:3.57E-43)
            if (r3 == r0) goto L29
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L1d
            if (r4 != 0) goto L13
            com.meta.maps.fancypins.FancyPinPartAnimationHint$Disappear r1 = com.meta.maps.fancypins.FancyPinPartAnimationHint.Disappear.INSTANCE
        L10:
            com.meta.maps.fancypins.FancyPinPartAnimationHint r1 = (com.meta.maps.fancypins.FancyPinPartAnimationHint) r1
            return r1
        L13:
            if (r3 == r6) goto L18
            com.meta.maps.fancypins.FancyPinPartAnimationHint$VariantTransition r1 = com.meta.maps.fancypins.FancyPinPartAnimationHint.VariantTransition.INSTANCE
            goto L10
        L18:
            if (r2 == r5) goto L26
            com.meta.maps.fancypins.FancyPinPartAnimationHint$PlacementChanged r1 = com.meta.maps.fancypins.FancyPinPartAnimationHint.PlacementChanged.INSTANCE
            goto L10
        L1d:
            if (r4 == 0) goto L26
            r0 = 1
            com.meta.maps.fancypins.FancyPinPartAnimationHint$Appear r1 = new com.meta.maps.fancypins.FancyPinPartAnimationHint$Appear
            r1.<init>(r0)
            goto L10
        L26:
            com.meta.maps.fancypins.FancyPinPartAnimationHint$None r1 = com.meta.maps.fancypins.FancyPinPartAnimationHint.None.INSTANCE
            goto L10
        L29:
            com.meta.maps.fancypins.FancyPinPartAnimationHint$Appear r1 = new com.meta.maps.fancypins.FancyPinPartAnimationHint$Appear
            r1.<init>(r7)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinAnimationHintResolver.compute(java.lang.Boolean, int, int, boolean, int, int, boolean):com.meta.maps.fancypins.FancyPinPartAnimationHint");
    }
}
