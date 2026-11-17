package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class BA7 extends BAB {
    @Override // X.BA6, X.BAE
    public final void Af7(View view, Window window, BAD bad, BAD bad2, boolean z, boolean z2) {
        boolean zA1a = AnonymousClass002.A1a(bad, bad2);
        AnonymousClass002.A1B(window, 2, view);
        BA9.A00(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || ((ViewGroup.LayoutParams) attributes).width != -2 || ((ViewGroup.LayoutParams) attributes).height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new C8478Fel(viewGroup.getContext(), Arrays.asList(new C8480Fen(2), new C8480Fen(zA1a ? 1 : 0), new C8480Fen(4), new C8480Fen(8))));
        }
        window.setNavigationBarContrastEnforced(zA1a);
        C1971Avc c1971Avc = new C1971Avc(view, window);
        c1971Avc.A01(!z);
        c1971Avc.A00(!z2);
    }
}
