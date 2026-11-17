package X;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.EnumNaming;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Gks, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9910Gks implements Serializable {
    public final C10003Gna A0L(AbstractC10031Go7 abstractC10031Go7, C10003Gna c10003Gna) {
        C10003Gna c10003Gna2 = c10003Gna;
        if (!(this instanceof C9888GkO)) {
            return c10003Gna;
        }
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) abstractC10031Go7.A0A(JsonIdentityReference.class);
        if (jsonIdentityReference == null) {
            return c10003Gna2;
        }
        if (c10003Gna == null) {
            c10003Gna2 = C10003Gna.A05;
        }
        boolean zAlwaysAsId = jsonIdentityReference.alwaysAsId();
        return c10003Gna2.A04 != zAlwaysAsId ? new C10003Gna(c10003Gna2.A00, c10003Gna2.A03, c10003Gna2.A01, c10003Gna2.A02, zAlwaysAsId) : c10003Gna2;
    }

    public static JsonSerialize A03(AbstractC10031Go7 abstractC10031Go7) {
        return (JsonSerialize) abstractC10031Go7.A0A(JsonSerialize.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[PHI: r2
  0x0059: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v2 java.lang.String) binds: [B:23:0x0056, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10085Gp8 A06(X.AbstractC9970Gmj r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C9888GkO
            if (r0 == 0) goto L5f
            java.lang.Class<com.fasterxml.jackson.annotation.JacksonInject> r0 = com.fasterxml.jackson.annotation.JacksonInject.class
            java.lang.annotation.Annotation r0 = r4.A0A(r0)
            com.fasterxml.jackson.annotation.JacksonInject r0 = (com.fasterxml.jackson.annotation.JacksonInject) r0
            if (r0 == 0) goto L5f
            java.lang.String r2 = r0.value()
            X.G4b r0 = r0.useInput()
            java.lang.Boolean r1 = r0.A00()
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L56
            r2 = 0
        L23:
            if (r1 != 0) goto L59
            X.Gp8 r3 = X.C10085Gp8.A00
        L27:
            java.lang.Object r0 = r3._id
            if (r0 != 0) goto L50
            boolean r0 = r4 instanceof X.C9934Glc
            if (r0 == 0) goto L51
            r1 = r4
            X.Gnx r1 = (X.AbstractC10024Gnx) r1
            int r0 = r1.A0G()
            if (r0 == 0) goto L51
            r0 = 0
            java.lang.Class r0 = r1.A0J(r0)
        L3d:
            java.lang.String r1 = r0.getName()
            java.lang.Object r0 = r3._id
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L50
            java.lang.Boolean r0 = r3._useInput
            X.Gp8 r3 = new X.Gp8
            r3.<init>(r0, r1)
        L50:
            return r3
        L51:
            java.lang.Class r0 = r4.A08()
            goto L3d
        L56:
            if (r2 != 0) goto L59
            goto L23
        L59:
            X.Gp8 r3 = new X.Gp8
            r3.<init>(r1, r2)
            goto L27
        L5f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9910Gks.A06(X.Gmj):X.Gp8");
    }

    public final EnumC8882Fsl A07(AbstractC10031Go7 abstractC10031Go7) {
        JsonCreator jsonCreator;
        if (!(this instanceof C9888GkO) || (jsonCreator = (JsonCreator) abstractC10031Go7.A0A(JsonCreator.class)) == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    public final C9894GkV A08(AbstractC10031Go7 abstractC10031Go7) {
        if (!(this instanceof C9888GkO)) {
            return C9894GkV.A01;
        }
        JsonFormat jsonFormat = (JsonFormat) abstractC10031Go7.A0A(JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        C9894GkV c9894GkV = C9894GkV.A01;
        String strPattern = jsonFormat.pattern();
        EnumC10046GoQ enumC10046GoQShape = jsonFormat.shape();
        String strLocale = jsonFormat.locale();
        String strTimezone = jsonFormat.timezone();
        EnumC10062Goj[] enumC10062GojArrWith = jsonFormat.with();
        EnumC10062Goj[] enumC10062GojArrWithout = jsonFormat.without();
        int iOrdinal = 0;
        for (EnumC10062Goj enumC10062Goj : enumC10062GojArrWith) {
            iOrdinal |= 1 << enumC10062Goj.ordinal();
        }
        int iOrdinal2 = 0;
        for (EnumC10062Goj enumC10062Goj2 : enumC10062GojArrWithout) {
            iOrdinal2 |= 1 << enumC10062Goj2.ordinal();
        }
        C10101GpP c10101GpP = new C10101GpP(iOrdinal, iOrdinal2);
        Boolean boolA00 = jsonFormat.lenient().A00();
        Locale locale = (strLocale == null || strLocale.length() == 0 || "##default".equals(strLocale)) ? null : new Locale(strLocale);
        if (strTimezone == null || strTimezone.length() == 0 || "##default".equals(strTimezone)) {
            strTimezone = null;
        }
        return new C9894GkV(c10101GpP, enumC10046GoQShape, boolA00, strPattern, strTimezone, locale, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.HashSet] */
    public final C10029Go4 A09(AbstractC10031Go7 abstractC10031Go7) {
        JsonIgnoreProperties jsonIgnoreProperties;
        ?? hashSet;
        int length;
        if (!(this instanceof C9888GkO) || (jsonIgnoreProperties = (JsonIgnoreProperties) abstractC10031Go7.A0A(JsonIgnoreProperties.class)) == null) {
            return C10029Go4.A00;
        }
        String[] strArrValue = jsonIgnoreProperties.value();
        if (strArrValue == null || (length = strArrValue.length) == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(length);
            int i = 0;
            do {
                hashSet.add(strArrValue[i]);
                i++;
            } while (i < length);
        }
        return C10029Go4.A00(hashSet, jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10007Gnf A0A(X.AbstractC10031Go7 r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C9888GkO
            if (r0 == 0) goto L70
            java.lang.Class<com.fasterxml.jackson.annotation.JsonInclude> r0 = com.fasterxml.jackson.annotation.JsonInclude.class
            java.lang.annotation.Annotation r6 = r7.A0A(r0)
            com.fasterxml.jackson.annotation.JsonInclude r6 = (com.fasterxml.jackson.annotation.JsonInclude) r6
            if (r6 == 0) goto L1c
            X.Gom r5 = r6.value()
            X.Gom r4 = r6.content()
            X.Gom r0 = X.EnumC10065Gom.USE_DEFAULTS
            if (r5 != r0) goto L59
            if (r4 != r0) goto L59
        L1c:
            X.Gnf r6 = X.C10007Gnf.A00
        L1e:
            X.Gom r1 = r6._valueInclusion
            X.Gom r0 = X.EnumC10065Gom.USE_DEFAULTS
            if (r1 != r0) goto L4f
            com.fasterxml.jackson.databind.annotation.JsonSerialize r0 = A03(r7)
            if (r0 == 0) goto L4f
            X.GpD r0 = r0.include()
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L56
            r0 = 1
            if (r1 == r0) goto L53
            r0 = 2
            if (r1 == r0) goto L50
            r0 = 3
            if (r1 != r0) goto L4f
            X.Gom r3 = X.EnumC10065Gom.NON_EMPTY
        L40:
            X.Gom r0 = r6._valueInclusion
            if (r3 == r0) goto L4f
            X.Gom r2 = r6._contentInclusion
            java.lang.Class<?> r1 = r6._valueFilter
            java.lang.Class<?> r0 = r6._contentFilter
            X.Gnf r6 = new X.Gnf
            r6.<init>(r3, r2, r1, r0)
        L4f:
            return r6
        L50:
            X.Gom r3 = X.EnumC10065Gom.NON_DEFAULT
            goto L40
        L53:
            X.Gom r3 = X.EnumC10065Gom.NON_NULL
            goto L40
        L56:
            X.Gom r3 = X.EnumC10065Gom.ALWAYS
            goto L40
        L59:
            java.lang.Class r3 = r6.valueFilter()
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r1 = 0
            if (r3 != r2) goto L63
            r3 = r1
        L63:
            java.lang.Class r0 = r6.contentFilter()
            if (r0 == r2) goto L6a
            r1 = r0
        L6a:
            X.Gnf r6 = new X.Gnf
            r6.<init>(r5, r4, r3, r1)
            goto L1e
        L70:
            X.Gnf r6 = X.C10007Gnf.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9910Gks.A0A(X.Go7):X.Gnf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.HashSet] */
    public final C10084Gp7 A0B(AbstractC10031Go7 abstractC10031Go7) {
        JsonIncludeProperties jsonIncludeProperties;
        ?? hashSet;
        int length;
        if (!(this instanceof C9888GkO) || (jsonIncludeProperties = (JsonIncludeProperties) abstractC10031Go7.A0A(JsonIncludeProperties.class)) == null) {
            return C10084Gp7.A00;
        }
        String[] strArrValue = jsonIncludeProperties.value();
        if (strArrValue == null || (length = strArrValue.length) == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(length);
            int i = 0;
            do {
                hashSet.add(strArrValue[i]);
                i++;
            } while (i < length);
        }
        return new C10084Gp7(hashSet);
    }

    public final Hl1 A0C(AbstractC10031Go7 abstractC10031Go7) {
        JsonProperty jsonProperty;
        if (!(this instanceof C9888GkO) || (jsonProperty = (JsonProperty) abstractC10031Go7.A0A(JsonProperty.class)) == null) {
            return null;
        }
        return jsonProperty.access();
    }

    public final C10079Gp0 A0D(AbstractC10031Go7 abstractC10031Go7) {
        JsonSetter jsonSetter;
        if ((this instanceof C9888GkO) && (jsonSetter = (JsonSetter) abstractC10031Go7.A0A(JsonSetter.class)) != null) {
            EnumC10073Gou enumC10073GouNulls = jsonSetter.nulls();
            EnumC10073Gou enumC10073GouContentNulls = jsonSetter.contentNulls();
            if (enumC10073GouNulls == null) {
                enumC10073GouNulls = EnumC10073Gou.DEFAULT;
            }
            if (enumC10073GouContentNulls == null) {
                enumC10073GouContentNulls = EnumC10073Gou.DEFAULT;
            }
            EnumC10073Gou enumC10073Gou = EnumC10073Gou.DEFAULT;
            if (enumC10073GouNulls != enumC10073Gou || enumC10073GouContentNulls != enumC10073Gou) {
                return new C10079Gp0(enumC10073GouNulls, enumC10073GouContentNulls);
            }
        }
        return C10079Gp0.A00;
    }

    public final GnQ A0E(AbstractC10031Go7 abstractC10031Go7) {
        JsonTypeInfo jsonTypeInfo;
        if (!(this instanceof C9888GkO) || (jsonTypeInfo = (JsonTypeInfo) abstractC10031Go7.A0A(JsonTypeInfo.class)) == null) {
            return null;
        }
        EnumC10066Gon enumC10066GonUse = jsonTypeInfo.use();
        EnumC10075Gow enumC10075GowInclude = jsonTypeInfo.include();
        String strProperty = jsonTypeInfo.property();
        Class<?> clsDefaultImpl = jsonTypeInfo.defaultImpl();
        boolean zVisible = jsonTypeInfo.visible();
        Boolean boolA00 = jsonTypeInfo.requireTypeIdForSubtypes().A00();
        if (strProperty == null || strProperty.isEmpty()) {
            strProperty = enumC10066GonUse != null ? enumC10066GonUse._defaultPropertyName : "";
        }
        if (clsDefaultImpl == null || clsDefaultImpl.isAnnotation()) {
            clsDefaultImpl = null;
        }
        return new GnQ(enumC10075GowInclude, enumC10066GonUse, boolA00, clsDefaultImpl, strProperty, zVisible);
    }

    public final GqU A0F(AbstractC9970Gmj abstractC9970Gmj) {
        String strValue;
        Integer num;
        if (!(this instanceof C9888GkO)) {
            return null;
        }
        JsonManagedReference jsonManagedReference = (JsonManagedReference) abstractC9970Gmj.A0A(JsonManagedReference.class);
        if (jsonManagedReference != null) {
            strValue = jsonManagedReference.value();
            num = C79.A00;
        } else {
            JsonBackReference jsonBackReference = (JsonBackReference) abstractC9970Gmj.A0A(JsonBackReference.class);
            if (jsonBackReference == null) {
                return null;
            }
            strValue = jsonBackReference.value();
            num = C79.A01;
        }
        return new GqU(num, strValue);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/Go7;LX/GjI;)LX/GjI; */
    public final AbstractC9870GjI A0G(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, AbstractC10031Go7 abstractC10031Go7) throws JsonMappingException, NegativeArraySizeException {
        Class<?> clsAs;
        Class<?> clsContentAs;
        Object[] objArrA05;
        String str;
        Class<?> clsKeyAs;
        if (this instanceof C9888GkO) {
            C9860Gj8 c9860Gj8 = abstractC9901Gkh._base._typeFactory;
            JsonDeserialize jsonDeserialize = (JsonDeserialize) abstractC10031Go7.A0A(JsonDeserialize.class);
            if (jsonDeserialize == null) {
                clsAs = null;
            } else {
                clsAs = jsonDeserialize.as();
                if (clsAs == null || AbstractC9855Gj3.A0I(clsAs)) {
                    clsAs = null;
                }
            }
            if (clsAs != null && abstractC9870GjI._class != clsAs && !C9888GkO.A01(abstractC9870GjI, clsAs)) {
                try {
                    abstractC9870GjI = c9860Gj8.A06(abstractC9870GjI, clsAs, false);
                } catch (IllegalArgumentException e) {
                    e = e;
                    objArrA05 = A05(abstractC10031Go7, clsAs, abstractC9870GjI, e);
                    str = "Failed to narrow type %s with annotation (value %s), from '%s': %s";
                    throw new JsonMappingException(null, String.format(str, objArrA05), e);
                }
            }
            if (abstractC9870GjI instanceof C9868GjG) {
                AbstractC9870GjI abstractC9870GjIA08 = abstractC9870GjI.A08();
                if (jsonDeserialize != null && (clsKeyAs = jsonDeserialize.keyAs()) != null && !AbstractC9855Gj3.A0I(clsKeyAs) && !C9888GkO.A01(abstractC9870GjIA08, clsKeyAs)) {
                    try {
                        abstractC9870GjI = ((C9868GjG) abstractC9870GjI).A0W(c9860Gj8.A06(abstractC9870GjIA08, clsKeyAs, false));
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        objArrA05 = A05(abstractC10031Go7, clsKeyAs, abstractC9870GjI, e);
                        str = "Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s";
                        throw new JsonMappingException(null, String.format(str, objArrA05), e);
                    }
                }
            }
            AbstractC9870GjI abstractC9870GjIA07 = abstractC9870GjI.A07();
            if (abstractC9870GjIA07 != null && jsonDeserialize != null && (clsContentAs = jsonDeserialize.contentAs()) != null && !AbstractC9855Gj3.A0I(clsContentAs) && !C9888GkO.A01(abstractC9870GjIA07, clsContentAs)) {
                try {
                    abstractC9870GjI = abstractC9870GjI.A0C(c9860Gj8.A06(abstractC9870GjIA07, clsContentAs, false));
                    return abstractC9870GjI;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    objArrA05 = A05(abstractC10031Go7, clsContentAs, abstractC9870GjI, e);
                    str = "Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s";
                    throw new JsonMappingException(null, String.format(str, objArrA05), e);
                }
            }
        }
        return abstractC9870GjI;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/Go7;LX/GjI;)LX/GjI; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[PHI: r8
  0x003f: PHI (r8v2 X.GjI) = (r8v1 X.GjI), (r8v1 X.GjI), (r8v1 X.GjI), (r8v1 X.GjI), (r8v5 X.GjI) binds: [B:13:0x001d, B:15:0x0023, B:17:0x0029, B:19:0x002f, B:23:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9870GjI A0H(X.AbstractC9870GjI r8, X.AbstractC9901Gkh r9, X.AbstractC10031Go7 r10) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9910Gks.A0H(X.GjI, X.Gkh, X.Go7):X.GjI");
    }

    public final C10009Gnh A0I(AbstractC10031Go7 abstractC10031Go7) {
        boolean z;
        boolean zAND;
        if (!(this instanceof C9888GkO)) {
            return null;
        }
        JsonSetter jsonSetter = (JsonSetter) abstractC10031Go7.A0A(JsonSetter.class);
        if (jsonSetter != null) {
            String strValue = jsonSetter.value();
            if (!strValue.isEmpty()) {
                return C10009Gnh.A00(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) abstractC10031Go7.A0A(JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return C10009Gnh.A01(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (!z) {
            Class<? extends Annotation>[] clsArr = C9888GkO.A01;
            if (abstractC10031Go7 instanceof AbstractC9970Gmj) {
                C9971Gmk c9971Gmk = ((AbstractC9970Gmj) abstractC10031Go7).A00;
                if (c9971Gmk == null) {
                    return null;
                }
                zAND = c9971Gmk.AND(clsArr);
            } else {
                zAND = ((C9909Gkr) abstractC10031Go7).A04.AND(clsArr);
            }
            if (!zAND) {
                return null;
            }
        }
        return C10009Gnh.A01;
    }

    public final C10009Gnh A0J(AbstractC10031Go7 abstractC10031Go7) {
        boolean z;
        boolean zAND;
        if (!(this instanceof C9888GkO)) {
            return null;
        }
        JsonGetter jsonGetter = (JsonGetter) abstractC10031Go7.A0A(JsonGetter.class);
        if (jsonGetter != null) {
            String strValue = jsonGetter.value();
            if (!strValue.isEmpty()) {
                return C10009Gnh.A00(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) abstractC10031Go7.A0A(JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return C10009Gnh.A01(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (!z) {
            Class<? extends Annotation>[] clsArr = C9888GkO.A02;
            if (abstractC10031Go7 instanceof AbstractC9970Gmj) {
                C9971Gmk c9971Gmk = ((AbstractC9970Gmj) abstractC10031Go7).A00;
                if (c9971Gmk == null) {
                    return null;
                }
                zAND = c9971Gmk.AND(clsArr);
            } else {
                zAND = ((C9909Gkr) abstractC10031Go7).A04.AND(clsArr);
            }
            if (!zAND) {
                return null;
            }
        }
        return C10009Gnh.A01;
    }

    public final C10003Gna A0K(AbstractC10031Go7 abstractC10031Go7) {
        JsonIdentityInfo jsonIdentityInfo;
        if (!(this instanceof C9888GkO) || (jsonIdentityInfo = (JsonIdentityInfo) abstractC10031Go7.A0A(JsonIdentityInfo.class)) == null || jsonIdentityInfo.generator() == AbstractC10186Gqw.class) {
            return null;
        }
        C10009Gnh c10009GnhA00 = C10009Gnh.A00(jsonIdentityInfo.property());
        C10003Gna c10003Gna = C10003Gna.A05;
        return new C10003Gna(c10009GnhA00, jsonIdentityInfo.scope(), jsonIdentityInfo.generator(), jsonIdentityInfo.resolver(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC10187Gqy A0M(X.AbstractC9970Gmj r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C9888GkO
            if (r0 == 0) goto L4e
            java.lang.Class<com.fasterxml.jackson.annotation.JsonUnwrapped> r0 = com.fasterxml.jackson.annotation.JsonUnwrapped.class
            java.lang.annotation.Annotation r1 = r4.A0A(r0)
            com.fasterxml.jackson.annotation.JsonUnwrapped r1 = (com.fasterxml.jackson.annotation.JsonUnwrapped) r1
            if (r1 == 0) goto L4e
            boolean r0 = r1.enabled()
            if (r0 == 0) goto L4e
            java.lang.String r4 = r1.prefix()
            java.lang.String r3 = r1.suffix()
            X.Gqy r0 = X.AbstractC10187Gqy.A00
            r2 = 1
            if (r4 == 0) goto L28
            boolean r0 = r4.isEmpty()
            r1 = 1
            if (r0 == 0) goto L29
        L28:
            r1 = 0
        L29:
            if (r3 == 0) goto L3b
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L3b
        L31:
            if (r1 == 0) goto L43
            if (r2 == 0) goto L3d
            X.GqN r0 = new X.GqN
            r0.<init>(r4, r3)
            return r0
        L3b:
            r2 = 0
            goto L31
        L3d:
            X.GqM r0 = new X.GqM
            r0.<init>(r4)
            return r0
        L43:
            if (r2 == 0) goto L4b
            X.GqL r0 = new X.GqL
            r0.<init>(r3)
            return r0
        L4b:
            X.Gqy r0 = X.AbstractC10187Gqy.A00
            return r0
        L4e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9910Gks.A0M(X.Gmj):X.Gqy");
    }

    public final Boolean A0N(AbstractC10031Go7 abstractC10031Go7) {
        JsonPropertyOrder jsonPropertyOrder;
        if ((this instanceof C9888GkO) && (jsonPropertyOrder = (JsonPropertyOrder) abstractC10031Go7.A0A(JsonPropertyOrder.class)) != null && jsonPropertyOrder.alphabetic()) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final Boolean A0O(AbstractC10031Go7 abstractC10031Go7) {
        JsonAnySetter jsonAnySetter;
        if (!(this instanceof C9888GkO) || (jsonAnySetter = (JsonAnySetter) abstractC10031Go7.A0A(JsonAnySetter.class)) == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnySetter.enabled());
    }

    public final Boolean A0P(AbstractC9970Gmj abstractC9970Gmj) {
        HashMap<Class<?>, Annotation> map;
        if (!(this instanceof C9888GkO)) {
            return null;
        }
        C9971Gmk c9971Gmk = abstractC9970Gmj.A00;
        return Boolean.valueOf((c9971Gmk == null || (map = c9971Gmk.A00) == null) ? false : map.containsKey(JsonTypeId.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Enum<?> A0Q(C9909Gkr c9909Gkr, Enum<?>[] enumArr) {
        if (!(this instanceof C9888GkO)) {
            return A0R(c9909Gkr.A05);
        }
        for (AbstractC10031Go7 abstractC10031Go7 : C9909Gkr.A04(c9909Gkr)) {
            if (abstractC10031Go7.A07().A0S() && abstractC10031Go7.A0A(JsonEnumDefaultValue.class) != null) {
                for (Enum<?> r4 : enumArr) {
                    if (r4.name().equals(abstractC10031Go7.A09())) {
                        return r4;
                    }
                }
            }
        }
        return null;
    }

    @Deprecated
    public final Enum<?> A0R(Class<Enum<?>> cls) {
        if (this instanceof C9888GkO) {
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant() && field.getAnnotation(JsonEnumDefaultValue.class) != null) {
                    String name = field.getName();
                    for (Enum<?> r1 : cls.getEnumConstants()) {
                        if (name.equals(r1.name())) {
                            return r1;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final Object A0S(AbstractC10031Go7 abstractC10031Go7) {
        JsonDeserialize jsonDeserialize;
        Class<? extends JsonDeserializer> clsContentUsing;
        if (!(this instanceof C9888GkO) || (jsonDeserialize = (JsonDeserialize) abstractC10031Go7.A0A(JsonDeserialize.class)) == null || (clsContentUsing = jsonDeserialize.contentUsing()) == JsonDeserializer.None.class) {
            return null;
        }
        return clsContentUsing;
    }

    public final Object A0T(AbstractC10031Go7 abstractC10031Go7) {
        JsonSerialize jsonSerializeA03;
        Class<? extends JsonSerializer> clsContentUsing;
        if (!(this instanceof C9888GkO) || (jsonSerializeA03 = A03(abstractC10031Go7)) == null || (clsContentUsing = jsonSerializeA03.contentUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsContentUsing;
    }

    public final Object A0U(AbstractC10031Go7 abstractC10031Go7) {
        JsonDeserialize jsonDeserialize;
        Class<? extends InterfaceC9854Giz> clsConverter;
        if (!(this instanceof C9888GkO) || (jsonDeserialize = (JsonDeserialize) abstractC10031Go7.A0A(JsonDeserialize.class)) == null || (clsConverter = jsonDeserialize.converter()) == null || AbstractC9855Gj3.A0I(clsConverter) || clsConverter == AbstractC9850Giu.class) {
            return null;
        }
        return clsConverter;
    }

    public final Object A0V(AbstractC10031Go7 abstractC10031Go7) {
        JsonDeserialize jsonDeserialize;
        Class<? extends JsonDeserializer> clsUsing;
        if (!(this instanceof C9888GkO) || (jsonDeserialize = (JsonDeserialize) abstractC10031Go7.A0A(JsonDeserialize.class)) == null || (clsUsing = jsonDeserialize.using()) == JsonDeserializer.None.class) {
            return null;
        }
        return clsUsing;
    }

    public final Object A0W(AbstractC10031Go7 abstractC10031Go7) {
        JsonFilter jsonFilter;
        if (!(this instanceof C9888GkO) || (jsonFilter = (JsonFilter) abstractC10031Go7.A0A(JsonFilter.class)) == null) {
            return null;
        }
        String strValue = jsonFilter.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    public final Object A0X(AbstractC10031Go7 abstractC10031Go7) {
        JsonDeserialize jsonDeserialize;
        Class<? extends AbstractC9877Gjl> clsKeyUsing;
        if (!(this instanceof C9888GkO) || (jsonDeserialize = (JsonDeserialize) abstractC10031Go7.A0A(JsonDeserialize.class)) == null || (clsKeyUsing = jsonDeserialize.keyUsing()) == AbstractC10190Gr7.class) {
            return null;
        }
        return clsKeyUsing;
    }

    public final Object A0Y(AbstractC10031Go7 abstractC10031Go7) {
        JsonSerialize jsonSerializeA03;
        Class<? extends JsonSerializer> clsKeyUsing;
        if (!(this instanceof C9888GkO) || (jsonSerializeA03 = A03(abstractC10031Go7)) == null || (clsKeyUsing = jsonSerializeA03.keyUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsKeyUsing;
    }

    public final Object A0Z(AbstractC10031Go7 abstractC10031Go7) {
        JsonSerialize jsonSerializeA03;
        Class<? extends InterfaceC9854Giz> clsConverter;
        if (!(this instanceof C9888GkO) || (jsonSerializeA03 = A03(abstractC10031Go7)) == null || (clsConverter = jsonSerializeA03.converter()) == null || AbstractC9855Gj3.A0I(clsConverter) || clsConverter == AbstractC9850Giu.class) {
            return null;
        }
        return clsConverter;
    }

    public final String A0a(C9909Gkr c9909Gkr) {
        JsonTypeName jsonTypeName;
        if (!(this instanceof C9888GkO) || (jsonTypeName = (JsonTypeName) c9909Gkr.A0A(JsonTypeName.class)) == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    public final List<C10009Gnh> A0b(AbstractC10031Go7 abstractC10031Go7) {
        JsonAlias jsonAlias;
        if (!(this instanceof C9888GkO) || (jsonAlias = (JsonAlias) abstractC10031Go7.A0A(JsonAlias.class)) == null) {
            return null;
        }
        String[] strArrValue = jsonAlias.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayListA11 = C60O.A11(length);
        int i = 0;
        do {
            arrayListA11.add(C10009Gnh.A00(strArrValue[i]));
            i++;
        } while (i < length);
        return arrayListA11;
    }

    public final List<HjD> A0c(AbstractC10031Go7 abstractC10031Go7) {
        JsonSubTypes jsonSubTypes;
        if (!(this instanceof C9888GkO) || (jsonSubTypes = (JsonSubTypes) abstractC10031Go7.A0A(JsonSubTypes.class)) == null) {
            return null;
        }
        JsonSubTypes.Type[] typeArrValue = jsonSubTypes.value();
        if (!jsonSubTypes.failOnRepeatedNames()) {
            ArrayList arrayListA11 = C60O.A11(typeArrValue.length);
            for (JsonSubTypes.Type type : typeArrValue) {
                arrayListA11.add(new HjD(type.value(), type.name()));
                for (String str : type.names()) {
                    arrayListA11.add(new HjD(type.value(), str));
                }
            }
            return arrayListA11;
        }
        String strA09 = abstractC10031Go7.A09();
        ArrayList arrayListA112 = C60O.A11(typeArrValue.length);
        HashSet hashSetA13 = C60O.A13();
        for (JsonSubTypes.Type type2 : typeArrValue) {
            String strName = type2.name();
            if (!strName.isEmpty() && hashSetA13.contains(strName)) {
                throw FGI.A01("Annotated type [", strA09, "] got repeated subtype name [", strName, "]");
            }
            hashSetA13.add(strName);
            arrayListA112.add(new HjD(type2.value(), strName));
            for (String str2 : type2.names()) {
                if (!str2.isEmpty() && hashSetA13.contains(str2)) {
                    throw FGI.A01("Annotated type [", strA09, "] got repeated subtype name [", str2, "]");
                }
                hashSetA13.add(str2);
                arrayListA112.add(new HjD(type2.value(), str2));
            }
        }
        return arrayListA112;
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/Gkh<*>;LX/Gkr;[Ljava/lang/Enum<*>;[Ljava/lang/String;)[Ljava/lang/String; */
    public final void A0d(C9909Gkr c9909Gkr, Enum[] enumArr, String[] strArr) {
        String strValue;
        if (this instanceof C9888GkO) {
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            for (C9943Glv c9943Glv : C9909Gkr.A04(c9909Gkr)) {
                JsonProperty jsonProperty = (JsonProperty) c9943Glv.A0A(JsonProperty.class);
                if (jsonProperty != null && (strValue = jsonProperty.value()) != null && !strValue.isEmpty()) {
                    linkedHashMapA0j.put(c9943Glv.A00.getName(), strValue);
                }
            }
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = linkedHashMapA0j.get(enumArr[i].name());
                if (obj != null) {
                    strArr[i] = obj;
                }
            }
        }
    }

    public final void A0e(C9909Gkr c9909Gkr, Enum[] enumArr, String[][] strArr) {
        if (this instanceof C9888GkO) {
            HashMap mapA0u = BV4.A0u();
            for (C9943Glv c9943Glv : C9909Gkr.A04(c9909Gkr)) {
                JsonAlias jsonAlias = (JsonAlias) c9943Glv.A0A(JsonAlias.class);
                if (jsonAlias != null) {
                    mapA0u.putIfAbsent(c9943Glv.A00.getName(), jsonAlias.value());
                }
            }
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                strArr[i] = mapA0u.getOrDefault(enumArr[i].name(), new String[0]);
            }
        }
    }

    public final boolean A0f(AbstractC9970Gmj abstractC9970Gmj) {
        JsonIgnore jsonIgnore;
        if (!(this instanceof C9888GkO) || (jsonIgnore = (JsonIgnore) abstractC9970Gmj.A0A(JsonIgnore.class)) == null) {
            return false;
        }
        return jsonIgnore.value();
    }

    public final boolean A0g(Annotation annotation) {
        if (!(this instanceof C9888GkO)) {
            return false;
        }
        C9888GkO c9888GkO = (C9888GkO) this;
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        String name = clsAnnotationType.getName();
        Boolean boolValueOf = c9888GkO.A00.A00.get(name);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(AnonymousClass002.A1X(clsAnnotationType.getAnnotation(JacksonAnnotationsInside.class)));
            c9888GkO.A00.A00.putIfAbsent(name, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    public final Class<?>[] A0h(AbstractC10031Go7 abstractC10031Go7) {
        JsonView jsonView;
        if (!(this instanceof C9888GkO) || (jsonView = (JsonView) abstractC10031Go7.A0A(JsonView.class)) == null) {
            return null;
        }
        return jsonView.value();
    }

    public static void A04(AbstractC9901Gkh abstractC9901Gkh, C9909Gkr c9909Gkr) {
        EnumNaming enumNaming;
        AbstractC10106GpW.A00((!(abstractC9901Gkh.A02() instanceof C9888GkO) || (enumNaming = (EnumNaming) c9909Gkr.A0A(EnumNaming.class)) == null) ? null : enumNaming.value(), abstractC9901Gkh.A07());
    }

    public static Object[] A05(AbstractC10031Go7 abstractC10031Go7, Class cls, Object obj, Throwable th) {
        return new Object[]{obj, cls.getName(), abstractC10031Go7.A09(), th.getMessage()};
    }
}
