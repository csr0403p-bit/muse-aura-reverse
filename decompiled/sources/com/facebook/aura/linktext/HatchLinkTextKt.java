package com.facebook.aura.linktext;

import X.AbstractC0878AGe;
import X.AbstractC1996Aw5;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BG3;
import X.C06827l3;
import X.C0881AGi;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1824Aro;
import X.C1Lu;
import X.C1ji;
import X.C7384Etj;
import X.C9tI;
import X.HDi;
import X.HxE;
import X.HxS;
import android.net.Uri;
import com.facebook.aura.login.nativeflow.HatchCheckpointUrlPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class HatchLinkTextKt {
    public static final C06827l3 PlaceholderPattern = new C06827l3("%(\\d+)\\$s");

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0jP rememberHatchLinkUriHandler(final java.util.Map<java.lang.String, java.lang.String> r7, X.G0U<? super java.lang.String, kotlin.Unit> r8, X.BFM r9, int r10, int r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            r0 = r11 & 2
            if (r0 == 0) goto L15
            java.lang.Object r8 = r9.AaT()
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L15
            com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLinkUriHandler$1$1 r8 = com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLinkUriHandler$1$1.INSTANCE
            r9.Ai0(r8)
        L15:
            android.content.Context r6 = X.AnonymousClass002.A0H(r9)
            com.facebook.aura.navigation.AuraNavigator r5 = X.AnonymousClass002.A0b(r9)
            androidx.compose.runtime.MutableState r4 = X.C1er.A00(r9, r8)
            boolean r3 = X.AnonymousClass003.A1K(r9, r6, r5)
            r0 = r10 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L32
            boolean r0 = r9.A65(r7)
            if (r0 != 0) goto L37
        L32:
            r1 = r10 & 6
            r0 = 0
            if (r1 != r2) goto L38
        L37:
            r0 = 1
        L38:
            r0 = r0 | r3
            java.lang.Object r1 = r9.AaT()
            if (r0 != 0) goto L43
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L4b
        L43:
            com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLinkUriHandler$2$1 r1 = new com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLinkUriHandler$2$1
            r1.<init>()
            r9.Ai0(r1)
        L4b:
            com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLinkUriHandler$2$1 r1 = (com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLinkUriHandler$2$1) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.linktext.HatchLinkTextKt.rememberHatchLinkUriHandler(java.util.Map, X.G0U, X.BFM, int, int):X.0jP");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0jP rememberHatchLoggedOutLinkUriHandler(final java.util.Map<java.lang.String, java.lang.String> r6, X.BFM r7, int r8) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            android.content.Context r5 = X.AnonymousClass002.A0H(r7)
            com.facebook.aura.navigation.AuraNavigator r4 = X.AnonymousClass002.A0b(r7)
            boolean r3 = X.AnonymousClass003.A1K(r7, r5, r4)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L1d
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L22
        L1d:
            r1 = r8 & 6
            r0 = 0
            if (r1 != r2) goto L23
        L22:
            r0 = 1
        L23:
            r0 = r0 | r3
            java.lang.Object r1 = r7.AaT()
            if (r0 != 0) goto L2e
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L36
        L2e:
            com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLoggedOutLinkUriHandler$1$1 r1 = new com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLoggedOutLinkUriHandler$1$1
            r1.<init>()
            r7.Ai0(r1)
        L36:
            com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLoggedOutLinkUriHandler$1$1 r1 = (com.facebook.aura.linktext.HatchLinkTextKt$rememberHatchLoggedOutLinkUriHandler$1$1) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.linktext.HatchLinkTextKt.rememberHatchLoggedOutLinkUriHandler(java.util.Map, X.BFM, int):X.0jP");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* renamed from: HatchLinkText-10k_G_c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1188HatchLinkText10k_G_c(java.lang.String r29, java.util.List<com.facebook.aura.linktext.HatchTextLink> r30, X.BRg r31, X.C1822Arm r32, long r33, X.C1YL r35, X.C1736ApY r36, boolean r37, X.BFM r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.linktext.HatchLinkTextKt.m1188HatchLinkText10k_G_c(java.lang.String, java.util.List, X.BRg, X.Arm, long, X.1YL, X.ApY, boolean, X.BFM, int, int):void");
    }

    /* renamed from: buildHatchLinkAnnotatedString-9LQNqLg$default, reason: not valid java name */
    public static /* synthetic */ ApQ m1190buildHatchLinkAnnotatedString9LQNqLg$default(String str, List list, long j, C1736ApY c1736ApY, int i, Object obj) {
        if ((i & 8) != 0) {
            c1736ApY = null;
        }
        return m1189buildHatchLinkAnnotatedString9LQNqLg(str, list, j, c1736ApY);
    }

    /* renamed from: hatchLinkStyles-ek8zF_U, reason: not valid java name */
    public static final C1697Aoc m1191hatchLinkStylesek8zF_U(long j, C1736ApY c1736ApY, AbstractC1996Aw5 abstractC1996Aw5) {
        BG3 bg3 = BG3.A02;
        long j2 = C1809ArT.A01;
        return new C1697Aoc(new C1824Aro(null, null, abstractC1996Aw5, null, null, c1736ApY, null, null, bg3, null, null, j, j2, j2, B6A.A07), new C1824Aro(null, null, abstractC1996Aw5, null, null, c1736ApY, null, null, bg3, null, null, j, j2, j2, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.12f)), null, null);
    }

    /* renamed from: hatchLinkStyles-ek8zF_U$default, reason: not valid java name */
    public static /* synthetic */ C1697Aoc m1192hatchLinkStylesek8zF_U$default(long j, C1736ApY c1736ApY, AbstractC1996Aw5 abstractC1996Aw5, int i, Object obj) {
        if ((i & 2) != 0) {
            c1736ApY = null;
        }
        if ((i & 4) != 0) {
            abstractC1996Aw5 = null;
        }
        return m1191hatchLinkStylesek8zF_U(j, c1736ApY, abstractC1996Aw5);
    }

    /* renamed from: buildHatchLinkAnnotatedString-9LQNqLg, reason: not valid java name */
    public static final ApQ m1189buildHatchLinkAnnotatedString9LQNqLg(String str, List<HatchTextLink> list, long j, C1736ApY c1736ApY) {
        int i;
        AnonymousClass003.A0u(str, list);
        C1697Aoc c1697AocM1191hatchLinkStylesek8zF_U = m1191hatchLinkStylesek8zF_U(j, c1736ApY, null);
        int i2 = 0;
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        for (HatchTextLink hatchTextLink : AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.facebook.aura.linktext.HatchLinkTextKt$buildHatchLinkAnnotatedString_9LQNqLg$lambda$0$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((HatchTextLink) t).offset).compareTo(Integer.valueOf(((HatchTextLink) t2).offset));
            }
        })) {
            int i3 = hatchTextLink.length;
            if (i3 > 0 && (i = hatchTextLink.offset) >= i2 && i + i3 <= str.length()) {
                if (i > i2) {
                    AnonymousClass005.A0s(c1731ApSA0W, str, i2, i);
                }
                int iA01 = c1731ApSA0W.A01(new C1ji(c1697AocM1191hatchLinkStylesek8zF_U, hatchTextLink.url));
                try {
                    int i4 = hatchTextLink.offset;
                    AnonymousClass005.A0s(c1731ApSA0W, str, i4, hatchTextLink.length + i4);
                    c1731ApSA0W.A06(iA01);
                    i2 = hatchTextLink.offset + hatchTextLink.length;
                } catch (Throwable th) {
                    c1731ApSA0W.A06(iA01);
                    throw th;
                }
            }
        }
        if (i2 < str.length()) {
            c1731ApSA0W.A0E(str.substring(i2));
        }
        return c1731ApSA0W.A04();
    }

    public static final Map<String, String> hatchLinkTitlesByUrl(String str, List<HatchTextLink> list) {
        int i;
        AnonymousClass003.A0u(str, list);
        ArrayList<HatchTextLink> arrayList = new ArrayList();
        for (HatchTextLink hatchTextLink : list) {
            HatchTextLink hatchTextLink2 = hatchTextLink;
            int i2 = hatchTextLink2.offset;
            if (i2 >= 0 && (i = hatchTextLink2.length) > 0 && i2 + i <= str.length()) {
                arrayList.add(hatchTextLink);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(arrayList));
        for (HatchTextLink hatchTextLink3 : arrayList) {
            String str2 = hatchTextLink3.url;
            int i3 = hatchTextLink3.offset;
            linkedHashMap.put(str2, str.substring(i3, hatchTextLink3.length + i3));
        }
        return linkedHashMap;
    }

    public static final boolean isAuthenticatedMetaHost(String str) {
        String lowerCase;
        String host = Uri.parse(str).getHost();
        if (host != null) {
            Locale locale = Locale.US;
            C7384Etj.A0V(locale);
            lowerCase = host.toLowerCase(locale);
        } else {
            lowerCase = "";
        }
        return lowerCase.equals("meta.ai") || lowerCase.endsWith(".meta.ai") || lowerCase.equals(HatchCheckpointUrlPolicy.AUTH_HOST);
    }

    public static final HxE<String, List<HatchTextLink>> withLinkedArguments(String str, List<HxE<String, String>> list) {
        boolean zA1b = AnonymousClass004.A1b(str, list);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HxE<String, String> hxE : list) {
            String str2 = hxE.first;
            String str3 = hxE.second;
            AnonymousClass002.A1J(str2, str3.length() > 0 ? Collections.singletonList(new HatchTextLink(zA1b ? 1 : 0, str2.length(), str3)) : C0881AGi.A00, arrayListA0i);
        }
        return withLinkedSentences(str, arrayListA0i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final HxE<String, List<HatchTextLink>> withLinkedSentences(String str, List<? extends HxE<String, ? extends List<HatchTextLink>>> list) {
        boolean zA1a = AnonymousClass002.A1a(str, list);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Iterator it = C06827l3.A00(str, PlaceholderPattern).iterator();
        while (it.hasNext()) {
            C1Lu c1Lu = (C1Lu) it.next();
            Integer numA0r = C9tI.A0r(c1Lu.AG1().get(zA1a ? 1 : 0));
            if (numA0r != null) {
                HxE hxE = (HxE) AbstractC0878AGe.A0A(numA0r.intValue() - (zA1a ? 1 : 0), list);
                sb.append((CharSequence) str, i, c1Lu.AJM().A00);
                i = c1Lu.AJM().A01 + 1;
                if (hxE != null) {
                    String str2 = (String) hxE.first;
                    for (HatchTextLink hatchTextLink : (List) hxE.second) {
                        arrayList.add(new HatchTextLink(sb.length() + hatchTextLink.offset, hatchTextLink.length, hatchTextLink.url));
                    }
                    sb.append(str2);
                }
            }
        }
        sb.append((CharSequence) str, i, str.length());
        return new HxE<>(sb.toString(), arrayList);
    }
}
