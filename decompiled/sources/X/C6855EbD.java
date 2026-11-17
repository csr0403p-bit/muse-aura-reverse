package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EbD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6855EbD {
    public String A01;
    public String A04;
    public String A05;
    public List<String> A06;
    public final List<String> A07;
    public String A03 = "";
    public String A02 = "";
    public int A00 = -1;

    public final C6854EbC A00() {
        String str = this.A05;
        if (str == null) {
            throw C3cG.A0Q("scheme == null");
        }
        ArrayList arrayList = null;
        String str2 = this.A03;
        String strA01 = C6854EbC.A01(str2, 0, str2.length(), false);
        String str3 = this.A02;
        String strA012 = C6854EbC.A01(str3, 0, str3.length(), false);
        String str4 = this.A04;
        if (str4 == null) {
            throw C3cG.A0Q("host == null");
        }
        int iA00 = this.A00;
        if (iA00 == -1) {
            String str5 = this.A05;
            C7384Etj.A0X(str5);
            iA00 = C6854EbC.A00(str5);
        }
        List<String> list = this.A07;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (String str6 : list) {
            arrayListA0m.add(C6854EbC.A01(str6, 0, str6.length(), false));
        }
        List<String> list2 = this.A06;
        if (list2 != null) {
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                arrayListA0m2.add(next == null ? null : C6854EbC.A01(next, 0, next.length(), true));
            }
            arrayList = arrayListA0m2;
        }
        String str7 = this.A01;
        return new C6854EbC(str, strA01, strA012, str4, str7 != null ? C6854EbC.A01(str7, 0, str7.length(), false) : null, toString(), arrayListA0m, arrayList, iA00);
    }

    /* JADX WARN: Removed duplicated region for block: B:252:? A[LOOP:5: B:156:0x026b->B:252:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[EDGE_INSN: B:232:0x0057->B:26:0x0057 BREAK  A[LOOP:1: B:45:0x00a7->B:50:0x00b5], EDGE_INSN: B:233:0x0057->B:26:0x0057 BREAK  A[LOOP:1: B:45:0x00a7->B:50:0x00b5], EDGE_INSN: B:235:0x0057->B:26:0x0057 BREAK  A[LOOP:1: B:45:0x00a7->B:50:0x00b5]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.String r23, X.C6854EbC r24) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6855EbD.A01(java.lang.String, X.EbC):void");
    }

    public C6855EbD() {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A07 = arrayListA0h;
        arrayListA0h.add("");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r7 = X.C60O.A0w()
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L8d
            r7.append(r0)
            java.lang.String r0 = "://"
        Ld:
            r7.append(r0)
            java.lang.String r1 = r9.A03
            int r0 = r1.length()
            r2 = 58
            if (r0 > 0) goto L22
            java.lang.String r0 = r9.A02
            int r0 = r0.length()
            if (r0 <= 0) goto L38
        L22:
            r7.append(r1)
            java.lang.String r1 = r9.A02
            int r0 = r1.length()
            if (r0 <= 0) goto L33
            r7.append(r2)
            r7.append(r1)
        L33:
            r0 = 64
            r7.append(r0)
        L38:
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L51
            boolean r0 = X.C7BY.A0k(r0, r2)
            if (r0 == 0) goto L87
            r0 = 91
            r7.append(r0)
            java.lang.String r0 = r9.A04
            r7.append(r0)
            r0 = 93
            r7.append(r0)
        L51:
            int r1 = r9.A00
            r0 = -1
            if (r1 != r0) goto L5e
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L6e
            int r1 = X.C6854EbC.A00(r0)
        L5e:
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L68
            int r0 = X.C6854EbC.A00(r0)
            if (r1 == r0) goto L6e
        L68:
            r7.append(r2)
            r7.append(r1)
        L6e:
            java.util.List<java.lang.String> r4 = r9.A07
            int r3 = r4.size()
            r2 = 0
        L75:
            if (r2 >= r3) goto L91
            int r1 = r2 + 1
            r0 = 47
            r7.append(r0)
            java.lang.String r0 = X.C60Q.A0n(r4, r2)
            r7.append(r0)
            r2 = r1
            goto L75
        L87:
            java.lang.String r0 = r9.A04
            r7.append(r0)
            goto L51
        L8d:
            java.lang.String r0 = "//"
            goto Ld
        L91:
            java.util.List<java.lang.String> r8 = r9.A06
            if (r8 == 0) goto Lb2
            r0 = 63
            r7.append(r0)
            r1 = 0
            int r0 = r8.size()
            X.ADq r1 = X.ATD.A0C(r1, r0)
            r0 = 2
            X.AJv r0 = X.ATD.A0B(r1, r0)
            int r6 = r0.A00
            int r5 = r0.A01
            int r4 = r0.A02
            if (r4 <= 0) goto Lc3
            if (r6 <= r5) goto Lc7
        Lb2:
            java.lang.String r1 = r9.A01
            if (r1 == 0) goto Lbe
            r0 = 35
            r7.append(r0)
            r7.append(r1)
        Lbe:
            java.lang.String r0 = r7.toString()
            return r0
        Lc3:
            if (r4 >= 0) goto Lb2
            if (r5 > r6) goto Lb2
        Lc7:
            int r3 = r6 + r4
            java.lang.String r2 = X.C60Q.A0n(r8, r6)
            int r0 = r6 + 1
            java.lang.String r1 = X.C60Q.A0n(r8, r0)
            if (r6 <= 0) goto Lda
            r0 = 38
            r7.append(r0)
        Lda:
            r7.append(r2)
            if (r1 == 0) goto Le7
            r0 = 61
            r7.append(r0)
            r7.append(r1)
        Le7:
            if (r6 == r5) goto Lb2
            r6 = r3
            goto Lc7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6855EbD.toString():java.lang.String");
    }
}
