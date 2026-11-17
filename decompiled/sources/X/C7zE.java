package X;

import android.content.Context;
import android.os.Build;
import androidx.glance.appwidget.AsyncRequestWorker;
import androidx.glance.appwidget.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* renamed from: X.7zE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7zE {
    public static final boolean A00(Context context, G0U<? super C76r, Unit> g0u) {
        if (!C6I9.A00.get() && (!"vivo".equals(Build.MANUFACTURER) || Build.VERSION.SDK_INT >= 35)) {
            return false;
        }
        AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) C064476g.DEFAULT_INSTANCE.A05(C79.A0P);
        g0u.invoke(abstractC10440Hhn);
        GF0 gf0A00 = abstractC10440Hhn.A00();
        EK5 ek5A02 = F3R.A02(context);
        F1d f1d = new F1d(AsyncRequestWorker.class);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        try {
            int iA04 = gf0A00.A04(null);
            byte[] bArr = new byte[iA04];
            GG5 gg5 = new GG5(bArr, iA04);
            GG0 gg0A00 = C9359GFs.A02.A00(gf0A00.getClass());
            C9372GGi c9372GGi = ((CodedOutputStream) gg5).A00;
            if (c9372GGi == null) {
                c9372GGi = new C9372GGi(gg5);
            }
            gg0A00.Aj4(c9372GGi, gf0A00);
            if (gg5.A01 - gg5.A00 != 0) {
                throw C3cG.A0Q(AbstractC7606F5t.A00(28));
            }
            Byte[] bArr2 = new Byte[iA04];
            for (int i = 0; i < iA04; i++) {
                bArr2[i] = Byte.valueOf(bArr[i]);
            }
            f1d.A03(C60R.A0J("request", bArr2, linkedHashMapA0j));
            ek5A02.A06(f1d.A01());
            C7yC c7yC = C7yC.A04;
            F1d f1d2 = new F1d(AsyncRequestWorker.class);
            f1d2.A02(3650L, TimeUnit.DAYS);
            F1w f1w = new F1w();
            f1w.A04 = true;
            f1d2.A00.A0B = f1w.A00();
            ek5A02.A04(c7yC, f1d2.A01(), "updateRequestWorkerKeepEnabled");
            return true;
        } catch (IOException e) {
            throw new RuntimeException(FGI.A0h(AbstractC7606F5t.A00(31), C60Q.A0e(gf0A00), " to a ", "byte array", AbstractC7606F5t.A00(12)), e);
        }
    }
}
