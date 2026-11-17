package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Djc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5500Djc implements InterfaceC5487DjP {
    public long A00;
    public final ImmutableList<C5499Djb> A01;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // X.InterfaceC5487DjP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A7A(X.Du1 r14) {
        /*
            r13 = this;
            r12 = 0
        L1:
            long r10 = r13.AI5()
            r8 = -9223372036854775808
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L46
            r5 = 0
            r7 = 0
        Ld:
            com.google.common.collect.ImmutableList<X.Djb> r6 = r13.A01
            int r0 = r6.size()
            if (r5 >= r0) goto L43
            java.lang.Object r0 = r6.get(r5)
            X.Djb r0 = (X.C5499Djb) r0
            X.DjP r0 = r0.A00
            long r3 = r0.AI5()
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r1 = r14.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L2d
        L2c:
            r1 = 0
        L2d:
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L33
            if (r1 == 0) goto L40
        L33:
            java.lang.Object r0 = r6.get(r5)
            X.Djb r0 = (X.C5499Djb) r0
            X.DjP r0 = r0.A00
            boolean r0 = r0.A7A(r14)
            r7 = r7 | r0
        L40:
            int r5 = r5 + 1
            goto Ld
        L43:
            r12 = r12 | r7
            if (r7 != 0) goto L1
        L46:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5500Djc.A7A(X.Du1):boolean");
    }

    @Override // X.InterfaceC5487DjP
    public final boolean AOd() {
        int i = 0;
        while (true) {
            ImmutableList<C5499Djb> immutableList = this.A01;
            if (i >= immutableList.size()) {
                return false;
            }
            if (immutableList.get(i).A00.AOd()) {
                return true;
            }
            i++;
        }
    }

    @Override // X.InterfaceC5487DjP
    public final void AZv(long j) {
        int i = 0;
        while (true) {
            ImmutableList<C5499Djb> immutableList = this.A01;
            if (i >= immutableList.size()) {
                return;
            }
            immutableList.get(i).AZv(j);
            i++;
        }
    }

    public C5500Djc(List<? extends InterfaceC5487DjP> list, List<List<Integer>> list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        C1G.A07(AnonymousClass002.A1Q(list.size(), list2.size()));
        for (int i = 0; i < list.size(); i++) {
            builder.add((ImmutableList.Builder) new C5499Djb(list.get(i), list2.get(i)));
        }
        this.A01 = builder.build();
        this.A00 = -9223372036854775807L;
    }

    @Override // X.InterfaceC5487DjP
    public final /* synthetic */ long AD6(long j) {
        return AD8() - j;
    }

    @Override // X.InterfaceC5487DjP
    public final long AD8() {
        int i = 0;
        long jMin = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        long jMin2 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        while (true) {
            ImmutableList<C5499Djb> immutableList = this.A01;
            if (i >= immutableList.size()) {
                break;
            }
            C5499Djb c5499Djb = immutableList.get(i);
            long jAD8 = c5499Djb.A00.AD8();
            if ((c5499Djb.A01.contains(BV4.A0W()) || c5499Djb.A01.contains(BV4.A0X()) || c5499Djb.A01.contains(BV4.A0Z())) && jAD8 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jAD8);
            }
            if (jAD8 != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jAD8);
            }
            i++;
        }
        if (jMin != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            this.A00 = jMin;
        } else {
            if (jMin2 == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                return Long.MIN_VALUE;
            }
            jMin = this.A00;
            if (jMin == -9223372036854775807L) {
                return jMin2;
            }
        }
        return jMin;
    }

    @Override // X.InterfaceC5487DjP
    public final long AI5() {
        int i = 0;
        long jMin = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        while (true) {
            ImmutableList<C5499Djb> immutableList = this.A01;
            if (i >= immutableList.size()) {
                break;
            }
            long jAI5 = immutableList.get(i).A00.AI5();
            if (jAI5 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jAI5);
            }
            i++;
        }
        if (jMin == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
