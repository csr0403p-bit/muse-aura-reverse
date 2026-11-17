package androidx.camera.camera2.internal.compat.quirk;

import X.BV4;
import X.BV6;
import X.BX1;
import android.util.Size;
import com.facebook.aura.components.reactions.AuraDoubleTakeKt;
import com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class SmallDisplaySizeQuirk implements BX1 {
    public static final Map<String, Size> A00;

    static {
        HashMap mapA0u = BV4.A0u();
        A00 = mapA0u;
        mapA0u.put("REDMI NOTE 7", BV6.A0Q("REDMI NOTE 8", BV6.A0P(1080, 2340), mapA0u, 1080, 2340));
        mapA0u.put("REDMI NOTE 7S", BV6.A0Q("SM-A207M", BV6.A0P(720, 1560), mapA0u, 1080, 2340));
        mapA0u.put("SM-A127F", BV6.A0P(720, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS));
        mapA0u.put("V2029", BV6.A0Q("CPH2223", BV6.A0Q("VIVO 1920", BV6.A0Q("V2149", BV6.A0Q("220233L2I", BV6.A0Q("SM-A536E", BV6.A0P(1080, 2400), mapA0u, 720, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS), mapA0u, 720, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS), mapA0u, 1080, 2340), mapA0u, 1080, 2400), mapA0u, 720, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS));
        mapA0u.put("SM-A045M", BV6.A0Q("REDMI Y3", BV6.A0Q("CPH1901", BV6.A0P(720, 1520), mapA0u, 720, 1520), mapA0u, 720, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS));
        mapA0u.put("NOKIA 4.2", BV6.A0Q("CPH1909", BV6.A0Q("SM-A146U", BV6.A0P(1080, 2408), mapA0u, 720, 1520), mapA0u, 720, 1520));
        mapA0u.put("VIVO 1816", BV6.A0Q("SM-A137F", BV6.A0Q("SM-G960U1", BV6.A0P(HatchInviteStoryImageRenderer.TEXT_CENTER_Y_PX, 2960), mapA0u, 1080, 2408), mapA0u, 720, 1520));
        mapA0u.put("INFINIX X670", BV6.A0Q("SM-A125M", BV6.A0Q("NOKIA 2.4", BV6.A0Q("SM-A037F", BV6.A0Q("INFINIX X6817", BV6.A0P(720, 1612), mapA0u, 720, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS), mapA0u, 720, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS), mapA0u, 720, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS), mapA0u, 1080, 2400));
    }
}
