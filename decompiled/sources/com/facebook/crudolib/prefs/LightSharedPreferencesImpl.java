package com.facebook.crudolib.prefs;

import X.BV4;
import X.BzE;
import X.BzF;
import X.BzK;
import X.C3138BzJ;
import X.C3140BzM;
import X.C3cG;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.F18;
import X.FGI;
import X.InterfaceC3137BzH;
import android.os.Handler;
import android.os.StrictMode;
import android.os.Trace;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class LightSharedPreferencesImpl implements C4oT {
    public C3138BzJ A00;
    public Throwable A01;
    public final C3140BzM A02;
    public final Object A03;
    public final Thread A04;
    public final Map<InterfaceC3137BzH, Handler> A05;
    public final Map<String, Object> A06;
    public final Map<String, Map<InterfaceC3137BzH, Handler>> A07;
    public final CountDownLatch A08;
    public final Executor A09;
    public final AtomicBoolean A0A;
    public volatile boolean A0B;
    public final String _name;
    public static final Object A0D = C3cG.A0T();
    public static final Handler A0C = C60O.A02();

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 com.facebook.crudolib.prefs.LightSharedPreferencesImpl) */
    public static final synchronized void A03(LightSharedPreferencesImpl lightSharedPreferencesImpl, Set set) {
        synchronized (lightSharedPreferencesImpl) {
            Throwable th = new Throwable("commit stack");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                lightSharedPreferencesImpl.A04(str, th, lightSharedPreferencesImpl.A05);
                Map<InterfaceC3137BzH, Handler> map = lightSharedPreferencesImpl.A07.get(str);
                if (map != null) {
                    lightSharedPreferencesImpl.A04(str, th, map);
                }
            }
            lightSharedPreferencesImpl.A01 = null;
        }
    }

    @Override // X.C4oT
    public final synchronized void Aa2(InterfaceC3137BzH interfaceC3137BzH) {
        this.A05.put(interfaceC3137BzH, A0C);
    }

    @Override // X.C4oT
    public final synchronized void Ahk(InterfaceC3137BzH interfaceC3137BzH) {
        C7384Etj.A0Y(interfaceC3137BzH, 0);
        this.A05.remove(interfaceC3137BzH);
    }

    @Override // X.C4oT
    public final boolean contains(String str) {
        boolean zContainsKey;
        C7384Etj.A0Y(str, 0);
        A02(this);
        synchronized (this.A03) {
            zContainsKey = this.A06.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // X.C4oT
    public final int getInt(String str, int i) {
        C7384Etj.A0Y(str, 0);
        A02(this);
        synchronized (this.A03) {
            try {
                Integer num = (Integer) this.A06.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (ClassCastException e) {
                throw A00(e, str);
            }
        }
        return i;
    }

    @Override // X.C4oT
    public final long getLong(String str, long j) {
        C7384Etj.A0Y(str, 0);
        A02(this);
        synchronized (this.A03) {
            try {
                Long l = (Long) this.A06.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (ClassCastException e) {
                throw A00(e, str);
            }
        }
        return j;
    }

    @Override // X.C4oT
    public final String getString(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        A02(this);
        synchronized (this.A03) {
            try {
                String str3 = (String) this.A06.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } catch (ClassCastException e) {
                throw A00(e, str);
            }
        }
        return str2;
    }

    public /* synthetic */ LightSharedPreferencesImpl(String str, Executor executor, F18 f18) {
        C3138BzJ c3138BzJ = new C3138BzJ();
        C7384Etj.A0Y(str, 0);
        this._name = str;
        this.A03 = new Object();
        this.A02 = new C3140BzM(f18);
        this.A00 = c3138BzJ;
        this.A07 = new HashMap();
        this.A05 = new HashMap();
        this.A06 = new HashMap();
        this.A0A = new AtomicBoolean(false);
        this.A09 = executor;
        this.A08 = new CountDownLatch(1);
        Thread thread = new Thread(new BzE(this, c3138BzJ), FGI.A0M("LSP-", A01(str)));
        this.A04 = thread;
        A05(thread, Math.max(Thread.currentThread().getPriority() - 1, 1));
        thread.start();
    }

    private final RuntimeException A00(Exception exc, String str) {
        return BV4.A0d(FGI.A0d("LightSharedPreferences threw an exception for Key: ", str, "; Raw file: ", this.A02.A01()), exc);
    }

    public static final void A02(LightSharedPreferencesImpl lightSharedPreferencesImpl) {
        if (lightSharedPreferencesImpl.A0B) {
            return;
        }
        CountDownLatch countDownLatch = lightSharedPreferencesImpl.A08;
        if (countDownLatch.getCount() == 1) {
            StrictMode.noteSlowCall("Blocked on LightSharedPreferences Init");
        }
        String strA0M = FGI.A0M("LightSharedPreferences.waitIfNotLoaded: ", A01(lightSharedPreferencesImpl._name));
        Trace.beginSection(strA0M.substring(0, Math.min(strA0M.length(), 127)));
        while (!lightSharedPreferencesImpl.A0B) {
            Thread thread = lightSharedPreferencesImpl.A04;
            if (thread != null && thread.getState() != Thread.State.TERMINATED && lightSharedPreferencesImpl.A00 != null) {
                int priority = Thread.currentThread().getPriority();
                synchronized (lightSharedPreferencesImpl) {
                    if (priority > thread.getPriority()) {
                        A05(thread, priority);
                    }
                }
            }
            try {
                continue;
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
            }
        }
        Trace.endSection();
    }

    public static final String A01(String str) {
        boolean z;
        StringBuilder sb = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        boolean z2 = false;
        while (i < length) {
            char c = charArray[i];
            if (c > '9' || c < '0') {
                z = false;
            } else {
                z = true;
                if (z2) {
                    i++;
                    z2 = z;
                } else {
                    c = '#';
                }
            }
            sb.append(c);
            i++;
            z2 = z;
        }
        return sb.toString();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/Map<LX/BzH;+Landroid/os/Handler;>;Ljava/lang/Throwable;)V */
    private final void A04(String str, Throwable th, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((Handler) entry.getValue()).post(new BzF((InterfaceC3137BzH) entry.getKey(), this, str, th));
        }
    }

    public static final void A05(Thread thread, int i) {
        try {
            thread.setPriority(i);
        } catch (IllegalArgumentException e) {
            if (thread.getState() != Thread.State.TERMINATED) {
                throw new IllegalArgumentException(FGI.A0V("Failed to set thread priority - thread state:", thread.getState().name(), " priority:", i), e);
            }
        }
    }

    @Override // X.C4oT
    public final BzK A9q() {
        A02(this);
        return new BzK(this);
    }

    @Override // X.C4oT
    public final Map<String, ?> ACL() {
        HashMap mapA0w;
        A02(this);
        synchronized (this.A03) {
            mapA0w = BV4.A0w(this.A06);
        }
        return mapA0w;
    }

    @Override // X.C4oT
    public final Boolean ACw(String str) {
        Boolean bool;
        A02(this);
        synchronized (this.A03) {
            try {
                bool = (Boolean) this.A06.get(str);
            } catch (ClassCastException e) {
                throw A00(e, str);
            }
        }
        return bool;
    }

    @Override // X.C4oT
    public final boolean getBoolean(String str, boolean z) {
        A02(this);
        synchronized (this.A03) {
            try {
                Boolean bool = (Boolean) this.A06.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (ClassCastException e) {
                throw A00(e, str);
            }
        }
        return z;
    }

    @Override // X.C4oT
    public final float getFloat(String str, float f) {
        A02(this);
        synchronized (this.A03) {
            try {
                Float f2 = (Float) this.A06.get(str);
                if (f2 != null) {
                    f = f2.floatValue();
                }
            } catch (ClassCastException e) {
                throw A00(e, str);
            }
        }
        return f;
    }

    @Override // X.C4oT
    public final int getSize() {
        int size;
        A02(this);
        synchronized (this.A03) {
            size = this.A06.size();
        }
        return size;
    }

    @Override // X.C4oT
    public final Set<String> getStringSet(String str, Set<String> set) {
        A02(this);
        synchronized (this.A03) {
            try {
                Set<String> setA10 = BV4.A10(str, this.A06);
                if (setA10 != null) {
                    set = setA10;
                }
            } catch (ClassCastException e) {
                throw A00(e, str);
            }
        }
        return set;
    }
}
