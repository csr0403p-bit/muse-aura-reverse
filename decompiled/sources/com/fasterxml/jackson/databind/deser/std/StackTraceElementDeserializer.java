package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes6.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<?> _adapterDeserializer;

    @Deprecated
    public StackTraceElementDeserializer() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.StackTraceElement A0i(X.AbstractC9916Gl7 r4, X.AbstractC9904Gkk r5) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            r3 = this;
            X.GiY r1 = r4.A1N()
            X.GiY r0 = X.EnumC9834GiY.START_OBJECT
            if (r1 == r0) goto L37
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            if (r1 == r0) goto L37
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto L33
            X.Gmd r0 = X.EnumC9965Gmd.A0M
            int r1 = r5._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L33
            r4.A1P()
            java.lang.StackTraceElement r2 = r3.A0i(r4, r5)
            X.GiY r1 = r4.A1P()
            X.GiY r0 = X.EnumC9834GiY.END_ARRAY
            if (r1 == r0) goto L62
            r3.A1F(r5)
        L2e:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L33:
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r4, r5, r3)
            goto L2e
        L37:
            com.fasterxml.jackson.databind.JsonDeserializer<?> r0 = r3._adapterDeserializer
            if (r0 != 0) goto L57
            java.lang.Class<X.Ghq> r1 = X.C9813Ghq.class
            X.Gke r0 = r5._config
            X.GjI r2 = X.AbstractC7608F5v.A0R(r0, r1)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.A0J(r2)
            if (r0 != 0) goto L57
            java.lang.String r1 = "Could not find JsonDeserializer for type "
            java.lang.String r0 = X.AbstractC9855Gj3.A04(r2)
            java.lang.String r0 = X.FGI.A0M(r1, r0)
            r5.A0E(r2, r0)
            goto L2e
        L57:
            r0.A0i(r4, r5)
            java.lang.String r1 = ""
            r0 = -1
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            r2.<init>(r1, r1, r1, r0)
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer.A0i(X.Gl7, X.Gkk):java.lang.StackTraceElement");
    }

    public StackTraceElementDeserializer(JsonDeserializer<?> jsonDeserializer) {
        super(StackTraceElement.class);
        this._adapterDeserializer = jsonDeserializer;
    }
}
