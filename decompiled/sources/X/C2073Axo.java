package X;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* renamed from: X.Axo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2073Axo {
    public Integer A00;

    public final Integer A00(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.A00 = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.A00;
        if (num != null) {
            this.A00 = null;
            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
            if (deadChar != 0) {
                unicodeChar = deadChar;
            }
        }
        return Integer.valueOf(unicodeChar);
    }
}
