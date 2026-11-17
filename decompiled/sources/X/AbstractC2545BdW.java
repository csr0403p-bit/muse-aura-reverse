package X;

import android.graphics.RectF;
import android.util.Size;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.BdW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2545BdW implements InterfaceC2544BdV {
    public final InterfaceC2544BdV A00;

    @Override // X.InterfaceC2544BdV
    public final void A3w(BeX beX, Executor executor) {
        this.A00.A3w(beX, executor);
    }

    @Override // X.InterfaceC2544BdV
    public final String ADH() {
        return this instanceof C2560Bdo ? ((C2560Bdo) this).A01 : this.A00.ADH();
    }

    @Override // X.InterfaceC2544BdV
    public final C2511Bch ADK() {
        return this.A00.ADK();
    }

    @Override // X.InterfaceC2544BdV
    public final InterfaceC2420Baw AF7() {
        return this.A00.AF7();
    }

    @Override // X.InterfaceC2544BdV
    public final InterfaceC2544BdV AGM() {
        return this instanceof C2561Bdp ? ((C2561Bdp) this).A01 : this.A00.AGM();
    }

    @Override // X.InterfaceC2546BdX
    public final String AGN() {
        return this.A00.AGN();
    }

    @Override // X.InterfaceC2546BdX
    public final int AH3() {
        return this.A00.AH3();
    }

    @Override // X.InterfaceC2546BdX
    public final int AKN() {
        return this instanceof C2560Bdo ? AKO(0) : this.A00.AKN();
    }

    @Override // X.InterfaceC2546BdX
    public final int AKO(int i) {
        if (!(this instanceof C2560Bdo)) {
            return this.A00.AKO(i);
        }
        C2560Bdo c2560Bdo = (C2560Bdo) this;
        int iAKO = ((AbstractC2545BdW) c2560Bdo).A00.AKO(i) - c2560Bdo.A00;
        RectF rectF = BfO.A00;
        return ((iAKO % 360) + 360) % 360;
    }

    @Override // X.InterfaceC2544BdV
    public final Set<C2507Bcd> ALL() {
        return this.A00.ALL();
    }

    @Override // X.InterfaceC2544BdV
    public final List<Size> ALO(int i) {
        return this.A00.ALO(i);
    }

    @Override // X.InterfaceC2544BdV
    public final List<Size> ALQ(int i) {
        return this.A00.ALQ(i);
    }

    @Override // X.InterfaceC2544BdV
    public final BWz ALg() {
        return this.A00.ALg();
    }

    @Override // X.InterfaceC2546BdX
    public final AbstractC5306Dfp<InterfaceC2779Bkw> AMz() {
        return (this instanceof C2561Bdp ? ((C2561Bdp) this).A01 : this.A00).AMz();
    }

    @Override // X.InterfaceC2544BdV
    public final boolean APH() {
        return this.A00.APH();
    }

    @Override // X.InterfaceC2544BdV
    public final void Aaw(BeX beX) {
        this.A00.Aaw(beX);
    }

    public AbstractC2545BdW(InterfaceC2544BdV interfaceC2544BdV) {
        this.A00 = interfaceC2544BdV;
    }
}
