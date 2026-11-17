package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.aura.R;
import com.facebook.aura.bloks.host.AuraBloksHost;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FBB implements InterfaceC10557Hsn {
    public final Context A00;
    public final SparseArray<Object> A01;
    public final FBD A02;
    public final boolean A05;
    public final Map<Integer, SparseArray<Object>> A03 = Collections.synchronizedMap(BV4.A0v(4));
    public final Map<Integer, Object> A04 = BV4.A0v(4);
    public volatile boolean A06 = false;

    public static Context A00(FBB fbb) {
        Context context = fbb.A00;
        C7384Etj.A0U(context);
        return context;
    }

    public static Object A01(FBB fbb, int i) {
        return fbb.A01.get(i);
    }

    public final Object A04(FBE fbe, FDW fdw, int i) {
        Integer numValueOf;
        Object objA0T;
        Object objARD;
        int i2 = fdw.A04;
        synchronized (this) {
            Map<Integer, Object> map = this.A04;
            numValueOf = Integer.valueOf(i2);
            objA0T = map.get(numValueOf);
            if (objA0T == null) {
                objA0T = C3cG.A0T();
                map.put(numValueOf, objA0T);
            }
        }
        synchronized (objA0T) {
            Map<Integer, SparseArray<Object>> map2 = this.A03;
            SparseArray<Object> sparseArray = map2.get(numValueOf);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>(2);
                map2.put(numValueOf, sparseArray);
            }
            objARD = sparseArray.get(i);
            if (objARD == null) {
                objARD = fbe.ARD(this, fdw);
            }
            sparseArray.put(i, objARD);
        }
        return objARD;
    }

    @Override // X.InterfaceC10557Hsn
    public final boolean AOJ() {
        return this.A05;
    }

    public FBB(Context context, SparseArray sparseArray, FBD fbd) {
        this.A00 = context;
        this.A02 = fbd;
        this.A05 = ((AuraBloksHost) fbd).mBloksConfig.calculateDarkMode(context);
        this.A01 = sparseArray;
    }

    public static String A02(FBB fbb) {
        return (String) fbb.A01.get(R.id.bk_context_key_logging_id);
    }

    public final <T> T A03(int i) {
        T t = (T) A01(this, i);
        if (t != null) {
            return t;
        }
        throw BV4.A0a(FGI.A0M("Null value associated with key: ", this.A00.getResources().getResourceEntryName(i)));
    }
}
