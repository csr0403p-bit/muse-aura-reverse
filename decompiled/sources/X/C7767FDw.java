package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.FDw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7767FDw implements InterfaceC7833FGo<FDW, View, Void> {
    public final FBB A00;
    public final FDW A01;
    public final boolean A02;
    public final FH1 A03;

    public C7767FDw(FBB fbb, FDW fdw) {
        C7384Etj.A0Y(fdw, 0);
        this.A01 = fdw;
        this.A00 = fbb;
        int i = fdw.A05;
        this.A02 = i == 13656 || i == 13914 || i == 16529;
        this.A03 = new C7768FDx(fdw);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        FDW fdw = (FDW) obj2;
        AnonymousClass002.A1B(obj, 2, fdw);
        C6979Edd.A00();
        FL1.A00.A03(this.A00, this.A01, fdw, obj);
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final FH1 AGl() {
        return this.A03;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        FDW fdw = (FDW) obj2;
        AnonymousClass003.A0x(obj, fdw);
        C6979Edd.A00();
        FL1.A00.A04(this.A00, this.A01, fdw, obj);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FDW fdw, FDW fdw2, Object obj, Object obj2) {
        AnonymousClass003.A0u(fdw, fdw2);
        if (fdw != fdw2) {
            return true;
        }
        return this.A02;
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
