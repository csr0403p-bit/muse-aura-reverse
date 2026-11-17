package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.Handler;
import android.os.Message;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppCacheJobService;
import java.util.Iterator;

/* renamed from: X.F4k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7571F4k implements Handler.Callback {
    public final int $t;
    public final Object A00;

    public C7571F4k(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                C6443E5w c6443E5w = (C6443E5w) this.A00;
                Iterator it = c6443E5w.A05.iterator();
                while (it.hasNext()) {
                    E6X e6x = (E6X) it.next();
                    InterfaceC6255Dyy<T> interfaceC6255Dyy = c6443E5w.A04;
                    if (!e6x.A02 && e6x.A01) {
                        DzH dzHA00 = e6x.A00.A00();
                        e6x.A00 = new C6265DzI();
                        e6x.A01 = false;
                        interfaceC6255Dyy.ANy(dzHA00, e6x.A03);
                    }
                    if (((E6I) c6443E5w.A03).A00.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 1:
                E6E e6e = (E6E) this.A00;
                int i = message.what;
                if (i == 1) {
                    e6e.A06.A00();
                    return true;
                }
                if (i == 2) {
                    e6e.A07.A00();
                    return true;
                }
                if (i == 3) {
                    e6e.A08.A00();
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                e6e.A09.A00();
                return true;
            default:
                int i2 = message.what;
                if (i2 != 1) {
                    throw BV5.A0Q("Unknown msg: ", i2);
                }
                IsManagedAppCacheJobService isManagedAppCacheJobService = (IsManagedAppCacheJobService) this.A00;
                JobParameters jobParameters = (JobParameters) message.obj;
                while (!isManagedAppCacheJobService.A01) {
                    try {
                        JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                        if (jobWorkItemDequeueWork == null) {
                            return true;
                        }
                        F2Q.A00(jobWorkItemDequeueWork.getIntent(), isManagedAppCacheJobService);
                        if (!isManagedAppCacheJobService.A01) {
                            try {
                                jobParameters.completeWork(jobWorkItemDequeueWork);
                            } catch (RuntimeException e) {
                                CFK.A0A("IsManagedAppCacheJobSvc", "completeWork failed, job likely stopped", e);
                            }
                        }
                    } catch (SecurityException unused) {
                        return true;
                    }
                }
                return true;
        }
    }
}
