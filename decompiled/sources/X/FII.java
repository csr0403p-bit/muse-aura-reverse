package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes6.dex */
public final class FII implements InterfaceC7833FGo<C7862FHy, FHQ, Object> {
    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(context, 2);
        View view = (View) obj;
        C7862FHy c7862FHy = (C7862FHy) obj2;
        AbstractC7609F5w.A1G(view, c7862FHy);
        View.OnClickListener onClickListener = c7862FHy.A01;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        view.setOnFocusChangeListener(null);
        view.setEnabled(c7862FHy.A02);
        if (c7862FHy.A00 != -1) {
            view.setClickable(false);
        }
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C7384Etj.A0Y(view, 1);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setOnFocusChangeListener(null);
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
    public final /* bridge */ /* synthetic */ boolean Afc(C7862FHy c7862FHy, C7862FHy c7862FHy2, Object obj, Object obj2) {
        return true;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
