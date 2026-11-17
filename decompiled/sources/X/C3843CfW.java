package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: X.CfW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3843CfW implements InterfaceC3899Cgd {
    public final Context A00;
    public final AbstractC3769CeC A01;
    public final InterfaceC3891CgU A02;

    @Override // X.InterfaceC3899Cgd
    public final void Ac7(AbstractC3874Cg5 abstractC3874Cg5, int i, boolean z) {
        Context context = this.A00;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(HatchWebPageParserKt.UTF_8)));
        C3867Cfw c3867Cfw = (C3867Cfw) abstractC3874Cg5;
        String str = c3867Cfw.A01;
        adler32.update(str.getBytes(Charset.forName(HatchWebPageParserKt.UTF_8)));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        Ce5 ce5 = c3867Cfw.A00;
        byteBufferAllocate.putInt(Ce7.A00(ce5));
        adler32.update(byteBufferAllocate.array());
        byte[] bArr = c3867Cfw.A02;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        AbstractC3839CfS.A00(abstractC3874Cg5, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = C3842CfV.A00((C3842CfV) this.A02).rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(Ce7.A00(ce5))});
        try {
            Long lValueOf = Long.valueOf(cursorRawQuery.moveToNext() ? cursorRawQuery.getLong(0) : 0L);
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            AbstractC3769CeC abstractC3769CeC = this.A01;
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(abstractC3769CeC.A00(ce5, i, jLongValue));
            Set<EnumC3767CeA> set = ((C3768CeB) ((Ce9) abstractC3769CeC).A01.get(ce5)).A02;
            if (set.contains(EnumC3767CeA.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC3767CeA.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC3767CeA.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", Ce7.A00(ce5));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            BV6.A1K("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", FGI.A0M("TransportRuntime.", "JobInfoScheduler"), new Object[]{abstractC3874Cg5, Integer.valueOf(value), Long.valueOf(abstractC3769CeC.A00(ce5, i, jLongValue)), lValueOf, Integer.valueOf(i)});
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public C3843CfW(Context context, AbstractC3769CeC abstractC3769CeC, InterfaceC3891CgU interfaceC3891CgU) {
        this.A00 = context;
        this.A02 = interfaceC3891CgU;
        this.A01 = abstractC3769CeC;
    }
}
