package X;

import com.facebook.aura.utils.HatchUtil;
import java.util.List;

/* renamed from: X.Dkz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5581Dkz extends Dl9 {
    public final Integer A00;

    public C5581Dkz(Dl9 dl9, String str) {
        super(dl9.A0A, dl9.A0B, dl9.A09, dl9.A08, dl9.A07, dl9.A0E, dl9.A0C, dl9.A0D, dl9.A0F, dl9.A00, dl9.A02, dl9.A01, dl9.A05, dl9.A06, dl9.A04, dl9.A03, dl9.A0G, dl9.A0H);
        this.A00 = HatchUtil.TYPING_INDICATOR_STATE_ON.equals(str) ? C79.A01 : HatchUtil.TYPING_INDICATOR_STATE_OFF.equals(str) ? C79.A0C : "on_with_spatial_support".equals(str) ? C79.A0K : "bandwidth_only".equals(str) ? C79.A0P : C79.A00;
    }

    public static boolean A00(Dl9 dl9, Dl9 dl92) {
        List<AbstractC5553DkW> list = dl9.A0E;
        if (list.isEmpty()) {
            return false;
        }
        List<AbstractC5553DkW> list2 = dl92.A0E;
        return !list2.isEmpty() && AbstractC5553DkW.A00(list, 0).A0J == AbstractC5553DkW.A00(list2, 0).A0J && C6xC.A00(AbstractC5553DkW.A00(list, 0).A0a, AbstractC5553DkW.A00(list2, 0).A0a);
    }
}
