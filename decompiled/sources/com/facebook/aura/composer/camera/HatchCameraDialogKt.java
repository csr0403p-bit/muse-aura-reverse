package com.facebook.aura.composer.camera;

import X.AOW;
import X.AT5;
import X.AT8;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0n6;
import X.C13s;
import X.C1er;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.G0U;
import X.G0V;
import android.content.Context;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchCameraDialogKt {

    /* renamed from: com.facebook.aura.composer.camera.HatchCameraDialogKt$HatchCameraDialog$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchCameraSession $camera;
        public final /* synthetic */ MutableState<Boolean> $closing$delegate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AT5<Float, AOW> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchCameraSession hatchCameraSession, BRg bRg, AT5<Float, AOW> at5, MutableState<Boolean> mutableState) {
            super(2);
            this.$camera = hatchCameraSession;
            this.$modifier = bRg;
            this.$progress = at5;
            this.$closing$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ViewParent parent = AnonymousClass001.A0J(bfm).getParent();
                C7384Etj.A0Z(parent, "null cannot be cast to non-null type androidx.compose.ui.window.DialogWindowProvider");
                Window windowAMm = ((C13s) parent).AMm();
                boolean zA67 = bfm.A67(windowAMm);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchCameraDialogKt$HatchCameraDialog$4$1$1(windowAMm);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, windowAMm);
                HatchCameraSession hatchCameraSession = this.$camera;
                boolean zA1X = AnonymousClass002.A1X(this.$closing$delegate.getValue());
                MutableState<Boolean> mutableState = this.$closing$delegate;
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT2 == obj) {
                    objAaT2 = new HatchCameraDialogKt$HatchCameraDialog$4$2$1(mutableState);
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) objAaT2;
                MutableState<Boolean> mutableState2 = this.$closing$delegate;
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = new HatchCameraDialogKt$HatchCameraDialog$4$3$1(mutableState2);
                    bfm.Ai0(objAaT3);
                }
                Function0 function02 = (Function0) objAaT3;
                BRg bRgA0T = AnonymousClass001.A0T(this.$modifier);
                boolean zA672 = bfm.A67(this.$progress);
                AT5<Float, AOW> at5 = this.$progress;
                Object objAaT4 = bfm.AaT();
                if (zA672 || objAaT4 == obj) {
                    objAaT4 = new HatchCameraDialogKt$HatchCameraDialog$4$4$1(at5);
                    bfm.Ai0(objAaT4);
                }
                HatchCameraScreenKt.HatchCameraScreen(hatchCameraSession, zA1X, function0, function02, AnonymousClass001.A0W(bRgA0T, objAaT4), bfm, HatchCameraSession.$stable | 3456, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.composer.camera.HatchCameraDialogKt$HatchCameraDialog$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<File, Unit> $onFinished;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(G0U<? super File, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$onFinished = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCameraDialogKt.HatchCameraDialog(this.$onFinished, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchCameraDialog(G0U<? super File, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0u, 0);
        bfm.AgG(1117580601);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchCameraSession(contextA0H, abstractC3358CGzA0h, c3ux);
                bfm.Ai0(objAaT2);
            }
            HatchCameraSession hatchCameraSession = (HatchCameraSession) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AT8.A00(0.0f);
                bfm.Ai0(objAaT3);
            }
            AT5 at5 = (AT5) objAaT3;
            MutableState mutableState = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            Object value = mutableState.getValue();
            boolean zA1S = AnonymousClass004.A1S(bfm, mutableStateA00, hatchCameraSession, bfm.A67(at5));
            Object objAaT4 = bfm.AaT();
            if (zA1S || objAaT4 == obj) {
                objAaT4 = new HatchCameraDialogKt$HatchCameraDialog$1$1(at5, mutableState, hatchCameraSession, mutableStateA00, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, value);
            boolean zA67 = bfm.A67(hatchCameraSession);
            Object objAaT5 = bfm.AaT();
            if (zA67 || objAaT5 == obj) {
                objAaT5 = new HatchCameraDialogKt$HatchCameraDialog$2$1(hatchCameraSession);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A17(bfm, objAaT5, hatchCameraSession);
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = new HatchCameraDialogKt$HatchCameraDialog$3$1(mutableState);
                bfm.Ai0(objAaT6);
            }
            C0n6.A00(bfm, new BA2(C79.A00, true, false, false, false), (Function0) objAaT6, B1V.A00(bfm, new AnonymousClass4(hatchCameraSession, bRg2, at5, mutableState), 531010000), 438, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(g0u, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ Boolean access$HatchCameraDialog$lambda$3(MutableState mutableState) {
        return (Boolean) mutableState.getValue();
    }
}
