package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass002;
import X.BL4;
import X.C1BO;
import X.G0W;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class EmbodimentSurfaceBindingKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.screen.EmbodimentSurfaceBinding rememberEmbodimentSurfaceBinding(com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel r32, com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r33, boolean r34, boolean r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding(com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel, com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, boolean, boolean, X.BFM, int, int):com.facebook.aura.partners.voice.screen.EmbodimentSurfaceBinding");
    }

    public static final void rememberEmbodimentSurfaceBinding$lambda$10(MutableState<BL4> mutableState, long j) {
        mutableState.Af8(new BL4(j));
    }

    public static final /* synthetic */ G0W access$rememberEmbodimentSurfaceBinding$lambda$24(C1BO c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final /* synthetic */ G0W access$rememberEmbodimentSurfaceBinding$lambda$26(C1BO c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final /* synthetic */ Surface access$rememberEmbodimentSurfaceBinding$lambda$6(MutableState mutableState) {
        return (Surface) mutableState.getValue();
    }

    public static final void rememberEmbodimentSurfaceBinding$attachRendererIfNeeded(VoiceCallViewModel voiceCallViewModel, VoiceCallStateHolder voiceCallStateHolder, Object obj, MutableState<Surface> mutableState, MutableState<BL4> mutableState2, MutableState<Boolean> mutableState3, MutableState<Integer> mutableState4) {
        Surface value = mutableState.getValue();
        if (value == null || rememberEmbodimentSurfaceBinding$lambda$9(mutableState2) == 0 || MutableState.A0A((MutableState) mutableState3)) {
            return;
        }
        mutableState4.Af8(voiceCallViewModel.attachEmbodimentSurface(value, (int) (rememberEmbodimentSurfaceBinding$lambda$9(mutableState2) >> 32), AnonymousClass002.A09(rememberEmbodimentSurfaceBinding$lambda$9(mutableState2))));
        MutableState.A09(AnonymousClass002.A1X(mutableState4.getValue()), mutableState3);
        voiceCallStateHolder.setEmbodimentRtcRendererAttached(obj, MutableState.A0A((MutableState) mutableState3));
    }

    public static final void rememberEmbodimentSurfaceBinding$detachRendererIfNeeded(VoiceCallViewModel voiceCallViewModel, VoiceCallStateHolder voiceCallStateHolder, Object obj, MutableState<Surface> mutableState, MutableState<Boolean> mutableState2, MutableState<Integer> mutableState3) {
        Surface value = mutableState.getValue();
        if (value == null || !MutableState.A0A((MutableState) mutableState2)) {
            return;
        }
        voiceCallViewModel.detachEmbodimentSurface(value);
        mutableState3.Af8(null);
        MutableState.A09(false, mutableState2);
        voiceCallStateHolder.setEmbodimentRtcRendererAttached(obj, false);
    }

    public static final G0W<Surface, Integer, Integer, Unit> rememberEmbodimentSurfaceBinding$lambda$24(C1BO<? extends G0W<? super Surface, ? super Integer, ? super Integer, Unit>> c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final G0W<Surface, Integer, Integer, Unit> rememberEmbodimentSurfaceBinding$lambda$26(C1BO<? extends G0W<? super Surface, ? super Integer, ? super Integer, Unit>> c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final long rememberEmbodimentSurfaceBinding$lambda$9(MutableState<BL4> mutableState) {
        return mutableState.getValue().A00;
    }
}
