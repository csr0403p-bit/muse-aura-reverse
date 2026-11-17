package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import com.facebook.aura.R;

/* renamed from: X.EjC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7241EjC implements InterfaceC7833FGo<C7245EjG, ImageView, Object> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7197Ei9 c7197Ei9;
        C7197Ei9 c7197Ei92;
        C7384Etj.A0Y(context, 2);
        ImageView imageView = (ImageView) obj;
        C7245EjG c7245EjG = (C7245EjG) obj2;
        C7384Etj.A0Y(imageView, 1);
        C7384Etj.A0Y(c7245EjG, 2);
        Rect rect = obj3 instanceof Rect ? (Rect) obj3 : null;
        C7226Eiq c7226EiqA7p = c7245EjG.A01;
        if (c7226EiqA7p == null || !C7384Etj.areEqual(c7245EjG.A00, rect)) {
            if (rect == null || (c7197Ei92 = c7245EjG.A05) == null || !((((AbstractC7191Ei2) c7197Ei92).A0D && ((AbstractC7191Ei2) c7197Ei92).A0C) || c7197Ei92.A0L)) {
                c7197Ei9 = c7245EjG.A05;
            } else {
                C7196Ei8 c7196Ei8 = new C7196Ei8(c7197Ei92);
                int iWidth = rect.width();
                int iHeight = rect.height();
                ((C7195Ei7) c7196Ei8).A06 = (iWidth <= 0 || iHeight <= 0) ? null : new C7481Exe(iWidth, iHeight);
                c7197Ei9 = new C7197Ei9(c7196Ei8);
            }
            InterfaceC7237Ej1 interfaceC7237Ej1A02 = EjN.A02();
            Resources resources = context.getResources();
            C7384Etj.A0U(resources);
            c7226EiqA7p = interfaceC7237Ej1A02.A7p(resources, rect, EnumC7399Eud.A02, c7197Ei9, c7245EjG.A06, c7245EjG.A07);
            c7245EjG.A01 = c7226EiqA7p;
            c7245EjG.A00 = rect;
        }
        InterfaceC7300EkR interfaceC7300EkRA00 = C7245EjG.A00(imageView);
        EjK ejKA00 = EjN.A00();
        Object obj4 = c7245EjG.A07;
        ejKA00.ABJ(rect, c7245EjG.A03, null, interfaceC7300EkRA00, c7226EiqA7p, null, c7245EjG.A04, obj4);
        imageView.setTag(R.id.fresco_vito_image_options_tag, c7245EjG.A05);
        imageView.setTag(R.id.fresco_vito_caller_context_tag, obj4);
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(C7245EjG c7245EjG, C7245EjG c7245EjG2, Object obj, Object obj2) {
        C7245EjG c7245EjG3 = c7245EjG;
        C7245EjG c7245EjG4 = c7245EjG2;
        AnonymousClass003.A0u(c7245EjG3, c7245EjG4);
        return C7245EjG.A01(c7245EjG3, c7245EjG4) || !C7384Etj.areEqual(obj, obj2);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        ImageView imageView = (ImageView) obj;
        C7245EjG c7245EjG = (C7245EjG) obj2;
        AnonymousClass003.A0x(imageView, c7245EjG);
        InterfaceC7300EkR interfaceC7300EkRA00 = C7245EjG.A00(imageView);
        C7219Eij c7219Eij = (C7219Eij) interfaceC7300EkRA00;
        Object objA01 = c7219Eij.A01(1);
        C7242EjD c7242EjD = c7219Eij.A0C;
        if (objA01 == c7242EjD) {
            objA01 = ((AbstractC7281Ek8) c7242EjD).A00;
        }
        C7197Ei9 c7197Ei9 = c7245EjG.A05;
        if ((c7197Ei9 == null || c7197Ei9.A0J) && (objA01 instanceof Animatable)) {
            ((Animatable) objA01).stop();
        }
        EjN.A00();
        C7384Etj.A0Y(interfaceC7300EkRA00, 0);
        if (!(interfaceC7300EkRA00 instanceof C7219Eij)) {
            AbstractC3422CMk.A03("FrescoController2Impl", AnonymousClass007.A0a("Drawable not supported ", interfaceC7300EkRA00));
        } else if (!c7219Eij.A08) {
            C7219Eij.A0H.postDelayed(c7219Eij.A0F, 80L);
            c7219Eij.A08 = true;
        }
        imageView.setTag(R.id.fresco_vito_image_options_tag, null);
        imageView.setTag(R.id.fresco_vito_caller_context_tag, null);
    }

    @Override // X.InterfaceC7833FGo
    public final String getDescription() {
        return "FrescoRenderUnit#attachDetach";
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
