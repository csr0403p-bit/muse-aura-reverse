package X;

/* renamed from: X.Aru, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1830Aru {
    public static final C1830Aru A02 = new C1830Aru(0, false);
    public final int A00;
    public final boolean A01;

    public C1830Aru(boolean z) {
        this.A01 = false;
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1830Aru) {
                C1830Aru c1830Aru = (C1830Aru) obj;
                if (this.A01 != c1830Aru.A01 || this.A00 != c1830Aru.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A02(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PlatformParagraphStyle(includeFontPadding=");
        sbA0x.append(this.A01);
        sbA0x.append(", emojiSupportMatch=");
        int i = this.A00;
        return AnonymousClass007.A0Z(i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : C8j4.A0w("Invalid(value=", i), sbA0x);
    }

    public C1830Aru(int i, boolean z) {
        this.A01 = z;
        this.A00 = i;
    }

    public C1830Aru() {
        this(0, false);
    }
}
