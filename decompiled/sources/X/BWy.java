package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class BWy extends C6150Dws {
    public long A00;
    public final BVW A01;
    public final LinkedHashMap<Long, Long> A02;
    public final Handler A03;

    public BWy(Context context, Handler handler, InterfaceC5460Div interfaceC5460Div, InterfaceC6243Dym interfaceC6243Dym, BVV bvv, C6175DxI c6175DxI, HeroExoPlayer2EventListener heroExoPlayer2EventListener, BVW bvw, InterfaceC2356BVg interfaceC2356BVg, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        super(context, handler, null, interfaceC5460Div, interfaceC6243Dym, bvv, c6175DxI, heroExoPlayer2EventListener, interfaceC2356BVg, 30.0f, 0, i, i2, i3, i4, j, -1L, true, true, false, false);
        ((C6150Dws) this).A0f = z;
        ((C6150Dws) this).A0a = false;
        ((C6150Dws) this).A0g = z2;
        this.A00 = 0L;
        this.A02 = C3cG.A0j();
        this.A03 = handler;
        this.A01 = bvw;
    }

    @Override // X.C6150Dws, X.AbstractC6147Dwp
    public final void A0k(Di2 di2) {
        BVW bvw;
        BVD bvd;
        long j = di2.A00;
        long j2 = j - this.A00;
        LinkedHashMap<Long, Long> linkedHashMap = this.A02;
        BV4.A1F(Long.valueOf(j), linkedHashMap, j2);
        if (AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 1, 1) && (bvw = this.A01) != null && (bvd = bvw.A00.A0J) != null) {
            bvd.A02(j2);
        }
        while (linkedHashMap.size() > 1000 && !linkedHashMap.isEmpty()) {
            linkedHashMap.remove(C3cH.A0l(C3cG.A0i(linkedHashMap)).getKey());
        }
        super.A0k(di2);
    }

    @Override // X.C6150Dws, X.AbstractC6146Dwo
    public final void A0Z(Dy6 dy6, C6154Dwx[] c6154DwxArr, long j, long j2) {
        BVD bvd;
        super.A0Z(dy6, c6154DwxArr, j, j2);
        this.A00 = j2;
        BVW bvw = this.A01;
        if (bvw == null || (bvd = bvw.A00.A0J) == null) {
            return;
        }
        bvd.A01();
    }

    @Override // X.C6150Dws, X.AbstractC6147Dwp
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
        BVW bvw = this.A01;
        if (bvw == null || (c2358BViA04 = HeroExoPlayer2InitHelper.A04(bvw.A00, j)) == null) {
            return;
        }
        this.A03.post(new BVY(c2358BViA04, this));
    }
}
