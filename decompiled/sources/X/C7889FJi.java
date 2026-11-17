package X;

import android.content.Context;
import com.facebook.aura.R;

/* renamed from: X.FJi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7889FJi implements InterfaceC7833FGo<FDW, FHQ, Object> {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ HsM A02;
    public final /* synthetic */ HsM A03;

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(context, 2);
        FBB fbb = this.A00;
        C7930FLc c7930FLc = (C7930FLc) FBB.A01(fbb, R.id.bk_screen_container);
        if (c7930FLc == null) {
            return null;
        }
        C7928FLa c7928FLa = new C7928FLa(fbb, this.A01, this.A02, this.A03);
        FLZ flz = c7930FLc.A04;
        flz.A02 = c7928FLa;
        flz.A01 = c7928FLa;
        Hky hky = flz.A00;
        flz.A00 = null;
        if (hky != null) {
            c7928FLa.A00(hky);
            return null;
        }
        flz.A00();
        return null;
    }

    public C7889FJi(FBB fbb, FDW fdw, HsM hsM, HsM hsM2) {
        this.A00 = fbb;
        this.A02 = hsM;
        this.A01 = fdw;
        this.A03 = hsM2;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        C7930FLc c7930FLc = (C7930FLc) FBB.A01(this.A00, R.id.bk_screen_container);
        if (c7930FLc != null) {
            c7930FLc.A04.A02 = null;
        }
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ String getDescription() {
        return AbstractC7608F5v.A0w(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FDW fdw, FDW fdw2, Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
