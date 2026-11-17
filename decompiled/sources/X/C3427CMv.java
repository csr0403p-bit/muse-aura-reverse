package X;

import android.util.LruCache;

/* renamed from: X.CMv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3427CMv extends LruCache<Long, Dlw> {
    public final /* synthetic */ CMu A00;
    public final /* synthetic */ DXW A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3427CMv(CMu cMu, DXW dxw, int i) {
        super(i);
        this.A01 = dxw;
        this.A00 = cMu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
    
        if (r11.A2x == false) goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x007b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007e A[SYNTHETIC] */
    @Override // android.util.LruCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean r9, java.lang.Long r10, X.Dlw r11, X.Dlw r12) {
        /*
            r8 = this;
            X.Dlw r11 = (X.Dlw) r11
            long r1 = r11.A20
            java.lang.Object[] r3 = X.BV4.A1X(r1)
            java.lang.String r0 = "entryRemoved, playerId=%d"
            X.AbstractC5718DoA.A02(r0, r3)
            X.DXW r3 = r8.A01
            if (r9 == 0) goto L3c
            java.lang.String r0 = "player_release_evicted"
        L13:
            r3.A04(r0, r1)
            X.CMu r5 = r8.A00
            boolean r0 = r5 instanceof X.DXX
            if (r0 == 0) goto L3f
            X.DXX r5 = (X.DXX) r5
            X.DXW r0 = r5.A01
            java.util.Queue<X.Dlw> r6 = r0.A06
            int r0 = r6.size()
            long r3 = (long) r0
            long r1 = r5.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb7
            r11.A1P()
            X.DoB r0 = new X.DoB
            r0.<init>()
            r11.A1T(r0)
            r6.add(r11)
            return
        L3c:
            java.lang.String r0 = "player_release_not_evicted"
            goto L13
        L3f:
            r6 = 1
            r4 = 0
            if (r9 == 0) goto Lb7
            boolean r0 = r5.A04
            if (r0 == 0) goto L69
            java.util.Set<java.lang.Long> r0 = r5.A03
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L69
            boolean r0 = r5.A07
            if (r0 != 0) goto L69
            boolean r0 = r5.A06
            if (r0 != 0) goto L69
            r5.A07 = r6
            android.util.LruCache<java.lang.Long, X.Dlw> r0 = r5.A02     // Catch: java.lang.Throwable -> L65
            r0.put(r3, r11)     // Catch: java.lang.Throwable -> L65
            r5.A07 = r4
            return
        L65:
            r0 = move-exception
            r5.A07 = r4
            throw r0
        L69:
            int r8 = r5.A01
            if (r8 <= 0) goto Lb7
            r0 = 4
            java.lang.Integer[] r7 = X.C79.A00(r0)
            int r6 = r7.length
        L73:
            if (r4 >= r6) goto L85
            r3 = r7[r4]
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L83;
                case 2: goto L88;
                case 3: goto L81;
                default: goto L7e;
            }
        L7e:
            int r4 = r4 + 1
            goto L73
        L81:
            r0 = 3
            goto L89
        L83:
            r0 = 1
            goto L89
        L85:
            java.lang.Integer r3 = X.C79.A00
            goto L8b
        L88:
            r0 = 2
        L89:
            if (r0 != r8) goto L7e
        L8b:
            java.lang.Integer r0 = X.C79.A01
            if (r0 == r3) goto Lb0
            java.lang.Integer r0 = X.C79.A0C
            if (r0 != r3) goto La8
            boolean r0 = r11.A2x
        L95:
            if (r0 == 0) goto Lb7
        L97:
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Lb7
            boolean r0 = r5.A05
            if (r0 == 0) goto Lb3
            boolean r0 = X.CMu.A00(r5, r11)
            if (r0 == 0) goto Lb7
            return
        La8:
            java.lang.Integer r0 = X.C79.A0K
            if (r0 != r3) goto Lb7
            boolean r0 = r11.A2x
            if (r0 != 0) goto L97
        Lb0:
            boolean r0 = r11.A2t
            goto L95
        Lb3:
            X.CMu.A00(r5, r11)
            return
        Lb7:
            r11.AaA(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3427CMv.entryRemoved(boolean, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }
}
