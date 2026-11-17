package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.FhV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8625FhV {
    public final void A00() {
        if (this instanceof C8594Fgv) {
            C8594Fgv c8594Fgv = (C8594Fgv) this;
            Fragment fragment = c8594Fgv.A03;
            String strGenerateActivityResultKey = fragment.generateActivityResultKey();
            c8594Fgv.A04.set(((AbstractC8583Fgi) c8594Fgv.A02.apply(null)).A01(c8594Fgv.A00, c8594Fgv.A01, fragment, strGenerateActivityResultKey));
            return;
        }
        Fragment fragment2 = ((HiB) this).A00;
        fragment2.mSavedStateRegistryController.A01.A00();
        A6H.A02(fragment2);
        Bundle bundle = fragment2.mSavedFragmentState;
        fragment2.mSavedStateRegistryController.A01(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
