package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.AKh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0973AKh {
    public void A01(boolean z) {
        View decorView;
        int systemUiVisibility;
        AbstractC2100AyP abstractC2100AyP = (AbstractC2100AyP) this;
        if (z) {
            Window window = abstractC2100AyP.A00;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            decorView = window.getDecorView();
            systemUiVisibility = decorView.getSystemUiVisibility() | 16;
        } else {
            decorView = abstractC2100AyP.A00.getDecorView();
            systemUiVisibility = decorView.getSystemUiVisibility() & (-17);
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
    }

    public void A02(boolean z) {
        View decorView;
        int systemUiVisibility;
        AbstractC2100AyP abstractC2100AyP = (AbstractC2100AyP) this;
        if (z) {
            Window window = abstractC2100AyP.A00;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            decorView = window.getDecorView();
            systemUiVisibility = 8192 | decorView.getSystemUiVisibility();
        } else {
            decorView = abstractC2100AyP.A00.getDecorView();
            systemUiVisibility = (-8193) & decorView.getSystemUiVisibility();
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
    }

    public boolean A03() {
        return AnonymousClass002.A1L(((AbstractC2100AyP) this).A00.getDecorView().getSystemUiVisibility() & 16);
    }

    public boolean A04() {
        return AnonymousClass002.A1L(((AbstractC2100AyP) this).A00.getDecorView().getSystemUiVisibility() & 8192);
    }
}
