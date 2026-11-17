package X;

import android.content.Context;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Dmc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5648Dmc {
    public long A00;
    public C5997Dte A01;
    public final C5649Dmd A02;
    public final IdentityHashMap<C5414DiA, Map<C5946Dsg, C5581Dkz>> A03 = new IdentityHashMap<>();
    public final Function0<C5997Dte> A04;
    public final boolean A05;

    public static final C5648Dmc A00(Context context, C5580Dky c5580Dky, boolean z) {
        C7384Etj.A0Y(context, 0);
        if (c5580Dky == null) {
            return null;
        }
        Iterable iterableA0C = ATD.A0C(0, C5580Dky.A00(c5580Dky));
        if ((iterableA0C instanceof Collection) && ((Collection) iterableA0C).isEmpty()) {
            return null;
        }
        Iterator<Integer> it = iterableA0C.iterator();
        while (it.hasNext()) {
            List<Dl9> list = c5580Dky.A0R.get(((BNt) it).A00()).A03;
            C7384Etj.A0T(list);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<Dl9> it2 = list.iterator();
                while (it2.hasNext()) {
                    Dl9 dl9A0b = BV6.A0b(it2);
                    if ((dl9A0b instanceof C5581Dkz) && ((C5581Dkz) dl9A0b).A00 != C79.A00) {
                        return new C5648Dmc(c5580Dky, new EQf(context, 16), z);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dky;ZLkotlin/jvm/functions/Function0<LX/Dte;>;)V */
    public C5648Dmc(C5580Dky c5580Dky, Function0 function0, boolean z) {
        this.A05 = z;
        this.A04 = function0;
        this.A02 = new C5649Dmd(c5580Dky);
    }
}
