package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class FHW implements InterfaceC7833FGo<FHV, FS4, Void> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FHV fhv, FHV fhv2, Object obj, Object obj2) {
        return AnonymousClass006.A1Z(fhv.A0G, fhv2.A0G);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C7848FHg c7848FHg = ((FHV) obj2).A07;
        if (c7848FHg != null) {
            FTN ftn = recyclerView.A0H;
            ftn.getClass();
            c7848FHg.A00 = ftn.A0v();
        }
        recyclerView.setAdapter(null);
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) AbstractC7608F5v.A0k(context, obj);
        FHV fhv = (FHV) obj2;
        recyclerView.setAdapter(fhv.A0G);
        recyclerView.setItemAnimator(null);
        C7848FHg c7848FHg = fhv.A07;
        if (c7848FHg == null || c7848FHg.A00 == null) {
            int i = fhv.A03;
            if (i >= 0) {
                recyclerView.A0o(i);
                return null;
            }
        } else {
            FTN ftn = recyclerView.A0H;
            ftn.getClass();
            ftn.A18(fhv.A07.A00);
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
