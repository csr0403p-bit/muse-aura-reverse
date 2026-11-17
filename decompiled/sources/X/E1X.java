package X;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class E1X {
    public static final Map<String, Integer> A00;
    public static final Map<String, Integer> A01;
    public static final Pattern A02 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    public static final Pattern A03 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        mapA0u.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        mapA0u.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        mapA0u.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        mapA0u.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        mapA0u.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        mapA0u.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        mapA0u.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        A01 = Collections.unmodifiableMap(mapA0u);
        HashMap mapA0u2 = BV4.A0u();
        mapA0u2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        mapA0u2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        mapA0u2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        mapA0u2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        mapA0u2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        mapA0u2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        mapA0u2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        mapA0u2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        A00 = Collections.unmodifiableMap(mapA0u2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString A00(String str, String str2, List<C6325E1a> list) {
        int i;
        String str3;
        String strTrim;
        char c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDequeA0s = BV4.A0s();
        ArrayList arrayListA0h = C3cG.A0h();
        int i2 = 0;
        while (true) {
            int length = str2.length();
            if (i2 >= length) {
                while (!arrayDequeA0s.isEmpty()) {
                    A03(spannableStringBuilder, (C6328E1d) arrayDequeA0s.pop(), str, arrayListA0h, list);
                }
                A03(spannableStringBuilder, new C6328E1d("", "", Collections.EMPTY_SET, 0), str, Collections.EMPTY_LIST, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = str2.indexOf(59, i2);
                int iIndexOf2 = str2.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i2, iIndexOf);
                    switch (strSubstring.hashCode()) {
                        case 3309:
                            if (strSubstring.equals("gt")) {
                                c = '>';
                                spannableStringBuilder.append(c);
                                break;
                            }
                            CNC.A04("WebvttCueParser", FGI.A0U("ignoring unsupported entity: '&", strSubstring, ";'"));
                            break;
                        case 3464:
                            if (strSubstring.equals("lt")) {
                                c = '<';
                                spannableStringBuilder.append(c);
                                break;
                            }
                            CNC.A04("WebvttCueParser", FGI.A0U("ignoring unsupported entity: '&", strSubstring, ";'"));
                            break;
                        case 96708:
                            if (strSubstring.equals("amp")) {
                                c = '&';
                                spannableStringBuilder.append(c);
                                break;
                            }
                            CNC.A04("WebvttCueParser", FGI.A0U("ignoring unsupported entity: '&", strSubstring, ";'"));
                            break;
                        case 3374865:
                            if (strSubstring.equals("nbsp")) {
                                c = ' ';
                                spannableStringBuilder.append(c);
                                break;
                            }
                            CNC.A04("WebvttCueParser", FGI.A0U("ignoring unsupported entity: '&", strSubstring, ";'"));
                            break;
                        default:
                            CNC.A04("WebvttCueParser", FGI.A0U("ignoring unsupported entity: '&", strSubstring, ";'"));
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) InviteCodeScratcherKt.CODE_SEPARATOR);
                    }
                    i = iIndexOf + 1;
                    i2 = i;
                    continue;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i2++;
            } else {
                i = i2 + 1;
                if (i < length) {
                    boolean zA1Q = AnonymousClass002.A1Q(str2.charAt(i), 47);
                    int iIndexOf3 = str2.indexOf(62, i);
                    i = iIndexOf3 + 1;
                    if (iIndexOf3 == -1) {
                        i = length;
                    }
                    int i3 = i - 2;
                    boolean zA1Q2 = AnonymousClass002.A1Q(str2.charAt(i3), 47);
                    int i4 = i2 + (zA1Q ? 2 : 1);
                    if (!zA1Q2) {
                        i3 = i - 1;
                    }
                    String strSubstring2 = str2.substring(i4, i3);
                    if (!C60Q.A1V(strSubstring2)) {
                        String strTrim2 = strSubstring2.trim();
                        C1G.A07(!strTrim2.isEmpty());
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        switch (str4.hashCode()) {
                            case 98:
                                str3 = CRD.__redex_internal_original_name;
                                break;
                            case 99:
                                str3 = "c";
                                break;
                            case 105:
                                str3 = "i";
                                break;
                            case 117:
                                str3 = "u";
                                break;
                            case 118:
                                str3 = HatchSpacesDataSourceKt.VERSION_QUERY_PARAM;
                                break;
                            case 3650:
                                str3 = "rt";
                                break;
                            case 3314158:
                                str3 = "lang";
                                break;
                            case 3511770:
                                str3 = "ruby";
                                break;
                        }
                        if (str4.equals(str3)) {
                            if (zA1Q) {
                                while (!arrayDequeA0s.isEmpty()) {
                                    C6328E1d c6328E1d = (C6328E1d) arrayDequeA0s.pop();
                                    A03(spannableStringBuilder, c6328E1d, str, arrayListA0h, list);
                                    if (arrayDequeA0s.isEmpty()) {
                                        arrayListA0h.clear();
                                    } else {
                                        arrayListA0h.add(new C6327E1c(c6328E1d, spannableStringBuilder.length()));
                                    }
                                    if (c6328E1d.A01.equals(str4)) {
                                    }
                                }
                            } else if (!zA1Q2) {
                                int length2 = spannableStringBuilder.length();
                                String strTrim3 = strSubstring2.trim();
                                C1G.A07(!strTrim3.isEmpty());
                                int iIndexOf4 = strTrim3.indexOf(InviteCodeScratcherKt.CODE_SEPARATOR);
                                if (iIndexOf4 == -1) {
                                    strTrim = "";
                                } else {
                                    strTrim = strTrim3.substring(iIndexOf4).trim();
                                    strTrim3 = strTrim3.substring(0, iIndexOf4);
                                }
                                String[] strArrSplit = strTrim3.split("\\.", -1);
                                String str5 = strArrSplit[0];
                                HashSet hashSetA13 = C60O.A13();
                                for (int i5 = 1; i5 < strArrSplit.length; i5++) {
                                    hashSetA13.add(strArrSplit[i5]);
                                }
                                arrayDequeA0s.push(new C6328E1d(str5, strTrim, hashSetA13, length2));
                            }
                        }
                    }
                }
                i2 = i;
                continue;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/regex/Matcher;LX/E1P;Ljava/util/List<LX/E1a;>;)LX/E0i; */
    public static C6310E0i A01(E1P e1p, String str, List list, Matcher matcher) {
        C6315E0n c6315E0n = new C6315E0n();
        try {
            c6315E0n.A09 = AbstractC3153Bzt.A01(BV6.A0p(matcher, 1));
            c6315E0n.A08 = AbstractC3153Bzt.A01(BV6.A0p(matcher, 2));
            A04(c6315E0n, BV6.A0p(matcher, 3));
            StringBuilder sbA0w = C60O.A0w();
            while (true) {
                String strA0L = e1p.A0L(StandardCharsets.UTF_8);
                if (TextUtils.isEmpty(strA0L)) {
                    c6315E0n.A0A = A00(str, sbA0w.toString(), list);
                    return new C6310E0i(c6315E0n.A00().A00(), c6315E0n.A09, c6315E0n.A08);
                }
                if (sbA0w.length() > 0) {
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                }
                sbA0w.append(strA0L.trim());
            }
        } catch (IllegalArgumentException unused) {
            CNC.A04("WebvttCueParser", FGI.A0M("Skipping cue with bad header: ", matcher.group()));
            return null;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/E1d;Ljava/util/List<LX/E1c;>;Landroid/text/SpannableStringBuilder;Ljava/util/List<LX/E1a;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(android.text.SpannableStringBuilder r17, X.C6328E1d r18, java.lang.String r19, java.util.List r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1X.A03(android.text.SpannableStringBuilder, X.E1d, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[Catch: NumberFormatException -> 0x017b, TryCatch #0 {NumberFormatException -> 0x017b, blocks: (B:6:0x0018, B:8:0x0020, B:10:0x002a, B:11:0x0032, B:12:0x0035, B:28:0x0062, B:13:0x003b, B:16:0x0045, B:21:0x0053, B:29:0x0068, B:31:0x0070, B:32:0x0076, B:33:0x0079, B:34:0x0082, B:36:0x008a, B:37:0x008e, B:38:0x0091, B:61:0x00d1, B:41:0x009c, B:44:0x00a3, B:47:0x00ac, B:50:0x00b5, B:53:0x00be, B:62:0x00d5, B:64:0x00dd, B:66:0x00e6, B:67:0x00ee, B:68:0x00f1, B:88:0x0124, B:81:0x0115, B:73:0x0103, B:77:0x010c, B:89:0x012a, B:90:0x0132, B:92:0x013b, B:93:0x0143, B:95:0x014f, B:97:0x0157, B:99:0x015f, B:102:0x016a, B:103:0x016e), top: B:106:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1 A[Catch: NumberFormatException -> 0x017b, TryCatch #0 {NumberFormatException -> 0x017b, blocks: (B:6:0x0018, B:8:0x0020, B:10:0x002a, B:11:0x0032, B:12:0x0035, B:28:0x0062, B:13:0x003b, B:16:0x0045, B:21:0x0053, B:29:0x0068, B:31:0x0070, B:32:0x0076, B:33:0x0079, B:34:0x0082, B:36:0x008a, B:37:0x008e, B:38:0x0091, B:61:0x00d1, B:41:0x009c, B:44:0x00a3, B:47:0x00ac, B:50:0x00b5, B:53:0x00be, B:62:0x00d5, B:64:0x00dd, B:66:0x00e6, B:67:0x00ee, B:68:0x00f1, B:88:0x0124, B:81:0x0115, B:73:0x0103, B:77:0x010c, B:89:0x012a, B:90:0x0132, B:92:0x013b, B:93:0x0143, B:95:0x014f, B:97:0x0157, B:99:0x015f, B:102:0x016a, B:103:0x016e), top: B:106:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.C6315E0n r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1X.A04(X.E0n, java.lang.String):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/E1a;>;Ljava/lang/String;LX/E1d;)Ljava/util/List<LX/E1b;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList A02(C6328E1d c6328E1d, String str, List list) {
        int size;
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i = 0; i < list.size(); i++) {
            C6325E1a c6325E1a = (C6325E1a) list.get(i);
            String str2 = c6328E1d.A01;
            Set<String> set = c6328E1d.A03;
            String str3 = c6328E1d.A02;
            if (c6325E1a.A09.isEmpty() && c6325E1a.A0A.isEmpty() && c6325E1a.A0C.isEmpty() && c6325E1a.A0B.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                String str4 = c6325E1a.A09;
                int i2 = str4.isEmpty() ? 0 : str4.equals(str) ? 1073741824 : -1;
                String str5 = c6325E1a.A0A;
                if (!str5.isEmpty() && i2 != -1) {
                    i2 = str5.equals(str2) ? i2 + 2 : -1;
                }
                String str6 = c6325E1a.A0B;
                if (str6.isEmpty()) {
                    if (i2 == -1 && set.containsAll(c6325E1a.A0C)) {
                        size = i2 + (c6325E1a.A0C.size() * 4);
                    }
                } else if (i2 != -1 && str6.equals(str3)) {
                    i2 += 4;
                    if (i2 == -1) {
                    }
                }
            }
            if (size > 0) {
                arrayListA0h.add(new C6326E1b(c6325E1a, size));
            }
        }
        Collections.sort(arrayListA0h);
        return arrayListA0h;
    }
}
