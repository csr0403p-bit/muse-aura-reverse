package X;

import com.meta.maps.fancypins.FancyPin;
import com.meta.maps.fancypins.FancyPinAccessibilityDelegate;

/* renamed from: X.Fpf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8833Fpf implements FancyPinAccessibilityDelegate {
    public final /* synthetic */ C8832Fpe A00;

    @Override // com.meta.maps.fancypins.FancyPinAccessibilityDelegate
    public final boolean activatePin(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.A04(str);
    }

    @Override // com.meta.maps.fancypins.FancyPinAccessibilityDelegate
    public final boolean isPinSelected(String str) {
        C7384Etj.A0Y(str, 0);
        return str.equals(this.A00.A02);
    }

    @Override // com.meta.maps.fancypins.FancyPinAccessibilityDelegate
    public final CharSequence labelForPin(String str) {
        FancyPin fancyPin;
        C7384Etj.A0Y(str, 0);
        C8832Fpe c8832Fpe = this.A00;
        String strA0h = BV4.A0h(str, c8832Fpe.A08);
        if (strA0h == null) {
            HrT hrT = c8832Fpe.A0A;
            strA0h = null;
            if (hrT != null && ((C8830Fpc) hrT).A00.pin(str) == null && (fancyPin = c8832Fpe.A06.get(str)) != null) {
                AbstractC7611F5y.A0P(fancyPin);
            }
        }
        return strA0h;
    }

    public C8833Fpf(C8832Fpe c8832Fpe) {
        this.A00 = c8832Fpe;
    }
}
