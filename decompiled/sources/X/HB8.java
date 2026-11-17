package X;

import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.xml.sax.Attributes;

/* loaded from: classes6.dex */
public final class HB8 {
    public int A00;
    public HBA A02 = null;
    public HB7 A01 = null;
    public boolean A05 = false;
    public boolean A06 = false;
    public StringBuilder A03 = null;
    public boolean A07 = false;
    public StringBuilder A04 = null;

    public static float A00(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else {
            if (f3 < 3.0f) {
                return f2;
            }
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    public static float A01(String str, int i) throws SVGParseException {
        float fA00 = new HAv().A00(str, 0, i);
        if (Float.isNaN(fA00)) {
            throw A0B("Invalid float value: ", str);
        }
        return fA00;
    }

    public static int A02(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0I(X.HBF r5, org.xml.sax.Attributes r6) throws com.caverock.androidsvg.SVGParseException {
        /*
            r4 = this;
            r4 = 0
            r1 = 0
        L2:
            int r0 = r6.getLength()
            if (r1 >= r0) goto L8e
            java.lang.String r2 = A0F(r6, r1)
            X.Htl r0 = X.Htl.$redex_init_class
            int r3 = A04(r6, r1)
            r0 = 26
            if (r3 == r0) goto L62
            switch(r3) {
                case 23: goto L5b;
                case 24: goto L3f;
                case 60: goto L1c;
                default: goto L19;
            }
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            java.lang.String r0 = "pad"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.IllegalArgumentException -> L7a
            if (r0 == 0) goto L29
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.IllegalArgumentException -> L7a
        L26:
            r5.A02 = r0     // Catch: java.lang.IllegalArgumentException -> L7a
            goto L19
        L29:
            java.lang.String r0 = "reflect"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.IllegalArgumentException -> L7a
            if (r0 == 0) goto L34
            java.lang.Integer r0 = X.C79.A01     // Catch: java.lang.IllegalArgumentException -> L7a
            goto L26
        L34:
            java.lang.String r0 = "repeat"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.IllegalArgumentException -> L7a
            if (r0 == 0) goto L75
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.IllegalArgumentException -> L7a
            goto L26
        L3f:
            java.lang.String r0 = "objectBoundingBox"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L4b:
            r5.A01 = r0
            goto L19
        L4e:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L87
            java.lang.Boolean r0 = X.AnonymousClass001.A0i()
            goto L4b
        L5b:
            android.graphics.Matrix r0 = A05(r2)
            r5.A00 = r0
            goto L19
        L62:
            java.lang.String r0 = ""
            boolean r0 = A0W(r0, r6, r1)
            if (r0 != 0) goto L72
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A0W(r0, r6, r1)
            if (r0 == 0) goto L19
        L72:
            r5.A03 = r2
            goto L19
        L75:
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r2)     // Catch: java.lang.IllegalArgumentException -> L7a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L7a
        L7a:
            java.lang.String r1 = "Invalid spreadMethod attribute. \""
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r0 = X.FGI.A0U(r1, r2, r0)
            com.caverock.androidsvg.SVGParseException r0 = X.AbstractC7607F5u.A0r(r0)
            throw r0
        L87:
            java.lang.String r0 = "Invalid value for attribute gradientUnits"
            com.caverock.androidsvg.SVGParseException r0 = X.AbstractC7607F5u.A0r(r0)
            throw r0
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB8.A0I(X.HBF, org.xml.sax.Attributes):void");
    }

    private void A0J(HC6 hc6, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            EnumC10471Hki enumC10471Hki = EnumC10471Hki.A00.get(attributes.getLocalName(i));
            if (enumC10471Hki == null) {
                enumC10471Hki = EnumC10471Hki.A03;
            }
            if (enumC10471Hki == EnumC10471Hki.A05) {
                hc6.Af2(A05(attributes.getValue(i)));
            }
        }
    }

    public static void A0L(HBU hbu, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strA0F = A0F(attributes, i);
            Htl htl = Htl.$redex_init_class;
            switch (A04(attributes, i)) {
                case 52:
                    HAp hAp = new HAp(strA0F);
                    HashSet hashSetA13 = C60O.A13();
                    while (!AnonymousClass002.A1Q(hAp.A01, hAp.A00)) {
                        String strA03 = HAp.A03(hAp, ' ', false);
                        hashSetA13.add(strA03.startsWith("http://www.w3.org/TR/SVG11/feature#") ? strA03.substring(35) : "UNSUPPORTED");
                        hAp.A0E();
                    }
                    hbu.AeP(hashSetA13);
                    break;
                case 53:
                    hbu.AeO(strA0F);
                    break;
                case 54:
                    HAp hAp2 = new HAp(strA0F);
                    HashSet hashSetA132 = C60O.A13();
                    while (!AnonymousClass002.A1Q(hAp2.A01, hAp2.A00)) {
                        hashSetA132.add(HAp.A03(hAp2, ' ', false));
                        hAp2.A0E();
                    }
                    hbu.AeR(hashSetA132);
                    break;
                case 55:
                    List<String> listA0G = A0G(strA0F);
                    hbu.AeQ(listA0G != null ? new HashSet(listA0G) : new HashSet(0));
                    break;
                case 73:
                    HAp hAp3 = new HAp(strA0F);
                    HashSet hashSetA133 = C60O.A13();
                    while (!AnonymousClass002.A1Q(hAp3.A01, hAp3.A00)) {
                        String strA032 = HAp.A03(hAp3, ' ', false);
                        int iIndexOf = strA032.indexOf(45);
                        if (iIndexOf != -1) {
                            strA032 = strA032.substring(0, iIndexOf);
                        }
                        hashSetA133.add(new Locale(strA032, "", "").getLanguage());
                        hAp3.A0E();
                    }
                    hbu.Aeu(hashSetA133);
                    break;
            }
        }
    }

    public static void A0N(HB4 hb4, Attributes attributes) throws SVGParseException {
        Boolean bool;
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                hb4.A03 = A0F(attributes, i);
                return;
            }
            if (qName.equals("xml:space")) {
                String strA0F = A0F(attributes, i);
                if ("default".equals(strA0F)) {
                    bool = Boolean.FALSE;
                } else {
                    if (!"preserve".equals(strA0F)) {
                        throw A0B("Invalid value for \"xml:space\" attribute: ", strA0F);
                    }
                    bool = Boolean.TRUE;
                }
                hb4.A02 = bool;
                return;
            }
        }
    }

    public static void A0O(HB4 hb4, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strA0F = A0F(attributes, i);
            if (strA0F.length() != 0) {
                Htl htl = Htl.$redex_init_class;
                int iA04 = A04(attributes, i);
                if (iA04 == 72) {
                    HAp hAp = new HAp(strA0F.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strA03 = HAp.A03(hAp, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, false);
                        hAp.A0E();
                        if (hAp.A0G(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR)) {
                            hAp.A0E();
                            String strA032 = HAp.A03(hAp, ';', true);
                            if (strA032 != null) {
                                hAp.A0E();
                                if (AnonymousClass002.A1Q(hAp.A01, hAp.A00) || hAp.A0G(';')) {
                                    HBB hbb = hb4.A01;
                                    if (hbb == null) {
                                        hbb = new HBB();
                                        hb4.A01 = hbb;
                                    }
                                    A0K(hbb, strA03, strA032);
                                    hAp.A0E();
                                }
                            }
                        }
                    }
                } else if (iA04 != 0) {
                    HBB hbb2 = hb4.A00;
                    if (hbb2 == null) {
                        hbb2 = new HBB();
                        hb4.A00 = hbb2;
                    }
                    A0K(hbb2, attributes.getLocalName(i), A0F(attributes, i));
                } else {
                    HAo hAo = new HAo(strA0F.replaceAll("(?s)/\\*.*?\\*/", ""));
                    ArrayList arrayListA0x = null;
                    while (!AnonymousClass002.A1Q(hAo.A01, hAo.A00)) {
                        String strA033 = HAp.A03(hAo, ' ', false);
                        if (strA033 != null) {
                            arrayListA0x = AbstractC7609F5w.A0x(arrayListA0x);
                            arrayListA0x.add(strA033);
                            hAo.A0E();
                        }
                    }
                    hb4.A04 = arrayListA0x;
                }
            }
        }
    }

