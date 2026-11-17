package X;

import android.os.FileObserver;
import com.facebook.crudolib.prefs.LightSharedPreferencesImpl;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* renamed from: X.7cU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7cU {
    public static final Map<String, C4oT> A05 = C60O.A1C();
    public final Set<String> A02;
    public final Executor A03;
    public final F18<File> A04;
    public final Map<String, C4oT> A01 = C60O.A1C();
    public final Map<String, FileObserver> A00 = new HashMap();

    public final C4oT A00(final String str) {
        Map<String, C4oT> map = this.A01;
        C4oT c4oT = map.get(str);
        return c4oT == null ? map.computeIfAbsent(str, new Function(this) { // from class: X.7cV
            public final /* synthetic */ C7cU A00;

            {
                this.A00 = this;
            }

            @Override // java.util.function.Function
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                final String str2 = str;
                final C7cU c7cU = this.A00;
                return new LightSharedPreferencesImpl(str2, c7cU.A03, new F18<File>() { // from class: X.7cS
                    public volatile File A00;

                    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[Catch: all -> 0x010a, TryCatch #0 {, blocks: (B:40:0x00be, B:46:0x00ca, B:48:0x00d2, B:49:0x00e4, B:51:0x00ec, B:52:0x00f4, B:54:0x00fa), top: B:67:0x00be }] */
                    @Override // X.F18
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final /* bridge */ /* synthetic */ java.io.File get() {
                        /*
                            Method dump skipped, instructions count: 286
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C7cS.get():java.lang.Object");
                    }
                });
            }
        }) : c4oT;
    }

    public C7cU(Set set, Executor executor, F18 f18) {
        this.A03 = executor;
        this.A04 = f18;
        this.A02 = set;
    }
}
