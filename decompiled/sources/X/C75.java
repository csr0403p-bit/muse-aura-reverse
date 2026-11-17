package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Service;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$SplashTransition;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes5.dex */
public final class C75 implements InterfaceC3235C4s {
    public static final Object A0S = new ApplicationLifecycleDetector$SplashTransition();
    public C3264C6k A00;
    public C57 A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public WeakReference<Object> A06;
    public final Application A08;
    public final C76 A09;
    public final C78 A0A;
    public final C3232C4p A0B;
    public final C54 A0H;
    public final C7B A0I;
    public final C4X A0N;
    public final C3238C4v A0P;
    public final Handler A0M = C60O.A02();
    public final AtomicBoolean A0R = C60O.A1E();
    public final C7J A0Q = new C7J(this);
    public final InterfaceC3284C7y A0O = new C7E(this);
    public Integer A02 = C79.A01;
    public final Object A0J = C3cG.A0T();
    public final Object A0K = C3cG.A0T();
    public final C7F A0C = new C7F(this);
    public final C7K A0D = new C7K(this);
    public final C7L A0E = new C7L(this);
    public final C7M A0F = new C7M(this);
    public final C7N A0G = new C7N(this);
    public final boolean A0L = true;
    public final int A07 = 100;

    public C75(Application application, C76 c76, C4X c4x, C78 c78, C3232C4p c3232C4p, C57 c57, C3238C4v c3238C4v, C54 c54, C7B c7b) {
        this.A08 = application;
        this.A0H = c54;
        this.A0B = c3232C4p;
        this.A09 = c76;
        this.A0N = c4x;
        this.A01 = c57;
        this.A0A = c78;
        this.A0I = c7b;
        this.A0P = c3238C4v;
    }

