package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.C06H;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ContentRenderer {
    public static final int $stable = 8;

    public final class Callback extends ContentRenderer {
        public static final int $stable = 0;
        public final G0W<Function0<Unit>, BFM, Integer, Unit> content;

        /* JADX WARN: Multi-variable type inference failed */
        public Callback(G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g0w) {
            C7384Etj.A0Y(g0w, 0);
            this.content = g0w;
        }

        @Override // com.facebook.aura.conversation.view.richcontent.ContentRenderer
        public void Render(Function0<Unit> function0, BFM bfm, int i) {
            C7384Etj.A0Y(function0, 0);
            bfm.AgG(-711936508);
            int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
            if ((i & 48) == 0) {
                iA0T |= AnonymousClass004.A0e(bfm, this);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
                AnonymousClass001.A1G(function0, bfm, this.content, iA0T & 14);
            } else {
                bfm.Afo();
            }
            BBb bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                bBbAAc.A06 = new ContentRenderer$Callback$Render$1(this, function0, i);
            }
        }
    }

    public final class Immediate extends ContentRenderer {
        public static final int $stable = 0;
        public final G0V<BFM, Integer, Unit> content;

        /* JADX WARN: Multi-variable type inference failed */
        public Immediate(G0V<? super BFM, ? super Integer, Unit> g0v) {
            C7384Etj.A0Y(g0v, 0);
            this.content = g0v;
        }

        @Override // com.facebook.aura.conversation.view.richcontent.ContentRenderer
        public void Render(Function0<Unit> function0, BFM bfm, int i) {
            C7384Etj.A0Y(function0, 0);
            bfm.AgG(172104698);
            int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
            if ((i & 48) == 0) {
                iA0T |= AnonymousClass004.A0e(bfm, this);
            }
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
                Unit unit = Unit.INSTANCE;
                boolean zA1L = AnonymousClass001.A1L(iA0T);
                Object objAaT = bfm.AaT();
                if (zA1L || objAaT == C78N.A00) {
                    objAaT = new ContentRenderer$Immediate$Render$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, unit);
                AnonymousClass001.A1H(bfm, this.content, 0);
            } else {
                bfm.Afo();
            }
            BBb bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                bBbAAc.A06 = new ContentRenderer$Immediate$Render$2(this, function0, i);
            }
        }
    }

    public abstract void Render(Function0<Unit> function0, BFM bfm, int i);

    public /* synthetic */ ContentRenderer(C06H c06h) {
    }

    public ContentRenderer() {
    }
}
