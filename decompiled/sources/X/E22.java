package X;

import com.facebook.aura.sharesheet.HatchShareSheetRepository;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class E22 {
    public static String A00(List<C6366E2t> list) {
        Iterator<C6366E2t> it = list.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().A03.A08.A0b;
            if (BV7.A1Z(str2, "video")) {
                return HatchShareSheetRepository.MUTED_VIDEO_MIME;
            }
            if (BV7.A1Z(str2, "audio")) {
                z = true;
            } else if (AbstractC6161Dx4.A07(str2)) {
                if (C6xC.A00(str2, "image/heic")) {
                    str = "image/heif";
                } else if (C6xC.A00(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str == null ? "application/mp4" : str;
    }
}
