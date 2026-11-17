package X;

/* renamed from: X.EnS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7355EnS extends AbstractC7352EnP implements InterfaceC7356EnT {
    @Override // X.AbstractC7349EnM
    public InterfaceC7350EnN computeReflected() {
        return this;
    }

    @Override // X.InterfaceC7356EnT
    public Object getDelegate(Object obj) {
        ((InterfaceC7356EnT) getReflected()).getDelegate(obj);
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC7356EnT
    public InterfaceC7360EnX getGetter() {
        ((InterfaceC7356EnT) getReflected()).getGetter();
        throw F60.createAndThrow();
    }

    @Override // X.G0U
    public Object invoke(Object obj) {
        return get(obj);
    }

    public AbstractC7355EnS(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* renamed from: getGetter, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC7367Ene m28getGetter() {
        getGetter();
        throw F60.createAndThrow();
    }
}
