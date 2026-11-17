package X;

/* renamed from: X.AsB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1838AsB {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1838AsB) && this.A00 == ((C1838AsB) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : C8j4.A0w("Invalid(value=", i);
    }

    public /* synthetic */ C1838AsB(int i) {
        this.A00 = i;
    }
}
