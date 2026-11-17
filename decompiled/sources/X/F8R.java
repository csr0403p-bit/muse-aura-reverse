package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class F8R implements InterfaceC7833FGo<FHV, RecyclerView, Void> {
    public final F8S A00;
    public final F8P A01;

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        F8P f8p = this.A01;
        RecyclerView recyclerView2 = f8p.A07;
        if (recyclerView2 != null) {
            recyclerView2.setImportantForAutofill(0);
        }
        f8p.A07 = null;
        recyclerView.A11(f8p.A06);
    }

    public F8R(F8S f8s, F8P f8p) {
        this.A01 = f8p;
        this.A00 = f8s;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) AbstractC7608F5v.A0k(context, obj);
        F8P f8p = this.A01;
        f8p.A07 = recyclerView;
        recyclerView.A10(f8p.A06);
        if (f8p.A00 != -1) {
            FSF fsf = f8p.A0D;
            if (!f8p.A09) {
                FEn.A02(recyclerView, f8p.A00, false);
            } else if (f8p.A08.equals("")) {
                int i = f8p.A00;
                if (fsf != null) {
                    FEn.A03(recyclerView, fsf, i, true);
                } else {
                    FEn.A02(recyclerView, i, true);
                }
            } else {
                FF2 ff2 = new FF2(context);
                ff2.A00 = 0;
                ff2.A03 = true;
                ff2.A01 = 0;
                ff2.A07(f8p.A08);
                ff2.A00 = f8p.A03;
                ff2.A03 = f8p.A0B;
                ((AbstractC8094FTa) ff2).A00 = f8p.A00;
                FTN ftn = recyclerView.A0H;
                if (ftn != null) {
                    ftn.A1K(ff2);
                }
            }
            f8p.A00 = -1;
            f8p.A09 = false;
            f8p.A08 = "";
            f8p.A03 = 0;
            f8p.A0B = true;
        }
        int i2 = f8p.A01;
        if (i2 != -1 || f8p.A02 != -1) {
            boolean z = f8p.A0A;
            int i3 = f8p.A02;
            if (z) {
                recyclerView.A0v(i2, i3, false);
            } else {
                recyclerView.scrollBy(i2, i3);
            }
            f8p.A01 = -1;
            f8p.A02 = -1;
            f8p.A0A = false;
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
    public final /* bridge */ /* synthetic */ boolean Afc(FHV fhv, FHV fhv2, Object obj, Object obj2) {
        return true;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
