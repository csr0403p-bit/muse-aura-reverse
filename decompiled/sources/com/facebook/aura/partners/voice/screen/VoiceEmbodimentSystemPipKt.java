package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1BO;
import X.C1er;
import X.C5303Dfm;
import X.C78N;
import X.EnumC10573Huf;
import X.G0V;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.api.HatchSystemPipPresentationState;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.api.VoiceSystemPipEvent;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentSystemPipKt {
    public static final long PIP_TRANSITION_RECOVERY_DELAY_MS = 5000;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$SystemPipControllerEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ComponentActivity $componentActivity;
        public final /* synthetic */ HatchSystemPipController $pipController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ComponentActivity componentActivity, HatchSystemPipController hatchSystemPipController, int i) {
            super(2);
            this.$componentActivity = componentActivity;
            this.$pipController = hatchSystemPipController;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceEmbodimentSystemPipKt.SystemPipControllerEffect(this.$componentActivity, this.$pipController, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$SystemPipDiagnosticsEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C131932 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ComponentActivity $activity;
        public final /* synthetic */ Function0<VoiceSystemPipEvent> $pauseEvent;
        public final /* synthetic */ VoiceCallStateHolder $stateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131932(ComponentActivity componentActivity, VoiceCallStateHolder voiceCallStateHolder, Function0<? extends VoiceSystemPipEvent> function0, int i) {
            super(2);
            this.$activity = componentActivity;
            this.$stateHolder = voiceCallStateHolder;
            this.$pauseEvent = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceEmbodimentSystemPipKt.SystemPipDiagnosticsEffect(this.$activity, this.$stateHolder, this.$pauseEvent, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.screen.HatchSystemPipState rememberHatchSystemPipState(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r25, boolean r26, boolean r27, X.BFM r28, int r29) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt.rememberHatchSystemPipState(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, boolean, boolean, X.BFM, int):com.facebook.aura.partners.voice.screen.HatchSystemPipState");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSystemPipPresentationState.values().length];
            try {
                AnonymousClass002.A13(HatchSystemPipPresentationState.IN_APP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSystemPipPresentationState.ENTERING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void cancelFailedPipTransition() {
        VoiceCallManager currentManager;
        HatchSystemPipRuntime hatchSystemPipRuntime = HatchSystemPipRuntime.INSTANCE;
        if (HatchSystemPipRuntime.presentationState.getValue() == HatchSystemPipPresentationState.ENTERING && (currentManager = hatchSystemPipRuntime.getCurrentManager()) != null) {
            currentManager.logSystemPipEvent(VoiceSystemPipEvent.ENTRY_FAILED);
        }
        hatchSystemPipRuntime.cancelPipTransition();
    }

    public static final void SystemPipControllerEffect(ComponentActivity componentActivity, HatchSystemPipController hatchSystemPipController, BFM bfm, int i) {
        bfm.AgG(-1875935260);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, componentActivity) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchSystemPipController, bfm, i) ? 1 : 0);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            boolean zA67 = bfm.A67(componentActivity);
            if ((iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchSystemPipController))) {
                z = true;
            }
            boolean z2 = zA67 | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new VoiceEmbodimentSystemPipKt$SystemPipControllerEffect$1$1(componentActivity, hatchSystemPipController);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, componentActivity, hatchSystemPipController);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(componentActivity, hatchSystemPipController, i);
        }
    }

    public static final void SystemPipDiagnosticsEffect(ComponentActivity componentActivity, VoiceCallStateHolder voiceCallStateHolder, Function0<? extends VoiceSystemPipEvent> function0, BFM bfm, int i) {
        bfm.AgG(1513386013);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, componentActivity) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(voiceCallStateHolder, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA67 = bfm.A67(componentActivity);
            if ((iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(voiceCallStateHolder))) {
                z = true;
            }
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, zA67, z);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new VoiceEmbodimentSystemPipKt$SystemPipDiagnosticsEffect$1$1(componentActivity, voiceCallStateHolder, mutableStateA00);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, componentActivity, voiceCallStateHolder);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131932(componentActivity, voiceCallStateHolder, function0, i);
        }
    }

    public static final /* synthetic */ HatchSystemPipGeometry access$rememberHatchSystemPipState$lambda$11(MutableState mutableState) {
        return (HatchSystemPipGeometry) mutableState.getValue();
    }

    public static final /* synthetic */ HatchSystemPipPresentationState access$rememberHatchSystemPipState$lambda$2(C1BO c1bo) {
        return (HatchSystemPipPresentationState) c1bo.getValue();
    }

    public static final boolean isInPipWindow(ComponentActivity componentActivity) {
        return componentActivity.isInPictureInPictureMode() && ((C5303Dfm) componentActivity.getLifecycle()).A01 != EnumC10573Huf.A05;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean rememberIsInPictureInPictureMode(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r9, long r10, kotlin.jvm.functions.Function0<kotlin.Unit> r12, X.BFM r13, int r14) {
        /*
            X.AnonymousClass003.A0v(r9, r12)
            X.AKH<android.app.Activity> r0 = X.AKL.A00
            java.lang.Object r6 = r13.A6v(r0)
            boolean r0 = r6 instanceof androidx.activity.ComponentActivity
            r5 = 0
            if (r0 == 0) goto L8a
            androidx.activity.ComponentActivity r6 = (androidx.activity.ComponentActivity) r6
        L10:
            androidx.compose.runtime.MutableState r7 = X.C1er.A00(r13, r12)
            boolean r8 = r13.A65(r6)
            r0 = r14 & 14
            r0 = r0 ^ 6
            r2 = 4
            r4 = 1
            if (r0 <= r2) goto L26
            boolean r0 = r13.A65(r9)
            if (r0 != 0) goto L2b
        L26:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r2) goto L2c
        L2b:
            r0 = 1
        L2c:
            r8 = r8 | r0
            java.lang.Object r3 = r13.AaT()
            if (r8 != 0) goto L37
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L47
        L37:
            if (r6 == 0) goto L43
            com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$observer$1$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$observer$1$1$1
            r0.<init>(r7)
            com.facebook.aura.partners.voice.screen.SystemPipModeObserver r5 = new com.facebook.aura.partners.voice.screen.SystemPipModeObserver
            r5.<init>(r6, r9, r0)
        L43:
            r13.Ai0(r5)
            r3 = r5
        L47:
            com.facebook.aura.partners.voice.screen.SystemPipModeObserver r3 = (com.facebook.aura.partners.voice.screen.SystemPipModeObserver) r3
            boolean r1 = r13.A67(r3)
            java.lang.Object r0 = r13.AaT()
            if (r1 != 0) goto L57
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L5f
        L57:
            com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$1$1
            r0.<init>(r3)
            r13.Ai0(r0)
        L5f:
            X.AnonymousClass001.A17(r13, r0, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            boolean r1 = r13.A67(r3)
            java.lang.Object r0 = r13.AaT()
            if (r1 != 0) goto L74
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L7c
        L74:
            com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$2$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$2$1
            r0.<init>(r3)
            r13.Ai0(r0)
        L7c:
            X.AnonymousClass001.A19(r13, r0, r3, r2)
            if (r3 == 0) goto L8c
            androidx.compose.runtime.MutableState r0 = r3.isInPictureInPictureMode$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 != r4) goto L8c
            return r4
        L8a:
            r6 = r5
            goto L10
        L8c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt.rememberIsInPictureInPictureMode(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, long, kotlin.jvm.functions.Function0, X.BFM, int):boolean");
    }

    public static final boolean rememberPipEntryPending(ComponentActivity componentActivity, boolean z, BFM bfm, int i) {
        MutableState mutableStateA00 = C1er.A00(bfm, Boolean.valueOf(z));
        boolean zA65 = bfm.A65(componentActivity);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass005.A0S(bfm, false);
        }
        MutableState mutableState = (MutableState) objAaT;
        boolean zA1P = AnonymousClass003.A1P(bfm, mutableState, mutableStateA00, bfm.A67(componentActivity));
        Object objAaT2 = bfm.AaT();
        if (zA1P || objAaT2 == C78N.A00) {
            objAaT2 = new VoiceEmbodimentSystemPipKt$rememberPipEntryPending$1$1(componentActivity, mutableStateA00, mutableState);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, componentActivity);
        return MutableState.A0A(mutableState);
    }
}
