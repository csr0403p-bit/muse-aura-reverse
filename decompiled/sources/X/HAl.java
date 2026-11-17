package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HAl {
    public Integer A00;
    public String A01;
    public List<HAm> A02 = null;
    public List<HAy> A03 = null;

    public final void A00(String str, Integer num, String str2) {
        List listA0h = this.A02;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            this.A02 = listA0h;
        }
        listA0h.add(new HAm(str, num, str2));
    }

    public HAl(Integer num, String str) {
        this.A00 = num == null ? C79.A00 : num;
        this.A01 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = X.C60O.A0w()
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.C79.A01
            if (r1 != r0) goto L60
            java.lang.String r0 = "> "
        Lc:
            r3.append(r0)
        Lf:
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L15
            java.lang.String r0 = "*"
        L15:
            r3.append(r0)
            java.util.List<X.HAm> r0 = r5.A02
            if (r0 == 0) goto L67
            java.util.Iterator r4 = r0.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r2 = r4.next()
            X.HAm r2 = (X.HAm) r2
            r0 = 91
            r3.append(r0)
            java.lang.String r0 = r2.A01
            r3.append(r0)
            X.Hti r0 = X.AbstractC10562Hti.$redex_init_class
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L5a
            r0 = 2
            if (r1 == r0) goto L57
            r0 = 3
            if (r1 != r0) goto L51
            java.lang.String r0 = "|="
        L49:
            r3.append(r0)
        L4c:
            java.lang.String r0 = r2.A02
            r3.append(r0)
        L51:
            r0 = 93
            r3.append(r0)
            goto L20
        L57:
            java.lang.String r0 = "~="
            goto L49
        L5a:
            r0 = 61
            r3.append(r0)
            goto L4c
        L60:
            java.lang.Integer r0 = X.C79.A0C
            if (r1 != r0) goto Lf
            java.lang.String r0 = "+ "
            goto Lc
        L67:
            java.util.List<X.HAy> r0 = r5.A03
            if (r0 == 0) goto L82
            java.util.Iterator r2 = r0.iterator()
        L6f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r1 = r2.next()
            r0 = 58
            r3.append(r0)
            r3.append(r1)
            goto L6f
        L82:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HAl.toString():java.lang.String");
    }
}
