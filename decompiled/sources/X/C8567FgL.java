package X;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: X.FgL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8567FgL implements Transition.TransitionListener {
    public final /* synthetic */ C8565FgJ A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C8567FgL(C8565FgJ c8565FgJ, Object obj, Object obj2, ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = c8565FgJ;
        this.A01 = obj;
        this.A03 = arrayList;
        this.A02 = obj2;
        this.A04 = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.A01;
        if (obj != null) {
            this.A00.A08(obj, this.A03, null);
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            this.A00.A08(obj2, this.A04, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
