package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ASM extends Ab8<ASL> {
    public final float A00;
    public final boolean A01;
    public final G0U<ASF, Unit> A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            ASM asm = obj instanceof ASM ? (ASM) obj : null;
            if (asm == null || this.A00 != asm.A00 || this.A01 != ((ASM) obj).A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        float f = this.A00;
        boolean z = this.A01;
        ASL asl = new ASL();
        asl.A00 = f;
        asl.A01 = z;
        return asl;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00(C8j4.A04(this.A00), this.A01);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A02.invoke(asf);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ASL asl = (ASL) abstractC1439Aj8;
        asl.A00 = this.A00;
        asl.A01 = this.A01;
    }

    /* JADX WARN: Incorrect types in method signature: (FZLX/G0U<-LX/ASF;Lkotlin/Unit;>;)V */
    public ASM(G0U g0u, float f, boolean z) {
        this.A00 = f;
        this.A01 = z;
        this.A02 = g0u;
        if (f <= 0.0f) {
            throw C60O.A0i(FGI.A0R("aspectRatio ", " must be > 0", f));
        }
    }
}
