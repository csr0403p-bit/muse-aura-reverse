package com.facebook.aura.vds.compose.font;

import X.A48;
import X.AbstractC1996Aw5;
import X.AbstractC5321DgF;
import X.B08;
import X.B09;
import X.B0G;
import X.B9B;
import X.C1736ApY;
import X.C1809ArT;
import X.C1847AsK;
import X.C7384Etj;
import X.C9e8;
import X.F0C;
import com.facebook.aura.R;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class FontFamilyExtKt {
    public static final F0C DefaultOptimisticAi$delegate;
    public static final AbstractC1996Aw5 OptimisticTextFamily;
    public static final AbstractC1996Aw5 RobotoMonoTextFamily;

    static {
        C1736ApY c1736ApY = C1736ApY.A04;
        RobotoMonoTextFamily = B08.A00(c1736ApY, R.font.roboto_mono_vf);
        OptimisticTextFamily = new A48(Arrays.asList(new B09(new B08(new B0G[0]), c1736ApY, R.font.optimistic_vf)));
        DefaultOptimisticAi$delegate = AbstractC5321DgF.A03(FontFamilyExtKt$DefaultOptimisticAi$2.INSTANCE);
    }

    /* renamed from: getOptimisticAi-eAf_CNQ, reason: not valid java name */
    public static final AbstractC1996Aw5 m2549getOptimisticAieAf_CNQ(long j, C1736ApY c1736ApY) {
        C7384Etj.A0Y(c1736ApY, 1);
        if (j == C1809ArT.A01 && c1736ApY.equals(C1736ApY.A04)) {
            return getDefaultOptimisticAi();
        }
        B9B[] b9bArr = {new OptimisticAiFont(j, c1736ApY)};
        C1847AsK c1847AsK = AbstractC1996Aw5.A03;
        return new A48(Arrays.asList(b9bArr));
    }

    public static final AbstractC1996Aw5 getDefaultOptimisticAi() {
        return (AbstractC1996Aw5) DefaultOptimisticAi$delegate.getValue();
    }

    /* renamed from: getOptimisticAi-eAf_CNQ$default, reason: not valid java name */
    public static /* synthetic */ AbstractC1996Aw5 m2550getOptimisticAieAf_CNQ$default(long j, C1736ApY c1736ApY, int i, Object obj) {
        if ((i & 1) != 0) {
            j = C1809ArT.A01;
        }
        if ((i & 2) != 0) {
            c1736ApY = C1736ApY.A04;
        }
        return m2549getOptimisticAieAf_CNQ(j, c1736ApY);
    }

    public static final AbstractC1996Aw5 getOptimisticAi(C9e8 c9e8) {
        return getDefaultOptimisticAi();
    }

    public static final AbstractC1996Aw5 getOptimistic(C9e8 c9e8) {
        return OptimisticTextFamily;
    }

    public static final AbstractC1996Aw5 getRobotoMono(C9e8 c9e8) {
        return RobotoMonoTextFamily;
    }
}
