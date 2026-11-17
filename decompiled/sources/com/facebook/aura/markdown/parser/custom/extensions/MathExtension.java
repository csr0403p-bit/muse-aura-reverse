package com.facebook.aura.markdown.parser.custom.extensions;

import X.AnonymousClass002;
import X.BFI;
import X.C06827l3;
import X.C7384Etj;
import X.C7LE;
import X.EnumC06837l4;
import java.util.Set;

/* loaded from: classes3.dex */
public final class MathExtension {
    public static final C06827l3 BLOCK_BRACKET;
    public static final C06827l3 BLOCK_BRACKET_LINE;
    public static final C06827l3 BLOCK_DOLLAR;
    public static final C06827l3 BLOCK_DOLLAR_LINE;
    public static final C06827l3 COMPACT_MONOMIAL;
    public static final C06827l3 INLINE_DOLLAR;
    public static final C06827l3 INLINE_PAREN;
    public static final MathExtension INSTANCE = new MathExtension();
    public static final int LATEX_SHORT_TOKEN_MAX = 16;
    public static final C06827l3 PURE_NUMBER;
    public static final C06827l3 STRONG_LATEX_MARKER;
    public static final C06827l3 WEAK_LATEX_MARKER;

    public final boolean isLikelyBlockLatex$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() != 0) {
            return STRONG_LATEX_MARKER.A07(strA0l);
        }
        return false;
    }

    public final boolean isLikelyLatex$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser(String str) {
        boolean z;
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        int length = strA0l.length();
        if (length != 0) {
            if (!STRONG_LATEX_MARKER.A07(strA0l) && !PURE_NUMBER.A08(strA0l) && (length > 16 || !COMPACT_MONOMIAL.A08(strA0l))) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (C7LE.A01(strA0l, i)) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (WEAK_LATEX_MARKER.A07(strA0l)) {
                    if (z) {
                        if (!Character.isDigit(strA0l.charAt(0)) && length <= 16) {
                            return true;
                        }
                    }
                } else if (length <= 16 && !z && !Character.isDigit(strA0l.charAt(0))) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    static {
        EnumC06837l4 enumC06837l4 = EnumC06837l4.A02;
        BLOCK_DOLLAR = new C06827l3("\\$\\$(.+?)\\$\\$", enumC06837l4);
        BLOCK_BRACKET = new C06827l3("\\\\\\[(.+?)\\\\\\]", enumC06837l4);
        INLINE_DOLLAR = C06827l3.A02("(?<!\\$)\\$(?!\\$)([^$\\n]+?)\\$(?!\\$)");
        INLINE_PAREN = C06827l3.A02("\\\\\\((.+?)\\\\\\)");
        EnumC06837l4 enumC06837l42 = EnumC06837l4.A04;
        BLOCK_DOLLAR_LINE = new C06827l3("^[ \\t]*\\$\\$[ \\t]*\\R(.+?)\\R[ \\t]*\\$\\$[ \\t]*$", (Set<? extends EnumC06837l4>) BFI.A0H(new EnumC06837l4[]{enumC06837l42, enumC06837l4}));
        BLOCK_BRACKET_LINE = new C06827l3("^[ \\t]*\\\\\\[[ \\t]*\\R(.+?)\\R[ \\t]*\\\\\\][ \\t]*$", (Set<? extends EnumC06837l4>) BFI.A0H(new EnumC06837l4[]{enumC06837l42, enumC06837l4}));
        STRONG_LATEX_MARKER = C06827l3.A02("[\\\\{}^_]");
        WEAK_LATEX_MARKER = C06827l3.A02("[<>=+!]");
        PURE_NUMBER = C06827l3.A02("^[\\d,.]+$");
        COMPACT_MONOMIAL = C06827l3.A02("^\\d[\\d,.]*\\p{L}+$");
    }

    public final C06827l3 getBLOCK_BRACKET$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser() {
        return BLOCK_BRACKET;
    }

    public final C06827l3 getBLOCK_BRACKET_LINE$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser() {
        return BLOCK_BRACKET_LINE;
    }

    public final C06827l3 getBLOCK_DOLLAR$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser() {
        return BLOCK_DOLLAR;
    }

    public final C06827l3 getBLOCK_DOLLAR_LINE$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser() {
        return BLOCK_DOLLAR_LINE;
    }

    public final C06827l3 getINLINE_DOLLAR$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser() {
        return INLINE_DOLLAR;
    }

    public final C06827l3 getINLINE_PAREN$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser() {
        return INLINE_PAREN;
    }

    public final C06827l3 getSTRONG_LATEX_MARKER$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser() {
        return STRONG_LATEX_MARKER;
    }
}
