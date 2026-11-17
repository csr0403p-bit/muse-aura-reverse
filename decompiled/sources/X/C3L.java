package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class C3L implements C3I {
    public final C3I A00;

    @Override // X.C3I
    public final void APh(String str, int i) {
        C3I c3i = this.A00;
        AtomicReference<InterfaceC10426Hc0[]> atomicReference = C3M.A00;
        InterfaceC10426Hc0[] interfaceC10426Hc0Arr = atomicReference.get();
        if (interfaceC10426Hc0Arr != null && 0 < interfaceC10426Hc0Arr.length) {
            throw BV4.A0a("onSoFileLoaderLoadStart");
        }
        try {
            c3i.APh(str, i);
            InterfaceC10426Hc0[] interfaceC10426Hc0Arr2 = atomicReference.get();
            if (interfaceC10426Hc0Arr2 != null && 0 < interfaceC10426Hc0Arr2.length) {
                throw BV4.A0a("onSoFileLoaderLoadEnd");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InterfaceC10426Hc0[] interfaceC10426Hc0Arr3 = atomicReference.get();
                if (interfaceC10426Hc0Arr3 != null && 0 < interfaceC10426Hc0Arr3.length) {
                    throw BV4.A0a("onSoFileLoaderLoadEnd");
                }
                throw th2;
            }
        }
    }

    public C3L(C3I c3i) {
        this.A00 = c3i;
    }
}
