package X;

import java.util.Comparator;

/* loaded from: classes5.dex */
public final class DJG implements Comparator<DJF> {
    public static final /* synthetic */ DJG A00 = new DJG();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(DJF djf, DJF djf2) {
        DJF djf3 = djf;
        DJF djf4 = djf2;
        if (djf3 != null) {
            return C7384Etj.A00(djf3.getPriority(), djf4 != null ? djf4.getPriority() : 0);
        }
        return 0;
    }
}
