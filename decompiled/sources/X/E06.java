package X;

import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class E06 implements E09 {
    public long A00;
    public long A01;
    public long A02;
    public E05 A03;
    public final ArrayDeque<E05> A04 = BV4.A0s();
    public final ArrayDeque<E0M> A05;
    public final ArrayDeque<E05> A06;

    @Override // X.InterfaceC6223DyE
    public final void release() {
    }

    public final E0R A04() {
        List<E0J> list;
        if (this instanceof C6345E1v) {
            C6345E1v c6345E1v = (C6345E1v) this;
            list = c6345E1v.A04;
            c6345E1v.A05 = list;
        } else {
            E0N e0n = (E0N) this;
            list = e0n.A07;
            e0n.A08 = list;
        }
        list.getClass();
        return new E0R(list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fc A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165 A[PHI: r8
  0x0165: PHI (r8v19 boolean) = (r8v3 boolean), (r8v2 boolean), (r8v2 boolean) binds: [B:124:0x01fc, B:122:0x01f7, B:82:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019c  */
    @Override // X.InterfaceC6223DyE
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.E0M A8s() {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E06.A8s():X.E0M");
    }

    @Override // X.InterfaceC6223DyE
    public final /* bridge */ /* synthetic */ E0B A8q() {
        C1G.A08(AnonymousClass002.A1Y(this.A03));
        ArrayDeque<E05> arrayDeque = this.A04;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        E05 e05PollFirst = arrayDeque.pollFirst();
        this.A03 = e05PollFirst;
        return e05PollFirst;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // X.InterfaceC6223DyE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void AZ2(X.E0B r8) {
        /*
            r7 = this;
            X.E0B r8 = (X.E0B) r8
            X.E05 r0 = r7.A03
            boolean r0 = X.AnonymousClass002.A1Z(r8, r0)
            X.C1G.A07(r0)
            X.E05 r8 = (X.E05) r8
            boolean r0 = X.AbstractC5364DhG.A00(r8)
            if (r0 != 0) goto L36
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L36
            long r1 = r7.A00
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L36
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L36
            r8.A02()
            java.util.ArrayDeque<X.E05> r0 = r7.A04
        L2f:
            r0.add(r8)
            r0 = 0
            r7.A03 = r0
            return
        L36:
            long r2 = r7.A02
            r0 = 1
            long r0 = r0 + r2
            r7.A02 = r0
            X.Di2 r0 = X.Di2.$redex_init_class
            r8.A00 = r2
            java.util.ArrayDeque<X.E05> r0 = r7.A06
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E06.AZ2(java.lang.Object):void");
    }

    @Override // X.InterfaceC6223DyE
    public void flush() {
        this.A02 = 0L;
        this.A01 = 0L;
        while (true) {
            ArrayDeque<E05> arrayDeque = this.A06;
            if (arrayDeque.isEmpty()) {
                break;
            }
            E05 e05Poll = arrayDeque.poll();
            e05Poll.A02();
            this.A04.add(e05Poll);
        }
        E05 e05 = this.A03;
        if (e05 != null) {
            e05.A02();
            this.A04.add(e05);
            this.A03 = null;
        }
    }

    public E06() {
        int i = 0;
        int i2 = 0;
        do {
            this.A04.add(new E05(1));
            i2++;
        } while (i2 < 10);
        this.A05 = BV4.A0s();
        do {
            ArrayDeque<E0M> arrayDeque = this.A05;
            E0A e0a = new E0A(this);
            E07 e07 = new E07();
            e07.A00 = e0a;
            arrayDeque.add(e07);
            i++;
        } while (i < 2);
        this.A06 = BV4.A0s();
        this.A00 = -9223372036854775807L;
    }

    @Override // X.InterfaceC6223DyE
    public final void Adx(long j) {
        this.A00 = j;
    }

    @Override // X.E09
    public final void Ae9(long j) {
        this.A01 = j;
    }
}
