package X;

/* loaded from: classes6.dex */
public abstract class GtD extends Gt4 {
    public Object A00 = "";

    public static void A00(GtD gtD) {
        if (gtD.A00 instanceof Gt7) {
            return;
        }
        String strA0T = gtD.A0T();
        Gt7 gt7 = new Gt7();
        C10261GtF c10261GtFA0L = gtD.A0L();
        gtD.A00 = gt7;
        gt7.A0E(gtD.A07(), strA0T);
        if (c10261GtFA0L != null) {
            int iA06 = gt7.A06("/jsoup.spans");
            if (iA06 == -1) {
                Gt7.A02(c10261GtFA0L, "/jsoup.spans", gt7);
            } else {
                gt7.A01[iA06] = c10261GtFA0L;
            }
        }
    }

    @Override // X.Gt4
    public final String A0B(String str) {
        return !(this.A00 instanceof Gt7) ? A07().equals(str) ? A0T() : "" : super.A0B(str);
    }

    @Override // X.Gt4
    public final C10261GtF A0L() {
        Object obj = this.A00;
        return obj instanceof C10306GuH ? ((C10306GuH) obj).A01 : super.A0L();
    }

    @Override // X.Gt4
    public final void A0M(String str, String str2) {
        Object obj = this.A00;
        if ((obj instanceof Gt7) || !str.equals(A07())) {
            A00(this);
            super.A0M(str, str2);
        } else if (obj instanceof C10306GuH) {
            ((C10306GuH) obj).A00 = str2;
        } else {
            this.A00 = str2;
        }
    }

    public final String A0T() {
        Object obj = this.A00;
        return obj instanceof Gt7 ? ((Gt7) obj).A08(A07()) : obj instanceof C10306GuH ? ((C10306GuH) obj).A00 : (String) obj;
    }

    @Override // X.Gt4
    public final String A0A(String str) {
        A00(this);
        return super.A0A(str);
    }

    @Override // X.Gt4
    public final /* bridge */ /* synthetic */ Gt4 A0J(Gt4 gt4) {
        Object c10306GuH;
        GtD gtD = (GtD) super.A0J(gt4);
        Object obj = this.A00;
        if (!(obj instanceof Gt7)) {
            if (obj instanceof C10306GuH) {
                C10306GuH c10306GuH2 = (C10306GuH) obj;
                c10306GuH = new C10306GuH(c10306GuH2.A00, c10306GuH2.A01.A01());
            }
            return gtD;
        }
        c10306GuH = ((Gt7) obj).clone();
        gtD.A00 = c10306GuH;
        return gtD;
    }
}
