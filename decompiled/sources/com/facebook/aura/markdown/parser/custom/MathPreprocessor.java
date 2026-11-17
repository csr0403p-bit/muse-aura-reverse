package com.facebook.aura.markdown.parser.custom;

import X.ADq;
import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BQG;
import X.C06827l3;
import X.C0KA;
import X.C1Lu;
import X.C2FI;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C8iC;
import X.G0U;
import com.facebook.aura.markdown.parser.custom.MathPreprocessor;
import com.facebook.aura.markdown.parser.custom.extensions.MathExtension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class MathPreprocessor {
    public static final char PLACEHOLDER_CLOSE = '\ue001';
    public static final char PLACEHOLDER_OPEN = '\ue000';
    public static final MathPreprocessor INSTANCE = new MathPreprocessor();
    public static final C06827l3 PLACEHOLDER_REGEX = C06827l3.A02("\ue000(\\d+)\ue001");
    public static final C06827l3 INLINE_CODE = C06827l3.A02("(`+)[^\\n]*?\\1");

    public final class Candidate {
        public final String expression;
        public final boolean isBlock;
        public final ADq range;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Candidate) {
                    Candidate candidate = (Candidate) obj;
                    if (!C7384Etj.areEqual(this.range, candidate.range) || !C7384Etj.areEqual(this.expression, candidate.expression) || this.isBlock != candidate.isBlock) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Candidate copy$default(Candidate candidate, ADq aDq, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                aDq = candidate.range;
            }
            if ((i & 2) != 0) {
                str = candidate.expression;
            }
            if ((i & 4) != 0) {
                z = candidate.isBlock;
            }
            return candidate.copy(aDq, str, z);
        }

        public final ADq component1() {
            return this.range;
        }

        public final String component2() {
            return this.expression;
        }

        public final boolean component3() {
            return this.isBlock;
        }

        public final String getExpression() {
            return this.expression;
        }

        public final ADq getRange() {
            return this.range;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0I(this.expression, AnonymousClass005.A0E(this.range)), this.isBlock);
        }

        public final boolean isBlock() {
            return this.isBlock;
        }

        public String toString() {
            ADq aDq = this.range;
            String str = this.expression;
            boolean z = this.isBlock;
            StringBuilder sbA0f = C3cG.A0f(aDq, "Candidate(range=");
            sbA0f.append(", expression=");
            sbA0f.append(str);
            sbA0f.append(", isBlock=");
            sbA0f.append(z);
            return AnonymousClass001.A0v(")", sbA0f);
        }

        public Candidate(ADq aDq, String str, boolean z) {
            AnonymousClass003.A0u(aDq, str);
            this.range = aDq;
            this.expression = str;
            this.isBlock = z;
        }

        public final Candidate copy(ADq aDq, String str, boolean z) {
            AnonymousClass003.A0u(aDq, str);
            return new Candidate(aDq, str, z);
        }
    }

    public static final boolean extract$lambda$2(String str) {
        C7384Etj.A0Y(str, 0);
        return MathExtension.INSTANCE.isLikelyBlockLatex$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser(str);
    }

    public static final boolean extract$lambda$3(String str) {
        C7384Etj.A0Y(str, 0);
        return MathExtension.INSTANCE.isLikelyBlockLatex$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser(str);
    }

    public static final boolean extract$lambda$4(String str) {
        C7384Etj.A0Y(str, 0);
        return MathExtension.INSTANCE.isLikelyLatex$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser(str);
    }

    public static final boolean extract$lambda$5(String str) {
        C7384Etj.A0Y(str, 0);
        return MathExtension.INSTANCE.isLikelyLatex$fbandroid_express_aura_java_com_facebook_aura_markdown_parser_parser(str);
    }

    public static final Comparable extract$lambda$6(Candidate candidate) {
        C7384Etj.A0Y(candidate, 0);
        return Integer.valueOf(candidate.range.A00);
    }

    public static final Comparable extract$lambda$7(Candidate candidate) {
        C7384Etj.A0Y(candidate, 0);
        return Integer.valueOf(-candidate.range.A01);
    }

    private final boolean isCurrencyDelimited(String str, ADq aDq, int i) {
        Character chA15;
        Character chA152;
        return (i == 0 || (chA15 = BQG.A15(str, aDq.A00 + i)) == null || !Character.isDigit(chA15.charValue()) || (chA152 = BQG.A15(str, aDq.A01 + 1)) == null || !Character.isDigit(chA152.charValue())) ? false : true;
    }

    public final MathExtraction extract(String str) {
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        if (length != 0) {
            int i = 0;
            if (!C7BY.A0k(str, PLACEHOLDER_OPEN) && !C7BY.A0k(str, PLACEHOLDER_CLOSE)) {
                List<ADq> listCodeSpans = codeSpans(str);
                ArrayList arrayListA0h = C3cG.A0h();
                extract$collect(str, arrayListA0h, MathExtension.BLOCK_DOLLAR_LINE, true, 0, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.MathPreprocessor$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return AnonymousClass001.A0i();
                    }
                });
                extract$collect(str, arrayListA0h, MathExtension.BLOCK_BRACKET_LINE, true, 0, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.MathPreprocessor$$ExternalSyntheticLambda1
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return AnonymousClass001.A0i();
                    }
                });
                extract$collect(str, arrayListA0h, MathExtension.BLOCK_DOLLAR, true, 2, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.MathPreprocessor$$ExternalSyntheticLambda2
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MathPreprocessor.extract$lambda$2((String) obj));
                    }
                });
                extract$collect(str, arrayListA0h, MathExtension.BLOCK_BRACKET, true, 0, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.MathPreprocessor$$ExternalSyntheticLambda3
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MathPreprocessor.extract$lambda$3((String) obj));
                    }
                });
                extract$collect(str, arrayListA0h, MathExtension.INLINE_DOLLAR, false, 1, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.MathPreprocessor$$ExternalSyntheticLambda4
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MathPreprocessor.extract$lambda$4((String) obj));
                    }
                });
                extract$collect(str, arrayListA0h, MathExtension.INLINE_PAREN, false, 0, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.MathPreprocessor$$ExternalSyntheticLambda5
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MathPreprocessor.extract$lambda$5((String) obj));
                    }
                });
                if (!arrayListA0h.isEmpty()) {
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    int i2 = -1;
                    for (Candidate candidate : AbstractC0878AGe.A0c(arrayListA0h, new C2FI(new G0U[]{new G0U() { // from class: com.facebook.aura.markdown.parser.custom.MathPreprocessor$$ExternalSyntheticLambda6
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return MathPreprocessor.extract$lambda$6((MathPreprocessor.Candidate) obj);
                        }
                    }, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.MathPreprocessor$$ExternalSyntheticLambda7
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return MathPreprocessor.extract$lambda$7((MathPreprocessor.Candidate) obj);
                        }
                    }}))) {
                        if (candidate.range.A00 > i2) {
                            if (!(listCodeSpans instanceof Collection) || !listCodeSpans.isEmpty()) {
                                Iterator<ADq> it = listCodeSpans.iterator();
                                while (it.hasNext()) {
                                    if (INSTANCE.overlaps(candidate.range, it.next())) {
                                        break;
                                    }
                                }
                            }
                            arrayListA0h2.add(candidate);
                            i2 = candidate.range.A01;
                        }
                    }
                    if (!arrayListA0h2.isEmpty()) {
                        HashMap map = new HashMap(arrayListA0h2.size());
                        StringBuilder sb = new StringBuilder(length);
                        Iterator it2 = arrayListA0h2.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            int i4 = i3 + 1;
                            Candidate candidate2 = (Candidate) it2.next();
                            int i5 = candidate2.range.A00;
                            if (i5 > i) {
                                sb.append((CharSequence) str, i, i5);
                            }
                            sb.append(PLACEHOLDER_OPEN);
                            sb.append(i3);
                            sb.append(PLACEHOLDER_CLOSE);
                            map.put(Integer.valueOf(i3), new MathToken(candidate2.expression, candidate2.isBlock));
                            i = candidate2.range.A01 + 1;
                            i3 = i4;
                        }
                        if (i < length) {
                            sb.append((CharSequence) str, i, length);
                        }
                        return new MathExtraction(sb.toString(), map);
                    }
                }
            }
        }
        return new MathExtraction(str, AGH.A0E());
    }

    public static /* synthetic */ void extract$collect$default(String str, List list, C06827l3 c06827l3, boolean z, int i, G0U g0u, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        extract$collect(str, list, c06827l3, z, i, g0u);
    }

    public static final boolean extract$lambda$0(String str) {
        return true;
    }

    public static final boolean extract$lambda$1(String str) {
        return true;
    }

    private final boolean overlaps(ADq aDq, ADq aDq2) {
        return aDq.A00 <= aDq2.A01 && aDq.A01 >= aDq2.A00;
    }

    public final C06827l3 getPLACEHOLDER_REGEX() {
        return PLACEHOLDER_REGEX;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[LOOP:0: B:3:0x000e->B:42:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6 A[EDGE_INSN: B:61:0x00a6->B:43:0x00a6 BREAK  A[LOOP:0: B:3:0x000e->B:42:0x00a1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<X.ADq> codeSpans(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.parser.custom.MathPreprocessor.codeSpans(java.lang.String):java.util.List");
    }

    public static final void extract$collect(String str, List<Candidate> list, C06827l3 c06827l3, boolean z, int i, G0U<? super String, Boolean> g0u) {
        C8iC c8iC = new C8iC(C06827l3.A00(str, c06827l3));
        while (c8iC.hasNext()) {
            C1Lu c1Lu = (C1Lu) c8iC.next();
            if (!INSTANCE.isCurrencyDelimited(str, c1Lu.AJM(), i)) {
                String strA0n = C60Q.A0n(c1Lu.AG1(), 1);
                String strA0l = AnonymousClass002.A0l(strA0n);
                if (strA0l.length() != 0 && AnonymousClass003.A1X(strA0n, g0u)) {
                    list.add(new Candidate(c1Lu.AJM(), strA0l, z));
                }
            }
        }
    }
}
