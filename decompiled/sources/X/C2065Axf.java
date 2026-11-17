package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Axf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2065Axf extends Ab8<C2064Axe> {
    public final Object A00;
    public final Function0<Unit> A01;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2065Axf) {
                C2065Axf c2065Axf = (C2065Axf) obj;
                if (!C7384Etj.areEqual(this.A00, c2065Axf.A00) || this.A01 != c2065Axf.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        Object obj = this.A00;
        Function0<Unit> function0 = this.A01;
        C7384Etj.A0Y(function0, 1);
        C2064Axe c2064Axe = new C2064Axe();
        c2064Axe.A00 = obj;
        c2064Axe.A01 = function0;
        return c2064Axe;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, C60R.A01(this.A00) * 31);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C2064Axe c2064Axe = (C2064Axe) abstractC1439Aj8;
        C7384Etj.A0Y(c2064Axe, 0);
        Object obj = this.A00;
        if (!C7384Etj.areEqual(obj, c2064Axe.A00)) {
            c2064Axe.A00 = obj;
            c2064Axe.onReset();
        }
        Function0<Unit> function0 = this.A01;
        C7384Etj.A0Y(function0, 0);
        c2064Axe.A01 = function0;
    }

    public C2065Axf(Object obj, Function0<Unit> function0) {
        this.A00 = obj;
        this.A01 = function0;
    }
}
