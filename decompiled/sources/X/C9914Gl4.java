package X;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Gl4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9914Gl4 {
    public static final Class<?>[] A09 = new Class[0];
    public C10003Gna A00;
    public List<AbstractC9958GmS> A01;
    public boolean A02;
    public Class<?>[] A03;
    public final AbstractC9910Gks A04;
    public final AbstractC9870GjI A05;
    public final AbstractC9901Gkh<?> A06;
    public final C9909Gkr A07;
    public final C9907Gkn A08;

    public static final InterfaceC9854Giz A00(C9914Gl4 c9914Gl4, Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof InterfaceC9854Giz)) {
            if (!(obj instanceof Class)) {
                throw BV5.A0V("AnnotationIntrospector returned Converter definition of type ", C60Q.A0e(obj), "; expected type Converter or Class<Converter> instead");
            }
            Class cls = (Class) obj;
            if (cls == AbstractC9850Giu.class || AbstractC9855Gj3.A0I(cls)) {
                return null;
            }
            if (!InterfaceC9854Giz.class.isAssignableFrom(cls)) {
                throw BV5.A0V("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>");
            }
            obj = AbstractC7608F5v.A0h(c9914Gl4.A06, cls);
        }
        return (InterfaceC9854Giz) obj;
    }

    public C9914Gl4(C9907Gkn c9907Gkn) {
        AbstractC9870GjI abstractC9870GjI = c9907Gkn.A0E;
        C9909Gkr c9909Gkr = c9907Gkn.A0H;
        this.A05 = abstractC9870GjI;
        this.A08 = c9907Gkn;
        AbstractC9901Gkh<?> abstractC9901Gkh = c9907Gkn.A0F;
        this.A06 = abstractC9901Gkh;
        this.A04 = abstractC9901Gkh.A02();
        this.A07 = c9909Gkr;
        AbstractC9910Gks abstractC9910Gks = c9907Gkn.A0D;
        C10003Gna c10003GnaA0K = abstractC9910Gks.A0K(c9909Gkr);
        this.A00 = c10003GnaA0K != null ? abstractC9910Gks.A0L(c9909Gkr, c10003GnaA0K) : c10003GnaA0K;
    }

    public static final List A01(C9914Gl4 c9914Gl4) {
        List<AbstractC9958GmS> list = c9914Gl4.A01;
        if (list != null) {
            return list;
        }
        C9907Gkn c9907Gkn = c9914Gl4.A08;
        C9907Gkn.A03(c9907Gkn);
        ArrayList arrayListA0t = BV4.A0t(c9907Gkn.A03.values());
        c9914Gl4.A01 = arrayListA0t;
        return arrayListA0t;
    }

    public final C9894GkV A02() {
        C9907Gkn c9907Gkn = this.A08;
        return c9907Gkn == null ? C9894GkV.A01 : c9907Gkn.A0A();
    }

    public final AbstractC9970Gmj A03() {
        C9907Gkn c9907Gkn = this.A08;
        if (c9907Gkn == null) {
            return null;
        }
        C9907Gkn.A03(c9907Gkn);
        LinkedList<AbstractC9970Gmj> linkedList = c9907Gkn.A09;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1 || C9907Gkn.A09(linkedList)) {
            return c9907Gkn.A09.get(0);
        }
        C9907Gkn.A05(c9907Gkn, "Multiple 'as-value' properties defined (%s vs %s)", AbstractC7610F5x.A1b(c9907Gkn.A09));
        throw F60.createAndThrow();
    }

    public final List<C9934Glc> A04() {
        Class<?> clsA0J;
        List<C9934Glc> list = C9909Gkr.A00(this.A07).A02;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayListA0x = null;
        for (C9934Glc c9934Glc : list) {
            Method method = c9934Glc.A00;
            if (this.A05._class.isAssignableFrom(method.getReturnType())) {
                EnumC8882Fsl enumC8882FslA07 = this.A04.A07(c9934Glc);
                if (enumC8882FslA07 == null || enumC8882FslA07 == EnumC8882Fsl.DISABLED) {
                    String name = method.getName();
                    if ((!"valueOf".equals(name) || c9934Glc.A0G() != 1) && (!"fromString".equals(name) || c9934Glc.A0G() != 1 || ((clsA0J = c9934Glc.A0J(0)) != String.class && !CharSequence.class.isAssignableFrom(clsA0J)))) {
                    }
                }
                arrayListA0x = AbstractC7609F5w.A0x(arrayListA0x);
                arrayListA0x.add(c9934Glc);
            }
        }
        return arrayListA0x == null ? Collections.EMPTY_LIST : arrayListA0x;
    }

    public final Class<?>[] A05() {
        Class<?>[] clsArrA0h;
        if (!this.A02) {
            this.A02 = true;
            AbstractC9910Gks abstractC9910Gks = this.A04;
            if (abstractC9910Gks == null) {
                clsArrA0h = null;
            } else {
                clsArrA0h = abstractC9910Gks.A0h(this.A07);
                if (clsArrA0h == null) {
                }
                this.A03 = clsArrA0h;
            }
            if (!this.A06.A09(EnumC9951GmA.A0G)) {
                clsArrA0h = A09;
            }
            this.A03 = clsArrA0h;
        }
        return this.A03;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;LX/Gkr;Ljava/util/List<LX/GmS;>;)V */
    public C9914Gl4(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, C9909Gkr c9909Gkr, List list) {
        this.A05 = abstractC9870GjI;
        this.A08 = null;
        this.A06 = abstractC9901Gkh;
        this.A04 = abstractC9901Gkh != null ? abstractC9901Gkh.A02() : null;
        this.A07 = c9909Gkr;
        this.A01 = list;
    }
}
