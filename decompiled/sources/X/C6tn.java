package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.6tn, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6tn extends BMv {
    public static String A01(String str) {
        C7384Etj.A0Y(str, 0);
        return C7BY.A0a(str, '/');
    }

    public static final String A07(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return A6B.A01(PairsDiscretionDocument.TERMINATOR, new C7AG(new C8iK(str2, 1), new C8iN(str, 1)));
    }

    public static Double A00(JsonPrimitive jsonPrimitive) {
        C9iZ c9iZ = C9oY.A00;
        return C9tJ.A0v(jsonPrimitive.A00());
    }

    public static String A02(String str) {
        return BQG.A17(str, 8);
    }

    public static String A03(String str) {
        return BQG.A17(str, 200);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String A04(String str) {
        Object objInvoke;
        if (C7BY.A0j("|")) {
            throw C60O.A0i("marginPrefix must be non-blank string.");
        }
        C7384Etj.A0Y(str, 0);
        List listA02 = A6B.A02(new C8iN(str, 1));
        int length = str.length();
        int length2 = "".length();
        int size = length + (listA02.size() * length2);
        C8i1 c8i1 = new C8i1(length2 == 0 ? 7 : 8);
        int iA00 = C60O.A00(listA02);
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        for (Object obj : listA02) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iA00) || !C7BY.A0j(str2)) {
                int length3 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    if (C7LE.A01(str2, i3)) {
                        i3++;
                    } else if (i3 != -1 && str2.startsWith("|", i3) && (objInvoke = c8i1.invoke(str2.substring(i3 + "|".length()))) != 0) {
                        str2 = objInvoke;
                    }
                }
                arrayListA0h.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(size);
        AbstractC0878AGe.A0i(sb, PairsDiscretionDocument.TERMINATOR, "", "", arrayListA0h, null);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A05(java.lang.String r13) {
        /*
            java.lang.String r10 = ""
            r0 = 0
            X.C7384Etj.A0Y(r13, r0)
            r1 = 1
            X.8iN r0 = new X.8iN
            r0.<init>(r13, r1)
            java.util.List r9 = X.A6B.A02(r0)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r9.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass006.A1F(r0, r1, r3)
            goto L18
        L29:
            java.util.ArrayList r6 = X.AnonymousClass003.A0i(r3)
            java.util.Iterator r5 = r3.iterator()
        L31:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L53
            java.lang.String r4 = X.AnonymousClass005.A0j(r5)
            int r3 = r4.length()
            r2 = 0
        L40:
            r1 = -1
            if (r2 >= r3) goto L4b
            boolean r0 = X.C7LE.A01(r4, r2)
            if (r0 != 0) goto L50
            if (r2 != r1) goto L4c
        L4b:
            r2 = r3
        L4c:
            X.C60Q.A1P(r6, r2)
            goto L31
        L50:
            int r2 = r2 + 1
            goto L40
        L53:
            java.lang.Comparable r0 = X.AbstractC0878AGe.A09(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            r8 = 0
            if (r0 == 0) goto Lbc
            int r7 = r0.intValue()
        L60:
            int r6 = r13.length()
            int r1 = r10.length()
            int r0 = r9.size()
            int r0 = r0 * r1
            int r6 = r6 + r0
            r0 = 8
            if (r1 != 0) goto L73
            r0 = 7
        L73:
            X.8i1 r5 = new X.8i1
            r5.<init>(r0)
            int r4 = X.C60O.A00(r9)
            java.util.ArrayList r12 = X.C3cG.A0h()
            java.util.Iterator r3 = r9.iterator()
        L84:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r2 = r3.next()
            int r1 = r8 + 1
            if (r8 >= 0) goto L9a
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L9a:
            java.lang.String r2 = (java.lang.String) r2
            if (r8 == 0) goto La0
            if (r8 != r4) goto La8
        La0:
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 == 0) goto La8
        La6:
            r8 = r1
            goto L84
        La8:
            java.lang.String r0 = X.BQG.A16(r2, r7)
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r5.invoke(r0)
            if (r0 == 0) goto Lb9
            r2 = r0
        Lb5:
            r12.add(r2)
            goto La6
        Lb9:
            if (r2 == 0) goto La6
            goto Lb5
        Lbc:
            r7 = 0
            goto L60
        Lbe:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r9 = "\n"
            r13 = 0
            r11 = r10
            X.AbstractC0878AGe.A0i(r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = r8.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6tn.A05(java.lang.String):java.lang.String");
    }

    public static String A06(String str, String str2) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(str, str2);
        C7384Etj.A0U(strEncode);
        return AbstractC2159Azp.A0z(strEncode, "+", "%20");
    }
}
