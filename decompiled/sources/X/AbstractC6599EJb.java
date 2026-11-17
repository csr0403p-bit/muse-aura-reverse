package X;

import com.facebook.aura.opengraph.HatchOpenGraphRepository;

/* renamed from: X.EJb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6599EJb {
    public static final void A00(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(HatchOpenGraphRepository.UNKNOWN_HOST);
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
