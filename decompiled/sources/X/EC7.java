package X;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EC7 {
    public final EIN A00;
    public final Set<AbstractC5306Dfp<?>> A01;

    public EC7(EIN ein) {
        this.A00 = ein;
        Set<AbstractC5306Dfp<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        C7384Etj.A0U(setNewSetFromMap);
        this.A01 = setNewSetFromMap;
    }
}
