package X;

import android.text.TextUtils;

/* renamed from: X.FrY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8860FrY implements InterfaceC8864Frc {
    public int A00;
    public int A01;
    public String A02;

    public final boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (obj instanceof AbstractC8860FrY) {
                AbstractC8860FrY abstractC8860FrY = (AbstractC8860FrY) obj;
                int i2 = this.A00;
                if (i2 < 0 || (i = abstractC8860FrY.A00) < 0 ? TextUtils.equals(this.A02, abstractC8860FrY.A02) : !(!TextUtils.equals(this.A02, abstractC8860FrY.A02) || i2 != i)) {
                    if (this.A01 == abstractC8860FrY.A01) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(this.A02, Integer.valueOf(this.A01));
    }
}
