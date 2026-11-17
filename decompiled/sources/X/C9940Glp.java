package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Glp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9940Glp extends AbstractC10023Gnw {
    public final InterfaceC10159GqS A00;
    public final boolean A01;

    public static void A00(C9940Glp c9940Glp, InterfaceC10166Gqb interfaceC10166Gqb, Class cls, Class cls2, Map map) {
        if (cls2 != null) {
            A01(c9940Glp, interfaceC10166Gqb, cls, cls2, map);
        }
        if (cls != null) {
            for (Method method : AbstractC9855Gj3.A0N(cls)) {
                if (!AbstractC7609F5w.A1Y(method) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2) {
                    C9338GEv c9338GEv = new C9338GEv(method);
                    C10152GqJ c10152GqJ = (C10152GqJ) map.get(c9338GEv);
                    if (c10152GqJ == null) {
                        AbstractC10095GpJ abstractC10095GpJA07 = ((AbstractC10023Gnw) c9940Glp).A00 == null ? C10080Gp1.A00 : c9940Glp.A07(method.getDeclaredAnnotations());
                        C10152GqJ c10152GqJ2 = new C10152GqJ();
                        c10152GqJ2.A01 = interfaceC10166Gqb;
                        c10152GqJ2.A02 = method;
                        c10152GqJ2.A00 = abstractC10095GpJA07;
                        map.put(c9338GEv, c10152GqJ2);
                    } else {
                        if (c9940Glp.A01) {
                            c10152GqJ.A00 = c9940Glp.A06(c10152GqJ.A00, method.getDeclaredAnnotations());
                        }
                        Method method2 = c10152GqJ.A02;
                        if (method2 == null) {
                            c10152GqJ.A02 = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            c10152GqJ.A02 = method;
                            c10152GqJ.A01 = interfaceC10166Gqb;
                        }
                    }
                }
            }
        }
    }

    public static final void A01(C9940Glp c9940Glp, InterfaceC10166Gqb interfaceC10166Gqb, Class cls, Class cls2, Map map) {
        List listA11;
        if (((AbstractC10023Gnw) c9940Glp).A00 != null) {
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            if (cls2 == cls || cls2 == Object.class) {
                listA11 = Collections.EMPTY_LIST;
            } else {
                listA11 = C60O.A11(8);
                AbstractC9855Gj3.A0D(cls2, cls, listA11);
            }
            Iterator it = listA11.iterator();
            while (it.hasNext()) {
                for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                    if (!AbstractC7609F5w.A1Y(method) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2) {
                        C9338GEv c9338GEv = new C9338GEv(method);
                        C10152GqJ c10152GqJ = (C10152GqJ) map.get(c9338GEv);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (c10152GqJ == null) {
                            AbstractC10095GpJ abstractC10095GpJA07 = c9940Glp.A07(declaredAnnotations);
                            C10152GqJ c10152GqJ2 = new C10152GqJ();
                            c10152GqJ2.A01 = interfaceC10166Gqb;
                            c10152GqJ2.A02 = null;
                            c10152GqJ2.A00 = abstractC10095GpJA07;
                            map.put(c9338GEv, c10152GqJ2);
                        } else {
                            c10152GqJ.A00 = c9940Glp.A06(c10152GqJ.A00, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }

    public C9940Glp(AbstractC9910Gks abstractC9910Gks, InterfaceC10159GqS interfaceC10159GqS, boolean z) {
        super(abstractC9910Gks);
        this.A00 = abstractC9910Gks == null ? null : interfaceC10159GqS;
        this.A01 = z;
    }
}
