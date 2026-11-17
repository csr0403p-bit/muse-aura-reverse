package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class FTB implements Runnable {
    public static final String __redex_internal_original_name = "DefaultItemAnimator$2";
    public final /* synthetic */ FTA A00;
    public final /* synthetic */ ArrayList A01;

    public FTB(FTA fta, ArrayList arrayList) {
        this.A00 = fta;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FTC ftc = (FTC) it.next();
            FTA fta = this.A00;
            FTV ftv = ftc.A05;
            View view = ftv == null ? null : ftv.A0I;
            FTV ftv2 = ftc.A04;
            View view2 = ftv2 != null ? ftv2.A0I : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(250L);
                fta.A02.add(ftc.A05);
                duration.translationX(ftc.A02 - ftc.A00);
                duration.translationY(ftc.A03 - ftc.A01);
                duration.alpha(0.0f).setListener(new I08(view, duration, ftc, fta, 2)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                fta.A02.add(ftc.A04);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new I08(view2, viewPropertyAnimatorAnimate, ftc, fta, 3)).start();
            }
        }
        arrayList.clear();
        this.A00.A03.remove(arrayList);
    }
}
