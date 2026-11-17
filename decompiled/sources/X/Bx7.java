package X;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class Bx7 implements BxA {
    public final Context A00;

    @Override // X.BxA
    public final void APg(final CLi cLi) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Ev6("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: X.CLf
            public static final String __redex_internal_original_name = "EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0";

            /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
            
                r9 = r4.authority;
                r10 = ((android.content.pm.PackageItemInfo) r4).packageName;
                r8 = r7.getPackageInfo(r10, 64).signatures;
                r7 = X.C3cG.A0h();
                r4 = r8.length;
                r1 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
            
                if (r1 >= r4) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
            
                r7.add(r8[r1].toByteArray());
                r1 = r1 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
            
                r4 = new X.CLg(r6, new X.CLn(r9, r10, "emojicompat-emoji-font", null, null, java.util.Collections.singletonList(r7)), X.CLj.A00);
                new X.C3424CMn();
                r1 = r4.A05;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
            
                monitor-enter(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
            
                r4.A01 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
            
                monitor-exit(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
            
                r4.APg(new X.CLh(r2, r5, r3));
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
            
                throw r0;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r14 = this;
                    X.Bx7 r5 = r2
                    X.CLi r2 = r1
                    java.util.concurrent.ThreadPoolExecutor r3 = r3
                    android.content.Context r6 = r5.A00     // Catch: java.lang.Throwable -> L93
                    r12 = 0
                    android.content.pm.PackageManager r7 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L93
                    java.lang.String r0 = "Package manager required to locate emoji font provider"
                    X.BeS.A03(r7, r0)     // Catch: java.lang.Throwable -> L93
                    java.lang.String r0 = "androidx.content.action.LOAD_EMOJI_FONT"
                    android.content.Intent r1 = X.C60P.A03(r0)     // Catch: java.lang.Throwable -> L93
                    r0 = 0
                    java.util.List r0 = r7.queryIntentContentProviders(r1, r0)     // Catch: java.lang.Throwable -> L93
                    java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L93
                L21:
                    boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L93
                    if (r0 == 0) goto L8c
                    java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L93
                    android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.Throwable -> L93
                    android.content.pm.ProviderInfo r4 = r0.providerInfo     // Catch: java.lang.Throwable -> L93
                    if (r4 == 0) goto L21
                    android.content.pm.ApplicationInfo r0 = r4.applicationInfo     // Catch: java.lang.Throwable -> L93
                    if (r0 == 0) goto L21
                    int r0 = r0.flags     // Catch: java.lang.Throwable -> L93
                    r1 = 1
                    r0 = r0 & 1
                    if (r0 != r1) goto L21
                    java.lang.String r9 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    java.lang.String r10 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    r0 = 64
                    android.content.pm.PackageInfo r0 = r7.getPackageInfo(r10, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    android.content.pm.Signature[] r8 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    java.util.ArrayList r7 = X.C3cG.A0h()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    int r4 = r8.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    r1 = 0
                L4e:
                    if (r1 >= r4) goto L5c
                    r0 = r8[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    r7.add(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    int r1 = r1 + 1
                    goto L4e
                L5c:
                    java.util.List r14 = java.util.Collections.singletonList(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    java.lang.String r11 = "emojicompat-emoji-font"
                    X.CLn r8 = new X.CLn     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    r13 = r12
                    r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> L93
                    X.CLk r0 = X.CLj.A00     // Catch: java.lang.Throwable -> L93
                    X.CLg r4 = new X.CLg     // Catch: java.lang.Throwable -> L93
                    r4.<init>(r6, r8, r0)     // Catch: java.lang.Throwable -> L93
                    X.CMn r0 = new X.CMn     // Catch: java.lang.Throwable -> L93
                    r0.<init>()     // Catch: java.lang.Throwable -> L93
                    java.lang.Object r1 = r4.A05     // Catch: java.lang.Throwable -> L93
                    monitor-enter(r1)     // Catch: java.lang.Throwable -> L93
                    r4.A01 = r3     // Catch: java.lang.Throwable -> L83
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                    X.CLh r0 = new X.CLh     // Catch: java.lang.Throwable -> L93
                    r0.<init>(r2, r5, r3)     // Catch: java.lang.Throwable -> L93
                    r4.APg(r0)     // Catch: java.lang.Throwable -> L93
                    return
                L83:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                    goto L92
                L86:
                    r1 = move-exception
                    java.lang.String r0 = "emoji2.text.DefaultEmojiConfig"
                    android.util.Log.wtf(r0, r1)     // Catch: java.lang.Throwable -> L93
                L8c:
                    java.lang.String r0 = "EmojiCompat font provider not available on this device."
                    java.lang.RuntimeException r0 = X.BV4.A0c(r0)     // Catch: java.lang.Throwable -> L93
                L92:
                    throw r0     // Catch: java.lang.Throwable -> L93
                L93:
                    r0 = move-exception
                    r2.A01(r0)
                    r3.shutdown()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CLf.run():void");
            }
        });
    }

    public Bx7(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
