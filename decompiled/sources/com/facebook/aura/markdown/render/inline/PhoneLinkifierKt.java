package com.facebook.aura.markdown.render.inline;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BG3;
import X.BQG;
import X.C0881AGi;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1732ApT;
import X.C1733ApU;
import X.C1736ApY;
import X.C1809ArT;
import X.C1824Aro;
import X.C1ji;
import X.C3cG;
import X.C7BY;
import X.HwV;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class PhoneLinkifierKt {
    public static final int MIN_PHONE_DIGITS = 10;

    public static final List<HwV<String, Integer, Integer>> detectPhoneRanges(String str) {
        Character chA15;
        SpannableString spannableString = new SpannableString(str);
        Linkify.addLinks(spannableString, 4);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, str.length(), URLSpan.class);
        if (uRLSpanArr == null || (uRLSpanArr.length) == 0) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (URLSpan uRLSpan : uRLSpanArr) {
            String url = uRLSpan.getURL();
            if (url != null && url.startsWith("tel:")) {
                int i = 0;
                for (int i2 = 0; i2 < url.length(); i2++) {
                    if (Character.isDigit(url.charAt(i2))) {
                        i++;
                    }
                }
                if (i >= 10) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    Character chA152 = BQG.A15(str, spanStart - 1);
                    if ((chA152 == null || !Character.isLetter(chA152.charValue())) && ((chA15 = BQG.A15(str, spanEnd)) == null || !Character.isLetter(chA15.charValue()))) {
                        arrayListA0h.add(new HwV(url, Integer.valueOf(spanStart), Integer.valueOf(spanEnd)));
                    }
                }
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ApQ linkifyPhoneNumbers(ApQ apQ, AuraMarkdownTheme auraMarkdownTheme) {
        AnonymousClass003.A0u(apQ, auraMarkdownTheme);
        String str = apQ.A00;
        if (!C7BY.A0j(str)) {
            List<HwV<String, Integer, Integer>> listRangesFor = PhoneRangeCache.INSTANCE.rangesFor(str);
            if (!listRangesFor.isEmpty()) {
                List<C1733ApU> listA02 = apQ.A02(str.length());
                ArrayList<HwV> arrayListA0h = C3cG.A0h();
                for (HwV<String, Integer, Integer> hwV : listRangesFor) {
                    HwV<String, Integer, Integer> hwV2 = hwV;
                    int iA0F = AnonymousClass001.A0F(hwV2.second);
                    int iA0F2 = AnonymousClass001.A0F(hwV2.third);
                    if (!(listA02 instanceof Collection) || !listA02.isEmpty()) {
                        for (C1733ApU c1733ApU : listA02) {
                            if (c1733ApU.A01 >= iA0F2 || c1733ApU.A00 <= iA0F) {
                            }
                        }
                    }
                    arrayListA0h.add(hwV);
                }
                if (!arrayListA0h.isEmpty()) {
                    long j = auraMarkdownTheme.linkColor;
                    C1736ApY c1736ApY = auraMarkdownTheme.linkFontWeight;
                    BG3 bg3 = BG3.A03;
                    long j2 = C1809ArT.A01;
                    C1824Aro c1824Aro = new C1824Aro(null, null, null, null, null, c1736ApY, null, null, bg3, null, null, j, j2, j2, B6A.A07);
                    C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                    c1731ApSA0W.A07(apQ);
                    for (HwV hwV3 : arrayListA0h) {
                        String str2 = (String) hwV3.first;
                        C1732ApT.A00(new C1ji(new C1697Aoc(c1824Aro, null, null, null), str2), "", c1731ApSA0W.A01, AnonymousClass001.A0F(hwV3.second), AnonymousClass001.A0F(hwV3.third));
                    }
                    return c1731ApSA0W.A04();
                }
            }
        }
        return apQ;
    }
}
