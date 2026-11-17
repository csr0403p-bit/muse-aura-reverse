package X;

import X.AOd;

/* loaded from: classes4.dex */
public final class AOu<T, V extends AOd> {
    public final AT7<T, V> A00;
    public final Integer A01;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnimationResult(endReason=");
        sbA0x.append(this.A01.intValue() != 0 ? "Finished" : "BoundReached");
        sbA0x.append(", endState=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public AOu(AT7 at7, Integer num) {
        this.A00 = at7;
        this.A01 = num;
    }
}
