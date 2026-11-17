package X;

import com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord;
import com.instagram.common.bloks.componentquery.cache.DiskCacheData;
import com.instagram.common.bloks.componentquery.cache.DiskCacheMetadata;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EEP<V> implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ EEO A01;
    public final /* synthetic */ C7403Euh A02;
    public final /* synthetic */ DiskCacheData A03;
    public final /* synthetic */ BloksComponentQueryResources A04;
    public final /* synthetic */ String A05;

    public EEP(EEO eeo, C7403Euh c7403Euh, DiskCacheData diskCacheData, BloksComponentQueryResources bloksComponentQueryResources, String str, long j) {
        this.A05 = str;
        this.A01 = eeo;
        this.A00 = j;
        this.A03 = diskCacheData;
        this.A04 = bloksComponentQueryResources;
        this.A02 = c7403Euh;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str = this.A05;
        EEO eeo = this.A01;
        long j = this.A00;
        DiskCacheData diskCacheData = this.A03;
        BloksComponentQueryResources bloksComponentQueryResources = this.A04;
        try {
            long jNow = eeo.A02.now() - (eeo.A03.now() - j);
            ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord = new ComponentQueryDiskCacheRecord(diskCacheData, j, bloksComponentQueryResources, jNow);
            ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStreamA0F);
            try {
                objectOutputStream.writeObject(componentQueryDiskCacheRecord);
                objectOutputStream.close();
                eeo.A01.A00.write(str, C7384Etj.A0d(byteArrayOutputStreamA0F));
                Map<String, DiskCacheMetadata> map = eeo.A06.get();
                C7384Etj.A0U(map);
                EEO.A01(eeo, AnonymousClass006.A11(str, new DiskCacheMetadata(j, bloksComponentQueryResources, jNow), AGH.A0A(map)));
            } finally {
            }
        } catch (Exception e) {
            FFI.A00(null, "Failed to store response to disk cache", e);
        }
        return Unit.INSTANCE;
    }
}
