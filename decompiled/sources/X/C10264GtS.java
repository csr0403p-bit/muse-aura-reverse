package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;

/* renamed from: X.GtS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10264GtS {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C10264GtS c10264GtS = (C10264GtS) obj;
                if (this.A02 != c10264GtS.A02 || this.A01 != c10264GtS.A01 || this.A00 != c10264GtS.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(Integer.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00));
    }

    @Deprecated
    public C10264GtS(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final String toString() {
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        sbA0t.append(this.A01);
        sbA0t.append(',');
        sbA0t.append(this.A00);
        sbA0t.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        sbA0t.append(this.A02);
        return Gt5.A01(sbA0t);
    }
}
