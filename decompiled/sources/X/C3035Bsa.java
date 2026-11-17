package X;

/* renamed from: X.Bsa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3035Bsa extends AbstractC3049Bsu {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3049Bsu) {
                C3035Bsa c3035Bsa = (C3035Bsa) ((AbstractC3049Bsu) obj);
                if (!this.A03.equals(c3035Bsa.A03) || !this.A01.equals(c3035Bsa.A01) || !this.A02.equals(c3035Bsa.A02) || !this.A00.equals(c3035Bsa.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.A03.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode()) * 1000003) ^ this.A02.hashCode()) * 1000003) ^ this.A00.hashCode();
    }

    public final String toString() {
        return FGI.A0m("GraphicDeviceInfo{glVersion=", this.A03, ", eglVersion=", this.A01, ", glExtensions=", this.A02, ", eglExtensions=", this.A00, "}");
    }

    public C3035Bsa(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }
}
