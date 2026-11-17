package X;

/* renamed from: X.Edd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6979Edd {
    public static final C6981Edh A05 = new C6981Edh();
    public static volatile EES<C6979Edd> A06;
    public static volatile C6979Edd A07;
    public final C7863FHz A00;
    public final C6980Edg A01;
    public final EER A02;
    public final EER A03;
    public final C6982Edi A04;

    public static C6979Edd A00() {
        if (A07 == null) {
            synchronized (C6979Edd.class) {
                if (A07 == null) {
                    EES<C6979Edd> ees = A06;
                    if (ees == null) {
                        throw C3cG.A0Q("Can't find bloks instance. Is it initialized?");
                    }
                    A07 = ees.get();
                }
            }
        }
        return A07;
    }

    public C6979Edd(C7863FHz c7863FHz, C6980Edg c6980Edg, EES ees, EES ees2, C6982Edi c6982Edi) {
        this.A01 = c6980Edg;
        this.A04 = c6982Edi;
        this.A00 = c7863FHz;
        EER eer = null;
        EER eer2 = new EER();
        eer2.A00 = ees;
        this.A02 = eer2;
        if (ees2 != null) {
            eer = new EER();
            eer.A00 = ees2;
        }
        this.A03 = eer;
    }
}
