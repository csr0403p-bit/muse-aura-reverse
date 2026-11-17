package com.facebook.aura.composer.camera;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C2678Bha;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraSession$bind$cameras$1", f = "HatchCameraSession.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchCameraSession$bind$cameras$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super C2678Bha>, Object> {
    public int label;
    public final /* synthetic */ HatchCameraSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCameraSession$bind$cameras$1(HatchCameraSession hatchCameraSession, HtJ<? super HatchCameraSession$bind$cameras$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchCameraSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCameraSession$bind$cameras$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super C2678Bha> htJ) {
        return new HatchCameraSession$bind$cameras$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchCameraSession hatchCameraSession = this.this$0;
            this.label = 1;
            obj = hatchCameraSession.cameraProvider(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}
