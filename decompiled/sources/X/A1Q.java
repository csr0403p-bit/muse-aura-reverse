package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class A1Q<T> implements C9cd<A1S<T>> {
    public final C9iZ A00;
    public final /* synthetic */ C9hr<?> A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = this.A00;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = A1S.A02;
        List listA0Q = null;
        List list = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new A1S(listA0Q, list, i);
            }
            if (iA8N == 0) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                list = (List) c9j4A55.A8a(C3cG.A19(this.A01), c9iZ, 1);
                i |= 2;
            }
        }
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C3cH.A0z(A1S.A02), C3cG.A19(this.A01)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A00;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        A1S a1s = (A1S) obj;
        boolean zA1a = AnonymousClass002.A1a(interfaceC07789is, a1s);
        C9iZ c9iZ = this.A00;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        C9hr<?> c9hr = this.A01;
        c9j5A56.AAQ(a1s.A00, C3cH.A15(A1S.A02, 0), c9iZ, 0);
        c9j5A56.AAQ(a1s.A01, C3cG.A19(c9hr), c9iZ, zA1a ? 1 : 0);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final C9hr<?>[] typeParametersSerializers() {
        return new C9hr[]{this.A01};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A1Q(C9hr<T> c9hr) {
        this();
        this.A01 = c9hr;
    }

    public A1Q() {
        C9iK c9iKA1C = C3cG.A1C("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        c9iKA1C.A08(BrowserOperationCatalogKt.KEYS, false);
        c9iKA1C.A08("values", false);
        this.A00 = c9iKA1C;
    }
}
