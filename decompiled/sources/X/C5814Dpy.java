package X;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.common.base.Supplier;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Dpy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5814Dpy {
    public final Handler A00;
    public final C6443E5w A01;
    public final InterfaceC5791Dpa A02;
    public final InterfaceC6063Duy<T, PreloadStatusT> A03;
    public final Map<C5704Dnm, C5814Dpy<T, PreloadStatusT>.MediaSourceHolder> A04;
    public final PriorityQueue<C5814Dpy<T, PreloadStatusT>.MediaSourceHolder> A05;
    public final Handler A06;
    public final LruCache<String, String> A07;
    public final C5813Dpx A08;
    public final C5616Dlx A09;
    public final HeroPlayerSetting A0A;

    public C5814Dpy(LruCache lruCache, C5813Dpx c5813Dpx, InterfaceC6063Duy interfaceC6063Duy, C5616Dlx c5616Dlx, HeroPlayerSetting heroPlayerSetting, Supplier supplier) {
        InterfaceC5791Dpa interfaceC5791Dpa = (InterfaceC5791Dpa) supplier.get();
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.A00 = handler;
        this.A03 = interfaceC6063Duy;
        this.A02 = interfaceC5791Dpa;
        this.A01 = new C6443E5w(handler.getLooper(), E7C.A00, new F5C(1), new CopyOnWriteArraySet(), true);
        this.A04 = BV4.A0u();
        this.A05 = new PriorityQueue<>();
        this.A08 = c5813Dpx;
        this.A06 = new Handler(c5813Dpx.A00(), null);
        this.A0A = heroPlayerSetting;
        this.A09 = c5616Dlx;
        this.A07 = lruCache;
    }
}
