package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Gkk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9904Gkk extends AbstractC9849Git implements Serializable {
    public static final long serialVersionUID = 1;
    public transient AbstractC9916Gl7 A00;
    public transient C9993GnM A01;
    public transient DateFormat A02;
    public transient AbstractC9845Gin A03;
    public transient C9828GiO A04;
    public final C9902Gki _cache;
    public final C9898Gke _config;
    public C9829GiP<AbstractC9870GjI> _currentType;
    public final AbstractC10056God _factory;
    public final int _featureFlags;
    public final AbstractC10205GrR _injectableValues;
    public final C10037GoH<EnumC10051GoV> _readCapabilities;
    public final Class<?> _view;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer A0K(java.lang.Object r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L32
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.JsonDeserializer
            if (r0 != 0) goto L25
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L40
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Class<com.fasterxml.jackson.databind.JsonDeserializer$None> r0 = com.fasterxml.jackson.databind.JsonDeserializer.None.class
            if (r3 == r0) goto L32
            boolean r0 = X.AbstractC9855Gj3.A0I(r3)
            if (r0 != 0) goto L32
            java.lang.Class<com.fasterxml.jackson.databind.JsonDeserializer> r0 = com.fasterxml.jackson.databind.JsonDeserializer.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L33
            X.Gke r0 = r2._config
            java.lang.Object r3 = X.AbstractC7608F5v.A0h(r0, r3)
        L25:
            r1 = r3
            com.fasterxml.jackson.databind.JsonDeserializer r1 = (com.fasterxml.jackson.databind.JsonDeserializer) r1
            boolean r0 = r1 instanceof X.InterfaceC10183Gqt
            if (r0 == 0) goto L32
            r0 = r1
            X.Gqt r0 = (X.InterfaceC10183Gqt) r0
            r0.AbV(r2)
        L32:
            return r1
        L33:
            java.lang.String r2 = "AnnotationIntrospector returned Class "
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "; expected Class<JsonDeserializer>"
            java.lang.IllegalStateException r0 = X.BV5.A0V(r2, r1, r0)
            throw r0
        L40:
            java.lang.String r2 = "AnnotationIntrospector returned deserializer definition of type "
            java.lang.String r1 = X.C60Q.A0e(r3)
            java.lang.String r0 = "; expected type JsonDeserializer or Class<JsonDeserializer> instead"
            java.lang.IllegalStateException r0 = X.BV5.A0V(r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9904Gkk.A0K(java.lang.Object):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9877Gjl A0M(java.lang.Object r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L32
            boolean r0 = r3 instanceof X.AbstractC9877Gjl
            if (r0 != 0) goto L25
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L40
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Class<X.Gr7> r0 = X.AbstractC10190Gr7.class
            if (r3 == r0) goto L32
            boolean r0 = X.AbstractC9855Gj3.A0I(r3)
            if (r0 != 0) goto L32
            java.lang.Class<X.Gjl> r0 = X.AbstractC9877Gjl.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L33
            X.Gke r0 = r2._config
            java.lang.Object r3 = X.AbstractC7608F5v.A0h(r0, r3)
        L25:
            r1 = r3
            X.Gjl r1 = (X.AbstractC9877Gjl) r1
            boolean r0 = r1 instanceof X.InterfaceC10183Gqt
            if (r0 == 0) goto L32
            r0 = r1
            X.Gqt r0 = (X.InterfaceC10183Gqt) r0
            r0.AbV(r2)
        L32:
            return r1
        L33:
            java.lang.String r2 = "AnnotationIntrospector returned Class "
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "; expected Class<KeyDeserializer>"
            java.lang.IllegalStateException r0 = X.BV5.A0V(r2, r1, r0)
            throw r0
        L40:
            java.lang.String r2 = "AnnotationIntrospector returned key deserializer definition of type "
            java.lang.String r1 = X.C60Q.A0e(r3)
            java.lang.String r0 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            java.lang.IllegalStateException r0 = X.BV5.A0V(r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9904Gkk.A0M(java.lang.Object):X.Gjl");
    }

    public final void A0V(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9870GjI abstractC9870GjI) {
        A0U(abstractC9916Gl7, abstractC9916Gl7.A1N(), abstractC9870GjI, null, BV4.A1W());
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;LX/Gl7;)Ljava/lang/Object; */
    public final void A0X(AbstractC9916Gl7 abstractC9916Gl7, Class cls) {
        A0U(abstractC9916Gl7, abstractC9916Gl7.A1N(), cls == null ? null : AbstractC7608F5v.A0R(this._config, cls), null, BV4.A1W());
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>; */
    public final JsonDeserializer A0G(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI) {
        JsonDeserializer jsonDeserializerA02 = this._cache.A02(this, abstractC9870GjI, this._factory);
        return jsonDeserializerA02 != null ? A0I(interfaceC10017Gnp, abstractC9870GjI, jsonDeserializerA02) : jsonDeserializerA02;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gnp;LX/GjI;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /* JADX WARN: Multi-variable type inference failed */
    public final JsonDeserializer A0H(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer) {
        boolean z = jsonDeserializer instanceof InterfaceC9830GiT;
        JsonDeserializer jsonDeserializerA7e = jsonDeserializer;
        if (z) {
            this._currentType = new C9829GiP<>(this._currentType, abstractC9870GjI);
            try {
            } finally {
                this._currentType = this._currentType.A00;
            }
        }
        return jsonDeserializerA7e;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gnp;LX/GjI;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /* JADX WARN: Multi-variable type inference failed */
    public final JsonDeserializer A0I(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer) {
        boolean z = jsonDeserializer instanceof InterfaceC9830GiT;
        JsonDeserializer jsonDeserializerA7e = jsonDeserializer;
        if (z) {
            this._currentType = new C9829GiP<>(this._currentType, abstractC9870GjI);
            try {
            } finally {
                this._currentType = this._currentType.A00;
            }
        }
        return jsonDeserializerA7e;
    }

    public final JsonDeserializer<Object> A0J(AbstractC9870GjI abstractC9870GjI) {
        JsonDeserializer jsonDeserializerA02 = this._cache.A02(this, abstractC9870GjI, this._factory);
        if (jsonDeserializerA02 == null) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializerA0I = A0I(null, abstractC9870GjI, jsonDeserializerA02);
        AbstractC9852Giw abstractC9852GiwA0B = this._factory.A0B(this._config, abstractC9870GjI);
        return abstractC9852GiwA0B != null ? new TypeWrappedDeserializer(jsonDeserializerA0I, abstractC9852GiwA0B.A03(null)) : jsonDeserializerA0I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0215, code lost:
    
        r1 = X.C3cG.A0f(r3, "Unsuitable method (");
        r1.append(") decorated with @JsonCreator (for Enum type ");
        X.BV6.A18(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0229, code lost:
    
        throw X.C8j3.A0w(")", r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x03b3: INVOKE (r13v0 ?? I:X.Git), (r12 I:X.GjI), (r0 I:java.lang.String) VIRTUAL call: X.Git.A0E(X.GjI, java.lang.String):void A[MD:(X.GjI, java.lang.String):void throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException (m)] (LINE:947), block:B:238:0x03af */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x03b3: INVOKE (r13 I:X.Git), (r12 I:X.GjI), (r0 I:java.lang.String) VIRTUAL call: X.Git.A0E(X.GjI, java.lang.String):void A[MD:(X.GjI, java.lang.String):void throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException (m)] (LINE:947), block:B:238:0x03af */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132 A[Catch: IllegalArgumentException -> 0x03ae, TryCatch #0 {IllegalArgumentException -> 0x03ae, blocks: (B:2:0x0000, B:4:0x0015, B:5:0x0020, B:7:0x002a, B:9:0x0030, B:227:0x0388, B:229:0x038f, B:231:0x0399, B:232:0x03a2, B:233:0x03a3, B:235:0x03a7, B:11:0x0036, B:13:0x003d, B:14:0x0041, B:16:0x0047, B:18:0x0052, B:226:0x0382, B:77:0x00ba, B:102:0x0110, B:80:0x00c6, B:104:0x011b, B:105:0x0124, B:106:0x0128, B:107:0x012c, B:109:0x0132, B:111:0x0148, B:113:0x014e, B:116:0x0156, B:117:0x015a, B:119:0x0160, B:120:0x0164, B:122:0x016a, B:123:0x0173, B:124:0x0196, B:126:0x019a, B:130:0x01aa, B:131:0x01ae, B:132:0x01c6, B:134:0x01cc, B:136:0x01d8, B:138:0x01de, B:140:0x01e2, B:142:0x01e9, B:144:0x01f5, B:146:0x01fd, B:148:0x0203, B:149:0x020e, B:150:0x0215, B:151:0x0229, B:152:0x022a, B:153:0x0231, B:155:0x0243, B:156:0x0245, B:157:0x0249, B:159:0x024f, B:161:0x0260, B:218:0x034f, B:220:0x0353, B:173:0x0296, B:175:0x02a2, B:176:0x02a7, B:178:0x02ad, B:180:0x02c3, B:182:0x02cb, B:189:0x02e3, B:200:0x030b, B:201:0x030f, B:185:0x02d0, B:187:0x02dd, B:190:0x02e9, B:192:0x02f1, B:194:0x02f7, B:196:0x0300, B:204:0x0317, B:205:0x0325, B:207:0x032b, B:209:0x0335, B:211:0x0339, B:221:0x035c, B:222:0x036e, B:223:0x036f, B:215:0x0342, B:217:0x0348, B:224:0x0374, B:225:0x0381, B:203:0x0315, B:164:0x026a, B:165:0x0272, B:167:0x0278, B:169:0x0288), top: B:240:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0231 A[Catch: IllegalArgumentException -> 0x03ae, TryCatch #0 {IllegalArgumentException -> 0x03ae, blocks: (B:2:0x0000, B:4:0x0015, B:5:0x0020, B:7:0x002a, B:9:0x0030, B:227:0x0388, B:229:0x038f, B:231:0x0399, B:232:0x03a2, B:233:0x03a3, B:235:0x03a7, B:11:0x0036, B:13:0x003d, B:14:0x0041, B:16:0x0047, B:18:0x0052, B:226:0x0382, B:77:0x00ba, B:102:0x0110, B:80:0x00c6, B:104:0x011b, B:105:0x0124, B:106:0x0128, B:107:0x012c, B:109:0x0132, B:111:0x0148, B:113:0x014e, B:116:0x0156, B:117:0x015a, B:119:0x0160, B:120:0x0164, B:122:0x016a, B:123:0x0173, B:124:0x0196, B:126:0x019a, B:130:0x01aa, B:131:0x01ae, B:132:0x01c6, B:134:0x01cc, B:136:0x01d8, B:138:0x01de, B:140:0x01e2, B:142:0x01e9, B:144:0x01f5, B:146:0x01fd, B:148:0x0203, B:149:0x020e, B:150:0x0215, B:151:0x0229, B:152:0x022a, B:153:0x0231, B:155:0x0243, B:156:0x0245, B:157:0x0249, B:159:0x024f, B:161:0x0260, B:218:0x034f, B:220:0x0353, B:173:0x0296, B:175:0x02a2, B:176:0x02a7, B:178:0x02ad, B:180:0x02c3, B:182:0x02cb, B:189:0x02e3, B:200:0x030b, B:201:0x030f, B:185:0x02d0, B:187:0x02dd, B:190:0x02e9, B:192:0x02f1, B:194:0x02f7, B:196:0x0300, B:204:0x0317, B:205:0x0325, B:207:0x032b, B:209:0x0335, B:211:0x0339, B:221:0x035c, B:222:0x036e, B:223:0x036f, B:215:0x0342, B:217:0x0348, B:224:0x0374, B:225:0x0381, B:203:0x0315, B:164:0x026a, B:165:0x0272, B:167:0x0278, B:169:0x0288), top: B:240:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x030b A[Catch: IllegalArgumentException -> 0x03ae, TryCatch #0 {IllegalArgumentException -> 0x03ae, blocks: (B:2:0x0000, B:4:0x0015, B:5:0x0020, B:7:0x002a, B:9:0x0030, B:227:0x0388, B:229:0x038f, B:231:0x0399, B:232:0x03a2, B:233:0x03a3, B:235:0x03a7, B:11:0x0036, B:13:0x003d, B:14:0x0041, B:16:0x0047, B:18:0x0052, B:226:0x0382, B:77:0x00ba, B:102:0x0110, B:80:0x00c6, B:104:0x011b, B:105:0x0124, B:106:0x0128, B:107:0x012c, B:109:0x0132, B:111:0x0148, B:113:0x014e, B:116:0x0156, B:117:0x015a, B:119:0x0160, B:120:0x0164, B:122:0x016a, B:123:0x0173, B:124:0x0196, B:126:0x019a, B:130:0x01aa, B:131:0x01ae, B:132:0x01c6, B:134:0x01cc, B:136:0x01d8, B:138:0x01de, B:140:0x01e2, B:142:0x01e9, B:144:0x01f5, B:146:0x01fd, B:148:0x0203, B:149:0x020e, B:150:0x0215, B:151:0x0229, B:152:0x022a, B:153:0x0231, B:155:0x0243, B:156:0x0245, B:157:0x0249, B:159:0x024f, B:161:0x0260, B:218:0x034f, B:220:0x0353, B:173:0x0296, B:175:0x02a2, B:176:0x02a7, B:178:0x02ad, B:180:0x02c3, B:182:0x02cb, B:189:0x02e3, B:200:0x030b, B:201:0x030f, B:185:0x02d0, B:187:0x02dd, B:190:0x02e9, B:192:0x02f1, B:194:0x02f7, B:196:0x0300, B:204:0x0317, B:205:0x0325, B:207:0x032b, B:209:0x0335, B:211:0x0339, B:221:0x035c, B:222:0x036e, B:223:0x036f, B:215:0x0342, B:217:0x0348, B:224:0x0374, B:225:0x0381, B:203:0x0315, B:164:0x026a, B:165:0x0272, B:167:0x0278, B:169:0x0288), top: B:240:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0315 A[Catch: IllegalArgumentException -> 0x03ae, TryCatch #0 {IllegalArgumentException -> 0x03ae, blocks: (B:2:0x0000, B:4:0x0015, B:5:0x0020, B:7:0x002a, B:9:0x0030, B:227:0x0388, B:229:0x038f, B:231:0x0399, B:232:0x03a2, B:233:0x03a3, B:235:0x03a7, B:11:0x0036, B:13:0x003d, B:14:0x0041, B:16:0x0047, B:18:0x0052, B:226:0x0382, B:77:0x00ba, B:102:0x0110, B:80:0x00c6, B:104:0x011b, B:105:0x0124, B:106:0x0128, B:107:0x012c, B:109:0x0132, B:111:0x0148, B:113:0x014e, B:116:0x0156, B:117:0x015a, B:119:0x0160, B:120:0x0164, B:122:0x016a, B:123:0x0173, B:124:0x0196, B:126:0x019a, B:130:0x01aa, B:131:0x01ae, B:132:0x01c6, B:134:0x01cc, B:136:0x01d8, B:138:0x01de, B:140:0x01e2, B:142:0x01e9, B:144:0x01f5, B:146:0x01fd, B:148:0x0203, B:149:0x020e, B:150:0x0215, B:151:0x0229, B:152:0x022a, B:153:0x0231, B:155:0x0243, B:156:0x0245, B:157:0x0249, B:159:0x024f, B:161:0x0260, B:218:0x034f, B:220:0x0353, B:173:0x0296, B:175:0x02a2, B:176:0x02a7, B:178:0x02ad, B:180:0x02c3, B:182:0x02cb, B:189:0x02e3, B:200:0x030b, B:201:0x030f, B:185:0x02d0, B:187:0x02dd, B:190:0x02e9, B:192:0x02f1, B:194:0x02f7, B:196:0x0300, B:204:0x0317, B:205:0x0325, B:207:0x032b, B:209:0x0335, B:211:0x0339, B:221:0x035c, B:222:0x036e, B:223:0x036f, B:215:0x0342, B:217:0x0348, B:224:0x0374, B:225:0x0381, B:203:0x0315, B:164:0x026a, B:165:0x0272, B:167:0x0278, B:169:0x0288), top: B:240:0x0000 }] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9877Gjl A0L(X.AbstractC9870GjI r22) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9904Gkk.A0L(X.GjI):X.Gjl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (X.AbstractC7609F5w.A1U(X.EnumC9965Gmd.A02._mask, r2._deserFeatures) != false) goto L34;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/GnW;Ljava/lang/Class<*>;LX/Got;)LX/Got; */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC10072Got A0N(X.EnumC10072Got r6, X.EnumC10000GnW r7, java.lang.Class r8) {
        /*
            r5 = this;
            X.Gke r2 = r5._config
            X.Gol r5 = r2._coercionConfigs
            java.util.Map<java.lang.Class<?>, X.Gd9> r0 = r5._perClassCoercions
            if (r0 == 0) goto L6d
            if (r8 == 0) goto L6d
            java.lang.Object r0 = r0.get(r8)
            X.Gd8 r0 = (X.AbstractC9666Gd8) r0
            if (r0 == 0) goto L6d
            java.lang.Boolean r4 = r0._acceptBlankAsEmpty
            X.Got[] r1 = r0._coercionsByShape
            r0 = 9
            r1 = r1[r0]
        L1a:
            X.Gd9[] r3 = r5._perTypeCoercions
            if (r3 == 0) goto L34
            if (r7 == 0) goto L34
            int r0 = r7.ordinal()
            r0 = r3[r0]
            if (r0 == 0) goto L34
            if (r4 != 0) goto L2c
            java.lang.Boolean r4 = r0._acceptBlankAsEmpty
        L2c:
            if (r1 != 0) goto L34
            X.Got[] r1 = r0._coercionsByShape
            r0 = 9
            r1 = r1[r0]
        L34:
            if (r4 != 0) goto L3a
            X.Gd9 r0 = r5._defaultCoercions
            java.lang.Boolean r4 = r0._acceptBlankAsEmpty
        L3a:
            if (r1 != 0) goto L44
            X.Gd9 r0 = r5._defaultCoercions
            X.Got[] r1 = r0._coercionsByShape
            r0 = 9
            r1 = r1[r0]
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L70
            if (r1 != 0) goto L6c
            X.GnW r0 = X.EnumC10000GnW.Float
            if (r7 == r0) goto L6a
            X.GnW r0 = X.EnumC10000GnW.Integer
            if (r7 == r0) goto L6a
            X.GnW r0 = X.EnumC10000GnW.Boolean
            if (r7 == r0) goto L6a
            X.GnW r0 = X.EnumC10000GnW.DateTime
            if (r7 == r0) goto L6a
            X.Gmd r0 = X.EnumC9965Gmd.A02
            int r1 = r2._deserFeatures
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L70
        L6a:
            X.Got r1 = X.EnumC10072Got.AsNull
        L6c:
            return r1
        L6d:
            r4 = 0
            r1 = r4
            goto L1a
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9904Gkk.A0N(X.Got, X.GnW, java.lang.Class):X.Got");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (X.AbstractC7609F5w.A1U(r0._mask, r2._deserFeatures) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (X.AbstractC7609F5w.A1U(X.EnumC9965Gmd.A03._mask, r2._deserFeatures) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        if (r7 != X.C79.A0C) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC10072Got A0O(X.EnumC10000GnW r5, java.lang.Class r6, java.lang.Integer r7) {
        /*
            r4 = this;
            X.Gke r2 = r4._config
            X.Gol r3 = r2._coercionConfigs
            java.util.Map<java.lang.Class<?>, X.Gd9> r0 = r3._perClassCoercions
            if (r0 == 0) goto L1d
            if (r6 == 0) goto L1d
            java.lang.Object r0 = r0.get(r6)
            X.Gd8 r0 = (X.AbstractC9666Gd8) r0
            if (r0 == 0) goto L1d
            X.Got[] r1 = r0._coercionsByShape
            int r0 = r7.intValue()
            r0 = r1[r0]
            if (r0 == 0) goto L1d
        L1c:
            return r0
        L1d:
            X.Gd9[] r1 = r3._perTypeCoercions
            if (r1 == 0) goto L36
            if (r5 == 0) goto L36
            int r0 = r5.ordinal()
            r0 = r1[r0]
            if (r0 == 0) goto L36
            X.Got[] r1 = r0._coercionsByShape
            int r0 = r7.intValue()
            r0 = r1[r0]
            if (r0 == 0) goto L36
            return r0
        L36:
            X.Gd9 r0 = r3._defaultCoercions
            X.Got[] r0 = r0._coercionsByShape
            int r1 = r7.intValue()
            r0 = r0[r1]
            if (r0 != 0) goto L1c
            r0 = 7
            if (r1 == r0) goto L5e
            r0 = 3
            if (r1 == r0) goto L7a
            r0 = 2
            if (r1 != r0) goto L8d
            X.GnW r0 = X.EnumC10000GnW.Enum
            if (r5 != r0) goto L8d
            X.Gmd r0 = X.EnumC9965Gmd.A0C
            int r1 = r2._deserFeatures
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L8d
        L5b:
            X.Got r0 = X.EnumC10072Got.Fail
            return r0
        L5e:
            X.Gmd r0 = X.EnumC9965Gmd.A01
            goto L6d
        L61:
            java.lang.Integer r0 = X.C79.A0c
            if (r7 != r0) goto Lae
            X.GnW r0 = X.EnumC10000GnW.OtherScalar
            if (r5 == r0) goto L8a
            if (r1 != 0) goto L77
            X.Gmd r0 = X.EnumC9965Gmd.A02
        L6d:
            int r1 = r2._deserFeatures
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L5b
        L77:
            X.Got r0 = X.EnumC10072Got.AsNull
            return r0
        L7a:
            X.GnW r0 = X.EnumC10000GnW.Integer
            if (r5 != r0) goto L8d
            X.Gmd r0 = X.EnumC9965Gmd.A03
            int r1 = r2._deserFeatures
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L5b
        L8a:
            X.Got r0 = X.EnumC10072Got.TryConvert
            return r0
        L8d:
            X.GnW r4 = X.EnumC10000GnW.Float
            if (r5 == r4) goto L9e
            X.GnW r0 = X.EnumC10000GnW.Integer
            if (r5 == r0) goto L9e
            X.GnW r0 = X.EnumC10000GnW.Boolean
            if (r5 == r0) goto L9e
            X.GnW r0 = X.EnumC10000GnW.DateTime
            r1 = 0
            if (r5 != r0) goto L61
        L9e:
            r1 = 1
            X.GmA r0 = X.EnumC9951GmA.A04
            boolean r0 = r2.A09(r0)
            if (r0 != 0) goto L61
            if (r5 != r4) goto L5b
            java.lang.Integer r0 = X.C79.A0C
            if (r7 == r0) goto L61
            goto L5b
        Lae:
            X.Got r0 = r3._defaultAction
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9904Gkk.A0O(X.GnW, java.lang.Class, java.lang.Integer):X.Got");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;LX/Gir<*>;LX/Giv;)LX/Gme; */
    public final C9966Gme A0P(AbstractC9848Gir abstractC9848Gir, InterfaceC9851Giv interfaceC9851Giv, Object obj) {
        InterfaceC9851Giv next;
        AbstractC9920GlH abstractC9920GlH = (AbstractC9920GlH) this;
        if (obj == null) {
            return null;
        }
        Gp5 gp5 = (Gp5) abstractC9848Gir;
        HjP hjP = new HjP(gp5.getClass(), gp5._scope, obj);
        LinkedHashMap<HjP, C9966Gme> linkedHashMap = abstractC9920GlH.A00;
        if (linkedHashMap == null) {
            abstractC9920GlH.A00 = C3cG.A0j();
        } else {
            C9966Gme c9966Gme = linkedHashMap.get(hjP);
            if (c9966Gme != null) {
                return c9966Gme;
            }
        }
        List<InterfaceC9851Giv> list = abstractC9920GlH._objectIdResolvers;
        if (list == null) {
            abstractC9920GlH._objectIdResolvers = C60O.A11(8);
        } else {
            Iterator<InterfaceC9851Giv> it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (interfaceC9851Giv.getClass() == next.getClass()) {
                    break;
                }
            }
        }
        next = new C10160GqT();
        abstractC9920GlH._objectIdResolvers.add(next);
        C9966Gme c9966Gme2 = new C9966Gme(hjP);
        c9966Gme2.A00 = next;
        abstractC9920GlH.A00.put(hjP, c9966Gme2);
        return c9966Gme2;
    }

    public final JsonMappingException A0R(Class<?> cls, Throwable th) {
        String strA0A;
        if (th == null) {
            strA0A = "N/A";
        } else {
            strA0A = AbstractC9855Gj3.A0A(th);
            if (strA0A == null) {
                strA0A = AbstractC9855Gj3.A06(th.getClass());
            }
        }
        return new ValueInstantiationException(this.A00, cls == null ? null : AbstractC7608F5v.A0R(this._config, cls), String.format("Cannot construct instance of %s, problem: %s", AbstractC9855Gj3.A06(cls), strA0A), th);
    }

    public final C9828GiO A0S() {
        C9828GiO c9828GiO = this.A04;
        if (c9828GiO == null) {
            return new C9828GiO();
        }
        this.A04 = null;
        return c9828GiO;
    }

    public final Date A0T(String str) {
        try {
            DateFormat dateFormat = this.A02;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this._config._base._dateFormat.clone();
                this.A02 = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e) {
            throw BV5.A0T("Failed to parse Date value '%s': %s", new Object[]{str, AbstractC9855Gj3.A0A(e)});
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;Ljava/lang/Object;Ljava/lang/String;)Z */
    public final void A0W(AbstractC9916Gl7 abstractC9916Gl7, JsonDeserializer jsonDeserializer, Object obj, String str) throws UnrecognizedPropertyException {
        if (this._config._problemHandlers != null) {
            throw BV4.A0a("handleUnknownProperty");
        }
        if (!AbstractC7609F5w.A1U(EnumC9965Gmd.A0G._mask, this._featureFlags)) {
            abstractC9916Gl7.A1j();
            return;
        }
        Collection<Object> collectionA0n = jsonDeserializer.A0n();
        AbstractC9916Gl7 abstractC9916Gl72 = this.A00;
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        UnrecognizedPropertyException unrecognizedPropertyException = new UnrecognizedPropertyException(abstractC9916Gl72.A1I(), abstractC9916Gl72, cls, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", AbstractC7609F5w.A1b(cls, str)), str, collectionA0n);
        unrecognizedPropertyException.A06(obj, str);
        throw unrecognizedPropertyException;
    }

    public final void A0b(JsonDeserializer<?> jsonDeserializer) {
        if (this._config.A09(EnumC9951GmA.A0I)) {
            return;
        }
        Class<?> clsA0h = jsonDeserializer.A0h();
        AbstractC9870GjI abstractC9870GjIA0R = clsA0h == null ? null : AbstractC7608F5v.A0R(this._config, clsA0h);
        throw new InvalidDefinitionException(this.A00, abstractC9870GjIA0R, String.format("Invalid configuration: values of type %s cannot be merged", AbstractC9855Gj3.A04(abstractC9870GjIA0R)));
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/Gl4;Ljava/lang/String;[Ljava/lang/Object;)TT; */
    public final void A0g(C9914Gl4 c9914Gl4, String str, Object... objArr) throws InvalidDefinitionException {
        throw new InvalidDefinitionException(this.A00, c9914Gl4, (AbstractC9958GmS) null, String.format("Invalid type definition for type %s: %s", AbstractC9855Gj3.A06(c9914Gl4.A05._class), AbstractC9849Git.A05(str, str, objArr)));
    }

    public final void A0h(C9828GiO c9828GiO) {
        C9828GiO c9828GiO2 = this.A04;
        if (c9828GiO2 != null) {
            Object[] objArr = c9828GiO.A02;
            int length = objArr == null ? 0 : objArr.length;
            Object[] objArr2 = c9828GiO2.A02;
            if (objArr2 != null && length < objArr2.length) {
                return;
            }
        }
        this.A04 = c9828GiO;
    }

    public final void A0l(Object obj) {
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        A0F(String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj), obj == null ? null : obj.getClass());
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object; */
    public final void A0m(Throwable th, Class cls) throws Throwable {
        if (this._config._problemHandlers != null) {
            throw BV4.A0a("handleInstantiationProblem");
        }
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        if (th instanceof IOException) {
            throw th;
        }
        EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0R;
        if (!AbstractC7609F5w.A1U(enumC9965Gmd._mask, this._featureFlags)) {
            AbstractC9855Gj3.A0F(th);
        }
        throw A0R(cls, th);
    }

    public AbstractC9904Gkk(AbstractC9904Gkk abstractC9904Gkk, AbstractC10056God abstractC10056God) {
        this._cache = abstractC9904Gkk._cache;
        this._factory = abstractC10056God;
        this._config = abstractC9904Gkk._config;
        this._featureFlags = abstractC9904Gkk._featureFlags;
        this._readCapabilities = abstractC9904Gkk._readCapabilities;
        this._view = abstractC9904Gkk._view;
        this.A00 = abstractC9904Gkk.A00;
        this._injectableValues = null;
        this.A03 = abstractC9904Gkk.A03;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Class<*>;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonMappingException; */
    public final InvalidFormatException A0Q(Class cls, String str, String str2) {
        return new InvalidFormatException(this.A00, cls, str, String.format("Cannot deserialize value of type %s from String %s: %s", AbstractC9855Gj3.A06(cls), A0D(str), str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0U(X.AbstractC9916Gl7 r3, X.EnumC9834GiY r4, X.AbstractC9870GjI r5, java.lang.String r6, java.lang.Object... r7) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r2 = this;
            java.lang.String r1 = X.AbstractC9849Git.A05(r6, r6, r7)
            X.Gke r0 = r2._config
            X.GiP r0 = r0._problemHandlers
            if (r0 == 0) goto L11
            java.lang.String r0 = "handleUnexpectedToken"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L11:
            if (r1 != 0) goto L39
            java.lang.String r1 = X.AbstractC9855Gj3.A04(r5)
            if (r4 != 0) goto L2a
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Unexpected end-of-input when trying read value of type %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
        L23:
            X.Gl7 r0 = r2.A00
            com.fasterxml.jackson.databind.exc.MismatchedInputException r0 = com.fasterxml.jackson.databind.exc.MismatchedInputException.A00(r0, r5, r1)
            throw r0
        L2a:
            java.lang.String r0 = X.EnumC9834GiY.A00(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r4}
            java.lang.String r0 = "Cannot deserialize value of type %s from %s (token `JsonToken.%s`)"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            goto L3b
        L39:
            if (r4 == 0) goto L23
        L3b:
            boolean r0 = r4._isScalar
            if (r0 == 0) goto L23
            r3.A1c()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9904Gkk.A0U(X.Gl7, X.GiY, X.GjI, java.lang.String, java.lang.Object[]):void");
    }

    public final void A0Y(EnumC9834GiY enumC9834GiY, AbstractC9870GjI abstractC9870GjI, String str, Object... objArr) throws MismatchedInputException {
        String strA05 = AbstractC9849Git.A05(str, str, objArr);
        AbstractC9916Gl7 abstractC9916Gl7 = this.A00;
        String strA0U = String.format("Unexpected token (%s), expected %s", abstractC9916Gl7.A1N(), enumC9834GiY);
        if (strA05 != null) {
            strA0U = FGI.A0U(strA0U, ": ", strA05);
        }
        throw MismatchedInputException.A00(abstractC9916Gl7, abstractC9870GjI, strA0U);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/GiY;Ljava/lang/String;[Ljava/lang/Object;)V */
    public final void A0Z(EnumC9834GiY enumC9834GiY, JsonDeserializer jsonDeserializer, String str, Object... objArr) {
        String strA05 = AbstractC9849Git.A05(str, str, objArr);
        AbstractC9916Gl7 abstractC9916Gl7 = this.A00;
        Class<?> clsA0h = jsonDeserializer.A0h();
        String strA0U = String.format("Unexpected token (%s), expected %s", abstractC9916Gl7.A1N(), enumC9834GiY);
        if (strA05 != null) {
            strA0U = FGI.A0U(strA0U, ": ", strA05);
        }
        MismatchedInputException mismatchedInputException = new MismatchedInputException(abstractC9916Gl7, strA0U);
        mismatchedInputException._targetType = clsA0h;
        throw mismatchedInputException;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/Gnp;Ljava/lang/String;[Ljava/lang/Object;)TT; */
    public final void A0a(InterfaceC10017Gnp interfaceC10017Gnp, String str, Object... objArr) {
        AbstractC9970Gmj abstractC9970GmjAHe;
        MismatchedInputException mismatchedInputExceptionA00 = MismatchedInputException.A00(this.A00, interfaceC10017Gnp == null ? null : interfaceC10017Gnp.AM9(), AbstractC9849Git.A05(str, str, objArr));
        if (interfaceC10017Gnp == null || (abstractC9970GmjAHe = interfaceC10017Gnp.AHe()) == null) {
            throw mismatchedInputExceptionA00;
        }
        mismatchedInputExceptionA00.A06(abstractC9970GmjAHe.A0C(), interfaceC10017Gnp.getName());
        throw mismatchedInputExceptionA00;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;Ljava/lang/String;[Ljava/lang/Object;)TT; */
    public final void A0c(JsonDeserializer jsonDeserializer, String str, Object... objArr) {
        String strA05 = AbstractC9849Git.A05(str, str, objArr);
        AbstractC9916Gl7 abstractC9916Gl7 = this.A00;
        Class<?> clsA0h = jsonDeserializer.A0h();
        MismatchedInputException mismatchedInputException = new MismatchedInputException(abstractC9916Gl7, strA05);
        mismatchedInputException._targetType = clsA0h;
        throw mismatchedInputException;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;LX/Glx;LX/Gl7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object; */
    public final void A0d(AbstractC9944Glx abstractC9944Glx, Class cls, String str, Object... objArr) {
        Object[] objArr2;
        String str2;
        String strA05 = AbstractC9849Git.A05(str, str, objArr);
        if (this._config._problemHandlers != null) {
            throw BV4.A0a("handleMissingInstantiator");
        }
        if (abstractC9944Glx == null) {
            objArr2 = new Object[]{AbstractC9855Gj3.A06(cls), strA05};
            str2 = "Cannot construct instance of %s: %s";
        } else {
            boolean zA0B = abstractC9944Glx.A0B();
            objArr2 = new Object[]{AbstractC9855Gj3.A06(cls), strA05};
            if (zA0B) {
                throw AbstractC9849Git.A04(this, cls, "Cannot construct instance of %s (although at least one Creator exists): %s", objArr2);
            }
            str2 = "Cannot construct instance of %s (no Creators, like default constructor, exist): %s";
        }
        A0F(String.format(str2, objArr2), cls);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/GoB;Ljava/lang/Object;)TT; */
    public final void A0e(C10035GoB c10035GoB, Object obj) {
        A0a(c10035GoB.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", AbstractC9855Gj3.A07(obj), c10035GoB.propertyName), new Object[0]);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/Gl4;LX/GmS;Ljava/lang/String;[Ljava/lang/Object;)TT; */
    public final void A0f(C9914Gl4 c9914Gl4, AbstractC9958GmS abstractC9958GmS, String str, Object... objArr) throws InvalidDefinitionException {
        String strA05 = AbstractC9849Git.A05(str, str, objArr);
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        throw new InvalidDefinitionException(this.A00, c9914Gl4, abstractC9958GmS, String.format("Invalid definition for property %s (of type %s): %s", AbstractC9855Gj3.A09(abstractC9958GmS.A0J()), AbstractC9855Gj3.A06(c9914Gl4.A05._class), strA05));
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/Number;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object; */
    public final void A0i(Class cls, Number number, String str, Object... objArr) throws InvalidFormatException {
        String strA05 = AbstractC9849Git.A05(str, str, objArr);
        if (this._config._problemHandlers == null) {
            throw new InvalidFormatException(this.A00, cls, number, String.format("Cannot deserialize value of type %s from number %s: %s", AbstractC9855Gj3.A06(cls), String.valueOf(number), strA05));
        }
        throw BV4.A0a("handleWeirdNumberValue");
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object; */
    public final void A0j(Class cls, String str, String str2, Object... objArr) throws InvalidFormatException {
        String strA05 = AbstractC9849Git.A05(str2, str2, objArr);
        if (this._config._problemHandlers == null) {
            throw new InvalidFormatException(this.A00, cls, str, String.format("Cannot deserialize Map key of type %s from String %s: %s", AbstractC9855Gj3.A06(cls), A0D(str), strA05));
        }
        throw BV4.A0a("handleWeirdKey");
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object; */
    public final void A0k(Class cls, String str, String str2, Object... objArr) {
        String strA05 = AbstractC9849Git.A05(str2, str2, objArr);
        if (this._config._problemHandlers == null) {
            throw A0Q(cls, str, strA05);
        }
        throw BV4.A0a("handleWeirdStringValue");
    }

    public AbstractC9904Gkk(AbstractC9916Gl7 abstractC9916Gl7, C9898Gke c9898Gke, AbstractC9904Gkk abstractC9904Gkk) {
        this._cache = abstractC9904Gkk._cache;
        this._factory = abstractC9904Gkk._factory;
        this._readCapabilities = abstractC9916Gl7.A1S();
        this._config = c9898Gke;
        this._featureFlags = c9898Gke._deserFeatures;
        this._view = c9898Gke._view;
        this.A00 = abstractC9916Gl7;
        this._injectableValues = null;
        this.A03 = c9898Gke._attributes;
    }

    public AbstractC9904Gkk(C9902Gki c9902Gki, AbstractC10056God abstractC10056God) {
        this._factory = abstractC10056God;
        this._cache = c9902Gki;
        this._featureFlags = 0;
        this._readCapabilities = null;
        this._config = null;
        this._injectableValues = null;
        this._view = null;
        this.A03 = null;
    }

    public AbstractC9904Gkk(C9898Gke c9898Gke, AbstractC9904Gkk abstractC9904Gkk) {
        this._cache = abstractC9904Gkk._cache;
        this._factory = abstractC9904Gkk._factory;
        this._readCapabilities = null;
        this._config = c9898Gke;
        this._featureFlags = c9898Gke._deserFeatures;
        this._view = null;
        this.A00 = null;
        this._injectableValues = null;
        this.A03 = null;
    }
}
