package X;

import java.io.Serializable;

/* renamed from: X.GiH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9823GiH implements Serializable {
    public static final long serialVersionUID = 1;
    public final int _enabledFor1;
    public final int _enabledFor2;
    public final int _explicitFor1 = 0;
    public final int _explicitFor2 = 0;

    public C9823GiH(int i, int i2) {
        this._enabledFor1 = i;
        this._enabledFor2 = i2;
    }

    public final boolean A00(InterfaceC9826GiK interfaceC9826GiK) {
        int i;
        int iABI = interfaceC9826GiK.ABI();
        if (iABI == 0) {
            i = this._enabledFor1;
        } else {
            if (iABI != 1) {
                throw BV4.A0c("Internal error: this code path should never get executed");
            }
            i = this._enabledFor2;
        }
        return interfaceC9826GiK.AA3(i);
    }
}
