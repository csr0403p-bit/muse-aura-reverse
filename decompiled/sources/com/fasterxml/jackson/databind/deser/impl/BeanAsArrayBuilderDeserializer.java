package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC7609F5w;
import X.AbstractC9849Git;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9915Gl5;
import X.AbstractC9916Gl7;
import X.BV5;
import X.C10009Gnh;
import X.C9934Glc;
import X.EnumC9834GiY;
import X.EnumC9965Gmd;
import X.F60;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* loaded from: classes6.dex */
public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase {
    public static final long serialVersionUID = 1;
    public final C9934Glc _buildMethod;
    public final BeanDeserializerBase _delegate;
    public final AbstractC9915Gl5[] _orderedProperties;
    public final AbstractC9870GjI _targetType;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException {
        Object objA0D;
        C10009Gnh c10009Gnh;
        if (!abstractC9916Gl7.A1x()) {
            AbstractC9870GjI abstractC9870GjIA0u = A0u(abstractC9904Gkk);
            EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
            abstractC9904Gkk.A0U(abstractC9916Gl7, enumC9834GiYA1N, abstractC9870GjIA0u, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", AbstractC9870GjI.A04(this._beanType), enumC9834GiYA1N);
        } else {
            if (this._vanillaProcessing) {
                objA0D = this._valueInstantiator.A0D(abstractC9904Gkk);
                AbstractC9915Gl5[] abstractC9915Gl5Arr = this._orderedProperties;
                int length = abstractC9915Gl5Arr.length;
                int i = 0;
                while (true) {
                    EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                    EnumC9834GiY enumC9834GiY = EnumC9834GiY.END_ARRAY;
                    if (enumC9834GiYA1P != enumC9834GiY) {
                        if (i == length) {
                            if (!this._ignoreAllUnknown) {
                                EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0G;
                                if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
                                    throw AbstractC9849Git.A04(abstractC9904Gkk, this._beanType._class, "Unexpected JSON values; expected at most %d properties (in JSON Array)", BV5.A1Y(length));
                                }
                            }
                            while (abstractC9916Gl7.A1P() != enumC9834GiY) {
                                abstractC9916Gl7.A1j();
                            }
                        } else {
                            AbstractC9915Gl5 abstractC9915Gl5 = abstractC9915Gl5Arr[i];
                            if (abstractC9915Gl5 != null) {
                                try {
                                    objA0D = abstractC9915Gl5.A0D(abstractC9916Gl7, abstractC9904Gkk, objA0D);
                                } catch (Exception e) {
                                    e = e;
                                    c10009Gnh = abstractC9915Gl5._propName;
                                    A1b(abstractC9904Gkk, objA0D, c10009Gnh._simpleName, e);
                                    throw F60.createAndThrow();
                                }
                            } else {
                                abstractC9916Gl7.A1j();
                            }
                            i++;
                        }
                    }
                }
                return this._buildMethod.A00.invoke(objA0D, null);
            }
            if (this._nonStandardCreation) {
                objA0D = A1U(abstractC9916Gl7, abstractC9904Gkk);
            } else {
                objA0D = this._valueInstantiator.A0D(abstractC9904Gkk);
                JsonDeserializer.A0W(abstractC9904Gkk, this);
                Class<?> clsA0O = JsonDeserializer.A0O(abstractC9904Gkk, this);
                AbstractC9915Gl5[] abstractC9915Gl5Arr2 = this._orderedProperties;
                int length2 = abstractC9915Gl5Arr2.length;
                int i2 = 0;
                while (true) {
                    EnumC9834GiY enumC9834GiYA1P2 = abstractC9916Gl7.A1P();
                    EnumC9834GiY enumC9834GiY2 = EnumC9834GiY.END_ARRAY;
                    if (enumC9834GiYA1P2 != enumC9834GiY2) {
                        if (i2 == length2) {
                            if (!this._ignoreAllUnknown) {
                                EnumC9965Gmd enumC9965Gmd2 = EnumC9965Gmd.A0G;
                                if (AbstractC7609F5w.A1U(enumC9965Gmd2._mask, abstractC9904Gkk._featureFlags)) {
                                    abstractC9904Gkk.A0Z(enumC9834GiY2, this, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", BV5.A1Y(length2));
                                }
                            }
                            while (abstractC9916Gl7.A1P() != enumC9834GiY2) {
                                abstractC9916Gl7.A1j();
                            }
                        } else {
                            AbstractC9915Gl5 abstractC9915Gl52 = abstractC9915Gl5Arr2[i2];
                            i2++;
                            if (abstractC9915Gl52 == null || !(clsA0O == null || abstractC9915Gl52.A0R(clsA0O))) {
                                abstractC9916Gl7.A1j();
                            } else {
                                try {
                                    abstractC9915Gl52.A0D(abstractC9916Gl7, abstractC9904Gkk, objA0D);
                                } catch (Exception e2) {
                                    e = e2;
                                    c10009Gnh = abstractC9915Gl52._propName;
                                    A1b(abstractC9904Gkk, objA0D, c10009Gnh._simpleName, e);
                                    throw F60.createAndThrow();
                                }
                            }
                        }
                    }
                }
            }
            try {
                return this._buildMethod.A00.invoke(objA0D, null);
            } catch (Exception e3) {
                A1c(abstractC9904Gkk, e3);
            }
        }
        throw F60.createAndThrow();
    }

    public BeanAsArrayBuilderDeserializer(AbstractC9870GjI abstractC9870GjI, BeanDeserializerBase beanDeserializerBase, C9934Glc c9934Glc, AbstractC9915Gl5[] abstractC9915Gl5Arr) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
        this._delegate = beanDeserializerBase;
        this._targetType = abstractC9870GjI;
        this._orderedProperties = abstractC9915Gl5Arr;
        this._buildMethod = c9934Glc;
    }
}
