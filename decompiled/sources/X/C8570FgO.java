package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.FgO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8570FgO extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C8565FgJ A01;

    public C8570FgO(Rect rect, C8565FgJ c8565FgJ) {
        this.A01 = c8565FgJ;
        this.A00 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.A00;
    }
}
