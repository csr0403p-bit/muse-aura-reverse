package com.facebook.aura.shopping.view;

/* loaded from: classes.dex */
public abstract class HatchProductImageRecoveryKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String absoluteProductWebUrl(java.lang.String r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L4a
            java.lang.String r3 = X.AnonymousClass002.A0l(r5)
            if (r3 == 0) goto L4a
            int r0 = r3.length()
            if (r0 > 0) goto L10
            r3 = r4
        L10:
            if (r3 == 0) goto L4a
            java.net.URI r2 = new java.net.URI     // Catch: java.net.URISyntaxException -> L4a
            r2.<init>(r3)     // Catch: java.net.URISyntaxException -> L4a
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "http"
            if (r1 != 0) goto L45
            r0 = 0
        L20:
            if (r0 != 0) goto L2d
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "https"
            if (r1 != 0) goto L40
            r0 = 0
        L2b:
            if (r0 == 0) goto L4a
        L2d:
            java.lang.String r0 = r2.getHost()
            if (r0 == 0) goto L4a
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L4a
            java.lang.String r0 = r2.getRawUserInfo()
            if (r0 != 0) goto L4a
            return r3
        L40:
            boolean r0 = r1.equalsIgnoreCase(r0)
            goto L2b
        L45:
            boolean r0 = r1.equalsIgnoreCase(r0)
            goto L20
        L4a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductImageRecoveryKt.absoluteProductWebUrl(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r8.contains(r7) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.view.ProductImageResolution resolveProductImages(X.AHD<java.lang.String> r6, java.lang.String r7, java.util.Set<java.lang.String> r8, com.facebook.aura.shopping.view.ProductImagePreview r9) {
        /*
            r1 = 0
            X.AnonymousClass005.A11(r6, r8, r9, r1)
            com.facebook.aura.shopping.view.ProductImagePreview$Unavailable r0 = com.facebook.aura.shopping.view.ProductImagePreview.Unavailable.INSTANCE
            boolean r0 = r9.equals(r0)
            r2 = 1
            if (r0 == 0) goto L19
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            com.facebook.aura.shopping.view.ProductImageResolution r3 = new com.facebook.aura.shopping.view.ProductImageResolution
            r3.<init>(r6, r0, r1)
            return r3
        L19:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r6.iterator()
        L22:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r3 = r4.next()
            boolean r0 = r8.contains(r3)
            if (r0 != 0) goto L22
            r5.add(r3)
            goto L22
        L36:
            X.AHD r0 = X.AGI.A07(r5)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L50
            if (r7 == 0) goto L56
            boolean r0 = r8.contains(r7)
            if (r0 != 0) goto L56
        L48:
            java.lang.String[] r0 = new java.lang.String[]{r7}
            X.AHH r0 = X.AGI.A0E(r0)
        L50:
            com.facebook.aura.shopping.view.ProductImageResolution r3 = new com.facebook.aura.shopping.view.ProductImageResolution
            r3.<init>(r0, r2, r1)
            return r3
        L56:
            com.facebook.aura.shopping.view.ProductImagePreview$NotRequested r0 = com.facebook.aura.shopping.view.ProductImagePreview.NotRequested.INSTANCE
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L66
            X.AHI r0 = X.AHI.A01
            com.facebook.aura.shopping.view.ProductImageResolution r3 = new com.facebook.aura.shopping.view.ProductImageResolution
            r3.<init>(r0, r2, r2)
            return r3
        L66:
            com.facebook.aura.shopping.view.ProductImagePreview$Pending r0 = com.facebook.aura.shopping.view.ProductImagePreview.Pending.INSTANCE
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L71
            X.AHI r0 = X.AHI.A01
            goto L50
        L71:
            boolean r0 = r9 instanceof com.facebook.aura.shopping.view.ProductImagePreview.Resolved
            if (r0 == 0) goto L82
            com.facebook.aura.shopping.view.ProductImagePreview$Resolved r9 = (com.facebook.aura.shopping.view.ProductImagePreview.Resolved) r9
            java.lang.String r7 = r9.url
            if (r7 == 0) goto L90
            boolean r0 = r8.contains(r7)
            if (r0 != 0) goto L90
            goto L48
        L82:
            com.facebook.aura.shopping.view.ProductImagePreview$Unavailable r0 = com.facebook.aura.shopping.view.ProductImagePreview.Unavailable.INSTANCE
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L90
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L90:
            X.AHI r0 = X.AHI.A01
            com.facebook.aura.shopping.view.ProductImageResolution r3 = new com.facebook.aura.shopping.view.ProductImageResolution
            r3.<init>(r0, r1, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductImageRecoveryKt.resolveProductImages(X.AHD, java.lang.String, java.util.Set, com.facebook.aura.shopping.view.ProductImagePreview):com.facebook.aura.shopping.view.ProductImageResolution");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.view.ProductImageRecovery rememberProductImageRecovery(java.lang.String r13, java.lang.String r14, boolean r15, X.AHD<java.lang.String> r16, java.lang.String r17, X.BFM r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductImageRecoveryKt.rememberProductImageRecovery(java.lang.String, java.lang.String, boolean, X.AHD, java.lang.String, X.BFM, int, int):com.facebook.aura.shopping.view.ProductImageRecovery");
    }
}
