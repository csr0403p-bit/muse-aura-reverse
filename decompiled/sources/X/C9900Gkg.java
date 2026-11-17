package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Gkg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9900Gkg extends AbstractC9794GhC implements Serializable {
    public static final long serialVersionUID = 2;
    public transient AbstractC9870GjI A00;
    public final C9898Gke _config;
    public final AbstractC9920GlH _context;
    public final AbstractC10211GrX _dataFormatReaders;
    public final Gr0 _filter;
    public final AbstractC10205GrR _injectableValues;
    public final C9924GlL _parserFactory;
    public final JsonDeserializer<Object> _rootDeserializer;
    public final ConcurrentHashMap<AbstractC9870GjI, JsonDeserializer<Object>> _rootDeserializers;
    public final InterfaceC10206GrS _schema;
    public final boolean _unwrapRoot;
    public final Object _valueToUpdate;
    public final AbstractC9870GjI _valueType;

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9900Gkg(X.C9898Gke r6, X.AbstractC9870GjI r7, X.C9899Gkf r8) {
        /*
            r5 = this;
            r4 = 0
            r5.<init>()
            r5._config = r6
            X.GlH r0 = r8._deserializationContext
            r5._context = r0
            java.util.concurrent.ConcurrentHashMap<X.GjI, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r2 = r8._rootDeserializers
            r5._rootDeserializers = r2
            X.GlL r0 = r8._jsonFactory
            r5._parserFactory = r0
            r5._valueType = r7
            r5._valueToUpdate = r4
            r5._schema = r4
            r5._injectableValues = r4
            X.Gnh r0 = r6._rootName
            if (r0 == 0) goto L3d
            boolean r0 = r0.A02()
            r0 = r0 ^ 1
        L24:
            r5._unwrapRoot = r0
            if (r7 == 0) goto L5d
            X.Gmd r0 = X.EnumC9965Gmd.A05
            int r1 = r6._deserFeatures
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L5d
            java.lang.Object r3 = r2.get(r7)
            com.fasterxml.jackson.databind.JsonDeserializer r3 = (com.fasterxml.jackson.databind.JsonDeserializer) r3
            if (r3 != 0) goto L5e
            goto L48
        L3d:
            X.Gmd r0 = X.EnumC9965Gmd.A0L
            int r1 = r6._deserFeatures
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            goto L24
        L48:
            X.GlH r2 = r5._context     // Catch: com.fasterxml.jackson.core.JacksonException -> L5e
            X.Gke r1 = r5._config     // Catch: com.fasterxml.jackson.core.JacksonException -> L5e
            X.GrK r0 = new X.GrK     // Catch: com.fasterxml.jackson.core.JacksonException -> L5e
            r0.<init>(r1, r2)     // Catch: com.fasterxml.jackson.core.JacksonException -> L5e
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r0.A0J(r7)     // Catch: com.fasterxml.jackson.core.JacksonException -> L5e
            if (r3 == 0) goto L5e
            java.util.concurrent.ConcurrentHashMap<X.GjI, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r0 = r5._rootDeserializers     // Catch: com.fasterxml.jackson.core.JacksonException -> L5e
            r0.put(r7, r3)     // Catch: com.fasterxml.jackson.core.JacksonException -> L5e
            goto L5e
        L5d:
            r3 = 0
        L5e:
            r5._rootDeserializer = r3
            r5._dataFormatReaders = r4
            r5._filter = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9900Gkg.<init>(X.Gke, X.GjI, X.Gkf):void");
    }

    public static final EnumC9834GiY A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, C9900Gkg c9900Gkg) {
        C9898Gke c9898Gke = c9900Gkg._config;
        int i = c9898Gke._parserFeaturesToChange;
        if (i != 0) {
            abstractC9916Gl7.A1l(c9898Gke._parserFeatures, i);
        }
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N == null && (enumC9834GiYA1N = abstractC9916Gl7.A1P()) == null) {
            throw MismatchedInputException.A00(abstractC9904Gkk.A00, c9900Gkg._valueType, "No content to map due to end-of-input");
        }
        return enumC9834GiYA1N;
    }

    public static final JsonDeserializer A01(AbstractC9904Gkk abstractC9904Gkk, C9900Gkg c9900Gkg) throws InvalidDefinitionException {
        String strA0a;
        JsonDeserializer<Object> jsonDeserializerA0J = c9900Gkg._rootDeserializer;
        if (jsonDeserializerA0J == null) {
            AbstractC9870GjI abstractC9870GjI = c9900Gkg._valueType;
            if (abstractC9870GjI == null) {
                abstractC9870GjI = null;
                strA0a = "No value type configured for ObjectReader";
            } else {
                jsonDeserializerA0J = c9900Gkg._rootDeserializers.get(abstractC9870GjI);
                if (jsonDeserializerA0J == null) {
                    jsonDeserializerA0J = abstractC9904Gkk.A0J(abstractC9870GjI);
                    if (jsonDeserializerA0J == null) {
                        strA0a = AnonymousClass007.A0a("Cannot find a deserializer for type ", abstractC9870GjI);
                    } else {
                        c9900Gkg._rootDeserializers.put(abstractC9870GjI, jsonDeserializerA0J);
                    }
                }
            }
            abstractC9904Gkk.A0E(abstractC9870GjI, strA0a);
            throw F60.createAndThrow();
        }
        return jsonDeserializerA0J;
    }

    public static final void A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9870GjI abstractC9870GjI, C9900Gkg c9900Gkg) {
        Object obj;
        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
        if (enumC9834GiYA1P != null) {
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            Class<?> cls = abstractC9870GjI == null ? null : abstractC9870GjI._class;
            if (cls == null && (obj = c9900Gkg._valueToUpdate) != null) {
                cls = obj.getClass();
            }
            MismatchedInputException mismatchedInputException = new MismatchedInputException(abstractC9916Gl7, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", enumC9834GiYA1P, AbstractC9855Gj3.A06(cls)));
            mismatchedInputException._targetType = cls;
            throw mismatchedInputException;
        }
    }
}
