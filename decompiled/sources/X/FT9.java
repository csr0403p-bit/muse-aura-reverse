package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class FT9 implements Runnable {
    public static final String __redex_internal_original_name = "RecyclerView$2";
    public final /* synthetic */ RecyclerView A00;

    public FT9(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.A00;
        FTP ftp = recyclerView.A0G;
        if (ftp != null) {
            FTA fta = (FTA) ftp;
            ArrayList<FTV> arrayList = fta.A09;
            boolean zIsEmpty = arrayList.isEmpty();
            ArrayList<FTE> arrayList2 = fta.A08;
            boolean zIsEmpty2 = arrayList2.isEmpty();
            ArrayList<FTC> arrayList3 = fta.A07;
            boolean zIsEmpty3 = arrayList3.isEmpty();
            ArrayList<FTV> arrayList4 = fta.A06;
            boolean zIsEmpty4 = arrayList4.isEmpty();
            if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                Iterator<FTV> it = arrayList.iterator();
                while (it.hasNext()) {
                    FTV next = it.next();
                    View view = next.A0I;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    fta.A0A.add(next);
                    viewPropertyAnimatorAnimate.setDuration(120L).alpha(0.0f).setListener(new I08(view, viewPropertyAnimatorAnimate, fta, next, 0)).start();
                }
                arrayList.clear();
                if (!zIsEmpty2) {
                    ArrayList<FTE> arrayListA0h = C3cG.A0h();
                    arrayListA0h.addAll(arrayList2);
                    fta.A05.add(arrayListA0h);
                    arrayList2.clear();
                    FT8 ft8 = new FT8(fta, arrayListA0h);
                    if (zIsEmpty) {
                        ft8.run();
                    } else {
                        arrayListA0h.get(0).A04.A0I.postOnAnimationDelayed(ft8, 120L);
                    }
                }
                if (!zIsEmpty3) {
                    ArrayList<FTC> arrayListA0h2 = C3cG.A0h();
                    arrayListA0h2.addAll(arrayList3);
                    fta.A03.add(arrayListA0h2);
                    arrayList3.clear();
                    FTB ftb = new FTB(fta, arrayListA0h2);
                    if (zIsEmpty) {
                        ftb.run();
                    } else {
                        arrayListA0h2.get(0).A05.A0I.postOnAnimationDelayed(ftb, 120L);
                    }
                }
                if (!zIsEmpty4) {
                    ArrayList<FTV> arrayListA0h3 = C3cG.A0h();
                    arrayListA0h3.addAll(arrayList4);
                    fta.A01.add(arrayListA0h3);
                    arrayList4.clear();
                    FT6 ft6 = new FT6(fta, arrayListA0h3);
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                        ft6.run();
                    } else {
                        AbstractC7607F5u.A0n(arrayListA0h3, 0).A0I.postOnAnimationDelayed(ft6, (!zIsEmpty ? 120L : 0L) + Math.max(!zIsEmpty2 ? 250L : 0L, zIsEmpty3 ? 0L : 250L));
                    }
                }
            }
        }
        recyclerView.A0c = false;
    }
}
