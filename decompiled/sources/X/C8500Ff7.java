package X;

import android.graphics.Path;
import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: X.Ff7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8500Ff7 {
    public final DisplayCutout A00;

    public final Path A00() {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC8516FfN.A00(this.A00);
        }
        return null;
    }

    public final C8345FcJ A01() {
        return Build.VERSION.SDK_INT >= 30 ? C8345FcJ.A01(AbstractC8515FfM.A00(this.A00)) : C8345FcJ.A04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Ht0.A00(this.A00, ((C8500Ff7) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return BV8.A0v(this.A00, C60O.A0x("DisplayCutoutCompat{"));
    }

    public C8500Ff7(DisplayCutout displayCutout) {
        this.A00 = displayCutout;
    }
}
