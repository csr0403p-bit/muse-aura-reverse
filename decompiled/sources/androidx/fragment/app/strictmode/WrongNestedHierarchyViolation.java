package androidx.fragment.app.strictmode;

import X.AnonymousClass001;
import X.C3cG;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    public final int containerId;
    public final Fragment expectedParentFragment;

    /* JADX WARN: Illegal instructions before constructor call */
    public WrongNestedHierarchyViolation(Fragment fragment, Fragment fragment2, int i) {
        StringBuilder sbA0f = C3cG.A0f(fragment, "Attempting to nest fragment ");
        sbA0f.append(" within the view of parent fragment ");
        sbA0f.append(fragment2);
        sbA0f.append(" via container with ID ");
        sbA0f.append(i);
        super(fragment, AnonymousClass001.A0v(" without using parent's childFragmentManager", sbA0f));
        this.expectedParentFragment = fragment2;
        this.containerId = i;
    }
}
