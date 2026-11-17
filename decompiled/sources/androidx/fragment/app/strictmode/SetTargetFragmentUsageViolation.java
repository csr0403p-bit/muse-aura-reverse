package androidx.fragment.app.strictmode;

import X.AnonymousClass006;
import X.C3cG;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    public final int requestCode;
    public final Fragment targetFragment;

    /* JADX WARN: Illegal instructions before constructor call */
    public SetTargetFragmentUsageViolation(Fragment fragment, Fragment fragment2, int i) {
        StringBuilder sbA0f = C3cG.A0f(fragment2, "Attempting to set target fragment ");
        sbA0f.append(" with request code ");
        sbA0f.append(i);
        super(fragment, AnonymousClass006.A0y(fragment, " for fragment ", sbA0f));
        this.targetFragment = fragment2;
        this.requestCode = i;
    }
}
