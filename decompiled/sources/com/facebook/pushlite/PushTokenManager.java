package com.facebook.pushlite;

import X.AbstractC3938ChQ;
import X.AbstractC5321DgF;
import X.BV4;
import X.BzK;
import X.C3936ChK;
import X.C3937ChP;
import X.C3942ChY;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C79;
import X.CFK;
import X.CFL;
import X.CHV;
import X.CHZ;
import X.DQZ;
import X.EtU;
import X.F0C;
import X.FGI;
import X.InterfaceC7409Eus;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.facebook.aura.R;
import com.facebook.aura.notifications.push.AuraPushManager$Companion$createRefresherConfig$1;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.crudolib.prefs.LightSharedPreferencesImpl;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class PushTokenManager {
    public AbstractC3938ChQ<?> A00;
    public boolean A01;
    public final DQZ<String, InterfaceC7409Eus> A02;
    public final AuraPushManager$Companion$createRefresherConfig$1 A03;
    public final Function0<EtU> A06;
    public final Context A07;
    public final F0C A05 = AbstractC5321DgF.A01(C79.A0C, this, 4);
    public final F0C A04 = AbstractC5321DgF.A01(C79.A00, this, 3);

    public final synchronized void A01(String str) {
        F0C f0c = this.A05;
        if (((EtU) f0c.getValue()).A01.getBoolean(FGI.A0M(str, ".enabled"), true)) {
            BzK bzKA02 = BzK.A02(((EtU) f0c.getValue()).A01);
            bzKA02.Aae(str);
            BzK.A06(bzKA02, str);
            A00(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.HashSet] */
    public static final void A00(PushTokenManager pushTokenManager) {
        AbstractC3938ChQ<?> abstractC3938ChQ;
        CHZ chzA00;
        CHZ chzA002;
        C3942ChY c3942ChY = (C3942ChY) pushTokenManager.A04.getValue();
        Iterator it = c3942ChY.A02().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            EtU etU = c3942ChY.A03;
            C7384Etj.A0Y(str, 0);
            LightSharedPreferencesImpl lightSharedPreferencesImpl = (LightSharedPreferencesImpl) etU.A01;
            LightSharedPreferencesImpl.A02(lightSharedPreferencesImpl);
            BzK bzK = new BzK(lightSharedPreferencesImpl);
            bzK.Aae(FGI.A0M(str, ".pause_token_refresh"));
            bzK.Aae(FGI.A0M(str, ".regis_tried_count"));
            bzK.apply();
        }
        synchronized (pushTokenManager) {
            if (!pushTokenManager.A01) {
                pushTokenManager.A01 = true;
                pushTokenManager.A00 = pushTokenManager.A03.jobSchedulerCompat();
            }
            abstractC3938ChQ = pushTokenManager.A00;
        }
        if (abstractC3938ChQ == null) {
            Context context = pushTokenManager.A07;
            context.startService(new Intent(context, (Class<?>) PushLiteFallbackJobService.class));
            return;
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("__VERSION_CODE", BuildConstants.A01());
        try {
            synchronized (abstractC3938ChQ) {
                chzA00 = abstractC3938ChQ.A00;
                if (chzA00 == null) {
                    chzA00 = CHZ.A00(abstractC3938ChQ.A01, 0);
                    abstractC3938ChQ.A00 = chzA00;
                }
            }
            Class cls = (Class) chzA00.A02.get(R.id.jobscheduler_pushlist_refresh_token_job);
            if (cls == null) {
                synchronized (abstractC3938ChQ) {
                    chzA002 = abstractC3938ChQ.A00;
                    if (chzA002 == null) {
                        chzA002 = CHZ.A00(abstractC3938ChQ.A01, 0);
                        abstractC3938ChQ.A00 = chzA002;
                    }
                }
                throw BV4.A0c(C60P.A1P(" was not found. buildOutOfSync: ", C60O.A0y("jobId: ", R.id.jobscheduler_pushlist_refresh_token_job), chzA002.A00));
            }
            C3937ChP c3937ChP = (C3937ChP) abstractC3938ChQ;
            Context context2 = c3937ChP.A01;
            C3936ChK c3936ChKA00 = C3936ChK.A00(context2);
            synchronized (c3936ChKA00) {
                ComponentName componentName = new ComponentName(context2, (Class<?>) cls);
                try {
                    try {
                        JobScheduler jobScheduler = c3937ChP.A00;
                        JobInfo.Builder builder = new JobInfo.Builder(R.id.jobscheduler_pushlist_refresh_token_job, componentName);
                        builder.setMinimumLatency(0L);
                        builder.setRequiredNetworkType(1);
                        builder.setExtras(persistableBundle);
                        if (jobScheduler.schedule(builder.build()) > 0) {
                            c3936ChKA00.A00.put(R.id.jobscheduler_pushlist_refresh_token_job, true);
                        }
                    } catch (NullPointerException e) {
                        if (!Build.MANUFACTURER.equalsIgnoreCase("OPPO") && !Build.BRAND.equalsIgnoreCase("OPPO")) {
                            throw e;
                        }
                        Object[] objArr = {componentName};
                        if (CFL.A00()) {
                            CFK.A09("DisabledServiceWorkaround", StringFormatUtil.formatStrLocaleSafe("NPE when using job scheduler(possible framework bug); cannot schedule job for %s", objArr), e);
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    CHV.A00(componentName, context2, e2);
                }
            }
        } catch (RuntimeException e3) {
            CFK.A08("JobSchedulerCompat", "getServiceInfoParser Runtime Exception", e3);
        }
    }

    public PushTokenManager(Context context, DQZ dqz, AuraPushManager$Companion$createRefresherConfig$1 auraPushManager$Companion$createRefresherConfig$1, Function0 function0) {
        this.A07 = context;
        this.A02 = dqz;
        this.A03 = auraPushManager$Companion$createRefresherConfig$1;
        this.A06 = function0;
    }
}
