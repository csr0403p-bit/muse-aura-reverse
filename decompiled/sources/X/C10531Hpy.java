package X;

import android.content.res.Resources;

/* renamed from: X.Hpy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10531Hpy {
    public final int A00;
    public final Resources.Theme A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10531Hpy) {
                C10531Hpy c10531Hpy = (C10531Hpy) obj;
                if (!C7384Etj.areEqual(this.A01, c10531Hpy.A01) || this.A00 != c10531Hpy.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Key(theme=");
        sbA0x.append(this.A01);
        sbA0x.append(", id=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C10531Hpy(Resources.Theme theme, int i) {
        this.A01 = theme;
        this.A00 = i;
    }
}
