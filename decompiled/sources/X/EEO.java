package X;

import android.os.HandlerThread;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord;
import com.instagram.common.bloks.componentquery.cache.DiskCacheMetadata;
import com.instagram.common.bloks.payload.BloksACQResources;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class EEO {
    public static final EER<HandlerThread> A07;
    public final HandlerThread A00;
    public final EE4 A01;
    public final InterfaceC7539F0o A02;
    public final DK9 A03;
    public final HsW A04;
    public final Executor A05;
    public final AtomicReference<Map<String, DiskCacheMetadata>> A06;

    static {
        EES ees = EEQ.A00;
        EER<HandlerThread> eer = new EER<>();
        eer.A00 = ees;
        A07 = eer;
    }

    public EEO(EE4 ee4, HsW hsW) {
        HandlerThread handlerThreadA00 = A07.A00();
        C7384Etj.A0U(handlerThreadA00);
        HandlerThread handlerThread = handlerThreadA00;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C9u c9u = C9u.A00;
        C7384Etj.A0Y(handlerThread, 1);
        this.A01 = ee4;
        this.A00 = handlerThread;
        this.A04 = hsW;
        this.A03 = realtimeSinceBootClock;
        this.A02 = c9u;
        this.A05 = new ExecutorC5221Dde(BV4.A09(handlerThread.getLooper()));
        this.A06 = BV4.A16(AGH.A0E());
        this.A05.execute(new FutureTask(new CallableC7564F4d(this, 4)));
    }

    public static final ComponentQueryDiskCacheRecord A00(EEO eeo, C7403Euh c7403Euh, Hx1 hx1, String str) throws NoSuchAlgorithmException, IOException {
        List<BloksACQResources> list;
        hx1.A01("io_read_start", 0L);
        byte[] resourceToMemory = eeo.A01.A00.readResourceToMemory(str);
        hx1.A01("io_read_end", 0L);
        if (resourceToMemory != null) {
            hx1.A01("deserialize_start", 0L);
            ByteArrayInputStream byteArrayInputStreamA0E = BV4.A0E(resourceToMemory);
            try {
                Object object = new ObjectInputStream(byteArrayInputStreamA0E).readObject();
                C7384Etj.A0Z(object, "null cannot be cast to non-null type com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord");
                ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord = (ComponentQueryDiskCacheRecord) object;
                byteArrayInputStreamA0E.close();
                if (componentQueryDiskCacheRecord == null) {
                    componentQueryDiskCacheRecord = null;
                } else {
                    try {
                        BloksComponentQueryResources bloksComponentQueryResources = componentQueryDiskCacheRecord.resources;
                        if (bloksComponentQueryResources != null && (list = bloksComponentQueryResources.asyncComponentQueries) != null) {
                            Iterator<BloksACQResources> it = list.iterator();
                            while (it.hasNext()) {
                                if (!(it.next() instanceof BloksACQResources)) {
                                    throw BV4.A0O();
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused) {
                        eeo.A03(c7403Euh);
                        componentQueryDiskCacheRecord = null;
                    }
                }
                hx1.A01("deserialize_end", 0L);
                if (componentQueryDiskCacheRecord != null) {
                    return componentQueryDiskCacheRecord;
                }
            } finally {
            }
        }
        return null;
    }

    public static final void A01(EEO eeo, Map map) {
        try {
            EE4 ee4 = eeo.A01;
            ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStreamA0F);
            try {
                objectOutputStream.writeObject(map);
                objectOutputStream.close();
                ee4.A00.write("__disk_metadata", C7384Etj.A0d(byteArrayOutputStreamA0F));
                eeo.A06.set(map);
            } finally {
            }
        } catch (Exception e) {
            FFI.A00(null, "Failed to update metadata map", e);
        }
    }

    public final DiskCacheMetadata A02(String str) {
        DiskCacheMetadata diskCacheMetadata = this.A06.get().get(str);
        if (diskCacheMetadata == null) {
            return null;
        }
        return diskCacheMetadata;
    }

    public final void A03(C7403Euh c7403Euh) throws NoSuchAlgorithmException {
        this.A05.execute(new FutureTask(new CallableC7568F4h(c7403Euh, this, c7403Euh.A01(), 1)));
    }
}
