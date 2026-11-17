package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public final class E9X {
    public static final Object A07 = C3cG.A0T();
    public static volatile E9X A08;
    public final Bx8 A01;
    public final BxA A02;
    public final ReadWriteLock A05 = new ReentrantReadWriteLock();
    public volatile int A06 = 3;
    public final Set<C6498E9f> A04 = new Ao0(0);
    public final InterfaceC6501E9i A03 = new C6500E9h();
    public final E9b A00 = new E9b(this);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:19:0x0069, B:21:0x006d, B:23:0x0071, B:25:0x0080, B:30:0x00a2, B:32:0x00ac, B:36:0x00b2, B:38:0x00be, B:39:0x00c1, B:41:0x00ce, B:43:0x00d4, B:45:0x00de, B:26:0x0090), top: B:61:0x0069 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence A03(java.lang.CharSequence r13, int r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9X.A03(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }

    public static E9X A00() {
        E9X e9x;
        synchronized (A07) {
            e9x = A08;
            BeS.A07(AnonymousClass002.A1X(e9x), "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return e9x;
    }

    public final int A01() {
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.readLock().lock();
        try {
            return this.A06;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public final void A04() {
        Set<C6498E9f> set = this.A04;
        ArrayList arrayListA11 = C60O.A11(set.size());
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.writeLock().lock();
        try {
            this.A06 = 1;
            arrayListA11.addAll(set);
            set.clear();
            BV4.A1P(readWriteLock);
            for (int i = 0; i < arrayListA11.size(); i++) {
                C6498E9f c6498E9f = (C6498E9f) arrayListA11.get(i);
                c6498E9f.A01.execute(new RunnableC6497E9e(c6498E9f));
            }
        } catch (Throwable th) {
            BV4.A1P(readWriteLock);
            throw th;
        }
    }

    public final void A07(Throwable th) {
        Set<C6498E9f> set = this.A04;
        ArrayList arrayListA11 = C60O.A11(set.size());
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.writeLock().lock();
        try {
            this.A06 = 2;
            arrayListA11.addAll(set);
            set.clear();
            BV4.A1P(readWriteLock);
            for (int i = 0; i < arrayListA11.size(); i++) {
                C6498E9f c6498E9f = (C6498E9f) arrayListA11.get(i);
                c6498E9f.A01.execute(new E9d(c6498E9f, th));
            }
        } catch (Throwable th2) {
            BV4.A1P(readWriteLock);
            throw th2;
        }
    }

    public E9X(Bx8 bx8, BxA bxA) {
        this.A02 = bxA;
        this.A01 = bx8;
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.writeLock().lock();
        BV4.A1P(readWriteLock);
        if (A01() == 0) {
            this.A00.A00();
        }
    }

    public final int A02(CharSequence charSequence, int i) {
        BeS.A07(BV7.A1Q(A01()), "Not initialized yet");
        BeS.A03(charSequence, "charSequence cannot be null");
        E9b e9b = this.A00;
        if (e9b.A01) {
            return -1;
        }
        E9T e9t = e9b.A02;
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            E9U[] e9uArr = (E9U[]) spanned.getSpans(i, i + 1, E9U.class);
            if (e9uArr.length > 0) {
                return spanned.getSpanStart(e9uArr[0]);
            }
        }
        E9V e9v = (E9V) E9T.A00(e9t, null, charSequence, null, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, 1, i, true);
        if (e9v != null) {
            return e9v.A01;
        }
        return -1;
    }

    public final void A05(EditorInfo editorInfo) {
        if (A01() != 1 || editorInfo == null) {
            return;
        }
        Bundle bundleA0N = editorInfo.extras;
        if (bundleA0N == null) {
            bundleA0N = BV6.A0N();
            editorInfo.extras = bundleA0N;
        }
        E9b e9b = this.A00;
        if (e9b.A01) {
            return;
        }
        bundleA0N.putInt("android.support.text.emoji.emojiCompat_metadataVersion", CLp.A00(e9b.A03.A08));
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public final void A06(AbstractC6499E9g abstractC6499E9g) {
        Executor executor;
        Runnable e9d;
        Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
        handlerCreateAsync.getClass();
        F53 f53 = new F53(handlerCreateAsync, 0);
        C6498E9f c6498E9f = new C6498E9f();
        c6498E9f.A00 = abstractC6499E9g;
        c6498E9f.A01 = f53;
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.writeLock().lock();
        try {
            if (this.A06 == 1) {
                executor = c6498E9f.A01;
                e9d = new RunnableC6497E9e(c6498E9f);
            } else if (this.A06 != 2) {
                this.A04.add(c6498E9f);
            } else {
                IllegalStateException illegalStateExceptionA0Q = C3cG.A0Q("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause.");
                executor = c6498E9f.A01;
                e9d = new E9d(c6498E9f, illegalStateExceptionA0Q);
            }
            executor.execute(e9d);
        } finally {
            BV4.A1P(readWriteLock);
        }
    }
}
