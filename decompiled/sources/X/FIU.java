package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes6.dex */
public final class FIU implements InterfaceC7833FGo<C7862FHy, FHQ, Object> {
    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(context, 2);
        View view = (View) obj;
        C7862FHy c7862FHy = (C7862FHy) obj2;
        AbstractC7609F5w.A1G(view, c7862FHy);
        view.setFocusable(c7862FHy.A03);
        view.setFocusableInTouchMode(false);
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(C7862FHy c7862FHy, C7862FHy c7862FHy2, Object obj, Object obj2) {
        C7862FHy c7862FHy3 = c7862FHy;
        C7862FHy c7862FHy4 = c7862FHy2;
        AnonymousClass003.A0u(c7862FHy3, c7862FHy4);
        return c7862FHy3.A03 != c7862FHy4.A03;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C7384Etj.A0Y(view, 1);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
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
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
