package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.select.Selector$SelectorParseException;

/* loaded from: classes6.dex */
public final class GtJ implements AutoCloseable {
    public boolean A00;
    public final String A01;
    public final GtK A02;
    public static final char[] A06 = {'>', '+', '~'};
    public static final String[] A03 = {InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, "!=", "^=", "$=", "*=", "~="};
    public static final char[] A07 = {',', ')'};
    public static final Pattern A05 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern A04 = Pattern.compile("([+-])?(\\d+)");

    private int A00() {
        String strTrim = this.A02.A04('(', ')').trim();
        C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
        boolean z = false;
        int length = strTrim.length();
        if (length != 0) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                char cCharAt = strTrim.charAt(i);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i++;
            }
        }
        C10293Gtx.A03(z, "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    public static String A01(String str, GtK gtK) {
        String strA00 = GtK.A00(gtK.A04('(', ')'));
        C10293Gtx.A02(strA00, str.concat("(text) query must not be empty"));
        return strA00;
    }

    public static C9511GMc A02(String str, GtK gtK) {
        String strA04 = gtK.A04('(', ')');
        C10293Gtx.A02(strA04, str.concat("(regex) query must not be empty"));
        return C9511GMc.A00(strA04);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[PHI: r3
  0x008d: PHI (r3v2 int) = (r3v0 int), (r3v5 int) binds: [B:5:0x0022, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.AbstractC10279Gtj A03(boolean r8, boolean r9) throws java.lang.NumberFormatException {
        /*
            r7 = this;
            X.GtK r2 = r7.A02
            r1 = 40
            r0 = 41
            java.lang.String r0 = r2.A04(r1, r0)
            java.lang.String r0 = X.Gu9.A00(r0)
            java.lang.String r7 = r0.trim()
            java.lang.String r0 = "odd"
            boolean r0 = r0.equals(r7)
            r3 = 2
            r2 = 1
            if (r0 != 0) goto L5a
            java.lang.String r0 = "even"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L8d
            java.util.regex.Pattern r0 = X.GtJ.A05
            java.util.regex.Matcher r6 = r0.matcher(r7)
            boolean r0 = r6.matches()
            java.lang.String r5 = ""
            java.lang.String r4 = "^\\+"
            if (r0 == 0) goto L73
            r0 = 3
            java.lang.String r0 = r6.group(r0)
            if (r0 == 0) goto L64
            java.lang.String r0 = r6.group(r2)
            java.lang.String r0 = r0.replaceFirst(r4, r5)
            int r3 = java.lang.Integer.parseInt(r0)
        L47:
            r1 = 4
            java.lang.String r0 = r6.group(r1)
            if (r0 == 0) goto L8d
            java.lang.String r0 = r6.group(r1)
            java.lang.String r0 = r0.replaceFirst(r4, r5)
            int r2 = java.lang.Integer.parseInt(r0)
        L5a:
            if (r9 == 0) goto L95
            if (r8 == 0) goto L8f
            X.Gto r0 = new X.Gto
            r0.<init>(r3, r2)
            return r0
        L64:
            java.lang.String r1 = "-"
            java.lang.String r0 = r6.group(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L71
            r2 = -1
        L71:
            r3 = r2
            goto L47
        L73:
            java.util.regex.Pattern r0 = X.GtJ.A04
            java.util.regex.Matcher r1 = r0.matcher(r7)
            boolean r0 = r1.matches()
            if (r0 == 0) goto La3
            java.lang.String r0 = r1.group()
            java.lang.String r0 = r0.replaceFirst(r4, r5)
            int r2 = java.lang.Integer.parseInt(r0)
            r3 = 0
            goto L5a
        L8d:
            r2 = 0
            goto L5a
        L8f:
            X.GtQ r0 = new X.GtQ
            r0.<init>(r3, r2)
            return r0
        L95:
            if (r8 == 0) goto L9d
            X.GtU r0 = new X.GtU
            r0.<init>(r3, r2)
            return r0
        L9d:
            X.GuG r0 = new X.GuG
            r0.<init>(r3, r2)
            return r0
        La3:
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "Could not parse nth-index '%s': unexpected format"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            org.jsoup.select.Selector$SelectorParseException r0 = new org.jsoup.select.Selector$SelectorParseException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GtJ.A03(boolean, boolean):X.Gtj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Gsg] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.Gsg] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.Gse, X.Gsl] */
    /* JADX WARN: Type inference failed for: r2v9 */
    private final AbstractC10245Gsg A04() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC10245Gsg c10249Gsk;
        GtK gtK = this.A02;
        gtK.A05();
        char[] cArr = A06;
        GtL gtL = gtK.A00;
        ?? c10309GuK = gtL.A0L(cArr) ? new C10309GuK() : A06();
        while (true) {
            char cA05 = gtK.A05() ? ' ' : (char) 0;
            if (!gtL.A0L(cArr)) {
                if (!gtL.A0L(A07)) {
                    break;
                    break;
                }
                break;
            }
            cA05 = gtL.A05();
            if (cA05 == 0) {
                break;
            }
            AbstractC10245Gsg abstractC10245GsgA06 = A06();
            if (cA05 == ' ') {
                c10249Gsk = new C10249Gsk(c10309GuK);
            } else if (cA05 == '+') {
                c10249Gsk = new C10248Gsj(c10309GuK);
            } else if (cA05 == '>') {
                c10309GuK = c10309GuK instanceof Gsl ? (Gsl) c10309GuK : new Gsl(c10309GuK);
                c10309GuK.A01.add(abstractC10245GsgA06);
                c10309GuK.A00 += abstractC10245GsgA06.A00();
                c10309GuK.A00 = abstractC10245GsgA06.A02() | c10309GuK.A00;
            } else {
                if (cA05 != '~') {
                    throw new Selector$SelectorParseException(String.format("Unknown combinator '%s'", Character.valueOf(cA05)));
                }
                c10249Gsk = new C10258Gsx(c10309GuK);
            }
            c10309GuK = A09(c10249Gsk, abstractC10245GsgA06);
        }
        return c10309GuK;
    }

    private final AbstractC10245Gsg A06() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC10245Gsg c10289Gtt;
        GtK gtK = this.A02;
        gtK.A05();
        GtL gtL = gtK.A00;
        if (Character.isLetterOrDigit(gtL.A06()) || gtL.A0K("*|")) {
            char[] cArr = GtK.A01;
            StringBuilder sbA0t = AbstractC7609F5w.A0t();
            while (!gtL.A0F()) {
                char cA06 = gtL.A06();
                if (cA06 != '\\') {
                    if (!Character.isLetterOrDigit(gtL.A06()) && !gtL.A0L(cArr)) {
                        break;
                    }
                    sbA0t.append(cA06);
                    GtK.A01(gtK);
                } else {
                    GtK.A01(gtK);
                    if (gtL.A0F()) {
                        break;
                    }
                    sbA0t.append(gtL.A05());
                }
            }
            String strTrim = Gu9.A00(Gt5.A01(sbA0t)).trim();
            C10293Gtx.A01(strTrim);
            if (strTrim.startsWith("*|")) {
                String strSubstring = strTrim.substring(2);
                c10289Gtt = new C10250Gsn(new C10289Gtt(strSubstring), new C10287Gtr(FGI.A0M(":", strSubstring)));
            } else if (strTrim.endsWith("|*")) {
                c10289Gtt = new C10286Gtq(FGI.A0M(strTrim.substring(0, strTrim.length() - 2), ":"));
            } else {
                if (strTrim.contains("|")) {
                    strTrim = strTrim.replace("|", ":");
                }
                c10289Gtt = new C10289Gtt(strTrim);
            }
        } else {
            c10289Gtt = gtK.A06('*') ? new C10255Gsu() : null;
        }
        while (true) {
            AbstractC10245Gsg abstractC10245GsgA07 = A07();
            if (abstractC10245GsgA07 == null) {
                break;
            }
            c10289Gtt = A09(c10289Gtt, abstractC10245GsgA07);
        }
        if (c10289Gtt != null) {
            return c10289Gtt;
        }
        throw new Selector$SelectorParseException(String.format("Could not parse query '%s': unexpected token at '%s'", this.A01, gtL.A09()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be A[LOOP:2: B:88:0x01b8->B:90:0x01be, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC10245Gsg A07() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GtJ.A07():X.Gsg");
    }

    public static AbstractC10245Gsg A08(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            GtJ gtJ = new GtJ(str);
            try {
                AbstractC10245Gsg abstractC10245GsgA05 = gtJ.A05();
                GtK gtK = gtJ.A02;
                gtK.A05();
                GtL gtL = gtK.A00;
                if (!gtL.A0F()) {
                    throw new Selector$SelectorParseException(String.format("Could not parse query '%s': unexpected token at '%s'", gtJ.A01, gtL.A09()));
                }
                gtJ.close();
                return abstractC10245GsgA05;
            } finally {
            }
        } catch (IllegalArgumentException e) {
            throw new Selector$SelectorParseException(e.getMessage());
        }
    }

    public static AbstractC10245Gsg A09(AbstractC10245Gsg abstractC10245Gsg, AbstractC10245Gsg abstractC10245Gsg2) {
        if (abstractC10245Gsg == null) {
            return abstractC10245Gsg2;
        }
        if (abstractC10245Gsg instanceof C10251Gso) {
            Gsm gsm = (Gsm) abstractC10245Gsg;
            gsm.A03.add(abstractC10245Gsg2);
            gsm.A06();
            return abstractC10245Gsg;
        }
        List listAsList = Arrays.asList(abstractC10245Gsg, abstractC10245Gsg2);
        C10251Gso c10251Gso = new C10251Gso();
        c10251Gso.A03.addAll(listAsList);
        c10251Gso.A06();
        return c10251Gso;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A02.close();
    }

    public final String toString() {
        return this.A01;
    }

    public GtJ(String str) {
        C10293Gtx.A01(str);
        String strTrim = str.trim();
        this.A01 = strTrim;
        this.A02 = new GtK(strTrim);
    }

    private final AbstractC10245Gsg A05() throws IOException {
        AbstractC10245Gsg abstractC10245GsgA04 = A04();
        while (this.A02.A06(',')) {
            AbstractC10245Gsg abstractC10245GsgA042 = A04();
            if (abstractC10245GsgA04 instanceof C10250Gsn) {
                Gsm gsm = (Gsm) abstractC10245GsgA04;
                gsm.A03.add(abstractC10245GsgA042);
                gsm.A06();
            } else {
                abstractC10245GsgA04 = new C10250Gsn(abstractC10245GsgA04, abstractC10245GsgA042);
            }
        }
        return abstractC10245GsgA04;
    }
}