    public static void A0Q(AbstractC10359HBy abstractC10359HBy, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strA0F = A0F(attributes, i);
            Htl htl = Htl.$redex_init_class;
            int iA04 = A04(attributes, i);
            if (iA04 == 48) {
                A0P(abstractC10359HBy, strA0F);
            } else if (iA04 == 80) {
                HAp hAp = new HAp(strA0F);
                hAp.A0E();
                float fA05 = hAp.A05();
                hAp.A0F();
                float fA052 = hAp.A05();
                hAp.A0F();
                float fA053 = hAp.A05();
                hAp.A0F();
                float fA054 = hAp.A05();
                if (Float.isNaN(fA05) || Float.isNaN(fA052) || Float.isNaN(fA053) || Float.isNaN(fA054)) {
                    throw AbstractC7607F5u.A0r("Invalid viewBox definition - should have four numbers");
                }
                if (fA053 < 0.0f) {
                    throw AbstractC7607F5u.A0r("Invalid viewBox. width cannot be negative");
                }
                if (fA054 < 0.0f) {
                    throw AbstractC7607F5u.A0r("Invalid viewBox. height cannot be negative");
                }
                abstractC10359HBy.A00 = new HBQ(fA05, fA052, fA053, fA054);
            } else {
                continue;
            }
        }
    }

    public static void A0R(AbstractC10345HBj abstractC10345HBj, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strA0F = A0F(attributes, i);
            Htl htl = Htl.$redex_init_class;
            int iA04 = A04(attributes, i);
            if (iA04 == 82) {
                abstractC10345HBj.A02 = A0H(strA0F);
            } else if (iA04 == 83) {
                abstractC10345HBj.A03 = A0H(strA0F);
            } else if (iA04 == 9) {
                abstractC10345HBj.A00 = A0H(strA0F);
            } else if (iA04 == 10) {
                abstractC10345HBj.A01 = A0H(strA0F);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r2
  0x0028: PHI (r2v1 float) = (r2v0 float), (r2v8 float) binds: [B:9:0x0019, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(float r5, float r6, float r7) {
        /*
            r1 = 1135869952(0x43b40000, float:360.0)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            float r5 = r5 % r1
            if (r0 >= 0) goto L9
            float r5 = r5 + r1
        L9:
            r0 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = r7 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5b
            r6 = 0
        L17:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L28
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L55
            r2 = r7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L55
        L28:
            float r6 = r6 + r1
            float r6 = r6 * r2
        L2a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r2 = r2 - r6
            float r0 = r5 + r1
            float r0 = A00(r2, r6, r0)
            float r4 = A00(r2, r6, r5)
            float r5 = r5 - r1
            float r3 = A00(r2, r6, r5)
            r2 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r2
            int r0 = A02(r0)
            int r1 = r0 << 16
            float r4 = r4 * r2
            int r0 = A02(r4)
            int r0 = r0 << 8
            r1 = r1 | r0
            float r3 = r3 * r2
            int r0 = A02(r3)
            r0 = r0 | r1
            return r0
        L55:
            float r0 = r2 + r6
            float r6 = r6 * r2
            float r6 = r0 - r6
            goto L2a
        L5b:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB8.A03(float, float, float):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C10340HBe A06(java.lang.String r16) throws com.caverock.androidsvg.SVGParseException {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB8.A06(java.lang.String):X.HBe");
    }

    public static HBD A07(HAp hAp) {
        if (!hAp.A0H("auto")) {
            return hAp.A09();
        }
        HBD hbd = new HBD();
        hbd.A00 = 0.0f;
        hbd.A01 = C79.A00;
        return hbd;
    }

    public static HC9 A09(String str) {
        String strTrim;
        if (!str.startsWith("url(")) {
            if (str.equals("none")) {
                return C10340HBe.A02;
            }
            if (str.equals("currentColor")) {
                return HC8.A00;
            }
            try {
                return A06(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        HC9 hc9A06 = null;
        if (iIndexOf != -1) {
            strTrim = str.substring(4, iIndexOf).trim();
            String strTrim2 = BV4.A0g(iIndexOf, str).trim();
            if (strTrim2.length() > 0) {
                if (strTrim2.equals("none")) {
                    hc9A06 = C10340HBe.A02;
                } else if (strTrim2.equals("currentColor")) {
                    hc9A06 = HC8.A00;
                } else {
                    try {
                        hc9A06 = A06(strTrim2);
                    } catch (SVGParseException unused2) {
                    }
                }
            }
        } else {
            strTrim = str.substring(4).trim();
        }
        C10339HBd c10339HBd = new C10339HBd();
        c10339HBd.A01 = strTrim;
        c10339HBd.A00 = hc9A06;
        return c10339HBd;
    }

    public static SVGParseException A0A() {
        return new SVGParseException("Invalid document. Root element must be <svg>");
    }

    public static String A0E(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        return (str.endsWith(")") ? str.substring(4, str.length() - 1) : str.substring(4)).trim();
    }

    public static List<String> A0G(String str) {
        HAp hAp = new HAp(str);
        ArrayList arrayListA0x = null;
        do {
            String strA0D = hAp.A0D();
            if (strA0D == null && (strA0D = HAp.A03(hAp, ',', true)) == null) {
                return arrayListA0x;
            }
            arrayListA0x = AbstractC7609F5w.A0x(arrayListA0x);
            arrayListA0x.add(strA0D);
            hAp.A0F();
        } while (!AnonymousClass002.A1Q(hAp.A01, hAp.A00));
        return arrayListA0x;
    }

    public static void A0M(HB7 hb7, HB4 hb4, HB8 hb8, Attributes attributes) throws SVGParseException {
        ((HB3) hb4).A01 = hb8.A02;
        ((HB3) hb4).A00 = hb7;
        A0N(hb4, attributes);
        A0O(hb4, attributes);
    }

    public static void A0P(AbstractC10358HBx abstractC10358HBx, String str) throws SVGParseException {
        Integer num;
        HAp hAp = new HAp(str);
        hAp.A0E();
        String strA03 = HAp.A03(hAp, ' ', false);
        if ("defer".equals(strA03)) {
            hAp.A0E();
            strA03 = HAp.A03(hAp, ' ', false);
        }
        HHN hhn = HHM.A00.get(strA03);
        hAp.A0E();
        if (AnonymousClass002.A1Q(hAp.A01, hAp.A00)) {
            num = null;
        } else {
            String strA032 = HAp.A03(hAp, ' ', false);
            if (strA032.equals("meet")) {
                num = C79.A00;
            } else {
                if (!strA032.equals("slice")) {
                    throw A0B("Invalid preserveAspectRatio definition: ", str);
                }
                num = C79.A01;
            }
        }
        HBJ hbj = new HBJ();
        hbj.A00 = hhn;
        hbj.A01 = num;
        abstractC10358HBx.A00 = hbj;
    }

    public static void A0S(HB8 hb8, String str) {
        StringBuilder sbA0p;
        if (hb8.A05) {
            return;
        }
        if (hb8.A06) {
            sbA0p = hb8.A03;
            if (sbA0p == null) {
                sbA0p = BV4.A0p(str.length());
                hb8.A03 = sbA0p;
            }
        } else if (!hb8.A07) {
            if (hb8.A01 instanceof HBO) {
                hb8.A0V(str);
                return;
            }
            return;
        } else {
            sbA0p = hb8.A04;
            if (sbA0p == null) {
                sbA0p = BV4.A0p(str.length());
                hb8.A04 = sbA0p;
            }
        }
        sbA0p.append(str);
    }

    public static void A0T(HB8 hb8, String str, String str2, String str3) {
        StringBuilder sb;
        if (hb8.A05) {
            int i = hb8.A00 - 1;
            hb8.A00 = i;
            if (i == 0) {
                hb8.A05 = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            Htl htl = Htl.$redex_init_class;
            EnumC10334Guo enumC10334Guo = EnumC10334Guo.A00.get(str2);
            if (enumC10334Guo == null) {
                enumC10334Guo = EnumC10334Guo.A03;
            }
            int iOrdinal = enumC10334Guo.ordinal();
            if (iOrdinal != 0 && iOrdinal != 7 && iOrdinal != 4 && iOrdinal != 29 && iOrdinal != 24 && iOrdinal != 28) {
                switch (iOrdinal) {
                    case 3:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                    case 14:
                    case 17:
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                    case 25:
                    case 30:
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case 15:
                    case 16:
                    case 18:
                    case 24:
                    case 27:
                    case 28:
                    case 29:
                    default:
                        return;
                    case 5:
                    case 26:
                        hb8.A06 = false;
                        sb = hb8.A03;
                        if (sb == null) {
                            return;
                        }
                        break;
                    case 21:
                        StringBuilder sb2 = hb8.A04;
                        if (sb2 != null) {
                            hb8.A07 = false;
                            String string = sb2.toString();
                            G3V g3v = G3V.screen;
                            Integer num = C79.A00;
                            HAn hAn = new HAn();
                            hAn.A02 = false;
                            hAn.A00 = g3v;
                            hAn.A01 = num;
                            HBA hba = hb8.A02;
                            HAo hAo = new HAo(string.replaceAll("(?s)/\\*.*?\\*/", ""));
                            hAo.A0E();
                            hba.A00.A01(HAn.A01(hAo, hAn));
                            sb = hb8.A04;
                            break;
                        } else {
                            return;
                        }
                }
                sb.setLength(0);
                return;
            }
            hb8.A01 = ((HB3) hb8.A01).A00;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0a41, code lost:
    
        android.util.Log.e("SVGParser", X.FGI.A0O("Bad path coords for ", " path segment", (char) r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x0260, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x0449, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x0884 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v182, types: [X.HB7] */
    /* JADX WARN: Type inference failed for: r0v272, types: [X.HB7] */
    /* JADX WARN: Type inference failed for: r0v429, types: [X.HB7] */
    /* JADX WARN: Type inference failed for: r0v437, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.HB8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.HB4, X.HBP, X.HBU, X.HBb, X.HC6] */
    /* JADX WARN: Type inference failed for: r2v42, types: [X.HB4, X.HBU, X.HBV, X.HBx, X.HBy] */
    /* JADX WARN: Type inference failed for: r2v43, types: [X.HB4, X.HBF, X.HBi] */
    /* JADX WARN: Type inference failed for: r2v44, types: [X.HB3, X.HB7] */
    /* JADX WARN: Type inference failed for: r2v45, types: [X.HB4, X.HBF, X.HBa] */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.HB4, X.HBP, X.HBU, X.HBj, X.HC6] */
    /* JADX WARN: Type inference failed for: r3v18, types: [X.HB4, X.HBU, X.HC6] */
    /* JADX WARN: Type inference failed for: r3v28, types: [X.HB4, X.HB6] */
    /* JADX WARN: Type inference failed for: r3v29, types: [X.HB4, X.HBP, X.HBU, X.HBo, X.HC6] */
    /* JADX WARN: Type inference failed for: r3v31, types: [X.HB4, X.HBR, X.HBU, X.HBx, X.HBy] */
    /* JADX WARN: Type inference failed for: r3v32, types: [X.HB4, X.HBU, X.HBX, X.HBx, X.HC6] */
    /* JADX WARN: Type inference failed for: r3v33, types: [X.HBU, X.HBy] */
    /* JADX WARN: Type inference failed for: r3v35, types: [X.HB4, X.HBP, X.HBU, X.HBW] */
    /* JADX WARN: Type inference failed for: r3v36, types: [X.HB3, X.HB7] */
    /* JADX WARN: Type inference failed for: r3v37, types: [X.HB4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.HB4, X.HBP, X.HC6] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.HB4, X.HBU, X.HBs, X.HC1, X.HC6] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.HB4, X.HBU, X.HBc, X.HC1, X.HC6] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.HB4, X.HBU, X.HBl, X.HC1, X.HC6] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.HB4, X.HBU, X.HBf, X.HC1, X.HC6] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.HB4, X.HBU, X.HBg, X.HC1, X.HC6] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.HB3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.HBt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0U(X.HB8 r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, org.xml.sax.Attributes r29) {
        /*
            Method dump skipped, instructions count: 3434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB8.A0U(X.HB8, java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    private void A0V(String str) {
        HBP hbp = (HBP) this.A01;
        int size = hbp.A01.size();
        HB3 hb3 = size == 0 ? null : hbp.A01.get(size - 1);
        if (hb3 instanceof C10353HBr) {
            C10353HBr c10353HBr = (C10353HBr) hb3;
            c10353HBr.A00 = FGI.A0M(c10353HBr.A00, str);
        } else {
            HB7 hb7 = this.A01;
            C10353HBr c10353HBr2 = new C10353HBr();
            c10353HBr2.A00 = str;
            hb7.A3S(c10353HBr2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        throw new com.caverock.androidsvg.SVGParseException("SVG parse error", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
    
        throw new com.caverock.androidsvg.SVGParseException("XML parser problem", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        android.util.Log.d("SVGParser", "Switching to SAX parser to process entities");
        r12.reset();
        android.util.Log.d("SVGParser", "Falling back to SAX parser");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015b, code lost:
    
        r1 = javax.xml.parsers.SAXParserFactory.newInstance();
        r1.setFeature("http://xml.org/sax/features/external-general-entities", false);
        r1.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        r2 = r1.newSAXParser().getXMLReader();
        r1 = new X.HBS(r11);
        r2.setContentHandler(r1);
        r2.setProperty("http://xml.org/sax/properties/lexical-handler", r1);
        r2.parse(new org.xml.sax.InputSource(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0190, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0199, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a1, code lost:
    
        throw new com.caverock.androidsvg.SVGParseException("Stream error", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a2, code lost:
    
        android.util.Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.HBA A0X(java.io.InputStream r12) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB8.A0X(java.io.InputStream):X.HBA");
    }

    public static int A04(Attributes attributes, int i) {
        EnumC10471Hki enumC10471Hki = EnumC10471Hki.A00.get(attributes.getLocalName(i));
        if (enumC10471Hki == null) {
            enumC10471Hki = EnumC10471Hki.A03;
        }
        return enumC10471Hki.ordinal();
    }

    public static Matrix A05(String str) throws SVGParseException {
        String strSubstring;
        Matrix matrixA08 = BV4.A08();
        HAp hAp = new HAp(str);
        hAp.A0E();
        while (!AnonymousClass002.A1Q(hAp.A01, hAp.A00)) {
            int i = hAp.A01;
            String str2 = hAp.A03;
            int iCharAt = str2.charAt(i);
            while (true) {
                if (iCharAt >= 97) {
                    if (iCharAt <= 122) {
                        iCharAt = hAp.A08();
                    }
                } else if (iCharAt >= 65 && iCharAt <= 90) {
                    iCharAt = hAp.A08();
                }
                return matrixA08;
            }
            int i2 = hAp.A01;
            while (HAp.A04(iCharAt)) {
                iCharAt = hAp.A08();
            }
            if (iCharAt != 40) {
                throw A0B("Bad transform function encountered in transform list: ", str);
            }
            hAp.A01++;
            strSubstring = str2.substring(i, i2);
            switch (strSubstring) {
                case "matrix":
                    hAp.A0E();
                    float fA05 = hAp.A05();
                    hAp.A0F();
                    float fA052 = hAp.A05();
                    hAp.A0F();
                    float fA053 = hAp.A05();
                    hAp.A0F();
                    float fA054 = hAp.A05();
                    hAp.A0F();
                    float fA055 = hAp.A05();
                    hAp.A0F();
                    float fA056 = hAp.A05();
                    hAp.A0E();
                    if (!Float.isNaN(fA056) && hAp.A0G(')')) {
                        Matrix matrixA082 = BV4.A08();
                        float[] fArrA1Z = AbstractC7607F5u.A1Z(fA05, fA053, 9);
                        fArrA1Z[2] = fA055;
                        fArrA1Z[3] = fA052;
                        fArrA1Z[4] = fA054;
                        fArrA1Z[5] = fA056;
                        AbstractC7609F5w.A1S(fArrA1Z, 0.0f);
                        fArrA1Z[8] = 1.0f;
                        matrixA082.setValues(fArrA1Z);
                        matrixA08.preConcat(matrixA082);
                        break;
                    } else {
                        throw A0B("Invalid transform list: ", str);
                    }
                case "rotate":
                    hAp.A0E();
                    float fA057 = hAp.A05();
                    float fA06 = hAp.A06();
                    float fA062 = hAp.A06();
                    hAp.A0E();
                    if (Float.isNaN(fA057) || !hAp.A0G(')')) {
                        throw A0B("Invalid transform list: ", str);
                    }
                    if (Float.isNaN(fA06)) {
                        matrixA08.preRotate(fA057);
                        break;
                    } else if (!Float.isNaN(fA062)) {
                        matrixA08.preRotate(fA057, fA06, fA062);
                        break;
                    } else {
                        throw A0B("Invalid transform list: ", str);
                    }
                    break;
                case "scale":
                    hAp.A0E();
                    float fA058 = hAp.A05();
                    float fA063 = hAp.A06();
                    hAp.A0E();
                    if (!Float.isNaN(fA058) && hAp.A0G(')')) {
                        if (!Float.isNaN(fA063)) {
                            matrixA08.preScale(fA058, fA063);
                            break;
                        } else {
                            matrixA08.preScale(fA058, fA058);
                            break;
                        }
                    } else {
                        throw A0B("Invalid transform list: ", str);
                    }
                case "skewX":
                    hAp.A0E();
                    float fA059 = hAp.A05();
                    hAp.A0E();
                    if (!Float.isNaN(fA059) && hAp.A0G(')')) {
                        matrixA08.preSkew((float) Math.tan(Math.toRadians(fA059)), 0.0f);
                        break;
                    } else {
                        throw A0B("Invalid transform list: ", str);
                    }
                    break;
                case "skewY":
                    hAp.A0E();
                    float fA0510 = hAp.A05();
                    hAp.A0E();
                    if (!Float.isNaN(fA0510) && hAp.A0G(')')) {
                        matrixA08.preSkew(0.0f, (float) Math.tan(Math.toRadians(fA0510)));
                        break;
                    } else {
                        throw A0B("Invalid transform list: ", str);
                    }
                    break;
                case "translate":
                    hAp.A0E();
                    float fA0511 = hAp.A05();
                    float fA064 = hAp.A06();
                    hAp.A0E();
                    if (!Float.isNaN(fA0511) && hAp.A0G(')')) {
                        if (!Float.isNaN(fA064)) {
                            matrixA08.preTranslate(fA0511, fA064);
                            break;
                        } else {
                            matrixA08.preTranslate(fA0511, 0.0f);
                            break;
                        }
                    } else {
                        throw A0B("Invalid transform list: ", str);
                    }
                    break;
                default:
                    throw AbstractC7607F5u.A0r(C60O.A0r("Invalid transform list fn: ", strSubstring));
            }
            if (AnonymousClass002.A1Q(hAp.A01, hAp.A00)) {
                return matrixA08;
            }
            hAp.A0F();
        }
        return matrixA08;
    }

    public static HBD A08(String str) throws SVGParseException {
        int length = str.length();
        if (length == 0) {
            throw AbstractC7607F5u.A0r("Invalid length value (empty string)");
        }
        Integer numA00 = C79.A00;
        int i = length - 1;
        char cCharAt = str.charAt(i);
        if (cCharAt == '%') {
            length = i;
            numA00 = C79.A0Z;
        } else if (length > 2 && Character.isLetter(cCharAt)) {
            int i2 = length - 2;
            if (Character.isLetter(str.charAt(i2))) {
                length = i2;
                try {
                    numA00 = HiI.A00(str.substring(i2).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw A0B("Invalid length unit specifier: ", str);
                }
            }
        }
        try {
            return new HBD(numA00, A01(str, length));
        } catch (NumberFormatException e) {
            throw new SVGParseException(FGI.A0M("Invalid length value: ", str), e);
        }
    }

    public static SVGParseException A0B(String str, String str2) {
        return new SVGParseException(FGI.A0M(str, str2));
    }

    public static Float A0C(String str) throws SVGParseException {
        try {
            int length = str.length();
            if (length == 0) {
                throw AbstractC7607F5u.A0r("Invalid float value (empty string)");
            }
            float fA01 = A01(str, length);
            if (fA01 < 0.0f) {
                fA01 = 0.0f;
            } else if (fA01 > 1.0f) {
                fA01 = 1.0f;
            }
            return Float.valueOf(fA01);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static Integer A0D(String str) {
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    return C79.A0C;
                }
                return null;
            case -1178781136:
                if (str.equals("italic")) {
                    return C79.A01;
                }
                return null;
            case -1039745817:
                if (str.equals("normal")) {
                    return C79.A00;
                }
                return null;
            default:
                return null;
        }
    }

    public static String A0F(Attributes attributes, int i) {
        return attributes.getValue(i).trim();
    }

    public static List<HBD> A0H(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw AbstractC7607F5u.A0r("Invalid length list (empty string)");
        }
        ArrayList arrayListA11 = C60O.A11(1);
        HAp hAp = new HAp(str);
        hAp.A0E();
        while (!AnonymousClass002.A1Q(hAp.A01, hAp.A00)) {
            float fA05 = hAp.A05();
            if (Float.isNaN(fA05)) {
                int i = hAp.A01;
                int i2 = i;
                while (!AnonymousClass002.A1Q(i2, hAp.A00) && !HAp.A04(hAp.A03.charAt(i2))) {
                    i2 = hAp.A01 + 1;
                    hAp.A01 = i2;
                }
                throw A0B("Invalid length list value: ", hAp.A03.substring(i, hAp.A01));
            }
            Integer numA0C = hAp.A0C();
            if (numA0C == null) {
                numA0C = C79.A00;
            }
            arrayListA11.add(new HBD(numA0C, fA05));
            hAp.A0F();
        }
        return arrayListA11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0K(X.HBB r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB8.A0K(X.HBB, java.lang.String, java.lang.String):void");
    }

    public static boolean A0W(String str, Attributes attributes, int i) {
        return str.equals(attributes.getURI(i));
    }
}
