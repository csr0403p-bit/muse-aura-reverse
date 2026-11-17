package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC9849Git;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9875Gjj;
import X.AbstractC9877Gjl;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AnonymousClass002;
import X.C10448Hig;
import X.C3cG;
import X.C9898Gke;
import X.EnumC10046GoQ;
import X.EnumC9834GiY;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class RangeDeserializer extends StdDeserializer<Range<?>> implements InterfaceC9830GiT {
    public static final Pattern A00 = Pattern.compile("\\.\\.");
    public static final long serialVersionUID = 1;
    public final BoundType _defaultBoundType;
    public final JsonDeserializer<Object> _endpointDeserializer;
    public final C10448Hig _fieldNames;
    public final AbstractC9877Gjl _fromStringDeserializer;
    public final AbstractC9870GjI _rangeType;
    public final EnumC10046GoQ _shape;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r3.equalsIgnoreCase(com.facebook.aura.localbrowser.LocalBrowserNodeHandler.CLOSED) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.common.collect.BoundType A00(X.AbstractC9916Gl7 r3, X.AbstractC9904Gkk r4) {
        /*
            r2 = this;
            X.GiY r1 = X.EnumC9834GiY.VALUE_STRING
            X.GiY r0 = r3.A1N()
            r2.A04(r1, r0, r4)
            java.lang.String r3 = r3.A1c()
            if (r3 != 0) goto L11
            java.lang.String r3 = ""
        L11:
            java.lang.String r0 = "OPEN"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L56
            java.lang.String r0 = "CLOSED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3b
            X.GmA r1 = X.EnumC9951GmA.A01
            X.Gke r0 = r4._config
            boolean r0 = r0.A09(r1)
            if (r0 == 0) goto L3e
            java.lang.String r0 = "open"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L56
            java.lang.String r0 = "closed"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L3e
        L3b:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            return r0
        L3e:
            java.lang.Class<com.google.common.collect.BoundType> r2 = com.google.common.collect.BoundType.class
            com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "not a valid BoundType name (should be one of: %s)"
            r4.A0k(r2, r3, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L56:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer.A00(X.Gl7, X.Gkk):com.google.common.collect.BoundType");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gl7;)Ljava/lang/Comparable<*>; */
    private Comparable A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        Object objA0i = this._endpointDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        if (objA0i instanceof Comparable) {
            return (Comparable) objA0i;
        }
        AbstractC9849Git.A07(abstractC9904Gkk, this._rangeType, "Field '%s' deserialized to a %s, which does not implement `Comparable`", new Object[]{abstractC9916Gl7.A1a(), AbstractC9855Gj3.A07(objA0i)});
        throw F60.createAndThrow();
    }

    private Comparable<?> A03(AbstractC9904Gkk abstractC9904Gkk, String str) {
        Object objA00 = this._fromStringDeserializer.A00(abstractC9904Gkk, str);
        if (objA00 instanceof Comparable) {
            return (Comparable) objA00;
        }
        AbstractC9849Git.A07(abstractC9904Gkk, this._rangeType, "Stringified endpoint '%s' deserialized to a %s, which does not implement `Comparable`", new Object[]{str, AbstractC9855Gj3.A07(objA00)});
        throw F60.createAndThrow();
    }

    private void A04(EnumC9834GiY enumC9834GiY, EnumC9834GiY enumC9834GiY2, AbstractC9904Gkk abstractC9904Gkk) {
        if (enumC9834GiY2 != enumC9834GiY) {
            abstractC9904Gkk.A0c(this, String.format("Problem deserializing %s: expecting %s, found %s", AbstractC9855Gj3.A04(this._rangeType), enumC9834GiY, enumC9834GiY2), new Object[0]);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;Lcom/google/common/collect/BoundType;LX/Hig;LX/GoQ;LX/Gjl;)V */
    public RangeDeserializer(EnumC10046GoQ enumC10046GoQ, AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, C10448Hig c10448Hig, BoundType boundType) {
        super(abstractC9870GjI);
        this._rangeType = abstractC9870GjI;
        this._endpointDeserializer = jsonDeserializer;
        this._fromStringDeserializer = abstractC9877Gjl;
        this._defaultBoundType = boundType;
        this._fieldNames = c10448Hig;
        this._shape = enumC10046GoQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Range<?> A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws UnrecognizedPropertyException, InvalidDefinitionException {
        Class<?> clsA0h;
        String str;
        Object[] objArr;
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N == EnumC9834GiY.START_OBJECT) {
            enumC9834GiYA1N = abstractC9916Gl7.A1P();
        }
        BoundType boundTypeA00 = this._defaultBoundType;
        if (this._shape == EnumC10046GoQ.STRING) {
            A04(EnumC9834GiY.VALUE_STRING, enumC9834GiYA1N, abstractC9904Gkk);
            String strA1c = abstractC9916Gl7.A1c();
            if (strA1c.isEmpty()) {
                return null;
            }
            char cCharAt = strA1c.charAt(0);
            int length = strA1c.length() - 1;
            char cCharAt2 = strA1c.charAt(length);
            if ((cCharAt == '[' || cCharAt == '(') && (cCharAt2 == ']' || cCharAt2 == ')')) {
                BoundType boundType = strA1c.startsWith("[") ? BoundType.CLOSED : BoundType.OPEN;
                BoundType boundType2 = strA1c.endsWith("]") ? BoundType.CLOSED : BoundType.OPEN;
                strA1c = strA1c.substring(1, length);
                String[] strArrSplit = A00.split(strA1c);
                if (strArrSplit.length == 2) {
                    String str2 = strArrSplit[0];
                    boolean zEquals = str2.equals("-\u221e");
                    String str3 = strArrSplit[1];
                    boolean zEquals2 = str3.equals("+\u221e");
                    if (zEquals) {
                        return zEquals2 ? Range.A00 : Range.A01(boundType2, A03(abstractC9904Gkk, str3));
                    }
                    if (zEquals2) {
                        return Range.A00(boundType, A03(abstractC9904Gkk, str2));
                    }
                    Comparable<?> comparableA03 = A03(abstractC9904Gkk, str2);
                    Comparable<?> comparableA032 = A03(abstractC9904Gkk, strArrSplit[1]);
                    Range<Comparable> range = Range.A00;
                    BoundType boundType3 = BoundType.OPEN;
                    comparableA03.getClass();
                    Cut aboveValue = boundType == boundType3 ? new Cut.AboveValue(comparableA03) : new Cut.BelowValue(comparableA03);
                    comparableA032.getClass();
                    return new Range<>(aboveValue, boundType2 == boundType3 ? new Cut.BelowValue(comparableA032) : new Cut.AboveValue(comparableA032));
                }
                clsA0h = A0h();
                str = "Invalid bracket-notation representation (possibly missing \"..\" delimiter in your Stringified Range)";
                objArr = new Object[0];
            } else {
                clsA0h = A0h();
                objArr = new Object[0];
                str = "Invalid Range: should start with '[' or '(', end with ')' or ']'";
            }
            abstractC9904Gkk.A0k(clsA0h, strA1c, str, objArr);
        } else {
            Comparable comparableA02 = null;
            Comparable comparableA022 = null;
            BoundType boundTypeA002 = boundTypeA00;
            while (enumC9834GiYA1N != EnumC9834GiY.END_OBJECT) {
                A04(EnumC9834GiY.FIELD_NAME, enumC9834GiYA1N, abstractC9904Gkk);
                String strA1a = abstractC9916Gl7.A1a();
                try {
                    C10448Hig c10448Hig = this._fieldNames;
                    if (strA1a.equals(c10448Hig.lowerEndpoint)) {
                        abstractC9916Gl7.A1P();
                        comparableA022 = A02(abstractC9916Gl7, abstractC9904Gkk);
                    } else if (strA1a.equals(c10448Hig.upperEndpoint)) {
                        abstractC9916Gl7.A1P();
                        comparableA02 = A02(abstractC9916Gl7, abstractC9904Gkk);
                    } else if (strA1a.equals(c10448Hig.lowerBoundType)) {
                        abstractC9916Gl7.A1P();
                        boundTypeA00 = A00(abstractC9916Gl7, abstractC9904Gkk);
                    } else if (strA1a.equals(c10448Hig.upperBoundType)) {
                        abstractC9916Gl7.A1P();
                        boundTypeA002 = A00(abstractC9916Gl7, abstractC9904Gkk);
                    } else {
                        abstractC9904Gkk.A0W(abstractC9916Gl7, this, Range.class, strA1a);
                    }
                    enumC9834GiYA1N = abstractC9916Gl7.A1P();
                } catch (IllegalStateException e) {
                    abstractC9904Gkk.A0F(e.getMessage(), A0h());
                }
            }
            try {
                if (comparableA022 == null) {
                    if (comparableA02 == null) {
                        return Range.A00;
                    }
                    Preconditions.checkState(boundTypeA002 != null, "'upperEndpoint' field found, but not 'upperBoundType'");
                    return Range.A01(boundTypeA002, comparableA02);
                }
                if (comparableA02 == null) {
                    Preconditions.checkState(boundTypeA00 != null, "'lowerEndpoint' field found, but not 'lowerBoundType'");
                    return Range.A00(boundTypeA00, comparableA022);
                }
                Class<?> cls = comparableA022.getClass();
                Class<?> cls2 = comparableA02.getClass();
                boolean zA1Z = AnonymousClass002.A1Z(cls, cls2);
                String name = cls.getName();
                String name2 = cls2.getName();
                if (!zA1Z) {
                    throw C3cG.A0Q(Strings.lenientFormat("Endpoint types are not the same - 'lowerEndpoint' deserialized to [%s], and 'upperEndpoint' deserialized to [%s].", name, name2));
                }
                Preconditions.checkState(AnonymousClass002.A1X(boundTypeA00), "'lowerEndpoint' field found, but not 'lowerBoundType'");
                Preconditions.checkState(boundTypeA002 != null, "'upperEndpoint' field found, but not 'upperBoundType'");
                Range<Comparable> range2 = Range.A00;
                boundTypeA00.getClass();
                boundTypeA002.getClass();
                BoundType boundType4 = BoundType.OPEN;
                return new Range<>(boundTypeA00 == boundType4 ? new Cut.AboveValue(comparableA022) : new Cut.BelowValue(comparableA022), boundTypeA002 == boundType4 ? new Cut.BelowValue(comparableA02) : new Cut.AboveValue(comparableA02));
            } catch (IllegalStateException e2) {
                abstractC9904Gkk.A0E(A0u(abstractC9904Gkk), e2.getMessage());
            }
        }
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer<Object> jsonDeserializerA7e;
        Class<?> clsA0h = A0h();
        C9898Gke c9898Gke = abstractC9904Gkk._config;
        EnumC10046GoQ enumC10046GoQ = (interfaceC10017Gnp != null ? interfaceC10017Gnp.ABX(c9898Gke, clsA0h) : c9898Gke.A00(clsA0h))._shape;
        C9898Gke c9898Gke2 = abstractC9904Gkk._config;
        C10448Hig c10448HigA00 = AbstractC9875Gjj.A00(c9898Gke2._base._propertyNamingStrategy, c9898Gke2);
        AbstractC9870GjI abstractC9870GjIA03 = AbstractC9870GjI.A03(this._rangeType, 0);
        JsonDeserializer<Object> jsonDeserializer = this._endpointDeserializer;
        if (jsonDeserializer == 0) {
            jsonDeserializerA7e = abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjIA03);
        } else {
            boolean z = jsonDeserializer instanceof InterfaceC9830GiT;
            jsonDeserializerA7e = jsonDeserializer;
            if (z) {
                jsonDeserializerA7e = ((InterfaceC9830GiT) jsonDeserializer).A7e(interfaceC10017Gnp, abstractC9904Gkk);
            }
        }
        AbstractC9877Gjl abstractC9877GjlA0L = this._fromStringDeserializer;
        if (enumC10046GoQ == EnumC10046GoQ.STRING) {
            abstractC9877GjlA0L = abstractC9904Gkk.A0L(abstractC9870GjIA03);
        }
        return (jsonDeserializerA7e == this._endpointDeserializer && c10448HigA00 == this._fieldNames && enumC10046GoQ == this._shape && abstractC9877GjlA0L == this._fromStringDeserializer) ? this : new RangeDeserializer(enumC10046GoQ, this._rangeType, jsonDeserializerA7e, abstractC9877GjlA0L, c10448HigA00, this._defaultBoundType);
    }
}
