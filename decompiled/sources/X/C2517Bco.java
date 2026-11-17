package X;

import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Bco, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2517Bco implements InterfaceC2420Baw {
    public Map<Integer, InterfaceC2523Bcu> A00;
    public final InterfaceC2420Baw A01;

    /* JADX WARN: Incorrect types in method signature: (LX/Baw;LX/Bch;LX/BdV;LX/BpS<LX/BdF;LX/BbP;>;)V */
    public C2517Bco(BpS bpS, InterfaceC2544BdV interfaceC2544BdV, InterfaceC2420Baw interfaceC2420Baw, C2511Bch c2511Bch) {
        Map map;
        InterfaceC2523Bcu interfaceC2523BcuACK;
        AbstractC2509Bcf abstractC2509Bcf;
        this.A01 = interfaceC2420Baw;
        ArrayList arrayListA02 = c2511Bch.A02(ExtraSupportedQualityQuirk.class);
        if (arrayListA02.isEmpty()) {
            return;
        }
        BeS.A07(BV7.A1Q(arrayListA02.size()), null);
        arrayListA02.get(0);
        if (!BV6.A1a("motorola") || !BV6.A1Z("moto c")) {
            Map map2 = Collections.EMPTY_MAP;
            map = map2;
            if (map2 == null) {
                return;
            }
        } else {
            if (!"1".equals(interfaceC2544BdV.ADH()) || interfaceC2420Baw.ANG(4) || (interfaceC2523BcuACK = interfaceC2420Baw.ACK(1)) == null) {
                return;
            }
            List<AbstractC2509Bcf> listAMe = interfaceC2523BcuACK.AMe();
            if (listAMe.isEmpty() || (abstractC2509Bcf = listAMe.get(0)) == null) {
                return;
            }
            InterfaceC2436BbP interfaceC2436BbP = (InterfaceC2436BbP) bpS.apply(Bd2.A02(abstractC2509Bcf));
            Range<Integer> rangeALK = interfaceC2436BbP != null ? interfaceC2436BbP.ALK() : AbstractC2440BbT.A00;
            Size size = AbstractC2484BcB.A02;
            C2520Bcr c2520Bcr = (C2520Bcr) abstractC2509Bcf;
            int i = c2520Bcr.A01;
            int i2 = c2520Bcr.A00;
            int i3 = c2520Bcr.A04;
            int width = size.getWidth();
            int i4 = c2520Bcr.A08;
            int height = size.getHeight();
            int i5 = c2520Bcr.A06;
            C2525Bcw c2525Bcw = new C2525Bcw(BV5.A13(interfaceC2523BcuACK.ACZ()), BV5.A13(Collections.singletonList(new C2520Bcr(c2520Bcr.A09, c2520Bcr.A03, Bd2.A00(rangeALK, i, i2, i2, i3, i3, width, i4, height, i5), i3, size.getWidth(), size.getHeight(), c2520Bcr.A07, i2, c2520Bcr.A02, c2520Bcr.A05))), interfaceC2523BcuACK.AEh(), interfaceC2523BcuACK.AJS());
            HashMap mapA0u = BV4.A0u();
            BV6.A1E(c2525Bcw, mapA0u, 4);
            map = mapA0u;
            if (BV7.A0B(size) > BV7.A0B(BV6.A0P(i4, i5))) {
                BV6.A1E(c2525Bcw, mapA0u, 1);
                map = mapA0u;
            }
        }
        this.A00 = BV4.A0w(map);
    }

    @Override // X.InterfaceC2420Baw
    public final InterfaceC2523Bcu ACK(int i) {
        Map<Integer, InterfaceC2523Bcu> map = this.A00;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            if (map.containsKey(numValueOf)) {
                return map.get(numValueOf);
            }
        }
        return this.A01.ACK(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // X.InterfaceC2420Baw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ANG(int r4) {
        /*
            r3 = this;
            java.util.Map<java.lang.Integer, X.Bcu> r2 = r3.A00
            if (r2 == 0) goto L17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.get(r1)
        L12:
            boolean r0 = X.AnonymousClass002.A1X(r0)
            return r0
        L17:
            X.Baw r0 = r3.A01
            X.Bcu r0 = r0.ACK(r4)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2517Bco.ANG(int):boolean");
    }
}
