package X;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: X.Gjl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9877Gjl {
    public final Object A00(AbstractC9904Gkk abstractC9904Gkk, String str) {
        Class<?> cls;
        Object[] objArr;
        String str2;
        Object objA0D;
        Object obj;
        if (this instanceof C9917Gl8) {
            C9917Gl8 c9917Gl8 = (C9917Gl8) this;
            if (c9917Gl8 instanceof C10125Gpq) {
                return str;
            }
            if (str == null) {
                return null;
            }
            try {
            } catch (StreamConstraintsException e) {
                throw e;
            } catch (Exception e2) {
                cls = c9917Gl8._keyClass;
                objArr = new Object[]{C60Q.A0e(e2), AbstractC9855Gj3.A0A(e2)};
                str2 = "not a valid representation, problem: (%s) %s";
            }
            if (c9917Gl8 instanceof C10092GpG) {
                objA0D = ((C10092GpG) c9917Gl8)._factoryMethod.invoke(null, str);
            } else {
                if (!(c9917Gl8 instanceof C10069Goq)) {
                    if (c9917Gl8 instanceof C9938Glh) {
                        C9938Glh c9938Glh = (C9938Glh) c9917Gl8;
                        C9934Glc c9934Glc = c9938Glh._factory;
                        if (c9934Glc != null) {
                            try {
                                objA0D = c9934Glc.A0L(str);
                            } catch (Exception e3) {
                                e = e3;
                                C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                                while (e.getCause() != null) {
                                    e = e.getCause();
                                }
                                String message = e.getMessage();
                                AbstractC9855Gj3.A0F(e);
                                if (e instanceof Error) {
                                    throw e;
                                }
                                throw BV4.A0Q(message, e);
                            }
                        } else {
                            C9933GlW c9933GlW = c9938Glh._byEnumNamingResolver;
                            if (c9933GlW == null) {
                                if (AbstractC7609F5w.A1U(EnumC9965Gmd.A0I._mask, abstractC9904Gkk._featureFlags)) {
                                    c9933GlW = c9938Glh._byToStringResolver;
                                    if (c9933GlW == null) {
                                        synchronized (c9938Glh) {
                                            try {
                                                c9933GlW = c9938Glh._byToStringResolver;
                                                if (c9933GlW == null) {
                                                    c9933GlW = C9933GlW.A01(abstractC9904Gkk._config, c9938Glh._byNameResolver._enumClass);
                                                    c9938Glh._byToStringResolver = c9933GlW;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    c9933GlW = c9938Glh._byNameResolver;
                                }
                            }
                            objA0D = c9933GlW.A04(str);
                            if (objA0D == null) {
                                if (abstractC9904Gkk._config._datatypeFeatures.A00(EnumC9825GiJ.READ_ENUM_KEYS_USING_INDEX)) {
                                    c9933GlW = c9938Glh._byIndexResolver;
                                    if (c9933GlW == null) {
                                        synchronized (c9938Glh) {
                                            try {
                                                c9933GlW = c9938Glh._byIndexResolver;
                                                if (c9933GlW == null) {
                                                    C9898Gke c9898Gke = abstractC9904Gkk._config;
                                                    Class<Enum<?>> cls2 = c9938Glh._byNameResolver._enumClass;
                                                    AbstractC9910Gks abstractC9910GksA02 = c9898Gke.A02();
                                                    boolean zA09 = c9898Gke.A09(EnumC9951GmA.A01);
                                                    Enum<?>[] enumArrA02 = C9933GlW.A02(cls2);
                                                    HashMap mapA0u = BV4.A0u();
                                                    int length = enumArrA02.length;
                                                    while (true) {
                                                        length--;
                                                        if (length < 0) {
                                                            break;
                                                        }
                                                        mapA0u.put(String.valueOf(length), enumArrA02[length]);
                                                    }
                                                    c9933GlW = new C9933GlW(cls2, abstractC9910GksA02 != null ? abstractC9910GksA02.A0R(cls2) : null, mapA0u, enumArrA02, zA09, false);
                                                    c9938Glh._byIndexResolver = c9933GlW;
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                    objA0D = c9933GlW.A04(str);
                                }
                            }
                            if (objA0D == null) {
                                Object obj2 = c9938Glh._enumDefaultValue;
                                if (obj2 != null) {
                                    if (AbstractC7609F5w.A1U(EnumC9965Gmd.A0K._mask, abstractC9904Gkk._featureFlags)) {
                                        obj = obj2;
                                        objA0D = obj;
                                    }
                                }
                                if (!AbstractC7609F5w.A1U(EnumC9965Gmd.A0J._mask, abstractC9904Gkk._featureFlags)) {
                                    abstractC9904Gkk.A0j(c9938Glh._keyClass, str, "not one of the values accepted for Enum class: %s", c9933GlW._enumsById.keySet());
                                    throw F60.createAndThrow();
                                }
                            }
                        }
                    } else {
                        try {
                        } catch (IllegalArgumentException | MalformedURLException | Exception e4) {
                            abstractC9904Gkk.A0j(c9917Gl8._keyClass, str, "problem: %s", AbstractC9855Gj3.A0A(e4));
                        }
                        switch (c9917Gl8._kind) {
                            case 1:
                                if ("true".equals(str)) {
                                    objA0D = Boolean.TRUE;
                                    break;
                                } else {
                                    if (!"false".equals(str)) {
                                        abstractC9904Gkk.A0j(c9917Gl8._keyClass, str, "value not 'true' or 'false'", new Object[0]);
                                        throw F60.createAndThrow();
                                    }
                                    objA0D = Boolean.FALSE;
                                    break;
                                }
                            case 2:
                                int iA04 = HlV.A04(str);
                                if (iA04 >= -128 && iA04 <= 255) {
                                    objA0D = Byte.valueOf((byte) iA04);
                                    break;
                                } else {
                                    abstractC9904Gkk.A0j(c9917Gl8._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                                    throw F60.createAndThrow();
                                }
                                break;
                            case 3:
                                int iA042 = HlV.A04(str);
                                if (iA042 >= -32768 && iA042 <= 32767) {
                                    objA0D = Short.valueOf((short) iA042);
                                    break;
                                } else {
                                    abstractC9904Gkk.A0j(c9917Gl8._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                                    throw F60.createAndThrow();
                                }
                            case 4:
                                if (str.length() != 1) {
                                    abstractC9904Gkk.A0j(c9917Gl8._keyClass, str, "can only convert 1-character Strings", new Object[0]);
                                    throw F60.createAndThrow();
                                }
                                objA0D = Character.valueOf(str.charAt(0));
                                break;
                            case 5:
                                objA0D = Integer.valueOf(HlV.A04(str));
                                break;
                            case 6:
                                objA0D = Long.valueOf(HlV.A07(str));
                                break;
                            case 7:
                                AbstractC9916Gl7 abstractC9916Gl7 = abstractC9904Gkk.A00;
                                (abstractC9916Gl7 == null ? C10002GnY.A00 : abstractC9916Gl7.A1R()).A02(str.length());
                                Pattern pattern = HlV.A03;
                                objA0D = Float.valueOf((float) Double.parseDouble(str));
                                break;
                            case 8:
                                AbstractC9916Gl7 abstractC9916Gl72 = abstractC9904Gkk.A00;
                                (abstractC9916Gl72 == null ? C10002GnY.A00 : abstractC9916Gl72.A1R()).A02(str.length());
                                Pattern pattern2 = HlV.A03;
                                objA0D = Double.valueOf(Double.parseDouble(str));
                                break;
                            case 9:
                                objA0D = c9917Gl8._deser.A1M(abstractC9904Gkk, str);
                                break;
                            case 10:
                                objA0D = abstractC9904Gkk.A0T(str);
                                break;
                            case 11:
                                Date dateA0T = abstractC9904Gkk.A0T(str);
                                TimeZone timeZone = abstractC9904Gkk._config._base._timeZone;
                                if (timeZone == null) {
                                    timeZone = C9895GkY.A00;
                                }
                                Calendar calendar = Calendar.getInstance(timeZone);
                                calendar.setTime(dateA0T);
                                obj = calendar;
                                objA0D = obj;
                                break;
                            case 12:
                                objA0D = UUID.fromString(str);
                                break;
                            case 13:
                                objA0D = URI.create(str);
                                break;
                            case 14:
                                objA0D = new URL(str);
                                break;
                            case 15:
                                try {
                                    objA0D = abstractC9904Gkk._config._base._typeFactory.A0D(str);
                                    break;
                                } catch (Exception unused) {
                                    abstractC9904Gkk.A0j(c9917Gl8._keyClass, str, "unable to parse key as Class", new Object[0]);
                                    break;
                                }
                            case 16:
                                objA0D = c9917Gl8._deser.A1M(abstractC9904Gkk, str);
                                break;
                            case 17:
                                Gn1 gn1 = abstractC9904Gkk._config._base._defaultBase64;
                                C9964Gmb c9964Gmb = new C9964Gmb((HjR) null);
                                gn1.A07(c9964Gmb, str);
                                objA0D = c9964Gmb.A05();
                                break;
                            case 18:
                                AbstractC9916Gl7 abstractC9916Gl73 = abstractC9904Gkk.A00;
                                (abstractC9916Gl73 == null ? C10002GnY.A00 : abstractC9916Gl73.A1R()).A03(str.length());
                                Pattern pattern3 = HlV.A03;
                                objA0D = AbstractC6760EYu.A00(str);
                                break;
                            case 19:
                                AbstractC9916Gl7 abstractC9916Gl74 = abstractC9904Gkk.A00;
                                (abstractC9916Gl74 == null ? C10002GnY.A00 : abstractC9916Gl74.A1R()).A02(str.length());
                                Pattern pattern4 = HlV.A03;
                                try {
                                    objA0D = AbstractC6762EYw.A00(str);
                                    break;
                                } catch (ArithmeticException | NumberFormatException e5) {
                                    throw Hpa.A00(e5, str);
                                }
                            default:
                                throw C3cG.A0Q(C8j3.A14(c9917Gl8._keyClass, C60O.A0x("Internal error: unknown key type ")));
                        }
                    }
                    throw F60.createAndThrow();
                }
                objA0D = ((C10069Goq) c9917Gl8)._ctor.newInstance(str);
            }
            if (objA0D != null) {
                return objA0D;
            }
            Class<?> cls3 = c9917Gl8._keyClass;
            C10104GpS[] c10104GpSArr2 = AbstractC9855Gj3.A01;
            if (Enum.class.isAssignableFrom(cls3)) {
                if (AbstractC7609F5w.A1U(EnumC9965Gmd.A0J._mask, abstractC9904Gkk._config._deserFeatures)) {
                    return null;
                }
            }
            abstractC9904Gkk.A0j(c9917Gl8._keyClass, str, "not a valid representation", new Object[0]);
            throw F60.createAndThrow();
        }
        C9991GnI c9991GnI = (C9991GnI) this;
        if (str == null) {
            return null;
        }
        C9913Gl1 c9913Gl1 = new C9913Gl1(abstractC9904Gkk.A00);
        c9913Gl1.A0s(str);
        try {
            C9926GlN c9926GlNA00 = C9913Gl1.A00(c9913Gl1.A02, c9913Gl1);
            c9926GlNA00.A1P();
            Object objA0i = c9991GnI._delegate.A0i(c9926GlNA00, abstractC9904Gkk);
            if (objA0i != null) {
                return objA0i;
            }
            abstractC9904Gkk.A0j(c9991GnI._keyClass, str, "not a valid representation", new Object[0]);
            throw F60.createAndThrow();
        } catch (Exception e6) {
            cls = c9991GnI._keyClass;
            objArr = new Object[]{e6.getMessage()};
            str2 = "not a valid representation: %s";
        }
        abstractC9904Gkk.A0j(cls, str, str2, objArr);
        throw F60.createAndThrow();
    }
}
