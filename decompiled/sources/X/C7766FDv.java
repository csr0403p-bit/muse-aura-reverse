package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.FDv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7766FDv implements InterfaceC7833FGo<FGT<? extends View>, View, Void> {
    public final FBB A00;
    public final FDW A01;
    public final List<FDW> A02;

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(context, 2);
        List<FDW> list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            FDW fdwA0z = AbstractC7607F5u.A0z(list, i);
            C6979Edd.A00();
            FL1.A00.A03(this.A00, fdwA0z, this.A01, obj);
        }
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        List<FDW> list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            FDW fdwA0z = AbstractC7607F5u.A0z(list, i);
            C6979Edd.A00();
            FL1.A00.A04(this.A00, fdwA0z, this.A01, obj);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FBB;Ljava/util/List<LX/FDW;>;LX/FDW;)V */
    public C7766FDv(FBB fbb, FDW fdw, List list) {
        this.A00 = fbb;
        this.A02 = list;
        this.A01 = fdw;
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
    public final /* bridge */ /* synthetic */ boolean Afc(FGT<? extends View> fgt, FGT<? extends View> fgt2, Object obj, Object obj2) {
        return true;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
