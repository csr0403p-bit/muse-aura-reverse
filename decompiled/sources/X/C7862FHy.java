package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.FHy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7862FHy extends FGT<FHQ> implements InterfaceC7830FGl<FHQ> {
    public int A00;
    public View.OnClickListener A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final Integer A05;
    public static final InterfaceC7833FGo<C7862FHy, FHQ, Object> A06 = new C7865FIb();
    public static final InterfaceC7833FGo<C7862FHy, FHQ, Object> A08 = new C7864FIa();
    public static final InterfaceC7833FGo<C7862FHy, FHQ, Object> A09 = new FIZ();
    public static final InterfaceC7833FGo<C7862FHy, FHQ, Object> A0A = new FII();
    public static final InterfaceC7833FGo<C7862FHy, FHQ, Object> A07 = new FIU();

    /* JADX WARN: Illegal instructions before constructor call */
    public C7862FHy(long j) {
        C0881AGi c0881AGi = C0881AGi.A00;
        super(null, c0881AGi, c0881AGi);
        this.A04 = j;
        this.A05 = C79.A01;
        this.A00 = -1;
        this.A02 = true;
        C7834FGp[] c7834FGpArr = {new C7834FGp(A06, this), new C7834FGp(A08, this), new C7834FGp(A0A, this), new C7834FGp(A07, this), new C7834FGp(A09, this)};
        int i = 0;
        do {
            A0U(c7834FGpArr[i]);
            i++;
        } while (i < 5);
    }

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ /* synthetic */ FHQ A7d(Context context) {
        if (this instanceof C7854FHq) {
            return new FM6(context);
        }
        if (this instanceof Ht4) {
            C7384Etj.A0Y(context, 0);
            return new EGP(context);
        }
        C7384Etj.A0Y(context, 0);
        return new FHQ(context);
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ FEZ AIs() {
        return Hnn.A00;
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ int AY3() {
        return 3;
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ Class AIr() {
        return getClass();
    }
}
