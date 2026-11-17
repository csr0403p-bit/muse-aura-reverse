package X;

import X.FHL;

/* renamed from: X.FLl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7939FLl<C extends FHL, L> implements FHL {
    public final C A00;
    public final L A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7939FLl) {
                C7939FLl c7939FLl = (C7939FLl) obj;
                if (!this.A00.equals(c7939FLl.A00) || !C7384Etj.areEqual(this.A01, c7939FLl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.FHL
    public final /* bridge */ Integer AIw() {
        return null;
    }

    @Override // X.FHL
    public final int AK5() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", layoutData=", C3cG.A0f(this.A00, "ConfigWithLayoutData(config="));
    }

    public C7939FLl(C c, L l) {
        this.A00 = c;
        this.A01 = l;
        this.A02 = c.AK5();
    }
}
