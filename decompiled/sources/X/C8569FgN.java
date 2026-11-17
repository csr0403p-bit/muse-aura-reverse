package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.FgN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8569FgN extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C8565FgJ A01;

    public C8569FgN(Rect rect, C8565FgJ c8565FgJ) {
        this.A01 = c8565FgJ;
        this.A00 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.A00;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
