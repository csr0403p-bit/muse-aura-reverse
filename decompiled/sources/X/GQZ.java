package X;

import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener;

/* loaded from: classes6.dex */
public final class GQZ implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$setupAudioStateForRtc$1";
    public final /* synthetic */ GSV A00;
    public final /* synthetic */ GSX A01;
    public final /* synthetic */ AudioStateManagerListener A02;
    public final /* synthetic */ GX5 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public GQZ(GSV gsv, GSX gsx, AudioStateManagerListener audioStateManagerListener, GX5 gx5, String str, boolean z, boolean z2) {
        this.A00 = gsv;
        this.A04 = str;
        this.A01 = gsx;
        this.A02 = audioStateManagerListener;
        this.A03 = gx5;
        this.A06 = z;
        this.A05 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        GSV gsv = this.A00;
        String str = this.A04;
        if (GSV.A03(gsv, str)) {
            GSV.A01(gsv, this.A01, this.A02, this.A03, str, this.A06, this.A05);
        }
    }
}
