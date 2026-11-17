package X;

/* renamed from: X.FyG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9089FyG extends GF3 implements HrP {
    public C9089FyG() {
        super(C9170Fzd.DEFAULT_INSTANCE);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Iterable<+LX/Fzq;>;)LX/FyG; */
    public final void A02(Iterable iterable) {
        A01();
        C9170Fzd c9170Fzd = (C9170Fzd) this.A00;
        int i = C9170Fzd.DATA_ORIGIN_FIELD_NUMBER;
        GDN<C9183Fzq> gdnAR0 = c9170Fzd.dataOrigin_;
        if (!((GDC) gdnAR0).A00) {
            gdnAR0 = gdnAR0.AR0(AbstractC7610F5x.A0P(gdnAR0));
            c9170Fzd.dataOrigin_ = gdnAR0;
        }
        AbstractC10480Hkv.A00(iterable, gdnAR0);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Iterable<+LX/Fzl;>;)LX/FyG; */
    public final void A03(Iterable iterable) {
        A01();
        C9170Fzd c9170Fzd = (C9170Fzd) this.A00;
        int i = C9170Fzd.DATA_ORIGIN_FIELD_NUMBER;
        GDN<C9178Fzl> gdnAR0 = c9170Fzd.metricSpec_;
        if (!((GDC) gdnAR0).A00) {
            gdnAR0 = gdnAR0.AR0(AbstractC7610F5x.A0P(gdnAR0));
            c9170Fzd.metricSpec_ = gdnAR0;
        }
        AbstractC10480Hkv.A00(iterable, gdnAR0);
    }
}
