package com.facebook.aura.partners.voice.infra;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GBK;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository$checkNuxBeforeCall$check$1", f = "VoiceNuxRepository.kt", l = {50, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceNuxRepository$checkNuxBeforeCall$check$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $onNuxDue;
    public final /* synthetic */ Function0<Unit> $onSeen;
    public Object L$0;
    public int label;
    public final /* synthetic */ VoiceNuxRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository$checkNuxBeforeCall$check$1$1", f = "VoiceNuxRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceNuxRepository$checkNuxBeforeCall$check$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $onNuxDue;
        public final /* synthetic */ Function0<Unit> $onSeen;
        public final /* synthetic */ Boolean $seenOnAccount;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Boolean bool, Function0<Unit> function0, Function0<Unit> function02, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$seenOnAccount = bool;
            this.$onNuxDue = function0;
            this.$onSeen = function02;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$seenOnAccount, this.$onNuxDue, this.$onSeen, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            (AnonymousClass002.A1b(this.$seenOnAccount, false) ? this.$onNuxDue : this.$onSeen).invoke();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceNuxRepository$checkNuxBeforeCall$check$1(VoiceNuxRepository voiceNuxRepository, Function0<Unit> function0, Function0<Unit> function02, HtJ<? super VoiceNuxRepository$checkNuxBeforeCall$check$1> htJ) {
        super(2, htJ);
        this.this$0 = voiceNuxRepository;
        this.$onNuxDue = function0;
        this.$onSeen = function02;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceNuxRepository$checkNuxBeforeCall$check$1(this.this$0, this.$onNuxDue, this.$onSeen, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        SingleFlightResult.Result result;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceNuxRepository voiceNuxRepository = this.this$0;
            SingleFlight singleFlight = voiceNuxRepository.accountCheck;
            VoiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1 voiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1 = new VoiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1(voiceNuxRepository, null);
            this.label = 1;
            obj = singleFlight.invoke(Unit.INSTANCE, voiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        Boolean bool = (!(obj instanceof SingleFlightResult.Result) || (result = (SingleFlightResult.Result) obj) == null) ? null : (Boolean) result.value;
        if (AnonymousClass002.A1b(bool, true)) {
            VoicePrefs.INSTANCE.setVoiceNuxSeen(this.this$0.userSession);
        } else if (!AnonymousClass002.A1b(bool, false)) {
            if (bool != null) {
                throw C3cG.A0q();
            }
            CFK.A06(VoiceNuxRepository.TAG, "Voice NUX account state unknown, starting the call without the NUX");
        }
        GBK gbk = AuraDispatchers.mainImmediate;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(bool, this.$onNuxDue, this.$onSeen, null);
        this.L$0 = null;
        this.label = 2;
        if (GAo.A00(this, gbk, anonymousClass1) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceNuxRepository$checkNuxBeforeCall$check$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
