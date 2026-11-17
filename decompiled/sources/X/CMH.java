package X;

import android.content.res.Resources;

/* loaded from: classes5.dex */
public final class CMH {
    public final Resources.Theme A00;
    public final Resources A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                CMH cmh = (CMH) obj;
                if (!this.A01.equals(cmh.A01) || !Ht0.A00(this.A00, cmh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(this.A01, this.A00);
    }

    public CMH(Resources.Theme theme, Resources resources) {
        this.A01 = resources;
        this.A00 = theme;
    }
}
