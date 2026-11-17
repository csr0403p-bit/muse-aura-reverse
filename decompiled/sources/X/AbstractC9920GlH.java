package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.GlH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9920GlH extends AbstractC9904Gkk implements Serializable {
    public static final long serialVersionUID = 1;
    public transient LinkedHashMap<HjP, C9966Gme> A00;
    public List<InterfaceC9851Giv> _objectIdResolvers;

    public final Object A0n(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9870GjI abstractC9870GjI, JsonDeserializer<Object> jsonDeserializer, Object obj) throws MismatchedInputException {
        boolean zA1U;
        Object[] objArr;
        String str;
        C9898Gke c9898Gke = this._config;
        C10009Gnh c10009GnhA00 = c9898Gke._rootName;
        if (c10009GnhA00 != null) {
            zA1U = !c10009GnhA00.A02();
        } else {
            zA1U = AbstractC7609F5w.A1U(EnumC9965Gmd.A0L._mask, c9898Gke._deserFeatures);
        }
        if (!zA1U) {
            return obj == null ? jsonDeserializer.A0i(abstractC9916Gl7, this) : jsonDeserializer.A0l(abstractC9916Gl7, this, obj);
        }
        if (c10009GnhA00 == null) {
            c10009GnhA00 = c9898Gke._rootNames.A00(c9898Gke, abstractC9870GjI._class);
        }
        String str2 = c10009GnhA00._simpleName;
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        EnumC9834GiY enumC9834GiY = EnumC9834GiY.START_OBJECT;
        if (enumC9834GiYA1N != enumC9834GiY) {
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            objArr = new Object[]{AbstractC7609F5w.A0s(str2), enumC9834GiYA1N};
            str = "Current token not START_OBJECT (needed to unwrap root name %s), but %s";
        } else {
            EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
            enumC9834GiY = EnumC9834GiY.FIELD_NAME;
            if (enumC9834GiYA1P != enumC9834GiY) {
                C10104GpS[] c10104GpSArr2 = AbstractC9855Gj3.A01;
                objArr = new Object[]{AbstractC7609F5w.A0s(str2), abstractC9916Gl7.A1N()};
                str = "Current token not FIELD_NAME (to contain expected root name %s), but %s";
            } else {
                String strA1a = abstractC9916Gl7.A1a();
                if (!str2.equals(strA1a)) {
                    Object[] objArr2 = {AbstractC7609F5w.A0s(strA1a), AbstractC9855Gj3.A09(str2), AbstractC9855Gj3.A04(abstractC9870GjI)};
                    Class<?> cls = abstractC9870GjI._class;
                    MismatchedInputException mismatchedInputExceptionA04 = AbstractC9849Git.A04(this, cls, "Root name (%s) does not match expected (%s) for type %s", objArr2);
                    if (strA1a == null) {
                        throw mismatchedInputExceptionA04;
                    }
                    mismatchedInputExceptionA04.A06(cls, strA1a);
                    throw mismatchedInputExceptionA04;
                }
                abstractC9916Gl7.A1P();
                Object objA0i = obj == null ? jsonDeserializer.A0i(abstractC9916Gl7, this) : jsonDeserializer.A0l(abstractC9916Gl7, this, obj);
                EnumC9834GiY enumC9834GiYA1P2 = abstractC9916Gl7.A1P();
                enumC9834GiY = EnumC9834GiY.END_OBJECT;
                if (enumC9834GiYA1P2 == enumC9834GiY) {
                    return objA0i;
                }
                objArr = new Object[]{AbstractC9855Gj3.A09(str2), abstractC9916Gl7.A1N()};
                str = "Current token not END_OBJECT (to match wrapper object with root name %s), but %s";
            }
        }
        A0Y(enumC9834GiY, abstractC9870GjI, str, objArr);
        throw F60.createAndThrow();
    }
}
