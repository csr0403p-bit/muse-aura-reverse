package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.CFK;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionWithResult$job$1", f = "VoiceSelectionRepository.kt", l = {194, 233}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoiceSelectionRepository$persistSelectionWithResult$job$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $generation;
    public final /* synthetic */ G0U<VoiceSelectionRepository.SelectionResult, Unit> $onResult;
    public final /* synthetic */ C10543Hqv<VoiceSelectionRepository.SelectionResult> $outcome;
    public final /* synthetic */ boolean $reportFailure;
    public final /* synthetic */ String $rowId;
    public final /* synthetic */ G0W<String, Integer, HtJ<? super VoiceSelectionRepository.SelectionResult>, Object> $save;
    public final /* synthetic */ C10543Hqv<String> $target;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public int label;
    public final /* synthetic */ VoiceSelectionRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionWithResult$job$1$5", f = "VoiceSelectionRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionWithResult$job$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<VoiceSelectionRepository.SelectionResult, Unit> $onResult;
        public final /* synthetic */ C10543Hqv<VoiceSelectionRepository.SelectionResult> $outcome;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(G0U<? super VoiceSelectionRepository.SelectionResult, Unit> g0u, C10543Hqv<VoiceSelectionRepository.SelectionResult> c10543Hqv, HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
            this.$onResult = g0u;
            this.$outcome = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass5(this.$onResult, this.$outcome, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                this.$onResult.invoke(this.$outcome.element);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(VoiceSelectionRepositoryKt.TAG, "voice selection onResult callback failed", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass5) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceSelectionRepository$persistSelectionWithResult$job$1(int i, VoiceSelectionRepository voiceSelectionRepository, C10543Hqv<VoiceSelectionRepository.SelectionResult> c10543Hqv, C10543Hqv<String> c10543Hqv2, AbstractC3358CGz abstractC3358CGz, G0W<? super String, ? super Integer, ? super HtJ<? super VoiceSelectionRepository.SelectionResult>, ? extends Object> g0w, boolean z, String str, G0U<? super VoiceSelectionRepository.SelectionResult, Unit> g0u, HtJ<? super VoiceSelectionRepository$persistSelectionWithResult$job$1> htJ) {
        super(1, htJ);
        this.$generation = i;
        this.this$0 = voiceSelectionRepository;
        this.$outcome = c10543Hqv;
        this.$target = c10543Hqv2;
        this.$userSession = abstractC3358CGz;
        this.$save = g0w;
        this.$reportFailure = z;
        this.$rowId = str;
        this.$onResult = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new VoiceSelectionRepository$persistSelectionWithResult$job$1(this.$generation, this.this$0, this.$outcome, this.$target, this.$userSession, this.$save, this.$reportFailure, this.$rowId, this.$onResult, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult] */
    /* JADX WARN: Type inference failed for: r4v28, types: [T, com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult] */
    /* JADX WARN: Type inference failed for: r4v36, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionWithResult$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((VoiceSelectionRepository$persistSelectionWithResult$job$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
