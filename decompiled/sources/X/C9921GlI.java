package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* renamed from: X.GlI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9921GlI extends AbstractC9944Glx implements Serializable {
    public static final long serialVersionUID = 1;
    public AbstractC9915Gl5[] _arrayDelegateArguments;
    public AbstractC10024Gnx _arrayDelegateCreator;
    public AbstractC9870GjI _arrayDelegateType;
    public AbstractC9915Gl5[] _constructorArguments;
    public AbstractC10024Gnx _defaultCreator;
    public AbstractC9915Gl5[] _delegateArguments;
    public AbstractC10024Gnx _delegateCreator;
    public AbstractC9870GjI _delegateType;
    public AbstractC10024Gnx _fromBigDecimalCreator;
    public AbstractC10024Gnx _fromBigIntegerCreator;
    public AbstractC10024Gnx _fromBooleanCreator;
    public AbstractC10024Gnx _fromDoubleCreator;
    public AbstractC10024Gnx _fromIntCreator;
    public AbstractC10024Gnx _fromLongCreator;
    public AbstractC10024Gnx _fromStringCreator;
    public final Class<?> _valueClass;
    public final String _valueTypeDesc;
    public AbstractC10024Gnx _withArgsCreator;

    private final JsonMappingException A00(AbstractC9904Gkk abstractC9904Gkk, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return th instanceof JsonMappingException ? (JsonMappingException) th : abstractC9904Gkk.A0R(this._valueClass, th);
    }

    public static Object A01(AbstractC9904Gkk abstractC9904Gkk, C9921GlI c9921GlI, AbstractC10024Gnx abstractC10024Gnx, Object obj, AbstractC9915Gl5[] abstractC9915Gl5Arr) throws JsonMappingException {
        if (abstractC10024Gnx == null) {
            throw BV5.A0U("No delegate constructor for ", c9921GlI._valueTypeDesc);
        }
        try {
            if (abstractC9915Gl5Arr == null) {
                return abstractC10024Gnx.A0L(obj);
            }
            int length = abstractC9915Gl5Arr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                AbstractC9915Gl5 abstractC9915Gl5 = abstractC9915Gl5Arr[i];
                if (abstractC9915Gl5 != null) {
                    abstractC9904Gkk.A0l(abstractC9915Gl5.A0B());
                    throw F60.createAndThrow();
                }
                objArr[i] = obj;
            }
            return abstractC10024Gnx instanceof C9934Glc ? ((C9934Glc) abstractC10024Gnx).A00.invoke(null, objArr) : ((C9937Glg) abstractC10024Gnx)._constructor.newInstance(objArr);
        } catch (Exception e) {
            throw c9921GlI.A00(abstractC9904Gkk, e);
        }
    }

    @Override // X.AbstractC9944Glx
    public final Object A0D(AbstractC9904Gkk abstractC9904Gkk) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx = this._defaultCreator;
        if (abstractC10024Gnx == null) {
            super.A0D(abstractC9904Gkk);
            throw F60.createAndThrow();
        }
        try {
            return abstractC10024Gnx.A0K();
        } catch (Exception e) {
            abstractC9904Gkk.A0m(A00(abstractC9904Gkk, e), this._valueClass);
            throw F60.createAndThrow();
        }
    }

    @Override // X.AbstractC9944Glx
    public final Object A0E(AbstractC9904Gkk abstractC9904Gkk) {
        if (this._defaultCreator != null) {
            return A0D(abstractC9904Gkk);
        }
        if (this._withArgsCreator != null) {
            return A0M(abstractC9904Gkk, new Object[this._constructorArguments.length]);
        }
        super.A0E(abstractC9904Gkk);
        throw F60.createAndThrow();
    }

    @Override // X.AbstractC9944Glx
    public final Object A0F(AbstractC9904Gkk abstractC9904Gkk, double d) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx;
        AbstractC10024Gnx abstractC10024Gnx2 = this._fromDoubleCreator;
        if (abstractC10024Gnx2 != null) {
            try {
                return abstractC10024Gnx2.A0L(Double.valueOf(d));
            } catch (Exception e) {
                e = e;
                abstractC10024Gnx = this._fromDoubleCreator;
            }
        } else {
            if (this._fromBigDecimalCreator == null) {
                super.A0F(abstractC9904Gkk, d);
                throw F60.createAndThrow();
            }
            try {
                return this._fromBigDecimalCreator.A0L(BigDecimal.valueOf(d));
            } catch (Exception e2) {
                e = e2;
                abstractC10024Gnx = this._fromBigDecimalCreator;
            }
        }
        A02(abstractC9904Gkk, this, abstractC10024Gnx, e);
        throw F60.createAndThrow();
    }

    @Override // X.AbstractC9944Glx
    public final Object A0G(AbstractC9904Gkk abstractC9904Gkk, int i) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx;
        AbstractC10024Gnx abstractC10024Gnx2 = this._fromIntCreator;
        if (abstractC10024Gnx2 != null) {
            try {
                return abstractC10024Gnx2.A0L(Integer.valueOf(i));
            } catch (Exception e) {
                e = e;
                abstractC10024Gnx = this._fromIntCreator;
            }
        } else {
            AbstractC10024Gnx abstractC10024Gnx3 = this._fromLongCreator;
            if (abstractC10024Gnx3 != null) {
                try {
                    return abstractC10024Gnx3.A0L(Long.valueOf(i));
                } catch (Exception e2) {
                    e = e2;
                    abstractC10024Gnx = this._fromLongCreator;
                }
            } else if (this._fromBigIntegerCreator != null) {
                try {
                    return this._fromBigIntegerCreator.A0L(BigInteger.valueOf(i));
                } catch (Exception e3) {
                    e = e3;
                    abstractC10024Gnx = this._fromBigIntegerCreator;
                }
            } else {
                AbstractC10024Gnx abstractC10024Gnx4 = this._fromDoubleCreator;
                if (abstractC10024Gnx4 == null) {
                    super.A0G(abstractC9904Gkk, i);
                    throw F60.createAndThrow();
                }
                try {
                    return abstractC10024Gnx4.A0L(Double.valueOf(i));
                } catch (Exception e4) {
                    e = e4;
                    abstractC10024Gnx = this._fromDoubleCreator;
                }
            }
        }
        A02(abstractC9904Gkk, this, abstractC10024Gnx, e);
        throw F60.createAndThrow();
    }

    @Override // X.AbstractC9944Glx
    public final Object A0H(AbstractC9904Gkk abstractC9904Gkk, long j) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx;
        AbstractC10024Gnx abstractC10024Gnx2 = this._fromLongCreator;
        if (abstractC10024Gnx2 != null) {
            try {
                return abstractC10024Gnx2.A0L(Long.valueOf(j));
            } catch (Exception e) {
                e = e;
                abstractC10024Gnx = this._fromLongCreator;
            }
        } else if (this._fromBigIntegerCreator != null) {
            try {
                return this._fromBigIntegerCreator.A0L(BigInteger.valueOf(j));
            } catch (Exception e2) {
                e = e2;
                abstractC10024Gnx = this._fromBigIntegerCreator;
            }
        } else {
            AbstractC10024Gnx abstractC10024Gnx3 = this._fromDoubleCreator;
            if (abstractC10024Gnx3 == null) {
                super.A0H(abstractC9904Gkk, j);
                throw F60.createAndThrow();
            }
            try {
                return abstractC10024Gnx3.A0L(Double.valueOf(j));
            } catch (Exception e3) {
                e = e3;
                abstractC10024Gnx = this._fromDoubleCreator;
            }
        }
        A02(abstractC9904Gkk, this, abstractC10024Gnx, e);
        throw F60.createAndThrow();
    }

    @Override // X.AbstractC9944Glx
    public final Object A0I(AbstractC9904Gkk abstractC9904Gkk, String str) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx = this._fromStringCreator;
        if (abstractC10024Gnx == null) {
            super.A0I(abstractC9904Gkk, str);
            throw F60.createAndThrow();
        }
        try {
            return abstractC10024Gnx.A0L(str);
        } catch (Exception e) {
            A02(abstractC9904Gkk, this, this._fromStringCreator, e);
            throw F60.createAndThrow();
        }
    }

    @Override // X.AbstractC9944Glx
    public final Object A0J(AbstractC9904Gkk abstractC9904Gkk, BigDecimal bigDecimal) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx;
        AbstractC10024Gnx abstractC10024Gnx2 = this._fromBigDecimalCreator;
        if (abstractC10024Gnx2 == null) {
            if (this._fromDoubleCreator != null) {
                double dDoubleValue = bigDecimal.doubleValue();
                Double dValueOf = Double.isInfinite(dDoubleValue) ? null : Double.valueOf(dDoubleValue);
                if (dValueOf != null) {
                    try {
                        return this._fromDoubleCreator.A0L(dValueOf);
                    } catch (Exception e) {
                        e = e;
                        abstractC10024Gnx = this._fromDoubleCreator;
                    }
                }
            }
            super.A0J(abstractC9904Gkk, bigDecimal);
            throw F60.createAndThrow();
        }
        try {
            return abstractC10024Gnx2.A0L(bigDecimal);
        } catch (Exception e2) {
            e = e2;
            abstractC10024Gnx = this._fromBigDecimalCreator;
        }
        A02(abstractC9904Gkk, this, abstractC10024Gnx, e);
        throw F60.createAndThrow();
    }

    @Override // X.AbstractC9944Glx
    public final Object A0K(AbstractC9904Gkk abstractC9904Gkk, BigInteger bigInteger) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx = this._fromBigIntegerCreator;
        if (abstractC10024Gnx == null) {
            super.A0K(abstractC9904Gkk, bigInteger);
            throw F60.createAndThrow();
        }
        try {
            return abstractC10024Gnx.A0L(bigInteger);
        } catch (Exception e) {
            A02(abstractC9904Gkk, this, this._fromBigIntegerCreator, e);
            throw F60.createAndThrow();
        }
    }

    @Override // X.AbstractC9944Glx
    public final Object A0L(AbstractC9904Gkk abstractC9904Gkk, boolean z) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx = this._fromBooleanCreator;
        if (abstractC10024Gnx == null) {
            super.A0L(abstractC9904Gkk, z);
            throw F60.createAndThrow();
        }
        try {
            return abstractC10024Gnx.A0L(Boolean.valueOf(z));
        } catch (Exception e) {
            A02(abstractC9904Gkk, this, this._fromBooleanCreator, e);
            throw F60.createAndThrow();
        }
    }

    @Override // X.AbstractC9944Glx
    public final Object A0M(AbstractC9904Gkk abstractC9904Gkk, Object[] objArr) throws Throwable {
        AbstractC10024Gnx abstractC10024Gnx = this._withArgsCreator;
        if (abstractC10024Gnx == null) {
            super.A0M(abstractC9904Gkk, objArr);
            throw F60.createAndThrow();
        }
        try {
            return abstractC10024Gnx instanceof C9934Glc ? ((C9934Glc) abstractC10024Gnx).A00.invoke(null, objArr) : ((C9937Glg) abstractC10024Gnx)._constructor.newInstance(objArr);
        } catch (Exception e) {
            abstractC9904Gkk.A0m(A00(abstractC9904Gkk, e), this._valueClass);
            throw F60.createAndThrow();
        }
    }

    public C9921GlI(AbstractC9870GjI abstractC9870GjI) {
        this._valueTypeDesc = abstractC9870GjI == null ? "UNKNOWN TYPE" : abstractC9870GjI.toString();
        this._valueClass = abstractC9870GjI == null ? Object.class : abstractC9870GjI._class;
    }

    public static void A02(AbstractC9904Gkk abstractC9904Gkk, C9921GlI c9921GlI, AbstractC9970Gmj abstractC9970Gmj, Throwable th) throws Throwable {
        abstractC9904Gkk.A0m(c9921GlI.A00(abstractC9904Gkk, th), abstractC9970Gmj.A0C());
        throw F60.createAndThrow();
    }
}
