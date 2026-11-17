package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: X.Gl5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9915Gl5 extends GmW implements Serializable {
    public static final JsonDeserializer<Object> A01 = new FailingDeserializer();
    public final transient InterfaceC10076Gox A00;
    public String _managedReferenceName;
    public final InterfaceC10165Gqa _nullProvider;
    public C10003Gna _objectIdInfo;
    public final C10009Gnh _propName;
    public int _propertyIndex;
    public final AbstractC9870GjI _type;
    public final JsonDeserializer<Object> _valueDeserializer;
    public final AbstractC9986Gn8 _valueTypeDeserializer;
    public Hn0 _viewMatcher;
    public final C10009Gnh _wrapperName;

    public static final void A00(AbstractC9916Gl7 abstractC9916Gl7, Exception exc) throws Exception {
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        if (exc instanceof IOException) {
            throw exc;
        }
        AbstractC9855Gj3.A0F(exc);
        Exception cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        throw new JsonMappingException(abstractC9916Gl7, AbstractC9855Gj3.A0A(cause), cause);
    }

    private final AbstractC9915Gl5 A05(C10009Gnh c10009Gnh) {
        if (this instanceof C9942Glu) {
            return new C9942Glu(c10009Gnh, (C9942Glu) this);
        }
        if (this instanceof C9961GmY) {
            return new C9961GmY(c10009Gnh, (C9961GmY) this);
        }
        if (this instanceof C9960GmX) {
            return new C9960GmX(c10009Gnh, (C9960GmX) this);
        }
        if (this instanceof C9952GmC) {
            return new C9952GmC(c10009Gnh, (C9952GmC) this);
        }
        if (this instanceof C9947Gm2) {
            return new C9947Gm2(c10009Gnh, (C9947Gm2) this);
        }
        if (!(this instanceof AbstractC9962GmZ)) {
            return new C9936Glf(c10009Gnh, (C9936Glf) this);
        }
        AbstractC9962GmZ abstractC9962GmZ = (AbstractC9962GmZ) this;
        AbstractC9915Gl5 abstractC9915Gl5A05 = abstractC9962GmZ.delegate.A05(c10009Gnh);
        return abstractC9915Gl5A05 == abstractC9962GmZ.delegate ? abstractC9962GmZ : abstractC9962GmZ.A0S(abstractC9915Gl5A05);
    }

    private final void A0I(AbstractC9916Gl7 abstractC9916Gl7, Exception exc, Object obj) throws Exception {
        if (!(exc instanceof IllegalArgumentException)) {
            A00(abstractC9916Gl7, exc);
            throw F60.createAndThrow();
        }
        String strA07 = AbstractC9855Gj3.A07(obj);
        StringBuilder sbA0x = C60O.A0x("Problem deserializing property '");
        sbA0x.append(this._propName._simpleName);
        sbA0x.append("' (expected type: ");
        sbA0x.append(this._type);
        sbA0x.append("; actual type: ");
        sbA0x.append(strA07);
        sbA0x.append(")");
        String strA0A = AbstractC9855Gj3.A0A(exc);
        if (strA0A != null) {
            sbA0x.append(", problem: ");
        } else {
            strA0A = " (no error message provided)";
        }
        throw new JsonMappingException(abstractC9916Gl7, AnonymousClass001.A0v(strA0A, sbA0x), exc);
    }

    public final int A02() {
        AbstractC9915Gl5 abstractC9915Gl5;
        if (this instanceof C9960GmX) {
            abstractC9915Gl5 = ((C9960GmX) this)._forward;
        } else {
            if (!(this instanceof AbstractC9962GmZ)) {
                if (this instanceof C9936Glf) {
                    return ((C9936Glf) this)._creatorIndex;
                }
                throw BV5.A0W("Internal error: no creator index for property '%s' (of type %s)", new Object[]{this._propName._simpleName, C60Q.A0e(this)});
            }
            abstractC9915Gl5 = ((AbstractC9962GmZ) this).delegate;
        }
        return abstractC9915Gl5.A02();
    }

    public final JsonDeserializer<Object> A03() {
        if (this instanceof AbstractC9962GmZ) {
            return ((AbstractC9962GmZ) this).delegate.A03();
        }
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer == A01) {
            return null;
        }
        return jsonDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC9915Gl5 A04(JsonDeserializer<?> jsonDeserializer) {
        C9936Glf c9936Glf;
        if (this instanceof C9942Glu) {
            C9942Glu c9942Glu = (C9942Glu) this;
            JsonDeserializer<?> jsonDeserializer2 = c9942Glu._valueDeserializer;
            c9936Glf = c9942Glu;
            if (jsonDeserializer2 != jsonDeserializer) {
                InterfaceC10165Gqa interfaceC10165Gqa = c9942Glu._nullProvider;
                if (jsonDeserializer2 == interfaceC10165Gqa) {
                    interfaceC10165Gqa = jsonDeserializer;
                }
                return new C9942Glu(jsonDeserializer, interfaceC10165Gqa, c9942Glu);
            }
        } else if (this instanceof C9961GmY) {
            C9961GmY c9961GmY = (C9961GmY) this;
            JsonDeserializer<?> jsonDeserializer3 = c9961GmY._valueDeserializer;
            c9936Glf = c9961GmY;
            if (jsonDeserializer3 != jsonDeserializer) {
                InterfaceC10165Gqa interfaceC10165Gqa2 = c9961GmY._nullProvider;
                if (jsonDeserializer3 == interfaceC10165Gqa2) {
                    interfaceC10165Gqa2 = jsonDeserializer;
                }
                return new C9961GmY(jsonDeserializer, interfaceC10165Gqa2, c9961GmY);
            }
        } else if (this instanceof C9960GmX) {
            C9960GmX c9960GmX = (C9960GmX) this;
            JsonDeserializer<?> jsonDeserializer4 = c9960GmX._valueDeserializer;
            c9936Glf = c9960GmX;
            if (jsonDeserializer4 != jsonDeserializer) {
                InterfaceC10165Gqa interfaceC10165Gqa3 = c9960GmX._nullProvider;
                if (jsonDeserializer4 == interfaceC10165Gqa3) {
                    interfaceC10165Gqa3 = jsonDeserializer;
                }
                return new C9960GmX(jsonDeserializer, interfaceC10165Gqa3, c9960GmX);
            }
        } else if (this instanceof C9952GmC) {
            C9952GmC c9952GmC = (C9952GmC) this;
            JsonDeserializer<?> jsonDeserializer5 = c9952GmC._valueDeserializer;
            c9936Glf = c9952GmC;
            if (jsonDeserializer5 != jsonDeserializer) {
                InterfaceC10165Gqa interfaceC10165Gqa4 = c9952GmC._nullProvider;
                if (jsonDeserializer5 == interfaceC10165Gqa4) {
                    interfaceC10165Gqa4 = jsonDeserializer;
                }
                return new C9952GmC(jsonDeserializer, interfaceC10165Gqa4, c9952GmC);
            }
        } else if (this instanceof C9947Gm2) {
            C9947Gm2 c9947Gm2 = (C9947Gm2) this;
            JsonDeserializer<?> jsonDeserializer6 = c9947Gm2._valueDeserializer;
            c9936Glf = c9947Gm2;
            if (jsonDeserializer6 != jsonDeserializer) {
                InterfaceC10165Gqa interfaceC10165Gqa5 = c9947Gm2._nullProvider;
                if (jsonDeserializer6 == interfaceC10165Gqa5) {
                    interfaceC10165Gqa5 = jsonDeserializer;
                }
                return new C9947Gm2(jsonDeserializer, interfaceC10165Gqa5, c9947Gm2);
            }
        } else {
            if (this instanceof AbstractC9962GmZ) {
                AbstractC9962GmZ abstractC9962GmZ = (AbstractC9962GmZ) this;
                AbstractC9915Gl5 abstractC9915Gl5A04 = abstractC9962GmZ.delegate.A04(jsonDeserializer);
                return abstractC9915Gl5A04 != abstractC9962GmZ.delegate ? abstractC9962GmZ.A0S(abstractC9915Gl5A04) : abstractC9962GmZ;
            }
            C9936Glf c9936Glf2 = (C9936Glf) this;
            JsonDeserializer<?> jsonDeserializer7 = c9936Glf2._valueDeserializer;
            c9936Glf = c9936Glf2;
            if (jsonDeserializer7 != jsonDeserializer) {
                InterfaceC10165Gqa interfaceC10165Gqa6 = c9936Glf2._nullProvider;
                if (jsonDeserializer7 == interfaceC10165Gqa6) {
                    interfaceC10165Gqa6 = jsonDeserializer;
                }
                return new C9936Glf(jsonDeserializer, c9936Glf2, interfaceC10165Gqa6);
            }
        }
        return c9936Glf;
    }

    public final AbstractC9915Gl5 A06(InterfaceC10165Gqa interfaceC10165Gqa) {
        if (this instanceof C9942Glu) {
            C9942Glu c9942Glu = (C9942Glu) this;
            return new C9942Glu(c9942Glu._valueDeserializer, interfaceC10165Gqa, c9942Glu);
        }
        if (this instanceof C9961GmY) {
            C9961GmY c9961GmY = (C9961GmY) this;
            return new C9961GmY(c9961GmY._valueDeserializer, interfaceC10165Gqa, c9961GmY);
        }
        if (this instanceof C9960GmX) {
            C9960GmX c9960GmX = (C9960GmX) this;
            return new C9960GmX(c9960GmX._valueDeserializer, interfaceC10165Gqa, c9960GmX);
        }
        if (this instanceof C9952GmC) {
            C9952GmC c9952GmC = (C9952GmC) this;
            return new C9952GmC(c9952GmC._valueDeserializer, interfaceC10165Gqa, c9952GmC);
        }
        if (this instanceof C9947Gm2) {
            C9947Gm2 c9947Gm2 = (C9947Gm2) this;
            return new C9947Gm2(c9947Gm2._valueDeserializer, interfaceC10165Gqa, c9947Gm2);
        }
        if (!(this instanceof AbstractC9962GmZ)) {
            C9936Glf c9936Glf = (C9936Glf) this;
            return new C9936Glf(c9936Glf._valueDeserializer, c9936Glf, interfaceC10165Gqa);
        }
        AbstractC9962GmZ abstractC9962GmZ = (AbstractC9962GmZ) this;
        AbstractC9915Gl5 abstractC9915Gl5A06 = abstractC9962GmZ.delegate.A06(interfaceC10165Gqa);
        return abstractC9915Gl5A06 == abstractC9962GmZ.delegate ? abstractC9962GmZ : abstractC9962GmZ.A0S(abstractC9915Gl5A06);
    }

    public final AbstractC9915Gl5 A07(String str) {
        C10009Gnh c10009Gnh;
        C10009Gnh c10009Gnh2 = this._propName;
        if (c10009Gnh2 == null) {
            c10009Gnh = new C10009Gnh(str, null);
        } else {
            if (str == null) {
                str = "";
            }
            c10009Gnh = str.equals(c10009Gnh2._simpleName) ? c10009Gnh2 : new C10009Gnh(str, c10009Gnh2._namespace);
            if (c10009Gnh == c10009Gnh2) {
                return this;
            }
        }
        return A05(c10009Gnh);
    }

    public final C10003Gna A08() {
        return this instanceof AbstractC9962GmZ ? ((AbstractC9962GmZ) this).delegate.A08() : this._objectIdInfo;
    }

    public final AbstractC9986Gn8 A09() {
        return this instanceof AbstractC9962GmZ ? ((AbstractC9962GmZ) this).delegate.A09() : this._valueTypeDeserializer;
    }

    public final Class<?> A0A() {
        return this instanceof AbstractC9962GmZ ? ((AbstractC9962GmZ) this).delegate.A0A() : AHe().A0C();
    }

    public final Object A0B() {
        C10085Gp8 c10085Gp8;
        if (this instanceof AbstractC9962GmZ) {
            return ((AbstractC9962GmZ) this).delegate.A0B();
        }
        if (!(this instanceof C9936Glf) || (c10085Gp8 = ((C9936Glf) this)._injectableValue) == null) {
            return null;
        }
        return c10085Gp8._id;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00f5: INVOKE (r3v0 ?? I:X.Gl5), (r4v0 ?? I:X.Gl7), (r0v4 ?? I:java.lang.Exception), (r2 I:java.lang.Object) DIRECT call: X.Gl5.A0I(X.Gl7, java.lang.Exception, java.lang.Object):void A[MD:(X.Gl7, java.lang.Exception, java.lang.Object):void (m)] (LINE:245), block:B:76:0x00f5 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(X.AbstractC9916Gl7 r4, X.AbstractC9904Gkk r5, java.lang.Object r6) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9915Gl5.A0D(X.Gl7, X.Gkk, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (r7 != null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.GmZ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.GnK] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.GmZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0F(java.lang.Object r6, java.lang.Object r7) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9915Gl5.A0F(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String A0G() {
        return this instanceof AbstractC9962GmZ ? ((AbstractC9962GmZ) this).delegate.A0G() : this._managedReferenceName;
    }

    public final void A0H(int i) {
        if (this instanceof AbstractC9962GmZ) {
            ((AbstractC9962GmZ) this).delegate.A0H(i);
            return;
        }
        int i2 = this._propertyIndex;
        if (i2 == -1) {
            this._propertyIndex = i;
            return;
        }
        StringBuilder sbA0x = C60O.A0x("Property '");
        sbA0x.append(this._propName._simpleName);
        sbA0x.append("' already had index (");
        sbA0x.append(i2);
        throw C3cG.A0Q(C60P.A1O("), trying to assign ", sbA0x, i));
    }

    public final void A0J(C9898Gke c9898Gke) {
        AbstractC9915Gl5 abstractC9915Gl5;
        if (this instanceof C9942Glu) {
            AbstractC9970Gmj.A00(c9898Gke, ((C9942Glu) this)._annotated);
            return;
        }
        if (this instanceof C9960GmX) {
            abstractC9915Gl5 = ((C9960GmX) this)._forward;
        } else {
            if (this instanceof C9952GmC) {
                AbstractC9970Gmj.A00(c9898Gke, ((C9952GmC) this)._annotated);
                return;
            }
            if (this instanceof C9947Gm2) {
                AbstractC7609F5w.A1B(c9898Gke, ((C9947Gm2) this).A00);
                return;
            }
            if (this instanceof AbstractC9962GmZ) {
                AbstractC9962GmZ abstractC9962GmZ = (AbstractC9962GmZ) this;
                if (abstractC9962GmZ instanceof C9992GnK) {
                    C9992GnK c9992GnK = (C9992GnK) abstractC9962GmZ;
                    c9992GnK.delegate.A0J(c9898Gke);
                    abstractC9915Gl5 = c9992GnK._backProperty;
                } else {
                    abstractC9915Gl5 = abstractC9962GmZ.delegate;
                }
                abstractC9915Gl5.A0J(c9898Gke);
            }
            if (!(this instanceof C9936Glf)) {
                return;
            } else {
                abstractC9915Gl5 = ((C9936Glf) this)._fallbackSetter;
            }
        }
        if (abstractC9915Gl5 == null) {
            return;
        }
        abstractC9915Gl5.A0J(c9898Gke);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0136: INVOKE (r3v0 ?? I:X.Gl5), (r5v0 ?? I:X.Gl7), (r0v4 ?? I:java.lang.Exception), (r2 I:java.lang.Object) DIRECT call: X.Gl5.A0I(X.Gl7, java.lang.Exception, java.lang.Object):void A[MD:(X.Gl7, java.lang.Exception, java.lang.Object):void (m)] (LINE:310), block:B:76:0x0136 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(java.lang.Object r4, X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9915Gl5.A0K(java.lang.Object, X.Gl7, X.Gkk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Gl5] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0L(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C9942Glu
            if (r0 == 0) goto L15
            java.lang.String r2 = "Should never call `set()` on setterless property ('"
            X.Gnh r0 = r3._propName
            java.lang.String r1 = r0._simpleName
            java.lang.String r0 = "')"
            java.lang.String r0 = X.FGI.A0U(r2, r1, r0)
            java.lang.UnsupportedOperationException r0 = X.C8j3.A18(r0)
            throw r0
        L15:
            boolean r0 = r3 instanceof X.C9961GmY
            if (r0 != 0) goto L43
            boolean r0 = r3 instanceof X.C9960GmX
            if (r0 == 0) goto L25
            X.GmX r3 = (X.C9960GmX) r3
            X.Gl5 r0 = r3._forward
        L21:
            r0.A0L(r4, r5)
        L24:
            return
        L25:
            boolean r0 = r3 instanceof X.C9952GmC
            if (r0 == 0) goto L32
            X.GmC r3 = (X.C9952GmC) r3
            if (r5 != 0) goto L5e
            boolean r0 = r3._skipNulls
            if (r0 == 0) goto L5e
            return
        L32:
            boolean r0 = r3 instanceof X.C9947Gm2
            if (r0 == 0) goto L47
            X.Gm2 r3 = (X.C9947Gm2) r3
            if (r5 != 0) goto L68
            boolean r0 = r3._skipNulls
            if (r0 == 0) goto L68
            return
        L3f:
            boolean r0 = r3 instanceof X.C9992GnK
            if (r0 == 0) goto L53
        L43:
            r3.A0F(r4, r5)
            return
        L47:
            boolean r0 = r3 instanceof X.AbstractC9962GmZ
            if (r0 == 0) goto L56
            X.GmZ r3 = (X.AbstractC9962GmZ) r3
            boolean r0 = r3 instanceof X.C10077Goy
            if (r0 == 0) goto L3f
            if (r5 == 0) goto L24
        L53:
            X.Gl5 r0 = r3.delegate
            goto L21
        L56:
            X.Glf r3 = (X.C9936Glf) r3
            X.C9936Glf.A01(r3)
            X.Gl5 r0 = r3._fallbackSetter
            goto L21
        L5e:
            java.lang.reflect.Method r1 = r3.A00     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L6e
            r1.invoke(r4, r0)     // Catch: java.lang.Exception -> L6e
            return
        L68:
            java.lang.reflect.Field r0 = r3.A00     // Catch: java.lang.Exception -> L6e
            r0.set(r4, r5)     // Catch: java.lang.Exception -> L6e
            return
        L6e:
            r1 = move-exception
            r0 = 0
            r3.A0I(r0, r1, r5)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9915Gl5.A0L(java.lang.Object, java.lang.Object):void");
    }

    public final void A0M(Class<?>[] clsArr) {
        Hn0 hn2;
        if (clsArr == null) {
            hn2 = null;
        } else {
            int length = clsArr.length;
            hn2 = length != 0 ? length != 1 ? new Hn2(clsArr) : new Hn1(clsArr[0]) : Hn0.A00;
        }
        this._viewMatcher = hn2;
    }

    public final boolean A0N() {
        if (this instanceof AbstractC9962GmZ) {
            return ((AbstractC9962GmZ) this).delegate.A0N();
        }
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        return (jsonDeserializer == null || jsonDeserializer == A01) ? false : true;
    }

    public final boolean A0O() {
        return this instanceof AbstractC9962GmZ ? ((AbstractC9962GmZ) this).delegate.A0O() : AnonymousClass002.A1X(this._valueTypeDeserializer);
    }

    public final boolean A0P() {
        return this instanceof AbstractC9962GmZ ? ((AbstractC9962GmZ) this).delegate.A0P() : AnonymousClass002.A1X(this._viewMatcher);
    }

    public final boolean A0Q() {
        C10085Gp8 c10085Gp8;
        Boolean bool;
        return this instanceof AbstractC9962GmZ ? ((AbstractC9962GmZ) this).delegate.A0Q() : (!(this instanceof C9936Glf) || (c10085Gp8 = ((C9936Glf) this)._injectableValue) == null || (bool = c10085Gp8._useInput) == null || bool.booleanValue()) ? false : true;
    }

    public final boolean A0R(Class<?> cls) {
        if (this instanceof AbstractC9962GmZ) {
            return ((AbstractC9962GmZ) this).delegate.A0R(cls);
        }
        Hn0 hn0 = this._viewMatcher;
        if (hn0 == null) {
            return true;
        }
        if (hn0 instanceof Hn1) {
            Class<?> cls2 = ((Hn1) hn0)._view;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
        if (!(hn0 instanceof Hn2)) {
            return false;
        }
        Hn2 hn2 = (Hn2) hn0;
        int length = hn2._views.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls3 = hn2._views[i];
            if (cls == cls3 || cls3.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC10017Gnp
    public final C10009Gnh AFv() {
        return this._propName;
    }

    @Override // X.InterfaceC10017Gnp
    public final AbstractC9970Gmj AHe() {
        AbstractC9915Gl5 abstractC9915Gl5;
        if (this instanceof C9942Glu) {
            return ((C9942Glu) this)._annotated;
        }
        if (this instanceof C9961GmY) {
            return null;
        }
        if (this instanceof C9960GmX) {
            abstractC9915Gl5 = ((C9960GmX) this)._forward;
        } else {
            if (this instanceof C9952GmC) {
                return ((C9952GmC) this)._annotated;
            }
            if (this instanceof C9947Gm2) {
                return ((C9947Gm2) this)._annotated;
            }
            if (!(this instanceof AbstractC9962GmZ)) {
                return ((C9936Glf) this)._annotated;
            }
            abstractC9915Gl5 = ((AbstractC9962GmZ) this).delegate;
        }
        return abstractC9915Gl5.AHe();
    }

    @Override // X.InterfaceC10017Gnp
    public final AbstractC9870GjI AM9() {
        return this._type;
    }

    @Override // X.InterfaceC10017Gnp
    public final String getName() {
        return this._propName._simpleName;
    }

    public String toString() {
        return FGI.A0U("[property '", this._propName._simpleName, "']");
    }

    public AbstractC9915Gl5(AbstractC9915Gl5 abstractC9915Gl5) {
        super(abstractC9915Gl5);
        this._propertyIndex = -1;
        this._propName = abstractC9915Gl5._propName;
        this._type = abstractC9915Gl5._type;
        this._wrapperName = abstractC9915Gl5._wrapperName;
        this.A00 = abstractC9915Gl5.A00;
        this._valueDeserializer = abstractC9915Gl5._valueDeserializer;
        this._valueTypeDeserializer = abstractC9915Gl5._valueTypeDeserializer;
        this._managedReferenceName = abstractC9915Gl5._managedReferenceName;
        this._propertyIndex = abstractC9915Gl5._propertyIndex;
        this._viewMatcher = abstractC9915Gl5._viewMatcher;
        this._objectIdInfo = abstractC9915Gl5._objectIdInfo;
        this._nullProvider = abstractC9915Gl5._nullProvider;
    }

    private final Object A0E(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj) throws IOException {
        if (!AbstractC7607F5u.A1W(abstractC9916Gl7)) {
            if (this._valueTypeDeserializer != null) {
                return abstractC9904Gkk.A0G(this, abstractC9904Gkk.A0B().A09(obj.getClass())).A0l(abstractC9916Gl7, abstractC9904Gkk, obj);
            }
            Object objA0l = this._valueDeserializer.A0l(abstractC9916Gl7, abstractC9904Gkk, obj);
            if (objA0l != null) {
                return objA0l;
            }
        }
        InterfaceC10165Gqa interfaceC10165Gqa = this._nullProvider;
        return interfaceC10165Gqa == C10119Gpk.A01 ? obj : interfaceC10165Gqa.AIA(abstractC9904Gkk);
    }

    public final Object A0C(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        if (!AbstractC7607F5u.A1W(abstractC9916Gl7)) {
            AbstractC9986Gn8 abstractC9986Gn8 = this._valueTypeDeserializer;
            JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
            if (abstractC9986Gn8 != null) {
                return jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8);
            }
            Object objA0i = jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
            if (objA0i != null) {
                return objA0i;
            }
        }
        return this._nullProvider.AIA(abstractC9904Gkk);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gl5;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gqa;)V */
    public AbstractC9915Gl5(JsonDeserializer jsonDeserializer, InterfaceC10165Gqa interfaceC10165Gqa, AbstractC9915Gl5 abstractC9915Gl5) {
        super(abstractC9915Gl5);
        this._propertyIndex = -1;
        this._propName = abstractC9915Gl5._propName;
        this._type = abstractC9915Gl5._type;
        this._wrapperName = abstractC9915Gl5._wrapperName;
        this.A00 = abstractC9915Gl5.A00;
        this._valueTypeDeserializer = abstractC9915Gl5._valueTypeDeserializer;
        this._managedReferenceName = abstractC9915Gl5._managedReferenceName;
        this._propertyIndex = abstractC9915Gl5._propertyIndex;
        jsonDeserializer = jsonDeserializer == null ? A01 : jsonDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._viewMatcher = abstractC9915Gl5._viewMatcher;
        this._objectIdInfo = abstractC9915Gl5._objectIdInfo;
        this._nullProvider = interfaceC10165Gqa == A01 ? jsonDeserializer : interfaceC10165Gqa;
    }

    public AbstractC9915Gl5(AbstractC9870GjI abstractC9870GjI, C10034GoA c10034GoA, C10009Gnh c10009Gnh, AbstractC9986Gn8 abstractC9986Gn8, InterfaceC10076Gox interfaceC10076Gox) {
        String strA00;
        super(c10034GoA);
        this._propertyIndex = -1;
        if (c10009Gnh == null) {
            c10009Gnh = C10009Gnh.A00;
        } else {
            String str = c10009Gnh._simpleName;
            if (!str.isEmpty() && (strA00 = HlK.A00.A00(str)) != c10009Gnh._simpleName) {
                c10009Gnh = new C10009Gnh(strA00, c10009Gnh._namespace);
            }
        }
        this._propName = c10009Gnh;
        this._type = abstractC9870GjI;
        this._wrapperName = null;
        this.A00 = interfaceC10076Gox;
        this._viewMatcher = null;
        this._valueTypeDeserializer = abstractC9986Gn8 != null ? abstractC9986Gn8.A03(this) : abstractC9986Gn8;
        JsonDeserializer<Object> jsonDeserializer = A01;
        this._valueDeserializer = jsonDeserializer;
        this._nullProvider = jsonDeserializer;
    }

    public AbstractC9915Gl5(C10009Gnh c10009Gnh, AbstractC9915Gl5 abstractC9915Gl5) {
        super(abstractC9915Gl5);
        this._propertyIndex = -1;
        this._propName = c10009Gnh;
        this._type = abstractC9915Gl5._type;
        this._wrapperName = abstractC9915Gl5._wrapperName;
        this.A00 = abstractC9915Gl5.A00;
        this._valueDeserializer = abstractC9915Gl5._valueDeserializer;
        this._valueTypeDeserializer = abstractC9915Gl5._valueTypeDeserializer;
        this._managedReferenceName = abstractC9915Gl5._managedReferenceName;
        this._propertyIndex = abstractC9915Gl5._propertyIndex;
        this._viewMatcher = abstractC9915Gl5._viewMatcher;
        this._objectIdInfo = abstractC9915Gl5._objectIdInfo;
        this._nullProvider = abstractC9915Gl5._nullProvider;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gnh;LX/GjI;LX/GoA;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;)V */
    public AbstractC9915Gl5(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, C10034GoA c10034GoA, C10009Gnh c10009Gnh) {
        String strA00;
        super(c10034GoA);
        this._propertyIndex = -1;
        if (c10009Gnh == null) {
            c10009Gnh = C10009Gnh.A00;
        } else {
            String str = c10009Gnh._simpleName;
            if (!str.isEmpty() && (strA00 = HlK.A00.A00(str)) != c10009Gnh._simpleName) {
                c10009Gnh = new C10009Gnh(strA00, c10009Gnh._namespace);
            }
        }
        this._propName = c10009Gnh;
        this._type = abstractC9870GjI;
        this._wrapperName = null;
        this.A00 = null;
        this._viewMatcher = null;
        this._valueTypeDeserializer = null;
        this._valueDeserializer = jsonDeserializer;
        this._nullProvider = jsonDeserializer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC9915Gl5(AbstractC9870GjI abstractC9870GjI, AbstractC9958GmS abstractC9958GmS, AbstractC9986Gn8 abstractC9986Gn8, InterfaceC10076Gox interfaceC10076Gox) {
        C10009Gnh c10009Gnh;
        boolean z = abstractC9958GmS instanceof C9978Gmt;
        if (z) {
            c10009Gnh = ((C9978Gmt) abstractC9958GmS).A03;
        } else {
            c10009Gnh = ((C9908Gko) abstractC9958GmS).A06;
        }
        if (!z) {
            abstractC9958GmS.A0F();
        }
        this(abstractC9870GjI, abstractC9958GmS.A0D(), c10009Gnh, abstractC9986Gn8, interfaceC10076Gox);
    }
}
