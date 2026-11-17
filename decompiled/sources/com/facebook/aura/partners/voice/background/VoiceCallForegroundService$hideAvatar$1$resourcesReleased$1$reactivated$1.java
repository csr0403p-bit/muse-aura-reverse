package com.facebook.aura.partners.voice.background;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1", f = "VoiceCallForegroundService.kt", l = {96}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ VoiceCallStateHolder $holder;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1$1", f = "VoiceCallForegroundService.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1$1, reason: invalid class name */
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
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
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
    public VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1(VoiceCallStateHolder voiceCallStateHolder, HtJ<? super VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1> htJ) {
        super(2, htJ);
        this.$holder = voiceCallStateHolder;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1(this.$holder, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<Boolean> c1bn = this.$holder.areEmbodimentMediaResourcesActive;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, c1bn);
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

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new VoiceCallForegroundService$hideAvatar$1$resourcesReleased$1$reactivated$1(this.$holder, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
