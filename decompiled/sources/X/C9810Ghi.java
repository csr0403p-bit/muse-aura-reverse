package X;

import java.io.IOException;

/* renamed from: X.Ghi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9810Ghi implements InterfaceC9786Ggu {
    public Object A00;

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        return obj == this || ((obj instanceof C9810Ghi) && ((obj2 = this.A00) == (obj3 = ((C9810Ghi) obj).A00) || (obj2 != null && obj2.equals(obj3))));
    }

    @Override // X.InterfaceC9786Ggu
    public final void AcY(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii) throws IOException {
        Object obj = this.A00;
        if (obj instanceof InterfaceC9786Ggu) {
            ((InterfaceC9786Ggu) obj).AcY(abstractC9919GlE, abstractC9842Gii);
        } else if (obj instanceof InterfaceC10180Gqq) {
            abstractC9919GlE.A0e((InterfaceC10180Gqq) obj);
        } else {
            abstractC9919GlE.A0r(String.valueOf(obj));
        }
    }

    @Override // X.InterfaceC9786Ggu
    public final void AcZ(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP) throws IOException {
        Object obj = this.A00;
        if (obj instanceof InterfaceC9786Ggu) {
            ((InterfaceC9786Ggu) obj).AcZ(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP);
        } else if (obj instanceof InterfaceC10180Gqq) {
            AcY(abstractC9919GlE, abstractC9842Gii);
        }
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return String.format("[RawValue of type %s]", AbstractC9855Gj3.A07(this.A00));
    }
}
