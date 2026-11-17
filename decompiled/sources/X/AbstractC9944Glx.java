package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.Glx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9944Glx {
    private final Class<?> A03() {
        return this instanceof C9921GlI ? ((C9921GlI) this)._valueClass : ((AbstractC10130Gpv) this)._valueType;
    }

    public final Object A04(AbstractC9904Gkk abstractC9904Gkk, Object obj) {
        if (!(this instanceof C9921GlI)) {
            abstractC9904Gkk.A0d(this, A03(), "no array delegate creator specified", BV4.A1W());
            throw F60.createAndThrow();
        }
        C9921GlI c9921GlI = (C9921GlI) this;
        AbstractC10024Gnx abstractC10024Gnx = c9921GlI._arrayDelegateCreator;
        return (abstractC10024Gnx != null || c9921GlI._delegateCreator == null) ? C9921GlI.A01(abstractC9904Gkk, c9921GlI, abstractC10024Gnx, obj, c9921GlI._arrayDelegateArguments) : c9921GlI.A05(abstractC9904Gkk, obj);
    }

    public final Object A05(AbstractC9904Gkk abstractC9904Gkk, Object obj) {
        AbstractC10024Gnx abstractC10024Gnx;
        if (!(this instanceof C9921GlI)) {
            abstractC9904Gkk.A0d(this, A03(), "no delegate creator specified", BV4.A1W());
            throw F60.createAndThrow();
        }
        C9921GlI c9921GlI = (C9921GlI) this;
        AbstractC10024Gnx abstractC10024Gnx2 = c9921GlI._delegateCreator;
        return (abstractC10024Gnx2 != null || (abstractC10024Gnx = c9921GlI._arrayDelegateCreator) == null) ? C9921GlI.A01(abstractC9904Gkk, c9921GlI, abstractC10024Gnx2, obj, c9921GlI._delegateArguments) : C9921GlI.A01(abstractC9904Gkk, c9921GlI, abstractC10024Gnx, obj, c9921GlI._arrayDelegateArguments);
    }

    public final boolean A06() {
        return this instanceof C9921GlI ? AnonymousClass002.A1X(((C9921GlI) this)._withArgsCreator) : this instanceof C9976Gmq;
    }

    public final boolean A07() {
        if (this instanceof C9921GlI) {
            return AnonymousClass002.A1X(((C9921GlI) this)._fromStringCreator);
        }
        return false;
    }

    public final boolean A08() {
        if (this instanceof C9921GlI) {
            return AnonymousClass002.A1X(((C9921GlI) this)._arrayDelegateType);
        }
        return false;
    }

    public final boolean A09() {
        if (this instanceof C9921GlI) {
            return AnonymousClass002.A1X(((C9921GlI) this)._defaultCreator);
        }
        if (this instanceof AbstractC10178Gqn) {
            return true;
        }
        return AnonymousClass002.A1X(null);
    }

    public final boolean A0A() {
        if (this instanceof C9921GlI) {
            return AnonymousClass002.A1X(((C9921GlI) this)._delegateType);
        }
        return false;
    }

    public final boolean A0B() {
        boolean z;
        boolean zA1X;
        if (!(this instanceof AbstractC10178Gqn) && !A09() && !A0A() && !A08() && !A06() && !A07() && (!((z = this instanceof C9921GlI)) || !AnonymousClass002.A1X(((C9921GlI) this)._fromIntCreator))) {
            if (z) {
                C9921GlI c9921GlI = (C9921GlI) this;
                zA1X = (AnonymousClass002.A1X(c9921GlI._fromLongCreator) || AnonymousClass002.A1X(c9921GlI._fromDoubleCreator)) ? false : AnonymousClass002.A1X(c9921GlI._fromBooleanCreator);
            }
            if (!zA1X) {
                return false;
            }
        }
        return true;
    }

    public final AbstractC9915Gl5[] A0C(C9898Gke c9898Gke) {
        if (this instanceof C9921GlI) {
            return ((C9921GlI) this)._constructorArguments;
        }
        if (!(this instanceof C9976Gmq)) {
            return null;
        }
        AbstractC9870GjI abstractC9870GjIA0R = AbstractC7608F5v.A0R(c9898Gke, Integer.TYPE);
        AbstractC9870GjI abstractC9870GjIA0R2 = AbstractC7608F5v.A0R(c9898Gke, Long.TYPE);
        return new AbstractC9915Gl5[]{C9976Gmq.A00(AbstractC7608F5v.A0R(c9898Gke, Object.class), "sourceRef", 0), C9976Gmq.A00(abstractC9870GjIA0R2, "byteOffset", 1), C9976Gmq.A00(abstractC9870GjIA0R2, "charOffset", 2), C9976Gmq.A00(abstractC9870GjIA0R, "lineNr", 3), C9976Gmq.A00(abstractC9870GjIA0R, "columnNr", 4)};
    }

    public Object A0D(AbstractC9904Gkk abstractC9904Gkk) {
        abstractC9904Gkk.A0d(this, A03(), "no default no-arguments constructor found", BV4.A1W());
        throw F60.createAndThrow();
    }

    public Object A0E(AbstractC9904Gkk abstractC9904Gkk) {
        abstractC9904Gkk.A0d(this, A03(), "neither default (no-arguments) nor with-arguments Creator found", BV4.A1W());
        throw F60.createAndThrow();
    }

    public Object A0F(AbstractC9904Gkk abstractC9904Gkk, double d) {
        abstractC9904Gkk.A0d(this, A03(), "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
        throw F60.createAndThrow();
    }

    public Object A0G(AbstractC9904Gkk abstractC9904Gkk, int i) {
        abstractC9904Gkk.A0d(this, A03(), "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", BV5.A1Y(i));
        throw F60.createAndThrow();
    }

    public Object A0H(AbstractC9904Gkk abstractC9904Gkk, long j) {
        abstractC9904Gkk.A0d(this, A03(), "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j));
        throw F60.createAndThrow();
    }

    public Object A0I(AbstractC9904Gkk abstractC9904Gkk, String str) {
        abstractC9904Gkk.A0d(this, A03(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        throw F60.createAndThrow();
    }

    public Object A0J(AbstractC9904Gkk abstractC9904Gkk, BigDecimal bigDecimal) {
        abstractC9904Gkk.A0d(this, A03(), "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
        throw F60.createAndThrow();
    }

    public Object A0K(AbstractC9904Gkk abstractC9904Gkk, BigInteger bigInteger) {
        abstractC9904Gkk.A0d(this, A03(), "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
        throw F60.createAndThrow();
    }

    public Object A0L(AbstractC9904Gkk abstractC9904Gkk, boolean z) {
        abstractC9904Gkk.A0d(this, A03(), "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", BV4.A1Z(z));
        throw F60.createAndThrow();
    }

    public Object A0M(AbstractC9904Gkk abstractC9904Gkk, Object[] objArr) {
        abstractC9904Gkk.A0d(this, A03(), "no creator with arguments specified", BV4.A1W());
        throw F60.createAndThrow();
    }
}
