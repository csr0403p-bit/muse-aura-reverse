package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class HAn {
    public G3V A00;
    public Integer A01;
    public boolean A02;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/HB7;>;ILX/HB4;)I */
    public static int A00(HB4 hb4, List list, int i) {
        int i2 = 0;
        if (i >= 0) {
            Object obj = list.get(i);
            HB7 hb7 = ((HB3) hb4).A00;
            if (obj == hb7) {
                Iterator<HB3> it = hb7.ADb().iterator();
                while (it.hasNext()) {
                    if (it.next() != hb4) {
                        i2++;
                    }
                }
            }
            return -1;
        }
        return i2;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/HB2;LX/Hjw;ILjava/util/List<LX/HB7;>;I)Z */
    public static boolean A05(HB2 hb2, C10466Hjw c10466Hjw, List list, int i, int i2) {
        int i3 = i2;
        HAl hAl = c10466Hjw.A01.get(i);
        HB4 hb4 = (HB4) list.get(i2);
        if (!A06(hb2, hAl, hb4)) {
            return false;
        }
        Integer num = hAl.A00;
        if (num != C79.A00) {
            if (num == C79.A01) {
                return A05(hb2, c10466Hjw, list, i - 1, i2 - 1);
            }
            int iA00 = A00(hb4, list, i2);
            if (iA00 > 0) {
                return A04(hb2, c10466Hjw, (HB4) ((HB3) hb4).A00.ADb().get(iA00 - 1), list, i - 1, i3);
            }
            return false;
        }
        if (i == 0) {
            return true;
        }
        while (i3 > 0) {
            i3--;
            if (A05(hb2, c10466Hjw, list, i - 1, i3)) {
                return true;
            }
        }
        return false;
    }

    public HAn() {
        G3V g3v = G3V.screen;
        Integer num = C79.A00;
        this.A02 = false;
        this.A00 = g3v;
        this.A01 = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0151, code lost:
    
        if (r10.A0H(")") == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f A[Catch: CSSParseException -> 0x02c8, TryCatch #0 {CSSParseException -> 0x02c8, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0017, B:9:0x001f, B:11:0x0027, B:13:0x0030, B:15:0x0038, B:17:0x0040, B:19:0x004c, B:20:0x0055, B:22:0x005b, B:152:0x029f, B:153:0x02aa, B:155:0x02b4, B:157:0x02bc, B:158:0x02c1, B:159:0x02c2, B:26:0x0067, B:27:0x006c, B:28:0x0075, B:30:0x007d, B:32:0x0087, B:34:0x0091, B:36:0x009a, B:37:0x009e, B:39:0x00a8, B:47:0x00c0, B:49:0x00c6, B:51:0x00cc, B:53:0x00d6, B:55:0x00de, B:61:0x00f2, B:64:0x00fa, B:66:0x0104, B:68:0x0110, B:71:0x011f, B:73:0x0122, B:72:0x0121, B:74:0x0127, B:76:0x012d, B:80:0x013e, B:82:0x014b, B:84:0x0153, B:86:0x0163, B:88:0x016b, B:77:0x012f, B:79:0x0135, B:89:0x0172, B:90:0x017e, B:92:0x0188, B:96:0x0198, B:100:0x01a1, B:103:0x01a7, B:104:0x01b0, B:106:0x01b6, B:108:0x01bc, B:110:0x01c4, B:111:0x01cc, B:113:0x01db, B:115:0x01e8, B:128:0x0208, B:130:0x020e, B:131:0x0212, B:132:0x0217, B:134:0x021b, B:136:0x022a, B:138:0x0235, B:147:0x0279, B:139:0x0238, B:141:0x024d, B:143:0x0255, B:144:0x025c, B:146:0x0262, B:148:0x0281, B:149:0x0283, B:150:0x028b, B:151:0x0297), top: B:164:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e A[Catch: CSSParseException -> 0x02c8, TryCatch #0 {CSSParseException -> 0x02c8, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0017, B:9:0x001f, B:11:0x0027, B:13:0x0030, B:15:0x0038, B:17:0x0040, B:19:0x004c, B:20:0x0055, B:22:0x005b, B:152:0x029f, B:153:0x02aa, B:155:0x02b4, B:157:0x02bc, B:158:0x02c1, B:159:0x02c2, B:26:0x0067, B:27:0x006c, B:28:0x0075, B:30:0x007d, B:32:0x0087, B:34:0x0091, B:36:0x009a, B:37:0x009e, B:39:0x00a8, B:47:0x00c0, B:49:0x00c6, B:51:0x00cc, B:53:0x00d6, B:55:0x00de, B:61:0x00f2, B:64:0x00fa, B:66:0x0104, B:68:0x0110, B:71:0x011f, B:73:0x0122, B:72:0x0121, B:74:0x0127, B:76:0x012d, B:80:0x013e, B:82:0x014b, B:84:0x0153, B:86:0x0163, B:88:0x016b, B:77:0x012f, B:79:0x0135, B:89:0x0172, B:90:0x017e, B:92:0x0188, B:96:0x0198, B:100:0x01a1, B:103:0x01a7, B:104:0x01b0, B:106:0x01b6, B:108:0x01bc, B:110:0x01c4, B:111:0x01cc, B:113:0x01db, B:115:0x01e8, B:128:0x0208, B:130:0x020e, B:131:0x0212, B:132:0x0217, B:134:0x021b, B:136:0x022a, B:138:0x0235, B:147:0x0279, B:139:0x0238, B:141:0x024d, B:143:0x0255, B:144:0x025c, B:146:0x0262, B:148:0x0281, B:149:0x0283, B:150:0x028b, B:151:0x0297), top: B:164:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163 A[Catch: CSSParseException -> 0x02c8, TryCatch #0 {CSSParseException -> 0x02c8, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0017, B:9:0x001f, B:11:0x0027, B:13:0x0030, B:15:0x0038, B:17:0x0040, B:19:0x004c, B:20:0x0055, B:22:0x005b, B:152:0x029f, B:153:0x02aa, B:155:0x02b4, B:157:0x02bc, B:158:0x02c1, B:159:0x02c2, B:26:0x0067, B:27:0x006c, B:28:0x0075, B:30:0x007d, B:32:0x0087, B:34:0x0091, B:36:0x009a, B:37:0x009e, B:39:0x00a8, B:47:0x00c0, B:49:0x00c6, B:51:0x00cc, B:53:0x00d6, B:55:0x00de, B:61:0x00f2, B:64:0x00fa, B:66:0x0104, B:68:0x0110, B:71:0x011f, B:73:0x0122, B:72:0x0121, B:74:0x0127, B:76:0x012d, B:80:0x013e, B:82:0x014b, B:84:0x0153, B:86:0x0163, B:88:0x016b, B:77:0x012f, B:79:0x0135, B:89:0x0172, B:90:0x017e, B:92:0x0188, B:96:0x0198, B:100:0x01a1, B:103:0x01a7, B:104:0x01b0, B:106:0x01b6, B:108:0x01bc, B:110:0x01c4, B:111:0x01cc, B:113:0x01db, B:115:0x01e8, B:128:0x0208, B:130:0x020e, B:131:0x0212, B:132:0x0217, B:134:0x021b, B:136:0x022a, B:138:0x0235, B:147:0x0279, B:139:0x0238, B:141:0x024d, B:143:0x0255, B:144:0x025c, B:146:0x0262, B:148:0x0281, B:149:0x0283, B:150:0x028b, B:151:0x0297), top: B:164:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0172 A[Catch: CSSParseException -> 0x02c8, TryCatch #0 {CSSParseException -> 0x02c8, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0017, B:9:0x001f, B:11:0x0027, B:13:0x0030, B:15:0x0038, B:17:0x0040, B:19:0x004c, B:20:0x0055, B:22:0x005b, B:152:0x029f, B:153:0x02aa, B:155:0x02b4, B:157:0x02bc, B:158:0x02c1, B:159:0x02c2, B:26:0x0067, B:27:0x006c, B:28:0x0075, B:30:0x007d, B:32:0x0087, B:34:0x0091, B:36:0x009a, B:37:0x009e, B:39:0x00a8, B:47:0x00c0, B:49:0x00c6, B:51:0x00cc, B:53:0x00d6, B:55:0x00de, B:61:0x00f2, B:64:0x00fa, B:66:0x0104, B:68:0x0110, B:71:0x011f, B:73:0x0122, B:72:0x0121, B:74:0x0127, B:76:0x012d, B:80:0x013e, B:82:0x014b, B:84:0x0153, B:86:0x0163, B:88:0x016b, B:77:0x012f, B:79:0x0135, B:89:0x0172, B:90:0x017e, B:92:0x0188, B:96:0x0198, B:100:0x01a1, B:103:0x01a7, B:104:0x01b0, B:106:0x01b6, B:108:0x01bc, B:110:0x01c4, B:111:0x01cc, B:113:0x01db, B:115:0x01e8, B:128:0x0208, B:130:0x020e, B:131:0x0212, B:132:0x0217, B:134:0x021b, B:136:0x022a, B:138:0x0235, B:147:0x0279, B:139:0x0238, B:141:0x024d, B:143:0x0255, B:144:0x025c, B:146:0x0262, B:148:0x0281, B:149:0x0283, B:150:0x028b, B:151:0x0297), top: B:164:0x0005 }] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.HiF A01(X.HAo r10, X.HAn r11) throws com.caverock.androidsvg.CSSParseException {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HAn.A01(X.HAo, X.HAn):X.HiF");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/HB2;LX/Hjw;ILjava/util/List<LX/HB7;>;ILX/HB4;)Z */
    public static boolean A04(HB2 hb2, C10466Hjw c10466Hjw, HB4 hb4, List list, int i, int i2) {
        HAl hAl = c10466Hjw.A01.get(i);
        if (!A06(hb2, hAl, hb4)) {
            return false;
        }
        Integer num = hAl.A00;
        if (num == C79.A00) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!A05(hb2, c10466Hjw, list, i - 1, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (num == C79.A01) {
            return A05(hb2, c10466Hjw, list, i - 1, i2);
        }
        int iA00 = A00(hb4, list, i2);
        if (iA00 > 0) {
            return A04(hb2, c10466Hjw, (HB4) ((HB3) hb4).A00.ADb().get(iA00 - 1), list, i - 1, i2);
        }
        return false;
    }

    public static boolean A06(HB2 hb2, HAl hAl, HB4 hb4) {
        boolean zEquals;
        List<String> list;
        String str = hAl.A01;
        if (str == null || str.equals(hb4.A00().toLowerCase(Locale.US))) {
            List<HAm> list2 = hAl.A02;
            if (list2 != null) {
                for (HAm hAm : list2) {
                    String str2 = hAm.A01;
                    if (str2.equals("id")) {
                        zEquals = hAm.A02.equals(hb4.A03);
                    } else if (str2.equals("class") && (list = hb4.A04) != null) {
                        zEquals = list.contains(hAm.A02);
                    }
                    if (!zEquals) {
                        return false;
                    }
                }
            }
            List<HAy> list3 = hAl.A03;
            if (list3 == null) {
                return true;
            }
            Iterator<HAy> it = list3.iterator();
            while (it.hasNext()) {
                if (!it.next().AQK(hb2, hb4)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static List<G3V> A02(HAo hAo) {
        ArrayList arrayListA0h = C3cG.A0h();
        while (!AnonymousClass002.A1Q(hAo.A01, hAo.A00)) {
            String strSubstring = null;
            int i = hAo.A01;
            String str = hAo.A03;
            char cCharAt = str.charAt(i);
            if (cCharAt < 'A' || (cCharAt > 'Z' && (cCharAt < 'a' || cCharAt > 'z'))) {
                hAo.A01 = i;
            } else {
                while (true) {
                    int iA08 = hAo.A08();
                    if (iA08 < 65 || (iA08 > 90 && (iA08 < 97 || iA08 > 122))) {
                        break;
                    }
                }
                strSubstring = str.substring(i, hAo.A01);
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayListA0h.add(G3V.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!hAo.A0F()) {
                break;
            }
        }
        return arrayListA0h;
    }

    public static boolean A03(HB2 hb2, C10466Hjw c10466Hjw, HB4 hb4) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj = ((HB3) hb4).A00; obj != null; obj = ((HB3) obj).A00) {
            arrayListA0h.add(0, obj);
        }
        int size = arrayListA0h.size() - 1;
        List<HAl> list = c10466Hjw.A01;
        if (list != null && list.size() == 1) {
            return A06(hb2, c10466Hjw.A01.get(0), hb4);
        }
        return A04(hb2, c10466Hjw, hb4, arrayListA0h, (c10466Hjw.A01 == null ? 0 : r0.size()) - 1, size);
    }
}
