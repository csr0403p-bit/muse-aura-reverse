package X;

import androidx.transition.FragmentTransitionSupport;

/* renamed from: X.Fg5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8552Fg5 {
    public boolean A00;
    public boolean A01;

    public void A04(C2194B9z c2194B9z) {
        C8540Fft c8540Fft;
        Object obj;
        if (!(this instanceof C8540Fft) || (obj = (c8540Fft = (C8540Fft) this).A00) == null) {
            return;
        }
        AbstractC8522FfX abstractC8522FfX = c8540Fft.A04;
        float f = c2194B9z.A00;
        if (abstractC8522FfX instanceof FragmentTransitionSupport) {
            InterfaceC8449FeD interfaceC8449FeD = (InterfaceC8449FeD) obj;
            if (interfaceC8449FeD.isReady()) {
                long jAEs = interfaceC8449FeD.AEs();
                long j = (long) (f * jAEs);
                if (j == 0) {
                    j = 1;
                }
                if (j == jAEs) {
                    j = jAEs - 1;
                }
                interfaceC8449FeD.AdE(j);
            }
        }
    }

    public boolean A05() {
        return this instanceof C8535Ffo;
    }
}
