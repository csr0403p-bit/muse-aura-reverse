package com.facebook.aura.appreview;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C78N;
import X.G0V;
import android.content.Context;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchInAppReviewEffectKt {
    public static final long REVIEW_PROMPT_DELAY_MS = 3000;
    public static final String TAG = "HatchInAppReview";

    /* renamed from: com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInAppReviewEffectKt.HatchInAppReviewEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchInAppReviewEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 263741279, i), bfm, i)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1(contextA0H, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, contextA0H);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
