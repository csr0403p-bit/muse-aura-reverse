package X;

import java.lang.reflect.Executable;
import java.lang.reflect.Type;

/* renamed from: X.Gnx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10024Gnx extends AbstractC9970Gmj {
    public static final long serialVersionUID = 1;
    public final C9971Gmk[] _paramAnnotations;

    public final C9959GmU A0I(int i) {
        AbstractC9870GjI abstractC9870GjIA0H = A0H(i);
        InterfaceC10166Gqb interfaceC10166Gqb = this.A01;
        C9971Gmk[] c9971GmkArr = this._paramAnnotations;
        return new C9959GmU(abstractC9870GjIA0H, this, (c9971GmkArr == null || i < 0 || i >= c9971GmkArr.length) ? null : c9971GmkArr[i], interfaceC10166Gqb, i);
    }

    public final int A0G() {
        return (this instanceof C9934Glc ? ((C9934Glc) this).A00 : ((C9937Glg) this)._constructor).getParameterTypes().length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC9870GjI A0H(int i) {
        Executable executable;
        C9937Glg c9937Glg;
        if (this instanceof C9934Glc) {
            C9934Glc c9934Glc = (C9934Glc) this;
            executable = c9934Glc.A00;
            c9937Glg = c9934Glc;
        } else {
            C9937Glg c9937Glg2 = (C9937Glg) this;
            executable = c9937Glg2._constructor;
            c9937Glg = c9937Glg2;
        }
        Type[] genericParameterTypes = executable.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return c9937Glg.A01.Aba(genericParameterTypes[i]);
    }

    public final Class<?> A0J(int i) {
        Class<?>[] parameterTypes;
        if (this instanceof C9934Glc) {
            C9934Glc c9934Glc = (C9934Glc) this;
            parameterTypes = c9934Glc._paramClasses;
            if (parameterTypes == null) {
                parameterTypes = c9934Glc.A00.getParameterTypes();
                c9934Glc._paramClasses = parameterTypes;
            }
        } else {
            parameterTypes = ((C9937Glg) this)._constructor.getParameterTypes();
        }
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    public final Object A0K() {
        return this instanceof C9934Glc ? ((C9934Glc) this).A00.invoke(null, null) : ((C9937Glg) this)._constructor.newInstance(null);
    }

    public final Object A0L(Object obj) {
        return this instanceof C9934Glc ? ((C9934Glc) this).A00.invoke(null, obj) : ((C9937Glg) this)._constructor.newInstance(obj);
    }

    public AbstractC10024Gnx(C9971Gmk c9971Gmk, InterfaceC10166Gqb interfaceC10166Gqb, C9971Gmk[] c9971GmkArr) {
        super(c9971Gmk, interfaceC10166Gqb);
        this._paramAnnotations = c9971GmkArr;
    }
}
