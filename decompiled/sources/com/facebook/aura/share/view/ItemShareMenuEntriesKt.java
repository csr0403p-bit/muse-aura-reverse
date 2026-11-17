package com.facebook.aura.share.view;

/* loaded from: classes.dex */
public abstract class ItemShareMenuEntriesKt {
    public static final int ITEM_SHARE_MENU_FIRST_ID = 1000;

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[PHI: r1
  0x0066: PHI (r1v5 java.util.List<com.facebook.aura.share.api.ItemShareAction>) = 
  (r1v3 java.util.List<com.facebook.aura.share.api.ItemShareAction>)
  (r1v6 java.util.List<com.facebook.aura.share.api.ItemShareAction>)
 binds: [B:26:0x0064, B:24:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.share.view.ItemShareMenuEntries rememberItemShareMenuEntries(com.facebook.aura.share.api.ShareableItem r8, com.facebook.aura.share.view.ItemShareLogContext r9, int r10, X.BFM r11, int r12, int r13) {
        /*
            r0 = 1
            X.C7384Etj.A0Y(r9, r0)
            r0 = r13 & 4
            if (r0 == 0) goto La
            r10 = 1000(0x3e8, float:1.401E-42)
        La:
            r7 = -1
            r3 = 0
            if (r8 == 0) goto L79
            com.facebook.aura.share.api.ShareableItemKind r0 = r8.kind
            java.lang.String r6 = r8.id
            java.lang.String r5 = r8.title
        L14:
            com.facebook.aura.analytics.hatch.HatchSurface r1 = r9.surface
            com.facebook.aura.analytics.hatch.HatchSubsurface r4 = r9.subsurface
            com.facebook.aura.analytics.hatch.HatchScreen r2 = r9.screen
            int r0 = X.AnonymousClass003.A0K(r0)
            boolean r0 = r11.A63(r0)
            boolean r0 = X.AnonymousClass003.A1P(r11, r6, r5, r0)
            boolean r1 = X.AnonymousClass003.A1H(r11, r1, r0)
            if (r4 == 0) goto L30
            int r7 = r4.ordinal()
        L30:
            boolean r0 = r11.A63(r7)
            r0 = r0 | r1
            boolean r4 = X.AnonymousClass003.A1H(r11, r2, r0)
            r0 = r12 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L47
            boolean r0 = r11.A63(r10)
            if (r0 != 0) goto L4c
        L47:
            r1 = r12 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L4d
        L4c:
            r0 = 1
        L4d:
            r0 = r0 | r4
            java.lang.Object r2 = r11.AaT()
            if (r0 != 0) goto L58
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L76
        L58:
            if (r8 == 0) goto L62
            com.facebook.aura.share.api.ItemShareActions r0 = com.facebook.aura.share.api.ItemShareActions.INSTANCE
            java.util.List r1 = r0.forItem(r8)
            if (r1 != 0) goto L66
        L62:
            X.AGi r1 = X.C0881AGi.A00
            if (r8 == 0) goto L6e
        L66:
            com.facebook.aura.share.api.ShareableItemKind r0 = r8.kind
            if (r0 == 0) goto L6e
            java.lang.String r3 = r0.getWire()
        L6e:
            com.facebook.aura.share.view.ItemShareMenuEntries r2 = new com.facebook.aura.share.view.ItemShareMenuEntries
            r2.<init>(r1, r10, r3, r9)
            r11.Ai0(r2)
        L76:
            com.facebook.aura.share.view.ItemShareMenuEntries r2 = (com.facebook.aura.share.view.ItemShareMenuEntries) r2
            return r2
        L79:
            r0 = r3
            r6 = r3
            r5 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.share.view.ItemShareMenuEntriesKt.rememberItemShareMenuEntries(com.facebook.aura.share.api.ShareableItem, com.facebook.aura.share.view.ItemShareLogContext, int, X.BFM, int, int):com.facebook.aura.share.view.ItemShareMenuEntries");
    }
}
