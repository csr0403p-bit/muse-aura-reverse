package X;

import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: X.FOx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8003FOx {
    public final /* synthetic */ FOX A00;
    public final /* synthetic */ C7994FOn A01;

    public C8003FOx(FOX fox, C7994FOn c7994FOn) {
        this.A01 = c7994FOn;
        this.A00 = fox;
    }

    public final Scroller A00() {
        Interpolator interpolator = this.A01.A00;
        if (interpolator == null) {
            return null;
        }
        return new Scroller(this.A00.getContext(), interpolator);
    }
}
