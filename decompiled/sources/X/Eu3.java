package X;

import com.facebook.aura.spacesharing.impl.SpaceShareUiCommandsKt;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class Eu3 implements InvocationHandler {
    public String A00;
    public boolean A01;
    public final List<String> A02;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C7384Etj.A0Y(method, 1);
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if ("supports".equals(name) && C7384Etj.areEqual(Boolean.TYPE, returnType)) {
            return true;
        }
        if (SpaceShareUiCommandsKt.ERROR_CODE_UNSUPPORTED.equals(name) && C7384Etj.areEqual(Void.TYPE, returnType)) {
            this.A01 = true;
            return null;
        }
        if ("protocols".equals(name) && objArr.length == 0) {
            return this.A02;
        }
        if (("selectProtocol".equals(name) || "select".equals(name)) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 == null) {
                    throw BV4.A0a("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Object obj3 = list.get(i);
                        if (obj3 == null) {
                            throw BV4.A0a("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj3;
                        if (!this.A02.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i = i2;
                        } else {
                            this.A00 = str;
                            return str;
                        }
                    }
                }
                String strA0n = C60Q.A0n(this.A02, 0);
                this.A00 = strA0n;
                return strA0n;
            }
        }
        if ((!"protocolSelected".equals(name) && !"selected".equals(name)) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        if (obj4 == null) {
            throw BV4.A0a("null cannot be cast to non-null type kotlin.String");
        }
        this.A00 = (String) obj4;
        return null;
    }

    public Eu3(List<String> list) {
        this.A02 = list;
    }
}
