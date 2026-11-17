package com.fasterxml.jackson.databind.deser;

import X.AbstractC10024Gnx;
import X.AbstractC10100GpO;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC9831GiU;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9910Gks;
import X.AbstractC9915Gl5;
import X.AbstractC9916Gl7;
import X.AbstractC9930GlR;
import X.AbstractC9944Glx;
import X.AbstractC9986Gn8;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.C10002GnY;
import X.C10008Gng;
import X.C10009Gnh;
import X.C10034GoA;
import X.C10035GoB;
import X.C10079Gp0;
import X.C10104GpS;
import X.C10115Gpg;
import X.C10160GqT;
import X.C3cG;
import X.C60O;
import X.C8887Fss;
import X.C9516GMj;
import X.C9668GdQ;
import X.C9888GkO;
import X.C9898Gke;
import X.C9909Gkr;
import X.C9913Gl1;
import X.C9918GlC;
import X.C9921GlI;
import X.C9926GlN;
import X.C9931GlS;
import X.C9959GmU;
import X.C9961GmY;
import X.C9966Gme;
import X.C9977Gms;
import X.EnumC10046GoQ;
import X.EnumC10073Gou;
import X.EnumC9834GiY;
import X.EnumC9965Gmd;
import X.F60;
import X.FGI;
import X.HjD;
import X.HjP;
import X.InterfaceC10043GoN;
import X.InterfaceC10183Gqt;
import X.InterfaceC9830GiT;
import X.InterfaceC9851Giv;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class BeanDeserializerBase extends StdDeserializer implements InterfaceC10183Gqt, InterfaceC9830GiT, Serializable {
    public static final C10009Gnh A01 = new C10009Gnh("#temporary-name", null);
    public static final long serialVersionUID = 1;
    public transient ConcurrentHashMap<C8887Fss, JsonDeserializer<Object>> A00;
    public AbstractC9930GlR _anySetter;
    public JsonDeserializer<Object> _arrayDelegateDeserializer;
    public final Map<String, AbstractC9915Gl5> _backRefs;
    public final C9668GdQ _beanProperties;
    public final AbstractC9870GjI _beanType;
    public JsonDeserializer<Object> _delegateDeserializer;
    public C9918GlC _externalTypeIdHandler;
    public final Set<String> _ignorableProps;
    public final boolean _ignoreAllUnknown;
    public final Set<String> _includableProps;
    public final C10115Gpg[] _injectables;
    public final boolean _needViewProcesing;
    public boolean _nonStandardCreation;
    public final C10035GoB _objectIdReader;
    public C9931GlS _propertyBasedCreator;
    public final EnumC10046GoQ _serializationShape;
    public C10008Gng _unwrappedPropertyHandler;
    public final AbstractC9944Glx _valueInstantiator;
    public boolean _vanillaProcessing;

    private final BeanDeserializerBase A1K() {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer._delegate.A1K(), beanAsArrayDeserializer._orderedProperties);
        }
        if (!(this instanceof BeanAsArrayBuilderDeserializer)) {
            return this instanceof BuilderBasedDeserializer ? new BuilderBasedDeserializer((BuilderBasedDeserializer) this) : new BeanDeserializer(this, true);
        }
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
        return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer._targetType, beanAsArrayBuilderDeserializer._delegate.A1K(), beanAsArrayBuilderDeserializer._buildMethod, beanAsArrayBuilderDeserializer._orderedProperties);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x046e, code lost:
    
        X.AbstractC9849Git.A07(r29, r6, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0475, code lost:
    
        throw X.F60.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        if (r5.A01 != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02da A[PHI: r13
  0x02da: PHI (r13v7 X.Gl5) = (r13v6 X.Gl5), (r13v6 X.Gl5), (r13v10 X.Gl5) binds: [B:59:0x0156, B:142:0x02d2, B:143:0x02d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    @Override // X.InterfaceC10183Gqt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AbV(X.AbstractC9904Gkk r29) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.AbV(X.Gkk):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r10, X.AbstractC10187Gqy r11) {
        /*
            r9 = this;
            X.GjI r0 = r10._beanType
            r9.<init>(r0)
            r9._beanType = r0
            X.Glx r0 = r10._valueInstantiator
            r9._valueInstantiator = r0
            com.fasterxml.jackson.databind.JsonDeserializer.A0Y(r10, r9)
            java.util.Map<java.lang.String, X.Gl5> r0 = r10._backRefs
            r9._backRefs = r0
            java.util.Set<java.lang.String> r0 = r10._ignorableProps
            r9._ignorableProps = r0
            r6 = 0
            if (r11 != 0) goto L1e
            boolean r1 = r10._ignoreAllUnknown
            r0 = 0
            if (r1 == 0) goto L1f
        L1e:
            r0 = 1
        L1f:
            r9._ignoreAllUnknown = r0
            java.util.Set<java.lang.String> r0 = r10._includableProps
            r9._includableProps = r0
            X.GlR r0 = r10._anySetter
            r9._anySetter = r0
            X.Gpg[] r0 = r10._injectables
            r9._injectables = r0
            X.GoB r0 = r10._objectIdReader
            r9._objectIdReader = r0
            boolean r0 = r10._nonStandardCreation
            r9._nonStandardCreation = r0
            X.Gng r5 = r10._unwrappedPropertyHandler
            if (r11 == 0) goto Lba
            if (r5 == 0) goto L76
            java.util.List<X.Gl5> r0 = r5.A00
            java.util.ArrayList r4 = X.C60Q.A0t(r0)
            java.util.Iterator r3 = r0.iterator()
        L45:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r1 = r3.next()
            X.Gl5 r1 = (X.AbstractC9915Gl5) r1
            X.Gnh r0 = r1._propName
            java.lang.String r0 = r0._simpleName
            java.lang.String r0 = r11.A00(r0)
            X.Gl5 r2 = r1.A07(r0)
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r2.A03()
            if (r1 == 0) goto L6d
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r1.A0b(r11)
            if (r0 == r1) goto L6d
            X.Gl5 r2 = r2.A04(r0)
        L6d:
            r4.add(r2)
            goto L45
        L71:
            X.Gng r5 = new X.Gng
            r5.<init>(r4)
        L76:
            X.GdQ r4 = r10._beanProperties
            X.Gqy r0 = X.AbstractC10187Gqy.A00
            if (r11 == r0) goto Lbc
            X.Gl5[] r0 = r4._propsInOrder
            int r8 = r0.length
            java.util.ArrayList r3 = X.C60O.A11(r8)
            r7 = 0
        L84:
            if (r7 >= r8) goto Lae
            X.Gl5[] r0 = r4._propsInOrder
            r2 = r0[r7]
            if (r2 == 0) goto La8
            X.Gnh r0 = r2._propName
            java.lang.String r0 = r0._simpleName
            java.lang.String r0 = r11.A00(r0)
            X.Gl5 r2 = r2.A07(r0)
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r2.A03()
            if (r1 == 0) goto La8
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r1.A0b(r11)
            if (r0 == r1) goto La8
            X.Gl5 r2 = r2.A04(r0)
        La8:
            r3.add(r2)
            int r7 = r7 + 1
            goto L84
        Lae:
            boolean r2 = r4._caseInsensitive
            java.util.Map<java.lang.String, java.util.List<X.Gnh>> r1 = r4._aliasDefs
            java.util.Locale r0 = r4._locale
            X.GdQ r4 = new X.GdQ
            r4.<init>(r3, r0, r1, r2)
            goto Lbc
        Lba:
            X.GdQ r4 = r10._beanProperties
        Lbc:
            r9._beanProperties = r4
            r9._unwrappedPropertyHandler = r5
            boolean r0 = r10._needViewProcesing
            r9._needViewProcesing = r0
            X.GoQ r0 = r10._serializationShape
            r9._serializationShape = r0
            r9._vanillaProcessing = r6
            X.GlC r0 = r10._externalTypeIdHandler
            r9._externalTypeIdHandler = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.Gqy):void");
    }

    private JsonDeserializer<Object> A00(AbstractC9904Gkk abstractC9904Gkk, AbstractC9870GjI abstractC9870GjI, AbstractC10024Gnx abstractC10024Gnx) {
        C9977Gms c9977Gms;
        InterfaceC10043GoN<?> interfaceC10043GoNA00;
        Collection<HjD> collectionA05;
        EnumC10073Gou enumC10073GouA0Q;
        EnumC10073Gou enumC10073GouA0Q2;
        if (abstractC10024Gnx == null || abstractC10024Gnx.A0G() != 1) {
            c9977Gms = new C9977Gms(abstractC9870GjI, C10034GoA.A01, A01, abstractC10024Gnx);
        } else {
            C9959GmU c9959GmUA0I = abstractC10024Gnx.A0I(0);
            C9898Gke c9898Gke = abstractC9904Gkk._config;
            AbstractC9910Gks abstractC9910GksA02 = c9898Gke.A02();
            C10034GoA c10034GoAA01 = C10034GoA.A01;
            if (abstractC9910GksA02 != null) {
                C10079Gp0 c10079Gp0A0D = abstractC9910GksA02.A0D(c9959GmUA0I);
                enumC10073GouA0Q = c10079Gp0A0D._nulls;
                EnumC10073Gou enumC10073Gou = EnumC10073Gou.DEFAULT;
                if (enumC10073GouA0Q == enumC10073Gou) {
                    enumC10073GouA0Q = null;
                }
                enumC10073GouA0Q2 = c10079Gp0A0D._contentNulls;
                if (enumC10073GouA0Q2 == enumC10073Gou) {
                    enumC10073GouA0Q2 = null;
                }
            } else {
                enumC10073GouA0Q = null;
                enumC10073GouA0Q2 = null;
            }
            C10079Gp0 c10079Gp0 = c9898Gke.A03(abstractC9870GjI._class)._setterInfo;
            if (c10079Gp0 != null) {
                if (enumC10073GouA0Q == null) {
                    enumC10073GouA0Q = AbstractC7608F5v.A0Q(c10079Gp0._nulls);
                }
                if (enumC10073GouA0Q2 == null) {
                    enumC10073GouA0Q2 = AbstractC7608F5v.A0Q(c10079Gp0._contentNulls);
                }
            }
            C10079Gp0 c10079Gp02 = c9898Gke._configOverrides._defaultSetterInfo;
            if (enumC10073GouA0Q == null) {
                enumC10073GouA0Q = AbstractC7608F5v.A0Q(c10079Gp02._nulls);
            }
            if (enumC10073GouA0Q2 == null) {
                enumC10073GouA0Q2 = AbstractC7608F5v.A0Q(c10079Gp02._contentNulls);
            }
            if (enumC10073GouA0Q != null || enumC10073GouA0Q2 != null) {
                c10034GoAA01 = c10034GoAA01.A01(enumC10073GouA0Q, enumC10073GouA0Q2);
            }
            c9977Gms = new C9977Gms(abstractC9870GjI, c10034GoAA01, A01, c9959GmUA0I);
        }
        AbstractC9986Gn8 abstractC9986Gn8A5X = (AbstractC9986Gn8) abstractC9870GjI._typeHandler;
        if (abstractC9986Gn8A5X == null) {
            C9898Gke c9898Gke2 = abstractC9904Gkk._config;
            C9909Gkr c9909Gkr = c9898Gke2.A05(abstractC9870GjI._class).A07;
            AbstractC9910Gks abstractC9910GksA022 = c9898Gke2.A02();
            if (!(abstractC9910GksA022 instanceof C9888GkO) || (interfaceC10043GoNA00 = C9888GkO.A00(c9898Gke2, c9909Gkr, (C9888GkO) abstractC9910GksA022)) == null) {
                interfaceC10043GoNA00 = c9898Gke2._base._typeResolverBuilder;
                collectionA05 = null;
                abstractC9986Gn8A5X = null;
                if (interfaceC10043GoNA00 != null) {
                }
            } else {
                collectionA05 = c9898Gke2._subtypeResolver.A05(c9898Gke2, c9909Gkr);
            }
            abstractC9986Gn8A5X = interfaceC10043GoNA00.A5X(c9898Gke2, abstractC9870GjI, collectionA05);
        }
        JsonDeserializer jsonDeserializer = (JsonDeserializer) abstractC9870GjI._valueHandler;
        JsonDeserializer<Object> jsonDeserializerA0G = jsonDeserializer == null ? abstractC9904Gkk.A0G(c9977Gms, abstractC9870GjI) : abstractC9904Gkk.A0I(c9977Gms, abstractC9870GjI, jsonDeserializer);
        return abstractC9986Gn8A5X != null ? new TypeWrappedDeserializer(jsonDeserializerA0G, abstractC9986Gn8A5X.A03(c9977Gms)) : jsonDeserializerA0G;
    }

    public static final void A01(AbstractC9915Gl5 abstractC9915Gl5, AbstractC9915Gl5 abstractC9915Gl52, C9668GdQ c9668GdQ, AbstractC9915Gl5[] abstractC9915Gl5Arr) {
        Object[] objArr = c9668GdQ._hashArea;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            if (objArr[i] == abstractC9915Gl5) {
                objArr[i] = abstractC9915Gl52;
                c9668GdQ._propsInOrder[C9668GdQ.A00(abstractC9915Gl5, c9668GdQ)] = abstractC9915Gl52;
                if (abstractC9915Gl5Arr != null) {
                    int length2 = abstractC9915Gl5Arr.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (abstractC9915Gl5Arr[i2] == abstractC9915Gl5) {
                            abstractC9915Gl5Arr[i2] = abstractC9915Gl52;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException(FGI.A0U("No entry '", abstractC9915Gl5._propName._simpleName, "' found, can't replace"));
    }

    private final BeanDeserializerBase A1L(C9668GdQ c9668GdQ) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer._delegate.A1L(c9668GdQ), beanAsArrayDeserializer._orderedProperties);
        }
        if (!(this instanceof BeanAsArrayBuilderDeserializer)) {
            return this instanceof BuilderBasedDeserializer ? new BuilderBasedDeserializer((BuilderBasedDeserializer) this, c9668GdQ) : new BeanDeserializer(this, c9668GdQ);
        }
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
        return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer._targetType, beanAsArrayBuilderDeserializer._delegate.A1L(c9668GdQ), beanAsArrayBuilderDeserializer._buildMethod, beanAsArrayBuilderDeserializer._orderedProperties);
    }

    private final BeanDeserializerBase A1M(C10035GoB c10035GoB) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer._delegate.A1M(c10035GoB), beanAsArrayDeserializer._orderedProperties);
        }
        if (!(this instanceof BeanAsArrayBuilderDeserializer)) {
            return this instanceof BuilderBasedDeserializer ? new BuilderBasedDeserializer((BuilderBasedDeserializer) this, c10035GoB) : new BeanDeserializer(this, c10035GoB);
        }
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
        return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer._targetType, beanAsArrayBuilderDeserializer._delegate.A1M(c10035GoB), beanAsArrayBuilderDeserializer._buildMethod, beanAsArrayBuilderDeserializer._orderedProperties);
    }

    private final BeanDeserializerBase A1N(Set<String> set, Set<String> set2) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer._delegate.A1N(set, set2), beanAsArrayDeserializer._orderedProperties);
        }
        if (!(this instanceof BeanAsArrayBuilderDeserializer)) {
            return this instanceof BuilderBasedDeserializer ? new BuilderBasedDeserializer((BuilderBasedDeserializer) this, set, set2) : new BeanDeserializer(this, set, set2);
        }
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
        return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer._targetType, beanAsArrayBuilderDeserializer._delegate.A1N(set, set2), beanAsArrayBuilderDeserializer._buildMethod, beanAsArrayBuilderDeserializer._orderedProperties);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a4, code lost:
    
        r20.A1P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01da, code lost:
    
        r2 = r7.A02(r21, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e0, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e1, code lost:
    
        r12.A1b(r21, r12._beanType._class, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x038e, code lost:
    
        if (r2.getClass() == r12._beanType._class) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x039c, code lost:
    
        return r12.A1O(r20, r20.A1R(), r21, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x039d, code lost:
    
        if (r4 == 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x039f, code lost:
    
        r12.A1a(r21, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03a2, code lost:
    
        com.fasterxml.jackson.databind.JsonDeserializer.A0W(r21, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03a7, code lost:
    
        if (r12._unwrappedPropertyHandler == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03af, code lost:
    
        if (r20.A22(X.EnumC9834GiY.START_OBJECT) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03b1, code lost:
    
        r20.A1P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03b4, code lost:
    
        r0 = new X.C9913Gl1(r20);
        r0.A0T();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03c0, code lost:
    
        return com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.A00(r20, r21, r12, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03c3, code lost:
    
        if (r12._externalTypeIdHandler == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03c9, code lost:
    
        return com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.A02(r20, r21, r12, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03cc, code lost:
    
        if (r12._needViewProcesing == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03ce, code lost:
    
        r0 = r21._view;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03d0, code lost:
    
        if (r0 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03d6, code lost:
    
        return com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.A01(r20, r21, r12, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03d7, code lost:
    
        r1 = r20.A1N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03dd, code lost:
    
        if (r1 != X.EnumC9834GiY.START_OBJECT) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03df, code lost:
    
        r1 = r20.A1P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03e3, code lost:
    
        if (r1 != r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03e5, code lost:
    
        r1 = r20.A1a();
        r0 = com.fasterxml.jackson.databind.JsonDeserializer.A0L(r20, r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03ed, code lost:
    
        if (r0 == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03ef, code lost:
    
        r2 = r0.A0D(r20, r21, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03f4, code lost:
    
        r12.A1Z(r20, r21, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x03f9, code lost:
    
        r12.A1b(r21, r2, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03df, code lost:
    
        r1 = r20.A1P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03df, code lost:
    
        r1 = r20.A1P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x013a: INVOKE 
  (r12v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
  (r15v0 ?? I:X.Gkk)
  (r0v2 ?? I:java.lang.Object)
  (r3 I:java.lang.String)
  (r1 I:java.lang.Throwable)
 VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1b(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:314), block:B:76:0x0136 */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0185  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1P(X.AbstractC9916Gl7 r20, X.AbstractC9904Gkk r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1P(X.Gl7, X.Gkk):java.lang.Object");
    }

    public final Object A1Q(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null || (jsonDeserializer = this._arrayDelegateDeserializer) != null) {
            AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
            if (!(abstractC9944Glx instanceof C9921GlI) || !AnonymousClass002.A1X(((C9921GlI) abstractC9944Glx)._fromBooleanCreator)) {
                return JsonDeserializer.A0P(abstractC9916Gl7, abstractC9904Gkk, jsonDeserializer, this, abstractC9944Glx);
            }
        }
        return this._valueInstantiator.A0L(abstractC9904Gkk, AnonymousClass002.A1Z(abstractC9916Gl7.A1N(), EnumC9834GiY.VALUE_TRUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (X.AnonymousClass002.A1X(((X.C9921GlI) r2)._fromIntCreator) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (X.AnonymousClass002.A1X(((X.C9921GlI) r2)._fromIntCreator) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (X.AnonymousClass002.A1X(((X.C9921GlI) r2)._fromBigIntegerCreator) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1S(X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r4 = this;
            X.GoB r0 = r4._objectIdReader
            if (r0 == 0) goto L9
            java.lang.Object r0 = r4.A1T(r5, r6)
            return r0
        L9:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r1 = r4._delegateDeserializer
            if (r1 != 0) goto Lf
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r1 = r4._arrayDelegateDeserializer
        Lf:
            X.Goo r2 = r5.A1L()
            X.Goo r0 = X.EnumC10067Goo.INT
            if (r2 != r0) goto L2f
            if (r1 == 0) goto L5f
            X.Glx r2 = r4._valueInstantiator
            boolean r0 = r2 instanceof X.C9921GlI
            if (r0 == 0) goto L2a
            r0 = r2
            X.GlI r0 = (X.C9921GlI) r0
            X.Gnx r0 = r0._fromIntCreator
            boolean r0 = X.AnonymousClass002.A1X(r0)
            if (r0 != 0) goto L5f
        L2a:
            java.lang.Object r0 = com.fasterxml.jackson.databind.JsonDeserializer.A0P(r5, r6, r1, r4, r2)
            return r0
        L2f:
            X.Goo r0 = X.EnumC10067Goo.LONG
            if (r2 != r0) goto L47
            if (r1 == 0) goto L6a
            X.Glx r2 = r4._valueInstantiator
            boolean r0 = r2 instanceof X.C9921GlI
            if (r0 == 0) goto L2a
            r0 = r2
            X.GlI r0 = (X.C9921GlI) r0
            X.Gnx r0 = r0._fromIntCreator
            boolean r0 = X.AnonymousClass002.A1X(r0)
            if (r0 != 0) goto L6a
            goto L2a
        L47:
            X.Goo r0 = X.EnumC10067Goo.BIG_INTEGER
            if (r2 != r0) goto L80
            if (r1 == 0) goto L75
            X.Glx r2 = r4._valueInstantiator
            boolean r0 = r2 instanceof X.C9921GlI
            if (r0 == 0) goto L2a
            r0 = r2
            X.GlI r0 = (X.C9921GlI) r0
            X.Gnx r0 = r0._fromBigIntegerCreator
            boolean r0 = X.AnonymousClass002.A1X(r0)
            if (r0 != 0) goto L75
            goto L2a
        L5f:
            X.Glx r1 = r4._valueInstantiator
            int r0 = r5.A1C()
            java.lang.Object r0 = r1.A0G(r6, r0)
            return r0
        L6a:
            X.Glx r2 = r4._valueInstantiator
            long r0 = r5.A1G()
            java.lang.Object r0 = r2.A0H(r6, r0)
            return r0
        L75:
            X.Glx r1 = r4._valueInstantiator
            java.math.BigInteger r0 = r5.A1g()
            java.lang.Object r0 = r1.A0K(r6, r0)
            return r0
        L80:
            X.GjI r0 = r4._beanType
            java.lang.Class<?> r3 = r0._class
            X.Glx r2 = r4._valueInstantiator
            java.lang.Number r0 = r5.A1U()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "no suitable creator method found to deserialize from Number value (%s)"
            r6.A0d(r2, r3, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1S(X.Gl7, X.Gkk):java.lang.Object");
    }

    public final Object A1T(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws UnresolvedForwardReference {
        Object objA0i = this._objectIdReader._deserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        C10035GoB c10035GoB = this._objectIdReader;
        C9966Gme c9966GmeA0P = abstractC9904Gkk.A0P(c10035GoB.generator, c10035GoB.resolver, objA0i);
        InterfaceC9851Giv interfaceC9851Giv = c9966GmeA0P.A00;
        HjP hjP = c9966GmeA0P.A03;
        Map<HjP, Object> map = ((C10160GqT) interfaceC9851Giv).A00;
        Object obj = map == null ? null : map.get(hjP);
        c9966GmeA0P.A01 = obj;
        if (obj != null) {
            return obj;
        }
        StringBuilder sbA0f = C3cG.A0f(objA0i, "Could not resolve Object Id [");
        sbA0f.append("] (for ");
        sbA0f.append(this._beanType);
        String strA0v = AnonymousClass001.A0v(").", sbA0f);
        C9516GMj c9516GMjA1I = abstractC9916Gl7.A1I();
        UnresolvedForwardReference unresolvedForwardReference = new UnresolvedForwardReference(strA0v, null);
        unresolvedForwardReference._location = c9516GMjA1I;
        unresolvedForwardReference.A00 = abstractC9916Gl7;
        unresolvedForwardReference._roid = c9966GmeA0P;
        throw unresolvedForwardReference;
    }

    public final Object A1U(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer<Object> jsonDeserializer;
        int i;
        String str;
        JsonDeserializer<Object> jsonDeserializer2 = this._delegateDeserializer;
        if (jsonDeserializer2 != null || (jsonDeserializer = this._arrayDelegateDeserializer) == null || (!abstractC9916Gl7.A22(EnumC9834GiY.START_ARRAY) && this._propertyBasedCreator != null)) {
            jsonDeserializer = jsonDeserializer2;
            if (jsonDeserializer2 == null) {
                if (this._propertyBasedCreator != null) {
                    return A1P(abstractC9916Gl7, abstractC9904Gkk);
                }
                Class<?> cls = this._beanType._class;
                C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                if (Modifier.isStatic(cls.getModifiers()) || cls == Object.class || cls.isPrimitive() || cls.getEnclosingClass() == null) {
                    i = 0;
                    if (!AbstractC9831GiU.A00(cls)) {
                        abstractC9904Gkk.A0d(this._valueInstantiator, cls, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
                        throw F60.createAndThrow();
                    }
                    str = "cannot deserialize from Object value (no delegate- or property-based Creator): this appears to be a native image, in which case you may need to configure reflection for the class that is to be deserialized";
                } else {
                    i = 0;
                    str = "non-static inner classes like this can only by instantiated using default, no-argument constructor";
                }
                abstractC9904Gkk.A0d(null, cls, str, new Object[i]);
                throw F60.createAndThrow();
            }
        }
        return JsonDeserializer.A0P(abstractC9916Gl7, abstractC9904Gkk, jsonDeserializer, this, this._valueInstantiator);
    }

    public final Object A1V(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        if (this._objectIdReader != null) {
            return A1T(abstractC9916Gl7, abstractC9904Gkk);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null || (jsonDeserializer = this._arrayDelegateDeserializer) != null) {
            AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
            if (!abstractC9944Glx.A07()) {
                return JsonDeserializer.A0P(abstractC9916Gl7, abstractC9904Gkk, jsonDeserializer, this, abstractC9944Glx);
            }
        }
        return A17(abstractC9916Gl7, abstractC9904Gkk);
    }

    public final Object A1W(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj, Object obj2) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._objectIdReader._deserializer;
        if (jsonDeserializer.A0h() != obj2.getClass()) {
            C9913Gl1 c9913Gl1 = new C9913Gl1(abstractC9916Gl7);
            if (obj2 instanceof String) {
                c9913Gl1.A0s((String) obj2);
            } else if (obj2 instanceof Long) {
                c9913Gl1.A0Y(C3cG.A05(obj2));
            } else if (obj2 instanceof Integer) {
                c9913Gl1.A0X(AnonymousClass001.A0F(obj2));
            } else {
                c9913Gl1.A0j(obj2);
            }
            C9926GlN c9926GlNA11 = c9913Gl1.A11(abstractC9916Gl7.A1R());
            c9926GlNA11.A1P();
            obj2 = jsonDeserializer.A0i(c9926GlNA11, abstractC9904Gkk);
        }
        C10035GoB c10035GoB = this._objectIdReader;
        abstractC9904Gkk.A0P(c10035GoB.generator, c10035GoB.resolver, obj2).A01(obj);
        AbstractC9915Gl5 abstractC9915Gl5 = this._objectIdReader.idProperty;
        return abstractC9915Gl5 != null ? abstractC9915Gl5.A0F(obj, obj2) : obj;
    }

    public final void A1X(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj, String str) {
        if (!AbstractC7609F5w.A1U(EnumC9965Gmd.A06._mask, abstractC9904Gkk._featureFlags)) {
            abstractC9916Gl7.A1j();
            return;
        }
        Collection<Object> collectionA0n = A0n();
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(abstractC9916Gl7.A1I(), abstractC9916Gl7, cls, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", AbstractC7609F5w.A1b(cls, str)), str, collectionA0n);
        ignoredPropertyException.A06(obj, str);
        throw ignoredPropertyException;
    }

    public final void A1Y(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj, String str) throws UnrecognizedPropertyException {
        if (this._ignoreAllUnknown) {
            abstractC9916Gl7.A1j();
            return;
        }
        if (JsonDeserializer.A0Z(this, str)) {
            A1X(abstractC9916Gl7, abstractC9904Gkk, obj, str);
        }
        if (obj == null) {
            obj = A0h();
        }
        abstractC9904Gkk.A0W(abstractC9916Gl7, this, obj, str);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;LX/Gkk;)TT; */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1b(X.AbstractC9904Gkk r1, java.lang.Object r2, java.lang.String r3, java.lang.Throwable r4) {
        /*
            r0 = this;
        L0:
            boolean r0 = r4 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r4 = r4.getCause()
            goto L0
        Lf:
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 != 0) goto L3a
            if (r1 == 0) goto L24
            X.Gmd r0 = X.EnumC9965Gmd.A0R
            int r1 = r1._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            r1 = 0
            if (r0 == 0) goto L25
        L24:
            r1 = 1
        L25:
            boolean r0 = r4 instanceof java.io.IOException
            if (r0 == 0) goto L34
            if (r1 == 0) goto L3a
            boolean r0 = r4 instanceof com.fasterxml.jackson.core.JacksonException
            if (r0 == 0) goto L3a
        L2f:
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.A02(r2, r3, r4)
            throw r0
        L34:
            if (r1 != 0) goto L2f
            X.AbstractC9855Gj3.A0F(r4)
            goto L2f
        L3a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1b(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Throwable;LX/Gkk;)TT; */
    public final void A1c(AbstractC9904Gkk abstractC9904Gkk, Throwable th) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        if ((th instanceof Error) || (th instanceof IOException)) {
            throw th;
        }
        if (abstractC9904Gkk == null) {
            throw BV4.A0Q(th.getMessage(), th);
        }
        EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0R;
        if (!AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
            AbstractC9855Gj3.A0F(th);
        }
        abstractC9904Gkk.A0m(th, this._beanType._class);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[PHI: r1
  0x0082: PHI (r1v10 X.Gmj) = (r1v1 X.Gmj), (r1v11 X.Gmj) binds: [B:30:0x007f, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106 A[PHI: r4
  0x0106: PHI (r4v2 com.fasterxml.jackson.databind.deser.BeanDeserializerBase) = 
  (r4v1 com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
  (r4v5 com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
 binds: [B:60:0x00e2, B:71:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012e  */
    @Override // X.InterfaceC9830GiT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer A7e(X.InterfaceC10017Gnp r14, X.AbstractC9904Gkk r15) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A7e(X.Gnp, X.Gkk):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    private final void A1a(AbstractC9904Gkk abstractC9904Gkk, C9913Gl1 c9913Gl1, Object obj) throws UnrecognizedPropertyException, JsonGenerationException {
        c9913Gl1.A0Q();
        C9926GlN c9926GlNA00 = C9913Gl1.A00(c9913Gl1.A02, c9913Gl1);
        while (c9926GlNA00.A1P() != EnumC9834GiY.END_OBJECT) {
            String strA1a = c9926GlNA00.A1a();
            c9926GlNA00.A1P();
            A1Y(c9926GlNA00, abstractC9904Gkk, obj, strA1a);
        }
    }

    public final Object A1O(AbstractC9916Gl7 abstractC9916Gl7, C10002GnY c10002GnY, AbstractC9904Gkk abstractC9904Gkk, C9913Gl1 c9913Gl1, Object obj) throws IOException {
        JsonDeserializer<Object> jsonDeserializerA0J;
        Class<?> cls = obj.getClass();
        C8887Fss c8887Fss = new C8887Fss(cls);
        ConcurrentHashMap<C8887Fss, JsonDeserializer<Object>> concurrentHashMap = this.A00;
        if ((concurrentHashMap == null || (jsonDeserializerA0J = concurrentHashMap.get(c8887Fss)) == null) && (jsonDeserializerA0J = abstractC9904Gkk.A0J(AbstractC7608F5v.A0R(abstractC9904Gkk._config, cls))) != null) {
            if (this.A00 == null) {
                synchronized (this) {
                    if (this.A00 == null) {
                        this.A00 = C60O.A1C();
                    }
                }
            }
            this.A00.put(c8887Fss, jsonDeserializerA0J);
        }
        if (jsonDeserializerA0J != null) {
            if (c9913Gl1 != null) {
                c9913Gl1.A0Q();
                C9926GlN c9926GlNA11 = c9913Gl1.A11(c10002GnY);
                c9926GlNA11.A1P();
                obj = jsonDeserializerA0J.A0l(c9926GlNA11, abstractC9904Gkk, obj);
            }
            if (abstractC9916Gl7 != null) {
                return jsonDeserializerA0J.A0l(abstractC9916Gl7, abstractC9904Gkk, obj);
            }
        } else {
            if (c9913Gl1 != null) {
                A1a(abstractC9904Gkk, c9913Gl1, obj);
            }
            if (abstractC9916Gl7 != null) {
                return A0l(abstractC9916Gl7, abstractC9904Gkk, obj);
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (X.AnonymousClass002.A1X(((X.C9921GlI) r1)._fromBigDecimalCreator) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (X.AnonymousClass002.A1X(((X.C9921GlI) r1)._fromDoubleCreator) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1R(X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r4 = this;
            X.Goo r1 = r5.A1L()
            X.Goo r0 = X.EnumC10067Goo.DOUBLE
            if (r1 == r0) goto L2e
            X.Goo r0 = X.EnumC10067Goo.FLOAT
            if (r1 == r0) goto L2e
            X.Goo r0 = X.EnumC10067Goo.BIG_DECIMAL
            if (r1 != r0) goto L53
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r2 = r4._delegateDeserializer
            if (r2 != 0) goto L18
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r2 = r4._arrayDelegateDeserializer
            if (r2 == 0) goto L48
        L18:
            X.Glx r1 = r4._valueInstantiator
            boolean r0 = r1 instanceof X.C9921GlI
            if (r0 == 0) goto L29
            r0 = r1
            X.GlI r0 = (X.C9921GlI) r0
            X.Gnx r0 = r0._fromBigDecimalCreator
            boolean r0 = X.AnonymousClass002.A1X(r0)
            if (r0 != 0) goto L48
        L29:
            java.lang.Object r0 = com.fasterxml.jackson.databind.JsonDeserializer.A0P(r5, r6, r2, r4, r1)
            return r0
        L2e:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r2 = r4._delegateDeserializer
            if (r2 != 0) goto L36
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r2 = r4._arrayDelegateDeserializer
            if (r2 == 0) goto L6b
        L36:
            X.Glx r1 = r4._valueInstantiator
            boolean r0 = r1 instanceof X.C9921GlI
            if (r0 == 0) goto L29
            r0 = r1
            X.GlI r0 = (X.C9921GlI) r0
            X.Gnx r0 = r0._fromDoubleCreator
            boolean r0 = X.AnonymousClass002.A1X(r0)
            if (r0 != 0) goto L6b
            goto L29
        L48:
            X.Glx r1 = r4._valueInstantiator
            java.math.BigDecimal r0 = r5.A1f()
            java.lang.Object r0 = r1.A0J(r6, r0)
            return r0
        L53:
            X.GjI r0 = r4._beanType
            java.lang.Class<?> r3 = r0._class
            X.Glx r2 = r4._valueInstantiator
            java.lang.Number r0 = r5.A1U()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "no suitable creator method found to deserialize from Number value (%s)"
            r6.A0d(r2, r3, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L6b:
            X.Glx r2 = r4._valueInstantiator
            double r0 = r5.A17()
            java.lang.Object r0 = r2.A0F(r6, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1R(X.Gl7, X.Gkk):java.lang.Object");
    }

    public final void A1Z(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj, String str) {
        if (JsonDeserializer.A0Z(this, str)) {
            A1X(abstractC9916Gl7, abstractC9904Gkk, obj, str);
            return;
        }
        AbstractC9930GlR abstractC9930GlR = this._anySetter;
        if (abstractC9930GlR == null) {
            A1Y(abstractC9916Gl7, abstractC9904Gkk, obj, str);
            return;
        }
        try {
            abstractC9930GlR.A03(abstractC9916Gl7, abstractC9904Gkk, obj, str);
        } catch (Exception e) {
            A1b(abstractC9904Gkk, obj, str, e);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        AbstractC9870GjI abstractC9870GjI = beanDeserializerBase._beanType;
        super(abstractC9870GjI);
        this._beanType = abstractC9870GjI;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        JsonDeserializer.A0Y(beanDeserializerBase, this);
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = set2;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        C9668GdQ c9668GdQ = beanDeserializerBase._beanProperties;
        if ((set != null && !set.isEmpty()) || set2 != null) {
            int length = c9668GdQ._propsInOrder.length;
            ArrayList arrayListA11 = C60O.A11(length);
            for (int i = 0; i < length; i++) {
                AbstractC9915Gl5 abstractC9915Gl5 = c9668GdQ._propsInOrder[i];
                if (abstractC9915Gl5 != null && !AbstractC10100GpO.A01(abstractC9915Gl5._propName._simpleName, set, set2)) {
                    arrayListA11.add(abstractC9915Gl5);
                }
            }
            boolean z = c9668GdQ._caseInsensitive;
            c9668GdQ = new C9668GdQ(arrayListA11, c9668GdQ._locale, c9668GdQ._aliasDefs, z);
        }
        this._beanProperties = c9668GdQ;
        this._externalTypeIdHandler = beanDeserializerBase._externalTypeIdHandler;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect types in method signature: (LX/Gkv;LX/Gl4;LX/GdQ;Ljava/util/Map<Ljava/lang/String;LX/Gl5;>;Ljava/util/Set<Ljava/lang/String;>;ZLjava/util/Set<Ljava/lang/String;>;Z)V */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BeanDeserializerBase(X.C9912Gkv r6, X.C9668GdQ r7, X.C9914Gl4 r8, java.util.Map r9, java.util.Set r10, java.util.Set r11, boolean r12, boolean r13) {
        /*
            r5 = this;
            X.GjI r0 = r8.A05
            r5.<init>(r0)
            r5._beanType = r0
            X.Glx r2 = r6.A02
            r5._valueInstantiator = r2
            r0 = 0
            r5._delegateDeserializer = r0
            r5._arrayDelegateDeserializer = r0
            r5._propertyBasedCreator = r0
            r5._beanProperties = r7
            r5._backRefs = r9
            r5._ignorableProps = r10
            r5._ignoreAllUnknown = r12
            r5._includableProps = r11
            X.GlR r1 = r6.A01
            r5._anySetter = r1
            java.util.List<X.Gpg> r3 = r6.A08
            if (r3 == 0) goto L36
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L36
            int r0 = r3.size()
            X.Gpg[] r0 = new X.C10115Gpg[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            X.Gpg[] r0 = (X.C10115Gpg[]) r0
        L36:
            r5._injectables = r0
            X.GoB r4 = r6.A03
            r5._objectIdReader = r4
            X.Gng r1 = r5._unwrappedPropertyHandler
            r3 = 0
            if (r1 != 0) goto L54
            boolean r1 = r2.A0A()
            if (r1 != 0) goto L54
            boolean r1 = r2.A06()
            if (r1 != 0) goto L54
            boolean r2 = r2.A09()
            r1 = 0
            if (r2 != 0) goto L55
        L54:
            r1 = 1
        L55:
            r5._nonStandardCreation = r1
            X.GkV r1 = r8.A02()
            X.GoQ r1 = r1._shape
            r5._serializationShape = r1
            r5._needViewProcesing = r13
            boolean r1 = r5._nonStandardCreation
            if (r1 != 0) goto L6c
            if (r0 != 0) goto L6c
            if (r13 != 0) goto L6c
            if (r4 != 0) goto L6c
            r3 = 1
        L6c:
            r5._vanillaProcessing = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(X.Gkv, X.GdQ, X.Gl4, java.util.Map, java.util.Set, java.util.Set, boolean, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        AbstractC9870GjI abstractC9870GjI = beanDeserializerBase._beanType;
        super(abstractC9870GjI);
        this._beanType = abstractC9870GjI;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        JsonDeserializer.A0Y(beanDeserializerBase, this);
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._externalTypeIdHandler = beanDeserializerBase._externalTypeIdHandler;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, C10035GoB c10035GoB) {
        AbstractC9870GjI abstractC9870GjI = beanDeserializerBase._beanType;
        super(abstractC9870GjI);
        this._beanType = abstractC9870GjI;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        JsonDeserializer.A0Y(beanDeserializerBase, this);
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = c10035GoB;
        this._beanProperties = beanDeserializerBase._beanProperties.A03(new C9961GmY(C10034GoA.A02, c10035GoB));
        this._vanillaProcessing = false;
        this._externalTypeIdHandler = beanDeserializerBase._externalTypeIdHandler;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, C9668GdQ c9668GdQ) {
        AbstractC9870GjI abstractC9870GjI = beanDeserializerBase._beanType;
        super(abstractC9870GjI);
        this._beanType = abstractC9870GjI;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        JsonDeserializer.A0Y(beanDeserializerBase, this);
        this._beanProperties = c9668GdQ;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._externalTypeIdHandler = beanDeserializerBase._externalTypeIdHandler;
    }
}
