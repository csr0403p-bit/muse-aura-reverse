package X;

import android.animation.Animator;
import android.content.Context;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FD1 implements InterfaceC7833FGo<FDW, FHQ, Object> {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ HsM A02;

    public FD1(FBB fbb, FDW fdw, HsM hsM) {
        this.A00 = fbb;
        this.A01 = fdw;
        this.A02 = hsM;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        Animator animator;
        String str = (String) FBB.A01(this.A00, R.id.bk_screen_container_id);
        if (str != null) {
            F9P.A00.remove(str);
            C7747FCz c7747FCzA00 = AbstractC7724FCa.A00(str, false);
            if (c7747FCzA00 == null || (animator = c7747FCzA00.A00) == null) {
                return;
            }
            animator.cancel();
        }
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        FHQ fhq = (FHQ) AbstractC7608F5v.A0k(context, obj);
        C7384Etj.A0Y(fhq, 1);
        FBB fbb = this.A00;
        String str = (String) FBB.A01(fbb, R.id.bk_screen_container_id);
        if (str != null) {
            F9P.A00.put(str, new C7633F7q(this.A02, F6D.A01(fbb, this.A01.A09)));
            fhq.getViewTreeObserver().addOnGlobalLayoutListener(new FD0(fhq, fbb, str));
        }
        return null;
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
    public final /* bridge */ /* synthetic */ boolean Afc(FDW fdw, FDW fdw2, Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
