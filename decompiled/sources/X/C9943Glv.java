package X;

import java.io.Serializable;
import java.lang.reflect.Field;

/* renamed from: X.Glv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9943Glv extends AbstractC9970Gmj implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient Field A00;
    public C10153GqK _serialization;

    public C9943Glv(C10153GqK c10153GqK) {
        super(null, null);
        this.A00 = null;
        this._serialization = c10153GqK;
    }

    public final void A0G(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.A00.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw BV4.A0Q(FGI.A0d("Failed to setValue() for field ", A0E(), ": ", e.getMessage()), e);
        }
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
        return C6xC.A00(this.A00, ((C9943Glv) obj).A00);
    }

    @Override // X.AbstractC10031Go7
    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public Object readResolve() throws NoSuchFieldException {
        C10153GqK c10153GqK = this._serialization;
        Class<?> cls = c10153GqK.clazz;
        try {
            Field declaredField = cls.getDeclaredField(c10153GqK.name);
            if (!declaredField.isAccessible()) {
                AbstractC9855Gj3.A0H(declaredField, false);
            }
            return new C9943Glv(null, null, declaredField);
        } catch (Exception unused) {
            throw C60O.A0i(FGI.A0d("Could not find method '", this._serialization.name, "' from Class '", cls.getName()));
        }
    }

    @Override // X.AbstractC10031Go7
    public final String toString() {
        return FGI.A0U("[field ", A0E(), "]");
    }

    public Object writeReplace() {
        Field field = this.A00;
        C10153GqK c10153GqK = new C10153GqK();
        c10153GqK.clazz = field.getDeclaringClass();
        c10153GqK.name = field.getName();
        return new C9943Glv(c10153GqK);
    }

    public C9943Glv(C9971Gmk c9971Gmk, InterfaceC10166Gqb interfaceC10166Gqb, Field field) {
        super(c9971Gmk, interfaceC10166Gqb);
        field.getClass();
        this.A00 = field;
    }
}
