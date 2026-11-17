package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes6.dex */
public final class FF6 implements InterfaceC7833FGo<Float, View, Void> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        ((Number) obj2).floatValue();
        C7384Etj.A0Y(view, 1);
        view.setAlpha(1.0f);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        float fA02 = AnonymousClass001.A02(obj2);
        View view = (View) AbstractC7608F5v.A0k(context, obj);
        C7384Etj.A0Y(view, 1);
        view.setAlpha(fA02);
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(Float f, Float f2, Object obj, Object obj2) {
        return !F8G.A00(Float.valueOf(AnonymousClass001.A02(f)), Float.valueOf(AnonymousClass001.A02(f2)));
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, Float.valueOf(AnonymousClass001.A02(obj2)), obj3);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ String getDescription() {
        return AbstractC7608F5v.A0w(this);
    }
}
