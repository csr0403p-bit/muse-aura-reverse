package com.google.firebase.iid;

import X.BV4;
import X.BV5;
import X.BV8;
import X.C04;
import X.C3527CSg;
import X.C3528CSh;
import X.C3535CSr;
import X.C3536CSs;
import X.C3538CSv;
import X.C3554CTr;
import X.C3cG;
import X.C60P;
import X.CRz;
import X.CSA;
import X.CSi;
import X.CSj;
import X.CT0;
import X.CT2;
import X.CT8;
import X.CTL;
import X.Eu7;
import X.RunnableC3537CSt;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class FirebaseInstanceId {
    public static C3536CSs A08;
    public static ScheduledExecutorService A09;
    public C3528CSh A00;
    public boolean A01;
    public final C3554CTr A02;
    public final CTL A03;
    public final CSi A04;
    public final C3527CSg A05;
    public final C3538CSv A06;
    public final Executor A07;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 com.google.firebase.iid.FirebaseInstanceId) */
    public static final synchronized void A03(FirebaseInstanceId firebaseInstanceId) {
        synchronized (firebaseInstanceId) {
            if (!firebaseInstanceId.A01) {
                firebaseInstanceId.A06(0L);
            }
        }
    }

    public final synchronized void A05() {
        A08.A01();
        if (this.A03.A00()) {
            A03(this);
        }
    }

    public final synchronized void A06(long j) {
        A04(new RunnableC3537CSt(this, this.A06, Math.min(Math.max(30L, j << 1), 28800L)), j);
        this.A01 = true;
    }

    public FirebaseInstanceId(C3554CTr c3554CTr, CT8 ct8, CSj cSj) {
        String strA00;
        C3554CTr.A01(c3554CTr);
        Context context = c3554CTr.A00;
        CSi cSi = new CSi(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = CT0.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
        this.A01 = false;
        if (CSi.A01(c3554CTr) == null) {
            throw C3cG.A0Q("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (A08 == null) {
                C3554CTr.A01(c3554CTr);
                A08 = new C3536CSs(context);
            }
        }
        this.A02 = c3554CTr;
        this.A04 = cSi;
        C3528CSh c3528CSh = this.A00;
        if (c3528CSh == null) {
            C3554CTr.A01(c3554CTr);
            c3528CSh = (C3528CSh) c3554CTr.A02.A02(C3528CSh.class);
            c3528CSh = (c3528CSh == null || c3528CSh.A01.A03() == 0) ? new C3528CSh(c3554CTr, cSi, cSj, threadPoolExecutor) : c3528CSh;
            this.A00 = c3528CSh;
        }
        this.A00 = c3528CSh;
        this.A07 = threadPoolExecutor2;
        this.A06 = new C3538CSv(A08);
        CTL ctl = new CTL(ct8, this);
        this.A03 = ctl;
        this.A05 = new C3527CSg(threadPoolExecutor);
        if (ctl.A00()) {
            if (!A07(A00(CSi.A01(this.A02)))) {
                C3538CSv c3538CSv = this.A06;
                synchronized (c3538CSv) {
                    strA00 = C3538CSv.A00(c3538CSv);
                }
                if (strA00 == null) {
                    return;
                }
            }
            A03(this);
        }
    }

    public static CT2 A00(String str) {
        CT2 ct2;
        CT2 ct22;
        C3536CSs c3536CSs = A08;
        synchronized (c3536CSs) {
            SharedPreferences sharedPreferences = c3536CSs.A01;
            StringBuilder sbA0r = BV5.A0r("*", BV5.A04("") + 4 + BV5.A04(str));
            sbA0r.append("");
            sbA0r.append("|T|");
            sbA0r.append(str);
            ct2 = null;
            String string = sharedPreferences.getString(C60P.A1M("|", "*", sbA0r), null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObjectA19 = BV4.A19(string);
                        ct22 = new CT2(jSONObjectA19.getString("token"), jSONObjectA19.getString("appVersion"), jSONObjectA19.getLong("timestamp"));
                    } catch (JSONException e) {
                        String strValueOf = String.valueOf(e);
                        Log.w("FirebaseInstanceId", C60P.A1M("Failed to parse token: ", strValueOf, BV4.A0p(BV5.A04(strValueOf) + 23)));
                    }
                } else {
                    ct22 = new CT2(string, null, 0L);
                }
                ct2 = ct22;
            }
        }
        return ct2;
    }

    public static final Object A01(CSA csa, FirebaseInstanceId firebaseInstanceId) throws Throwable {
        try {
            return CRz.A00(csa, TimeUnit.MILLISECONDS, 30000L);
        } catch (InterruptedException | TimeoutException unused) {
            throw BV4.A0K("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                throw new IOException(e);
            }
            if (!"INSTANCE_ID_RESET".equals(cause.getMessage())) {
                throw cause;
            }
            firebaseInstanceId.A05();
            throw cause;
        }
    }

    public static String A02() throws zzaa {
        Eu7 eu7A07;
        File fileA04;
        C3536CSs c3536CSs = A08;
        synchronized (c3536CSs) {
            Map<String, Eu7> map = c3536CSs.A03;
            eu7A07 = map.get("");
            if (eu7A07 == null) {
                try {
                    C3535CSr c3535CSr = c3536CSs.A02;
                    Context context = c3536CSs.A00;
                    zzaa e = null;
                    try {
                        fileA04 = C3535CSr.A04(context);
                    } catch (zzaa e2) {
                        e = e2;
                    }
                    if (fileA04.exists()) {
                        try {
                            eu7A07 = C3535CSr.A02(fileA04);
                        } catch (zzaa | IOException e3) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String strValueOf = String.valueOf(e3);
                                BV8.A1P(BV4.A0p(BV5.A04(strValueOf) + 40), "Failed to read key from file, retrying: ", strValueOf, "FirebaseInstanceId");
                            }
                            try {
                                eu7A07 = C3535CSr.A02(fileA04);
                            } catch (IOException e4) {
                                String strValueOf2 = String.valueOf(e4);
                                Log.w("FirebaseInstanceId", C60P.A1M("IID file exists, but failed to read from it: ", strValueOf2, BV4.A0p(BV5.A04(strValueOf2) + 45)));
                                throw new zzaa(e4);
                            }
                        }
                        C3535CSr.A06(context, eu7A07);
                    } else {
                        try {
                            eu7A07 = C3535CSr.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                            if (eu7A07 != null) {
                                C3535CSr.A00(context, eu7A07, false);
                            } else {
                                if (e != null) {
                                    throw e;
                                }
                                eu7A07 = c3535CSr.A07(context);
                            }
                        } catch (zzaa e5) {
                            throw e5;
                        }
                    }
                } catch (zzaa unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C3554CTr.A00()).A05();
                    eu7A07 = c3536CSs.A02.A07(c3536CSs.A00);
                }
                map.put("", eu7A07);
            }
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(eu7A07.A01.getPublic().getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static void A04(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledThreadPoolExecutor = A09;
            if (scheduledThreadPoolExecutor == null) {
                scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new C04("FirebaseInstanceId"));
                A09 = scheduledThreadPoolExecutor;
            }
            scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static FirebaseInstanceId getInstance(C3554CTr c3554CTr) {
        C3554CTr.A01(c3554CTr);
        return (FirebaseInstanceId) c3554CTr.A02.A02(FirebaseInstanceId.class);
    }

    public final boolean A07(CT2 ct2) {
        if (ct2 != null) {
            String strA05 = this.A04.A05();
            if (System.currentTimeMillis() <= ct2.A00 + 604800000 && strA05.equals(ct2.A02)) {
                return false;
            }
        }
        return true;
    }
}
