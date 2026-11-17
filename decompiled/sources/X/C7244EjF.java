package X;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: X.EjF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7244EjF implements InterfaceC7833FGo<C7245EjG, ImageView, Object> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(context, 2);
        ImageView imageView = (ImageView) obj;
        C7384Etj.A0Y(imageView, 1);
        C7245EjG.A00(imageView);
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(C7245EjG c7245EjG, C7245EjG c7245EjG2, Object obj, Object obj2) {
        C7245EjG c7245EjG3 = c7245EjG;
        C7245EjG c7245EjG4 = c7245EjG2;
        AnonymousClass003.A0u(c7245EjG3, c7245EjG4);
        return C7245EjG.A01(c7245EjG3, c7245EjG4);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        ImageView imageView = (ImageView) obj;
        C7384Etj.A0Y(imageView, 1);
        InterfaceC7300EkR interfaceC7300EkRA00 = C7245EjG.A00(imageView);
        EjN.A00();
        C7384Etj.A0Y(interfaceC7300EkRA00, 0);
        if (interfaceC7300EkRA00 instanceof C7219Eij) {
            ((C7219Eij) interfaceC7300EkRA00).A0A();
        } else {
            AbstractC3422CMk.A03("FrescoController2Impl", AnonymousClass007.A0a("Drawable not supported ", interfaceC7300EkRA00));
        }
    }

    @Override // X.InterfaceC7833FGo
    public final String getDescription() {
        return "FrescoRenderUnit#mountUnmount";
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
