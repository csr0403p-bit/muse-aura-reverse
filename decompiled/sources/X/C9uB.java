package X;

import kotlinx.serialization.SerializationException;

/* renamed from: X.9uB, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9uB<K, V, R> implements C9hr<R> {
    public final C9hr<K> A00;
    public final C9hr<V> A01;

    @Override // X.C9jG
    public final R deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ descriptor = getDescriptor();
        C9j4 c9j4A55 = interfaceC07829iw.A55(descriptor);
        Object obj = C9uI.A00;
        Object objA8a = obj;
        Object objA8a2 = obj;
        while (true) {
            int iA8N = c9j4A55.A8N(getDescriptor());
            if (iA8N == -1) {
                if (objA8a == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objA8a2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                R r = this instanceof C9u7 ? (R) C3cG.A0r(objA8a, objA8a2) : (R) new AFN(objA8a, objA8a2);
                c9j4A55.AAd(descriptor);
                return r;
            }
            if (iA8N == 0) {
                objA8a = c9j4A55.A8a(this.A00, getDescriptor(), 0);
            } else {
                if (iA8N != 1) {
                    throw new SerializationException(FGI.A0H("Invalid index: ", iA8N));
                }
                objA8a2 = c9j4A55.A8a(this.A01, getDescriptor(), 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, R r) {
        Object key;
        Object value;
        C7384Etj.A0Y(interfaceC07789is, 0);
        C9j5 c9j5A56 = interfaceC07789is.A56(getDescriptor());
        C9iZ descriptor = getDescriptor();
        C9hr<K> c9hr = this.A00;
        boolean z = this instanceof C9u7;
        if (z) {
            HxE hxE = (HxE) r;
            C7384Etj.A0Y(hxE, 0);
            key = hxE.first;
        } else {
            key = C8j4.A15(r).getKey();
        }
        c9j5A56.AAQ(key, c9hr, descriptor, 0);
        C9iZ descriptor2 = getDescriptor();
        C9hr<V> c9hr2 = this.A01;
        if (z) {
            HxE hxE2 = (HxE) r;
            C7384Etj.A0Y(hxE2, 0);
            value = hxE2.second;
        } else {
            value = C8j4.A15(r).getValue();
        }
        c9j5A56.AAQ(value, c9hr2, descriptor2, 1);
        c9j5A56.AAd(getDescriptor());
    }

    public C9uB(C9hr<K> c9hr, C9hr<V> c9hr2) {
        this.A00 = c9hr;
        this.A01 = c9hr2;
    }
}
