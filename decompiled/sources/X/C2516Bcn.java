package X;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Bcn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2516Bcn implements InterfaceC2420Baw {
    public final C2511Bch A00;
    public final InterfaceC2420Baw A01;
    public final Map<Integer, InterfaceC2523Bcu> A02 = BV4.A0u();

    private InterfaceC2523Bcu A00(int i) {
        InterfaceC2523Bcu interfaceC2523BcuACK;
        int i2;
        int i3;
        Map<Integer, InterfaceC2523Bcu> map = this.A02;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return map.get(numValueOf);
        }
        InterfaceC2420Baw interfaceC2420Baw = this.A01;
        if (interfaceC2420Baw.ANG(i)) {
            interfaceC2523BcuACK = interfaceC2420Baw.ACK(i);
            interfaceC2523BcuACK.getClass();
            Iterator it = this.A00.A02(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next() != null) {
                    if (i == 4) {
                        i2 = 640;
                        i3 = 480;
                    } else if (i == 5) {
                        i2 = 960;
                        i3 = 720;
                    } else if (i == 6) {
                        i2 = HatchInviteStoryImageRenderer.TEXT_CENTER_Y_PX;
                        i3 = 1080;
                    }
                    Size sizeA0P = BV6.A0P(i2, i3);
                    ArrayList arrayListA0h = C3cG.A0h();
                    Iterator<AbstractC2509Bcf> it2 = interfaceC2523BcuACK.AMe().iterator();
                    while (it2.hasNext()) {
                        C2520Bcr c2520Bcr = (C2520Bcr) it2.next();
                        arrayListA0h.add(new C2520Bcr(c2520Bcr.A09, c2520Bcr.A03, c2520Bcr.A01, c2520Bcr.A04, sizeA0P.getWidth(), sizeA0P.getHeight(), c2520Bcr.A07, c2520Bcr.A00, c2520Bcr.A02, c2520Bcr.A05));
                    }
                    if (!arrayListA0h.isEmpty()) {
                        interfaceC2523BcuACK = new C2525Bcw(BV5.A13(interfaceC2523BcuACK.ACZ()), BV5.A13(arrayListA0h), interfaceC2523BcuACK.AEh(), interfaceC2523BcuACK.AJS());
                    }
                }
            }
            interfaceC2523BcuACK = null;
        } else {
            interfaceC2523BcuACK = null;
        }
        map.put(numValueOf, interfaceC2523BcuACK);
        return interfaceC2523BcuACK;
    }

    @Override // X.InterfaceC2420Baw
    public final boolean ANG(int i) {
        return this.A01.ANG(i) && A00(i) != null;
    }

    public C2516Bcn(InterfaceC2420Baw interfaceC2420Baw, C2511Bch c2511Bch) {
        this.A01 = interfaceC2420Baw;
        this.A00 = c2511Bch;
    }

    @Override // X.InterfaceC2420Baw
    public final InterfaceC2523Bcu ACK(int i) {
        return A00(i);
    }
}
