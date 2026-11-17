package androidx.fragment.app.strictmode;

import X.C3cG;
import X.C60P;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class FragmentReuseViolation extends Violation {
    public final String previousFragmentId;

    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, C60P.A1M(" with previous ID ", str, C3cG.A0f(fragment, "Attempting to reuse fragment ")));
        this.previousFragmentId = str;
    }
}
