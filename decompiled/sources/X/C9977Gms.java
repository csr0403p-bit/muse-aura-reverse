package X;

import java.io.Serializable;

/* renamed from: X.Gms, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9977Gms implements InterfaceC10017Gnp, Serializable {
    public static final long serialVersionUID = 1;
    public final AbstractC9970Gmj _member;
    public final C10034GoA _metadata;
    public final C10009Gnh _name;
    public final AbstractC9870GjI _type;
    public final C10009Gnh _wrapperName = null;

    public C9977Gms(AbstractC9870GjI abstractC9870GjI, C10034GoA c10034GoA, C10009Gnh c10009Gnh, AbstractC9970Gmj abstractC9970Gmj) {
        this._name = c10009Gnh;
        this._type = abstractC9870GjI;
        this._metadata = c10034GoA;
        this._member = abstractC9970Gmj;
    }

    @Override // X.InterfaceC10017Gnp
    public final C10007Gnf ABY(AbstractC9901Gkh<?> abstractC9901Gkh, Class<?> cls) {
        AbstractC9970Gmj abstractC9970Gmj;
        C10007Gnf c10007GnfA00 = abstractC9901Gkh.A03(this._type._class)._includeAsProperty;
        C10007Gnf c10007GnfA01 = abstractC9901Gkh.A01(cls);
        if (c10007GnfA01 != null) {
            c10007GnfA00 = c10007GnfA01.A00(c10007GnfA00);
        }
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        return (abstractC9910GksA02 == null || (abstractC9970Gmj = this._member) == null) ? c10007GnfA00 : c10007GnfA00.A00(abstractC9910GksA02.A0A(abstractC9970Gmj));
    }

    @Override // X.InterfaceC10017Gnp
    public final C10009Gnh AFv() {
        return this._name;
    }

    @Override // X.InterfaceC10017Gnp
    public final AbstractC9970Gmj AHe() {
        return this._member;
    }

    @Override // X.InterfaceC10017Gnp
    public final C10034GoA AHh() {
        return this._metadata;
    }

    @Override // X.InterfaceC10017Gnp
    public final AbstractC9870GjI AM9() {
        return this._type;
    }

    @Override // X.InterfaceC10017Gnp
    public final String getName() {
        return this._name._simpleName;
    }

    @Override // X.InterfaceC10017Gnp
    public final C9894GkV ABX(AbstractC9901Gkh<?> abstractC9901Gkh, Class<?> cls) {
        AbstractC9970Gmj abstractC9970Gmj;
        C9894GkV c9894GkVA08;
        C9894GkV c9894GkVA00 = abstractC9901Gkh.A00(cls);
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        return (abstractC9910GksA02 == null || (abstractC9970Gmj = this._member) == null || (c9894GkVA08 = abstractC9910GksA02.A08(abstractC9970Gmj)) == null) ? c9894GkVA00 : c9894GkVA00.A00(c9894GkVA08);
    }
}
