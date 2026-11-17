package com.facebook.aura.markdown.render.inline;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.B6A;
import X.BG3;
import X.BO6;
import X.BQG;
import X.C0953AJg;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1824Aro;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C7LE;
import X.F60;
import X.FGI;
import X.G0U;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.markdown.render.BulletMarkerKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class InlineRendererKt {
    public static final String INLINE_ENTITY_ACTION_TAG_PREFIX = "aura.inline_entity_action:";
    public static final char[] SUPERSCRIPT_DIGITS = {'\u2070', '\u00b9', '\u00b2', '\u00b3', '\u2074', '\u2075', '\u2076', '\u2077', '\u2078', '\u2079'};
    public static final String WORD_JOINER = "\u2060";

    public static final String inlineEntityActionTag(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M(INLINE_ENTITY_ACTION_TAG_PREFIX, str);
    }

    public static final CharSequence plainText$lambda$0(AuraInline auraInline) {
        AHD<AuraInline> ahd;
        C7384Etj.A0Y(auraInline, 0);
        if (auraInline instanceof AuraInline.Text) {
            return ((AuraInline.Text) auraInline).text;
        }
        if (auraInline instanceof AuraInline.Emphasis) {
            ahd = ((AuraInline.Emphasis) auraInline).children;
        } else if (auraInline instanceof AuraInline.Strong) {
            ahd = ((AuraInline.Strong) auraInline).children;
        } else if (auraInline instanceof AuraInline.Strikethrough) {
            ahd = ((AuraInline.Strikethrough) auraInline).children;
        } else {
            if (!(auraInline instanceof AuraInline.Link)) {
                return auraInline instanceof AuraInline.InlineCode ? ((AuraInline.InlineCode) auraInline).code : auraInline instanceof AuraInline.AutoLink ? ((AuraInline.AutoLink) auraInline).url : "";
            }
            ahd = ((AuraInline.Link) auraInline).children;
        }
        return plainText(ahd);
    }

    public static final String renderInlines$lambda$0(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0U("[image: ", str, "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[PHI: r0
  0x006f: PHI (r0v9 java.lang.String) = (r0v19 java.lang.String), (r0v14 java.lang.String) binds: [B:25:0x0062, B:27:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void appendCustomInline(X.C1731ApS r24, com.facebook.aura.markdown.parser.ast.AuraInline.Custom r25, com.facebook.aura.markdown.render.AuraMarkdownTheme r26, com.facebook.aura.markdown.render.inline.InlineRenderContext r27) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.inline.InlineRendererKt.appendCustomInline(X.ApS, com.facebook.aura.markdown.parser.ast.AuraInline$Custom, com.facebook.aura.markdown.render.AuraMarkdownTheme, com.facebook.aura.markdown.render.inline.InlineRenderContext):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    public static final void appendInline(C1731ApS c1731ApS, AuraInline auraInline, AuraMarkdownTheme auraMarkdownTheme, InlineRenderContext inlineRenderContext) {
        int iA00;
        String str;
        BG3 bg3;
        if (!(auraInline instanceof AuraInline.Text)) {
            int i = auraInline instanceof AuraInline.Emphasis;
            try {
                if (i != 0) {
                    int iA002 = C1731ApS.A00(c1731ApS, auraMarkdownTheme.italicStyle);
                    appendInlines(c1731ApS, ((AuraInline.Emphasis) auraInline).children, auraMarkdownTheme, inlineRenderContext);
                    i = iA002;
                } else if (auraInline instanceof AuraInline.Strong) {
                    int iA003 = C1731ApS.A00(c1731ApS, auraMarkdownTheme.boldStyle);
                    appendInlines(c1731ApS, ((AuraInline.Strong) auraInline).children, auraMarkdownTheme, inlineRenderContext);
                    i = iA003;
                } else {
                    if (!(auraInline instanceof AuraInline.Strikethrough)) {
                        try {
                            if (auraInline instanceof AuraInline.InlineCode) {
                                iA00 = C1731ApS.A00(c1731ApS, C1824Aro.A01(auraMarkdownTheme.inlineCodeStyle, 63487, 0L, auraMarkdownTheme.inlineCodeBackground));
                                c1731ApS.A0E(((AuraInline.InlineCode) auraInline).code);
                            } else if (auraInline instanceof AuraInline.Link) {
                                AuraInline.Link link = (AuraInline.Link) auraInline;
                                if (C7BY.A0j(link.url)) {
                                    appendInlines(c1731ApS, link.children, auraMarkdownTheme, inlineRenderContext);
                                    return;
                                }
                                String strPlainText = plainText(link.children);
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= strPlainText.length()) {
                                        bg3 = BG3.A02;
                                        break;
                                    } else {
                                        if (Character.isLetterOrDigit(strPlainText.charAt(i2))) {
                                            bg3 = BG3.A03;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                String str2 = link.url;
                                long j = auraMarkdownTheme.linkColor;
                                C1736ApY c1736ApY = auraMarkdownTheme.linkFontWeight;
                                long j2 = C1809ArT.A01;
                                int iA004 = C1697Aoc.A00(c1731ApS, new C1824Aro(null, null, null, null, null, c1736ApY, null, null, bg3, null, null, j, j2, j2, B6A.A07), str2);
                                appendInlines(c1731ApS, link.children, auraMarkdownTheme, inlineRenderContext);
                                i = iA004;
                            } else if (auraInline instanceof AuraInline.AutoLink) {
                                AuraInline.AutoLink autoLink = (AuraInline.AutoLink) auraInline;
                                if (C7BY.A0j(autoLink.url)) {
                                    str = autoLink.url;
                                } else {
                                    String str3 = autoLink.url;
                                    long j3 = auraMarkdownTheme.linkColor;
                                    C1736ApY c1736ApY2 = auraMarkdownTheme.linkFontWeight;
                                    BG3 bg32 = BG3.A03;
                                    long j4 = C1809ArT.A01;
                                    iA00 = C1697Aoc.A00(c1731ApS, new C1824Aro(null, null, null, null, null, c1736ApY2, null, null, bg32, null, null, j3, j4, j4, B6A.A07), str3);
                                    c1731ApS.A0E(autoLink.url);
                                }
                            } else {
                                if (!(auraInline instanceof AuraInline.Image)) {
                                    char c = '\n';
                                    if (!C7384Etj.areEqual(auraInline, AuraInline.LineBreak.INSTANCE)) {
                                        if (!C7384Etj.areEqual(auraInline, AuraInline.SoftLineBreak.INSTANCE)) {
                                            if (!(auraInline instanceof AuraInline.Custom)) {
                                                throw C3cG.A0q();
                                            }
                                            appendCustomInline(c1731ApS, (AuraInline.Custom) auraInline, auraMarkdownTheme, inlineRenderContext);
                                            return;
                                        } else if (inlineRenderContext.reflowSoftBreaks) {
                                            c = ' ';
                                        }
                                    }
                                    c1731ApS.A00.append(c);
                                    return;
                                }
                                iA00 = C1731ApS.A00(c1731ApS, auraMarkdownTheme.italicStyle);
                                c1731ApS.A0E(inlineRenderContext.imageAltFormatter.invoke(((AuraInline.Image) auraInline).alt));
                            }
                            return;
                        } finally {
                            c1731ApS.A06(iA00);
                        }
                    }
                    int iA005 = C1731ApS.A00(c1731ApS, auraMarkdownTheme.strikethroughStyle);
                    appendInlines(c1731ApS, ((AuraInline.Strikethrough) auraInline).children, auraMarkdownTheme, inlineRenderContext);
                    i = iA005;
                }
                return;
            } finally {
                c1731ApS.A06(i);
            }
        }
        str = ((AuraInline.Text) auraInline).text;
        c1731ApS.A0E(str);
    }

    public static final void appendSoftLineBreak(C1731ApS c1731ApS, AuraMarkdownTheme auraMarkdownTheme, InlineRenderContext inlineRenderContext, AuraInline auraInline, AuraInline auraInline2) {
        char c;
        Character chA0f;
        Character chA14;
        String strPlainText = auraInline2 != null ? plainText(Collections.singletonList(auraInline2)) : null;
        if (!inlineRenderContext.reflowSoftBreaks || (strPlainText != null && BulletMarkerKt.startsWithBulletMarker(strPlainText, auraMarkdownTheme.bulletGlyph, 0, strPlainText.length()))) {
            c = '\n';
        } else {
            boolean z = false;
            boolean z2 = auraInline == null || ((chA14 = BQG.A14(plainText(Collections.singletonList(auraInline)))) != null && C7LE.A00(chA14.charValue()));
            if (strPlainText == null || ((chA0f = BQG.A0f(strPlainText)) != null && C7LE.A00(chA0f.charValue()))) {
                z = true;
            }
            if (z2 || z) {
                return;
            } else {
                c = ' ';
            }
        }
        c1731ApS.A00.append(c);
    }

    public static final String plainText(List<? extends AuraInline> list) {
        return AbstractC0878AGe.A0L("", "", "", list, new G0U() { // from class: com.facebook.aura.markdown.render.inline.InlineRendererKt$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return InlineRendererKt.plainText$lambda$0((AuraInline) obj);
            }
        });
    }

    public static /* synthetic */ InlineRenderResult renderInlines$default(AHD ahd, AuraMarkdownTheme auraMarkdownTheme, G0U g0u, BO6 bo6, int i, Object obj) {
        if ((i & 4) != 0) {
            g0u = new G0U() { // from class: com.facebook.aura.markdown.render.inline.InlineRendererKt$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj2) {
                    return InlineRendererKt.renderInlines$lambda$0((String) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            bo6 = C0953AJg.A03;
        }
        return renderInlines(ahd, auraMarkdownTheme, g0u, bo6);
    }

    public static final void appendInlines(C1731ApS c1731ApS, List<? extends AuraInline> list, AuraMarkdownTheme auraMarkdownTheme, InlineRenderContext inlineRenderContext) {
        int i = 0;
        for (AuraInline auraInline : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            AuraInline auraInline2 = auraInline;
            if (auraInline2 instanceof AuraInline.SoftLineBreak) {
                appendSoftLineBreak(c1731ApS, auraMarkdownTheme, inlineRenderContext, (AuraInline) AbstractC0878AGe.A0A(i - 1, list), (AuraInline) AbstractC0878AGe.A0A(i2, list));
            } else {
                appendInline(c1731ApS, auraInline2, auraMarkdownTheme, inlineRenderContext);
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.markdown.render.inline.InlineRenderResult renderInlines(X.AHD<? extends com.facebook.aura.markdown.parser.ast.AuraInline> r7, com.facebook.aura.markdown.render.AuraMarkdownTheme r8, X.G0U<? super java.lang.String, java.lang.String> r9, X.BO6<java.lang.String, com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler> r10) {
        /*
            X.AnonymousClass005.A14(r7, r8, r9, r10)
            java.lang.String r0 = plainText(r7)
            int r6 = com.facebook.aura.markdown.render.BlockTextDirectionKt.blockTextDirection(r0)
            boolean r0 = r8.reflowSoftLineBreaks
            if (r0 == 0) goto L13
            r1 = 2
            r0 = 1
            if (r6 == r1) goto L14
        L13:
            r0 = 0
        L14:
            com.facebook.aura.markdown.render.inline.InlineRenderContext r1 = new com.facebook.aura.markdown.render.inline.InlineRenderContext
            r1.<init>(r9, r10, r0)
            X.ApS r0 = X.AnonymousClass006.A0W()
            appendInlines(r0, r7, r8, r1)
            X.ApQ r2 = r0.A04()
            java.util.List<com.facebook.aura.markdown.render.inline.InlineMathEntity> r0 = r1.mathEntities
            X.AHD r3 = X.AGI.A07(r0)
            java.util.List<com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot> r0 = r1.inlineEntitySlots
            X.AHD r4 = X.AGI.A07(r0)
            java.util.List<com.facebook.aura.markdown.render.AuraMarkdownInlineEntityRange> r0 = r1.inlineEntityRanges
            X.AHD r5 = X.AGI.A07(r0)
            com.facebook.aura.markdown.render.inline.InlineRenderResult r1 = new com.facebook.aura.markdown.render.inline.InlineRenderResult
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.inline.InlineRendererKt.renderInlines(X.AHD, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.G0U, X.BO6):com.facebook.aura.markdown.render.inline.InlineRenderResult");
    }

    public static final String toSuperscriptDigits(int i) {
        int length = String.valueOf(i).length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayListA11.add(Character.valueOf(SUPERSCRIPT_DIGITS[r5.charAt(i2) - '0']));
        }
        return AbstractC0878AGe.A0L("", "", "", arrayListA11, null);
    }
}
