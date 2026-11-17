package X;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: X.9tX, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9tX<Element, Collection, Builder> extends C9tY<Element, Collection, Builder> {
    public final C9hr<Element> A00;

    /* JADX WARN: Incorrect types in method signature: (LX/9j4;ITBuilder;Z)V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C9tY
    public void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C7384Etj.A0Y(c9j4, 0);
        A08(obj, i, c9j4.A8a(this.A00, getDescriptor(), i));
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, Collection collection) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        int iA02 = A02(collection);
        C9iZ descriptor = getDescriptor();
        C7384Etj.A0Y(descriptor, 1);
        C9j5 c9j5A56 = interfaceC07789is.A56(descriptor);
        Iterator<Element> itA06 = A06(collection);
        for (int i = 0; i < iA02; i++) {
            c9j5A56.AAQ(itA06.next(), this.A00, descriptor, i);
        }
        c9j5A56.AAd(descriptor);
    }

    public static C9iZ A00(Class cls, C9hr c9hr) {
        return new C9uR(new C0861A6i(cls), c9hr).A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A08(Builder builder, int i, Element element) {
        if (this instanceof C9uR) {
            AbstractList abstractList = (AbstractList) builder;
            C7384Etj.A0Y(abstractList, 0);
            abstractList.add(i, element);
        } else {
            if (this instanceof C9tZ) {
                throw C3cG.A0Q("This method lead to boxing and must not be used, use Builder.append instead");
            }
            AbstractCollection abstractCollection = (AbstractCollection) builder;
            C7384Etj.A0Y(abstractCollection, 0);
            abstractCollection.add(element);
        }
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return this instanceof C9uR ? ((C9uR) this).A01 : this instanceof A65 ? ((A65) this).A00 : ((A66) this).A00;
    }

    public C9tX(C9hr<Element> c9hr) {
        this.A00 = c9hr;
    }
}
