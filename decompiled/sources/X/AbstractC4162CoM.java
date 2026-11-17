package X;

import android.content.Context;
import android.os.Looper;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.CoM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4162CoM extends AbstractC4160CoH implements InterfaceC4191CpP {
    public final C4173Cod A00;
    public final Set A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4162CoM(Context context, Looper looper, InterfaceC4392Cuv interfaceC4392Cuv, InterfaceC4393Cuw interfaceC4393Cuw, C4173Cod c4173Cod, int i) {
        super(context, looper, C4001CjU.A00, new C4367CuM(interfaceC4392Cuv), new C4368CuN(interfaceC4393Cuw), C3649Cbe.A06, c4173Cod.A02, i);
        synchronized (C3649Cbe.A07) {
            if (C3649Cbe.A06 == null) {
                C3649Cbe.A06 = new C3649Cbe(context.getApplicationContext(), context.getMainLooper());
            }
        }
        this.A00 = c4173Cod;
        Set set = c4173Cod.A05;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw C3cG.A0Q("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.A01 = set;
    }
}
