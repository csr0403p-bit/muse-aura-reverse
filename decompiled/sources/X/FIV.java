package X;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes6.dex */
public final class FIV implements InterfaceC7833FGo<FI2, RCTextView, Void> {
    public final FBB A00;

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        Spanned spanned;
        C7384Etj.A0Y(context, 2);
        C7384Etj.A0Y(obj, 1);
        if (!(obj3 instanceof C7907FKc)) {
            return null;
        }
        FBB fbb = this.A00;
        C7907FKc c7907FKc = (C7907FKc) obj3;
        C7384Etj.A0Y(c7907FKc, 1);
        CharSequence charSequence = c7907FKc.A05;
        if (!(charSequence instanceof Spanned) || (spanned = (Spanned) charSequence) == null) {
            return null;
        }
        Object[] spans = spanned.getSpans(0, spanned.length(), InterfaceC7885FJd.class);
        C7384Etj.A0U(spans);
        for (Object obj4 : spans) {
            C7886FJe c7886FJe = (C7886FJe) ((InterfaceC7885FJd) obj4);
            FDW fdw = c7886FJe.A03;
            C7384Etj.A0Y(fdw, 0);
            FDW fdwA0C = fdw.A0C(71);
            c7886FJe.A00 = fdwA0C != null ? HlW.A01(fdwA0C, fbb) : null;
            c7886FJe.A01 = new FZG(2, fbb, c7886FJe);
        }
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        Spanned spanned;
        View view = (View) obj;
        C7384Etj.A0Y(view, 1);
        if (obj3 instanceof C7907FKc) {
            view.setContentDescription(null);
            C7907FKc c7907FKc = (C7907FKc) obj3;
            C7384Etj.A0Y(c7907FKc, 1);
            CharSequence charSequence = c7907FKc.A05;
            if (!(charSequence instanceof Spanned) || (spanned = (Spanned) charSequence) == null) {
                return;
            }
            Object[] spans = spanned.getSpans(0, spanned.length(), InterfaceC7885FJd.class);
            C7384Etj.A0U(spans);
            for (Object obj4 : spans) {
                C7886FJe c7886FJe = (C7886FJe) ((InterfaceC7885FJd) obj4);
                c7886FJe.A01 = null;
                c7886FJe.A00 = null;
            }
        }
    }

    public FIV(FBB fbb) {
        this.A00 = fbb;
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
    public final /* bridge */ /* synthetic */ boolean Afc(FI2 fi2, FI2 fi22, Object obj, Object obj2) {
        return true;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
