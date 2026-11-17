package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.aura.R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FBA {
    public static final FBE A00 = new C7852FHo();

    public static FCO A04(FBB fbb) {
        FCO fco;
        return (fbb == null || (fco = (FCO) FBB.A01(fbb, R.id.bk_context_key_signals_config)) == null) ? FBI.A00 : fco;
    }

    public static boolean A0A(FBB fbb) {
        if (fbb == null) {
            return false;
        }
        return Boolean.TRUE.equals(FBB.A01(fbb, R.id.bk_context_key_is_signals_enabled));
    }

    public static FKF A00(FBB fbb, String str) {
        return (FKF) ((AbstractMap) fbb.A03(R.id.bk_context_key_videos)).get(str);
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/FBD;LX/F9b;Landroid/util/SparseArray<Ljava/lang/Object;>;Ljava/lang/String;)LX/FBB; */
    public static FBB A01(Context context, SparseArray sparseArray, F9b f9b, FBD fbd, String str) {
        SparseArray<Object> sparseArrayClone = fbd.createObjectSet().clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArrayClone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        sparseArrayClone.put(R.id.bk_context_key_states, BV4.A0u());
        sparseArrayClone.put(R.id.bk_context_key_tree, f9b);
        sparseArrayClone.put(R.id.bk_context_key_scoped_client_id_mapper, new C7690FAj());
        sparseArrayClone.put(R.id.bk_context_key_animations, BV4.A0u());
        sparseArrayClone.put(R.id.bk_context_key_timers, BV4.A0u());
        sparseArrayClone.put(R.id.bk_context_key_videos, BV4.A0u());
        sparseArrayClone.put(R.id.bk_context_key_cleanup_callbacks, C60O.A13());
        sparseArrayClone.put(R.id.bk_context_key_logging_id, str);
        if (sparseArrayClone.get(R.id.bk_context_key_performance_logger) == null) {
            sparseArrayClone.put(R.id.bk_context_key_performance_logger, HsW.A00);
        }
        sparseArrayClone.put(R.id.bk_context_key_controller_by_server_id, BV5.A14());
        sparseArrayClone.put(R.id.bk_context_key_insets_listener_delegate, new FOu());
        FBB fbb = new FBB(context, sparseArrayClone, fbd);
        if (A0A(fbb)) {
            sparseArrayClone.put(R.id.bk_context_key_continuation_value_store, new FDt());
        }
        return fbb;
    }

    public static Htq<F6D> A02(FBB fbb) {
        SparseArray<Object> sparseArray = fbb.A01;
        sparseArray.get(R.id.bk_context_key_interpreter_extensions);
        sparseArray.get(R.id.bk_context_key_minified_interpreter_extensions);
        return new Hhc();
    }

    public static F9b A03(FBB fbb) {
        return (F9b) fbb.A03(R.id.bk_context_key_tree);
    }

    public static Object A05(FBB fbb, FDW fdw) {
        Object objA04 = fbb.A04(A00, fdw, R.id.bk_context_key_controller_associated_object);
        String strA0E = fdw.A0E();
        if (strA0E != null) {
            ((Map) fbb.A03(R.id.bk_context_key_controller_by_server_id)).put(strA0E, objA04);
        }
        return objA04;
    }

    public static Map<String, InterfaceC7700FAy<Object>> A06(FBB fbb) {
        Map<String, InterfaceC7700FAy<Object>> map = (Map) FBB.A01(fbb, R.id.bk_context_key_data_modules);
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public static void A07(Animator animator, FBB fbb) {
        ((AbstractMap) fbb.A03(R.id.bk_context_key_animations)).values().remove(animator);
    }

    public static void A08(FBB fbb) {
        int i;
        FBH[] fbhArr;
        F9b f9bA03 = A03(fbb);
        if (f9bA03 == null || !AbstractC8162FXe.A03()) {
            return;
        }
        int i2 = f9bA03.A00;
        if (i2 <= 0) {
            throw C3cG.A0Q("Negative recursion level.");
        }
        int i3 = i2 - 1;
        f9bA03.A00 = i3;
        if (i3 == 0 && !f9bA03.A0S && f9bA03.A0K.size() > 0) {
            f9bA03.A05();
        }
        List<FBH> list = f9bA03.A0J;
        synchronized (list) {
            fbhArr = (FBH[]) list.toArray(new FBH[0]);
        }
        for (FBH fbh : fbhArr) {
            FBF fbf = (FBF) fbh;
            if (f9bA03.A00 == 0) {
                List<FBH> list2 = A03(fbf.A00).A0J;
                synchronized (list2) {
                    list2.remove(fbf);
                }
                FD4 fd4 = FD3.A00;
                if (fd4 != null) {
                    Iterator<HxE<InterfaceC7646F8n, C7658F9a>> it = fd4.A02.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    fd4.A00 = C79.A0C;
                    fd4.A01();
                }
            }
        }
    }

    public static boolean A09(FBB fbb) {
        Boolean bool = (Boolean) FBB.A01(fbb, R.id.bk_context_key_clip_children_bool);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
