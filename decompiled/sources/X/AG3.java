package X;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class AG3 {
    public static final Class<? extends Object>[] A00 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean A00(Object obj) {
        if (obj instanceof AG4) {
            AG4 ag4 = (AG4) obj;
            ATF atfAIq = ag4.AIq();
            if (atfAIq != AGG.A00 && atfAIq != AGE.A00 && atfAIq != AG5.A00) {
                return false;
            }
            T value = ag4.getValue();
            if (value != 0) {
                return A00(value);
            }
        } else {
            if ((obj instanceof Ht9) && (obj instanceof Serializable)) {
                return false;
            }
            Class<? extends Object>[] clsArr = A00;
            int i = 0;
            while (!clsArr[i].isInstance(obj)) {
                i++;
                if (i >= 7) {
                    return false;
                }
            }
        }
        return true;
    }
}
