package X;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

/* renamed from: X.F4u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7581F4u implements InterfaceC5819Dq4 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C7581F4u(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC5819Dq4
    public final /* synthetic */ InterfaceC5458Dit[] A7k(Uri uri, Map map) throws NoSuchMethodException, SecurityException {
        String str;
        InterfaceC5458Dit[] interfaceC5458DitArr;
        E2S e2s;
        if (this.$t == 0) {
            C5607Dlm c5607Dlm = (C5607Dlm) this.A00;
            C6154Dwx c6154Dwx = (C6154Dwx) this.A01;
            return new InterfaceC5458Dit[]{c5607Dlm.A01.Agg(c6154Dwx) ? new E01(c5607Dlm.A01.A7S(c6154Dwx)) : new C5832DqN(c6154Dwx)};
        }
        try {
            Constructor<?> constructor = Class.forName("androidx.media3.extractor.mp3.Mp3Extractor").getConstructor(null);
            boolean z = ((DlU) this.A00).A0M.enableMp3Mp4ExtractorLogic;
            DmR dmR = (DmR) this.A01;
            if (z) {
                C4904DDx c4904DDx = dmR.A03;
                Uri uri2 = c4904DDx.A08;
                if (uri2 != null && uri2.getLastPathSegment() != null && c4904DDx.A08.getLastPathSegment().endsWith(".mp3")) {
                    return new InterfaceC5458Dit[]{(InterfaceC5458Dit) constructor.newInstance(null)};
                }
                interfaceC5458DitArr = new InterfaceC5458Dit[2];
                interfaceC5458DitArr[0] = (InterfaceC5458Dit) constructor.newInstance(null);
                e2s = new E2S();
            } else {
                C4904DDx c4904DDx2 = dmR.A03;
                List<String> list = c4904DDx2.A0S;
                if ((list == null || !list.contains("undefined")) && ((str = c4904DDx2.A0O) == null || !str.equals("undefined"))) {
                    return new InterfaceC5458Dit[]{(InterfaceC5458Dit) constructor.newInstance(null)};
                }
                interfaceC5458DitArr = new InterfaceC5458Dit[2];
                interfaceC5458DitArr[0] = (InterfaceC5458Dit) constructor.newInstance(null);
                e2s = new E2S();
            }
            interfaceC5458DitArr[1] = e2s;
            return interfaceC5458DitArr;
        } catch (Exception e) {
            CFK.A08("HeroExo2VodInitHelper", "Error while creating Mp3/Mp4 Extractor(s)", e);
            throw BV4.A0e(e);
        }
    }

    @Override // X.InterfaceC5819Dq4
    public final /* synthetic */ void ABE(int i) {
    }

    @Override // X.InterfaceC5819Dq4
    public final /* synthetic */ void ABG(boolean z) {
    }

    @Override // X.InterfaceC5819Dq4
    public final /* synthetic */ void Aeq(InterfaceC5885DrL interfaceC5885DrL) {
    }
}