    public static void A00(Activity activity, C75 c75) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (c75.A04) {
            return;
        }
        if (activity != null) {
            File file = c75.A0H.A05;
            BeS.A03(file, "Did you call SessionManager.init()?");
            try {
                FileWriter fileWriter = new FileWriter(C3cG.A0O(file, "first_intent.txt"), false);
                try {
                    fileWriter.write(activity.getIntent().toString());
                    fileWriter.close();
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        if (c75.A00 != null) {
            if (c75.A0L) {
                c75.A09.A01(C79.A0Z, C7C.A01);
            }
            C3264C6k c3264C6k = c75.A00;
            long jUptimeMillis = SystemClock.uptimeMillis() - c75.A0H.A02;
            boolean z = c75.A03;
            synchronized (c3264C6k.A02) {
                C3264C6k.A02(c3264C6k, Long.toString(jUptimeMillis), 167, 10, false);
                c3264C6k.A01.A00.put(178, (byte) (z ? 49 : 48));
                C3264C6k.A00(c3264C6k);
            }
        }
        c75.A04 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd A[Catch: all -> 0x00e2, TryCatch #1 {, blocks: (B:46:0x0082, B:48:0x0089, B:50:0x008d, B:52:0x0091, B:80:0x00d9, B:82:0x00dd, B:83:0x00e0, B:54:0x0095, B:55:0x0097, B:56:0x009b, B:58:0x009f, B:59:0x00a6, B:72:0x00c8, B:75:0x00ce, B:78:0x00d3, B:61:0x00aa, B:63:0x00b0, B:66:0x00b7, B:68:0x00bb, B:69:0x00c2), top: B:107:0x0082, inners: #0 }] */
    @Override // X.InterfaceC3235C4s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75.start():void");
    }

    public static void A01(Activity activity, C75 c75, Integer num) {
        boolean zIsFinishing;
        if (activity != null) {
            zIsFinishing = activity.isFinishing();
        } else {
            activity = null;
            zIsFinishing = false;
        }
        c75.A05(activity, num, null, zIsFinishing);
    }

    public static void A02(ActivityManager.RunningAppProcessInfo runningAppProcessInfo, ActivityManager.RunningAppProcessInfo runningAppProcessInfo2) {
        runningAppProcessInfo2.lastTrimLevel = runningAppProcessInfo.lastTrimLevel;
    }

    public final void A05(Activity activity, Integer num, String str, boolean z) {
        C76 c76;
        Integer num2;
        String simpleName;
        Object key;
        char cCharAt;
        boolean z2;
        boolean zA03;
        boolean zA04;
        char c;
        int i;
        int size;
        final C4X c4x;
        Object obj;
        C3275C7c c3275C7c;
        if (this.A00 == null) {
            CFK.A06(C9Y.TAG, "ApplicationLifecycleDetector.start() wasn't called?");
            return;
        }
        C3232C4p c3232C4p = this.A0B;
        EnumC3223C4g enumC3223C4g = EnumC3223C4g.CRITICAL_REPORT;
        if (c3232C4p.A0A) {
            return;
        }
        EnumC3223C4g enumC3223C4g2 = EnumC3223C4g.LARGE_REPORT;
        if (c3232C4p.A0B) {
            return;
        }
        synchronized (this) {
            c76 = this.A09;
            synchronized (c76) {
                num2 = c76.A03 ? C79.A0Y : C79.A02;
                simpleName = null;
                key = null;
                WeakReference<Object> weakReference = c76.A02;
                if (weakReference == null || (obj = weakReference.get()) == null || (c3275C7c = c76.A07.get(obj)) == null) {
                    Iterator itA0i = C3cG.A0i(c76.A07);
                    while (itA0i.hasNext()) {
                        Map.Entry entry = (Map.Entry) itA0i.next();
                        if (((C3275C7c) entry.getValue()).A00.compareTo(num2) < 0) {
                            key = entry.getKey();
                            num2 = ((C3275C7c) entry.getValue()).A00;
                            simpleName = ((key instanceof Activity) || (key instanceof Service)) ? key.getClass().getSimpleName() : key.toString();
                            entry.getValue();
                            entry.getValue();
                            entry.getValue();
                        }
                    }
                } else {
                    key = obj;
                    num2 = c3275C7c.A00;
                    simpleName = ((obj instanceof Activity) || (obj instanceof Service)) ? C3cI.A0Y(obj) : obj.toString();
                }
            }
        }
        if (simpleName == null || (c4x = this.A0N) == null) {
            cCharAt = ' ';
        } else {
            synchronized (c4x) {
                Properties properties = c4x.A03;
                String property = properties.getProperty(simpleName);
                if (TextUtils.isEmpty(property)) {
                    char c2 = c4x.A00;
                    if (c2 == '~') {
                        cCharAt = PublicSuffixDatabase.EXCEPTION_MARKER;
                    } else {
                        char c3 = (char) (c2 + 1);
                        c4x.A00 = c3;
                        properties.setProperty(simpleName, Character.toString(c3));
                        c4x.A01.post(new Runnable() { // from class: X.C4Y
                            public static final String __redex_internal_original_name = "ForegroundEntityMapper$$ExternalSyntheticLambda0";

                            @Override // java.lang.Runnable
                            public final void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                                String str2;
                                String str3;
                                C4X c4x2 = c4x;
                                StringBuilder sbA0w = C60O.A0w();
                                sbA0w.append(c4x2.A02);
                                try {
                                    FileOutputStream fileOutputStreamA0I = BV4.A0I(BV4.A0G(AnonymousClass001.A0v("_entity", sbA0w)));
                                    try {
                                        Properties properties2 = new Properties();
                                        synchronized (c4x2) {
                                            properties2.putAll(c4x2.A03);
                                        }
                                        properties2.store(fileOutputStreamA0I, (String) null);
                                        fileOutputStreamA0I.close();
                                    } finally {
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    str2 = "ForegroundEntityMapper";
                                    str3 = "Error saving entity map";
                                    CFK.A08(str2, str3, e);
                                } catch (AssertionError e2) {
                                    e = e2;
                                    str2 = "ForegroundEntityMapper";
                                    str3 = "Error storing properties";
                                    CFK.A08(str2, str3, e);
                                }
                            }
                        });
                        cCharAt = c4x.A00;
                    }
                } else {
                    cCharAt = property.charAt(0);
                }
            }
        }
        this.A06 = BV4.A0q(key);
        if (activity != null) {
            zA03 = A03(activity);
            zA04 = A04(activity);
            z2 = true;
        } else {
            z2 = false;
            zA03 = false;
            zA04 = false;
        }
        C3264C6k c3264C6k = this.A00;
        switch (num.intValue()) {
            case 0:
                c = '0';
                break;
            case 1:
                c = '1';
                break;
            case 2:
                c = '2';
                break;
            default:
                c = '3';
                break;
        }
        synchronized (c76) {
            i = c76.A00;
        }
        Integer numValueOf = Integer.valueOf(i);
        synchronized (c76) {
            size = c76.A06.get(6).size();
        }
        C3264C6k.A01(c3264C6k, num2, numValueOf, Integer.valueOf(size), str, cCharAt, c, z, false, z2, zA03, zA04);
        if (num.equals(C79.A01) || num.equals(C79.A00)) {
            boolean zA00 = AbstractC3263C6j.A00(C74.A00(num2));
            C57 c57 = this.A01;
            if (c57 != null) {
                c57.ATR(zA00);
            }
        }
        C3228C4l c3228C4lA00 = C3228C4l.A00();
        c3232C4p.A06(c3228C4lA00, enumC3223C4g, this);
        c3232C4p.A06(c3228C4lA00, enumC3223C4g2, this);
    }

    @Override // X.InterfaceC3235C4s
    public final C3238C4v AH4() {
        return this.A0P;
    }

    @Override // X.InterfaceC3235C4s
    public final C5l AHs() {
        return C5l.A03;
    }

    public static boolean A03(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static boolean A04(Activity activity) {
        return activity.isInPictureInPictureMode();
    }

    @Override // X.InterfaceC3235C4s
    public final int AGC() {
        return 1000000;
    }
}
