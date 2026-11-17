package X;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;

/* renamed from: X.Gmj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9970Gmj extends AbstractC10031Go7 implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient C9971Gmk A00;
    public final transient InterfaceC10166Gqb A01;

    public static void A00(AbstractC9901Gkh abstractC9901Gkh, AbstractC9970Gmj abstractC9970Gmj) {
        boolean zA09 = abstractC9901Gkh.A09(EnumC9951GmA.A0L);
        Member memberA0F = abstractC9970Gmj.A0F();
        if (memberA0F != null) {
            AbstractC9855Gj3.A0H(memberA0F, zA09);
        }
    }

    public final Class<?> A0C() {
        if (this instanceof C9987GnD) {
            return ((C9987GnD) this)._declaringClass;
        }
        if (this instanceof C9959GmU) {
            return ((C9959GmU) this)._owner.A0C();
        }
        if (this instanceof C9943Glv) {
            return ((C9943Glv) this).A00.getDeclaringClass();
        }
        return (this instanceof C9934Glc ? ((C9934Glc) this).A00 : ((C9937Glg) this)._constructor).getDeclaringClass();
    }

    public final Object A0D(Object obj) {
        if (this instanceof C9987GnD) {
            throw C60Q.A0V("Cannot get virtual property '", ((C9987GnD) this)._name, "'");
        }
        if (this instanceof C9959GmU) {
            throw FGI.A0s(((C9959GmU) this)._owner.A0C(), "Cannot call getValue() on constructor parameter of ");
        }
        if (this instanceof C9943Glv) {
            C9943Glv c9943Glv = (C9943Glv) this;
            try {
                return c9943Glv.A00.get(obj);
            } catch (IllegalAccessException e) {
                throw BV4.A0Q(FGI.A0d("Failed to getValue() for field ", c9943Glv.A0E(), ": ", e.getMessage()), e);
            }
        }
        if (!(this instanceof C9934Glc)) {
            throw FGI.A0s(((C9937Glg) this)._constructor.getDeclaringClass(), "Cannot call getValue() on constructor of ");
        }
        C9934Glc c9934Glc = (C9934Glc) this;
        try {
            return c9934Glc.A00.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw BV4.A0Q(FGI.A0d("Failed to getValue() with method ", c9934Glc.A0E(), ": ", AbstractC9855Gj3.A0A(e2)), e2);
        }
    }

    public final Member A0F() {
        if (this instanceof C9987GnD) {
            return null;
        }
        return this instanceof C9959GmU ? ((C9959GmU) this)._owner.A0F() : this instanceof C9943Glv ? ((C9943Glv) this).A00 : this instanceof C9934Glc ? ((C9934Glc) this).A00 : ((C9937Glg) this)._constructor;
    }

    public AbstractC9970Gmj(C9971Gmk c9971Gmk, InterfaceC10166Gqb interfaceC10166Gqb) {
        this.A01 = interfaceC10166Gqb;
        this.A00 = c9971Gmk;
    }

    public String A0E() {
        return FGI.A0U(A0C().getName(), "#", A09());
    }
}
