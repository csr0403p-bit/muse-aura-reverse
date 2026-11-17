package X;

import java.lang.reflect.Constructor;

/* renamed from: X.Glg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9937Glg extends AbstractC10024Gnx {
    public static final long serialVersionUID = 1;
    public final Constructor<?> _constructor;
    public HkL _serialization;

    public C9937Glg(HkL hkL) {
        super(null, null, null);
        this._constructor = null;
        this._serialization = hkL;
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
        return C6xC.A00(this._constructor, ((C9937Glg) obj)._constructor);
    }

    @Override // X.AbstractC10031Go7
    public final int hashCode() {
        return AnonymousClass006.A0D(this._constructor);
    }

    public Object readResolve() throws NoSuchMethodException, SecurityException {
        HkL hkL = this._serialization;
        Class<?> cls = hkL.clazz;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(hkL.args);
            if (!declaredConstructor.isAccessible()) {
                AbstractC9855Gj3.A0H(declaredConstructor, false);
            }
            return new C9937Glg(null, null, declaredConstructor, null);
        } catch (Exception unused) {
            throw C60O.A0i(FGI.A0W("Could not find constructor with ", " args from Class '", cls.getName(), this._serialization.args.length));
        }
    }

    @Override // X.AbstractC10031Go7
    public final String toString() {
        int length = this._constructor.getParameterTypes().length;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", AbstractC9855Gj3.A06(this._constructor.getDeclaringClass()), Integer.valueOf(length), length == 1 ? "" : "s", this.A00);
    }

    public Object writeReplace() {
        Constructor<?> constructor = this._constructor;
        HkL hkL = new HkL();
        hkL.clazz = constructor.getDeclaringClass();
        hkL.args = constructor.getParameterTypes();
        return new C9937Glg(hkL);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gqb;Ljava/lang/reflect/Constructor<*>;LX/Gmk;[LX/Gmk;)V */
    public C9937Glg(C9971Gmk c9971Gmk, InterfaceC10166Gqb interfaceC10166Gqb, Constructor constructor, C9971Gmk[] c9971GmkArr) {
        super(c9971Gmk, interfaceC10166Gqb, c9971GmkArr);
        constructor.getClass();
        this._constructor = constructor;
    }
}
