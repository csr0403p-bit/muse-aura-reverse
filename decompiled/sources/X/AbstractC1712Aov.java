package X;

import android.view.KeyEvent;

/* renamed from: X.Aov, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1712Aov {
    public static final int A00(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return C8j4.A1U(action) ? 1 : 0;
        }
        return 2;
    }
}
