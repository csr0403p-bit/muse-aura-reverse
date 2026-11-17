package X;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class FE9 implements InterfaceC7833FGo<C7854FHq, FHQ, Void> {
    public final /* synthetic */ C7854FHq A00;

    public FE9(C7854FHq c7854FHq) {
        this.A00 = c7854FHq;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).setClipChildren(true);
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        ((ViewGroup) AbstractC7608F5v.A0k(context, obj)).setClipChildren(false);
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
    public final /* bridge */ /* synthetic */ boolean Afc(C7854FHq c7854FHq, C7854FHq c7854FHq2, Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
