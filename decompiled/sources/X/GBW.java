package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GBW<R> {
    public final Object A00;
    public final R A01;
    public final Throwable A02;
    public final G0W<Throwable, R, C78T, Unit> A03;
    public final HpO A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GBW) {
                GBW gbw = (GBW) obj;
                if (!C7384Etj.areEqual(this.A01, gbw.A01) || !C7384Etj.areEqual(this.A04, gbw.A04) || !C7384Etj.areEqual(this.A03, gbw.A03) || !C7384Etj.areEqual(this.A00, gbw.A00) || !C7384Etj.areEqual(this.A02, gbw.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass006.A0D(this.A01) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + C3cH.A02(this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CompletedContinuation(result=");
        sbA0x.append(this.A01);
        sbA0x.append(", cancelHandler=");
        sbA0x.append(this.A04);
        sbA0x.append(", onCancellation=");
        sbA0x.append(this.A03);
        sbA0x.append(", idempotentResume=");
        sbA0x.append(this.A00);
        sbA0x.append(", cancelCause=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (TR;LX/HpO;LX/G0W<-Ljava/lang/Throwable;-TR;-LX/78T;Lkotlin/Unit;>;Ljava/lang/Object;Ljava/lang/Throwable;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public GBW(Object obj, Object obj2, Throwable th, G0W g0w, HpO hpO) {
        this.A01 = obj;
        this.A04 = hpO;
        this.A03 = g0w;
        this.A00 = obj2;
        this.A02 = th;
    }
}
