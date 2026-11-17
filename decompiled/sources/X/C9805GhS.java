package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GhS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9805GhS extends AbstractC9807GhW<C9805GhS> implements Serializable {
    public static final long serialVersionUID = 1;
    public final List<AbstractC9804GhQ> _children;

    public final void A06(AbstractC9804GhQ abstractC9804GhQ) {
        if (abstractC9804GhQ == null) {
            abstractC9804GhQ = Gh1.A00;
        }
        this._children.add(abstractC9804GhQ);
    }

    @Override // X.InterfaceC9786Ggu
    public final void AcZ(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP) {
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_ARRAY, abstractC9996GnP, this);
        Iterator<AbstractC9804GhQ> it = this._children.iterator();
        while (it.hasNext()) {
            ((AbstractC9941Glq) it.next()).AcY(abstractC9919GlE, abstractC9842Gii);
        }
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C9805GhS)) {
            return false;
        }
        return this._children.equals(((C9805GhS) obj)._children);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return this._children.hashCode();
    }

    public C9805GhS(C9808GhY c9808GhY) {
        super(c9808GhY);
        this._children = C3cG.A0h();
    }
}
