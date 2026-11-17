package com.facebook.aura.commands.core;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C06827l3;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class NodeTextRelevanceScorer {
    public static final int $stable = 0;
    public static final double PHRASE_BONUS = 2.0d;
    public static final double TIER_EXACT = 1.0d;
    public static final double TIER_FUZZY = 0.4d;
    public static final double TIER_PREFIX = 0.6d;
    public static final double TIER_SUBSTRING = 0.8d;
    public static final NodeTextRelevanceScorer INSTANCE = new NodeTextRelevanceScorer();
    public static final C06827l3 TOKEN_SPLIT = C06827l3.A02("[^\\p{L}\\p{M}\\p{N}]+");
    public static final C06827l3 WHITESPACE = C06827l3.A02("\\s+");
    public static final C06827l3 COMBINING_MARKS = C06827l3.A02("\\p{Mn}+");

    public final class WeightedField {
        public static final int $stable = 8;
        public final String normalized;
        public final List<String> tokens;
        public final double weight;

        public final String getNormalized() {
            return this.normalized;
        }

        public final List<String> getTokens() {
            return this.tokens;
        }

        public final double getWeight() {
            return this.weight;
        }

        public WeightedField(List<String> list, String str, double d) {
            AnonymousClass003.A0u(list, str);
            this.tokens = list;
            this.normalized = str;
            this.weight = d;
        }
    }

    public final WeightedField field(String str, double d) {
        String strNormalize;
        if (str == null || (strNormalize = INSTANCE.normalize(str)) == null) {
            strNormalize = "";
        }
        if (strNormalize.length() == 0) {
            return null;
        }
        List listA05 = TOKEN_SPLIT.A05(strNormalize);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA05.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return new WeightedField(arrayListA0h, strNormalize, d);
    }

    public final String normalize(String str) {
        C7384Etj.A0Y(str, 0);
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        C7384Etj.A0U(strNormalize);
        String strNormalize2 = Normalizer.normalize(COMBINING_MARKS.A03(strNormalize, ""), Normalizer.Form.NFC);
        C7384Etj.A0U(strNormalize2);
        return AnonymousClass002.A0l(WHITESPACE.A03(AnonymousClass001.A0u(strNormalize2), InviteCodeScratcherKt.CODE_SEPARATOR));
    }

    public final double score(List<String> list, String str, List<WeightedField> list2, double d) {
        AnonymousClass005.A10(list, str, list2);
        Iterator<String> it = list.iterator();
        double d2 = 0.0d;
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            double dMax = 0.0d;
            for (WeightedField weightedField : list2) {
                double dTermScore = termScore(strA0j, weightedField);
                if (dTermScore > 0.0d) {
                    dMax = Math.max(dMax, dTermScore * weightedField.weight);
                }
            }
            if (dMax <= 0.0d) {
                return 0.0d;
            }
            d2 += dMax;
        }
        if (str.length() <= 0) {
            return d2;
        }
        for (WeightedField weightedField2 : list2) {
            if (weightedField2.weight >= d && C7BY.A0q(weightedField2.normalized, str, false)) {
                return d2 + 2.0d;
            }
        }
        return d2;
    }

    public final List<String> tokenize(String str) {
        C7384Etj.A0Y(str, 0);
        List listA05 = TOKEN_SPLIT.A05(normalize(str));
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA05.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return arrayListA0h;
    }

    private final int levenshtein(String str, String str2, int i) {
        int length = str.length();
        int length2 = str2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        int i2 = length + 1;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3;
        }
        int[] iArr2 = new int[i2];
        if (1 <= length2) {
            int[] iArr3 = iArr;
            iArr = iArr2;
            int[] iArr4 = iArr3;
            int i4 = 1;
            while (true) {
                char cCharAt = str2.charAt(i4 - 1);
                iArr[0] = i4;
                int i5 = i + 1;
                int i6 = i5;
                if (1 <= length) {
                    int i7 = 1;
                    while (true) {
                        int i8 = i7 - 1;
                        int iMin = Math.min(Math.min(iArr[i8] + 1, iArr3[i7] + 1), iArr3[i8] + (str.charAt(i8) == cCharAt ? 0 : 1));
                        iArr[i7] = iMin;
                        if (iMin < i6) {
                            i6 = iMin;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                    }
                }
                if (i4 == length2) {
                    int i9 = iArr[length];
                    if (i9 <= i) {
                        i5 = i9;
                    }
                    i6 = i5;
                }
                if (i6 > i) {
                    return i6;
                }
                if (i4 == length2) {
                    break;
                }
                i4++;
                iArr3 = iArr;
                iArr = iArr4;
                iArr4 = iArr3;
            }
        }
        return iArr[length];
    }

    private final double termScore(String str, WeightedField weightedField) {
        int iLevenshtein;
        if (weightedField.tokens.contains(str)) {
            return 1.0d;
        }
        if (C7BY.A0q(weightedField.normalized, str, false)) {
            return 0.8d;
        }
        List<String> list = weightedField.tokens;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                C7384Etj.A0Y(strA0j, 0);
                C7384Etj.A0Y(str, 1);
                if (strA0j.startsWith(str)) {
                    return 0.6d;
                }
            }
        }
        int iMaxEditsFor = maxEditsFor(str);
        double dMax = 0.0d;
        if (iMaxEditsFor != 0) {
            Iterator<String> it2 = weightedField.tokens.iterator();
            while (it2.hasNext()) {
                String strA0j2 = AnonymousClass005.A0j(it2);
                int length = strA0j2.length();
                int length2 = str.length();
                if (length >= length2 - iMaxEditsFor && length <= length2 + iMaxEditsFor && (iLevenshtein = levenshtein(str, strA0j2, iMaxEditsFor)) <= iMaxEditsFor) {
                    dMax = Math.max(dMax, (1.0d - (iLevenshtein / length2)) * 0.4d);
                }
            }
        }
        return dMax;
    }

    private final int maxEditsFor(String str) {
        int length = str.length();
        if (length <= 3) {
            return 0;
        }
        return length <= 6 ? 1 : 2;
    }
}
