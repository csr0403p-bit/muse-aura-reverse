package com.facebook.aura.assist;

import X.AKH;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C78N;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.composer.camera.HatchInAppCameraKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AssistVoiceCameraKt {
    public static final AKH<Function0<Unit>> LocalAssistVoiceCameraLaunch = AnonymousClass002.A0L(AssistVoiceCameraKt$LocalAssistVoiceCameraLaunch$1.INSTANCE);

    /* renamed from: com.facebook.aura.assist.AssistVoiceCameraKt$AssistVoiceCameraButton$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
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
            AssistVoiceCameraKt.AssistVoiceCameraButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AssistVoiceCameraButton(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1101681772);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Function0 function0 = (Function0) bfm.A6v(LocalAssistVoiceCameraLaunch);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.camera_outline, 0);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12017f);
            boolean zA1X = AnonymousClass002.A1X(function0);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "assist-voice-camera");
            boolean zA65 = bfm.A65(function0);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AssistVoiceCameraKt$AssistVoiceCameraButton$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRgA00, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, (Function0) objAaT, null, zA1X, null, null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 15648);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final AKH<Function0<Unit>> getLocalAssistVoiceCameraLaunch() {
        return LocalAssistVoiceCameraLaunch;
    }

    public static final Function0<Unit> rememberAssistVoiceCameraLauncher(BFM bfm, int i) {
        bfm.AgE(1890205328);
        Context contextA0H = AnonymousClass002.A0H(bfm);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        VoiceCallStateHolder voiceCallStateHolderA0K = C3cG.A0K(abstractC3358CGzA0h);
        C1BO c1boA02 = C2CK.A02(bfm, voiceCallStateHolderA0K.isInputReady);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AssistVoicePhotoSender.Companion.getInstance(contextA0H, abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        AssistVoicePhotoSender assistVoicePhotoSender = (AssistVoicePhotoSender) objAaT;
        C1BO c1boA022 = C2CK.A02(bfm, assistVoicePhotoSender.isSending);
        Object[] objArr = new Object[0];
        Object objAaT2 = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT2 == obj) {
            objAaT2 = AssistVoiceCameraKt$rememberAssistVoiceCameraLauncher$threadId$2$1.INSTANCE;
            bfm.Ai0(objAaT2);
        }
        MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
        Object[] objArr2 = new Object[0];
        Object objAaT3 = bfm.AaT();
        if (objAaT3 == obj) {
            objAaT3 = AssistVoiceCameraKt$rememberAssistVoiceCameraLauncher$callAttemptGeneration$2$1.INSTANCE;
            bfm.Ai0(objAaT3);
        }
        MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT3, objArr2);
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12017e);
        boolean zA1T = AnonymousClass005.A1T(bfm, mutableStateA0N, mutableStateA0K, strA01, bfm.A67(assistVoicePhotoSender));
        Object objAaT4 = bfm.AaT();
        if (zA1T || objAaT4 == obj) {
            objAaT4 = new AssistVoiceCameraKt$rememberAssistVoiceCameraLauncher$launchCamera$1$1(assistVoicePhotoSender, strA01, mutableStateA0N, mutableStateA0K);
            bfm.Ai0(objAaT4);
        }
        Function0<Unit> function0RememberHatchInAppCameraLauncher = HatchInAppCameraKt.rememberHatchInAppCameraLauncher((G0U) objAaT4, bfm, 0);
        if (!C1BO.A0F(c1boA02) || C1BO.A0F(c1boA022) || function0RememberHatchInAppCameraLauncher == null) {
            AnonymousClass001.A1D(bfm);
            return null;
        }
        boolean zA1T2 = AnonymousClass005.A1T(bfm, mutableStateA0N, mutableStateA0K, function0RememberHatchInAppCameraLauncher, AnonymousClass003.A1M(bfm, voiceCallStateHolderA0K, assistVoicePhotoSender));
        Object objAaT5 = bfm.AaT();
        if (zA1T2 || objAaT5 == obj) {
            objAaT5 = new AssistVoiceCameraKt$rememberAssistVoiceCameraLauncher$1$1(voiceCallStateHolderA0K, assistVoicePhotoSender, function0RememberHatchInAppCameraLauncher, mutableStateA0N, mutableStateA0K);
            bfm.Ai0(objAaT5);
        }
        Function0<Unit> function0 = (Function0) objAaT5;
        AnonymousClass001.A1D(bfm);
        return function0;
    }

    public static final void rememberAssistVoiceCameraLauncher$lambda$8(MutableState<Long> mutableState, long j) {
        mutableState.Af8(Long.valueOf(j));
    }
}
