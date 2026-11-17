package com.facebook.aura.ageverification;

import X.AKL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C78N;
import X.G0V;
import android.app.Activity;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class MaxScreenBrightnessEffectKt {

    /* renamed from: com.facebook.aura.ageverification.MaxScreenBrightnessEffectKt$MaxScreenBrightnessEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MaxScreenBrightnessEffectKt.MaxScreenBrightnessEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void MaxScreenBrightnessEffect(BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass2;
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 679282698, i), bfm, i)) {
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            if (activity == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new MaxScreenBrightnessEffectKt$MaxScreenBrightnessEffect$activity$1(i);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            boolean zA67 = bfm.A67(activity);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new MaxScreenBrightnessEffectKt$MaxScreenBrightnessEffect$1$1(activity);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, activity);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(i);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }
}
