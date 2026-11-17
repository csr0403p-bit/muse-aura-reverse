package com.facebook.aura.markdown.render.reveal;

import X.AGE;
import X.AGN;
import X.AHD;
import X.AKH;
import X.AKO;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BO6;
import X.C06827l3;
import X.C0Yr;
import X.C1731ApS;
import X.C1809ArT;
import X.C1824Aro;
import X.C1BO;
import X.C1Lu;
import X.C78g;
import X.C8j4;
import X.F1E;
import X.F60;
import X.G0U;
import X.HDi;
import X.HxS;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomInlineNames;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.markdown.render.inline.InlineRendererKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class WordRevealKt {
    public static final AKH<WordReveal> LocalWordReveal = new AGN(AGE.A00, new Function0() { // from class: com.facebook.aura.markdown.render.reveal.WordRevealKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return null;
        }
    });
    public static final C06827l3 WORD_REGEX = C06827l3.A02("\\S+");

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.markdown.render.reveal.WordRevealController rememberStreamingRevealController(java.lang.String r11, final java.lang.String r12, boolean r13, boolean r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, X.BFM r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.reveal.WordRevealKt.rememberStreamingRevealController(java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int):com.facebook.aura.markdown.render.reveal.WordRevealController");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.markdown.render.reveal.WordReveal rememberWordReveal(final com.facebook.aura.markdown.render.reveal.WordRevealController r7, com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument r8, com.facebook.aura.markdown.render.AuraMarkdownTheme r9, X.G0U<? super java.lang.String, java.lang.String> r10, X.BFM r11, int r12) {
        /*
            r0 = 1
            X.AnonymousClass005.A11(r8, r9, r10, r0)
            r0 = -308511568(0xffffffffed9c7cb0, float:-6.0538E27)
            r11.AgE(r0)
            if (r7 != 0) goto L11
            X.AnonymousClass002.A19(r11)
            r2 = 0
            return r2
        L11:
            X.AKH<X.BO6<java.lang.String, com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler>> r0 = com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownInlineEntityHandlers
            r3 = r11
            X.BBI r3 = (X.BBI) r3
            java.lang.Object r1 = X.AKO.A07(r0, r3)
            X.BO6 r1 = (X.BO6) r1
            boolean r0 = X.AnonymousClass003.A1K(r11, r8, r1)
            java.lang.Object r4 = r11.AaT()
            if (r0 != 0) goto L2a
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L31
        L2a:
            com.facebook.aura.markdown.render.reveal.RevealLayout r4 = revealLayout(r8, r9, r10, r1)
            r11.Ai0(r4)
        L31:
            com.facebook.aura.markdown.render.reveal.RevealLayout r4 = (com.facebook.aura.markdown.render.reveal.RevealLayout) r4
            r0 = r12 & 14
            r6 = r0 ^ 6
            r5 = 1
            r2 = 4
            if (r6 <= r2) goto L41
            boolean r0 = r11.A67(r7)
            if (r0 != 0) goto L46
        L41:
            r1 = r12 & 6
            r0 = 0
            if (r1 != r2) goto L47
        L46:
            r0 = 1
        L47:
            boolean r0 = X.AnonymousClass001.A1T(r11, r4, r0)
            java.lang.Object r1 = r11.AaT()
            if (r0 != 0) goto L55
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L5d
        L55:
            com.facebook.aura.markdown.render.reveal.WordRevealKt$$ExternalSyntheticLambda0 r1 = new com.facebook.aura.markdown.render.reveal.WordRevealKt$$ExternalSyntheticLambda0
            r1.<init>()
            X.BBI.A0O(r3, r1)
        L5d:
            X.AnonymousClass001.A15(r11, r1)
            if (r6 <= r2) goto L68
            boolean r0 = r11.A65(r7)
            if (r0 != 0) goto L6d
        L68:
            r0 = r12 & 6
            if (r0 == r2) goto L6d
            r5 = 0
        L6d:
            boolean r0 = X.C8j3.A1V(r11, r4, r5)
            java.lang.Object r2 = r11.AaT()
            if (r0 != 0) goto L7b
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L87
        L7b:
            java.util.Map<com.facebook.aura.markdown.parser.ast.AuraBlock, java.lang.Integer> r1 = r4.startOrdinals
            java.util.Map<com.facebook.aura.markdown.parser.ast.AuraBlock, java.lang.Integer> r0 = r4.wordCounts
            com.facebook.aura.markdown.render.reveal.WordReveal r2 = new com.facebook.aura.markdown.render.reveal.WordReveal
            r2.<init>(r7, r1, r0)
            X.BBI.A0O(r3, r2)
        L87:
            com.facebook.aura.markdown.render.reveal.WordReveal r2 = (com.facebook.aura.markdown.render.reveal.WordReveal) r2
            r0 = 0
            X.BBI.A0R(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.reveal.WordRevealKt.rememberWordReveal(com.facebook.aura.markdown.render.reveal.WordRevealController, com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.G0U, X.BFM, int):com.facebook.aura.markdown.render.reveal.WordReveal");
    }

    public static final RevealLayout revealLayout(AuraMarkdownDocument auraMarkdownDocument, AuraMarkdownTheme auraMarkdownTheme, G0U<? super String, String> g0u, BO6<String, AuraMarkdownInlineEntityHandler> bo6) {
        AnonymousClass005.A14(auraMarkdownDocument, auraMarkdownTheme, g0u, bo6);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        F1E f1e = new F1E();
        revealLayout$visit(map, f1e, map2, auraMarkdownTheme, g0u, bo6, auraMarkdownDocument.blocks);
        return new RevealLayout(map, map2, f1e.element);
    }

    /* renamed from: withWordReveal-XO-JAsU, reason: not valid java name */
    public static final ApQ m1432withWordRevealXOJAsU(ApQ apQ, AuraBlock auraBlock, long j, BFM bfm, int i) {
        Integer num;
        ApQ apQM1431applyWordAlpha42QJj7c = apQ;
        AnonymousClass003.A0u(apQ, auraBlock);
        bfm.AgE(1200558881);
        BBI bbi = (BBI) bfm;
        WordReveal wordReveal = (WordReveal) AKO.A07(LocalWordReveal, bbi);
        if (wordReveal != null && (num = wordReveal.startOrdinals.get(auraBlock)) != null) {
            int iIntValue = num.intValue();
            Integer num2 = wordReveal.wordCounts.get(auraBlock);
            if (num2 != null) {
                apQM1431applyWordAlpha42QJj7c = m1431applyWordAlpha42QJj7c(apQM1431applyWordAlpha42QJj7c, iIntValue, num2.intValue(), j, wordReveal.controller);
            }
        }
        BBI.A0R(bbi, false);
        return apQM1431applyWordAlpha42QJj7c;
    }

    /* renamed from: $r8$lambda$2TLYHAwpF63PpP2Q8m5X5on-1uc, reason: not valid java name */
    public static /* synthetic */ Unit m1430$r8$lambda$2TLYHAwpF63PpP2Q8m5X5on1uc(WordRevealController wordRevealController, RevealLayout revealLayout) {
        wordRevealController.setRenderedTotal(revealLayout.totalWords);
        return Unit.INSTANCE;
    }

    public static final WordReveal LocalWordReveal$lambda$0() {
        return null;
    }

    /* renamed from: applyWordAlpha-42QJj7c, reason: not valid java name */
    public static final ApQ m1431applyWordAlpha42QJj7c(ApQ apQ, int i, int i2, long j, WordRevealController wordRevealController) {
        if (apQ.length() == 0 || i2 == 0 || i + i2 <= wordRevealController.settledWords$delegate.AGd()) {
            return apQ;
        }
        int i3 = 0;
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        c1731ApSA0W.A07(apQ);
        Iterator it = C06827l3.A00(apQ.A00, WORD_REGEX).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            C1Lu c1Lu = (C1Lu) next;
            float fAlpha = wordRevealController.alpha(i + i3);
            if (fAlpha < 1.0f) {
                long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), fAlpha);
                long j2 = C1809ArT.A01;
                c1731ApSA0W.A0A(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA04, j2, j2, B6A.A07), c1Lu.AJM().A00, c1Lu.AJM().A01 + 1);
            }
            i3 = i4;
        }
        return c1731ApSA0W.A04();
    }

    public static final AKH<WordReveal> getLocalWordReveal() {
        return LocalWordReveal;
    }

    public static final boolean isPromotedAttachment(AuraBlock.Paragraph paragraph) {
        AuraInline auraInline = (AuraInline) AbstractC0878AGe.A0K(paragraph.inlines);
        if (auraInline != null) {
            return (auraInline instanceof AuraInline.Image) || ((auraInline instanceof AuraInline.Custom) && AuraCustomInlineNames.FILE_LINK.equals(((AuraInline.Custom) auraInline).name));
        }
        return false;
    }

    public static final Unit rememberWordReveal$lambda$1$0(WordRevealController wordRevealController, RevealLayout revealLayout) {
        wordRevealController.setRenderedTotal(revealLayout.totalWords);
        return Unit.INSTANCE;
    }

    public static final int revealLayout$wordCount(AuraMarkdownTheme auraMarkdownTheme, G0U<? super String, String> g0u, BO6<String, AuraMarkdownInlineEntityHandler> bo6, AHD<? extends AuraInline> ahd) {
        Iterator<T> it = C06827l3.A00(InlineRendererKt.renderInlines(ahd, auraMarkdownTheme, g0u, bo6).annotated.A00, WORD_REGEX).iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC0885AGm.A13();
                throw F60.createAndThrow();
            }
        }
        return i;
    }

    public static /* synthetic */ C78g $r8$lambda$zgUYqeCGKietDEv5T2B92W8EbWI(C1BO c1bo, MutableState mutableState, C0Yr c0Yr) {
        rememberStreamingRevealController$reportRevealCompleted(c1bo, mutableState);
        return new WordRevealKt$rememberStreamingRevealController$lambda$15$0$$inlined$onDispose$1();
    }

    public static final C78g rememberStreamingRevealController$lambda$1$0(C1BO c1bo, C0Yr c0Yr) {
        Function0 function0A0A = C1BO.A0A(c1bo);
        if (function0A0A != null) {
            function0A0A.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$lambda$1$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final Unit rememberStreamingRevealController$lambda$12$0(WordRevealController wordRevealController, String str) {
        wordRevealController.setTextLength(str.length());
        return Unit.INSTANCE;
    }

    public static final C78g rememberStreamingRevealController$lambda$15$0(C1BO c1bo, MutableState mutableState, C0Yr c0Yr) {
        rememberStreamingRevealController$reportRevealCompleted(c1bo, mutableState);
        return new WordRevealKt$rememberStreamingRevealController$lambda$15$0$$inlined$onDispose$1();
    }

    public static final C78g rememberStreamingRevealController$lambda$4$0(C1BO c1bo, C0Yr c0Yr) {
        Function0 function0A0A = C1BO.A0A(c1bo);
        if (function0A0A != null) {
            function0A0A.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$lambda$4$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final void rememberStreamingRevealController$reportRevealCompleted(C1BO<? extends Function0<Unit>> c1bo, MutableState<Boolean> mutableState) {
        Function0 function0A0A = C1BO.A0A(c1bo);
        if (function0A0A == null || MutableState.A0A((MutableState) mutableState)) {
            return;
        }
        MutableState.A09(true, mutableState);
        function0A0A.invoke();
    }

    public static final void revealLayout$visit(HashMap<AuraBlock, Integer> map, F1E f1e, HashMap<AuraBlock, Integer> map2, AuraMarkdownTheme auraMarkdownTheme, G0U<? super String, String> g0u, BO6<String, AuraMarkdownInlineEntityHandler> bo6, List<? extends AuraBlock> list) {
        AHD<AuraInline> ahd;
        Iterator<? extends AuraBlock> it = list.iterator();
        while (it.hasNext()) {
            AuraBlock auraBlockA0i = C8j4.A0i(it);
            if (auraBlockA0i instanceof AuraBlock.Paragraph) {
                AuraBlock.Paragraph paragraph = (AuraBlock.Paragraph) auraBlockA0i;
                if (!isPromotedAttachment(paragraph)) {
                    ahd = paragraph.inlines;
                    int iRevealLayout$wordCount = revealLayout$wordCount(auraMarkdownTheme, g0u, bo6, ahd);
                    C8j4.A1O(auraBlockA0i, map, f1e.element);
                    C8j4.A1O(auraBlockA0i, map2, iRevealLayout$wordCount);
                    f1e.element += iRevealLayout$wordCount;
                }
            } else if (auraBlockA0i instanceof AuraBlock.Heading) {
                ahd = ((AuraBlock.Heading) auraBlockA0i).inlines;
                int iRevealLayout$wordCount2 = revealLayout$wordCount(auraMarkdownTheme, g0u, bo6, ahd);
                C8j4.A1O(auraBlockA0i, map, f1e.element);
                C8j4.A1O(auraBlockA0i, map2, iRevealLayout$wordCount2);
                f1e.element += iRevealLayout$wordCount2;
            } else if (auraBlockA0i instanceof AuraBlock.BlockQuote) {
                revealLayout$visit(map, f1e, map2, auraMarkdownTheme, g0u, bo6, ((AuraBlock.BlockQuote) auraBlockA0i).children);
            } else if (auraBlockA0i instanceof AuraBlock.UnorderedList) {
                Iterator it2 = ((AuraBlock.UnorderedList) auraBlockA0i).items.iterator();
                while (it2.hasNext()) {
                    revealLayout$visit(map, f1e, map2, auraMarkdownTheme, g0u, bo6, C8j4.A1E(it2));
                }
            } else if (auraBlockA0i instanceof AuraBlock.OrderedList) {
                Iterator it3 = ((AuraBlock.OrderedList) auraBlockA0i).items.iterator();
                while (it3.hasNext()) {
                    revealLayout$visit(map, f1e, map2, auraMarkdownTheme, g0u, bo6, C8j4.A1E(it3));
                }
            } else if (auraBlockA0i instanceof AuraBlock.Table) {
                AuraBlock.Table table = (AuraBlock.Table) auraBlockA0i;
                Iterator it4 = table.header.iterator();
                while (it4.hasNext()) {
                    revealLayout$visit(map, f1e, map2, auraMarkdownTheme, g0u, bo6, C8j4.A1F(it4));
                }
                Iterator it5 = table.rows.iterator();
                while (it5.hasNext()) {
                    Iterator itA11 = C8j4.A11(it5);
                    while (itA11.hasNext()) {
                        revealLayout$visit(map, f1e, map2, auraMarkdownTheme, g0u, bo6, C8j4.A1F(itA11));
                    }
                }
            } else {
                continue;
            }
        }
    }
}
