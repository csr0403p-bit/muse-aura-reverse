package X;

import android.content.Context;

/* renamed from: X.FFf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7799FFf implements InterfaceC7833FGo<FHV, FS4, Void> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FHV fhv, FHV fhv2, Object obj, Object obj2) {
        return AnonymousClass002.A1P(fhv.A0C ? 1 : 0, fhv2.A0C ? 1 : 0);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        ((FS4) obj).setIsScrollEnabled(true);
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        ((FS4) AbstractC7608F5v.A0k(context, obj)).setIsScrollEnabled(((FHV) obj2).A0C);
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
