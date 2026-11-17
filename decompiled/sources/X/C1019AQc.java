package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.AQc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1019AQc extends Ab8<C1020AQd> {
    public APZ A00;
    public Function0<Boolean> A01;
    public final float A02;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new C1020AQd(this.A00, this.A01, this.A02);
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1019AQc)) {
            return false;
        }
        C1019AQc c1019AQc = (C1019AQc) obj;
        return C7384Etj.areEqual(this.A00, c1019AQc.A00) && this.A01 == c1019AQc.A01 && this.A02 == c1019AQc.A02;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A00)), this.A02);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "renderInSharedTransitionOverlay";
        BHD bhd = asf.A02;
        bhd.A01("sharedTransitionScope", this.A00);
        bhd.A01("renderInOverlay", this.A01);
        bhd.A01("zIndexInOverlay", Float.valueOf(this.A02));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1020AQd c1020AQd = (C1020AQd) abstractC1439Aj8;
        c1020AQd.A02 = this.A00;
        c1020AQd.A03 = this.A01;
        c1020AQd.A05.AdS(this.A02);
    }

    public C1019AQc(APZ apz, Function0<Boolean> function0, float f) {
        this.A00 = apz;
        this.A01 = function0;
        this.A02 = f;
    }
}
