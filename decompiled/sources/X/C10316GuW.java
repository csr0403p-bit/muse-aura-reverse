package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.ValidationException;

/* renamed from: X.GuW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10316GuW {
    public ArrayList<Gt3> A00;
    public ArrayList<EnumC10321Gub> A01;
    public List<C10325Guf> A02;
    public C10307GuI A03;
    public Gt8 A04;
    public Gt3 A05;
    public C10256Gsv A06;
    public GtL A07;
    public C10332Gum A08;
    public EnumC10321Gub A09;
    public EnumC10321Gub A0A;
    public C10308GuJ A0B;
    public GtC A0C;
    public C10317GuX A0D;
    public C10314GuU A0E;
    public C10313GuT A0F;
    public AbstractC10326Gug A0G;
    public C10318GuY A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final ArrayList<Gt3> A0N;
    public final C10314GuU A0O;
    public static final String[] A0Q = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] A0R = {"desc", "foreignObject", "title"};
    public static final String[] A0P = {BrowserOperationCatalogKt.BUTTON, "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    public C10316GuW() {
        this(0);
    }

    public static final Gt3 A00(String str, C10316GuW c10316GuW, C10313GuT c10313GuT, boolean z) {
        Gt7 gt7 = c10313GuT.A06;
        if (gt7 != null && gt7.A05() != 0) {
            if (!z && !c10316GuW.A0B.A00) {
                for (int i = 0; i < gt7.A00; i++) {
                    String str2 = gt7.A02[i];
                    if (!Gt7.A04(str2)) {
                        gt7.A02[i] = Gu9.A00(str2);
                    }
                }
            }
            C10308GuJ c10308GuJ = c10316GuW.A0B;
            int i2 = gt7.A00;
            int i3 = 0;
            if (i2 != 0) {
                boolean z2 = c10308GuJ.A00;
                int i4 = 0;
                while (i3 < i2) {
                    String str3 = gt7.A02[i3];
                    i3++;
                    int i5 = i3;
                    while (true) {
                        i2 = gt7.A00;
                        if (i5 < i2) {
                            String str4 = gt7.A02[i5];
                            if (z2 ? str3.equals(str4) : str3.equalsIgnoreCase(str4)) {
                                i4++;
                                Gt7.A03(gt7, i5);
                                i5--;
                            }
                            i5++;
                        }
                    }
                }
                if (i4 > 0) {
                    c10316GuW.A0O("Dropped duplicate attribute(s) in tag [%s]", c10313GuT.A05);
                }
            }
            c10313GuT.A0C(z ? C10308GuJ.A03 : c10316GuW.A0B);
        }
        C10322Guc c10322GucA04 = c10316GuW.A0D.A04(c10313GuT.A07.A00(), c10313GuT.A05, str, (z ? C10308GuJ.A03 : c10316GuW.A0B).A01);
        return c10322GucA04.A03.equals("form") ? new C10256Gsv(gt7, c10322GucA04) : new Gt3(null, gt7, c10322GucA04);
    }

    public static final Gt3 A01(Gt3 gt3) {
        String str = Gt3.A03;
        Gt3 gt32 = new Gt3(null, gt3.A0D().clone(), gt3.A02);
        C10261GtF c10261GtFA0L = gt32.A0L();
        if (c10261GtFA0L != null) {
            c10261GtFA0L.A01 = -1;
            c10261GtFA0L.A00 = -1;
        }
        return gt32;
    }

    private void A02() {
        C10332Gum c10332Gum = this.A08;
        Object[] objArrA1W = BV4.A1W();
        if (c10332Gum == null) {
            throw new ValidationException(String.format("Bug: noscript fallback closed with no island state", objArrA1W));
        }
        ArrayList<Gt3> arrayList = this.A0N;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                A0U(this.A0A);
                break;
            }
            Gt3 gt3 = arrayList.get(size);
            Gt3 gt32 = c10332Gum.A00;
            if (gt3 == gt32) {
                if (arrayList.get(C8j3.A0K(arrayList)) != gt32) {
                    A0U(this.A0A);
                }
                while (arrayList.size() > size) {
                    A0A();
                }
            }
        }
        A03();
    }

    private void A03() {
        C10332Gum c10332Gum = this.A08;
        Object[] objArrA1W = BV4.A1W();
        if (c10332Gum == null) {
            throw new ValidationException(String.format("Bug: no noscript island state to restore", objArrA1W));
        }
        this.A08 = null;
        this.A06 = c10332Gum.A01;
    }

    public static void A04(Gt3 gt3, C10316GuW c10316GuW) {
        Gt3 gt3A1E;
        int i = c10316GuW.A0C.A00;
        if (i != Integer.MAX_VALUE) {
            while (c10316GuW.A0N.size() >= i) {
                Gt3 gt3A0A = c10316GuW.A0A();
                if (gt3A0A == c10316GuW.A05) {
                    c10316GuW.A05 = null;
                }
                if (gt3A0A == c10316GuW.A06) {
                    c10316GuW.A06 = null;
                }
                c10316GuW.A0P(gt3A0A);
                if (AbstractC7608F5v.A1X("template", gt3A0A)) {
                    c10316GuW.A0G();
                    if (c10316GuW.A01.size() > 0) {
                        c10316GuW.A0J();
                    }
                    c10316GuW.A0Z();
                } else {
                    C10332Gum c10332Gum = c10316GuW.A08;
                    if (c10332Gum != null && gt3A0A == c10332Gum.A00) {
                        c10316GuW.A03();
                    }
                }
            }
        }
        if (c10316GuW.A06 != null) {
            C10322Guc c10322Guc = gt3.A02;
            if (c10322Guc.A02.equals("http://www.w3.org/1999/xhtml") && Gt5.A09(c10322Guc.A03, A0P)) {
                c10316GuW.A06.A00.add(gt3);
            }
        }
        Gu6 gu6 = c10316GuW.A0C.A01;
        if (gu6.size() < gu6.maxSize && gt3.A0S("xmlns")) {
            String strA0B = gt3.A0B("xmlns");
            C10322Guc c10322Guc2 = gt3.A02;
            if (!strA0B.equals(c10322Guc2.A02)) {
                c10316GuW.A0O("Invalid xmlns attribute [%s] on tag [%s]", gt3.A0B("xmlns"), c10322Guc2.A04);
            }
        }
        ArrayList<Gt3> arrayList = c10316GuW.A0N;
        Gt3 gt3A09 = arrayList.isEmpty() ^ true ? c10316GuW.A09() : c10316GuW.A04;
        if (c10316GuW.A0J && Gt5.A09(gt3A09.A02.A03, AbstractC10319GuZ.A0V)) {
            Gt3 gt3A0B = c10316GuW.A0B("table");
            if (gt3A0B != null) {
                Gt3 gt32 = ((Gt4) gt3A0B).A01;
                if (gt32 != null) {
                    C10293Gtx.A00(gt3);
                    Gt3 gt33 = ((Gt4) gt3).A01;
                    if (gt33 == gt32) {
                        gt33.A0O(gt3);
                    }
                    ((Gt4) gt3A0B).A01.A0Q(new Gt4[]{gt3}, gt3A0B.A05());
                } else {
                    gt3A1E = c10316GuW.A0C(gt3A0B);
                }
            } else {
                gt3A1E = AbstractC7607F5u.A1E(arrayList, 0);
            }
            gt3A1E.A0f(gt3);
        } else {
            gt3A09.A0f(gt3);
        }
        arrayList.add(gt3);
        c10316GuW.A0T(gt3, true);
    }

    public static final void A05(Gt3 gt3, C10316GuW c10316GuW) {
        int size = c10316GuW.A00.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            Gt3 gt3A1E = AbstractC7607F5u.A1E(c10316GuW.A00, i3);
            if (gt3A1E == null) {
                return;
            }
            if (gt3.A02.A03.equals(gt3A1E.A02.A03) && gt3.A0D().equals(gt3A1E.A0D())) {
                i2++;
            }
            if (i2 == 3) {
                c10316GuW.A00.remove(i3);
                return;
            }
        }
    }

    public static void A06(C10316GuW c10316GuW, String... strArr) {
        ArrayList<Gt3> arrayList = c10316GuW.A0N;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Gt3 gt3A1E = AbstractC7607F5u.A1E(arrayList, size);
            if ("http://www.w3.org/1999/xhtml".equals(gt3A1E.A02.A02)) {
                String str = gt3A1E.A02.A03;
                C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return;
                    }
                }
                if (AbstractC7608F5v.A1X("html", gt3A1E)) {
                    return;
                }
            }
            c10316GuW.A0A();
        }
    }

    public static boolean A07(String str, C10316GuW c10316GuW, int i) {
        ArrayList<Gt3> arrayList = c10316GuW.A0N;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Gt3 gt3A1E = AbstractC7607F5u.A1E(arrayList, size);
            C10322Guc c10322Guc = gt3A1E.A02;
            if ("http://www.w3.org/1999/xhtml".equals(c10322Guc.A02) && gt3A1E.A02.A03.equals(str)) {
                return true;
            }
            if ((c10322Guc.A01 & i) != 0) {
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A08(X.Gt3 r6) {
        /*
            X.Guc r2 = r6.A02
            java.lang.String r3 = r2.A02
            java.lang.String r0 = "http://www.w3.org/1998/Math/MathML"
            boolean r0 = r0.equals(r3)
            r5 = 1
            if (r0 == 0) goto L38
            java.lang.String r0 = "annotation-xml"
            boolean r0 = X.AbstractC7608F5v.A1X(r0, r6)
            if (r0 == 0) goto L38
            java.lang.String r0 = "encoding"
            java.lang.String r0 = r6.A0B(r0)
            java.lang.String r0 = X.Gu9.A00(r0)
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = "text/html"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L37
            r0 = 68
            java.lang.String r0 = X.C60N.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L38
        L37:
            return r5
        L38:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L55
            java.lang.String r4 = r2.A04
            java.lang.String[] r3 = X.C10316GuW.A0R
            X.Ekj<java.lang.StringBuilder> r0 = X.Gt5.A03
            r2 = 3
            r1 = 0
        L48:
            r0 = r3[r1]
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L37
            int r1 = r1 + 1
            if (r1 >= r2) goto L55
            goto L48
        L55:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10316GuW.A08(X.Gt3):boolean");
    }

    public final Gt3 A09() {
        ArrayList<Gt3> arrayList = this.A0N;
        return AbstractC7607F5u.A1E(arrayList, C8j3.A0K(arrayList));
    }

    public final Gt3 A0A() {
        ArrayList<Gt3> arrayList = this.A0N;
        Gt3 gt3Remove = arrayList.remove(C8j3.A0K(arrayList));
        A0T(gt3Remove, false);
        return gt3Remove;
    }

    public final Gt3 A0B(String str) {
        ArrayList<Gt3> arrayList = this.A0N;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            Gt3 gt3A1E = AbstractC7607F5u.A1E(arrayList, size);
            C10322Guc c10322Guc = gt3A1E.A02;
            if (c10322Guc.A03.equals(str) && c10322Guc.A02.equals("http://www.w3.org/1999/xhtml")) {
                return gt3A1E;
            }
        }
    }

    public final Gt3 A0C(Gt3 gt3) {
        ArrayList<Gt3> arrayList = this.A0N;
        if (arrayList.contains(gt3)) {
            int size = arrayList.size();
            do {
                size--;
                if (size > 0) {
                }
            } while (arrayList.get(size) != gt3);
            return AbstractC7607F5u.A1E(arrayList, size - 1);
        }
        return null;
    }

    public final Gt3 A0D(C10313GuT c10313GuT) {
        Gt3 gt3A00 = A00("http://www.w3.org/1999/xhtml", this, c10313GuT, false);
        A04(gt3A00, this);
        if (c10313GuT.A09) {
            C10322Guc c10322Guc = gt3A00.A02;
            int i = c10322Guc.A00 | 32;
            c10322Guc.A00 = i;
            if ((i & 2) == 0) {
                if ((i & 1) == 0 || (i & 16) == 0) {
                    C10318GuY c10318GuY = this.A0H;
                    Object[] objArr = {c10322Guc.A03};
                    Gu6 gu6 = c10318GuY.A09;
                    if (gu6.size() < gu6.maxSize) {
                        gu6.add(new Gu3("Tag [%s] cannot be self-closing; not a void tag", c10318GuY.A07, objArr));
                    }
                } else {
                    C10318GuY c10318GuY2 = this.A0H;
                    c10318GuY2.A07(EnumC10327Guh.A0W);
                    C10314GuU c10314GuU = this.A0E;
                    c10314GuU.A03();
                    c10314GuU.A0A(c10322Guc.A04);
                    c10318GuY2.A04(c10314GuU);
                }
            }
        }
        if ((gt3A00.A02.A00 & 2) != 0) {
            A0A();
        }
        return gt3A00;
    }

    public final Gt3 A0E(C10313GuT c10313GuT) {
        Gt3 gt3A00 = A00("http://www.w3.org/1999/xhtml", this, c10313GuT, false);
        A04(gt3A00, this);
        A0A();
        return gt3A00;
    }

    public final C10322Guc A0F(GuS guS) {
        return this.A0D.A04(guS.A07.A00(), guS.A05, "http://www.w3.org/1999/xhtml", this.A0B.A01);
    }

    public final void A0G() {
        ArrayList<Gt3> arrayList;
        int size;
        while (!this.A00.isEmpty() && (size = (arrayList = this.A00).size()) > 0 && arrayList.remove(size - 1) != null) {
        }
    }

    public final void A0H() {
        A06(this, "tbody", "tfoot", "thead", "template");
    }

    public final void A0I() {
        A06(this, "table", "template");
    }

    public final void A0J() {
        ArrayList<EnumC10321Gub> arrayList = this.A01;
        if (arrayList.size() > 0) {
            arrayList.remove(C8j3.A0K(arrayList));
        }
    }

    public final void A0K() {
        Gt3 gt3A1E;
        ArrayList<Gt3> arrayList = this.A00;
        if (arrayList.size() <= 0 || (gt3A1E = AbstractC7607F5u.A1E(arrayList, C8j3.A0K(arrayList))) == null) {
            return;
        }
        ArrayList<Gt3> arrayList2 = this.A0N;
        if (arrayList2.contains(gt3A1E)) {
            return;
        }
        int size = this.A00.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            gt3A1E = AbstractC7607F5u.A1E(this.A00, i3);
            if (gt3A1E == null || arrayList2.contains(gt3A1E)) {
                i3++;
                gt3A1E = AbstractC7607F5u.A1E(this.A00, i3);
                break;
            }
        }
        while (true) {
            C10293Gtx.A00(gt3A1E);
            Gt3 gt3A01 = A01(gt3A1E);
            A04(gt3A01, this);
            this.A00.set(i3, gt3A01);
            if (i3 == i2) {
                return;
            }
            i3++;
            gt3A1E = AbstractC7607F5u.A1E(this.A00, i3);
        }
    }

    public final void A0M(String str) {
        int size = this.A0N.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C10322Guc c10322Guc = A0A().A02;
            if (c10322Guc.A03.equals(str) && c10322Guc.A02.equals("http://www.w3.org/1999/xhtml")) {
                return;
            }
        }
    }

    public final void A0N(String str) {
        C10313GuT c10313GuT = this.A0F;
        if (this.A0G == c10313GuT) {
            c10313GuT = new C10313GuT(C79.A01, this);
        } else {
            c10313GuT.A03();
        }
        c10313GuT.A0A(str);
        A0d(c10313GuT);
    }

    public final void A0O(String str, Object... objArr) {
        Gu6 gu6 = this.A0C.A01;
        if (gu6.size() < gu6.maxSize) {
            gu6.add(new Gu3(str, this.A07, objArr));
        }
    }

    public final void A0P(Gt3 gt3) {
        ArrayList<Gt3> arrayList = this.A00;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (arrayList.get(size) != gt3);
        arrayList.remove(size);
    }

    public final void A0Q(Gt3 gt3) {
        ArrayList<Gt3> arrayList = this.A0N;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == gt3) {
                arrayList.remove(size);
                A0T(gt3, false);
                return;
            }
        }
    }

    public final void A0R(Gt3 gt3, C10325Guf c10325Guf) {
        GtD c10262GtH;
        String strA00 = c10325Guf.A00.A00();
        if (c10325Guf instanceof C10330Guk) {
            c10262GtH = new C10285Gtp();
            C10293Gtx.A00(strA00);
            c10262GtH.A00 = strA00;
        } else if ((256 & gt3.A02.A00) != 0) {
            c10262GtH = new C10292Gtw();
            C10293Gtx.A00(strA00);
            c10262GtH.A00 = strA00;
        } else {
            c10262GtH = new C10262GtH();
            C10293Gtx.A00(strA00);
            c10262GtH.A00 = strA00;
        }
        gt3.A0f(c10262GtH);
        A0T(c10262GtH, true);
    }

    public final void A0S(Gt3 gt3, C10324Gue c10324Gue) {
        String strA00 = c10324Gue.A00.A00();
        C10283Gtn c10283Gtn = new C10283Gtn();
        C10293Gtx.A00(strA00);
        ((GtD) c10283Gtn).A00 = strA00;
        gt3.A0f(c10283Gtn);
        A0T(c10283Gtn, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (r1.A02.A03.equals(((X.GuS) r6).A05) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        if (r2.A03.equals(((X.GuS) r6).A05) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0T(X.Gt4 r9, boolean r10) {
        /*
            r8 = this;
            boolean r0 = r8.A0M
            if (r0 == 0) goto L1f
            if (r10 == 0) goto L20
            X.GtF r1 = r9.A0L()
            if (r1 == 0) goto L2f
            int r3 = r1.A03
            int r2 = r1.A02
        L10:
            r0 = -1
            if (r3 == r0) goto L2f
            X.GuI r0 = r1.A04
            X.GtN r1 = new X.GtN
            r1.<init>(r0, r3, r2)
        L1a:
            int r1 = r1.A01
            r0 = -1
            if (r1 == r0) goto L32
        L1f:
            return
        L20:
            boolean r0 = r9 instanceof X.Gt3
            if (r0 == 0) goto L32
            X.GtF r1 = r9.A0L()
            if (r1 == 0) goto L2f
            int r3 = r1.A01
            int r2 = r1.A00
            goto L10
        L2f:
            X.GtN r1 = X.C10263GtN.A05
            goto L1a
        L32:
            X.Gug r6 = r8.A0G
            int r4 = r6.A01
            int r3 = r6.A00
            boolean r5 = r9 instanceof X.Gt3
            if (r5 == 0) goto L4c
            r1 = r9
            X.Gt3 r1 = (X.Gt3) r1
            java.lang.Integer r7 = r6.A02
            java.lang.Integer r0 = X.C79.A0W
            if (r7 != r0) goto L61
            X.GtL r0 = r8.A07
            int r4 = r0.A07()
        L4b:
            r3 = r4
        L4c:
            if (r10 != 0) goto L9b
            if (r5 == 0) goto L1f
        L50:
            X.GuI r1 = r8.A03
            X.C10293Gtx.A00(r9)
            X.GtF r0 = r9.A0K()
            X.C10261GtF.A00(r1, r0)
            r0.A01 = r4
            r0.A00 = r3
            return
        L61:
            if (r10 == 0) goto L7a
            java.lang.Integer r0 = X.C79.A01
            boolean r0 = X.AnonymousClass002.A1Z(r7, r0)
            if (r0 == 0) goto L4b
            X.Guc r0 = r1.A02
            java.lang.String r1 = r0.A03
            X.GuS r6 = (X.GuS) r6
            java.lang.String r0 = r6.A05
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L9b
            goto L4b
        L7a:
            X.Guc r2 = r1.A02
            int r1 = r2.A00
            r0 = r1 & 2
            if (r0 != 0) goto L50
            r0 = r1 & 16
            if (r0 != 0) goto L50
            java.lang.Integer r0 = X.C79.A0C
            boolean r0 = X.AnonymousClass002.A1Z(r7, r0)
            if (r0 == 0) goto L4b
            java.lang.String r1 = r2.A03
            X.GuS r6 = (X.GuS) r6
            java.lang.String r0 = r6.A05
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L50
            goto L4b
        L9b:
            X.GuI r1 = r8.A03
            X.C10293Gtx.A00(r9)
            X.GtF r0 = r9.A0K()
            X.C10261GtF.A00(r1, r0)
            r0.A03 = r4
            r0.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10316GuW.A0T(X.Gt4, boolean):void");
    }

    public final void A0U(EnumC10321Gub enumC10321Gub) {
        Gu6 gu6 = this.A0C.A01;
        if (gu6.size() < gu6.maxSize) {
            GtL gtL = this.A07;
            AbstractC10326Gug abstractC10326Gug = this.A0G;
            gu6.add(new Gu3("Unexpected %s token [%s] when in state [%s]", gtL, C3cI.A0Y(abstractC10326Gug), abstractC10326Gug, enumC10321Gub));
        }
    }

    public final void A0V(C10325Guf c10325Guf, boolean z) {
        C10312GuO c10312GuO = c10325Guf.A00;
        String strA00 = c10312GuO.A00();
        if (strA00.indexOf(0) != -1) {
            String strReplace = z ? strA00.replace((char) 0, '\ufffd') : strA00.replace(C10325Guf.A01, "");
            c10312GuO.A01();
            c10312GuO.A00 = strReplace;
        }
        A0R(AbstractC7608F5v.A1Z(this) ? A09() : this.A04, c10325Guf);
    }

    public final void A0Y(boolean z) {
        int i = z ? 64 : 32;
        while (AbstractC7608F5v.A1Z(this) && (A09().A02.A01 & i) != 0) {
            A0A();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[LOOP:0: B:6:0x0014->B:16:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0Z() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10316GuW.A0Z():boolean");
    }

    public final boolean A0a(String str) {
        ArrayList<Gt3> arrayList = this.A0N;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Gt3 gt3A1E = AbstractC7607F5u.A1E(arrayList, size);
            if (gt3A1E.A02.A03.equals(str)) {
                return true;
            }
            if ((gt3A1E.A02.A01 & 16) == 0) {
                break;
            }
        }
        return false;
    }

    public final boolean A0b(String str) {
        AbstractC10326Gug abstractC10326Gug = this.A0G;
        C10314GuU c10314GuU = this.A0O;
        if (abstractC10326Gug == c10314GuU) {
            c10314GuU = new C10314GuU(C79.A0C, this);
        } else {
            c10314GuU.A03();
        }
        c10314GuU.A0A(str);
        return A0d(c10314GuU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (X.Gt5.A08(r8.A00.A00()) == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0d(X.AbstractC10326Gug r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10316GuW.A0d(X.Gug):boolean");
    }

    public final boolean A0e(String[] strArr) {
        ArrayList<Gt3> arrayList = this.A0N;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!Gt5.A09(AbstractC7607F5u.A1E(arrayList, size).A02.A03, strArr)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TreeBuilder{currentToken=");
        sbA0x.append(this.A0G);
        sbA0x.append(", state=");
        sbA0x.append(this.A0A);
        sbA0x.append(", currentElement=");
        sbA0x.append(AbstractC7608F5v.A1Z(this) ? A09() : "none");
        return C8j3.A15(sbA0x);
    }

    public final void A0L(String str) {
        while (AbstractC7608F5v.A1Z(this) && (A09().A02.A01 & 32) != 0) {
            if (str != null && A0c(str, "http://www.w3.org/1999/xhtml")) {
                return;
            } else {
                A0A();
            }
        }
    }

    public final void A0W(C10324Gue c10324Gue) {
        A0S(AbstractC7608F5v.A1Z(this) ? A09() : this.A04, c10324Gue);
    }

    public final void A0X(C10313GuT c10313GuT) {
        this.A08 = new C10332Gum(A0D(c10313GuT), this.A06);
        this.A06 = null;
    }

    public final boolean A0c(String str, String str2) {
        if (!AbstractC7608F5v.A1Z(this)) {
            return false;
        }
        C10322Guc c10322Guc = A09().A02;
        return c10322Guc.A03.equals(str) && c10322Guc.A02.equals(str2);
    }

    public C10316GuW(int i) {
        this.A0N = C3cG.A0h();
        this.A0O = new C10314GuU(C79.A0C, this);
    }
}
