package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.DeviceCallStateTracker;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1", f = "VoiceCallEndedAnnouncement.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures, 54, 57, 59, 63}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Long> $callGeneration$delegate;
    public final /* synthetic */ C1BO<Boolean> $isCallActive$delegate;
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ MutableState<CallEndedPhase> $phase$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ MutableState<Boolean> $wasActive$delegate;
    public int I$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1$1", f = "VoiceCallEndedAnnouncement.kt", l = {52}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                DeviceCallStateTracker deviceCallStateTracker = DeviceCallStateTracker.INSTANCE;
                this.label = 1;
                if (deviceCallStateTracker.awaitAudioModeReleased(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1$2", f = "VoiceCallEndedAnnouncement.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<EnumC10573Huf, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10573Huf enumC10573Huf = (EnumC10573Huf) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(enumC10573Huf.A00(EnumC10573Huf.A05));
        }

        @Override // X.G0V
        public final Object invoke(EnumC10573Huf enumC10573Huf, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = enumC10573Huf;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1$3", f = "VoiceCallEndedAnnouncement.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<EnumC10573Huf, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10573Huf enumC10573Huf = (EnumC10573Huf) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(enumC10573Huf.A00(EnumC10573Huf.A05));
        }

        @Override // X.G0V
        public final Object invoke(EnumC10573Huf enumC10573Huf, HtJ<? super Boolean> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = enumC10573Huf;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1(F2N f2n, VoiceCallStateHolder voiceCallStateHolder, MutableState<Boolean> mutableState, C1BO<Boolean> c1bo, MutableState<CallEndedPhase> mutableState2, C1BO<Long> c1bo2, HtJ<? super VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1> htJ) {
        super(2, htJ);
        this.$lifecycle = f2n;
        this.$stateHolder = voiceCallStateHolder;
        this.$wasActive$delegate = mutableState;
        this.$isCallActive$delegate = c1bo;
        this.$phase$delegate = mutableState2;
        this.$callGeneration$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1(this.$lifecycle, this.$stateHolder, this.$wasActive$delegate, this.$isCallActive$delegate, this.$phase$delegate, this.$callGeneration$delegate, htJ);
    }

    /* JADX WARN: Path cross not found for [B:16:0x0034, B:18:0x003d], limit reached: 49 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d4 -> B:42:0x00dc). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
