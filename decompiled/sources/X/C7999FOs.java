package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.FOs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7999FOs {
    public final ColorData A00;
    public final ColorData A01;

    public C7999FOs() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7999FOs) {
                C7999FOs c7999FOs = (C7999FOs) obj;
                if (!C7384Etj.areEqual(this.A00, c7999FOs.A00) || !C7384Etj.areEqual(this.A01, c7999FOs.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0D(this.A00) * 31) + C3cH.A02(this.A01);
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", solidBackgroundColor=", C3cG.A0f(this.A00, "BottomSheetBackgroundUpdate(dimmedBackgroundColor="));
    }

    public C7999FOs(ColorData colorData, ColorData colorData2) {
        this.A00 = colorData;
        this.A01 = colorData2;
    }
}
