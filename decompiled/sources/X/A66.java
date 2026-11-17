package X;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class A66<E> extends A67<E, Set<? extends E>, HashSet<E>> {
    public final C9iZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A66(C9hr<E> c9hr) {
        super(c9hr);
        C7384Etj.A0Y(c9hr, 0);
        C9iZ descriptor = c9hr.getDescriptor();
        C7384Etj.A0Y(descriptor, 0);
        this.A00 = new A69(descriptor);
    }
}
