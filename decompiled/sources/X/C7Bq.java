package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import kotlin.Unit;

/* renamed from: X.7Bq, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7Bq {
    public static final long A00(long j) {
        if (j > 0) {
            return C0851A5x.A02(C0851A5x.A03(j, AbstractC0852A5y.A02(F24.A06, 999999L)));
        }
        return 0L;
    }

    public static final Object A01(long j, HtJ<? super Unit> htJ) {
        if (j > 0) {
            String str = GBL.__redex_internal_original_name;
            GBL gbl = new GBL(1, C7Bm.A02(htJ));
            gbl.A0I();
            if (j < LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                A03(gbl.A01).AcD(gbl, j);
            }
            Object objA0F = gbl.A0F();
            if (objA0F == EnumC10460Hji.A02) {
                return objA0F;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.HtJ<?> r5) {
        /*
            boolean r0 = r5 instanceof X.C8Zj
            if (r0 == 0) goto L22
            r4 = r5
            X.8Zj r4 = (X.C8Zj) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3b
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            X.8Zj r4 = new X.8Zj
            r4.<init>(r5)
            goto L12
        L28:
            X.Hwg.A00(r3)
            r0 = 0
            r4.I$0 = r0
            r4.label = r1
            X.GBL r0 = X.C7Bm.A04(r4)
            java.lang.Object r0 = r0.A0F()
            if (r0 != r2) goto L3e
            return r2
        L3b:
            X.Hwg.A00(r3)
        L3e:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7Bq.A02(X.HtJ):X.Hji");
    }

    public static final Hni A03(C78T c78t) {
        Hni hni;
        C78X c78x = c78t.get(InterfaceC10590Hxd.A00);
        return (!(c78x instanceof Hni) || (hni = (Hni) c78x) == null) ? AbstractC10475Hkn.A00 : hni;
    }
}
