package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes6.dex */
public final class FDY implements InterfaceC7833FGo<FGT<? extends View>, View, Void> {
    public final C7760FDn A00;

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        this.A00.A00 = null;
    }

    public FDY(C7760FDn c7760FDn) {
        this.A00 = c7760FDn;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        this.A00.A00 = (View) AbstractC7608F5v.A0k(context, obj);
        return null;
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
    public final /* bridge */ /* synthetic */ boolean Afc(FGT<? extends View> fgt, FGT<? extends View> fgt2, Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
