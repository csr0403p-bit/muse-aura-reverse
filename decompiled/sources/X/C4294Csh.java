package X;

import android.content.ComponentName;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Csh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4294Csh {
    public final ComponentName A00;
    public final List<AbstractC4308Csw> A01;
    public final boolean A02;

    public C4294Csh(ComponentName componentName, List list, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.A01 = list;
        this.A00 = componentName;
        this.A02 = z;
        if (list.isEmpty()) {
            throw C60O.A0i("credentialOptions should not be empty");
        }
        if (list.size() > 1) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            Iterator<AbstractC4308Csw> it2 = this.A01.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }
}
