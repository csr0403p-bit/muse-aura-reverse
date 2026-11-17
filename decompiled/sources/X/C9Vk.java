package X;

/* renamed from: X.9Vk, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Vk extends C06G {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9Vk) {
                C9Vk c9Vk = (C9Vk) obj;
                if (this.A00 != c9Vk.A00 || !C7384Etj.areEqual(this.A01, c9Vk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass006.A0D(this.A01);
    }

    public C9Vk(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
