package X;

import android.net.Uri;
import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.List;

/* loaded from: classes5.dex */
public final class DmR implements Cloneable {
    public int A00;
    public C1U A02;
    public C4904DDx A03;
    public boolean A0D;
    public final int A0E;
    public final int A0F;
    public final AudioFocusLossSettings A0G;
    public final C1T A0H;
    public final List<C2384BXz> A0I;
    public final List A0J;
    public final List A0K;
    public String A08 = "";
    public String A09 = "";
    public int A01 = 0;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;
    public Double A07 = null;
    public Double A06 = null;
    public Double A05 = null;
    public Boolean A04 = null;

    public DmR(AudioFocusLossSettings audioFocusLossSettings, C1U c1u, C1T c1t, C4904DDx c4904DDx, List list, List list2, List list3, int i, int i2, int i3, boolean z) {
        this.A03 = c4904DDx;
        this.A02 = c1u;
        this.A00 = i;
        this.A0F = i2;
        this.A0E = i3;
        this.A0H = c1t;
        this.A0G = audioFocusLossSettings;
        this.A0K = list;
        this.A0I = list2;
        this.A0D = z;
        this.A0J = list3;
    }

    public static String A00(DmR dmR, HeroPlayerSetting heroPlayerSetting) {
        Dlv dlv = heroPlayerSetting.gen;
        if (dlv.use_video_play_request_as_preload_key) {
            return String.valueOf(dmR.hashCode());
        }
        boolean z = dlv.use_video_source_as_preload_key;
        C4904DDx c4904DDx = dmR.A03;
        if (!z) {
            return c4904DDx.A0Q;
        }
        StringBuilder sbA0w = C60O.A0w();
        String str = c4904DDx.A0Q;
        if (str != null) {
            sbA0w.append("\n\tId: ");
            sbA0w.append(str);
        }
        Uri uri = c4904DDx.A08;
        if (uri != null) {
            sbA0w.append("\n\tUri: ");
            sbA0w.append(AbstractC7385Etm.A00(uri, true));
        }
        int i = c4904DDx.A02;
        if (i != 0) {
            sbA0w.append("\n\tPinRoleFlags: ");
            sbA0w.append(i);
        }
        return sbA0w.toString();
    }

    public final boolean A02() {
        return AnonymousClass002.A1Z(this.A03.A0A, BXX.MOQ);
    }

    public final boolean equals(Object obj) {
        C4904DDx c4904DDx = this.A03;
        if (c4904DDx.A0Q == null || !(obj instanceof DmR)) {
            return false;
        }
        DmR dmR = (DmR) obj;
        return c4904DDx.equals(dmR.A03) && this.A0F == dmR.A0F && this.A0E == dmR.A0E;
    }

    public final int hashCode() {
        return ((((AnonymousClass005.A0E(this.A03) + this.A0F) * 31) - 1) * 31) + this.A0E;
    }

    public final DmR A01(C4904DDx c4904DDx) {
        try {
            DmR dmR = (DmR) super.clone();
            dmR.A03 = c4904DDx;
            return dmR;
        } catch (CloneNotSupportedException e) {
            throw BV4.A0N(e);
        }
    }
}
