package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class FFV implements InterfaceC7833FGo<FDW, RecyclerView, Object> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FDW fdw, FDW fdw2, Object obj, Object obj2) {
        if (obj == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        FFU ffu = (FFU) obj;
        if (obj2 != null) {
            return !ffu.A00.equals(((FFU) obj2).A00);
        }
        throw C3cG.A0Q("Required value was null.");
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) AbstractC7608F5v.A0k(context, obj);
        C7384Etj.A0Y(recyclerView, 1);
        FTN ftn = recyclerView.A0H;
        if ((ftn instanceof GridLayoutManager) && (obj3 instanceof FFU)) {
            ((GridLayoutManager) ftn).A03 = new FFW(AbstractC0878AGe.A0X(((FFU) obj3).A00));
        }
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
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
