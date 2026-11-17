package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes6.dex */
public final class FFZ implements InterfaceC7833FGo<FHV, FS4, Void> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FHV fhv, FHV fhv2, Object obj, Object obj2) {
        List<FS5> list = fhv.A09;
        List<FS5> list2 = fhv2.A09;
        if (list == list2) {
            return false;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return true;
        }
        return !list.equals(list2);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<FS5> list = ((FHV) obj2).A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                recyclerView.A11(list.get(i));
            }
        }
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) AbstractC7608F5v.A0k(context, obj);
        List<FS5> list = ((FHV) obj2).A09;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            recyclerView.A10(list.get(i));
        }
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
