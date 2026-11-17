package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;

/* loaded from: classes6.dex */
public final class FSZ implements Runnable {
    public static final String __redex_internal_original_name = "ZoomableViewController$gestureListener$2$1$onFling$runnable$1";
    public final /* synthetic */ FSU A00;
    public final /* synthetic */ FST A01;

    public FSZ(FSU fsu, FST fst) {
        this.A01 = fst;
        this.A00 = fsu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FST fst = this.A01;
        FrameLayout.LayoutParams layoutParams = FST.A0d;
        OverScroller overScroller = fst.A0Y;
        overScroller.computeScrollOffset();
        fst.A04 = overScroller.getCurrX();
        fst.A05 = overScroller.getCurrY();
        float currX = overScroller.getCurrX();
        float currY = overScroller.getCurrY();
        View view = fst.A0X;
        view.setTranslationX(currX);
        view.setTranslationY(currY);
        if (overScroller.isFinished()) {
            FST.A02(fst);
        } else {
            this.A00.postOnAnimation(this);
        }
    }
}
