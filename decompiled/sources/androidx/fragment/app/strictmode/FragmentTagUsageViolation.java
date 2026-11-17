package androidx.fragment.app.strictmode;

import X.AnonymousClass006;
import X.C3cG;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class FragmentTagUsageViolation extends Violation {
    public final ViewGroup parentContainer;

    public FragmentTagUsageViolation(ViewGroup viewGroup, Fragment fragment) {
        super(fragment, AnonymousClass006.A0y(viewGroup, " to container ", C3cG.A0f(fragment, "Attempting to use <fragment> tag to add fragment ")));
        this.parentContainer = viewGroup;
    }
}
