package X;

import kotlinx.serialization.SerializationException;

/* renamed from: X.9uA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9uA<A, B, C> implements C9hr<HwV<? extends A, ? extends B, ? extends C>> {
    public final C9hr<A> A00;
    public final C9hr<B> A01;
    public final C9hr<C> A02;
    public final C9iZ A03 = C9iY.A01("X.HwV", new C2291BSr(this, 2));

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = this.A03;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Object obj = C9uI.A00;
        Object objA8a = obj;
        Object objA8a2 = obj;
        Object objA8a3 = obj;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                if (objA8a == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objA8a2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objA8a3 != obj) {
                    return new HwV(objA8a, objA8a2, objA8a3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iA8N == 0) {
                objA8a = c9j4A55.A8a(this.A00, c9iZ, 0);
            } else if (iA8N == 1) {
                objA8a2 = c9j4A55.A8a(this.A01, c9iZ, 1);
            } else {
                if (iA8N != 2) {
                    throw new SerializationException(FGI.A0H("Unexpected index ", iA8N));
                }
                objA8a3 = c9j4A55.A8a(this.A02, c9iZ, 2);
            }
        }
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A03;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        HwV hwV = (HwV) obj;
        boolean zA1a = AnonymousClass002.A1a(interfaceC07789is, hwV);
        C9iZ c9iZ = this.A03;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AAQ(hwV.first, this.A00, c9iZ, 0);
        c9j5A56.AAQ(hwV.second, this.A01, c9iZ, zA1a ? 1 : 0);
        c9j5A56.AAQ(hwV.third, this.A02, c9iZ, 2);
        c9j5A56.AAd(c9iZ);
    }

    public C9uA(C9hr<A> c9hr, C9hr<B> c9hr2, C9hr<C> c9hr3) {
        this.A00 = c9hr;
        this.A01 = c9hr2;
        this.A02 = c9hr3;
    }
}
