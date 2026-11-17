package X;

import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* renamed from: X.EnM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7349EnM implements InterfaceC7350EnN, Serializable {
    public static final Object NO_RECEIVER = C7366End.A00;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public transient InterfaceC7350EnN reflected;
    public final String signature;

    public abstract InterfaceC7350EnN computeReflected();

    public InterfaceC7350EnN compute() {
        InterfaceC7350EnN interfaceC7350EnN = this.reflected;
        if (interfaceC7350EnN != null) {
            return interfaceC7350EnN;
        }
        this.reflected = this;
        return this;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public F14 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? new F0U(cls) : new C0861A6i(cls);
    }

    public String getSignature() {
        return this.signature;
    }

    public AbstractC7349EnM(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public static final void A00(Appendable appendable, Class<?> cls) throws IOException {
        String str;
        while (cls.isArray()) {
            appendable.append("[");
            cls = cls.getComponentType();
            C7384Etj.A0U(cls);
        }
        if (cls.equals(Void.TYPE)) {
            str = "V";
        } else if (cls.equals(Integer.TYPE)) {
            str = "I";
        } else if (cls.equals(Long.TYPE)) {
            str = "J";
        } else if (cls.equals(Short.TYPE)) {
            str = "S";
        } else if (cls.equals(Byte.TYPE)) {
            str = "B";
        } else if (cls.equals(Boolean.TYPE)) {
            str = "Z";
        } else if (cls.equals(Character.TYPE)) {
            str = "C";
        } else if (cls.equals(Float.TYPE)) {
            str = "F";
        } else if (cls.equals(Double.TYPE)) {
            str = "D";
        } else {
            appendable.append("L");
            appendable.append(cls.getName().replace('.', '/'));
            str = ";";
        }
        appendable.append(str);
    }

    @Override // X.InterfaceC7350EnN
    public Object call(Object... objArr) {
        getReflected().call(objArr);
        throw null;
    }

    @Override // X.InterfaceC7350EnN
    public Object callBy(Map map) {
        getReflected().callBy(map);
        throw null;
    }

    public GenericDeclaration findJavaDeclaration() throws SecurityException, IOException {
        F14 owner = getOwner();
        String str = this.signature;
        C7384Etj.A0Y(str, 1);
        if (owner instanceof F0S) {
            String strA0S = C7BY.A0S(str, str, '(');
            if ("<init>".equals(strA0S)) {
                StringBuilder sbA0f = C3cG.A0f(owner, "Generic Java constructors are not supported: ");
                sbA0f.append('/');
                throw C8j3.A18(AnonymousClass001.A0v(str, sbA0f));
            }
            Method[] declaredMethods = ((F0S) owner).AGj().getDeclaredMethods();
            C7384Etj.A0U(declaredMethods);
            for (Method method : declaredMethods) {
                if (C7384Etj.areEqual(method.getName(), strA0S)) {
                    StringBuilder sbA0w = C60O.A0w();
                    sbA0w.append(method.getName());
                    sbA0w.append("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C7384Etj.A0U(parameterTypes);
                    for (Class<?> cls : parameterTypes) {
                        C7384Etj.A0X(cls);
                        A00(sbA0w, cls);
                    }
                    sbA0w.append(")");
                    Class<?> returnType = method.getReturnType();
                    C7384Etj.A0U(returnType);
                    A00(sbA0w, returnType);
                    if (str.equals(sbA0w.toString())) {
                        return method;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC7518Eyt
    public List<Annotation> getAnnotations() {
        getReflected().getAnnotations();
        throw null;
    }

    @Override // X.InterfaceC7350EnN
    public List getParameters() {
        getReflected().getParameters();
        throw null;
    }

    public InterfaceC7350EnN getReflected() {
        InterfaceC7350EnN interfaceC7350EnNCompute = compute();
        if (interfaceC7350EnNCompute != this) {
            return interfaceC7350EnNCompute;
        }
        throw new C7361EnY();
    }

    @Override // X.InterfaceC7350EnN
    public C9uE getReturnType() {
        getReflected().getReturnType();
        throw null;
    }

    @Override // X.InterfaceC7350EnN
    public List getTypeParameters() {
        getReflected().getTypeParameters();
        throw null;
    }

    @Override // X.InterfaceC7350EnN
    public C7nY getVisibility() {
        getReflected().getVisibility();
        throw null;
    }

    @Override // X.InterfaceC7350EnN
    public boolean isAbstract() {
        getReflected().isAbstract();
        throw null;
    }

    @Override // X.InterfaceC7350EnN
    public boolean isFinal() {
        getReflected().isFinal();
        throw null;
    }

    @Override // X.InterfaceC7350EnN
    public boolean isOpen() {
        getReflected().isOpen();
        throw null;
    }

    @Override // X.InterfaceC7350EnN
    public boolean isSuspend() {
        getReflected().isSuspend();
        throw null;
    }
}
