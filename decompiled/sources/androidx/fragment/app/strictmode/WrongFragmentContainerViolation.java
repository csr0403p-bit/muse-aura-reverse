package androidx.fragment.app.strictmode;

import X.AnonymousClass001;
import X.C3cG;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class WrongFragmentContainerViolation extends Violation {
    public final ViewGroup container;

    /* JADX WARN: Illegal instructions before constructor call */
    public WrongFragmentContainerViolation(ViewGroup viewGroup, Fragment fragment) {
        StringBuilder sbA0f = C3cG.A0f(fragment, "Attempting to add fragment ");
        sbA0f.append(" to container ");
        sbA0f.append(viewGroup);
        super(fragment, AnonymousClass001.A0v(" which is not a FragmentContainerView", sbA0f));
        this.container = viewGroup;
    }
}
