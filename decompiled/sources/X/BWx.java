package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class BWx extends C6149Dwr {
    public long A00;
    public final BVX A01;
    public final LinkedHashMap<Long, Long> A02;
    public final Handler A03;

    public BWx(Context context, Handler handler, InterfaceC6243Dym interfaceC6243Dym, InterfaceC6133Dwb interfaceC6133Dwb, BVV bvv, C6175DxI c6175DxI, BVX bvx, BWK bwk, InterfaceC2356BVg interfaceC2356BVg, int i, int i2, int i3, int i4, long j, boolean z, boolean z2, boolean z3) {
        super(context, handler, interfaceC6243Dym, interfaceC6133Dwb, bvv, c6175DxI, null, bwk, interfaceC2356BVg, 0, i, i2, i3, i4, j, z3);
        ((C6149Dwr) this).A0a = z;
        ((C6149Dwr) this).A0O = false;
        ((C6149Dwr) this).A0Z = z2;
        this.A00 = 0L;
        this.A02 = C3cG.A0j();
        this.A03 = handler;
        this.A01 = bvx;
    }

    @Override // X.C6149Dwr, X.AbstractC6148Dwq
    public final void A0l(Di2 di2) {
        BVX bvx;
        BVD bvd;
        long j = di2.A00;
        long j2 = j - this.A00;
        LinkedHashMap<Long, Long> linkedHashMap = this.A02;
        BV4.A1F(Long.valueOf(j), linkedHashMap, j2);
        if (AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 1, 1) && (bvx = this.A01) != null && (bvd = bvx.A00.A0J) != null) {
            bvd.A02(j2);
        }
        while (linkedHashMap.size() > 1000 && !linkedHashMap.isEmpty()) {
            linkedHashMap.remove(C3cH.A0l(C3cG.A0i(linkedHashMap)).getKey());
        }
        super.A0l(di2);
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    public final void A0Z(Dy6 dy6, C6154Dwx[] c6154DwxArr, long j, long j2) {
        BVD bvd;
        super.A0Z(dy6, c6154DwxArr, j, j2);
        this.A00 = j2;
        BVX bvx = this.A01;
        if (bvx == null || (bvd = bvx.A00.A0J) == null) {
            return;
        }
        bvd.A01();
    }

    @Override // X.C6149Dwr, X.AbstractC6148Dwq
    public final void A0i(long j) {
        C2358BVi c2358BViA04;
        super.A0i(j);
        LinkedHashMap<Long, Long> linkedHashMap = this.A02;
        Long lValueOf = Long.valueOf(j);
        Number numberA0j = BV6.A0j(lValueOf, linkedHashMap);
        if (numberA0j != null) {
            j = numberA0j.longValue();
            linkedHashMap.remove(lValueOf);
        }
        BVX bvx = this.A01;
        if (bvx == null || (c2358BViA04 = HeroExoPlayer2InitHelper.A04(bvx.A00, j)) == null) {
            return;
        }
        this.A03.post(new BVZ(c2358BViA04, this));
    }
}
