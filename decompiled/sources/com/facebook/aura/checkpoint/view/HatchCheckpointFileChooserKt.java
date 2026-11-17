package com.facebook.aura.checkpoint.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C6t6;
import X.C7384Etj;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.G0U;
import X.G0V;
import X.HpR;
import android.webkit.ValueCallback;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchCheckpointFileChooserKt {
    public static final String TAG = "HatchCheckpointFileChooser";

    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6t6 c6t6, int i) {
            super(2);
            this.$webView = c6t6;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCheckpointFileChooserKt.HatchCheckpointFileChooser(this.$webView, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchCheckpointFileChooser(C6t6 c6t6, BFM bfm, int i) {
        C7384Etj.A0Y(c6t6, 0);
        bfm.AgG(-1084582203);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c6t6) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            HpR hpR = new HpR();
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$fileChooserLauncher$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT2);
            boolean zA1M = AnonymousClass003.A1M(bfm, c6t6, c7ouA00);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == obj) {
                objAaT3 = new HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$1$1(c6t6, c7ouA00, mutableState);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, c6t6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c6t6, i);
        }
    }

    public static final /* synthetic */ ValueCallback access$HatchCheckpointFileChooser$lambda$1(MutableState mutableState) {
        return (ValueCallback) mutableState.getValue();
    }
}
