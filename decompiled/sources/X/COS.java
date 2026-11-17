package X;

import com.google.android.gms.internal.fido.zzho;

/* loaded from: classes5.dex */
public abstract class COS implements Comparable {
    public final int A01() {
        if (this instanceof CO2) {
            return 3;
        }
        if (this instanceof CO3) {
            return 5;
        }
        if (this instanceof COA) {
            return ((((COA) this).A00 >= 0 ? 0 : 32) >> 5) & 7;
        }
        if (this instanceof C4463Cwf) {
            return 2;
        }
        return this instanceof CO1 ? 7 : 4;
    }

    public final int A02() {
        if (this instanceof CO3) {
            return ((CO3) this).A00;
        }
        if (this instanceof C3453CNz) {
            return ((C3453CNz) this).A00;
        }
        return 0;
    }

    public static final COS A00(COS cos, Class cls) throws zzho {
        if (cls.isInstance(cos)) {
            return (COS) cls.cast(cos);
        }
        throw new zzho(FGI.A0d("Expected a ", cls.getName(), " value, but got ", C60Q.A0e(cos)));
    }
}
