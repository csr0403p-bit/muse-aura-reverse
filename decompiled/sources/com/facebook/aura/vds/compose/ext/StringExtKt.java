package com.facebook.aura.vds.compose.ext;

import X.ADq;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AKO;
import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC1556AlL;
import X.AbstractC1996Aw5;
import X.AbstractC7536F0j;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.B0A;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BG3;
import X.BNt;
import X.C0881AGi;
import X.C1731ApS;
import X.C1733ApU;
import X.C1736ApY;
import X.C1809ArT;
import X.C1810ArU;
import X.C1818Arh;
import X.C1822Arm;
import X.C1824Aro;
import X.C1847AsK;
import X.C19U;
import X.C1Ls;
import X.C1OR;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C8j3;
import X.F60;
import X.HwV;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.LocaleList;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.richtext.AuraInlineContent;
import com.facebook.aura.vds.compose.text.richtext.AuraInlineContentItem;
import com.facebook.aura.vds.compose.text.richtext.AuraSpanStyles;
import com.facebook.aura.vds.compose.text.richtext.blockquote.AnnotatedStringExtKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class StringExtKt {
    public static final int BLOCK_QUOTE_BAR_GAP_SP = 16;
    public static final int BLOCK_QUOTE_BAR_WIDTH_SP = 4;
    public static final long BLOCK_QUOTE_EMPTY_LINE_HEIGHT_SP = C19U.A03(1);
    public static final String EXTERNAL_LINK_TAG = "[external_link]";
    public static final int ORDERED_LIST_ADDITIONAL_CHARACTER_OFFSET_SP = 8;
    public static final int ORDERED_LIST_DEPTH_OFFSET_SP = 18;
    public static final int UNORDERED_LIST_DEPTH_OFFSET_SP = 12;

    public static final void addBlockQuoteAnnotationsForDepths(C1731ApS c1731ApS, CharSequence charSequence, int i, int i2, int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            AnnotatedStringExtKt.addBlockQuoteAnnotation(c1731ApS, i, i2, 1);
            return;
        }
        List<ADq> listComputeLineRanges = computeLineRanges(charSequence, i, i2);
        int iMin = Math.min(listComputeLineRanges.size(), length);
        if (iMin == 0) {
            return;
        }
        Iterator<Integer> it = ATD.A0C(0, iMin).iterator();
        if (!it.hasNext()) {
            throw C8j3.A1D();
        }
        BNt bNt = (BNt) it;
        int i3 = iArr[bNt.A00()];
        while (it.hasNext()) {
            int i4 = iArr[bNt.A00()];
            if (i3 < i4) {
                i3 = i4;
            }
        }
        if (i3 < 1) {
            i3 = 1;
        }
        int i5 = 1;
        while (true) {
            int i6 = -1;
            for (int i7 = 0; i7 < iMin; i7++) {
                if (iArr[i7] >= i5) {
                    if (i6 < 0) {
                        i6 = i7;
                    }
                } else if (i6 >= 0) {
                    AnnotatedStringExtKt.addBlockQuoteAnnotation(c1731ApS, listComputeLineRanges.get(i6).A00, listComputeLineRanges.get(i7 - 1).A01 + 1, i5);
                    i6 = -1;
                }
            }
            if (i6 >= 0) {
                AnnotatedStringExtKt.addBlockQuoteAnnotation(c1731ApS, listComputeLineRanges.get(i6).A00, listComputeLineRanges.get(iMin - 1).A01 + 1, i5);
            }
            if (i5 == i3) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* renamed from: addListStyle-EKa3MwU, reason: not valid java name */
    public static final void m2548addListStyleEKa3MwU(C1731ApS c1731ApS, int i, int i2, long j, long j2) {
        C7384Etj.A0Y(c1731ApS, 0);
        c1731ApS.A09(new C1818Arh(null, null, new C1810ArU(j, j2), null, 0, 0, 0, 0, C1809ArT.A01), i, i2);
    }

    public static final ApQ annotatedString(String str, boolean z, AHD<Boolean> ahd, C1822Arm c1822Arm, BFM bfm, int i, int i2) {
        AHD<Boolean> ahd2 = ahd;
        C7384Etj.A0Y(str, 0);
        boolean zA1K = C3cG.A1K(i2 & 2, z);
        if ((i2 & 4) != 0) {
            ahd2 = AHI.A01;
        }
        if ((i2 & 8) != 0) {
            c1822Arm = null;
        }
        Resources resources = (Resources) AKO.A07(AndroidCompositionLocals_androidKt.A04, (BBI) bfm);
        C1824Aro themedLinkStyle = getThemedLinkStyle(c1822Arm, bfm, (i >> 9) & 14, 0);
        boolean zA1V = C8j3.A1V(bfm, resources.getConfiguration().getLocales(), (((i & 14) ^ 6) > 4 && bfm.A65(str)) || (i & 6) == 4);
        Object objAaT = bfm.AaT();
        if (zA1V || objAaT == C78N.A00) {
            Spanned spannedFromHtml = Html.fromHtml(str);
            C7384Etj.A0U(spannedFromHtml);
            objAaT = toAnnotatedString(spannedFromHtml, themedLinkStyle, null, zA1K, ahd2, false, null);
            bfm.Ai0(objAaT);
        }
        return (ApQ) objAaT;
    }

    public static final int computeHash(Object... objArr) {
        int iA0G = 1;
        for (Object obj : objArr) {
            iA0G = AnonymousClass005.A0G(obj, iA0G * 31);
        }
        return iA0G;
    }

    public static final ApQ fromResourceQuantityStringWithArgsHtml(Resources resources, C1824Aro c1824Aro, int i, int i2, String... strArr) throws Resources.NotFoundException {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        String[] strArr3 = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr3[i3] = Html.escapeHtml(strArr2[i3]);
        }
        String quantityString = resources.getQuantityString(i, i2, strArr3);
        if (quantityString == null) {
            quantityString = "";
        }
        Spanned spannedFromHtml = Html.fromHtml(quantityString);
        C7384Etj.A0U(spannedFromHtml);
        return toAnnotatedString(spannedFromHtml, c1824Aro, null, false, AHI.A01, false, null);
    }

    public static final ApQ fromResourceStringWithArgsHtml(Resources resources, C1824Aro c1824Aro, int i, String... strArr) throws Resources.NotFoundException {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        String[] strArr3 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr3[i2] = Html.escapeHtml(strArr2[i2]);
        }
        String string = resources.getString(i, strArr3);
        if (string == null) {
            string = "";
        }
        Spanned spannedFromHtml = Html.fromHtml(string);
        C7384Etj.A0U(spannedFromHtml);
        return toAnnotatedString(spannedFromHtml, c1824Aro, null, false, AHI.A01, false, null);
    }

    public static final C1733ApU<C1OR> getFirstUrlAnnotation(ApQ apQ, int i) {
        C7384Etj.A0Y(apQ, 0);
        return (C1733ApU) AbstractC0878AGe.A0G(apQ.A04(i, i));
    }

    public static final Resources getResourcesRemembered(Locale locale, BFM bfm, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            locale = null;
        }
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        if (locale == null) {
            bfm.AgE(-1205764669);
            BBI.A0R(bbi, false);
            Resources resources = contextA00.getResources();
            C7384Etj.A0U(resources);
            return resources;
        }
        bfm.AgE(-1205763944);
        if ((((i & 14) ^ 6) <= 4 || !bfm.A65(locale)) && (i & 6) != 4) {
            z = false;
        }
        Object objAaT = bfm.AaT();
        if (z || objAaT == C78N.A00) {
            Configuration configuration = new Configuration(C8j3.A0Z(contextA00));
            configuration.setLocale(locale);
            objAaT = contextA00.createConfigurationContext(configuration).getResources();
            bfm.Ai0(objAaT);
        }
        Resources resources2 = (Resources) objAaT;
        C7384Etj.A0X(resources2);
        BBI.A0R(bbi, false);
        return resources2;
    }

    public static final String stringResourceForLocale(Context context, int i, Locale locale) throws Resources.NotFoundException {
        C7384Etj.A0Y(context, 0);
        String string = getResources(context, locale).getString(i);
        C7384Etj.A0U(string);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.ApQ annotatedStringResource(int r7, java.util.Locale r8, boolean r9, X.AHD<java.lang.Boolean> r10, X.C1822Arm r11, X.BFM r12, int r13, int r14) {
        /*
            r0 = r14 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r8 = r1
        L6:
            r0 = r14 & 4
            r4 = 0
            if (r0 == 0) goto Lc
            r9 = 0
        Lc:
            r0 = r14 & 8
            if (r0 == 0) goto L12
            X.AHI r10 = X.AHI.A01
        L12:
            r0 = r14 & 16
            if (r0 == 0) goto L17
            r11 = r1
        L17:
            int r0 = r13 >> 3
            r0 = r0 & 14
            android.content.res.Resources r3 = getResourcesRemembered(r8, r12, r0, r4)
            int r0 = r13 >> 12
            r0 = r0 & 14
            X.Aro r2 = getThemedLinkStyle(r11, r12, r0, r4)
            android.content.res.Configuration r0 = r3.getConfiguration()
            android.os.LocaleList r6 = r0.getLocales()
            r0 = r13 & 14
            r0 = r0 ^ 6
            r5 = 4
            if (r0 <= r5) goto L3c
            boolean r0 = r12.A63(r7)
            if (r0 != 0) goto L41
        L3c:
            r1 = r13 & 6
            r0 = 0
            if (r1 != r5) goto L42
        L41:
            r0 = 1
        L42:
            boolean r5 = X.C8j3.A1V(r12, r6, r0)
            r0 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L54
            boolean r0 = r12.A65(r8)
            if (r0 != 0) goto L58
        L54:
            r0 = r13 & 48
            if (r0 != r1) goto L59
        L58:
            r4 = 1
        L59:
            r5 = r5 | r4
            java.lang.Object r1 = r12.AaT()
            if (r5 != 0) goto L64
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L6b
        L64:
            X.ApQ r1 = fromResourceStringHtml(r3, r2, r7, r9, r10)
            r12.Ai0(r1)
        L6b:
            X.ApQ r1 = (X.ApQ) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.StringExtKt.annotatedStringResource(int, java.util.Locale, boolean, X.AHD, X.Arm, X.BFM, int, int):X.ApQ");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void applyBlockQuoteParagraphAndAnnotations(X.C1731ApS r21, java.lang.CharSequence r22, int r23, int r24, int[] r25, com.facebook.aura.vds.compose.text.richtext.AuraSpanStyles r26) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.StringExtKt.applyBlockQuoteParagraphAndAnnotations(X.ApS, java.lang.CharSequence, int, int, int[], com.facebook.aura.vds.compose.text.richtext.AuraSpanStyles):void");
    }

    public static final List<ADq> computeLineRanges(CharSequence charSequence, int i, int i2) {
        if (i >= i2) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        int i3 = i;
        while (i < i2) {
            if (charSequence.charAt(i) == '\n') {
                arrayListA0h.add(new ADq(i3, i));
                i3 = i + 1;
            }
            i++;
        }
        if (i3 >= i2) {
            return arrayListA0h;
        }
        arrayListA0h.add(new ADq(i3, i2 - 1));
        return arrayListA0h;
    }

    public static final Resources getResources(Context context, Locale locale) {
        if (locale == null) {
            Resources resources = context.getResources();
            C7384Etj.A0U(resources);
            return resources;
        }
        Configuration configuration = new Configuration(C8j3.A0Z(context));
        configuration.setLocale(locale);
        Resources resources2 = context.createConfigurationContext(configuration).getResources();
        C7384Etj.A0X(resources2);
        return resources2;
    }

    public static /* synthetic */ Resources getResources$default(Context context, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = null;
        }
        return getResources(context, locale);
    }

    public static final C1824Aro getThemedLinkStyle(C1822Arm c1822Arm, BFM bfm, int i, int i2) {
        C1822Arm c1822Arm2 = c1822Arm;
        if ((i2 & 1) != 0) {
            c1822Arm2 = null;
        }
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        long j = auraTheme.getColors(bfm, 6).link;
        if (c1822Arm2 == null) {
            c1822Arm2 = C3cH.A0X(bfm, auraTheme, 234739613).linkCommon;
        } else {
            bfm.AgE(234738404);
        }
        boolean zA1V = AnonymousClass001.A1V(bfm);
        if (!C7384Etj.areEqual(c1822Arm2, C1822Arm.A03)) {
            return C1822Arm.A00(null, c1822Arm2, null, null, null, null, null, null, null, null, zA1V ? 1 : 0, zA1V ? 1 : 0, zA1V ? 1 : 0, 16777214, j, 0L, 0L, 0L).A02;
        }
        long j2 = C1809ArT.A01;
        return new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07);
    }

    public static /* synthetic */ String stringResourceForLocale$default(Context context, int i, Locale locale, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            locale = null;
        }
        return stringResourceForLocale(context, i, locale);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ApQ toAnnotatedString(Spanned spanned, C1824Aro c1824Aro, AuraSpanStyles auraSpanStyles, boolean z, AHD<Boolean> ahd, boolean z2, AuraInlineContent auraInlineContent) {
        int iA0B;
        Spanned spanned2 = spanned;
        int i = 0;
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        AbstractC1556AlL[] abstractC1556AlLArr = (AbstractC1556AlL[]) spanned2.getSpans(0, spanned2.length(), AbstractC1556AlL.class);
        C7384Etj.A0X(abstractC1556AlLArr);
        if (abstractC1556AlLArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned2);
            Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AbstractC1556AlL.class);
            C7384Etj.A0U(spans);
            for (AbstractC1556AlL abstractC1556AlL : (AbstractC1556AlL[]) spans) {
                int spanStart = spannableStringBuilder.getSpanStart(abstractC1556AlL);
                for (int spanEnd = spannableStringBuilder.getSpanEnd(abstractC1556AlL) - 1; spanEnd > spanStart; spanEnd--) {
                    if (spannableStringBuilder.charAt(spanEnd) == '\n' && spannableStringBuilder.charAt(spanEnd - 1) == '\n') {
                        spannableStringBuilder.delete(spanEnd, spanEnd + 1);
                    }
                }
            }
            spanned2 = spannableStringBuilder;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Object[] spans2 = spanned2.getSpans(0, spanned2.length(), Object.class);
        C7384Etj.A0U(spans2);
        for (Object obj : spans2) {
            int spanStart2 = spanned2.getSpanStart(obj);
            int spanEnd2 = spanned2.getSpanEnd(obj);
            if (obj instanceof AuraTextSpacingSpan) {
                long j = ((AuraTextSpacingSpan) obj).height;
                if (spanStart2 > spanEnd2) {
                    c1731ApSA0W.A09(new C1818Arh(null, null, null, null, 1, 1, 0, 0, j), spanStart2, spanEnd2);
                } else {
                    long j2 = B6A.A07;
                    c1731ApSA0W.A0A(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j2, j, C1809ArT.A01, j2), spanStart2, spanEnd2);
                }
            } else if (obj instanceof FixedWidthSpaceSpan) {
                long j3 = ((FixedWidthSpaceSpan) obj).width;
                C1847AsK c1847AsK = AbstractC1996Aw5.A01;
                long j4 = B6A.A07;
                c1731ApSA0W.A0A(new C1824Aro(null, null, c1847AsK, null, null, null, null, null, null, null, null, j4, j3, C1809ArT.A01, j4), spanStart2, spanEnd2);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    C1736ApY c1736ApY = C1736ApY.A01;
                    long j5 = B6A.A07;
                    long j6 = C1809ArT.A01;
                    c1731ApSA0W.A0A(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j5, j6, j6, j5), spanStart2, spanEnd2);
                } else if (style == 2) {
                    B0A b0a = new B0A(1);
                    long j7 = B6A.A07;
                    long j8 = C1809ArT.A01;
                    c1731ApSA0W.A0A(new C1824Aro(null, null, null, b0a, null, null, null, null, null, null, null, j7, j8, j8, j7), spanStart2, spanEnd2);
                } else if (style == 3) {
                    C1736ApY c1736ApY2 = C1736ApY.A01;
                    B0A b0a2 = new B0A(1);
                    long j9 = B6A.A07;
                    long j10 = C1809ArT.A01;
                    c1731ApSA0W.A0A(new C1824Aro(null, null, null, b0a2, null, c1736ApY2, null, null, null, null, null, j9, j10, j10, j9), spanStart2, spanEnd2);
                }
            } else if (obj instanceof StrikethroughSpan) {
                BG3 bg3 = BG3.A01;
                long j11 = B6A.A07;
                long j12 = C1809ArT.A01;
                c1731ApSA0W.A0A(new C1824Aro(null, null, null, null, null, null, null, null, bg3, null, null, j11, j12, j12, j11), spanStart2, spanEnd2);
            } else if (obj instanceof UnderlineSpan) {
                BG3 bg32 = BG3.A03;
                long j13 = B6A.A07;
                long j14 = C1809ArT.A01;
                c1731ApSA0W.A0A(new C1824Aro(null, null, null, null, null, null, null, null, bg32, null, null, j13, j14, j14, j13), spanStart2, spanEnd2);
            } else if (obj instanceof ForegroundColorSpan) {
                long jA0U = C8j3.A0U(((ForegroundColorSpan) obj).getForegroundColor());
                long j15 = C1809ArT.A01;
                c1731ApSA0W.A0A(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA0U, j15, j15, B6A.A07), spanStart2, spanEnd2);
            } else if (obj instanceof URLSpan) {
                c1731ApSA0W.A0A(c1824Aro, spanStart2, spanEnd2);
                String url = ((URLSpan) obj).getURL();
                C7384Etj.A0U(url);
                c1731ApSA0W.A0B(new C1OR(url), spanStart2, spanEnd2);
                if (z) {
                    C60Q.A1P(arrayListA0h, spanEnd2);
                }
            }
        }
        String string = spanned2.toString();
        if (z && !arrayListA0h.isEmpty()) {
            Iterator it = arrayListA0h.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                int iA0F = AnonymousClass001.A0F(next);
                if (ahd.isEmpty() || C3cG.A1P(AbstractC0878AGe.A0A(i, ahd), true)) {
                    AnonymousClass005.A0s(c1731ApSA0W, string, i2, iA0F);
                    C1Ls.A00(c1731ApSA0W, EXTERNAL_LINK_TAG, "\ufffd");
                    i2 = iA0F;
                }
                i = i3;
            }
            i = i2;
        } else if (auraInlineContent != null) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h2);
            Iterator it2 = arrayListA0h2.iterator();
            while (it2.hasNext()) {
                arrayListA0m.add(((HwV) it2.next()).third);
            }
            Set setA0g = AbstractC0878AGe.A0g(arrayListA0m);
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            AHD<AuraInlineContentItem> ahd2 = auraInlineContent.contentData;
            ArrayList<AuraInlineContentItem> arrayListA0h3 = C3cG.A0h();
            for (Object obj2 : ahd2) {
                if (!setA0g.contains(((AuraInlineContentItem) obj2).contentId)) {
                    arrayListA0h3.add(obj2);
                }
            }
            for (AuraInlineContentItem auraInlineContentItem : arrayListA0h3) {
                int i4 = 0;
                while (i4 < string.length() && (iA0B = C7BY.A0B(string, auraInlineContentItem.contentId, i4, false)) != -1) {
                    linkedHashMapA0j.put(Integer.valueOf(iA0B), auraInlineContentItem.contentId);
                    i4 = iA0B + 1;
                }
            }
            Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                int iA0F2 = AnonymousClass001.A0F(entryA0l.getKey());
                String str = (String) entryA0l.getValue();
                arrayListA0h2.add(new HwV(Integer.valueOf(iA0F2), Integer.valueOf(iA0F2 + str.length()), str));
            }
            for (HwV hwV : AbstractC0878AGe.A0c(arrayListA0h2, new Comparator() { // from class: com.facebook.aura.vds.compose.ext.StringExtKt$toAnnotatedString$lambda$0$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC7536F0j.A00((Integer) ((HwV) t).first, (Integer) ((HwV) t2).first);
                }
            })) {
                int iA0F3 = AnonymousClass001.A0F(hwV.first);
                int iA0F4 = AnonymousClass001.A0F(hwV.second);
                String str2 = (String) hwV.third;
                if (iA0F3 >= i) {
                    AnonymousClass005.A0s(c1731ApSA0W, string, i, iA0F3);
                    C1Ls.A00(c1731ApSA0W, str2, string.substring(iA0F3, iA0F4));
                    i = iA0F4;
                }
            }
        }
        AnonymousClass005.A0s(c1731ApSA0W, string, i, string.length());
        return c1731ApSA0W.A04();
    }

    public static /* synthetic */ ApQ toAnnotatedString$default(Spanned spanned, Context context, AuraSpanStyles auraSpanStyles, AuraInlineContent auraInlineContent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            auraInlineContent = null;
        }
        return toAnnotatedString(spanned, context, auraSpanStyles, auraInlineContent, AnonymousClass005.A1P(i, z));
    }

    public static /* synthetic */ ApQ annotatedStringResource$default(Context context, int i, boolean z, AHD ahd, int i2, Object obj) {
        boolean zA1O = AnonymousClass005.A1O(i2, z);
        if ((i2 & 8) != 0) {
            ahd = AHI.A01;
        }
        return annotatedStringResource(context, i, zA1O, ahd);
    }

    public static final ApQ annotatedStringResourceWithArgs(Context context, int i, String... strArr) {
        AnonymousClass003.A0v(context, strArr);
        Resources resources = context.getResources();
        C1824Aro c1824AroLinkStyle = linkStyle(context);
        C7384Etj.A0X(resources);
        return fromResourceStringWithArgsHtml(resources, c1824AroLinkStyle, i, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AHD<ApQ> annotatedStringsResource(Context context, int... iArr) {
        int iA1b = AnonymousClass004.A1b(context, iArr);
        Resources resources = context.getResources();
        C1824Aro c1824AroLinkStyle = linkStyle(context);
        ArrayList arrayListA11 = C60O.A11(iArr.length);
        for (int i : iArr) {
            C7384Etj.A0X(resources);
            arrayListA11.add(fromResourceStringHtml(resources, c1824AroLinkStyle, i, iA1b, AHI.A01));
        }
        ApQ[] apQArr = (ApQ[]) arrayListA11.toArray(new ApQ[iA1b]);
        return AGI.A0E(Arrays.copyOf(apQArr, apQArr.length));
    }

    public static final ApQ fromResourceStringHtml(Resources resources, C1824Aro c1824Aro, int i, boolean z, AHD<Boolean> ahd) {
        Spanned spannedFromHtml = Html.fromHtml(resources.getString(i));
        C7384Etj.A0U(spannedFromHtml);
        return toAnnotatedString(spannedFromHtml, c1824Aro, null, z, ahd, false, null);
    }

    public static /* synthetic */ ApQ fromResourceStringHtml$default(Resources resources, C1824Aro c1824Aro, int i, boolean z, AHD ahd, int i2, Object obj) {
        boolean zA1P = AnonymousClass005.A1P(i2, z);
        if ((i2 & 16) != 0) {
            ahd = AHI.A01;
        }
        return fromResourceStringHtml(resources, c1824Aro, i, zA1P, ahd);
    }

    public static final C1824Aro linkStyle(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr._name_removed__res_0x7f0405e9});
        C7384Etj.A0U(typedArrayObtainStyledAttributes);
        try {
            long jA0U = C8j3.A0U(typedArrayObtainStyledAttributes.getColor(0, 0));
            C1736ApY c1736ApY = C1736ApY.A05;
            long j = C1809ArT.A01;
            return new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, jA0U, j, j, B6A.A07);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final ApQ annotatedStringResource(Context context, int i, boolean z, AHD<Boolean> ahd) {
        AnonymousClass003.A0w(context, ahd);
        Resources resources = context.getResources();
        C1824Aro c1824AroLinkStyle = linkStyle(context);
        C7384Etj.A0X(resources);
        return fromResourceStringHtml(resources, c1824AroLinkStyle, i, z, ahd);
    }

    public static final ApQ annotatedStringResourceWithArgs(int i, String[] strArr, C1822Arm c1822Arm, BFM bfm, int i2, int i3) throws Resources.NotFoundException {
        C7384Etj.A0Y(strArr, 1);
        if ((i3 & 4) != 0) {
            c1822Arm = null;
        }
        Resources resources = (Resources) AKO.A07(AndroidCompositionLocals_androidKt.A04, (BBI) bfm);
        boolean z = false;
        C1824Aro themedLinkStyle = getThemedLinkStyle(c1822Arm, bfm, (i2 >> 6) & 14, 0);
        LocaleList locales = resources.getConfiguration().getLocales();
        int length = strArr.length;
        int iComputeHash = computeHash((String[]) Arrays.copyOf(strArr, length));
        if ((((i2 & 14) ^ 6) > 4 && bfm.A63(i)) || (i2 & 6) == 4) {
            z = true;
        }
        boolean zA1S = AnonymousClass002.A1S(bfm, iComputeHash, bfm.A65(locales), z);
        Object objAaT = bfm.AaT();
        if (zA1S || objAaT == C78N.A00) {
            objAaT = fromResourceStringWithArgsHtml(resources, themedLinkStyle, i, (String[]) Arrays.copyOf(strArr, length));
            bfm.Ai0(objAaT);
        }
        return (ApQ) objAaT;
    }

    public static final int computeHash(String... strArr) {
        int iA0H = 1;
        for (String str : strArr) {
            iA0H = AnonymousClass001.A0H(str, iA0H * 31);
        }
        return iA0H;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String stringResourceForLocale(int r5, java.util.Locale r6, X.BFM r7, int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r0 = r9 & 2
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            int r0 = r8 >> 3
            r0 = r0 & 14
            r4 = 0
            android.content.res.Resources r3 = getResourcesRemembered(r6, r7, r0, r4)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto L1b
            boolean r0 = r7.A63(r5)
            if (r0 != 0) goto L20
        L1b:
            r0 = r8 & 6
            r2 = 0
            if (r0 != r1) goto L21
        L20:
            r2 = 1
        L21:
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L2f
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L33
        L2f:
            r0 = r8 & 48
            if (r0 != r1) goto L34
        L33:
            r4 = 1
        L34:
            r2 = r2 | r4
            java.lang.Object r1 = r7.AaT()
            if (r2 != 0) goto L3f
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L46
        L3f:
            java.lang.String r1 = r3.getString(r5)
            r7.Ai0(r1)
        L46:
            java.lang.String r1 = (java.lang.String) r1
            X.C7384Etj.A0X(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.StringExtKt.stringResourceForLocale(int, java.util.Locale, X.BFM, int, int):java.lang.String");
    }

    public static final ApQ toAnnotatedString(Spanned spanned, Context context) {
        boolean zA1b = AnonymousClass004.A1b(spanned, context);
        return toAnnotatedString(spanned, linkStyle(context), null, zA1b, AHI.A01, zA1b, null);
    }

    public static /* synthetic */ ApQ toAnnotatedString$default(Spanned spanned, C1824Aro c1824Aro, AuraSpanStyles auraSpanStyles, boolean z, AHD ahd, boolean z2, AuraInlineContent auraInlineContent, int i, Object obj) {
        if ((i & 2) != 0) {
            auraSpanStyles = null;
        }
        boolean zA1O = AnonymousClass005.A1O(i, z);
        if ((i & 8) != 0) {
            ahd = AHI.A01;
        }
        boolean zA1Q = AnonymousClass005.A1Q(i, z2);
        if ((i & 32) != 0) {
            auraInlineContent = null;
        }
        return toAnnotatedString(spanned, c1824Aro, auraSpanStyles, zA1O, ahd, zA1Q, auraInlineContent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AHD<X.ApQ> annotatedStringsResource(int[] r9, java.util.Locale r10, boolean r11, X.AHD<java.lang.Boolean> r12, X.C1822Arm r13, X.BFM r14, int r15, int r16) {
        /*
            r5 = 0
            X.C7384Etj.A0Y(r9, r5)
            r2 = r16
            r0 = r16 & 2
            r1 = 0
            if (r0 == 0) goto Lc
            r10 = r1
        Lc:
            boolean r6 = X.AnonymousClass005.A1O(r2, r11)
            r0 = r16 & 8
            if (r0 == 0) goto L16
            X.AHI r12 = X.AHI.A01
        L16:
            r0 = r16 & 16
            if (r0 == 0) goto L1b
            r13 = r1
        L1b:
            int r0 = r15 >> 3
            r0 = r0 & 14
            android.content.res.Resources r4 = getResourcesRemembered(r10, r14, r0, r5)
            int r0 = r15 >> 12
            r0 = r0 & 14
            X.Aro r7 = getThemedLinkStyle(r13, r14, r0, r5)
            int r3 = r9.length
            int[] r0 = java.util.Arrays.copyOf(r9, r3)
            int r2 = computeHash(r0)
            android.content.res.Configuration r0 = r4.getConfiguration()
            android.os.LocaleList r1 = r0.getLocales()
            boolean r0 = r14.A63(r2)
            boolean r8 = X.AnonymousClass001.A1R(r14, r1, r0)
            r0 = r15 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L52
            boolean r0 = r14.A65(r10)
            if (r0 != 0) goto L57
        L52:
            r1 = r15 & 48
            r0 = 0
            if (r1 != r2) goto L58
        L57:
            r0 = 1
        L58:
            r0 = r0 | r8
            java.lang.Object r1 = r14.AaT()
            if (r0 != 0) goto L63
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L8a
        L63:
            java.util.ArrayList r2 = X.C60O.A11(r3)
            r1 = 0
        L68:
            if (r1 >= r3) goto L76
            r0 = r9[r1]
            X.ApQ r0 = fromResourceStringHtml(r4, r7, r0, r6, r12)
            r2.add(r0)
            int r1 = r1 + 1
            goto L68
        L76:
            X.ApQ[] r0 = new X.ApQ[r5]
            java.lang.Object[] r1 = r2.toArray(r0)
            X.ApQ[] r1 = (X.ApQ[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            X.AHH r1 = X.AGI.A0E(r0)
            r14.Ai0(r1)
        L8a:
            X.AHD r1 = (X.AHD) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.StringExtKt.annotatedStringsResource(int[], java.util.Locale, boolean, X.AHD, X.Arm, X.BFM, int, int):X.AHD");
    }

    public static final int computeHash(int... iArr) {
        int i = 1;
        for (int i2 : iArr) {
            i = (i * 31) + i2;
        }
        return i;
    }

    public static final ApQ toAnnotatedString(Spanned spanned, Context context, AuraSpanStyles auraSpanStyles, AuraInlineContent auraInlineContent, boolean z) {
        AnonymousClass005.A10(spanned, context, auraSpanStyles);
        return toAnnotatedString(spanned, linkStyle(context), auraSpanStyles, false, AHI.A01, z, auraInlineContent);
    }
}
