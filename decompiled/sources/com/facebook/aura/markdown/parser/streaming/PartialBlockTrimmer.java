package com.facebook.aura.markdown.parser.streaming;

import X.AnonymousClass000;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BQG;
import X.C06827l3;
import X.C06847l8;
import X.C60R;
import X.C7384Etj;
import X.C7438Evz;
import X.C7LE;
import X.G0U;
import com.facebook.aura.markdown.parser.custom.extensions.MathExtension;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class PartialBlockTrimmer {
    public static final PartialBlockTrimmer INSTANCE = new PartialBlockTrimmer();
    public static final C06827l3 UNCLOSED_LINK = C06827l3.A02("\\[[^\\]]*]\\([^)]*$");
    public static final C06827l3 UNCLOSED_INLINE_PAREN = C06827l3.A02("\\\\\\([^)]*$");
    public static final C06827l3 UNCLOSED_BLOCK_BRACKET = C06827l3.A02("\\\\\\[(?:(?!\\\\\\])[\\s\\S])*$");
    public static final C06827l3 UNCLOSED_INLINE_DOLLAR = C06827l3.A02("(?<!\\$)\\$[^$\\n]+$");
    public static final C06827l3 FIRST_WORD = C06827l3.A02("\\s\\p{L}{2,}");

    /* renamed from: com.facebook.aura.markdown.parser.streaming.PartialBlockTrimmer$trim$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<String, Boolean> {
        public AnonymousClass1(Object obj) {
            super(1, obj, PartialBlockTrimmer.class, "canBecomeInlineMath", "canBecomeInlineMath(Ljava/lang/String;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(String str) {
            return Boolean.valueOf(((PartialBlockTrimmer) AnonymousClass006.A0o(str, this)).canBecomeInlineMath(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canBecomeInlineMath(String str) {
        String strA16 = BQG.A16(str, 1);
        C7384Etj.A0Y(strA16, 0);
        if (strA16.length() == 0) {
            throw new NoSuchElementException(AnonymousClass000.A00(35));
        }
        char cCharAt = strA16.charAt(0);
        if (!Character.isDigit(cCharAt) && !C7LE.A00(cCharAt)) {
            return true;
        }
        C06847l8 c06847l8A01 = C06827l3.A01(strA16, FIRST_WORD);
        return c06847l8A01 == null ? MathExtension.INSTANCE.isLikelyLatex$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser(strA16) : MathExtension.STRONG_LATEX_MARKER.A07(BQG.A17(strA16, c06847l8A01.AJM().A00));
    }

    private final String stripIfMatch(String str, C06827l3 c06827l3, G0U<? super String, Boolean> g0u) {
        C06847l8 c06847l8A01 = C06827l3.A01(str, c06827l3);
        return (c06847l8A01 != null && c06847l8A01.AJM().A01 == str.length() + (-1) && AnonymousClass003.A1X(C06847l8.A00(c06847l8A01), g0u)) ? str.substring(0, c06847l8A01.AJM().A00) : str;
    }

    private final String stripUnclosedBlockDollar(String str) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i <= str.length() - 2) {
            if (str.charAt(i) == '$' && str.charAt(i + 1) == '$') {
                i3++;
                i2 = i;
                i += 2;
            } else {
                i++;
            }
        }
        return i3 % 2 == 1 ? str.substring(0, i2) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String stripIfMatch$default(PartialBlockTrimmer partialBlockTrimmer, String str, C06827l3 c06827l3, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            g0u = new PartialBlockTrimmer$$ExternalSyntheticLambda0();
        }
        return partialBlockTrimmer.stripIfMatch(str, c06827l3, g0u);
    }

    public static final boolean stripIfMatch$lambda$0(String str) {
        return true;
    }

    public final String trim(String str) {
        return C60R.A02(str) != 0 ? stripIfMatch(stripIfMatch(stripIfMatch(stripIfMatch(stripUnclosedBlockDollar(str), UNCLOSED_BLOCK_BRACKET, new PartialBlockTrimmer$$ExternalSyntheticLambda0()), UNCLOSED_LINK, new PartialBlockTrimmer$$ExternalSyntheticLambda0()), UNCLOSED_INLINE_PAREN, new PartialBlockTrimmer$$ExternalSyntheticLambda0()), UNCLOSED_INLINE_DOLLAR, new AnonymousClass1(this)) : str;
    }
}
