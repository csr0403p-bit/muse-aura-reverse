package X;

import java.io.Serializable;
import java.lang.reflect.Method;

/* renamed from: X.Glc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9934Glc extends AbstractC10024Gnx implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient Method A00;
    public Class<?>[] _paramClasses;
    public C10123Gpo _serialization;

    public C9934Glc(C10123Gpo c10123Gpo) {
        super(null, null, null);
        this.A00 = null;
        this._serialization = c10123Gpo;
    }

    @Override // X.AbstractC10031Go7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        Class<?> cls = getClass();
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        if (obj == null || obj.getClass() != cls) {
            return false;
        }
        return C6xC.A00(this.A00, ((C9934Glc) obj).A00);
    }

    @Override // X.AbstractC10031Go7
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public Object readResolve() throws NoSuchMethodException, SecurityException {
        C10123Gpo c10123Gpo = this._serialization;
        Class<?> cls = c10123Gpo.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(c10123Gpo.name, c10123Gpo.args);
            if (!declaredMethod.isAccessible()) {
                AbstractC9855Gj3.A0H(declaredMethod, false);
            }
            return new C9934Glc(null, null, declaredMethod, null);
        } catch (Exception unused) {
            throw C60O.A0i(FGI.A0d("Could not find method '", this._serialization.name, "' from Class '", cls.getName()));
        }
    }

    @Override // X.AbstractC10031Go7
    public final String toString() {
        return FGI.A0U("[method ", A0E(), "]");
    }

    public Object writeReplace() {
        Method method = this.A00;
        C10123Gpo c10123Gpo = new C10123Gpo();
        c10123Gpo.clazz = method.getDeclaringClass();
        c10123Gpo.name = method.getName();
        c10123Gpo.args = method.getParameterTypes();
        return new C9934Glc(c10123Gpo);
    }

    @Override // X.AbstractC9970Gmj
    public final String A0E() {
        StringBuilder sbA0g;
        String str;
        String strA0E = super.A0E();
        Method method = this.A00;
        int length = method.getParameterTypes().length;
        if (length == 0) {
            sbA0g = C3cG.A0g(strA0E);
            str = "()";
        } else {
            if (length != 1) {
                return String.format("%s(%d params)", BV5.A1a(super.A0E(), method.getParameterTypes().length));
            }
            sbA0g = C3cG.A0g(strA0E);
            sbA0g.append("(");
            BV6.A18(A0J(0), sbA0g);
            str = ")";
        }
        return AnonymousClass001.A0v(str, sbA0g);
    }

    public C9934Glc(C9971Gmk c9971Gmk, InterfaceC10166Gqb interfaceC10166Gqb, Method method, C9971Gmk[] c9971GmkArr) {
        super(c9971Gmk, interfaceC10166Gqb, c9971GmkArr);
        if (method != null) {
            this.A00 = method;
            return;
        }
        throw C60O.A0i("Cannot construct AnnotatedMethod with null Method");
    }
}
