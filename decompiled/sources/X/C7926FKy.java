package X;

/* renamed from: X.FKy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7926FKy extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7926FKy) {
                C7926FKy c7926FKy = (C7926FKy) obj;
                if (Float.compare(this.A00, c7926FKy.A00) != 0 || Float.compare(this.A01, c7926FKy.A01) != 0 || Float.compare(this.A02, c7926FKy.A02) != 0 || this.A03 != c7926FKy.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A00), this.A01), this.A02) + this.A03;
    }

    public C7926FKy(float f, float f2, float f3, int i) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = i;
    }
}
