package X;

import android.content.Context;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CXV {
    public static CXV A02;
    public static boolean A03;
    public static final CXU A04 = new CXU();
    public final CXW A00;
    public final WeakReference<Context> A01;

    public static final C5616Dlx A00(CXV cxv) {
        CXW cxw = cxv.A00;
        Map<String, String> map = cxw.A03;
        HeroPlayerSetting heroPlayerSetting = cxw.A01;
        Context context = cxv.A01.get();
        CXY cxy = cxw.A02;
        InterfaceC5637DmL interfaceC5637DmL = cxw.A00;
        C5616Dlx c5616Dlx = C5616Dlx.A0a;
        if (c5616Dlx == null) {
            synchronized (C5616Dlx.class) {
                c5616Dlx = C5616Dlx.A0a;
                if (c5616Dlx == null) {
                    C5616Dlx.A0a = new C5616Dlx(context, interfaceC5637DmL, heroPlayerSetting, cxy, map);
                    c5616Dlx = C5616Dlx.A0a;
                }
            }
        }
        C7384Etj.A0U(c5616Dlx);
        return c5616Dlx;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/WeakReference<Landroid/content/Context;>;LX/CXW;)V */
    public CXV(CXW cxw, WeakReference weakReference) {
        this.A01 = weakReference;
        this.A00 = cxw;
        if (cxw.A04) {
            return;
        }
        A00(this);
    }

    public final C5616Dlx getInternalPlayerManagerPrivate() {
        return A00(this);
    }
}
