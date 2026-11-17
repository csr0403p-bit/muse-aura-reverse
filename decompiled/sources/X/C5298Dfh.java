package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
/* renamed from: X.Dfh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5298Dfh {
    public static C5298Dfh A02 = new C5298Dfh();
    public final Map<Class<?>, C7378EtR> A00 = BV4.A0u();
    public final Map<Class<?>, Boolean> A01 = BV4.A0u();

    public static C7378EtR A00(C5298Dfh c5298Dfh, Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap mapA0u = BV4.A0u();
        if (superclass != null) {
            C7378EtR c7378EtRA00 = c5298Dfh.A00.get(superclass);
            if (c7378EtRA00 == null) {
                c7378EtRA00 = A00(c5298Dfh, superclass, null);
            }
            mapA0u.putAll(c7378EtRA00.A01);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C7378EtR c7378EtRA002 = c5298Dfh.A00.get(cls2);
            if (c7378EtRA002 == null) {
                c7378EtRA002 = A00(c5298Dfh, cls2, null);
            }
            Iterator itA0n = AnonymousClass002.A0n(c7378EtRA002.A01);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                A01((C5301Dfk) entryA0l.getKey(), (EnumC3085Bxl) entryA0l.getValue(), cls, mapA0u);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw BV4.A0Q("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!C1HY.class.isAssignableFrom(parameterTypes[0])) {
                        throw C60O.A0i("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC3085Bxl enumC3085BxlValue = onLifecycleEvent.value();
                if (length > 1) {
                    if (!EnumC3085Bxl.class.isAssignableFrom(parameterTypes[1])) {
                        throw C60O.A0i("invalid parameter type. second arg must be an event");
                    }
                    if (enumC3085BxlValue != EnumC3085Bxl.ON_ANY) {
                        throw C60O.A0i("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                    if (length > 2) {
                        throw C60O.A0i("cannot have more than 2 params");
                    }
                }
                A01(new C5301Dfk(method, i), enumC3085BxlValue, cls, mapA0u);
                z = true;
            }
        }
        C7378EtR c7378EtR = new C7378EtR(mapA0u);
        c5298Dfh.A00.put(cls, c7378EtR);
        c5298Dfh.A01.put(cls, Boolean.valueOf(z));
        return c7378EtR;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<LX/Dfk;LX/Bxl;>;LX/Dfk;LX/Bxl;Ljava/lang/Class<*>;)V */
    public static void A01(C5301Dfk c5301Dfk, EnumC3085Bxl enumC3085Bxl, Class cls, Map map) {
        Object obj = map.get(c5301Dfk);
        if (obj == null) {
            map.put(c5301Dfk, enumC3085Bxl);
            return;
        }
        if (enumC3085Bxl != obj) {
            Method method = c5301Dfk.A01;
            StringBuilder sbA0x = C60O.A0x("Method ");
            sbA0x.append(method.getName());
            sbA0x.append(" in ");
            BV6.A18(cls, sbA0x);
            sbA0x.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sbA0x.append(obj);
            throw BV5.A0P(enumC3085Bxl, ", new value ", sbA0x);
        }
    }
}
