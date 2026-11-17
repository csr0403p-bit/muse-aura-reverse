package X;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class GL9 {
    public static GL9 A01 = new GL9();
    public final AtomicReference<GL8> A00 = BV4.A16(new GL8(BV4.A0u(), BV4.A0u()));

    public final synchronized <KeyT extends AbstractC9465GKh, PrimitiveT> void A00(GLE<KeyT, PrimitiveT> constructor) {
        AtomicReference<GL8> atomicReference = this.A00;
        GL8 gl8 = atomicReference.get();
        HashMap mapA0w = BV4.A0w(gl8.A00);
        HashMap mapA0w2 = BV4.A0w(gl8.A01);
        C10478Hks c10478Hks = new C10478Hks(constructor.A00, constructor.A01);
        if (mapA0w.containsKey(c10478Hks)) {
            Object obj = mapA0w.get(c10478Hks);
            if (!obj.equals(constructor) || !constructor.equals(obj)) {
                throw AbstractC7611F5y.A0a(c10478Hks, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
            }
        } else {
            mapA0w.put(c10478Hks, constructor);
        }
        atomicReference.set(new GL8(mapA0w, mapA0w2));
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void A01(GKY<InputPrimitiveT, WrapperPrimitiveT> wrapper) {
        AtomicReference<GL8> atomicReference = this.A00;
        GL8 gl8 = atomicReference.get();
        HashMap mapA0w = BV4.A0w(gl8.A00);
        HashMap mapA0w2 = BV4.A0w(gl8.A01);
        Class<WrapperPrimitiveT> clsAJ6 = wrapper.AJ6();
        if (mapA0w2.containsKey(clsAJ6)) {
            Object obj = mapA0w2.get(clsAJ6);
            if (!obj.equals(wrapper) || !wrapper.equals(obj)) {
                throw AbstractC7611F5y.A0a(clsAJ6, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
            }
        } else {
            mapA0w2.put(clsAJ6, wrapper);
        }
        atomicReference.set(new GL8(mapA0w, mapA0w2));
    }
}
