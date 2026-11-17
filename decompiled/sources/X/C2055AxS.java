package X;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: X.AxS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2055AxS extends AbstractC0973AKh {
    public Window A00;
    public final WindowInsetsController A01;
    public final DQZ A02;
    public final C2066Axg A03;
    public final C1971Avc A04;

    private void A00(boolean z, int i, int i2) {
        Window window = this.A00;
        if (window != null) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? i | systemUiVisibility : (i ^ (-1)) & systemUiVisibility);
        } else {
            WindowInsetsController windowInsetsController = this.A01;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
            }
        }
    }

    @Override // X.AbstractC0973AKh
    public void A01(boolean z) {
        A00(z, 16, 16);
    }

    @Override // X.AbstractC0973AKh
    public void A02(boolean z) {
        A00(z, 8192, 8);
    }

    @Override // X.AbstractC0973AKh
    public boolean A03() {
        int systemBarsAppearance = 16;
        int systemUiVisibility = 16;
        Window window = this.A00;
        if (window != null) {
            systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        } else {
            WindowInsetsController windowInsetsController = this.A01;
            windowInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = windowInsetsController.getSystemBarsAppearance();
        }
        return AnonymousClass002.A1L(systemBarsAppearance & systemUiVisibility);
    }

    @Override // X.AbstractC0973AKh
    public boolean A04() {
        int systemBarsAppearance = 8192;
        int systemUiVisibility = 8;
        Window window = this.A00;
        if (window != null) {
            systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        } else {
            WindowInsetsController windowInsetsController = this.A01;
            windowInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = windowInsetsController.getSystemBarsAppearance();
        }
        return AnonymousClass002.A1L(systemBarsAppearance & systemUiVisibility);
    }

    public C2055AxS(Window window, C2066Axg c2066Axg, C1971Avc c1971Avc) {
        WindowInsetsController insetsController = window.getInsetsController();
        this.A02 = new DQZ();
        this.A01 = insetsController;
        this.A04 = c1971Avc;
        this.A03 = c2066Axg;
        this.A00 = window;
    }
}
