package X;

/* renamed from: X.CDk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3311CDk {
    public final C7Gm A00;
    public final Exception A01;
    public final boolean A02;

    public C3311CDk(C7Gm c7Gm, Exception exc, boolean z) {
        this.A02 = z;
        this.A00 = c7Gm;
        this.A01 = exc;
        if (!z && c7Gm == null) {
            throw C3cG.A0Q("Must provide a query result if action failed");
        }
    }
}
