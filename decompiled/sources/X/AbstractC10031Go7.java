package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Executable;
import java.lang.reflect.Type;

/* renamed from: X.Go7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10031Go7 {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public final int A06() {
        if (this instanceof C9987GnD) {
            return 0;
        }
        return this instanceof C9959GmU ? ((C9959GmU) this)._owner.A06() : this instanceof C9943Glv ? ((C9943Glv) this).A00.getModifiers() : this instanceof C9934Glc ? ((C9934Glc) this).A00.getModifiers() : this instanceof C9937Glg ? ((C9937Glg) this)._constructor.getModifiers() : ((C9909Gkr) this).A05.getModifiers();
    }

    public final AbstractC9870GjI A07() {
        InterfaceC10166Gqb interfaceC10166Gqb;
        Type declaringClass;
        if (this instanceof C9987GnD) {
            return ((C9987GnD) this)._type;
        }
        if (this instanceof C9959GmU) {
            return ((C9959GmU) this)._type;
        }
        if (this instanceof C9943Glv) {
            C9943Glv c9943Glv = (C9943Glv) this;
            interfaceC10166Gqb = c9943Glv.A01;
            declaringClass = c9943Glv.A00.getGenericType();
        } else if (this instanceof C9934Glc) {
            C9934Glc c9934Glc = (C9934Glc) this;
            interfaceC10166Gqb = c9934Glc.A01;
            declaringClass = c9934Glc.A00.getGenericReturnType();
        } else {
            if (!(this instanceof C9937Glg)) {
                return ((C9909Gkr) this).A03;
            }
            C9937Glg c9937Glg = (C9937Glg) this;
            interfaceC10166Gqb = c9937Glg.A01;
            declaringClass = c9937Glg._constructor.getDeclaringClass();
        }
        return interfaceC10166Gqb.Aba(declaringClass);
    }

    public final Class<?> A08() {
        return this instanceof C9987GnD ? ((C9987GnD) this)._type._class : this instanceof C9959GmU ? ((C9959GmU) this)._type._class : this instanceof C9943Glv ? ((C9943Glv) this).A00.getType() : this instanceof C9934Glc ? ((C9934Glc) this).A00.getReturnType() : this instanceof C9937Glg ? ((C9937Glg) this)._constructor.getDeclaringClass() : ((C9909Gkr) this).A05;
    }

    public final String A09() {
        Executable executable;
        if (this instanceof C9987GnD) {
            return ((C9987GnD) this)._name;
        }
        if (this instanceof C9959GmU) {
            return "";
        }
        if (this instanceof C9943Glv) {
            return ((C9943Glv) this).A00.getName();
        }
        if (this instanceof C9934Glc) {
            executable = ((C9934Glc) this).A00;
        } else {
            if (!(this instanceof C9937Glg)) {
                return ((C9909Gkr) this).A05.getName();
            }
            executable = ((C9937Glg) this)._constructor;
        }
        return executable.getName();
    }

    public final <A extends Annotation> A A0A(Class<A> cls) {
        if (!(this instanceof AbstractC9970Gmj)) {
            return (A) ((C9909Gkr) this).A04.AC0(cls);
        }
        C9971Gmk c9971Gmk = ((AbstractC9970Gmj) this).A00;
        if (c9971Gmk == null) {
            return null;
        }
        return (A) c9971Gmk.AC0(cls);
    }

    public final AnnotatedElement A0B() {
        if ((this instanceof C9987GnD) || (this instanceof C9959GmU)) {
            return null;
        }
        if (this instanceof C9943Glv) {
            return ((C9943Glv) this).A00;
        }
        if (this instanceof C9934Glc) {
            return ((C9934Glc) this).A00;
        }
        if (this instanceof C9937Glg) {
            return ((C9937Glg) this)._constructor;
        }
        throw F60.createAndThrow();
    }
}
