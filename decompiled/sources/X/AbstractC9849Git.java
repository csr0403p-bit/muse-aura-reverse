package X;

import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* renamed from: X.Git, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9849Git {
    public static String A05(String str, String str2, Object[] objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str2;
    }

    public final InterfaceC9854Giz A0C(Object obj) {
        if (obj instanceof InterfaceC9854Giz) {
            return (InterfaceC9854Giz) obj;
        }
        if (!(obj instanceof Class)) {
            throw BV5.A0V("AnnotationIntrospector returned Converter definition of type ", C60Q.A0e(obj), "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == AbstractC9850Giu.class || AbstractC9855Gj3.A0I(cls)) {
            return null;
        }
        if (InterfaceC9854Giz.class.isAssignableFrom(cls)) {
            return (InterfaceC9854Giz) AbstractC7608F5v.A0h(A09(), cls);
        }
        throw BV5.A0V("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>");
    }

    public static AbstractC9910Gks A02(AbstractC9904Gkk abstractC9904Gkk) {
        return abstractC9904Gkk._config.A02();
    }

    public static AbstractC9910Gks A03(AbstractC9842Gii abstractC9842Gii) {
        return abstractC9842Gii._config.A02();
    }

    public static void A06(AbstractC9849Git abstractC9849Git, AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, AbstractC9901Gkh abstractC9901Gkh, AbstractC9841Gig abstractC9841Gig) {
        if (!AnonymousClass002.A1Z(abstractC9870GjI2._class, Object.class)) {
            abstractC9870GjI2.A0S();
        }
        int length = ((AbstractC9869GjH) abstractC9870GjI2)._bindings._types.length;
        for (int i = 0; i < length; i++) {
            A06(abstractC9849Git, abstractC9870GjI, abstractC9870GjI2.A0B(i), abstractC9901Gkh, abstractC9841Gig);
        }
        if (abstractC9870GjI2 instanceof C9872GjK) {
            A06(abstractC9849Git, abstractC9870GjI, abstractC9870GjI2.A07(), abstractC9901Gkh, abstractC9841Gig);
        }
    }

    public final AbstractC9848Gir A08(C10003Gna c10003Gna) {
        AbstractC9848Gir abstractC9848Gir = (AbstractC9848Gir) AbstractC7608F5v.A0h(A09(), c10003Gna.A01);
        Class<?> cls = c10003Gna.A03;
        if (abstractC9848Gir instanceof C9994GnN) {
            C9994GnN c9994GnN = (C9994GnN) abstractC9848Gir;
            return cls != c9994GnN._scope ? new C9994GnN(c9994GnN._property, cls) : c9994GnN;
        }
        Gp5 gp5 = (Gp5) abstractC9848Gir;
        return cls != gp5._scope ? new C10099GpN(cls) : gp5;
    }

    public final AbstractC9901Gkh<?> A09() {
        return this instanceof AbstractC9842Gii ? ((AbstractC9842Gii) this)._config : ((AbstractC9904Gkk) this)._config;
    }

    public final InvalidTypeIdException A0A(AbstractC9870GjI abstractC9870GjI, String str, String str2) {
        if (this instanceof AbstractC9842Gii) {
            String strA0U = String.format("Could not resolve type id '%s' as a subtype of %s", str, AbstractC9855Gj3.A04(abstractC9870GjI));
            if (str2 != null) {
                strA0U = FGI.A0U(strA0U, ": ", str2);
            }
            return new InvalidTypeIdException(null, abstractC9870GjI, strA0U, str);
        }
        String strA0U2 = String.format("Could not resolve type id '%s' as a subtype of %s", str, AbstractC9855Gj3.A04(abstractC9870GjI));
        AbstractC9916Gl7 abstractC9916Gl7 = ((AbstractC9904Gkk) this).A00;
        if (str2 != null) {
            strA0U2 = FGI.A0U(strA0U2, ": ", str2);
        }
        return new InvalidTypeIdException(abstractC9916Gl7, abstractC9870GjI, strA0U2, str);
    }

    public final C9860Gj8 A0B() {
        return (this instanceof AbstractC9842Gii ? ((AbstractC9842Gii) this)._config : ((AbstractC9904Gkk) this)._config)._base._typeFactory;
    }

    public final String A0D(String str) {
        if (str == null) {
            return "[N/A]";
        }
        int length = str.length();
        if (length > 500) {
            str = FGI.A0U(BV4.A0j(str, 500), "]...[", str.substring(length - 500));
        }
        return String.format("\"%s\"", str);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/GjI;Ljava/lang/String;)TT; */
    public final void A0E(AbstractC9870GjI abstractC9870GjI, String str) throws InvalidDefinitionException {
        if (!(this instanceof AbstractC9842Gii)) {
            throw new InvalidDefinitionException(((AbstractC9904Gkk) this).A00, abstractC9870GjI, str);
        }
        throw new InvalidDefinitionException(((AbstractC9846Gip) ((AbstractC9842Gii) this)).A00, abstractC9870GjI, str);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Class<*>;Ljava/lang/String;)TT; */
    public final void A0F(String str, Class cls) throws InvalidDefinitionException {
        A0E(cls == null ? null : A0B().A09(cls), str);
        throw F60.createAndThrow();
    }

    public static MismatchedInputException A04(AbstractC9904Gkk abstractC9904Gkk, Class cls, String str, Object[] objArr) {
        MismatchedInputException mismatchedInputException = new MismatchedInputException(abstractC9904Gkk.A00, String.format(str, objArr));
        mismatchedInputException._targetType = cls;
        return mismatchedInputException;
    }

    public static void A07(AbstractC9849Git abstractC9849Git, AbstractC9870GjI abstractC9870GjI, String str, Object[] objArr) {
        abstractC9849Git.A0E(abstractC9870GjI, String.format(str, objArr));
        throw F60.createAndThrow();
    }
}
