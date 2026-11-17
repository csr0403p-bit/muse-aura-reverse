package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class FHZ implements InterfaceC7833FGo<FHV, FS4, Void> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FHV fhv, FHV fhv2, Object obj, Object obj2) {
        return !C6xC.A00(fhv.A06, fhv2.A06);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        FSF fsf = ((FHV) obj2).A06;
        if (fsf != null) {
            fsf.A05(null);
        }
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) AbstractC7608F5v.A0k(context, obj);
        FSF fsf = ((FHV) obj2).A06;
        if (fsf == null) {
            return null;
        }
        fsf.A05(recyclerView);
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
