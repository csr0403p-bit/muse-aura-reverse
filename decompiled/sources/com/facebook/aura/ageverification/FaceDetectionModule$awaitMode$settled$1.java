package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.BLG;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$settled$1", f = "FaceDetectionModule.kt", l = {135}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class FaceDetectionModule$awaitMode$settled$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ModuleLoad>, Object> {
    public int label;

    @DebugMetadata(c = "com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$settled$1$1", f = "FaceDetectionModule.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$settled$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<ModuleLoad, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.G0V
        public final Object invoke(ModuleLoad moduleLoad, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = moduleLoad;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r1 = r2.L$0
                com.facebook.aura.ageverification.ModuleLoad r1 = (com.facebook.aura.ageverification.ModuleLoad) r1
                int r0 = r2.label
                if (r0 != 0) goto L1c
                X.Hwg.A00(r3)
                com.facebook.aura.ageverification.FaceDetectionModuleState r2 = r1.state
                com.facebook.aura.ageverification.FaceDetectionModuleState r0 = com.facebook.aura.ageverification.FaceDetectionModuleState.READY
                if (r2 == r0) goto L16
                com.facebook.aura.ageverification.FaceDetectionModuleState r1 = com.facebook.aura.ageverification.FaceDetectionModuleState.UNAVAILABLE
                r0 = 0
                if (r2 != r1) goto L17
            L16:
                r0 = 1
            L17:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L1c:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$settled$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public FaceDetectionModule$awaitMode$settled$1(HtJ<? super FaceDetectionModule$awaitMode$settled$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FaceDetectionModule$awaitMode$settled$1(htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ModuleLoad> htJ) {
        return new FaceDetectionModule$awaitMode$settled$1(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BLG<ModuleLoad> blg = FaceDetectionModule.moduleLoad;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, blg);
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
