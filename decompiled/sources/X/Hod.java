package X;

import X.Hod;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class Hod<T extends Hod<T>> {
    public final Hi0 mDataFetchProps;

    public abstract Hi0 build();

    public abstract T getThis();

    public static void checkArgs(int i, BitSet bitSet, String[] strArr) {
        if (bitSet != null) {
            if (bitSet.nextClearBit(0) < i) {
                ArrayList arrayListA0h = C3cG.A0h();
                for (int i2 = 0; i2 < i; i2++) {
                    if (!bitSet.get(i2)) {
                        arrayListA0h.add(strArr[i2]);
                    }
                }
                throw BV5.A0U("The following props are not marked as optional and were not supplied: ", Arrays.toString(arrayListA0h.toArray()));
            }
        }
    }

    public T customInfo(String str, Object obj) {
        Hi0 hi0 = this.mDataFetchProps;
        if (hi0 == null) {
            throw C3cG.A0Q("DataFetchProps shouldn't be null, this is an error on the code generation");
        }
        Map mapA0u = hi0.mCustomInfo;
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
            hi0.mCustomInfo = mapA0u;
        } else if (mapA0u.containsKey(str)) {
            throw C3cG.A0Q("key is already used");
        }
        mapA0u.put(str, obj);
        return this;
    }

    public Hod(Context context, Hi0 hi0) {
        this.mDataFetchProps = hi0;
        hi0.mContext = context.getApplicationContext();
    }
}
