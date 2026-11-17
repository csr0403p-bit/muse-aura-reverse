package X;

import com.facebook.common.json.ArrayListDeserializer;
import com.facebook.common.json.ImmutableListDeserializer;
import com.facebook.common.json.ImmutableMapDeserializer;
import com.facebook.common.json.LinkedHashMapDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GhE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9796GhE extends C9899Gkf {
    public static C9796GhE A01 = null;
    public static final C9935Gle A02 = new C10022Gnv();
    public static final long serialVersionUID = 1;
    public final transient C9785Ggn A00;
    public boolean mHumanReadableFormatEnabled;

    public C9796GhE(C9785Ggn c9785Ggn, C9924GlL c9924GlL) {
        super(c9924GlL);
        this.A00 = c9785Ggn;
        A07(new C9797GhF());
        EnumC9856Gj4 enumC9856Gj4 = EnumC9856Gj4.NONE;
        C10045GoP c10045GoP = this._configOverrides;
        c10045GoP._visibilityChecker = new C10044GoO(enumC9856Gj4);
        EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0G;
        C9898Gke c9898Gke = this._deserializationConfig;
        int i = c9898Gke._deserFeatures;
        int i2 = i & (enumC9965Gmd._mask ^ (-1));
        if (i2 != i) {
            c9898Gke = new C9898Gke(c9898Gke, i2, c9898Gke._parserFeatures, c9898Gke._parserFeaturesToChange, c9898Gke._formatReadFeatures, c9898Gke._formatReadFeaturesToChange, c9898Gke._mapperFeatures);
        }
        this._deserializationConfig = c9898Gke;
        EnumC10065Gom enumC10065Gom = EnumC10065Gom.NON_NULL;
        c10045GoP._defaultInclusion = new C10007Gnf(enumC10065Gom, enumC10065Gom, null, null);
        this.mHumanReadableFormatEnabled = false;
    }

    @Override // X.C9899Gkf
    public final JsonDeserializer<Object> A04(AbstractC9904Gkk abstractC9904Gkk, AbstractC9870GjI abstractC9870GjI) {
        return A09(abstractC9904Gkk, abstractC9870GjI);
    }

    @Override // X.C9899Gkf
    public final Object A06(AbstractC9916Gl7 abstractC9916Gl7, C9898Gke c9898Gke, AbstractC9870GjI abstractC9870GjI) {
        if (abstractC9916Gl7.A1Q() == null) {
            abstractC9916Gl7.A1m(this);
        }
        return super.A06(abstractC9916Gl7, c9898Gke, abstractC9870GjI);
    }

    public final <T> JsonDeserializer<T> A09(AbstractC9904Gkk abstractC9904Gkk, AbstractC9870GjI abstractC9870GjI) {
        JsonDeserializer<T> jsonDeserializerA00;
        Class<?> cls;
        JsonDeserializer<T> jsonDeserializerA002;
        if (!abstractC9870GjI.A0N() && (jsonDeserializerA002 = AbstractC9780GgR.A00(abstractC9870GjI._class)) != null) {
            return jsonDeserializerA002;
        }
        Class<?> cls2 = abstractC9870GjI._class;
        if (cls2 == List.class || cls2 == ArrayList.class) {
            return new ArrayListDeserializer(abstractC9870GjI);
        }
        if (cls2 == ImmutableList.class) {
            return new ImmutableListDeserializer(abstractC9870GjI);
        }
        AbstractC9870GjI abstractC9870GjIA0B = abstractC9870GjI.A0B(0);
        if (abstractC9870GjIA0B != null && ((cls = abstractC9870GjIA0B._class) == String.class || Enum.class.isAssignableFrom(cls))) {
            if (cls2 == Map.class || cls2 == HashMap.class || cls2 == LinkedHashMap.class) {
                return new LinkedHashMapDeserializer(abstractC9870GjI);
            }
            if (cls2 == ImmutableMap.class) {
                return new ImmutableMapDeserializer(abstractC9870GjI);
            }
        }
        try {
            jsonDeserializerA00 = (JsonDeserializer<T>) super.A04(abstractC9904Gkk, abstractC9870GjI);
        } catch (NoClassDefFoundError unused) {
            Class<?> cls3 = abstractC9870GjI._class;
            jsonDeserializerA00 = AbstractC9812Ghn.A00(null, cls3, cls3.getName());
        }
        if (this.A00 != null) {
            String string = abstractC9870GjI.toString();
            String str = jsonDeserializerA00;
            if (jsonDeserializerA00 == null) {
                str = "<unknown>";
            }
            CFK.A01(str, "deserialize", string, "JACKSON_FALLBACK", "Using %s to %s %s");
        }
        return jsonDeserializerA00;
    }

    public final <T> JsonDeserializer<T> A0A(AbstractC9904Gkk abstractC9904Gkk, Class<T> cls) {
        JsonDeserializer<T> jsonDeserializerA00 = AbstractC9780GgR.A00(cls);
        if (jsonDeserializerA00 != null) {
            return jsonDeserializerA00;
        }
        JsonDeserializer<T> jsonDeserializer = (JsonDeserializer<T>) super.A04(abstractC9904Gkk, this._typeFactory.A09(cls));
        if (this.A00 != null) {
            String string = cls.toString();
            Object obj = jsonDeserializer;
            if (jsonDeserializer == null) {
                obj = "<unknown>";
            }
            CFK.A01(obj, "deserialize", string, "JACKSON_FALLBACK", "Using %s to %s %s");
        }
        return jsonDeserializer;
    }
}
