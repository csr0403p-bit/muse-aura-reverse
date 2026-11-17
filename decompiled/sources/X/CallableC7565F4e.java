package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.F4e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC7565F4e implements Callable {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public CallableC7565F4e(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        HashMap mapA0u;
        Object objName;
        String str;
        Object obj;
        Map map;
        String str2;
        String str3;
        switch (this.$t) {
            case 1:
                DEW dew = (DEW) this.A01;
                HashMap mapA00 = DEW.A00(dew);
                String localizedMessage = ((Throwable) this.A00).getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "";
                }
                mapA00.put(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, localizedMessage);
                DEW.A02(dew, mapA00);
                return mapA00;
            case 2:
                try {
                    C7081Efh c7081Efh = (C7081Efh) this.A01;
                    C7080Efg c7080Efg = c7081Efh.A02;
                    CCV ccv = (CCV) this.A00;
                    c7080Efg.A01(ccv);
                    C7084Efk c7084Efk = c7081Efh.A00;
                    synchronized (c7084Efk.A0A) {
                        try {
                            C7384Etj.A0Y(ccv, 0);
                        } catch (IOException e) {
                            e.getMessage();
                        }
                        try {
                            ArrayList arrayListA11 = C60O.A11(1);
                            arrayListA11.add(CCU.A00(ccv));
                            int size = arrayListA11.size();
                            for (int i = 0; i < size; i++) {
                                String str4 = (String) arrayListA11.get(i);
                                c7084Efk.A06.AaW(str4);
                                c7084Efk.A0B.remove(str4);
                            }
                        } catch (UnsupportedEncodingException e2) {
                            throw BV4.A0e(e2);
                        }
                    }
                    return null;
                } finally {
                }
            case 3:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C5617Dly c5617Dly = (C5617Dly) this.A01;
                long j = jElapsedRealtime - c5617Dly.A06;
                mapA0u = BV4.A0u();
                BV4.A1F("time_to_target_buffer_ms", mapA0u, j);
                BV4.A1F("at_target_buffer_time", mapA0u, jElapsedRealtime);
                mapA0u.put("buffer_start_time", Long.valueOf(c5617Dly.A06));
                mapA0u.put("target_buffer_ms", Integer.valueOf(((DmT) this.A00).desiredBuffer));
                objName = c5617Dly.A0a.A0K.name();
                str = "client_latency_level";
                mapA0u.put(str, objName);
                return mapA0u;
            case 4:
                Callable callable = (Callable) this.A00;
                obj = this.A01;
                map = (Map) callable.call();
                str2 = "reason";
                str3 = "too_many_retries";
                map.put(str2, str3);
                map.put(AuraSubscriptionRepositoryJsonKt.CHANGE_ACTION_CANCEL, AnonymousClass001.A0i());
                map.put("exception", obj);
                return map;
            case 5:
                Callable callable2 = (Callable) this.A00;
                obj = this.A01;
                map = (Map) callable2.call();
                str2 = "reason";
                str3 = "one_503";
                map.put(str2, str3);
                map.put(AuraSubscriptionRepositoryJsonKt.CHANGE_ACTION_CANCEL, AnonymousClass001.A0i());
                map.put("exception", obj);
                return map;
            case 6:
                C5425DiL c5425DiL = (C5425DiL) this.A00;
                AbstractC5411Di6 abstractC5411Di6 = (AbstractC5411Di6) this.A01;
                mapA0u = C5425DiL.A05(c5425DiL);
                if (abstractC5411Di6 instanceof AbstractC5415DiB) {
                    mapA0u.put("segment_identifier", Long.valueOf(((AbstractC5415DiB) abstractC5411Di6).A00));
                }
                mapA0u.put("start_time_us", Long.valueOf(abstractC5411Di6.A04));
                objName = Long.valueOf(abstractC5411Di6.A02);
                str = "end_time_us";
                mapA0u.put(str, objName);
                return mapA0u;
            case 7:
            default:
                ((Runnable) this.A01).run();
                return null;
            case 8:
                ReentrantReadWriteLock reentrantReadWriteLock = AbstractC6667EOc.A00;
                Context context = (Context) this.A00;
                EOH eoh = (EOH) this.A01;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    F08 f08 = EOC.A00;
                    Set<EP1> set = eoh.A01;
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (EP1 ep1 : set) {
                        EOL eolA00 = EOC.A00(context, new EOT(context, ep1, eoh), ep1, false);
                        if (eolA00 != null) {
                            arrayListA0h.add(eolA00);
                        }
                    }
                    return arrayListA0h;
                } finally {
                    while (i2 < readHoldCount) {
                        lock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
        }
    }
}
