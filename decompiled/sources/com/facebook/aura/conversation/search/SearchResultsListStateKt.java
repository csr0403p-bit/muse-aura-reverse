package com.facebook.aura.conversation.search;

/* loaded from: classes.dex */
public abstract class SearchResultsListStateKt {
    public static final String SEARCH_SURFACE_FULL_SCREEN = "full_screen";
    public static final String SEARCH_SURFACE_SIDE_PANEL = "side_panel";

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListState rememberSearchResultsListState(com.facebook.aura.conversation.viewmodel.HatchSearchViewModel r10, java.lang.String r11, java.lang.String r12, X.BFM r13, int r14) {
        /*
            r2 = 0
            X.AnonymousClass005.A10(r10, r11, r12)
            com.facebook.aura.conversation.repo.HatchSearchRepository r0 = r10.repository
            com.facebook.aura.conversation.repo.HatchSearchScrollAnchor r0 = r0.scrollAnchorFor(r11, r12)
            if (r0 == 0) goto La4
            int r1 = r0.firstVisibleItemIndex
            int r0 = r0.firstVisibleItemScrollOffset
        L10:
            r3 = r13
            androidx.compose.foundation.lazy.LazyListState r13 = X.AZ3.A00(r1, r0, r13, r2, r2)
            r6 = r14
            r0 = r14 & 14
            r2 = r0 ^ 6
            r7 = 4
            if (r2 <= r7) goto L23
            boolean r0 = r3.A67(r10)
            if (r0 != 0) goto L28
        L23:
            r0 = r14 & 6
            r9 = 0
            if (r0 != r7) goto L29
        L28:
            r9 = 1
        L29:
            r0 = r14 & 112(0x70, float:1.57E-43)
            r1 = r0 ^ 48
            r5 = 32
            if (r1 <= r5) goto L37
            boolean r0 = r3.A65(r11)
            if (r0 != 0) goto L3c
        L37:
            r4 = r14 & 48
            r0 = 0
            if (r4 != r5) goto L3d
        L3c:
            r0 = 1
        L3d:
            r9 = r9 | r0
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L4c
            boolean r0 = r3.A65(r12)
            if (r0 != 0) goto L51
        L4c:
            r4 = r14 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r4 != r8) goto L52
        L51:
            r0 = 1
        L52:
            boolean r0 = X.AnonymousClass002.A1W(r3, r13, r9, r0)
            java.lang.Object r9 = r3.AaT()
            if (r0 != 0) goto L60
            java.lang.Object r0 = X.C78N.A00
            if (r9 != r0) goto L69
        L60:
            r14 = 0
            com.facebook.aura.conversation.search.SearchResultsListStateKt$rememberSearchResultsListState$1$1 r9 = new com.facebook.aura.conversation.search.SearchResultsListStateKt$rememberSearchResultsListState$1$1
            r9.<init>(r10, r11, r12, r13, r14)
            r3.Ai0(r9)
        L69:
            X.AnonymousClass001.A18(r3, r9, r12)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            if (r2 <= r7) goto L76
            boolean r0 = r3.A67(r10)
            if (r0 != 0) goto L7b
        L76:
            r0 = r6 & 6
            r2 = 0
            if (r0 != r7) goto L7c
        L7b:
            r2 = 1
        L7c:
            if (r1 <= r5) goto L84
            boolean r0 = r3.A65(r11)
            if (r0 != 0) goto L89
        L84:
            r1 = r6 & 48
            r0 = 0
            if (r1 != r5) goto L8a
        L89:
            r0 = 1
        L8a:
            boolean r1 = X.AnonymousClass002.A1W(r3, r13, r2, r0)
            java.lang.Object r0 = r3.AaT()
            if (r1 != 0) goto L98
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto La0
        L98:
            com.facebook.aura.conversation.search.SearchResultsListStateKt$rememberSearchResultsListState$2$1 r0 = new com.facebook.aura.conversation.search.SearchResultsListStateKt$rememberSearchResultsListState$2$1
            r0.<init>(r10, r11, r13)
            r3.Ai0(r0)
        La0:
            X.AnonymousClass001.A17(r3, r0, r4)
            return r13
        La4:
            r1 = 0
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.search.SearchResultsListStateKt.rememberSearchResultsListState(com.facebook.aura.conversation.viewmodel.HatchSearchViewModel, java.lang.String, java.lang.String, X.BFM, int):androidx.compose.foundation.lazy.LazyListState");
    }
}
