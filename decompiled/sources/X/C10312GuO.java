package X;

/* renamed from: X.GuO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10312GuO {
    public String A00;
    public StringBuilder A01;

    public final String A00() {
        StringBuilder sb = this.A01;
        if (sb == null) {
            String str = this.A00;
            return str == null ? "" : str;
        }
        String strA01 = Gt5.A01(sb);
        this.A00 = strA01;
        this.A01 = null;
        return strA01;
    }

    public final void A01() {
        StringBuilder sb = this.A01;
        if (sb != null) {
            C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
            if (sb.length() <= 8192) {
                sb.delete(0, sb.length());
                Gt5.A03.A01(sb);
            }
            this.A01 = null;
        }
        this.A00 = null;
    }

    public final void A02(char c) {
        StringBuilder sbA0t = this.A01;
        if (sbA0t == null) {
            if (this.A00 == null) {
                this.A00 = String.valueOf(c);
                return;
            }
            sbA0t = AbstractC7609F5w.A0t();
            this.A01 = sbA0t;
            sbA0t.append(this.A00);
            this.A00 = null;
        }
        sbA0t.append(c);
    }

    public final void A03(String str) {
        StringBuilder sbA0t = this.A01;
        if (sbA0t == null) {
            if (this.A00 == null) {
                this.A00 = str;
                return;
            }
            sbA0t = AbstractC7609F5w.A0t();
            this.A01 = sbA0t;
            sbA0t.append(this.A00);
            this.A00 = null;
        }
        sbA0t.append(str);
    }

    public final String toString() {
        StringBuilder sb = this.A01;
        if (sb != null) {
            return sb.toString();
        }
        String str = this.A00;
        return str == null ? "" : str;
    }
}
