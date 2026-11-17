package X;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fbx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8330Fbx {
    public static AbstractC8571FgQ A00(FragmentActivity fragmentActivity) {
        return fragmentActivity.mFragments.A00.A03;
    }

    public final View A01(int i) {
        if (this instanceof C8576FgZ) {
            return ((C8576FgZ) this).A00.findViewById(i);
        }
        if (!(this instanceof C8287FbB)) {
            C8303FbU c8303FbU = (C8303FbU) this;
            AbstractC8330Fbx abstractC8330Fbx = c8303FbU.A01;
            return abstractC8330Fbx.A02() ? abstractC8330Fbx.A01(i) : c8303FbU.A00.onFindViewById(i);
        }
        Fragment fragment = ((C8287FbB) this).A00;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw BV8.A0m(" does not have a view", AbstractC7609F5w.A0u(fragment));
    }

    public final boolean A02() {
        if (this instanceof C8576FgZ) {
            Window window = ((C8576FgZ) this).A00.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
        if (this instanceof C8287FbB) {
            return AnonymousClass002.A1X(((C8287FbB) this).A00.mView);
        }
        C8303FbU c8303FbU = (C8303FbU) this;
        return c8303FbU.A01.A02() || c8303FbU.A00.mDialogCreated;
    }
}
