package X;

import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.Eeq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7044Eeq implements InterfaceC7068EfO {
    public final /* synthetic */ C7045Eer A00;

    public C7044Eeq(C7045Eer c7045Eer) {
        this.A00 = c7045Eer;
    }

    @Override // X.InterfaceC7068EfO
    public final InterfaceC7064EfB decode(C6988Edo c6988Edo, int i, InterfaceC7034Eeg interfaceC7034Eeg, C7198EiA c7198EiA) throws IOException {
        C6988Edo.A03(c6988Edo);
        C7003Ee6 c7003Ee6 = c6988Edo.A07;
        C7045Eer c7045Eer = this.A00;
        ColorSpace colorSpace = null;
        if (AnonymousClass001.A1X(c7045Eer.A00.get())) {
            C6988Edo.A03(c6988Edo);
            colorSpace = c6988Edo.A06;
        }
        if (c7003Ee6 == AbstractC6994Edv.A07) {
            EfF efFA00 = c7045Eer.A02.A00(c7198EiA.A01, colorSpace, c6988Edo, i);
            try {
                efFA00.getClass();
                C6988Edo.A03(c6988Edo);
                int i2 = c6988Edo.A02;
                C6988Edo.A03(c6988Edo);
                C7066EfD c7066EfD = new C7066EfD(efFA00, interfaceC7034Eeg, i2, c6988Edo.A00);
                c7066EfD.putExtra("is_rounded", AnonymousClass001.A0h());
                efFA00.close();
                return c7066EfD;
            } catch (Throwable th) {
                if (efFA00 != null) {
                    efFA00.close();
                }
                throw th;
            }
        }
        if (c7003Ee6 == AbstractC6994Edv.A04 || c7003Ee6 == AbstractC6994Edv.A09) {
            C6988Edo.A03(c6988Edo);
            if (c6988Edo.A05 != -1) {
                C6988Edo.A03(c6988Edo);
                if (c6988Edo.A01 != -1) {
                    Map<C7003Ee6, InterfaceC7068EfO> map = c7045Eer.A03;
                    if (map != null) {
                        InterfaceC7068EfO interfaceC7068EfO = map.get(c7003Ee6);
                        if (!c7198EiA.A03 && interfaceC7068EfO != null) {
                            return interfaceC7068EfO.decode(c6988Edo, i, interfaceC7034Eeg, c7198EiA);
                        }
                    }
                }
            }
            throw new DecodeException(c6988Edo, FGI.A0M(c7003Ee6.A00, " image width or height is incorrect"));
        }
        if (c7003Ee6 == AbstractC6994Edv.A01) {
            return null;
        }
        if (c7003Ee6 == C7003Ee6.A02) {
            throw new DecodeException(c6988Edo, "unknown image format");
        }
        return c7045Eer.A00(c7198EiA, c6988Edo);
    }
}
