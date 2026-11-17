package X;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class E24 {
    public final E2B A00;
    public final AtomicBoolean A01 = C60O.A1E();

    public final InterfaceC5458Dit A00(Object... objArr) {
        Constructor<? extends InterfaceC5458Dit> constructorAE0;
        AtomicBoolean atomicBoolean = this.A01;
        synchronized (atomicBoolean) {
            if (atomicBoolean.get()) {
                constructorAE0 = null;
            } else {
                try {
                    constructorAE0 = this.A00.AE0();
                } catch (ClassNotFoundException unused) {
                    atomicBoolean.set(true);
                } catch (Exception e) {
                    throw BV4.A0d("Error instantiating extension", e);
                }
            }
        }
        if (constructorAE0 == null) {
            return null;
        }
        try {
            return constructorAE0.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public E24(E2B e2b) {
        this.A00 = e2b;
    }
}
