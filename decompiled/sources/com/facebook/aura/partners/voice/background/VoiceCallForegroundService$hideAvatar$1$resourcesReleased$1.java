package com.facebook.aura.partners.voice.background;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1", f = "VoiceCallForegroundService.kt", l = {93, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ VoiceCallStateHolder $holder;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$1", f = "VoiceCallForegroundService.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0P(z);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1(VoiceCallStateHolder voiceCallStateHolder, HtJ<? super VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1> htJ) {
        super(2, htJ);
        this.$holder = voiceCallStateHolder;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1(this.$holder, htJ);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:7:0x0010). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L15
            if (r0 == r3) goto L2a
            if (r0 != r4) goto L3f
            X.Hwg.A00(r8)
        L10:
            if (r8 != 0) goto L18
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L15:
            X.Hwg.A00(r8)
        L18:
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r7.$holder
            X.1BN<java.lang.Boolean> r1 = r0.areEmbodimentMediaResourcesActive
            com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$1 r0 = new com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$1
            r0.<init>(r5)
            r7.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r6) goto L2d
            return r6
        L2a:
            X.Hwg.A00(r8)
        L2d:
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r7.$holder
            com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1 r2 = new com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1
            r2.<init>(r0, r5)
            r7.label = r4
            r0 = 32
            java.lang.Object r8 = X.GAX.A01(r7, r2, r0)
            if (r8 != r6) goto L10
            return r6
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1(this.$holder, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
