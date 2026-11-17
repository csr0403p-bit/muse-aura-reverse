package X;

import java.util.ArrayList;

/* renamed from: X.9uR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9uR<ElementKlass, Element extends ElementKlass> extends C9tX<Element, Element[], ArrayList<Element>> {
    public final C9uG<ElementKlass> A00;
    public final C9iZ A01;

    public C9uR(C9uG<ElementKlass> c9uG, C9hr<Element> c9hr) {
        super(c9hr);
        this.A00 = c9uG;
        C9iZ descriptor = c9hr.getDescriptor();
        C7384Etj.A0Y(descriptor, 0);
        this.A01 = new C9uS(descriptor);
    }
}
