package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC9855Gj3;
import X.AbstractC9904Gkk;
import X.AbstractC9915Gl5;
import X.AbstractC9916Gl7;
import X.F60;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;

/* loaded from: classes6.dex */
public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    public static final long serialVersionUID = 1;
    public final BeanDeserializerBase _delegate;
    public final AbstractC9915Gl5[] _orderedProperties;

    public static final void A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, BeanAsArrayDeserializer beanAsArrayDeserializer) {
        abstractC9904Gkk.A0U(abstractC9916Gl7, abstractC9916Gl7.A1N(), beanAsArrayDeserializer.A0u(abstractC9904Gkk), "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", AbstractC9855Gj3.A04(beanAsArrayDeserializer._beanType), abstractC9916Gl7.A1N());
        throw F60.createAndThrow();
    }

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, AbstractC9915Gl5[] abstractC9915Gl5Arr) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
        this._delegate = beanDeserializerBase;
        this._orderedProperties = abstractC9915Gl5Arr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (X.AbstractC7609F5w.A1U(r0._mask, r9._featureFlags) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r7._ignoreAllUnknown == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        r9.A0Z(r4, r7, "Unexpected JSON values; expected at most %d properties (in JSON Array)", X.BV5.A1Y(r5));
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a2: INVOKE 
  (r7v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
  (r9v0 ?? I:X.Gkk)
  (r3 I:java.lang.Object)
  (r0 I:java.lang.String)
  (r1 I:java.lang.Throwable)
 VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1b(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.Gkk, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:162), block:B:45:0x009e */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x009e: IGET (r0 I:X.Gnh) = (r4 I:X.Gl5) (LINE:158) X.Gl5._propName X.Gnh, block:B:45:0x009e */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Gl5] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0i(X.AbstractC9916Gl7 r8, X.AbstractC9904Gkk r9) {
        /*
            r7 = this;
            boolean r0 = r8.A1x()
            if (r0 != 0) goto Le
            A00(r8, r9, r7)
        L9:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        Le:
            boolean r0 = r7._vanillaProcessing
            if (r0 != 0) goto L1b
            boolean r0 = r7._nonStandardCreation
            if (r0 == 0) goto L51
            java.lang.Object r3 = r7.A1U(r8, r9)
        L1a:
            return r3
        L1b:
            X.Glx r0 = r7._valueInstantiator
            java.lang.Object r3 = r0.A0D(r9)
            r8.A1o(r3)
            X.Gl5[] r2 = r7._orderedProperties
            int r5 = r2.length
            r1 = 0
        L28:
            X.GiY r0 = r8.A1P()
            X.GiY r4 = X.EnumC9834GiY.END_ARRAY
            if (r0 == r4) goto L1a
            if (r1 != r5) goto L43
            boolean r0 = r7._ignoreAllUnknown
            if (r0 != 0) goto L93
            X.Gmd r0 = X.EnumC9965Gmd.A0G
            int r1 = r9._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L93
            goto L73
        L43:
            r4 = r2[r1]
            if (r4 == 0) goto L4b
            r4.A0K(r3, r8, r9)     // Catch: java.lang.Exception -> L9d
            goto L4e
        L4b:
            r8.A1j()
        L4e:
            int r1 = r1 + 1
            goto L28
        L51:
            X.Glx r0 = r7._valueInstantiator
            java.lang.Object r3 = r0.A0D(r9)
            r8.A1o(r3)
            com.fasterxml.jackson.databind.JsonDeserializer.A0W(r9, r7)
            java.lang.Class r6 = com.fasterxml.jackson.databind.JsonDeserializer.A0O(r9, r7)
            X.Gl5[] r2 = r7._orderedProperties
            int r5 = r2.length
            r1 = 0
        L65:
            X.GiY r0 = r8.A1P()
            X.GiY r4 = X.EnumC9834GiY.END_ARRAY
            if (r0 == r4) goto L1a
            if (r1 != r5) goto L7d
            boolean r0 = r7._ignoreAllUnknown
            if (r0 != 0) goto L93
        L73:
            java.lang.Object[] r1 = X.BV5.A1Y(r5)
            java.lang.String r0 = "Unexpected JSON values; expected at most %d properties (in JSON Array)"
            r9.A0Z(r4, r7, r0, r1)
            goto L9
        L7d:
            r4 = r2[r1]
            int r1 = r1 + 1
            if (r4 == 0) goto L8f
            if (r6 == 0) goto L8b
            boolean r0 = r4.A0R(r6)
            if (r0 == 0) goto L8f
        L8b:
            r4.A0K(r3, r8, r9)     // Catch: java.lang.Exception -> L9d
            goto L65
        L8f:
            r8.A1j()
            goto L65
        L93:
            r8.A1j()
            X.GiY r0 = r8.A1P()
            if (r0 != r4) goto L93
            return r3
        L9d:
            r1 = move-exception
            X.Gnh r0 = r4._propName
            java.lang.String r0 = r0._simpleName
            r7.A1b(r9, r3, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer.A0i(X.Gl7, X.Gkk):java.lang.Object");
    }
}
