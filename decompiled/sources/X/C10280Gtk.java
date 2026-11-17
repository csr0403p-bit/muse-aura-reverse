package X;

/* renamed from: X.Gtk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10280Gtk {
    public StringBuilder A00 = AbstractC7609F5w.A0t();
    public boolean A01 = true;
    public final String A02;

    public final void A00(Object obj) {
        StringBuilder sb = this.A00;
        C10293Gtx.A00(sb);
        if (!this.A01) {
            sb.append(this.A02);
        }
        sb.append(obj);
        this.A01 = false;
    }

    public C10280Gtk(String str) {
        this.A02 = str;
    }
}
