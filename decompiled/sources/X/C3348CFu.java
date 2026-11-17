package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.CFu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3348CFu<T> implements Eu1<T> {
    public boolean A00;
    public final DFW A01;

    private final void A01(C3341CFl c3341CFl, Map<?, ?> map) {
        C3341CFl c3341CFlA03;
        Map<String, Object> map2;
        synchronized (map) {
            Iterator itA11 = BV5.A11(map);
            while (itA11.hasNext()) {
                Object next = itA11.next();
                Object objA00 = map.get(next);
                if (objA00 != null) {
                    String string = next instanceof InterfaceC2571Be0 ? ((InterfaceC2571Be0) next).getValue().toString() : String.valueOf(next);
                    if (string.length() == 0) {
                        continue;
                    } else {
                        if (objA00 instanceof C7m4) {
                            objA00 = C7m4.A00((C7m4) objA00);
                            C7384Etj.A0U(objA00);
                        }
                        if (objA00 instanceof Number) {
                            C3341CFl.A00(c3341CFl, (Number) objA00, string);
                        } else if (objA00 instanceof Boolean) {
                            C3341CFl.A00(c3341CFl, (Boolean) objA00, string);
                        } else if (objA00 instanceof String) {
                            C3341CFl.A00(c3341CFl, (String) objA00, string);
                        } else {
                            if (objA00 instanceof Map) {
                                c3341CFlA03 = ((AbstractC3342CFm) c3341CFl).A01.A03();
                                c3341CFl.A0E(c3341CFlA03, string);
                                map2 = (Map) objA00;
                            } else if (objA00 instanceof Collection) {
                                C3340CFk c3340CFkA02 = ((AbstractC3342CFm) c3341CFl).A01.A02();
                                c3341CFl.A0E(c3340CFkA02, string);
                                A00(c3340CFkA02, (Collection) objA00);
                            } else if (objA00 instanceof AbstractC8150FWo) {
                                c3341CFlA03 = ((AbstractC3342CFm) c3341CFl).A01.A03();
                                c3341CFl.A0E(c3341CFlA03, string);
                                map2 = ((AbstractC8150FWo) objA00).A00;
                            } else {
                                if (!(objA00 instanceof InterfaceC2571Be0)) {
                                    C7384Etj.A0X(next);
                                    throw BV4.A0c(AnonymousClass007.A0a("Unsupported type: ", next));
                                }
                                Object value = ((InterfaceC2571Be0) objA00).getValue();
                                if (value instanceof String) {
                                    C3341CFl.A00(c3341CFl, (String) value, string);
                                } else {
                                    if (!(value instanceof Number)) {
                                        throw BV5.A0P(objA00, "Enum type expects String and Number, but got: ", C60O.A0w());
                                    }
                                    C3341CFl.A00(c3341CFl, (Number) value, string);
                                }
                            }
                            A01(c3341CFlA03, map2);
                        }
                    }
                }
            }
        }
    }

    @Override // X.Eu1
    public synchronized void APu() {
        if (this.A00) {
            throw BV4.A0c("You are trying to log an event that has already been logged, please acquire a new event with your event's USL Factory.");
        }
        DFW dfw = this.A01;
        C7384Etj.A0X(dfw);
        dfw.A03 = 1 | dfw.A03;
        dfw.A05();
        this.A00 = true;
    }

    @Override // X.Eu1
    public void A3P(String str, Boolean bool) {
        DFW dfw = this.A01;
        if (dfw != null) {
            dfw.A07(bool, str);
        }
    }

    @Override // X.Eu1
    public final void A3U(Double d, String str) {
        DFW dfw;
        if ((this instanceof C3349CFv) || (dfw = this.A01) == null) {
            return;
        }
        dfw.A08(str, d);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/Be0<*>;)V */
    @Override // X.Eu1
    public final void A3V(InterfaceC2571Be0 interfaceC2571Be0, String str) {
        DFW dfw;
        String str2;
        if ((this instanceof C3349CFv) || (dfw = this.A01) == null) {
            return;
        }
        if (interfaceC2571Be0 == null) {
            str2 = null;
        } else {
            Object value = interfaceC2571Be0.getValue();
            if (!(value instanceof String)) {
                if (value instanceof Number) {
                    dfw.A08(str, (Number) value);
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("Enum type expects String or Number, but got: ");
                    sb.append(value);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            str2 = (String) value;
        }
        dfw.A09(str, str2);
    }

    @Override // X.Eu1
    public final void A3b(String str, Integer num) {
        DFW dfw;
        if ((this instanceof C3349CFv) || (dfw = this.A01) == null) {
            return;
        }
        dfw.A08(str, num);
    }

    @Override // X.Eu1
    public void A3f(String str, Long l) {
        DFW dfw = this.A01;
        if (dfw != null) {
            dfw.A08(str, l);
        }
    }

    @Override // X.Eu1
    public void A3g(String str, Map<?, ?> map) {
        DFW dfw = this.A01;
        if (dfw != null) {
            if (map == null) {
                dfw.A09(str, null);
            } else {
                A01(C3339CFj.A01(dfw.A04(), str), map);
            }
        }
    }

    @Override // X.Eu1
    public void A3y(String str, String str2) {
        DFW dfw = this.A01;
        if (dfw != null) {
            dfw.A09(str, str2);
        }
    }

    @Override // X.Eu1
    public final void A3z(AbstractC8150FWo abstractC8150FWo, String str) {
        DFW dfw;
        if ((this instanceof C3349CFv) || (dfw = this.A01) == null) {
            return;
        }
        if (abstractC8150FWo == null) {
            dfw.A09(str, null);
        } else {
            A3g(str, abstractC8150FWo.A00);
        }
    }

    @Override // X.Eu1
    public final void A42(String str, List<?> list) {
        DFW dfw;
        if ((this instanceof C3349CFv) || (dfw = this.A01) == null) {
            return;
        }
        if (list == null) {
            dfw.A09(str, null);
        } else {
            A00(C3339CFj.A00(dfw.A04(), str), list);
        }
    }

    @Override // X.Eu1
    public boolean isSampled() {
        DFW dfw = this.A01;
        if (dfw != null) {
            return dfw.A0A();
        }
        return false;
    }

    public C3348CFu(DFW dfw) {
        this.A01 = dfw;
    }

    private final void A00(C3340CFk c3340CFk, Collection<?> collection) {
        C3341CFl c3341CFlA03;
        Map<String, Object> map;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                if (next instanceof C7m4) {
                    next = C7m4.A00((C7m4) next);
                    C7384Etj.A0U(next);
                }
                if (!(next instanceof Number) && !(next instanceof Boolean) && !(next instanceof String)) {
                    if (next instanceof Map) {
                        c3341CFlA03 = c3340CFk.A01.A03();
                        c3340CFk.A0C(c3341CFlA03);
                        map = (Map) next;
                    } else if (next instanceof Collection) {
                        C3340CFk c3340CFkA02 = c3340CFk.A01.A02();
                        c3340CFk.A0C(c3340CFkA02);
                        A00(c3340CFkA02, (Collection) next);
                    } else if (next instanceof AbstractC8150FWo) {
                        c3341CFlA03 = c3340CFk.A01.A03();
                        c3340CFk.A0C(c3341CFlA03);
                        map = ((AbstractC8150FWo) next).A00;
                    } else {
                        if (!(next instanceof InterfaceC2571Be0)) {
                            throw BV4.A0c(AnonymousClass007.A0a("Unsupported type: ", next));
                        }
                        Object value = ((InterfaceC2571Be0) next).getValue();
                        if (!(value instanceof String) && !(value instanceof Number)) {
                            throw BV5.A0O(next, "Enum type expects String and Number, but got: ");
                        }
                        next = value;
                    }
                    A01(c3341CFlA03, map);
                }
                C3340CFk.A00(c3340CFk, next);
            }
        }
    }
}
