package X;

import androidx.compose.ui.Alignment;
import kotlin.Unit;

/* renamed from: X.BUl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2337BUl extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final long A00;
    public final Object A01;
    public final Object A02;

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.$t != 0) {
            AT3 at3 = (AT3) obj;
            C7384Etj.A0Y(at3, 0);
            at3.A9d(null, (InterfaceC1068ATy) this.A01, (C16b) this.A02, 1.0f, 3, this.A00);
        } else {
            Alignment alignment = ((AQ1) this.A02).A01.A01;
            AZE aze = (AZE) this.A01;
            ((AYU) obj).A0B(aze, 0.0f, alignment.A4F(EnumC1820Arj.A02, AnonymousClass007.A0C(aze.A01, aze.A00), this.A00));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2337BUl(Object obj, AQ1<S> aq1, AZE aze, long j) {
        super(1);
        this.$t = aze;
        this.A02 = obj;
        this.A01 = aq1;
        this.A00 = j;
    }
}
