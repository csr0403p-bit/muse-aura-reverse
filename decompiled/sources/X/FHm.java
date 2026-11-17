package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import com.instagram.common.bloks.lexer.ParsingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FHm {
    public static final FHm A00 = new FHm();
    public static final C06827l3 A01 = C06827l3.A02("[^0-9.]");

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FJF A01(android.content.Context r8, X.FDW r9, X.FDW r10, X.FDW r11, X.InterfaceC10557Hsn r12, int r13, int r14, boolean r15) {
        /*
            r5 = r11
            int r7 = r11.A05
            r0 = 16891(0x41fb, float:2.367E-41)
            if (r7 == r0) goto L1c
            r0 = 16917(0x4215, float:2.3706E-41)
            if (r7 == r0) goto L1c
            r0 = 22918(0x5986, float:3.2115E-41)
            if (r7 == r0) goto L1c
            r0 = 24647(0x6047, float:3.4538E-41)
            if (r7 == r0) goto L1c
            r0 = 24728(0x6098, float:3.4651E-41)
            if (r7 == r0) goto L1c
            r0 = 24893(0x613d, float:3.4883E-41)
            r11 = 0
            if (r7 != r0) goto L1d
        L1c:
            r11 = 1
        L1d:
            X.FID r1 = new X.FID
            r2 = r8
            r4 = r9
            r3 = r10
            r6 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.FJF r0 = new X.FJF
            r0.<init>(r1, r13, r14, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FHm.A01(android.content.Context, X.FDW, X.FDW, X.FDW, X.Hsn, int, int, boolean):X.FJF");
    }

    public static final F8O A02(Context context, FJG fjg, FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, List list, boolean z) {
        C7384Etj.A0Y(list, 2);
        FHm fHm = A00;
        if (!z) {
            return A03(context, fdw, interfaceC10557Hsn, list);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sbA0w = C60O.A0w();
        return new F8O(spannableStringBuilder, sbA0w.toString(), A07(spannableStringBuilder, fHm.A06(context, spannableStringBuilder, fjg, fdw, interfaceC10557Hsn, sbA0w, list)));
    }

    public static final Float A04(String str, String str2) {
        Float fA0w;
        Iterator it = C7BY.A0g(str, new char[]{','}).iterator();
        while (true) {
            fA0w = null;
            if (!it.hasNext()) {
                break;
            }
            List listA0g = C7BY.A0g(AnonymousClass002.A0l(AnonymousClass005.A0j(it)), new char[]{' ', '\t'});
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it2 = listA0g.iterator();
            while (it2.hasNext()) {
                AnonymousClass007.A19(arrayListA0h, it2);
            }
            if (arrayListA0h.size() == 2 && C7384Etj.areEqual(C7BY.A0Y(C60Q.A0n(arrayListA0h, 0), '\'', '\"'), str2) && (fA0w = C9tJ.A0w(C60Q.A0n(arrayListA0h, 1))) != null) {
                break;
            }
        }
        return fA0w;
    }

    private final List A09(Context context, SpannableStringBuilder spannableStringBuilder, FJG fjg, FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, StringBuilder sb) {
        List list;
        String strA00;
        int i = fdw.A05;
        if (i == 13329) {
            int length = spannableStringBuilder.length();
            Object objA01 = FDW.A01(fdw, 80);
            ArrayList arrayListA06 = (!(objA01 instanceof List) || (list = (List) objA01) == null) ? fdw.A0L(68, false) ? A06(context, spannableStringBuilder, fjg, fdw, interfaceC10557Hsn, sb, AbstractC7608F5v.A15(fdw, 69)) : A08(spannableStringBuilder, A03(context, fdw, interfaceC10557Hsn, AbstractC7608F5v.A15(fdw, 32)), sb) : A05(context, spannableStringBuilder, this, fjg, fdw, interfaceC10557Hsn, sb, list);
            int length2 = spannableStringBuilder.length();
            HsM hsMA0D = fdw.A0D(41);
            return (hsMA0D == null || length == length2) ? arrayListA06 : AbstractC0878AGe.A0Q(new FJF(new C7871FIj(fdw, hsMA0D), length, length2, false), arrayListA06);
        }
        if (i != 13335) {
            return null;
        }
        FDW fdwA0C = fdw.A0C(44);
        if (fdwA0C == null || (strA00 = Hhe.A00(fdwA0C)) == null) {
            strA00 = "";
            String strA0s = AbstractC7608F5v.A0s(fdw);
            if (strA0s != null) {
                strA00 = strA0s;
            }
        }
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) strA00);
        int length4 = spannableStringBuilder.length();
        sb.append((CharSequence) strA00);
        if (length3 == length4) {
            return C0881AGi.A00;
        }
        return Collections.singletonList(new FJF(new C7858FHu(context, fdw.A0C(48), fdw, fdw.A0D(40), interfaceC10557Hsn, fdw.A0F(43), AbstractC7608F5v.A0u(fdw), fdw.A0F(53), AbstractC7608F5v.A0o(fdw), AbstractC7608F5v.A0v(fdw), fdw.A0L(50, false), fdw.A0L(54, false)), length3, length4, false));
    }

    public static final void A0B(Context context, Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            try {
                spannable.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, HiY.A02(str), C60Q.A0B(context))), i, i2, 0);
            } catch (ParsingException e) {
                FFI.A04(e);
            }
        }
    }

    public static final void A0C(Context context, Spannable spannable, String str, String str2, int i, int i2) {
        Typeface typefaceA00;
        FJK fjkCreateTypefaceBuilderFromFontFamily;
        if (str != null) {
            typefaceA00 = AbstractC7608F5v.A0O().createTypefaceFromFontFamily(context, str, 0);
            C7384Etj.A0U(typefaceA00);
        } else {
            typefaceA00 = null;
        }
        if (str2 != null) {
            if (str == null) {
                fjkCreateTypefaceBuilderFromFontFamily = null;
            } else {
                try {
                    fjkCreateTypefaceBuilderFromFontFamily = AbstractC7608F5v.A0O().createTypefaceBuilderFromFontFamily(context, str);
                } catch (ParsingException e) {
                    FFI.A04(e);
                }
            }
            typefaceA00 = FI7.A00(context, typefaceA00, fjkCreateTypefaceBuilderFromFontFamily, str2);
        }
        if (typefaceA00 != null) {
            spannable.setSpan(new TypefaceSpan(typefaceA00), i, i2, 0);
        }
    }

    public static final void A0D(Spannable spannable, float f, int i, int i2) {
        if (f != Float.MIN_VALUE) {
            spannable.setSpan(new Hq8(f, C60Q.A0B(AbstractC7608F5v.A0D()).scaledDensity), i, i2, 0);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/Hsn;Ljava/util/List<+LX/FDW;>;LX/FDW;)LX/F8O; */
    public static final F8O A03(Context context, FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, List list) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sbA0w = C60O.A0w();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FDW fdw2 = (FDW) it.next();
            int length = spannableStringBuilder.length();
            boolean zA1X = AnonymousClass002.A1X(fdw2.A0C(59));
            FDW fdwA0C = fdw2.A0C(41);
            String strA0q = AbstractC7608F5v.A0q(fdw2);
            if (strA0q == null) {
                strA0q = "";
            }
            if (zA1X) {
                strA0q = "\u00a0";
            } else {
                if (fdwA0C != null) {
                    strA0q = Hhe.A00(fdwA0C);
                }
                C7384Etj.A0X(strA0q);
            }
            spannableStringBuilder.append((CharSequence) strA0q);
            int length2 = spannableStringBuilder.length();
            if (zA1X) {
                Float fA02 = HjB.A02(fdw2, 62);
                Float fA022 = HjB.A02(fdw2, 61);
                FDW fdwA0C2 = fdw2.A0C(59);
                fdw2.A0F(68);
                FDW fdwA0C3 = fdw2.A0C(69);
                if (AbstractC7608F5v.A0t(fdw2) == null) {
                    fdw2.A0F(35);
                }
                if (fA02 == null || fA022 == null || fdwA0C2 == null) {
                    FFI.A01(null, "Invalid image span attributes specified.", null);
                } else if (fA022.floatValue() != 0.0f && fA02.floatValue() != 0.0f) {
                    if (fdwA0C3 != null) {
                        int iA01 = HjB.A01(fdwA0C3, 0.0f, 42);
                        int iA012 = HjB.A01(fdwA0C3, 0.0f, 40);
                        int iA013 = HjB.A01(fdwA0C3, 0.0f, 41);
                        int iA014 = HjB.A01(fdwA0C3, 0.0f, 35);
                        int iA015 = HjB.A01(fdwA0C3, 0.0f, 36);
                        int iA016 = HjB.A01(fdwA0C3, 0.0f, 38);
                        if (FKH.A00(context)) {
                            i = iA013;
                            if (iA013 == 0) {
                                i = iA015;
                            }
                        } else {
                            i = iA01;
                            if (iA01 == 0) {
                                i = iA015;
                            }
                            iA01 = iA013;
                        }
                        if (iA01 == 0) {
                            iA01 = iA016;
                        }
                        new Rect(i, iA012, iA01, iA014);
                    } else {
                        new Rect();
                    }
                }
            } else {
                A0E(spannableStringBuilder, fdw2.A0C(44), interfaceC10557Hsn, AbstractC7608F5v.A0r(fdw2), length, length2);
                A0B(context, spannableStringBuilder, AbstractC7608F5v.A0t(fdw2), length, length2);
                A0C(context, spannableStringBuilder, AbstractC7608F5v.A0o(fdw2), fdw2.A0F(43), length, length2);
                if (fdw2.A0L(45, false)) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), length, length2, 0);
                }
                if (fdw2.A0L(52, false)) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), length, length2, 0);
                }
                float fA06 = fdw2.A06(56, 0.0f);
                float fA062 = fdw2.A06(54, 0.0f);
                float fA063 = fdw2.A06(55, 0.0f);
                FDW fdwA0C4 = fdw2.A0C(53);
                if (fA06 > 0.0f) {
                    spannableStringBuilder.setSpan(new Hmv(fA06, fA062, fA063, fdwA0C4 != null ? HlW.A00(fdwA0C4, interfaceC10557Hsn, 0) : 0), length, length2, 0);
                }
                A0D(spannableStringBuilder, fdw2.A06(49, Float.MIN_VALUE), length, length2);
            }
            String strA0F = fdw2.A0F(66);
            String strA0F2 = fdw2.A0F(67);
            HsM hsMA0a = AbstractC7608F5v.A0a(fdw2);
            if (hsMA0a != null) {
                spannableStringBuilder.setSpan(new C7886FJe(fdw, fdw2, hsMA0a, strA0F, strA0F2, false), length, length2, 0);
            }
            HsM hsMA0D = fdw2.A0D(57);
            if (hsMA0D != null) {
                spannableStringBuilder.setSpan(new C7886FJe(fdw, fdw2, hsMA0D, strA0F, strA0F2, true), length, length2, 0);
            }
            String strA0F3 = fdw2.A0F(66);
            if (strA0F3 == null || strA0F3.length() == 0) {
                sbA0w.append((CharSequence) strA0q);
            } else {
                sbA0w.append(strA0F3);
            }
        }
        return new F8O(spannableStringBuilder, sbA0w.toString(), C0881AGi.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List A0A(android.content.Context r10, android.text.SpannableStringBuilder r11, X.FJG r12, X.FDW r13, X.InterfaceC10557Hsn r14, java.lang.StringBuilder r15) {
        /*
            r9 = this;
            r0 = 36
            X.FDW r7 = r13.A0C(r0)
            r9 = r15
            int r2 = r15.length()
            if (r7 == 0) goto L2c
            X.FHm r3 = X.FHm.A00
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            java.util.List r0 = r3.A09(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L26
            java.lang.String r1 = X.AbstractC7608F5v.A0o(r13)
            if (r1 == 0) goto L25
            r15.setLength(r2)
            r15.append(r1)
        L25:
            return r0
        L26:
            boolean r0 = A0F(r11, r12, r7, r13, r15)
            if (r0 != 0) goto L32
        L2c:
            java.lang.String r1 = "Invalid RichText ComponentSpan"
            r0 = 0
            X.FFI.A01(r0, r1, r0)
        L32:
            X.AGi r0 = X.C0881AGi.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FHm.A0A(android.content.Context, android.text.SpannableStringBuilder, X.FJG, X.FDW, X.Hsn, java.lang.StringBuilder):java.util.List");
    }

    public static final void A0E(Spannable spannable, FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, String str, int i, int i2) {
        Integer numValueOf;
        if (fdw != null) {
            numValueOf = HlW.A01(fdw, interfaceC10557Hsn);
        } else {
            if (str == null) {
                return;
            }
            try {
                numValueOf = Integer.valueOf(HiY.A04(str));
            } catch (ParsingException e) {
                FFI.A04(e);
                return;
            }
        }
        spannable.setSpan(new ForegroundColorSpan(numValueOf.intValue()), i, i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db A[PHI: r16
  0x00db: PHI (r16v2 int) = (r16v0 int), (r16v4 int) binds: [B:38:0x00d9, B:36:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0F(android.text.SpannableStringBuilder r19, X.FJG r20, X.FDW r21, X.FDW r22, java.lang.StringBuilder r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FHm.A0F(android.text.SpannableStringBuilder, X.FJG, X.FDW, X.FDW, java.lang.StringBuilder):boolean");
    }

    public static final Typeface A00(Context context, String str) {
        Typeface variableFontFallbackTypeface;
        try {
            variableFontFallbackTypeface = AbstractC7608F5v.A0O().getVariableFontFallbackTypeface(context);
        } catch (Exception unused) {
            variableFontFallbackTypeface = Typeface.DEFAULT;
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTypeface(variableFontFallbackTypeface);
            textPaint.setFontVariationSettings(str);
            Typeface typeface = textPaint.getTypeface();
            if (typeface == null) {
                typeface = variableFontFallbackTypeface;
            }
            C7384Etj.A0X(typeface);
            return typeface;
        } catch (Exception unused2) {
            C7384Etj.A0X(variableFontFallbackTypeface);
            return variableFontFallbackTypeface;
        }
    }

    public static final ArrayList A05(Context context, SpannableStringBuilder spannableStringBuilder, FHm fHm, FJG fjg, FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, StringBuilder sb, List list) {
        StringBuilder sbA0f;
        List listA08;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : list) {
            if (obj instanceof String) {
                spannableStringBuilder.append((CharSequence) obj);
                sb.append((String) obj);
            } else {
                if (obj instanceof FDW) {
                    FDW fdw2 = (FDW) obj;
                    int i = fdw2.A05;
                    if (i == 13339) {
                        listA08 = A08(spannableStringBuilder, A03(context, fdw, interfaceC10557Hsn, Collections.singletonList(obj)), sb);
                    } else if (i == 26222) {
                        listA08 = fHm.A0A(context, spannableStringBuilder, fjg, fdw2, interfaceC10557Hsn, sb);
                    } else if (i == 16880 || i == 16898 || i == 16887) {
                        listA08 = fHm.A06(context, spannableStringBuilder, fjg, fdw, interfaceC10557Hsn, sb, Collections.singletonList(obj));
                    } else {
                        listA08 = fHm.A09(context, spannableStringBuilder, fjg, fdw2, interfaceC10557Hsn, sb);
                        if (listA08 == null) {
                            if (!A0F(spannableStringBuilder, fjg, fdw2, null, sb)) {
                                sbA0f = C60O.A0y("Unsupported RichText content style: ", i);
                            }
                        }
                    }
                    arrayListA0h.addAll(listA08);
                } else {
                    sbA0f = C3cG.A0f(BV5.A0N(obj), "Unsupported RichText content item type: ");
                }
                FFI.A01(null, sbA0f.toString(), null);
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    private final ArrayList A06(Context context, SpannableStringBuilder spannableStringBuilder, FJG fjg, FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, StringBuilder sb, List list) {
        boolean z;
        FDW fdwA0C;
        String strA00;
        ?? A0h;
        List list2;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FDW fdw2 = (FDW) it.next();
            int i = fdw2.A05;
            if (i == 16887) {
                A0h = C3cG.A0h();
                StringBuilder sbA0w = C60O.A0w();
                ?? A0o = AbstractC7608F5v.A0o(fdw2);
                List listA15 = AbstractC7608F5v.A15(fdw2, 36);
                int length = spannableStringBuilder.length();
                Object objA01 = FDW.A01(fdw2, 40);
                ArrayList arrayListA06 = (!(objA01 instanceof List) || (list2 = (List) objA01) == null) ? A06(context, spannableStringBuilder, fjg, fdw, interfaceC10557Hsn, sbA0w, listA15) : A05(context, spannableStringBuilder, this, fjg, fdw, interfaceC10557Hsn, sbA0w, list2);
                int length2 = spannableStringBuilder.length();
                Iterator it2 = AbstractC7608F5v.A15(fdw2, 38).iterator();
                while (it2.hasNext()) {
                    A0h.add(A01(context, fdw, fdw2, (FDW) it2.next(), interfaceC10557Hsn, length, length2, false));
                }
                A0h.addAll(arrayListA06);
                if (A0o != 0) {
                    sbA0w = A0o;
                }
                sb.append((CharSequence) sbA0w);
            } else if (i == 26222) {
                A0h = A0A(context, spannableStringBuilder, fjg, fdw2, interfaceC10557Hsn, sb);
            } else {
                if (i == 16898) {
                    z = true;
                    fdwA0C = null;
                } else {
                    z = false;
                    fdwA0C = fdw2.A0C(40);
                }
                if (z) {
                    strA00 = "\u00a0";
                } else {
                    String strA0q = AbstractC7608F5v.A0q(fdw2);
                    strA00 = strA0q != null ? strA0q : "";
                    if (fdwA0C != null) {
                        strA00 = Hhe.A00(fdwA0C);
                    }
                    C7384Etj.A0X(strA00);
                }
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strA00);
                int length4 = spannableStringBuilder.length();
                String strA0F = fdw2.A0F(z ? 44 : 35);
                if (strA0F != null && strA0F.length() != 0) {
                    strA00 = strA0F;
                }
                List listA152 = AbstractC7608F5v.A15(fdw2, z ? 43 : 36);
                sb.append((CharSequence) strA00);
                A0h = C3cG.A0h();
                if (z) {
                    A0h.add(A01(context, fdw, fdw2, fdw2, interfaceC10557Hsn, length3, length4, true));
                }
                Iterator it3 = listA152.iterator();
                while (it3.hasNext()) {
                    A0h.add(A01(context, fdw, fdw2, (FDW) it3.next(), interfaceC10557Hsn, length3, length4, false));
                }
            }
            arrayListA0h.addAll(A0h);
        }
        return arrayListA0h;
    }

    public static final List<FJF> A07(Spannable spannable, List<FJF> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (FJF fjf : list) {
            if (fjf.A03) {
                arrayListA0h.add(fjf);
            } else {
                fjf.A02.A4a(null, spannable, fjf, -1, -1);
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/F8O;Landroid/text/SpannableStringBuilder;Ljava/lang/StringBuilder;)Ljava/util/List<LX/FJF;>; */
    public static final ArrayList A08(SpannableStringBuilder spannableStringBuilder, F8O f8o, StringBuilder sb) {
        int length = spannableStringBuilder.length();
        CharSequence charSequence = f8o.A00;
        spannableStringBuilder.append((CharSequence) charSequence.toString());
        sb.append(f8o.A01);
        ArrayList arrayListA0h = C3cG.A0h();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), Object.class);
            C7384Etj.A0U(spans);
            for (Object obj : spans) {
                arrayListA0h.add(new FJF(new FJ2(obj, spanned.getSpanFlags(obj)), spanned.getSpanStart(obj) + length, spanned.getSpanEnd(obj) + length, obj instanceof MetricAffectingSpan));
            }
        }
        for (FJF fjf : f8o.A02) {
            arrayListA0h.add(new FJF(fjf.A02, fjf.A01 + length, fjf.A00 + length, fjf.A03));
        }
        return arrayListA0h;
    }
}
