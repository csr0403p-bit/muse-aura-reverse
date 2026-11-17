package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Dhv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5402Dhv {
    public final long A00;
    public final InterfaceC5403Dhw[] A01;

    public C5402Dhv(List<? extends InterfaceC5403Dhw> list) {
        this((InterfaceC5403Dhw[]) list.toArray(new InterfaceC5403Dhw[0]));
    }

    public final C5402Dhv A01(InterfaceC5403Dhw... interfaceC5403DhwArr) {
        int length = interfaceC5403DhwArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.A00;
        InterfaceC5403Dhw[] interfaceC5403DhwArr2 = this.A01;
        int length2 = interfaceC5403DhwArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC5403DhwArr2, length2 + length);
        System.arraycopy(interfaceC5403DhwArr, 0, objArrCopyOf, length2, length);
        return new C5402Dhv((InterfaceC5403Dhw[]) objArrCopyOf, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C5402Dhv c5402Dhv = (C5402Dhv) obj;
                if (!Arrays.equals(this.A01, c5402Dhv.A01) || this.A00 != c5402Dhv.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.A01);
        long j = this.A00;
        return FGI.A0U("entries=", string, j == -9223372036854775807L ? "" : FGI.A0B(j, ", presentationTimeUs="));
    }

    public static C5402Dhv A00(C6358E2k c6358E2k) {
        C6419E4v c6419E4vA01 = c6358E2k.A01(1836476516);
        c6419E4vA01.getClass();
        return new C5402Dhv(E2Q.A05(c6419E4vA01.A00));
    }

    public C5402Dhv(InterfaceC5403Dhw[] interfaceC5403DhwArr, long j) {
        this.A00 = j;
        this.A01 = interfaceC5403DhwArr;
    }

    public C5402Dhv(InterfaceC5403Dhw... interfaceC5403DhwArr) {
        this(interfaceC5403DhwArr, -9223372036854775807L);
    }
}
