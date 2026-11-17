package com.facebook.aura.assist;

import X.AKH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AssistIdentityStateKt {
    public static final AKH<AssistIdentityState> LocalAssistIdentityState = AnonymousClass002.A0L(AssistIdentityStateKt$LocalAssistIdentityState$1.INSTANCE);

    /* renamed from: com.facebook.aura.assist.AssistIdentityStateKt$AssistIdentityTransitionEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onCollapsed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onCollapsed = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AssistIdentityStateKt.AssistIdentityTransitionEffect(this.$onCollapsed, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AssistIdentityTransitionEffect(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(794821910);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            AssistIdentityState assistIdentityState = (AssistIdentityState) bfm.A6v(LocalAssistIdentityState);
            AssistIdentityPhase phase = assistIdentityState.getPhase();
            boolean zA67 = bfm.A67(assistIdentityState) | AnonymousClass001.A1M(iA0T);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AssistIdentityStateKt$AssistIdentityTransitionEffect$1$1(assistIdentityState, function0, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, assistIdentityState, phase);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }

    public static final long originOnScreen(View view) {
        C7384Etj.A0Y(view, 0);
        view.getLocationOnScreen(new int[2]);
        return AnonymousClass007.A0A(r2[0], r2[1]);
    }

    public static final AKH<AssistIdentityState> getLocalAssistIdentityState() {
        return LocalAssistIdentityState;
    }
}
