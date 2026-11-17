package X;

import android.util.Range;

/* loaded from: classes5.dex */
public abstract class BdD {
    public static Bd8 A00(Range range, Range range2, C2439BbS c2439BbS, Integer num) {
        String strA0M = c2439BbS == null ? " qualitySelector" : "";
        if (range2 == null) {
            strA0M = FGI.A0M(strA0M, " frameRate");
        }
        if (range == null) {
            strA0M = FGI.A0M(strA0M, " bitrate");
        }
        if (num == null) {
            strA0M = FGI.A0M(strA0M, " aspectRatio");
        }
        if (!strA0M.isEmpty()) {
            throw BV8.A0l(strA0M);
        }
        Range<Integer> range3 = AbstractC2440BbT.A00;
        return new Bd8(range2, range, c2439BbS, num.intValue());
    }
}
