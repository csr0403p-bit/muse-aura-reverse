package X;

import com.google.gson.JsonSyntaxException;

/* JADX INFO: Add missing generic type declarations: [T1] */
/* loaded from: classes5.dex */
public final class EY6<T1> extends AbstractC6735EXt<T1> {
    public final /* synthetic */ F4L A00;
    public final /* synthetic */ Class A01;

    public EY6(F4L f4l, Class cls) {
        this.A00 = f4l;
        this.A01 = cls;
    }

    @Override // X.AbstractC6735EXt
    public final T1 read(EY1 ey1) {
        T1 t1 = (T1) ((AbstractC6735EXt) this.A00.A01).read(ey1);
        if (t1 != null) {
            Class cls = this.A01;
            if (!cls.isInstance(t1)) {
                throw new JsonSyntaxException(FGI.A0j("Expected a ", cls.getName(), " but was ", C60Q.A0e(t1), "; at path ", ey1.A0T()));
            }
        }
        return t1;
    }

    @Override // X.AbstractC6735EXt
    public final void write(C6733EXr c6733EXr, T1 t1) {
        ((AbstractC6735EXt) this.A00.A01).write(c6733EXr, t1);
    }
}
