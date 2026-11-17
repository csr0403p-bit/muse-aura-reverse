package com.facebook.aura.markdown.parser.custom.extensions;

import X.AGI;
import X.AHD;
import X.AnonymousClass005;
import X.C00r;
import X.C06827l3;
import X.C06847l8;
import X.C1Lu;
import X.C3cG;
import X.C60Q;
import X.C8j4;
import X.C8j5;
import X.G0U;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraInlineMarkerSplitterKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0196  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.facebook.aura.markdown.parser.ast.AuraBlock$OrderedList] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.facebook.aura.markdown.parser.ast.AuraBlock$BlockQuote] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.markdown.parser.ast.AuraBlock rewriteBlock(com.facebook.aura.markdown.parser.ast.AuraBlock r13, X.C06827l3 r14, X.G0U<? super X.C1Lu, com.facebook.aura.markdown.parser.ast.AuraInline.Custom> r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.parser.custom.extensions.AuraInlineMarkerSplitterKt.rewriteBlock(com.facebook.aura.markdown.parser.ast.AuraBlock, X.7l3, X.G0U):com.facebook.aura.markdown.parser.ast.AuraBlock");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final TableCell rewriteCell(TableCell tableCell, C06827l3 c06827l3, G0U<? super C1Lu, AuraInline.Custom> g0u) {
        AHD<AuraBlock> ahd = tableCell.children;
        int size = ahd.size();
        ?? A0t = 0;
        int i = 0;
        while (i < size) {
            Object obj = ahd.get(i);
            AuraBlock auraBlockRewriteBlock = rewriteBlock((AuraBlock) obj, c06827l3, g0u);
            if (A0t != 0) {
                A0t.add(auraBlockRewriteBlock);
            } else if (auraBlockRewriteBlock != obj) {
                A0t = C60Q.A0t(ahd);
                for (int iA0G = 0; iA0G < i; iA0G = C8j4.A0G(A0t, ahd, iA0G)) {
                }
                A0t.add(auraBlockRewriteBlock);
            }
            i++;
            A0t = A0t;
        }
        if (A0t == 0) {
            A0t = ahd;
        }
        Iterable iterable = (Iterable) A0t;
        return iterable != tableCell.children ? new TableCell(AGI.A06(iterable)) : tableCell;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final ListItem rewriteItem(ListItem listItem, C06827l3 c06827l3, G0U<? super C1Lu, AuraInline.Custom> g0u) {
        AHD<AuraBlock> ahd = listItem.children;
        int size = ahd.size();
        ?? A0t = 0;
        int i = 0;
        while (i < size) {
            Object obj = ahd.get(i);
            AuraBlock auraBlockRewriteBlock = rewriteBlock((AuraBlock) obj, c06827l3, g0u);
            if (A0t != 0) {
                A0t.add(auraBlockRewriteBlock);
            } else if (auraBlockRewriteBlock != obj) {
                A0t = C60Q.A0t(ahd);
                for (int iA0G = 0; iA0G < i; iA0G = C8j4.A0G(A0t, ahd, iA0G)) {
                }
                A0t.add(auraBlockRewriteBlock);
            }
            i++;
            A0t = A0t;
        }
        if (A0t == 0) {
            A0t = ahd;
        }
        Iterable iterable = (Iterable) A0t;
        return iterable != listItem.children ? new ListItem(AGI.A06(iterable)) : listItem;
    }

    public static final List<AuraInline> splitText(AuraInline.Text text, C06827l3 c06827l3, G0U<? super C1Lu, AuraInline.Custom> g0u) {
        int i = 0;
        C06847l8 c06847l8A01 = C06827l3.A01(text.text, c06827l3);
        if (c06847l8A01 == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        do {
            if (c06847l8A01.AJM().A00 > i) {
                arrayListA0h.add(new AuraInline.Text(text.text.substring(i, c06847l8A01.AJM().A00)));
            }
            arrayListA0h.add(g0u.invoke(c06847l8A01));
            i = c06847l8A01.AJM().A01 + 1;
            c06847l8A01 = c06847l8A01.ARG();
        } while (c06847l8A01 != null);
        C8j5.A0n(text.text, arrayListA0h, i);
        return arrayListA0h;
    }

    public static final <T> List<T> mapPreservingIdentity(AHD<? extends T> ahd, G0U<? super T, ? extends T> g0u) {
        int size = ahd.size();
        ArrayList arrayListA0t = null;
        for (int i = 0; i < size; i++) {
            C00r c00r = (Object) ahd.get(i);
            T tInvoke = g0u.invoke(c00r);
            if (arrayListA0t != null) {
                arrayListA0t.add(tInvoke);
            } else if (tInvoke != c00r) {
                arrayListA0t = C60Q.A0t(ahd);
                int iA0G = 0;
                while (iA0G < i) {
                    iA0G = C8j4.A0G(arrayListA0t, ahd, iA0G);
                }
                arrayListA0t.add(tInvoke);
            }
        }
        return arrayListA0t != null ? arrayListA0t : ahd;
    }

    public static final List<AuraInline> rewriteChildren(AHD<? extends AuraInline> ahd, C06827l3 c06827l3, G0U<? super C1Lu, AuraInline.Custom> g0u, G0U<? super AHD<? extends AuraInline>, ? extends AuraInline> g0u2) {
        List<AuraInline> listRewriteInlines = rewriteInlines(ahd, c06827l3, g0u);
        if (listRewriteInlines == ahd) {
            return null;
        }
        return Collections.singletonList(g0u2.invoke(AGI.A07(listRewriteInlines)));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.facebook.aura.markdown.parser.ast.AuraInline> rewriteInlines(X.AHD<? extends com.facebook.aura.markdown.parser.ast.AuraInline> r9, X.C06827l3 r10, X.G0U<? super X.C1Lu, com.facebook.aura.markdown.parser.ast.AuraInline.Custom> r11) {
        /*
            int r6 = r9.size()
            r8 = 0
            r5 = r8
            r4 = 0
        L7:
            if (r4 >= r6) goto Lb1
            java.lang.Object r3 = r9.get(r4)
            com.facebook.aura.markdown.parser.ast.AuraInline r3 = (com.facebook.aura.markdown.parser.ast.AuraInline) r3
            boolean r0 = r3 instanceof com.facebook.aura.markdown.parser.ast.AuraInline.Text
            if (r0 == 0) goto L36
            r0 = r3
            com.facebook.aura.markdown.parser.ast.AuraInline$Text r0 = (com.facebook.aura.markdown.parser.ast.AuraInline.Text) r0
            java.util.List r0 = splitText(r0, r10, r11)
        L1a:
            if (r5 != 0) goto L2a
            if (r0 == 0) goto L2f
            java.util.ArrayList r5 = X.C60Q.A0t(r9)
            r1 = 0
        L23:
            if (r1 >= r4) goto L32
            int r1 = X.C8j4.A0G(r5, r9, r1)
            goto L23
        L2a:
            if (r0 != 0) goto L32
            r5.add(r3)
        L2f:
            int r4 = r4 + 1
            goto L7
        L32:
            r5.addAll(r0)
            goto L2f
        L36:
            boolean r0 = r3 instanceof com.facebook.aura.markdown.parser.ast.AuraInline.Emphasis
            if (r0 == 0) goto L53
            r0 = r3
            com.facebook.aura.markdown.parser.ast.AuraInline$Emphasis r0 = (com.facebook.aura.markdown.parser.ast.AuraInline.Emphasis) r0
            X.AHD<com.facebook.aura.markdown.parser.ast.AuraInline> r1 = r0.children
            java.util.List r0 = rewriteInlines(r1, r10, r11)
            if (r0 == r1) goto Lae
            X.AHD r1 = X.AGI.A06(r0)
            com.facebook.aura.markdown.parser.ast.AuraInline$Emphasis r0 = new com.facebook.aura.markdown.parser.ast.AuraInline$Emphasis
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L1a
        L53:
            boolean r0 = r3 instanceof com.facebook.aura.markdown.parser.ast.AuraInline.Strong
            if (r0 == 0) goto L70
            r0 = r3
            com.facebook.aura.markdown.parser.ast.AuraInline$Strong r0 = (com.facebook.aura.markdown.parser.ast.AuraInline.Strong) r0
            X.AHD<com.facebook.aura.markdown.parser.ast.AuraInline> r1 = r0.children
            java.util.List r0 = rewriteInlines(r1, r10, r11)
            if (r0 == r1) goto Lae
            X.AHD r1 = X.AGI.A06(r0)
            com.facebook.aura.markdown.parser.ast.AuraInline$Strong r0 = new com.facebook.aura.markdown.parser.ast.AuraInline$Strong
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L1a
        L70:
            boolean r0 = r3 instanceof com.facebook.aura.markdown.parser.ast.AuraInline.Strikethrough
            if (r0 == 0) goto L8d
            r0 = r3
            com.facebook.aura.markdown.parser.ast.AuraInline$Strikethrough r0 = (com.facebook.aura.markdown.parser.ast.AuraInline.Strikethrough) r0
            X.AHD<com.facebook.aura.markdown.parser.ast.AuraInline> r1 = r0.children
            java.util.List r0 = rewriteInlines(r1, r10, r11)
            if (r0 == r1) goto Lae
            X.AHD r1 = X.AGI.A06(r0)
            com.facebook.aura.markdown.parser.ast.AuraInline$Strikethrough r0 = new com.facebook.aura.markdown.parser.ast.AuraInline$Strikethrough
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L1a
        L8d:
            boolean r0 = r3 instanceof com.facebook.aura.markdown.parser.ast.AuraInline.Link
            if (r0 == 0) goto Lae
            r7 = r3
            com.facebook.aura.markdown.parser.ast.AuraInline$Link r7 = (com.facebook.aura.markdown.parser.ast.AuraInline.Link) r7
            X.AHD<com.facebook.aura.markdown.parser.ast.AuraInline> r1 = r7.children
            java.util.List r0 = rewriteInlines(r1, r10, r11)
            if (r0 == r1) goto Lae
            X.AHD r2 = X.AGI.A07(r0)
            java.lang.String r1 = r7.url
            java.lang.String r0 = r7.title
            com.facebook.aura.markdown.parser.ast.AuraInline$Link r0 = r7.copy(r1, r0, r2)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L1a
        Lae:
            r0 = r8
            goto L1a
        Lb1:
            if (r5 == 0) goto Lb4
            return r5
        Lb4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.parser.custom.extensions.AuraInlineMarkerSplitterKt.rewriteInlines(X.AHD, X.7l3, X.G0U):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final AuraMarkdownDocument splitTextInlinesOn(AuraMarkdownDocument auraMarkdownDocument, C06827l3 c06827l3, G0U<? super C1Lu, AuraInline.Custom> g0u) {
        AnonymousClass005.A0x(auraMarkdownDocument, c06827l3, g0u);
        AHD<AuraBlock> ahd = auraMarkdownDocument.blocks;
        int size = ahd.size();
        ?? A0t = 0;
        int i = 0;
        while (i < size) {
            Object obj = ahd.get(i);
            AuraBlock auraBlockRewriteBlock = rewriteBlock((AuraBlock) obj, c06827l3, g0u);
            if (A0t != 0) {
                A0t.add(auraBlockRewriteBlock);
            } else if (auraBlockRewriteBlock != obj) {
                A0t = C60Q.A0t(ahd);
                for (int iA0G = 0; iA0G < i; iA0G = C8j4.A0G(A0t, ahd, iA0G)) {
                }
                A0t.add(auraBlockRewriteBlock);
            }
            i++;
            A0t = A0t;
        }
        if (A0t == 0) {
            A0t = ahd;
        }
        Iterable iterable = (Iterable) A0t;
        return iterable != auraMarkdownDocument.blocks ? new AuraMarkdownDocument(AGI.A06(iterable)) : auraMarkdownDocument;
    }
}
