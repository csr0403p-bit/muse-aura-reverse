package X;

/* renamed from: X.DPf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5028DPf extends AbstractC5014DOf {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        (this instanceof C5032DPr ? ((C5032DPr) this).A00 : ((C5031DPq) this).A00).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        if (!(o instanceof DPD)) {
            return false;
        }
        DPD dpd = (DPD) o;
        if (dpd.A00() > 0) {
            return (this instanceof C5032DPr ? ((C5032DPr) this).A00 : ((C5031DPq) this).A00).A7Q(dpd.A01()) == dpd.A00();
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object object) {
        if (object instanceof DPD) {
            DPD dpd = (DPD) object;
            Object objA01 = dpd.A01();
            int iA00 = dpd.A00();
            if (iA00 != 0) {
                return (this instanceof C5032DPr ? ((C5032DPr) this).A00 : ((C5031DPq) this).A00).AdC(objA01, iA00, 0);
            }
        }
        return false;
    }
}
