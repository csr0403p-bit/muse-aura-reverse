package X;

import android.os.Handler;
import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceStateManager;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callintent.gen.CallIntentFactory;
import com.facebook.rsys.callintent.gen.CallIntentFactoryListener;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.sdk.RsysSdkImpl;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.meta.health.healthconnect.HealthConnectPlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FZP extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;

    public static C5322DgG A02(Object obj, int i) {
        return new C5322DgG(null, new FZP(obj, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZP(Object obj, int i) {
        super(0);
        this.$t = i;
        this.A00 = obj;
    }

    public static F0C A00(Integer num, Object obj, int i) {
        return AbstractC5321DgF.A02(num, new FZP(obj, i));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [TState, X.22I<com.facebook.rsys.metaaivoicestate.gen.MetaAiToolCallCancel>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [TState, X.22I<com.facebook.rsys.metaaivoicestate.gen.MetaAiToolCallRequest>] */
    /* JADX WARN: Type inference failed for: r3v10, types: [TState, X.GUy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [TState, int[]] */
    /* JADX WARN: Type inference failed for: r3v12, types: [TState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [TState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [TState, com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder] */
    /* JADX WARN: Type inference failed for: r3v15, types: [TState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [TState, X.GSs] */
    /* JADX WARN: Type inference failed for: r3v17, types: [TState, X.FH3] */
    /* JADX WARN: Type inference failed for: r3v18, types: [TState, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r3v19, types: [TState, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [TState, X.1BN<X.GRA>] */
    /* JADX WARN: Type inference failed for: r3v20, types: [TState, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v21, types: [TState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [TState, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v24, types: [TState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [TState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [TState, com.facebook.rsys.audiodevicestate.gen.AudioDeviceStateListener] */
    /* JADX WARN: Type inference failed for: r3v3, types: [TState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [TState, X.HzC] */
    /* JADX WARN: Type inference failed for: r3v7, types: [TState, X.GRp] */
    /* JADX WARN: Type inference failed for: r3v9, types: [TState, com.facebook.rsys.callintent.gen.CallIntentFactory] */
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ TState invoke() {
        ?? Invoke;
        switch (this.$t) {
            case 0:
                return ((MetaAiRsysSdkRealTimeSession) this.A00).A0D.A05;
            case 1:
                return ((MetaAiRsysSdkRealTimeSession) this.A00).A0D.A06;
            case 2:
                return ((MetaAiRsysSdkRealTimeSession) this.A00).A0D.A0C;
            case 3:
                return AbstractC7609F5w.A0o(((C9608GRp) this.A00).A02);
            case 4:
                return Hxb.A02(((GQN) this.A00).A05);
            case 5:
                GQN gqn = (GQN) this.A00;
                return new C9608GRp(gqn.A01, (C3UX) gqn.A03.getValue(), gqn.A00);
            case 6:
                Function0<AudioModule> function0 = ((GUl) this.A00).A00.A05;
                if (function0 != null) {
                    return function0.invoke();
                }
                return null;
            case 7:
                RsysSdkImpl rsysSdkImpl = (RsysSdkImpl) this.A00;
                AbstractC3136BzG.A00("RsysSdkImpl::initCallIntentFactory");
                try {
                    return CallIntentFactory.CProxy.createInstance(false, (TaskExecutor) C7384Etj.A0G(rsysSdkImpl.A0E), (CallIntentFactoryListener) rsysSdkImpl.A0D.getValue(), null);
                } finally {
                    Trace.endSection();
                }
            case 8:
                return new C9631GUy((RsysSdkImpl) this.A00);
            case 9:
                int[] iArr = new G8W().A00;
                iArr[172] = 2;
                iArr[197] = 2;
                iArr[648] = 1;
                return Arrays.copyOf(iArr, 6465);
            case 10:
            case 11:
            case 12:
            case 15:
            default:
                return null;
            case 13:
                return ((C9628GUq) this.A00).A06.invoke();
            case 14:
                return ((C9628GUq) this.A00).A07.invoke();
            case 16:
                C9628GUq c9628GUq = (C9628GUq) this.A00;
                ArrayList arrayListA11 = C60O.A11(3);
                arrayListA11.add(new GTT());
                OverlayConfigLayerInterface overlayConfigLayerInterface = c9628GUq.A02;
                if (overlayConfigLayerInterface != null) {
                    arrayListA11.add(overlayConfigLayerInterface);
                }
                arrayListA11.add(c9628GUq.A01);
                return new OverlayConfigManagerHolder((ArrayList<OverlayConfigLayerInterface>) arrayListA11);
            case 17:
                return ((C9628GUq) this.A00).A08.invoke();
            case 18:
                AudioDeviceStateManager audioDeviceStateManager = ((GWq) this.A00).A00;
                if (audioDeviceStateManager != null) {
                    return audioDeviceStateManager.getListener();
                }
                return null;
            case 19:
                return new C9623GSs((C9621GSq) this.A00);
            case 20:
                return ((FGE) this.A00).getMountRestartPolicy();
            case 21:
                C7739FCq c7739FCq = (C7739FCq) this.A00;
                ((Handler) c7739FCq.A05.getValue()).removeCallbacks(c7739FCq.A03);
                Choreographer.getInstance().removeFrameCallback(c7739FCq.A02);
                return Unit.INSTANCE;
            case 22:
                return Boolean.valueOf(((View) this.A00).isEnabled());
            case 23:
                return AnonymousClass001.A0h();
            case 24:
                HealthConnectPlugin healthConnectPlugin = (HealthConnectPlugin) this.A00;
                Set<String> set = HealthConnectPlugin.A09;
                return healthConnectPlugin.A05.invoke(healthConnectPlugin.A00);
            case 25:
                G6B g6b = (G6B) this.A00;
                boolean z = true;
                if (!G6Y.A01(g6b)) {
                    Iterator<G65> it = g6b.A00.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            G65 g65A1D = AbstractC7607F5u.A1D(it);
                            if (!((G69) g65A1D).A03.equals(AbstractC9206G6m.A0L) || !G6Y.A01(g65A1D)) {
                            }
                        } else {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                C9659Gcj c9659Gcj = (C9659Gcj) this.A00;
                synchronized (c9659Gcj.A01) {
                    Invoke = c9659Gcj.A03.AFy().invoke();
                }
                return Invoke;
        }
    }
}
