package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AtU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1909AtU extends Ab8<C1893AtC> {
    public final AuJ A00;
    public final C1881Asv A01;
    public final TransformedTextFieldState A02;
    public final C1822Arm A03;
    public final G0V<AXN, Function0<C1958Aux>, Unit> A04;
    public final boolean A05;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1909AtU) {
                C1909AtU c1909AtU = (C1909AtU) obj;
                if (this.A05 != c1909AtU.A05 || !C7384Etj.areEqual(this.A01, c1909AtU.A01) || !C7384Etj.areEqual(this.A02, c1909AtU.A02) || !C7384Etj.areEqual(this.A03, c1909AtU.A03) || this.A04 != c1909AtU.A04 || !C7384Etj.areEqual(this.A00, c1909AtU.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1881Asv c1881Asv = this.A01;
        TransformedTextFieldState transformedTextFieldState = this.A02;
        C1822Arm c1822Arm = this.A03;
        boolean z = this.A05;
        return new C1893AtC(this.A00, c1881Asv, transformedTextFieldState, c1822Arm, this.A04, z);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, C0KA.A02(this.A05)))) + C60R.A01(this.A04)) * 31);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1893AtC c1893AtC = (C1893AtC) abstractC1439Aj8;
        C1881Asv c1881Asv = this.A01;
        TransformedTextFieldState transformedTextFieldState = this.A02;
        C1822Arm c1822Arm = this.A03;
        boolean z = this.A05;
        G0V<AXN, Function0<C1958Aux>, Unit> g0v = this.A04;
        AuJ auJ = this.A00;
        C1881Asv c1881Asv2 = c1893AtC.A00;
        c1893AtC.A00 = c1881Asv;
        c1881Asv.A01 = g0v;
        c1893AtC.A01 = z;
        c1881Asv.A00.A03.Af8(new C1931Atu(transformedTextFieldState, c1822Arm, z, !z, AnonymousClass003.A17(auJ.A02)));
        if (C7384Etj.areEqual(c1881Asv2, c1881Asv)) {
            return;
        }
        c1893AtC.A03.A00(c1881Asv.A02);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Asv;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;LX/Arm;ZLX/G0V<-LX/AXN;-Lkotlin/jvm/functions/Function0<LX/Aux;>;Lkotlin/Unit;>;LX/AuJ;)V */
    public C1909AtU(AuJ auJ, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, C1822Arm c1822Arm, G0V g0v, boolean z) {
        this.A01 = c1881Asv;
        this.A02 = transformedTextFieldState;
        this.A03 = c1822Arm;
        this.A05 = z;
        this.A04 = g0v;
        this.A00 = auJ;
    }
}
