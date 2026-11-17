package X;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GmW implements InterfaceC10017Gnp, Serializable {
    public static final long serialVersionUID = 1;
    public transient List<C10009Gnh> A00;
    public final C10034GoA _metadata;

    public static Object A02(C9911Gku c9911Gku, Object obj) {
        Method method = c9911Gku.A02;
        return method == null ? c9911Gku.A01.get(obj) : method.invoke(obj, null);
    }

    @Override // X.InterfaceC10017Gnp
    public final C10034GoA AHh() {
        if (!(this instanceof C9936Glf)) {
            return this._metadata;
        }
        C9936Glf c9936Glf = (C9936Glf) this;
        C10034GoA c10034GoA = c9936Glf._metadata;
        AbstractC9915Gl5 abstractC9915Gl5 = c9936Glf._fallbackSetter;
        return abstractC9915Gl5 != null ? c10034GoA.A02(abstractC9915Gl5.AHh().A00) : c10034GoA;
    }

    public GmW(C10034GoA c10034GoA) {
        this._metadata = c10034GoA == null ? C10034GoA.A03 : c10034GoA;
    }

    @Override // X.InterfaceC10017Gnp
    public final C9894GkV ABX(AbstractC9901Gkh<?> abstractC9901Gkh, Class<?> cls) {
        AbstractC9970Gmj abstractC9970GmjAHe;
        C9894GkV c9894GkVA00 = abstractC9901Gkh.A00(cls);
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        C9894GkV c9894GkVA08 = (abstractC9910GksA02 == null || (abstractC9970GmjAHe = AHe()) == null) ? null : abstractC9910GksA02.A08(abstractC9970GmjAHe);
        return c9894GkVA00 == null ? c9894GkVA08 == null ? InterfaceC10017Gnp.A00 : c9894GkVA08 : c9894GkVA08 == null ? c9894GkVA00 : c9894GkVA00.A00(c9894GkVA08);
    }

    @Override // X.InterfaceC10017Gnp
    public final C10007Gnf ABY(AbstractC9901Gkh<?> abstractC9901Gkh, Class<?> cls) {
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        AbstractC9970Gmj abstractC9970GmjAHe = AHe();
        if (abstractC9970GmjAHe == null) {
            return abstractC9901Gkh.A01(cls);
        }
        C10007Gnf c10007GnfA00 = abstractC9901Gkh.A03(abstractC9970GmjAHe.A08())._includeAsProperty;
        C10007Gnf c10007GnfA01 = abstractC9901Gkh.A01(cls);
        if (c10007GnfA01 != null) {
            c10007GnfA00 = c10007GnfA01.A00(c10007GnfA00);
        }
        if (abstractC9910GksA02 == null) {
            return c10007GnfA00;
        }
        C10007Gnf c10007GnfA0A = abstractC9910GksA02.A0A(abstractC9970GmjAHe);
        return c10007GnfA00 == null ? c10007GnfA0A : c10007GnfA00.A00(c10007GnfA0A);
    }

    public GmW(GmW gmW) {
        this._metadata = gmW._metadata;
    }
}
