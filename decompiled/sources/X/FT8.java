package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class FT8 implements Runnable {
    public static final String __redex_internal_original_name = "DefaultItemAnimator$1";
    public final /* synthetic */ FTA A00;
    public final /* synthetic */ ArrayList A01;

    public FT8(FTA fta, ArrayList arrayList) {
        this.A00 = fta;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FTE fte = (FTE) it.next();
            FTA fta = this.A00;
            FTV ftv = fte.A04;
            int i = fte.A00;
            int i2 = fte.A01;
            int i3 = fte.A02;
            int i4 = fte.A03;
            View view = ftv.A0I;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            fta.A04.add(ftv);
            viewPropertyAnimatorAnimate.setDuration(250L).setListener(new FT7(view, viewPropertyAnimatorAnimate, fta, ftv, i5, i6)).start();
        }
        arrayList.clear();
        this.A00.A05.remove(arrayList);
    }
}
