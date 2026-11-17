package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Set;

/* renamed from: X.EgO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7110EgO {
    public final Context A00;
    public final C7096Eg2 A01;
    public final C7096Eg2 A02;
    public final InterfaceC7005EeA<C7167Ehc> A03;
    public final InterfaceC7005EeA A04;
    public final InterfaceC7005EeA<C7167Ehc> A05;
    public final InterfaceC7005EeA<Boolean> A06;
    public final EC1 A07;
    public final DV5 A08;
    public final ECV A09;
    public final ECV A0A;
    public final Eh7 A0B;
    public final BXh A0C;
    public final InterfaceC7147EhG A0D;
    public final C7122Egc A0E;
    public final C7108EgM A0F;
    public final Ee8 A0G;
    public final Eh5 A0H;
    public final C7114EgU A0I;
    public final AbstractC6692EUz A0J;
    public final Set A0K;
    public final Set<InterfaceC7251EjV> A0L;
    public final Set<InterfaceC7250EjU> A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final InterfaceC7005EeA<Boolean> A0P;
    public final Set A0Q;

    public C7110EgO(C7111EgP c7111EgP) {
        Eh7 eh7;
        C7267Ejs.A00();
        this.A0E = new C7122Egc(c7111EgP.A0A);
        InterfaceC7005EeA<C7167Ehc> c7001Ee3 = c7111EgP.A00;
        if (c7001Ee3 == null) {
            Object systemService = c7111EgP.A09.getSystemService("activity");
            if (systemService == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            c7001Ee3 = new C7001Ee3((ActivityManager) systemService);
        }
        this.A03 = c7001Ee3;
        this.A09 = new ECS();
        this.A0A = new ECT();
        DV5 dv5 = c7111EgP.A02;
        this.A08 = dv5 == null ? DV5.getInstance() : dv5;
        Context context = c7111EgP.A09;
        if (context == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        this.A00 = context;
        this.A0C = c7111EgP.A03;
        this.A05 = new C7000Ee2();
        synchronized (Eh7.class) {
            eh7 = Eh7.A00;
            if (eh7 == null) {
                eh7 = new Eh7();
                Eh7.A00 = eh7;
            }
        }
        this.A0B = eh7;
        this.A0P = AbstractC7180Ehp.A00;
        this.A06 = AbstractC7180Ehp.A01;
        C7267Ejs.A00();
        this.A01 = new C7096Eg2(new Eg3(context));
        EC1 ec1 = c7111EgP.A01;
        if (ec1 == null) {
            synchronized (C7141Egx.class) {
                C7141Egx c7141Egx = C7141Egx.A00;
                ec1 = c7141Egx;
                if (c7141Egx == null) {
                    C7141Egx c7141Egx2 = new C7141Egx();
                    C7141Egx.A00 = c7141Egx2;
                    ec1 = c7141Egx2;
                }
            }
        }
        this.A07 = ec1;
        C7267Ejs.A00();
        AbstractC6692EUz abstractC6692EUz = c7111EgP.A07;
        this.A0J = abstractC6692EUz == null ? new C6687EUo(30000) : abstractC6692EUz;
        C7114EgU c7114EgU = c7111EgP.A06;
        c7114EgU = c7114EgU == null ? new C7114EgU(new C7113EgT()) : c7114EgU;
        this.A0I = c7114EgU;
        this.A0H = new Eh5();
        A3q a3q = A3q.A00;
        this.A0M = a3q;
        this.A0L = a3q;
        this.A0Q = a3q;
        this.A0K = a3q;
        this.A0O = true;
        this.A02 = this.A01;
        this.A0G = c7111EgP.A05;
        this.A0D = new C7120Ega(c7114EgU.A01.A03.A00);
        this.A0N = c7111EgP.A08;
        this.A0F = c7111EgP.A04;
        this.A04 = new C7116EgW(new C7095Eg1(new C7107EgL()), this);
        C7267Ejs.A00();
    }
}
