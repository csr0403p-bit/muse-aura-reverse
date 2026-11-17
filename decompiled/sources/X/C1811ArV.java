package X;

/* renamed from: X.ArV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811ArV {
    public final int A00;

    public static String A00(int i) {
        StringBuilder sbA0x = C60O.A0x("LineBreak(strategy=");
        int i2 = i & 255;
        sbA0x.append((Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sbA0x.append(", strictness=");
        int i3 = (i >> 8) & 255;
        sbA0x.append((Object) (i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : i3 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sbA0x.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        return AnonymousClass007.A0Z(i4 == 1 ? "WordBreak.None" : i4 == 2 ? "WordBreak.Phrase" : i4 == 0 ? "WordBreak.Unspecified" : "Invalid", sbA0x);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1811ArV) && this.A00 == ((C1811ArV) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ C1811ArV(int i) {
        this.A00 = i;
    }

    public static void A01(C1818Arh c1818Arh, Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", lineHeightStyle=");
        sb.append(c1818Arh.A06);
        sb.append(", lineBreak=");
        sb.append((Object) A00(c1818Arh.A01));
        sb.append(", hyphens=");
        int i = c1818Arh.A00;
        sb.append((Object) (i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid"));
        sb.append(", textMotion=");
    }
}
