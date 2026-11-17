package X;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Gkf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9899Gkf extends AbstractC9794GhC implements Serializable {
    public static final AbstractC9910Gks A00;
    public static final C9895GkY A01;
    public static final long serialVersionUID = 2;
    public final C10064Gol _coercionConfigs;
    public final C10045GoP _configOverrides;
    public C9898Gke _deserializationConfig;
    public AbstractC9920GlH _deserializationContext;
    public AbstractC10205GrR _injectableValues;
    public final C9924GlL _jsonFactory;
    public C10053GoX _mixIns;
    public Set<Object> _registeredModuleTypes;
    public final ConcurrentHashMap<AbstractC9870GjI, JsonDeserializer<Object>> _rootDeserializers;
    public C9963Gma _serializationConfig;
    public AbstractC9843Gik _serializerFactory;
    public AbstractC9846Gip _serializerProvider;
    public AbstractC10058Gof _subtypeResolver;
    public C9860Gj8 _typeFactory;

    public C9899Gkf() {
        this(null);
    }

    static {
        C9888GkO c9888GkO = new C9888GkO();
        A00 = c9888GkO;
        C9860Gj8 c9860Gj8 = C9860Gj8.A08;
        HtX htX = HtX.A03;
        Locale locale = Locale.getDefault();
        Gn1 gn1 = AbstractC10054GoZ.A01;
        C10151GqI c10151GqI = C10151GqI.A00;
        A01 = new C9895GkY(gn1, c9888GkO, null, Gr2.A00, new GpV(), null, c10151GqI, null, c9860Gj8, htX, locale, null);
    }

    public JsonDeserializer<Object> A04(AbstractC9904Gkk abstractC9904Gkk, AbstractC9870GjI abstractC9870GjI) throws InvalidDefinitionException {
        JsonDeserializer<Object> jsonDeserializerA0J = this._rootDeserializers.get(abstractC9870GjI);
        if (jsonDeserializerA0J == null) {
            jsonDeserializerA0J = abstractC9904Gkk.A0J(abstractC9870GjI);
            if (jsonDeserializerA0J == null) {
                abstractC9904Gkk.A0E(abstractC9870GjI, AnonymousClass007.A0a("Cannot find a deserializer for type ", abstractC9870GjI));
                throw F60.createAndThrow();
            }
            this._rootDeserializers.put(abstractC9870GjI, jsonDeserializerA0J);
        }
        return jsonDeserializerA0J;
    }

    public final AbstractC9846Gip A05(C9963Gma c9963Gma) {
        AbstractC9843Gik abstractC9843Gik;
        C9785Ggn c9785Ggn;
        boolean z;
        AbstractC9842Gii abstractC9842Gii;
        if (this instanceof C9796GhE) {
            C9796GhE c9796GhE = (C9796GhE) this;
            AbstractC9842Gii abstractC9842Gii2 = c9796GhE._serializerProvider;
            abstractC9843Gik = c9796GhE._serializerFactory;
            c9785Ggn = c9796GhE.A00;
            z = c9796GhE.mHumanReadableFormatEnabled;
            abstractC9842Gii = abstractC9842Gii2;
        } else {
            AbstractC9846Gip abstractC9846Gip = this._serializerProvider;
            abstractC9843Gik = this._serializerFactory;
            if (abstractC9846Gip instanceof C9792Gh2) {
                return new C9792Gh2(c9963Gma, abstractC9846Gip, abstractC9843Gik);
            }
            C9784Ggl c9784Ggl = (C9784Ggl) abstractC9846Gip;
            c9785Ggn = c9784Ggl.A00;
            z = false;
            abstractC9842Gii = c9784Ggl;
        }
        return new C9784Ggl(c9785Ggn, c9963Gma, abstractC9842Gii, abstractC9843Gik, z);
    }

    public Object A06(AbstractC9916Gl7 abstractC9916Gl7, C9898Gke c9898Gke, AbstractC9870GjI abstractC9870GjI) throws MismatchedInputException {
        EnumC9834GiY enumC9834GiYA1P;
        C9898Gke c9898Gke2 = this._deserializationConfig;
        int i = c9898Gke2._parserFeaturesToChange;
        if (i != 0) {
            abstractC9916Gl7.A1l(c9898Gke2._parserFeatures, i);
        }
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N == null && (enumC9834GiYA1N = abstractC9916Gl7.A1P()) == null) {
            throw MismatchedInputException.A00(abstractC9916Gl7, abstractC9870GjI, "No content to map due to end-of-input");
        }
        Object objA0n = null;
        C10199GrK c10199GrK = new C10199GrK(abstractC9916Gl7, c9898Gke, this._deserializationContext);
        if (enumC9834GiYA1N == EnumC9834GiY.VALUE_NULL) {
            objA0n = A04(c10199GrK, abstractC9870GjI).AIA(c10199GrK);
        } else if (enumC9834GiYA1N != EnumC9834GiY.END_ARRAY && enumC9834GiYA1N != EnumC9834GiY.END_OBJECT && enumC9834GiYA1N != EnumC9834GiY.NOT_AVAILABLE) {
            objA0n = c10199GrK.A0n(abstractC9916Gl7, abstractC9870GjI, A04(c10199GrK, abstractC9870GjI), null);
        }
        abstractC9916Gl7.A1i();
        if (!AbstractC7609F5w.A1U(EnumC9965Gmd.A0E._mask, c9898Gke._deserFeatures) || (enumC9834GiYA1P = abstractC9916Gl7.A1P()) == null) {
            return objA0n;
        }
        Class<?> cls = abstractC9870GjI == null ? null : abstractC9870GjI._class;
        MismatchedInputException mismatchedInputException = new MismatchedInputException(abstractC9916Gl7, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", enumC9834GiYA1P, AbstractC9855Gj3.A06(cls)));
        mismatchedInputException._targetType = cls;
        throw mismatchedInputException;
    }

    public final void A07(AbstractC9798GhG abstractC9798GhG) {
        AbstractC10207GrT[] abstractC10207GrTArr;
        if (abstractC9798GhG == null) {
            throw BV5.A0T("argument \"%s\" is null", new Object[]{"module"});
        }
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            A07((AbstractC9798GhG) it.next());
        }
        if (this._serializationConfig.A09(EnumC9951GmA.A0H)) {
            String strA0e = C60Q.A0e(abstractC9798GhG);
            Set setA0k = this._registeredModuleTypes;
            if (setA0k == null) {
                setA0k = C3cG.A0k();
                this._registeredModuleTypes = setA0k;
            }
            if (!setA0k.add(strA0e)) {
                return;
            }
        }
        C9885Gjt c9885Gjt = new C9885Gjt();
        c9885Gjt._defaultBoundType = null;
        AbstractC9905Gkl c9906Gkm = (AbstractC9905Gkl) this._deserializationContext._factory;
        C10063Gok c10063Gok = c9906Gkm._factoryConfig;
        C10063Gok c10063Gok2 = new C10063Gok(c10063Gok._abstractTypeResolvers, c10063Gok._modifiers, (InterfaceC9884Gjs[]) C9993GnM.A00(c9885Gjt, c10063Gok._additionalDeserializers), c10063Gok._additionalKeyDeserializers, c10063Gok._valueInstantiators);
        if (c9906Gkm._factoryConfig != c10063Gok2) {
            AbstractC9855Gj3.A0E(C9906Gkm.class, c9906Gkm, "withConfig");
            c9906Gkm = new C9906Gkm(c10063Gok2);
        }
        this._deserializationContext = new C10199GrK(this._deserializationContext, c9906Gkm);
        C9878Gjm c9878Gjm = new C9878Gjm();
        AbstractC9887GkN abstractC9887GkN = (AbstractC9887GkN) this._serializerFactory;
        C10129Gpu c10129Gpu = abstractC9887GkN._factoryConfig;
        C10129Gpu c10129Gpu2 = new C10129Gpu(c10129Gpu._modifiers, (InterfaceC9886GkG[]) C9993GnM.A00(c9878Gjm, c10129Gpu._additionalSerializers), c10129Gpu._additionalKeySerializers);
        C9903Gkj c9903Gkj = (C9903Gkj) abstractC9887GkN;
        if (c9903Gkj._factoryConfig != c10129Gpu2) {
            Class<?> cls = c9903Gkj.getClass();
            if (cls != C9903Gkj.class) {
                throw BV5.A0V("Subtype of BeanSerializerFactory (", cls.getName(), ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
            }
            c9903Gkj = new C9903Gkj(c10129Gpu2);
        }
        this._serializerFactory = c9903Gkj;
        C10194GrB c10194GrB = new C10194GrB();
        C9860Gj8 c9860Gj8 = this._typeFactory;
        InterfaceC9510GMb<Object, AbstractC9870GjI> interfaceC9510GMb = c9860Gj8._typeCache;
        AbstractC10207GrT[] abstractC10207GrTArr2 = c9860Gj8._modifiers;
        if (abstractC10207GrTArr2 == null) {
            abstractC10207GrTArr = new AbstractC10207GrT[]{c10194GrB};
            interfaceC9510GMb = null;
        } else {
            abstractC10207GrTArr = (AbstractC10207GrT[]) C9993GnM.A00(c10194GrB, abstractC10207GrTArr2);
        }
        C9860Gj8 c9860Gj82 = new C9860Gj8(c9860Gj8._parser, interfaceC9510GMb, c9860Gj8._classLoader, abstractC10207GrTArr);
        this._typeFactory = c9860Gj82;
        this._deserializationConfig = this._deserializationConfig.A0B(c9860Gj82);
        this._serializationConfig = this._serializationConfig.A0B(c9860Gj82);
        C10193GrA c10193GrA = new C10193GrA();
        AbstractC9887GkN abstractC9887GkN2 = (AbstractC9887GkN) this._serializerFactory;
        C10129Gpu c10129Gpu3 = abstractC9887GkN2._factoryConfig;
        C10129Gpu c10129Gpu4 = new C10129Gpu((AbstractC10196GrH[]) C9993GnM.A00(c10193GrA, c10129Gpu3._modifiers), c10129Gpu3._additionalSerializers, c10129Gpu3._additionalKeySerializers);
        C9903Gkj c9903Gkj2 = (C9903Gkj) abstractC9887GkN2;
        if (c9903Gkj2._factoryConfig != c10129Gpu4) {
            Class<?> cls2 = c9903Gkj2.getClass();
            if (cls2 != C9903Gkj.class) {
                throw BV5.A0V("Subtype of BeanSerializerFactory (", cls2.getName(), ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
            }
            c9903Gkj2 = new C9903Gkj(c10129Gpu4);
        }
        this._serializerFactory = c9903Gkj2;
    }

    public final byte[] A08(Object obj) {
        byte[] bArr;
        C9924GlL c9924GlL = this._jsonFactory;
        try {
            try {
                C9964Gmb c9964Gmb = new C9964Gmb((!AbstractC7609F5w.A1U(c9924GlL._factoryFeatures, AbstractC7609F5w.A0F(EnumC10039GoJ.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING)) ? C10530Hpw.A00 : c9924GlL._recyclerPool).A2y());
                try {
                    Integer num = C79.A00;
                    C9924GlL c9924GlL2 = this._jsonFactory;
                    C9984Gn6 c9984Gn6A00 = C9924GlL.A00(c9924GlL2, new C9517GMk(c9924GlL2._errorReportConfiguration, c9964Gmb), false);
                    c9984Gn6A00.A00 = num;
                    C9983Gmz c9983Gmz = new C9983Gmz(c9924GlL2._objectCodec, c9984Gn6A00, c9964Gmb, c9924GlL2._quoteChar, c9924GlL2._generatorFeatures);
                    int i = c9924GlL2._maximumNonEscapedChar;
                    if (i > 0) {
                        ((AbstractC9979Gmv) c9983Gmz).A00 = i;
                    }
                    InterfaceC10180Gqq interfaceC10180Gqq = c9924GlL2._rootValueSeparator;
                    if (interfaceC10180Gqq != C9924GlL.A03) {
                        ((AbstractC9979Gmv) c9983Gmz).A01 = interfaceC10180Gqq;
                    }
                    List list = c9924GlL2._generatorDecorators;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw BV4.A0a("decorate");
                        }
                    }
                    this._serializationConfig.A0D(c9983Gmz);
                    C9963Gma c9963Gma = this._serializationConfig;
                    if (c9963Gma.A0E(EnumC9975Gmp.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
                        Closeable closeable = (Closeable) obj;
                        try {
                            A05(c9963Gma).A0a(c9983Gmz, obj);
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            closeable.close();
                        } catch (Exception e2) {
                            e = e2;
                            closeable = null;
                            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                            c9983Gmz.A0b(EnumC9998GnS.AUTO_CLOSE_JSON_CONTENT);
                            try {
                                c9983Gmz.close();
                            } catch (Exception e3) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e3);
                            }
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Exception e4) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e4);
                                }
                            }
                            if (e instanceof IOException) {
                                throw e;
                            }
                            AbstractC9855Gj3.A0F(e);
                            throw BV4.A0e(e);
                        }
                    } else {
                        try {
                            A05(c9963Gma).A0a(c9983Gmz, obj);
                        } catch (Exception e5) {
                            AbstractC9855Gj3.A0C(c9983Gmz, e5);
                            throw F60.createAndThrow();
                        }
                    }
                    c9983Gmz.close();
                    byte[] bArrA05 = c9964Gmb.A05();
                    c9964Gmb.A01();
                    HjR hjR = c9964Gmb.A03;
                    if (hjR != null && (bArr = c9964Gmb.A01) != null) {
                        hjR.A01(2, bArr);
                        c9964Gmb.A01 = null;
                    }
                    return bArrA05;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (JsonProcessingException e6) {
                throw e6;
            }
        } catch (IOException e7) {
            throw JsonMappingException.A01(e7);
        }
    }

    public C9899Gkf(C9924GlL c9924GlL) {
        C9935Gle c9935Gle;
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (c9924GlL == null) {
            this._jsonFactory = new C10150GqH(this);
        } else {
            this._jsonFactory = c9924GlL;
            if (c9924GlL._objectCodec == null) {
                c9924GlL._objectCodec = this;
            }
        }
        this._subtypeResolver = new C9890GkR();
        C9881Gjp c9881Gjp = new C9881Gjp();
        this._typeFactory = C9860Gj8.A08;
        C10053GoX c10053GoX = new C10053GoX();
        this._mixIns = c10053GoX;
        C9895GkY c9895GkY = A01;
        if (this instanceof C9796GhE) {
            c9935Gle = C9796GhE.A02;
        } else {
            c9935Gle = new C9935Gle();
        }
        if (c9895GkY._classIntrospector != c9935Gle) {
            AbstractC9910Gks abstractC9910Gks = c9895GkY._annotationIntrospector;
            C10103GpR c10103GpR = c9895GkY._propertyNamingStrategy;
            C9860Gj8 c9860Gj8 = c9895GkY._typeFactory;
            c9895GkY = new C9895GkY(c9895GkY._defaultBase64, abstractC9910Gks, c10103GpR, c9895GkY._cacheProvider, c9895GkY._accessorNaming, c9935Gle, c9895GkY._typeValidator, c9895GkY._typeResolverBuilder, c9860Gj8, c9895GkY._dateFormat, c9895GkY._locale, c9895GkY._timeZone);
        }
        C10045GoP c10045GoP = new C10045GoP();
        this._configOverrides = c10045GoP;
        C10064Gol c10064Gol = new C10064Gol();
        this._coercionConfigs = c10064Gol;
        AbstractC10058Gof abstractC10058Gof = this._subtypeResolver;
        C9823GiH c9823GiH = AbstractC9824GiI.A00;
        C9963Gma c9963Gma = new C9963Gma(c9895GkY, c10045GoP, c9823GiH, c10053GoX, abstractC10058Gof, c9881Gjp);
        this._serializationConfig = c9963Gma;
        C9898Gke c9898Gke = new C9898Gke(c9895GkY, c10064Gol, c10045GoP, c9823GiH, c10053GoX, abstractC10058Gof, c9881Gjp);
        this._deserializationConfig = c9898Gke;
        EnumC9951GmA enumC9951GmA = EnumC9951GmA.A0R;
        if (c9963Gma.A09(enumC9951GmA)) {
            long j = c9963Gma._mapperFeatures;
            long j2 = j & (new EnumC9951GmA[]{enumC9951GmA}[0]._mask ^ (-1));
            this._serializationConfig = j2 != j ? new C9963Gma(c9963Gma, c9963Gma._serFeatures, c9963Gma._generatorFeatures, c9963Gma._generatorFeaturesToChange, c9963Gma._formatWriteFeatures, c9963Gma._formatWriteFeaturesToChange, j2) : c9963Gma;
            long j3 = c9898Gke._mapperFeatures;
            long j4 = j3 & (new EnumC9951GmA[]{enumC9951GmA}[0]._mask ^ (-1));
            this._deserializationConfig = j4 != j3 ? new C9898Gke(c9898Gke, c9898Gke._deserFeatures, c9898Gke._parserFeatures, c9898Gke._parserFeaturesToChange, c9898Gke._formatReadFeatures, c9898Gke._formatReadFeaturesToChange, j4) : c9898Gke;
        }
        this._serializerProvider = new C9792Gh2();
        this._deserializationContext = new C10199GrK(new C9902Gki(), C9906Gkm.A00);
        this._serializerFactory = C9903Gkj.A00;
    }
}
