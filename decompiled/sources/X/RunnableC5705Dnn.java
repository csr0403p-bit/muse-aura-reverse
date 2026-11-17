package X;

import com.facebook.aura.common.video.HatchVideoPlayerMetadataProvider;

/* renamed from: X.Dnn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5705Dnn implements Runnable {
    public static final String __redex_internal_original_name = "PlayerListener$fetchTagMetadataInBackground$runnable$1";
    public final /* synthetic */ HatchVideoPlayerMetadataProvider A00;
    public final /* synthetic */ C5630DmE A01;
    public final /* synthetic */ String A02;

    public RunnableC5705Dnn(HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider, C5630DmE c5630DmE, String str) {
        this.A01 = c5630DmE;
        this.A02 = str;
        this.A00 = hatchVideoPlayerMetadataProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5700Dnh c5700DnhA00;
        C5630DmE c5630DmE = this.A01;
        String strA01 = C5630DmE.A01(c5630DmE);
        String str = this.A02;
        if (strA01.equals(str)) {
            HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider = c5630DmE.A0R;
            HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider2 = this.A00;
            if (hatchVideoPlayerMetadataProvider == hatchVideoPlayerMetadataProvider2) {
                C5962Dsy c5962Dsy = hatchVideoPlayerMetadataProvider2.backgroundFetchedTagMetadata;
                if (C5630DmE.A01(c5630DmE).equals(str) && c5630DmE.A0R == hatchVideoPlayerMetadataProvider2) {
                    C5630DmE.A03(c5962Dsy, c5630DmE, str, true);
                    if (c5630DmE.A0F.gen.cache_attribution_id_v2_root) {
                        C5963Dsz requiredMetadata = hatchVideoPlayerMetadataProvider2.getRequiredMetadata();
                        if (C5630DmE.A01(c5630DmE).equals(str) && c5630DmE.A0R == hatchVideoPlayerMetadataProvider2 && (c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, str)) != null) {
                            c5700DnhA00.A03(requiredMetadata);
                        }
                    }
                }
            }
        }
    }
}
