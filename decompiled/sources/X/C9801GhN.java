package X;

import com.fasterxml.jackson.databind.exc.InvalidNullException;
import java.io.Serializable;

/* renamed from: X.GhN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9801GhN implements InterfaceC10165Gqa, Serializable {
    public static final long serialVersionUID = 1;
    public final C10009Gnh _name;
    public final AbstractC9870GjI _type;

    @Override // X.InterfaceC10165Gqa
    public final Object AIA(AbstractC9904Gkk abstractC9904Gkk) throws InvalidNullException {
        C10009Gnh c10009Gnh = this._name;
        AbstractC9870GjI abstractC9870GjI = this._type;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        InvalidNullException invalidNullException = new InvalidNullException(abstractC9904Gkk, c10009Gnh, String.format("Invalid `null` value encountered for property %s", c10009Gnh != null ? String.format("\"%s\"", c10009Gnh) : "<UNKNOWN>"));
        if (abstractC9870GjI == null) {
            throw invalidNullException;
        }
        invalidNullException._targetType = abstractC9870GjI._class;
        throw invalidNullException;
    }

    public C9801GhN(AbstractC9870GjI abstractC9870GjI, C10009Gnh c10009Gnh) {
        this._name = c10009Gnh;
        this._type = abstractC9870GjI;
    }

    @Override // X.InterfaceC10165Gqa
    public final /* synthetic */ Object ACA(AbstractC9904Gkk abstractC9904Gkk) throws InvalidNullException {
        AIA(abstractC9904Gkk);
        throw F60.createAndThrow();
    }
}
