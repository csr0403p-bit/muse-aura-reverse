package X;

import android.view.KeyEvent;

/* renamed from: X.2AA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AA {
    public final KeyEvent A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C2AA) && C7384Etj.areEqual(this.A00, ((C2AA) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, new StringBuilder("KeyEvent(nativeKeyEvent="));
    }
}
