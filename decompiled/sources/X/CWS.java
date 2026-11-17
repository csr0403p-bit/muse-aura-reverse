package X;

import java.lang.ref.PhantomReference;

/* loaded from: classes5.dex */
public abstract class CWS extends PhantomReference<Object> {
    public CWS A00;
    public CWS A01;

    public CWS() {
        super(null, CWU.A02);
    }

    public abstract void destruct();
}
