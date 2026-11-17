package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.ValidationException;

/* loaded from: classes6.dex */
public abstract class Gt4 implements Cloneable {
    public static final List<Gt4> A02 = Collections.EMPTY_LIST;
    public int A00;
    public Gt3 A01;

    @Override // 
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public Gt4 clone() {
        Gt4 gt4A0J = A0J(null);
        LinkedList linkedListA0y = BV4.A0y();
        linkedListA0y.add(gt4A0J);
        while (!linkedListA0y.isEmpty()) {
            Gt4 gt4 = (Gt4) linkedListA0y.remove();
            int iA04 = gt4.A04();
            for (int i = 0; i < iA04; i++) {
                List<Gt4> listA0C = gt4.A0C();
                Gt4 gt4A0J2 = listA0C.get(i).A0J(gt4);
                listA0C.set(i, gt4A0J2);
                linkedListA0y.add(gt4A0J2);
            }
        }
        return gt4A0J;
    }

    public void A0M(String str, String str2) {
        C10308GuJ c10308GuJ;
        Gt4 gt4 = this;
        while (true) {
            if (gt4 == null) {
                break;
            }
            if (gt4 instanceof Gt8) {
                Gt8 gt8 = (Gt8) gt4;
                if (gt8 != null) {
                    c10308GuJ = gt8.A02.A02;
                }
            } else {
                gt4 = gt4.A01;
            }
        }
        c10308GuJ = C10308GuJ.A02;
        String strTrim = str.trim();
        if (!c10308GuJ.A00) {
            strTrim = AnonymousClass001.A0u(strTrim);
        }
        Gt7 gt7A0D = A0D();
        int iA00 = Gt7.A00(strTrim, gt7A0D);
        if (iA00 == -1) {
            Gt7.A02(str2, strTrim, gt7A0D);
            return;
        }
        gt7A0D.A01[iA00] = str2;
        String[] strArr = gt7A0D.A02;
        if (strArr[iA00].equals(strTrim)) {
            return;
        }
        strArr[iA00] = strTrim;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q(X.Gt4[] r8, int r9) {
        /*
            r7 = this;
            r2 = 1
            r5 = 0
            r0 = r8[r5]
            java.lang.String r1 = "Array must not contain any null objects"
            if (r0 == 0) goto L78
            A03(r7, r0)
            java.util.List r6 = r7.A0C()
            X.Gt3 r7 = (X.Gt3) r7
            r0 = r8[r5]
            X.Gt3 r4 = r0.A01
            if (r4 == 0) goto L61
            int r0 = r4.A04()
            if (r0 != r2) goto L61
            java.util.List r3 = r4.A0C()
            r0 = 1
        L22:
            int r2 = r2 + (-1)
            if (r0 <= 0) goto L30
            r1 = r8[r2]
            java.lang.Object r0 = r3.get(r2)
            if (r1 != r0) goto L61
            r0 = r2
            goto L22
        L30:
            X.Gty r4 = r4.A01
            int r3 = r4.size()
            r2 = 0
        L37:
            if (r2 >= r3) goto L45
            java.lang.Object r1 = r4.get(r2)
            X.Gt4 r1 = (X.Gt4) r1
            r0 = 0
            r1.A01 = r0
            int r2 = r2 + 1
            goto L37
        L45:
            r4.clear()
            java.util.List r0 = java.util.Arrays.asList(r8)
            r6.addAll(r9, r0)
            r0 = 1
        L50:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L73
            r1 = r8[r2]
            X.Gt3 r0 = r1.A01
            if (r0 == 0) goto L5d
            r0.A0O(r1)
        L5d:
            r1.A01 = r7
            r0 = r2
            goto L50
        L61:
            r1 = r8[r5]
            X.Gt3 r0 = r1.A01
            if (r0 == 0) goto L6a
            r0.A0O(r1)
        L6a:
            r1.A01 = r7
            java.util.List r0 = java.util.Arrays.asList(r8)
            r6.addAll(r9, r0)
        L73:
            X.Gty r0 = r7.A01
            r0.validChildren = r5
            return
        L78:
            org.jsoup.helper.ValidationException r0 = new org.jsoup.helper.ValidationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gt4.A0Q(X.Gt4[], int):void");
    }

    private final boolean A0R() {
        return this instanceof GtD ? ((GtD) this).A00 instanceof Gt7 : AnonymousClass002.A1X(((Gt3) this).A00);
    }

    public final int A04() {
        if (this instanceof GtD) {
            return 0;
        }
        return ((Gt3) this).A01.size();
    }

    public final int A05() {
        Gt3 gt3 = this.A01;
        if (gt3 != null) {
            C10294Gty c10294Gty = gt3.A01;
            if (!c10294Gty.validChildren) {
                int size = c10294Gty.size();
                for (int i = 0; i < size; i++) {
                    c10294Gty.get(i).A00 = i;
                }
                c10294Gty.validChildren = true;
            }
        }
        return this.A00;
    }

    public final String A06() {
        if (this instanceof GtD) {
            Gt3 gt3 = this.A01;
            return gt3 != null ? gt3.A06() : "";
        }
        String str = Gt3.A03;
        for (Gt3 gt32 = (Gt3) this; gt32 != null; gt32 = ((Gt4) gt32).A01) {
            Gt7 gt7 = gt32.A00;
            if (gt7 != null && gt7.A06(str) != -1) {
                String strA08 = gt32.A00.A08(str);
                return strA08 != null ? strA08 : "";
            }
        }
        return "";
    }

    public final String A07() {
        if (!(this instanceof Gt3)) {
            return this instanceof GtG ? "#doctype" : this instanceof C10292Gtw ? "#data" : this instanceof C10283Gtn ? "#comment" : ((C10262GtH) this) instanceof C10285Gtp ? "#cdata" : "#text";
        }
        Gt3 gt3 = (Gt3) this;
        return gt3 instanceof Gt8 ? "#document" : gt3.A02.A04;
    }

    public final String A08() {
        return this instanceof GtD ? ((GtD) this).A0T() : ((Gt3) this).A0X();
    }

    public final List<Gt4> A0C() {
        if (this instanceof GtD) {
            return A02;
        }
        Gt3 gt3 = (Gt3) this;
        C10294Gty c10294Gty = gt3.A01;
        if (c10294Gty != Gt3.A04) {
            return c10294Gty;
        }
        C10294Gty c10294Gty2 = new C10294Gty(4);
        c10294Gty2.validChildren = true;
        gt3.A01 = c10294Gty2;
        return c10294Gty2;
    }

    public final Gt7 A0D() {
        if (this instanceof GtD) {
            GtD gtD = (GtD) this;
            GtD.A00(gtD);
            return (Gt7) gtD.A00;
        }
        Gt3 gt3 = (Gt3) this;
        Gt7 gt7 = gt3.A00;
        if (gt7 != null) {
            return gt7;
        }
        Gt7 gt72 = new Gt7();
        gt3.A00 = gt72;
        return gt72;
    }

    public final Gt4 A0H() {
        Gt3 gt3 = this.A01;
        if (gt3 == null) {
            return null;
        }
        List<Gt4> listA0C = gt3.A0C();
        int iA05 = A05() + 1;
        if (listA0C.size() > iA05) {
            return listA0C.get(iA05);
        }
        return null;
    }

    public final Gt4 A0I() {
        Gt3 gt3 = this.A01;
        if (gt3 == null || A05() <= 0) {
            return null;
        }
        return gt3.A0C().get(this.A00 - 1);
    }

    public final C10261GtF A0K() {
        C10306GuH c10306GuH;
        if (!(this instanceof GtD)) {
            return Gt7.A01(A0D());
        }
        GtD gtD = (GtD) this;
        Object obj = gtD.A00;
        if (obj instanceof C10306GuH) {
            c10306GuH = (C10306GuH) obj;
        } else {
            if (obj instanceof Gt7) {
                return Gt7.A01((Gt7) obj);
            }
            c10306GuH = new C10306GuH((String) obj, new C10261GtF());
            gtD.A00 = c10306GuH;
        }
        return c10306GuH.A01;
    }

    public final void A0N(Hy9 hy9, C10532Hqa c10532Hqa) {
        String strA0T;
        char c;
        if (this instanceof Gt3) {
            Gt3 gt3 = (Gt3) this;
            if (gt3 instanceof C10303GuE) {
                return;
            }
            C10322Guc c10322Guc = gt3.A02;
            String str = c10322Guc.A04;
            hy9.A01('<');
            hy9.A02(str);
            Gt7 gt7 = gt3.A00;
            if (gt7 != null) {
                gt7.A0F(hy9, c10532Hqa);
            }
            c = '>';
            if (gt3.A01.isEmpty()) {
                if (!c10322Guc.A02.equals("http://www.w3.org/1999/xhtml")) {
                    int i = c10322Guc.A00;
                    if ((i & 32) != 0 || ((i & 1) != 0 && ((i & 2) != 0 || (i & 16) != 0))) {
                        strA0T = " />";
                        hy9.A02(strA0T);
                        return;
                    }
                } else if ((c10322Guc.A00 & 2) == 0) {
                }
                hy9.A02("></");
                hy9.A02(str);
            }
            hy9.A01(c);
        }
        if (!(this instanceof GtG)) {
            if (this instanceof C10292Gtw) {
                strA0T = ((GtD) this).A0T();
            } else if (this instanceof C10283Gtn) {
                hy9.A02("<!--");
                hy9.A02(((GtD) this).A0T());
                strA0T = "-->";
            } else {
                C10262GtH c10262GtH = (C10262GtH) this;
                if (!(c10262GtH instanceof C10285Gtp)) {
                    HuP.A00(c10262GtH.A0T(), hy9, c10532Hqa, 1);
                    return;
                } else {
                    hy9.A02("<![CDATA[");
                    hy9.A02(c10262GtH.A0T());
                    strA0T = "]]>";
                }
            }
            hy9.A02(strA0T);
            return;
        }
        hy9.A02((AbstractC7609F5w.A1X("publicId", this) || AbstractC7609F5w.A1X("systemId", this)) ? "<!DOCTYPE" : "<!doctype");
        if (AbstractC7609F5w.A1X("name", this)) {
            hy9.A02(InviteCodeScratcherKt.CODE_SEPARATOR);
            hy9.A02(A0B("name"));
        }
        if (AbstractC7609F5w.A1X("pubSysKey", this)) {
            hy9.A02(InviteCodeScratcherKt.CODE_SEPARATOR);
            hy9.A02(A0B("pubSysKey"));
        }
        if (AbstractC7609F5w.A1X("publicId", this)) {
            hy9.A02(" \"");
            hy9.A02(A0B("publicId"));
            hy9.A01('\"');
        }
        if (AbstractC7609F5w.A1X("systemId", this)) {
            String strA0B = A0B("systemId");
            char c2 = strA0B.indexOf(34) >= 0 ? '\'' : '\"';
            hy9.A01(' ');
            hy9.A01(c2);
            hy9.A02(strA0B);
            hy9.A01(c2);
        }
        if (A0D().A06("/doctypeInternalSubset") != -1) {
            hy9.A02(" [");
            hy9.A02(A0B("/doctypeInternalSubset"));
            hy9.A01(']');
        }
        c = '>';
        hy9.A01(c);
    }

    public void A0O(Gt4 gt4) {
        if (gt4.A01 != this) {
            throw new ValidationException("Must be true");
        }
        Gt3 gt3 = (Gt3) this;
        boolean z = gt3.A01.validChildren;
        List<Gt4> listA0C = A0C();
        if (z) {
            listA0C.remove(gt4.A00);
        } else {
            listA0C.remove(gt4);
        }
        gt3.A01.validChildren = false;
        gt4.A01 = null;
    }

    public static void A03(Gt4 gt4, Gt4 gt42) {
        if (AnonymousClass002.A1Z(gt42, gt4)) {
            throw new ValidationException("Cannot add a node here because it would create a cycle.");
        }
        if (gt42.A04() != 0) {
            for (Gt3 gt3 = gt4.A01; gt3 != null; gt3 = ((Gt4) gt3).A01) {
                if (gt3 == gt42) {
                    throw new ValidationException("Cannot add a node here because it would create a cycle.");
                }
            }
        }
    }

    public final String A09() {
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        Hy9 hy9A00 = Hy9.A00(sbA0t);
        if (this instanceof Gt8) {
            ((Gt3) this).A0e(hy9A00);
        } else {
            C10532Hqa c10532HqaA01 = Gt2.A01(this);
            (c10532HqaA01.A02 ? new GtB(hy9A00, c10532HqaA01, this) : new Gt9(hy9A00, c10532HqaA01, this)).A02(this);
        }
        return Gt5.A01(sbA0t);
    }

    public String A0A(String str) {
        C10293Gtx.A01(str);
        if (!A0R() || !AnonymousClass002.A1P(Gt7.A00(str, A0D()), -1)) {
            return "";
        }
        String strA06 = A06();
        String strA09 = A0D().A09(str);
        Pattern pattern = Gt5.A00;
        String strReplaceAll = pattern.matcher(strA06).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strA09).replaceAll("");
        try {
            try {
                URL url = new URL(strReplaceAll);
                String strReplaceAll3 = pattern.matcher(strReplaceAll2).replaceAll("");
                if (strReplaceAll3.startsWith(HatchOpenGraphRepository.UNKNOWN_HOST)) {
                    strReplaceAll3 = FGI.A0M(url.getPath(), strReplaceAll3);
                }
                URL url2 = new URL(url, strReplaceAll3);
                String strReplaceFirst = Gt5.A01.matcher(url2.getFile()).replaceFirst(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
                if (url2.getRef() != null) {
                    strReplaceFirst = FGI.A0U(strReplaceFirst, "#", url2.getRef());
                }
                URL url3 = new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
                Gt5.A04(url3);
                strReplaceAll2 = url3.toExternalForm();
                return strReplaceAll2;
            } catch (MalformedURLException unused) {
                if (Gt5.A02.matcher(strReplaceAll2).find()) {
                    int iIndexOf = strReplaceAll2.indexOf(58);
                    boolean z = false;
                    if (iIndexOf > 0) {
                        String strSubstring = strReplaceAll2.substring(0, iIndexOf);
                        if (strSubstring.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP) || strSubstring.equalsIgnoreCase("https")) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return strReplaceAll2;
                    }
                }
                return "";
            }
        } catch (MalformedURLException unused2) {
            URL url4 = new URL(strReplaceAll2);
            Gt5.A04(url4);
            strReplaceAll2 = url4.toExternalForm();
            return strReplaceAll2;
        }
    }

    public String A0B(String str) {
        C10293Gtx.A00(str);
        if (A0R()) {
            String strA09 = A0D().A09(str);
            if (strA09.length() > 0) {
                return strA09;
            }
            if (str.startsWith("abs:")) {
                return A0A(str.substring(4));
            }
        }
        return "";
    }

    public final Gt3 A0E() {
        do {
            this = this.A0H();
            if (this == null) {
                return null;
            }
        } while (!(this instanceof Gt3));
        return (Gt3) this;
    }

    public final Gt4 A0G() {
        if (A04() == 0) {
            return null;
        }
        return (Gt4) C8j4.A0p(A0C());
    }

    public Gt4 A0J(Gt4 gt4) {
        try {
            Gt4 gt42 = (Gt4) super.clone();
            gt42.A01 = (Gt3) gt4;
            gt42.A00 = gt4 == null ? 0 : A05();
            if (gt4 == null && !(this instanceof Gt8)) {
                while (true) {
                    if (!(this instanceof Gt8)) {
                        this = this.A01;
                        if (this == null) {
                            break;
                        }
                    } else {
                        Gt8 gt8 = (Gt8) this;
                        if (gt8 != null) {
                            Gt8 gt82 = new Gt8(((Gt3) gt8).A02.A02, gt8.A06(), gt8.A02);
                            Gt7 gt7 = ((Gt3) gt8).A00;
                            if (gt7 != null) {
                                ((Gt3) gt82).A00 = gt7.clone();
                            }
                            gt82.A01 = gt8.A01.clone();
                            gt42.A01 = gt82;
                            gt82.A0C().add(gt42);
                        }
                    }
                }
            }
            return gt42;
        } catch (CloneNotSupportedException e) {
            throw BV4.A0e(e);
        }
    }

    public C10261GtF A0L() {
        if (A0R()) {
            return A0D().A0D();
        }
        return null;
    }

    public final void A0P(Gt4 gt4) {
        C10293Gtx.A00(gt4);
        Gt3 gt3 = this.A01;
        if (gt3 == null) {
            gt3 = gt4.A01;
            this.A01 = gt3;
        }
        C10293Gtx.A00(gt3);
        C10293Gtx.A00(gt4);
        if (this != gt4) {
            A03(gt3, gt4);
            Gt3 gt32 = gt4.A01;
            if (gt32 != null) {
                gt32.A0O(gt4);
            }
            gt4.A01 = gt3;
            int iA05 = A05();
            gt3.A0C().set(iA05, gt4);
            gt4.A00 = iA05;
            this.A01 = null;
            gt3.A01.A01();
        }
    }

    public final boolean A0S(String str) {
        C10293Gtx.A00(str);
        if (!A0R()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (Gt7.A00(strSubstring, A0D()) != -1 && !A0A(strSubstring).isEmpty()) {
                return true;
            }
        }
        return AnonymousClass002.A1P(Gt7.A00(str, A0D()), -1);
    }

    public final boolean equals(Object obj) {
        return AnonymousClass002.A1Z(this, obj);
    }

    public final String toString() {
        return A09();
    }
}
