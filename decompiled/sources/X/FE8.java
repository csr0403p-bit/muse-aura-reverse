package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes6.dex */
public final class FE8 implements InterfaceC7833FGo<C7854FHq, FHQ, Void> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(C7854FHq c7854FHq, C7854FHq c7854FHq2, Object obj, Object obj2) {
        return AnonymousClass002.A1P(c7854FHq2.A00, c7854FHq.A00);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        ((View) obj).setVisibility(0);
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        ((View) AbstractC7608F5v.A0k(context, obj)).setVisibility(((C7854FHq) obj2).A00);
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
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
