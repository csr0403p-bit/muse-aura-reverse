package X;

import java.io.Serializable;

/* renamed from: X.GpI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10094GpI extends AbstractC10187Gqy implements Serializable {
    public static final long serialVersionUID = 1;
    public final AbstractC10187Gqy _t1;
    public final AbstractC10187Gqy _t2;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[ChainedTransformer(");
        AbstractC7608F5v.A1O(sbA0x, this._t1);
        sbA0x.append(this._t2);
        return AnonymousClass001.A0v(")]", sbA0x);
    }

    public C10094GpI(AbstractC10187Gqy abstractC10187Gqy, AbstractC10187Gqy abstractC10187Gqy2) {
        this._t1 = abstractC10187Gqy;
        this._t2 = abstractC10187Gqy2;
    }
}
