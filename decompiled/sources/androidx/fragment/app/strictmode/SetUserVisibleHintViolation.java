package androidx.fragment.app.strictmode;

import X.AnonymousClass006;
import X.C60O;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class SetUserVisibleHintViolation extends Violation {
    public final boolean isVisibleToUser;

    public SetUserVisibleHintViolation(Fragment fragment, boolean z) {
        super(fragment, AnonymousClass006.A0y(fragment, " for fragment ", C60O.A10("Attempting to set user visible hint to ", z)));
        this.isVisibleToUser = z;
    }
}
