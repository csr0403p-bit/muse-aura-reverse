package com.facebook.hyperthrift;

import X.BV7;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C8j3;
import X.FGI;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class HyperThriftBase {
    public static final Object A02 = C3cG.A0T();
    public String A00;
    public Object[] A01;

    public abstract class Builder {
        public final Object[] A00;

        public Builder(HyperThriftBase hyperThriftBase) {
            Object[] objArr = hyperThriftBase.A01;
            int length = objArr.length;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.A00 = objArr2;
        }

        public Builder() {
            this.A00 = new Object[7];
        }
    }

    public final <T> T A00(int i) {
        T t = (T) this.A01[i];
        if (t == A02 || t == null) {
            return null;
        }
        return t;
    }

    public final void A01() {
        Object[] objArr = this.A01;
        int length = objArr.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null && obj != A02) {
                if (i >= 0) {
                    throw new IllegalStateException(FGI.A0T("Multiple eligible values for union field: ", ", ", i, i2));
                }
                i = i2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HyperThriftBase) {
            HyperThriftBase hyperThriftBase = (HyperThriftBase) obj;
            if (this.A00.equals(hyperThriftBase.A00)) {
                return Arrays.deepEquals(this.A01, hyperThriftBase.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.A00.hashCode();
        for (Object obj : this.A01) {
            iHashCode = (iHashCode * 31) + C60R.A01(obj);
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        BV7.A1J(sbA0w, this.A00);
        int length = this.A01.length;
        for (int i = 0; i < length; i++) {
            Object obj = this.A01[i];
            if (obj != null) {
                if (i > 0) {
                    sbA0w.append(',');
                }
                sbA0w.append(i);
                sbA0w.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                sbA0w.append(obj == A02 ? HatchCcvLoggingKt.NO_POSTAL_FIELD : obj.toString());
            }
        }
        return C8j3.A15(sbA0w);
    }
}
