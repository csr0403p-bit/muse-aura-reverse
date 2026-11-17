package X;

import android.content.Context;

/* renamed from: X.FFz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7818FFz implements InterfaceC7833FGo<FDW, FS4, Void> {
    public final FF9 A00;

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        FDW fdw = (FDW) obj2;
        AnonymousClass003.A0w(fg3, fdw);
        fg3.AiD(new FG0(this, fdw, obj3));
        return null;
    }

    public C7818FFz(FF9 ff9) {
        this.A00 = ff9;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FDW fdw, FDW fdw2, Object obj, Object obj2) {
        AnonymousClass003.A0u(fdw, fdw2);
        if (!fdw.equals(fdw2)) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        FFN ffn = (FFN) obj;
        FFN ffn2 = (FFN) obj2;
        return (ffn.A01 == ffn2.A01 && ffn.A00 == ffn2.A00) ? false : true;
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
