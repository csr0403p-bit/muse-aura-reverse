package X;

import android.content.Context;
import android.widget.ImageView;

/* loaded from: classes6.dex */
public final class FI6 implements InterfaceC7833FGo<C7245EjG, ImageView, Object> {
    public final /* synthetic */ FJ8 A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ FDW A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(context, 2);
        FIW fiw = this.A00.A00;
        String str = fiw.A03;
        boolean zA0L = fiw.A04;
        int iA07 = fiw.A01;
        float f = fiw.A00;
        C7384Etj.A0Y(str, 0);
        FDW fdw = this.A02;
        HsM hsMA0a = AbstractC7608F5v.A0a(fdw);
        I07 i07 = hsMA0a != null ? new I07(hsMA0a, this.A01, fdw, 2) : null;
        String str2 = this.A03;
        if (!str2.equals(fiw.A03)) {
            zA0L = fdw.A0L(35, true);
            iA07 = fdw.A07(38, 1);
            f = 0.0f;
        }
        fiw.A03 = str2;
        fiw.A04 = zA0L;
        fiw.A01 = iA07;
        fiw.A02 = i07;
        fiw.A00 = f;
        return null;
    }

    public FI6(FJ8 fj8, FBB fbb, FDW fdw, String str) {
        this.A00 = fj8;
        this.A02 = fdw;
        this.A03 = str;
        this.A01 = fbb;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ String getDescription() {
        return AbstractC7608F5v.A0w(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(C7245EjG c7245EjG, C7245EjG c7245EjG2, Object obj, Object obj2) {
        return true;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
