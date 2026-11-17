package X;

import android.util.LongSparseArray;
import com.facebook.debug.tracer.Tracer;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.systrace.Systrace;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G4z {
    public final LongSparseArray<Object> A00 = new LongSparseArray<>();
    public final Map<Long, McfReference> A01;

    public final <T> T A01(G50<T> g50) {
        long jAMC;
        T t;
        if (Systrace.A09(32L)) {
            Tracer.A01(FGI.A0M(g50.AHp().getSimpleName(), ".getTypeId"));
            try {
                jAMC = g50.AMC();
            } finally {
                Tracer.A00();
            }
        } else {
            jAMC = g50.AMC();
        }
        LongSparseArray<Object> longSparseArray = this.A00;
        synchronized (longSparseArray) {
            t = (T) longSparseArray.get(jAMC);
        }
        if (t != null) {
            A00(g50, t);
            return t;
        }
        McfReference mcfReference = this.A01.get(Long.valueOf(jAMC));
        if (mcfReference == null) {
            return null;
        }
        T tA7C = g50.A7C(mcfReference);
        C7384Etj.A0X(tA7C);
        A00(g50, tA7C);
        synchronized (longSparseArray) {
            longSparseArray.put(jAMC, tA7C);
        }
        return tA7C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G4z(Map<Long, ? extends McfReference> map) {
        this.A01 = map;
    }

    public static final void A00(G50<?> g50, Object obj) {
        Class<?> clsAHp = g50.AHp();
        Class<?> cls = obj.getClass();
        if (!clsAHp.isAssignableFrom(cls)) {
            throw C3cG.A0Q(String.format(Locale.US, "Expected McfRef object of type '%s' but actual was '%s'", Arrays.copyOf(new Object[]{clsAHp, cls}, 2)));
        }
    }
}
