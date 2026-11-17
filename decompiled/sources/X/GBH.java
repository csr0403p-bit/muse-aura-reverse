package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import kotlin.Unit;

/* loaded from: classes6.dex */
public abstract class GBH {
    public static final Object A00(HtJ<? super Unit> htJ) {
        Object obj;
        GBJ gbj;
        C78T context = htJ.getContext();
        HzS.A05(context);
        HtJ htJA02 = C7Bm.A02(htJ);
        if (!(htJA02 instanceof GBJ) || (gbj = (GBJ) htJA02) == null) {
            obj = Unit.INSTANCE;
        } else {
            GBK gbk = gbj.A03;
            if (GBI.A02(context, gbk)) {
                gbj.A00 = Unit.INSTANCE;
                ((GBN) gbj).A00 = 1;
                gbk.dispatchYield(context, gbj);
            } else {
                C9261GBo c9261GBo = new C9261GBo();
                C78T c78tPlus = context.plus(c9261GBo);
                Unit unit = Unit.INSTANCE;
                gbj.A00 = unit;
                ((GBN) gbj).A00 = 1;
                gbk.dispatchYield(c78tPlus, gbj);
                if (c9261GBo.A00) {
                    GB7 gb7A00 = AbstractC9246GAy.A00();
                    AIG<GBN<?>> aig = gb7A00.A01;
                    if (aig != null && !aig.isEmpty()) {
                        long j = gb7A00.A00;
                        if (j >= LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                            gbj.A00 = unit;
                            ((GBN) gbj).A00 = 1;
                            gb7A00.A03(gbj);
                        } else {
                            gb7A00.A00 = j + LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES;
                            try {
                                gbj.run();
                                do {
                                } while (gb7A00.A05());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.INSTANCE;
                }
            }
            obj = EnumC10460Hji.A02;
        }
        return obj != EnumC10460Hji.A02 ? Unit.INSTANCE : obj;
    }
}
