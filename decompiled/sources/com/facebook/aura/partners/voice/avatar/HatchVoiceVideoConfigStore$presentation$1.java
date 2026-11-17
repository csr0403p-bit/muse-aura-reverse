package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$presentation$1", f = "HatchAvatarReferenceStore.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchVoiceVideoConfigStore$presentation$1 extends AbstractC07127nr implements G2j<HatchVoiceVideoConfigStore.Snapshot, HatchVoiceVideoConfigStore.Snapshot, Object, HtJ<? super HatchVoiceVideoConfigStore.Snapshot>, Object> {
    public int label;
    public final /* synthetic */ HatchVoiceVideoConfigStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceVideoConfigStore$presentation$1(HatchVoiceVideoConfigStore hatchVoiceVideoConfigStore, HtJ<? super HatchVoiceVideoConfigStore$presentation$1> htJ) {
        super(4, htJ);
        this.this$0 = hatchVoiceVideoConfigStore;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(HatchVoiceVideoConfigStore.Snapshot snapshot, HatchVoiceVideoConfigStore.Snapshot snapshot2, Object obj, HtJ<? super HatchVoiceVideoConfigStore.Snapshot> htJ) {
        return new HatchVoiceVideoConfigStore$presentation$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return this.this$0.snapshot();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HatchVoiceVideoConfigStore.Snapshot snapshot, HatchVoiceVideoConfigStore.Snapshot snapshot2, Object obj, HtJ<? super HatchVoiceVideoConfigStore.Snapshot> htJ) {
        return new HatchVoiceVideoConfigStore$presentation$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
