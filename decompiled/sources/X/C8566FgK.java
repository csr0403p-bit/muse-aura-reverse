package X;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.FgK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8566FgK implements Transition.TransitionListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C8565FgJ A01;
    public final /* synthetic */ ArrayList A02;

    public C8566FgK(View view, C8565FgJ c8565FgJ, ArrayList arrayList) {
        this.A01 = c8565FgJ;
        this.A00 = view;
        this.A02 = arrayList;
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
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC7607F5u.A0d(arrayList, i).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
