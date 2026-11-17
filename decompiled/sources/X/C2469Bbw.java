package X;

/* renamed from: X.Bbw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2469Bbw extends AbstractC2470Bbx {
    public final InterfaceC2969BqO A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof AbstractC2470Bbx) && this.A00.equals(((C2469Bbw) ((AbstractC2470Bbx) obj)).A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Event{eventCode=");
        sbA0x.append(0);
        sbA0x.append(", surfaceOutput=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C2469Bbw(InterfaceC2969BqO interfaceC2969BqO) {
        this.A00 = interfaceC2969BqO;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, -721379959);
    }
}
