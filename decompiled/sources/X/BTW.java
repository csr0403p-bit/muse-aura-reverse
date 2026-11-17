package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BTW implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BTW(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                ?? r7 = this.A00;
                C1050ASu c1050ASu = (C1050ASu) this.A01;
                ?? r8 = this.A02;
                C1041ASi c1041ASi = (C1041ASi) this.A03;
                if (!C7384Etj.areEqual(r7, c1050ASu.A03) || !C7384Etj.areEqual(r8, c1050ASu.A04)) {
                    c1050ASu.A03 = r7;
                    c1050ASu.A04 = r8;
                    c1050ASu.A01 = c1041ASi;
                    c1050ASu.A02 = new C0997AOa<>(c1041ASi, null, c1050ASu.A07, r7, r8);
                    MutableState.A09(true, c1050ASu.A09.A02);
                    c1050ASu.A05 = false;
                    c1050ASu.A06 = true;
                    break;
                }
                break;
            case 1:
                BBI bbi = (BBI) this.A00;
                C2232BCc c2232BCc = (C2232BCc) this.A01;
                BBQ bbq = (BBQ) this.A02;
                C2229BBz c2229BBz = (C2229BBz) this.A03;
                BBR bbr = bbi.A0b;
                C2232BCc c2232BCc2 = bbr.A06;
                try {
                    bbr.A06 = c2232BCc;
                    BBQ bbq2 = bbi.A0F;
                    int[] iArr = bbi.A0T;
                    Ab2<AKQ> ab2 = bbi.A08;
                    bbi.A0T = null;
                    bbi.A08 = null;
                    try {
                        bbi.A0F = bbq;
                        boolean z = bbr.A07;
                        try {
                            bbr.A07 = false;
                            BBI.A0M(bbi, c2229BBz.A03, c2229BBz.A04, c2229BBz.A06, true);
                            bbr.A07 = z;
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            bbr.A07 = z;
                            throw th;
                        }
                    } finally {
                        bbi.A0F = bbq2;
                        bbi.A0T = iArr;
                        bbi.A08 = ab2;
                    }
                } finally {
                    bbr.A06 = c2232BCc2;
                }
            default:
                AMb aMb = (AMb) this.A00;
                Object obj = this.A01;
                Object obj2 = this.A02;
                Object obj3 = this.A03;
                aMb.A02.Af8(obj);
                aMb.A01.Af8(obj2);
                aMb.A03.Af8(obj3);
                break;
        }
        return Unit.INSTANCE;
    }
}
