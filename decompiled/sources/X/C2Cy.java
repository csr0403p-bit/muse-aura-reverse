package X;

/* renamed from: X.2Cy, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Cy implements ATE<Float> {
    public final float A00;
    public final float A01;

    public static void A00(InterfaceC0857A6e interfaceC0857A6e, float f) {
        AbstractC1564Ale.A01(new C2Cx(new C2Cy(0.0f, 1.0f), f, 0), interfaceC0857A6e);
    }

    @Override // X.AT1
    public final /* bridge */ /* synthetic */ Comparable AF8() {
        return Float.valueOf(this.A00);
    }

    @Override // X.AT1
    public final /* bridge */ /* synthetic */ Comparable AKt() {
        return Float.valueOf(this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2Cy)) {
            return false;
        }
        if (isEmpty() && ((C2Cy) obj).isEmpty()) {
            return true;
        }
        C2Cy c2Cy = (C2Cy) obj;
        return this.A01 == c2Cy.A01 && this.A00 == c2Cy.A00;
    }

    @Override // X.ATE, X.AT1
    public final boolean isEmpty() {
        return AnonymousClass002.A1N((this.A01 > this.A00 ? 1 : (this.A01 == this.A00 ? 0 : -1)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("..");
        sb.append(this.A00);
        return sb.toString();
    }

    public C2Cy(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }
}
