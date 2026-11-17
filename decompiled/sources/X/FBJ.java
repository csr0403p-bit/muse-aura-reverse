package X;

/* loaded from: classes6.dex */
public final class FBJ<TSnapshot> {
    public final TSnapshot A00;
    public final Runnable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBJ) {
                FBJ fbj = (FBJ) obj;
                if (!this.A00.equals(fbj.A00) || !this.A01.equals(fbj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        TSnapshot tsnapshot = this.A00;
        return C3cJ.A0L(this.A01, BV3.A00(15), C3cG.A0f(tsnapshot, "SubscribeResult(snapshot="));
    }

    public FBJ(TSnapshot tsnapshot, Runnable runnable) {
        this.A00 = tsnapshot;
        this.A01 = runnable;
    }
}
