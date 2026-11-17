package X;

import com.facebook.aura.R;

/* renamed from: X.17t, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17t {
    public static final C17t A0R = new C17t();
    public final C76X A00;
    public final C76X A01;
    public final C76X A02;
    public final C76X A03;
    public final C76X A04;
    public final C76X A05;
    public final C76X A06;
    public final C76X A07;
    public final C76X A08;
    public final C76X A09;
    public final C76X A0A;
    public final C76X A0B;
    public final C76X A0C;
    public final C76X A0D;
    public final C76X A0E;
    public final C76X A0F;
    public final C76X A0G;
    public final C76X A0H;
    public final C76X A0I;
    public final C76X A0J;
    public final C76X A0K;
    public final C76X A0L;
    public final C76X A0M;
    public final C76X A0N;
    public final C76X A0O;
    public final C76X A0P;
    public final C76X A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(obj != null ? obj.getClass() : null)) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.glance.color.ColorProviders");
                C17t c17t = (C17t) obj;
                if (!this.A0I.equals(c17t.A0I) || !this.A09.equals(c17t.A09) || !this.A0J.equals(c17t.A0J) || !this.A0A.equals(c17t.A0A) || !this.A0K.equals(c17t.A0K) || !this.A0B.equals(c17t.A0B) || !this.A0L.equals(c17t.A0L) || !this.A0C.equals(c17t.A0C) || !this.A0O.equals(c17t.A0O) || !this.A0F.equals(c17t.A0F) || !this.A0P.equals(c17t.A0P) || !this.A0G.equals(c17t.A0G) || !this.A01.equals(c17t.A01) || !this.A02.equals(c17t.A02) || !this.A07.equals(c17t.A07) || !this.A08.equals(c17t.A08) || !this.A00.equals(c17t.A00) || !this.A06.equals(c17t.A06) || !this.A0M.equals(c17t.A0M) || !this.A0D.equals(c17t.A0D) || !this.A0N.equals(c17t.A0N) || !this.A0E.equals(c17t.A0E) || !this.A0H.equals(c17t.A0H) || !this.A03.equals(c17t.A03) || !this.A05.equals(c17t.A05) || !this.A04.equals(c17t.A04) || !this.A0Q.equals(c17t.A0Q)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A0Q, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A0H, AnonymousClass005.A0F(this.A0E, AnonymousClass005.A0F(this.A0N, AnonymousClass005.A0F(this.A0D, AnonymousClass005.A0F(this.A0M, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A08, AnonymousClass005.A0F(this.A07, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A0G, AnonymousClass005.A0F(this.A0P, AnonymousClass005.A0F(this.A0F, AnonymousClass005.A0F(this.A0O, AnonymousClass005.A0F(this.A0C, AnonymousClass005.A0F(this.A0L, AnonymousClass005.A0F(this.A0B, AnonymousClass005.A0F(this.A0K, AnonymousClass005.A0F(this.A0A, AnonymousClass005.A0F(this.A0J, AnonymousClass005.A0F(this.A09, AnonymousClass005.A0E(this.A0I)))))))))))))))))))))))))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorProviders(primary=");
        sb.append(this.A0I);
        sb.append(", onPrimary=");
        sb.append(this.A09);
        sb.append(", primaryContainer=");
        sb.append(this.A0J);
        sb.append(", onPrimaryContainer=");
        sb.append(this.A0A);
        sb.append(", secondary=");
        sb.append(this.A0K);
        sb.append(", onSecondary=");
        sb.append(this.A0B);
        sb.append(", secondaryContainer=");
        sb.append(this.A0L);
        sb.append(", onSecondaryContainer=");
        sb.append(this.A0C);
        sb.append(", tertiary=");
        sb.append(this.A0O);
        sb.append(", onTertiary=");
        sb.append(this.A0F);
        sb.append(", tertiaryContainer=");
        sb.append(this.A0P);
        sb.append(", onTertiaryContainer=");
        sb.append(this.A0G);
        sb.append(", error=");
        sb.append(this.A01);
        sb.append(", errorContainer=");
        sb.append(this.A02);
        sb.append(", onError=");
        sb.append(this.A07);
        sb.append(", onErrorContainer=");
        sb.append(this.A08);
        sb.append(", background=");
        sb.append(this.A00);
        sb.append(", onBackground=");
        sb.append(this.A06);
        sb.append(", surface=");
        sb.append(this.A0M);
        sb.append(", onSurface=");
        sb.append(this.A0D);
        sb.append(", surfaceVariant=");
        sb.append(this.A0N);
        sb.append(", onSurfaceVariant=");
        sb.append(this.A0E);
        sb.append(", outline=");
        sb.append(this.A0H);
        sb.append(", inverseOnSurface=");
        sb.append(this.A03);
        sb.append(", inverseSurface=");
        sb.append(this.A05);
        sb.append(", inversePrimary=");
        sb.append(this.A04);
        sb.append(")widgetBackground=");
        sb.append(this.A0Q);
        return sb.toString();
    }

    public C17t() {
        C063875u c063875u = new C063875u(R.color._name_removed__res_0x7f060092);
        C063875u c063875u2 = new C063875u(R.color._name_removed__res_0x7f060089);
        C063875u c063875u3 = new C063875u(R.color._name_removed__res_0x7f060093);
        C063875u c063875u4 = new C063875u(R.color._name_removed__res_0x7f06008a);
        C063875u c063875u5 = new C063875u(R.color._name_removed__res_0x7f060095);
        C063875u c063875u6 = new C063875u(R.color._name_removed__res_0x7f06008b);
        C063875u c063875u7 = new C063875u(R.color._name_removed__res_0x7f060096);
        C063875u c063875u8 = new C063875u(R.color._name_removed__res_0x7f06008c);
        C063875u c063875u9 = new C063875u(R.color._name_removed__res_0x7f060099);
        C063875u c063875u10 = new C063875u(R.color._name_removed__res_0x7f06008f);
        C063875u c063875u11 = new C063875u(R.color._name_removed__res_0x7f06009a);
        C063875u c063875u12 = new C063875u(R.color._name_removed__res_0x7f060090);
        C063875u c063875u13 = new C063875u(R.color._name_removed__res_0x7f060084);
        C063875u c063875u14 = new C063875u(R.color._name_removed__res_0x7f060085);
        C063875u c063875u15 = new C063875u(R.color._name_removed__res_0x7f060087);
        C063875u c063875u16 = new C063875u(R.color._name_removed__res_0x7f060088);
        C063875u c063875u17 = new C063875u(R.color._name_removed__res_0x7f060083);
        C063875u c063875u18 = new C063875u(R.color._name_removed__res_0x7f060086);
        C063875u c063875u19 = new C063875u(R.color._name_removed__res_0x7f060083);
        C063875u c063875u20 = new C063875u(R.color._name_removed__res_0x7f060086);
        C063875u c063875u21 = new C063875u(R.color._name_removed__res_0x7f060098);
        C063875u c063875u22 = new C063875u(R.color._name_removed__res_0x7f06008e);
        C063875u c063875u23 = new C063875u(R.color._name_removed__res_0x7f060091);
        C063875u c063875u24 = new C063875u(R.color._name_removed__res_0x7f06008d);
        C063875u c063875u25 = new C063875u(R.color._name_removed__res_0x7f060097);
        C063875u c063875u26 = new C063875u(R.color._name_removed__res_0x7f060094);
        C063875u c063875u27 = new C063875u(R.color._name_removed__res_0x7f06009b);
        this.A0I = c063875u;
        this.A09 = c063875u2;
        this.A0J = c063875u3;
        this.A0A = c063875u4;
        this.A0K = c063875u5;
        this.A0B = c063875u6;
        this.A0L = c063875u7;
        this.A0C = c063875u8;
        this.A0O = c063875u9;
        this.A0F = c063875u10;
        this.A0P = c063875u11;
        this.A0G = c063875u12;
        this.A01 = c063875u13;
        this.A02 = c063875u14;
        this.A07 = c063875u15;
        this.A08 = c063875u16;
        this.A00 = c063875u17;
        this.A06 = c063875u18;
        this.A0M = c063875u19;
        this.A0D = c063875u20;
        this.A0N = c063875u21;
        this.A0E = c063875u22;
        this.A0H = c063875u23;
        this.A03 = c063875u24;
        this.A05 = c063875u25;
        this.A04 = c063875u26;
        this.A0Q = c063875u27;
    }
}
