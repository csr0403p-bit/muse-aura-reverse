package X;

import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;
import java.util.ArrayList;

/* renamed from: X.GQs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9593GQs extends MediaStatsListener {
    public final /* synthetic */ C9591GQq A00;

    @Override // com.facebook.rsys.mediastats.gen.MediaStatsListener
    public void onMediaStats(ArrayList<MediaStats> arrayList) {
        C7384Etj.A0Y(arrayList, 0);
        C9591GQq c9591GQq = this.A00;
        ArrayList<String> arrayList2 = C9591GQq.A0E;
        c9591GQq.A0A.Af8(AbstractC0878AGe.A0X(arrayList));
    }

    public C9593GQs(C9591GQq c9591GQq) {
        this.A00 = c9591GQq;
    }
}
