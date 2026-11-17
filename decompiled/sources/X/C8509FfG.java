package X;

import android.view.WindowInsets;

/* renamed from: X.FfG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8509FfG extends AbstractC8499Ff6 {
    public final WindowInsets.Builder A00;

    public C8509FfG() {
        this.A00 = new WindowInsets.Builder();
    }

    public C8509FfG(C8497Ff4 c8497Ff4) {
        WindowInsets.Builder builder;
        super(c8497Ff4);
        WindowInsets windowInsetsA02 = c8497Ff4.A02();
        if (windowInsetsA02 != null) {
            builder = new WindowInsets.Builder(windowInsetsA02);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.A00 = builder;
    }
}
