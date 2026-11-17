package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class F5L implements BpS {
    public final int $t;

    public F5L(int i) {
        this.$t = i;
    }

    @Override // X.BpS
    public final Object apply(Object obj) {
        MediaCodecInfo codecInfo;
        long jA00;
        switch (this.$t) {
            case 0:
                return AnonymousClass001.A0i();
            case 1:
            case 5:
            default:
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(AnonymousClass001.A0i()));
            case 3:
            case 4:
                return AnonymousClass001.A0h();
            case 6:
                C2605BfM c2605BfM = C2605BfM.$redex_init_class;
                return null;
            case 7:
                return obj;
            case 8:
                return new C3018BsD((C2507Bcd) obj);
            case 9:
                BdF bdF = (BdF) obj;
                try {
                    LruCache<String, MediaCodecInfo> lruCache = BeL.A00;
                    String str = ((Bd7) bdF).A08;
                    LruCache<String, MediaCodecInfo> lruCache2 = BeL.A00;
                    synchronized (lruCache2) {
                        try {
                            codecInfo = lruCache.get(str);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (codecInfo == null) {
                        try {
                            try {
                                MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                                try {
                                    codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                                    synchronized (lruCache2) {
                                        lruCache2.put(str, codecInfo);
                                    }
                                    mediaCodecCreateEncoderByType.release();
                                } catch (Throwable th2) {
                                    if (mediaCodecCreateEncoderByType == null) {
                                        throw th2;
                                    }
                                    mediaCodecCreateEncoderByType.release();
                                    throw th2;
                                }
                            } catch (IOException | IllegalArgumentException e) {
                                throw new InvalidConfigException(e);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    C2572Be4 c2572Be4 = new C2572Be4(codecInfo, str);
                    return AbstractC2411BaU.A00.A01(MediaCodecInfoReportIncorrectInfoQuirk.class) != null ? new C2435BbO(c2572Be4) : c2572Be4;
                } catch (InvalidConfigException e2) {
                    AbstractC2875Bni.A06("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e2);
                    return null;
                }
            case 10:
                List<EKM> list = (List) obj;
                if (list == null) {
                    return null;
                }
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                for (EKM ekm : list) {
                    List<BzB> list2 = ekm.A0G;
                    BzB bzB = !list2.isEmpty() ? (BzB) C8j4.A0p(list2) : BzB.A01;
                    UUID uuidFromString = UUID.fromString(ekm.A0E);
                    C7384Etj.A0U(uuidFromString);
                    EnumC6619EKm enumC6619EKm = ekm.A0D;
                    HashSet hashSetA0x = BV4.A0x(ekm.A0H);
                    BzB bzB2 = ekm.A0C;
                    int i = ekm.A05;
                    int i2 = ekm.A04;
                    EKL ekl = ekm.A0B;
                    long j = ekm.A08;
                    long j2 = ekm.A09;
                    C6527ECu c6527ECu = j2 != 0 ? new C6527ECu(j2, ekm.A07) : null;
                    if (enumC6619EKm == EnumC6619EKm.A04) {
                        boolean zA1N = AnonymousClass002.A1N(i);
                        jA00 = EKE.A00(ekm.A03, i, ekm.A00, ekm.A01, ekm.A02, j, ekm.A07, j2, ekm.A0A, zA1N, AnonymousClass002.A1L((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1))));
                    } else {
                        jA00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                    }
                    arrayListA0i.add(new EKN(ekl, bzB2, bzB, c6527ECu, enumC6619EKm, ekm.A0F, hashSetA0x, uuidFromString, i, i2, ekm.A06, j, jA00));
                }
                return arrayListA0i;
        }
    }
}
