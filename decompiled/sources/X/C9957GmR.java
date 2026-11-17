package X;

import java.lang.reflect.Constructor;

/* renamed from: X.GmR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9957GmR extends AbstractC9962GmZ {
    public static final long serialVersionUID = 1;
    public final transient Constructor<?> A00;
    public C9937Glg _annotated;

    public Object readResolve() {
        return new C9957GmR(this, this._annotated);
    }

    public Object writeReplace() {
        return this._annotated == null ? new C9957GmR(this, new C9937Glg(null, null, this.A00, null)) : this;
    }

    public C9957GmR(AbstractC9915Gl5 abstractC9915Gl5, C9937Glg c9937Glg) {
        super(abstractC9915Gl5);
        this._annotated = c9937Glg;
        Constructor<?> constructor = c9937Glg == null ? null : c9937Glg._constructor;
        this.A00 = constructor;
        if (constructor == null) {
            throw C60O.A0i("Missing constructor (broken JDK (de)serialization?)");
        }
    }

    public C9957GmR(AbstractC9915Gl5 abstractC9915Gl5, Constructor<?> constructor) {
        super(abstractC9915Gl5);
        this.A00 = constructor;
    }
}
