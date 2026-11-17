package X;

/* renamed from: X.FBe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7706FBe {
    public final HxE<FBm, Hr8> A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C7706FBe) && this.A00.equals(((C7706FBe) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("WriteThroughCacheResponse(response=", this.A00);
    }

    public /* synthetic */ C7706FBe(HxE hxE) {
        this.A00 = hxE;
    }
}
