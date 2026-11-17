package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class A65<E> extends A67<E, Set<? extends E>, LinkedHashSet<E>> {
    public final C9iZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A65(C9hr<E> c9hr) {
        super(c9hr);
        C7384Etj.A0Y(c9hr, 0);
        C9iZ descriptor = c9hr.getDescriptor();
        C7384Etj.A0Y(descriptor, 0);
        this.A00 = new A6A(descriptor);
    }
}
