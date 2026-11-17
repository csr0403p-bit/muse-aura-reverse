package X;

import com.meta.maps.fancypins.FancyPinDataController;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.Hud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10571Hud implements Serializable {
    public final Throwable exception;

    public final boolean equals(Object obj) {
        return (obj instanceof C10571Hud) && C7384Etj.areEqual(this.exception, ((C10571Hud) obj).exception);
    }

    public final int hashCode() {
        return this.exception.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.exception, C60O.A0x("Failure("));
    }

    public C10571Hud(Throwable th) {
        this.exception = th;
    }

    public static void A00(Throwable th, Iterator it) {
        ((FancyPinDataController.PendingSourceMutation) it.next()).complete(new C10571Hud(th));
    }
}
