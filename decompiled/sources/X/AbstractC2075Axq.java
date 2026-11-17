package X;

import android.view.KeyEvent;

/* renamed from: X.Axq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2075Axq {
    public static final boolean A00(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
