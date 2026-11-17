package X;

/* renamed from: X.Cbu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3655Cbu {
    public static C3679Ccd A00;

    public static synchronized C3696Ccu A00(String str) {
        C3678Ccc c3678Ccc;
        C3679Ccd c3679Ccd;
        c3678Ccc = new C3678Ccc(str);
        c3679Ccd = A00;
        if (c3679Ccd == null) {
            c3679Ccd = new C3679Ccd();
            A00 = c3679Ccd;
        }
        return (C3696Ccu) c3679Ccd.A00(c3678Ccc);
    }
}
