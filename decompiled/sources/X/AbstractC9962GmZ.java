package X;

/* renamed from: X.GmZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9962GmZ extends AbstractC9915Gl5 {
    public final AbstractC9915Gl5 delegate;

    public final AbstractC9915Gl5 A0S(AbstractC9915Gl5 abstractC9915Gl5) {
        if (this instanceof C10077Goy) {
            return new C10077Goy(abstractC9915Gl5, ((C10077Goy) this)._accessor);
        }
        if (this instanceof C9992GnK) {
            throw C3cG.A0Q("Should never try to reset delegate");
        }
        C9957GmR c9957GmR = (C9957GmR) this;
        return abstractC9915Gl5 != c9957GmR.delegate ? new C9957GmR(abstractC9915Gl5, c9957GmR.A00) : c9957GmR;
    }

    public AbstractC9962GmZ(AbstractC9915Gl5 abstractC9915Gl5) {
        super(abstractC9915Gl5);
        this.delegate = abstractC9915Gl5;
    }
}
