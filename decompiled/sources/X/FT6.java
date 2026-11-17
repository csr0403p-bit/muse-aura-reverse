package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class FT6 implements Runnable {
    public static final String __redex_internal_original_name = "DefaultItemAnimator$3";
    public final /* synthetic */ FTA A00;
    public final /* synthetic */ ArrayList A01;

    public FT6(FTA fta, ArrayList arrayList) {
        this.A00 = fta;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FTV ftv = (FTV) it.next();
            FTA fta = this.A00;
            View view = ftv.A0I;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            fta.A00.add(ftv);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(120L).setListener(new I08(view, viewPropertyAnimatorAnimate, fta, ftv, 1)).start();
        }
        arrayList.clear();
        this.A00.A01.remove(arrayList);
    }
}
