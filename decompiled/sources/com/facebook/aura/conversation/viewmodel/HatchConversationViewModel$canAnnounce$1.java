package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import com.facebook.aura.microphone.api.MicrophonePriority;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$canAnnounce$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewModel$canAnnounce$1 extends AbstractC07127nr implements G2j<Boolean, Boolean, MicrophonePriority, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;

    public HatchConversationViewModel$canAnnounce$1(HtJ<? super HatchConversationViewModel$canAnnounce$1> htJ) {
        super(4, htJ);
    }

    public final Object invoke(boolean z, boolean z2, MicrophonePriority microphonePriority, HtJ<? super Boolean> htJ) {
        HatchConversationViewModel$canAnnounce$1 hatchConversationViewModel$canAnnounce$1 = new HatchConversationViewModel$canAnnounce$1(htJ);
        hatchConversationViewModel$canAnnounce$1.Z$0 = z;
        hatchConversationViewModel$canAnnounce$1.Z$1 = z2;
        hatchConversationViewModel$canAnnounce$1.L$0 = microphonePriority;
        return hatchConversationViewModel$canAnnounce$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r3 = r4.Z$0
            boolean r2 = r4.Z$1
            java.lang.Object r1 = r4.L$0
            int r0 = r4.label
            if (r0 != 0) goto L1a
            X.Hwg.A00(r5)
            if (r3 != 0) goto L14
            if (r2 != 0) goto L14
            r0 = 1
            if (r1 == 0) goto L15
        L14:
            r0 = 0
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$canAnnounce$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, MicrophonePriority microphonePriority, HtJ<? super Boolean> htJ) {
        return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), microphonePriority, htJ);
    }
}
