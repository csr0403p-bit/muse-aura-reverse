package X;

import androidx.media3.common.Timeline;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Dha, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5383Dha implements InterfaceC5380DhX {
    public InterfaceC5478DjF A00;
    public InterfaceC5478DjF A01;
    public C5619Dm2 A02;
    public HeroPlayerSetting A03;
    public Map<String, String> A04;
    public final C3083BxP A05;

    @Override // X.InterfaceC5380DhX
    public final InterfaceC5441Dic[] A83(Timeline timeline, Dy6 dy6, InterfaceC5047DQt interfaceC5047DQt, C5378DhV[] c5378DhVArr) {
        InterfaceC5385Dhc c5389Dhg;
        InterfaceC5441Dic di7;
        String str;
        int length = c5378DhVArr.length;
        InterfaceC5441Dic[] interfaceC5441DicArr = new InterfaceC5441Dic[length];
        ArrayList arrayListA0h = C3cG.A0h();
        for (C5378DhV c5378DhV : c5378DhVArr) {
            if (c5378DhV != null && c5378DhV.A00.A02 == 1) {
                for (int i : c5378DhV.A01) {
                    arrayListA0h.add(c5378DhV.A00.A04[i]);
                }
            }
        }
        Iterator it = arrayListA0h.iterator();
        boolean z = false;
        long jMin = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        while (it.hasNext()) {
            int i2 = ((C6154Dwx) it.next()).A05;
            if (i2 > 0) {
                jMin = Math.min(jMin, i2);
            }
            z = true;
        }
        if (!z) {
            c5389Dhg = C5387Dhe.A00;
        } else if (jMin < LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            c5389Dhg = new C5389Dhg();
            if (jMin <= 0) {
                throw C60O.A0i("Minimum audio bitrate must be positive");
            }
        } else {
            c5389Dhg = C5388Dhf.A00;
        }
        InterfaceC5385Dhc interfaceC5385Dhc = c5389Dhg;
        for (int i3 = 0; i3 < length; i3++) {
            C5378DhV c5378DhV2 = c5378DhVArr[i3];
            if (c5378DhV2 != null && c5378DhV2.A01.length != 0) {
                int i4 = c5378DhV2.A00.A02;
                if (3 == i4 || !(c5378DhV2.A01.length != 1 || 1 == i4 || 2 == i4)) {
                    di7 = new Di7(c5378DhV2.A00, new int[]{c5378DhV2.A01[0]});
                } else {
                    C5382DhZ c5382DhZ = c5378DhV2.A00;
                    int[] iArr = c5378DhV2.A01;
                    InterfaceC5478DjF interfaceC5478DjF = this.A00;
                    if (interfaceC5478DjF == null || (str = c5382DhZ.A04[0].A0X) == null || !str.startsWith("audio")) {
                        interfaceC5478DjF = this.A01;
                    }
                    di7 = new DiM(c5382DhZ, interfaceC5478DjF, interfaceC5385Dhc, this.A02, this.A05, this.A03, iArr);
                }
                interfaceC5441DicArr[i3] = di7;
            }
        }
        return interfaceC5441DicArr;
    }

    public C5383Dha(InterfaceC5478DjF interfaceC5478DjF, InterfaceC5478DjF interfaceC5478DjF2, C5619Dm2 c5619Dm2, HeroPlayerSetting heroPlayerSetting, Map map) {
        this.A04 = map;
        this.A01 = interfaceC5478DjF;
        this.A00 = interfaceC5478DjF2;
        this.A03 = heroPlayerSetting;
        this.A02 = c5619Dm2;
        int i = heroPlayerSetting.liveLowMemoryMaxWidth;
        this.A05 = i >= 0 ? new C3083BxP(i, heroPlayerSetting.liveLowMemoryCapHoldMs) : null;
    }
}
