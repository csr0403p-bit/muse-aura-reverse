package com.facebook.aura.partners.voice.impl;

import X.A3q;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7607F5u;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass602;
import X.C10543Hqv;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3rb;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.EnumC10460Hji;
import X.F0C;
import X.G0V;
import X.G0W;
import X.GAo;
import X.GDB;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.livesession.api.LiveConversation;
import com.facebook.aura.livesession.api.LiveConversationReplies;
import com.facebook.aura.livesession.api.LiveTranscript;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.threadvoicecaption.ThreadAssistantCaption;
import com.facebook.aura.threadvoicecaption.ThreadVoiceCaption;
import com.facebook.aura.threadvoicecaption.ThreadVoiceCaptionBus;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class VoiceLiveTranscript implements LiveTranscript {
    public static final int $stable = 8;
    public Long activeCallGeneration;
    public String activeMessageId;
    public final F0C captionBus$delegate;
    public final LiveConversation conversation;
    public PreConnectHandoff handoff;
    public final Object lock;
    public String preConnectTurnId;
    public HoC provisionalSettle;
    public final C3UX scope;
    public Long serverTranscriptCallGeneration;
    public ThreadVoiceCaption shownCaption;
    public Long shownCaptionCallGeneration;
    public final F0C stateHolder$delegate;
    public final String threadId;
    public final Map<String, Long> unreconciledCallGenerations;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$1", f = "VoiceLiveTranscript.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceLiveTranscript voiceLiveTranscript = VoiceLiveTranscript.this;
                this.label = 1;
                if (voiceLiveTranscript.showLocalCaptions(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$2", f = "VoiceLiveTranscript.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceLiveTranscript voiceLiveTranscript = VoiceLiveTranscript.this;
                this.label = 1;
                if (voiceLiveTranscript.resetWhenCallEnds(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$3", f = "VoiceLiveTranscript.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceLiveTranscript voiceLiveTranscript = VoiceLiveTranscript.this;
                this.label = 1;
                if (voiceLiveTranscript.dropStaleCalls(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$4", f = "VoiceLiveTranscript.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass4(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceLiveTranscript voiceLiveTranscript = VoiceLiveTranscript.this;
                this.label = 1;
                if (voiceLiveTranscript.confirmThreadWhenConnected(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$5", f = "VoiceLiveTranscript.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass5(HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass5(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceLiveTranscript.this.new AnonymousClass5(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceLiveTranscript voiceLiveTranscript = VoiceLiveTranscript.this;
                this.label = 1;
                if (voiceLiveTranscript.resetWhenUndeliveredSpeechSettles(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$confirmThreadWhenConnected$2", f = "VoiceLiveTranscript.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$confirmThreadWhenConnected$2, reason: invalid class name and case insensitive filesystem */
    public final class C131012 extends AbstractC07127nr implements G0W<Boolean, String, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        public C131012(HtJ<? super C131012> htJ) {
            super(3, htJ);
        }

        public final Object invoke(boolean z, String str, HtJ<? super Boolean> htJ) {
            C131012 c131012 = VoiceLiveTranscript.this.new C131012(htJ);
            c131012.Z$0 = z;
            c131012.L$0 = str;
            return c131012.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r2 = r3.Z$0
                java.lang.Object r1 = r3.L$0
                int r0 = r3.label
                if (r0 != 0) goto L1e
                X.Hwg.A00(r4)
                if (r2 == 0) goto L18
                com.facebook.aura.partners.voice.impl.VoiceLiveTranscript r0 = com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.this
                java.lang.String r0 = r0.threadId
                boolean r1 = X.C7384Etj.areEqual(r1, r0)
                r0 = 1
                if (r1 != 0) goto L19
            L18:
                r0 = 0
            L19:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L1e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.C131012.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), str, htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript", f = "VoiceLiveTranscript.kt", l = {229}, m = "dropStaleCalls", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$dropStaleCalls$1, reason: invalid class name and case insensitive filesystem */
    public final class C131031 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C131031(HtJ<? super C131031> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceLiveTranscript.this.dropStaleCalls(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript", f = "VoiceLiveTranscript.kt", l = {200}, m = "resetWhenCallEnds", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$resetWhenCallEnds$1, reason: invalid class name and case insensitive filesystem */
    public final class C131061 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C131061(HtJ<? super C131061> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceLiveTranscript.this.resetWhenCallEnds(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$showProvisionalCaption$1", f = "VoiceLiveTranscript.kt", l = {148}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$showProvisionalCaption$1, reason: invalid class name and case insensitive filesystem */
    public final class C131111 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ThreadVoiceCaption $caption;
        public final /* synthetic */ String $text;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131111(ThreadVoiceCaption threadVoiceCaption, String str, HtJ<? super C131111> htJ) {
            super(2, htJ);
            this.$caption = threadVoiceCaption;
            this.$text = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceLiveTranscript.this.new C131111(this.$caption, this.$text, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            Long l;
            Long l2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(400L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            VoiceLiveTranscript voiceLiveTranscript = VoiceLiveTranscript.this;
            Object obj2 = voiceLiveTranscript.lock;
            ThreadVoiceCaption threadVoiceCaption = this.$caption;
            String str = this.$text;
            synchronized (obj2) {
                long jA09 = C3cH.A09(voiceLiveTranscript.getStateHolder().callAttemptGeneration);
                if (C7384Etj.areEqual(voiceLiveTranscript.shownCaption, threadVoiceCaption) && (l = voiceLiveTranscript.shownCaptionCallGeneration) != null && l.longValue() == jA09 && ((l2 = voiceLiveTranscript.serverTranscriptCallGeneration) == null || l2.longValue() != jA09)) {
                    voiceLiveTranscript.conversation.showProvisionalUserMessage(threadVoiceCaption.turnId, str);
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C131111) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void clearActive() {
        this.activeMessageId = null;
        this.activeCallGeneration = null;
    }

    @Override // com.facebook.aura.livesession.api.LiveTranscript
    public boolean claimServerUserMessage(String str) {
        boolean z;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            PreConnectHandoff preConnectHandoff = this.handoff;
            if (str.equals(preConnectHandoff != null ? preConnectHandoff.messageId : null)) {
                this.handoff = null;
                if (str.equals(this.activeMessageId)) {
                    clearActive();
                }
            } else {
                z = str.equals(this.activeMessageId) || this.unreconciledCallGenerations.containsKey(str);
                if (str.equals(this.activeMessageId)) {
                    clearActive();
                }
                this.unreconciledCallGenerations.remove(str);
            }
        }
        return z;
    }

    @Override // com.facebook.aura.livesession.api.LiveTranscript
    public void onServerTranscriptDone(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            PreConnectHandoff preConnectHandoff = this.handoff;
            if (preConnectHandoff != null && str.equals(preConnectHandoff.messageId) && !C7BY.A0j(preConnectHandoff.serverText)) {
                this.conversation.showProvisionalUserMessage(preConnectHandoff.turnId, preConnectHandoff.serverText.toString());
            }
            if (str.equals(this.activeMessageId)) {
                clearActive();
            }
            this.conversation.finishStreamingUserMessage(str);
        }
    }

    @Override // com.facebook.aura.livesession.api.LiveTranscript
    public void onServerTranscriptStart(String str, Long l) {
        Long l2;
        Long l3;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            if (isCurrentCallScope()) {
                PreConnectHandoff preConnectHandoff = this.handoff;
                if (!str.equals(preConnectHandoff != null ? preConnectHandoff.messageId : null)) {
                    long jA09 = C3cH.A09(getStateHolder().callAttemptGeneration);
                    ThreadVoiceCaption threadVoiceCaption = this.shownCaption;
                    if (threadVoiceCaption == null || !C7384Etj.areEqual(threadVoiceCaption.turnId, this.preConnectTurnId) || (l2 = this.shownCaptionCallGeneration) == null || l2.longValue() != jA09 || ((l3 = this.serverTranscriptCallGeneration) != null && l3.longValue() == jA09)) {
                        threadVoiceCaption = null;
                    }
                    PreConnectHandoff preConnectHandoff2 = this.handoff;
                    if (preConnectHandoff2 != null) {
                        this.unreconciledCallGenerations.put(preConnectHandoff2.messageId, Long.valueOf(preConnectHandoff2.callGeneration));
                    }
                    this.handoff = threadVoiceCaption != null ? new PreConnectHandoff(str, threadVoiceCaption.turnId, threadVoiceCaption.text, jA09) : null;
                    Long lValueOf = Long.valueOf(jA09);
                    this.serverTranscriptCallGeneration = lValueOf;
                    this.activeMessageId = str;
                    this.activeCallGeneration = lValueOf;
                    if (threadVoiceCaption == null) {
                        this.unreconciledCallGenerations.put(str, lValueOf);
                        this.conversation.startStreamingUserMessage(str, l);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object confirmThreadWhenConnected(HtJ<? super Unit> htJ) {
        if (this.threadId != null) {
            Object objCollect = new VoiceLiveTranscript$confirmThreadWhenConnected$$inlined$filter$1(GDB.A01(C3rb.A03(new C131012(null), getStateHolder().isInputReady, getStateHolder().activeThreadId))).collect(new C20Z() { // from class: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.confirmThreadWhenConnected.4
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                    VoiceLiveTranscript.this.conversation.onLiveSessionConnected();
                    return Unit.INSTANCE;
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ2) {
                    VoiceLiveTranscript.this.conversation.onLiveSessionConnected();
                    return Unit.INSTANCE;
                }
            }, htJ);
            if (objCollect == EnumC10460Hji.A02) {
                return objCollect;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dropStaleCall(long j) {
        HoC hoC;
        synchronized (this.lock) {
            Long l = this.serverTranscriptCallGeneration;
            if (l == null || l.longValue() != j) {
                this.serverTranscriptCallGeneration = null;
            }
            PreConnectHandoff preConnectHandoff = this.handoff;
            if (preConnectHandoff == null || preConnectHandoff.callGeneration != j) {
                this.handoff = null;
            }
            Long l2 = this.shownCaptionCallGeneration;
            if ((l2 == null || l2.longValue() != j) && (hoC = this.provisionalSettle) != null) {
                hoC.A5w(null);
            }
            Long l3 = this.activeCallGeneration;
            if (l3 != null && l3.longValue() != j) {
                finishActive();
            }
            Map<String, Long> map = this.unreconciledCallGenerations;
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (C3cG.A05(entryA0l.getValue()) != j) {
                    AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                }
            }
            Set<String> setA0g = AbstractC0878AGe.A0g(linkedHashMapA0j.keySet());
            this.conversation.removeProvisionalUserMessages(setA0g);
            Iterator<String> it = setA0g.iterator();
            while (it.hasNext()) {
                this.unreconciledCallGenerations.remove(AnonymousClass005.A0j(it));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dropStaleCalls(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.C131031
            if (r0 == 0) goto L22
            r6 = r8
            com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$dropStaleCalls$1 r6 = (com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.C131031) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 == r4) goto L53
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$dropStaleCalls$1 r6 = new com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$dropStaleCalls$1
            r6.<init>(r8)
            goto L12
        L28:
            X.Hwg.A00(r1)
            X.BO7 r3 = new X.BO7
            r3.<init>()
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r7.getStateHolder()
            X.1BN<java.lang.Long> r0 = r0.callAttemptGeneration
            long r0 = X.C3cH.A09(r0)
            r3.element = r0
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r7.getStateHolder()
            X.1BN<java.lang.Long> r2 = r0.callAttemptGeneration
            com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$dropStaleCalls$2 r1 = new com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$dropStaleCalls$2
            r1.<init>()
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r0 = r2.collect(r1, r6)
            if (r0 != r5) goto L56
            return r5
        L53:
            X.Hwg.A00(r1)
        L56:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.dropStaleCalls(X.HtJ):java.lang.Object");
    }

    private final void finishActive() {
        String str = this.activeMessageId;
        if (str != null) {
            clearActive();
            this.conversation.finishStreamingUserMessage(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadVoiceCaptionBus getCaptionBus() {
        return (ThreadVoiceCaptionBus) this.captionBus$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceCallStateHolder getStateHolder() {
        return (VoiceCallStateHolder) this.stateHolder$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resetWhenCallEnds(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.C131061
            if (r0 == 0) goto L22
            r4 = r6
            com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$resetWhenCallEnds$1 r4 = (com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.C131061) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L3f
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$resetWhenCallEnds$1 r4 = new com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$resetWhenCallEnds$1
            r4.<init>(r6)
            goto L12
        L28:
            X.Hwg.A00(r1)
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r5.getStateHolder()
            X.1BN<java.lang.Boolean> r1 = r0.isCallActive
            com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$resetWhenCallEnds$2 r0 = new com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$resetWhenCallEnds$2
            r0.<init>()
            r4.label = r2
            java.lang.Object r0 = r1.collect(r0, r4)
            if (r0 != r3) goto L42
            return r3
        L3f:
            X.Hwg.A00(r1)
        L42:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.resetWhenCallEnds(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProvisionalCaption(ThreadVoiceCaption threadVoiceCaption) {
        HoC hoC = this.provisionalSettle;
        if (hoC != null) {
            hoC.A5w(null);
        }
        String str = threadVoiceCaption.text;
        String strWithoutPartialWord = VoiceGating.INSTANCE.isPartialWordHoldEnabled() ? VoiceLiveTranscriptKt.withoutPartialWord(str) : null;
        LiveConversation liveConversation = this.conversation;
        String str2 = threadVoiceCaption.turnId;
        if (strWithoutPartialWord == null) {
            liveConversation.showProvisionalUserMessage(str2, str);
        } else {
            liveConversation.showProvisionalUserMessage(str2, strWithoutPartialWord);
            this.provisionalSettle = AnonymousClass001.A11(new C131111(threadVoiceCaption, str, null), this.scope);
        }
    }

    @Override // com.facebook.aura.livesession.api.LiveTranscript
    public void onConversationCleared() {
        if (this.conversation.getReplies() != null) {
            getCaptionBus().clearAssistant(this.threadId);
        }
    }

    @Override // com.facebook.aura.livesession.api.LiveTranscript
    public void onStreamReset() {
        synchronized (this.lock) {
            this.serverTranscriptCallGeneration = null;
            this.handoff = null;
            this.shownCaption = null;
            HoC hoC = this.provisionalSettle;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.preConnectTurnId = null;
            finishActive();
            this.conversation.removeProvisionalUserMessages(AbstractC0878AGe.A0g(this.unreconciledCallGenerations.keySet()));
            this.unreconciledCallGenerations.clear();
        }
    }

    public VoiceLiveTranscript(AbstractC3358CGz abstractC3358CGz, LiveConversation liveConversation, C3UX c3ux) {
        AnonymousClass005.A0x(abstractC3358CGz, liveConversation, c3ux);
        this.conversation = liveConversation;
        this.scope = c3ux;
        this.stateHolder$delegate = AbstractC7607F5u.A1A(null, new VoiceLiveTranscript$stateHolder$2(abstractC3358CGz));
        this.captionBus$delegate = AbstractC7607F5u.A1A(null, new VoiceLiveTranscript$captionBus$2(abstractC3358CGz));
        this.threadId = liveConversation.getThreadId();
        this.lock = C3cG.A0T();
        this.unreconciledCallGenerations = C3cG.A0j();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, c3ux);
        GAo.A02(num, c6ys, new AnonymousClass2(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass3(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass4(null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass5(null), c3ux);
        C20Q<LiveConversationReplies> replies = liveConversation.getReplies();
        if (replies != null) {
            GAo.A02(num, c6ys, new VoiceLiveTranscript$6$1(this, null), c3ux);
            GAo.A02(num, c6ys, new VoiceLiveTranscript$6$2(this, replies, null), c3ux);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentCallScope() {
        return C3cH.A1R(getStateHolder().isCallActive) && C7384Etj.areEqual(getStateHolder().activeThreadId.getValue(), this.threadId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object publishReplyCaptions(C20Q<? extends LiveConversationReplies> c20q, HtJ<? super Unit> htJ) {
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        Object objCollect = c20q.collect(new C20Z() { // from class: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.publishReplyCaptions.2
            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(LiveConversationReplies liveConversationReplies, HtJ<? super Unit> htJ2) {
                String strAgentMessageText;
                T t = (T) liveConversationReplies.getStreamingMessageId();
                String str = t;
                if (!liveConversationReplies.isStreamDone()) {
                    c10543HqvA0z.element = t;
                    str = t;
                    if (t == 0) {
                        this.getCaptionBus().clearAssistant(this.threadId);
                        str = t;
                    }
                } else if (t == 0) {
                    str = (T) ((String) c10543HqvA0z.element);
                }
                if (str != null && (strAgentMessageText = liveConversationReplies.agentMessageText(str)) != null && !C7BY.A0j(strAgentMessageText)) {
                    this.getCaptionBus().publishAssistant(new ThreadAssistantCaption(str, strAgentMessageText, this.threadId));
                } else if (liveConversationReplies.isStreamDone()) {
                    this.getCaptionBus().clearAssistant(this.threadId);
                }
                if (liveConversationReplies.isStreamDone()) {
                    c10543HqvA0z.element = null;
                }
                return Unit.INSTANCE;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit((LiveConversationReplies) obj, (HtJ<? super Unit>) htJ2);
            }
        }, htJ);
        return objCollect != EnumC10460Hji.A02 ? Unit.INSTANCE : objCollect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object resetWhenUndeliveredSpeechSettles(HtJ<? super Unit> htJ) {
        Object objCollect = new AnonymousClass602(getStateHolder().undeliveredSpeechPending(this.threadId), 0).collect(new C20Z() { // from class: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.resetWhenUndeliveredSpeechSettles.2
            public final Object emit(boolean z, HtJ<? super Unit> htJ2) {
                if (!z) {
                    VoiceLiveTranscript voiceLiveTranscript = VoiceLiveTranscript.this;
                    synchronized (voiceLiveTranscript.lock) {
                        if (!C3cH.A1R(voiceLiveTranscript.getStateHolder().isCallActive)) {
                            voiceLiveTranscript.onStreamReset();
                        }
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit(AnonymousClass001.A1X(obj), (HtJ<? super Unit>) htJ2);
            }
        }, htJ);
        return objCollect != EnumC10460Hji.A02 ? Unit.INSTANCE : objCollect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendUndeliveredSpeech(HtJ<? super Unit> htJ) {
        Object objCollect = getStateHolder().undeliveredSpeech(this.threadId).collect(new C20Z() { // from class: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.sendUndeliveredSpeech.2
            public final Object emit(VoiceCallStateHolder.UndeliveredSpeechOffer undeliveredSpeechOffer, HtJ<? super Unit> htJ2) {
                VoiceLiveTranscript.this.conversation.sendUserMessage(undeliveredSpeechOffer.text, undeliveredSpeechOffer.turnId);
                return Unit.INSTANCE;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit((VoiceCallStateHolder.UndeliveredSpeechOffer) obj, (HtJ<? super Unit>) htJ2);
            }
        }, htJ);
        return objCollect != EnumC10460Hji.A02 ? Unit.INSTANCE : objCollect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showLocalCaptions(HtJ<? super Unit> htJ) {
        Object objCollect = getCaptionBus().caption(this.threadId).collect(new C20Z() { // from class: com.facebook.aura.partners.voice.impl.VoiceLiveTranscript.showLocalCaptions.2
            public final Object emit(ThreadVoiceCaption threadVoiceCaption, HtJ<? super Unit> htJ2) {
                Unit unit;
                VoiceLiveTranscript voiceLiveTranscript = VoiceLiveTranscript.this;
                synchronized (voiceLiveTranscript.lock) {
                    if (threadVoiceCaption == null) {
                        voiceLiveTranscript.shownCaption = null;
                        if (voiceLiveTranscript.handoff == null && !voiceLiveTranscript.getStateHolder().isUndeliveredSpeechPending(voiceLiveTranscript.threadId)) {
                            voiceLiveTranscript.conversation.removeProvisionalUserMessages(A3q.A00);
                        }
                    } else {
                        Long l = voiceLiveTranscript.serverTranscriptCallGeneration;
                        long jA09 = C3cH.A09(voiceLiveTranscript.getStateHolder().callAttemptGeneration);
                        if ((l == null || l.longValue() != jA09) && voiceLiveTranscript.isCurrentCallScope()) {
                            if (threadVoiceCaption.beforeConnect) {
                                voiceLiveTranscript.preConnectTurnId = threadVoiceCaption.turnId;
                            }
                            voiceLiveTranscript.shownCaption = threadVoiceCaption;
                            voiceLiveTranscript.shownCaptionCallGeneration = voiceLiveTranscript.getStateHolder().callAttemptGeneration.getValue();
                            voiceLiveTranscript.showProvisionalCaption(threadVoiceCaption);
                        }
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit((ThreadVoiceCaption) obj, (HtJ<? super Unit>) htJ2);
            }
        }, htJ);
        return objCollect != EnumC10460Hji.A02 ? Unit.INSTANCE : objCollect;
    }

    @Override // com.facebook.aura.livesession.api.LiveTranscript
    public void onServerTranscriptDelta(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        synchronized (this.lock) {
            if (str.equals(this.activeMessageId)) {
                Long l = this.activeCallGeneration;
                long jA09 = C3cH.A09(getStateHolder().callAttemptGeneration);
                if (l != null && l.longValue() == jA09 && isCurrentCallScope()) {
                    PreConnectHandoff preConnectHandoff = this.handoff;
                    if (preConnectHandoff == null || !str.equals(preConnectHandoff.messageId)) {
                        this.conversation.appendStreamingUserMessage(str, str2);
                    } else {
                        StringBuilder sb = preConnectHandoff.serverText;
                        sb.append(str2);
                        if (sb.length() >= preConnectHandoff.shownText.length()) {
                            this.conversation.showProvisionalUserMessage(preConnectHandoff.turnId, sb.toString());
                        }
                    }
                }
            }
        }
    }
}
