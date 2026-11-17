package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes6.dex */
public final class FIJ implements InterfaceC7833FGo<FGT<? extends RCTextView>, RCTextView, Void> {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ HsM A02;

    public FIJ(FBB fbb, FDW fdw, HsM hsM) {
        this.A01 = fdw;
        this.A02 = hsM;
        this.A00 = fbb;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C7384Etj.A0Y(view, 1);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setFocusable(false);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        View view = (View) AbstractC7608F5v.A0k(context, obj);
        C7384Etj.A0Y(view, 1);
        view.setOnClickListener(new ViewOnClickListenerC8159FXb(this.A00, this.A01, this.A02, 1));
        view.setFocusable(true);
        return null;
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
    public final /* bridge */ /* synthetic */ boolean Afc(FGT<? extends RCTextView> fgt, FGT<? extends RCTextView> fgt2, Object obj, Object obj2) {
        return true;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
