package X;

import com.sun.jna.Callback;
import kotlin.Unit;

/* renamed from: X.Ajc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1469Ajc extends Ab8<C1473Ajg> {
    public final long A00;
    public final long A01;
    public final G0U<C2LD, Unit> A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1469Ajc) {
                C1469Ajc c1469Ajc = (C1469Ajc) obj;
                if (this.A01 != c1469Ajc.A01 || this.A00 != c1469Ajc.A00 || this.A02 != c1469Ajc.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1473Ajg c1473Ajg = (C1473Ajg) abstractC1439Aj8;
        c1473Ajg.A01 = this.A01;
        c1473Ajg.A00 = this.A00;
        c1473Ajg.A03 = this.A02;
        InterfaceC1435Aj4 interfaceC1435Aj4 = c1473Ajg.A02;
        if (interfaceC1435Aj4 != null) {
            interfaceC1435Aj4.Ahh();
        }
        c1473Ajg.A02 = AbstractC1462AjV.A01(c1473Ajg, c1473Ajg.A03, c1473Ajg.A01, c1473Ajg.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        long j = this.A01;
        long j2 = this.A00;
        G0U<C2LD, Unit> g0u = this.A02;
        C1473Ajg c1473Ajg = new C1473Ajg();
        c1473Ajg.A01 = j;
        c1473Ajg.A00 = j2;
        c1473Ajg.A03 = g0u;
        return c1473Ajg;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, ((((int) this.A01) * 31) + ((int) this.A00)) * 31);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "onRectChanged";
        BHD bhd = asf.A02;
        bhd.A01("throttleMillis", Long.valueOf(this.A01));
        bhd.A01("debounceMillis", Long.valueOf(this.A00));
        bhd.A01(Callback.METHOD_NAME, this.A02);
    }

    /* JADX WARN: Incorrect types in method signature: (JJLX/G0U<-LX/2LD;Lkotlin/Unit;>;)V */
    public C1469Ajc(G0U g0u, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = g0u;
    }
}
