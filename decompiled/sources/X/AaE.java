package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AaE extends Ab8<AaF> {
    public final G0U<BL4, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AaE) && this.A00 == ((AaE) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<BL4, Unit> g0u = this.A00;
        AaF aaF = new AaF();
        aaF.A01 = g0u;
        aaF.A00 = 2147483648L | (AuraImpressionTimeTracker.UNKNOWN_TIME << 32);
        return aaF;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "onSizeChanged";
        asf.A02.A01("onSizeChanged", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AaF aaF = (AaF) abstractC1439Aj8;
        aaF.A01 = this.A00;
        aaF.A00 = 2147483648L | (AuraImpressionTimeTracker.UNKNOWN_TIME << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AaE(G0U<? super BL4, Unit> g0u) {
        this.A00 = g0u;
    }
}
