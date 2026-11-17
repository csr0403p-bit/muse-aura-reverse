package com.facebook.aura.partners.voice.ui;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C05663ul;
import X.C1110AYw;
import X.C1BO;
import X.C3UX;
import X.C3cG;
import X.C3pU;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$3$1", f = "VoiceCallCaptions.kt", l = {188}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VoiceCallCaptionsKt$rememberCaptionScrollState$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AtomicBoolean $autoScroll;
    public final /* synthetic */ C1BO<Boolean> $currentAnimateScroll$delegate;
    public final /* synthetic */ C1110AYw $scroll;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ C1110AYw $scroll;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1110AYw c1110AYw) {
            super(0);
            this.$scroll = c1110AYw;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.$scroll.A01.AGd());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$3$1$2", f = "VoiceCallCaptions.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberCaptionScrollState$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Integer, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AtomicBoolean $autoScroll;
        public final /* synthetic */ C1BO<Boolean> $currentAnimateScroll$delegate;
        public final /* synthetic */ C1110AYw $scroll;
        public /* synthetic */ int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AtomicBoolean atomicBoolean, C1110AYw c1110AYw, C1BO<Boolean> c1bo, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$autoScroll = atomicBoolean;
            this.$scroll = c1110AYw;
            this.$currentAnimateScroll$delegate = c1bo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$autoScroll, this.$scroll, this.$currentAnimateScroll$delegate, htJ);
            anonymousClass2.I$0 = AnonymousClass001.A0F(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA02;
            int i = this.I$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                if (i != Integer.MAX_VALUE && this.$autoScroll.get()) {
                    boolean zA0F = C1BO.A0F(this.$currentAnimateScroll$delegate);
                    C1110AYw c1110AYw = this.$scroll;
                    this.I$0 = i;
                    if (zA0F) {
                        this.label = 1;
                        objA02 = C3cG.A0U(ScrollExtensionsKt.A00(AnonymousClass003.A0Q(null), c1110AYw, this, i - c1110AYw.A04.AGd()));
                    } else {
                        this.label = 2;
                        objA02 = ScrollExtensionsKt.A02(c1110AYw, this, i - c1110AYw.A04.AGd());
                    }
                    if (objA02 == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A0F(num), htJ);
        }

        public final Object invoke(int i, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(Integer.valueOf(i), htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionsKt$rememberCaptionScrollState$3$1(C1110AYw c1110AYw, AtomicBoolean atomicBoolean, C1BO<Boolean> c1bo, HtJ<? super VoiceCallCaptionsKt$rememberCaptionScrollState$3$1> htJ) {
        super(2, htJ);
        this.$scroll = c1110AYw;
        this.$autoScroll = atomicBoolean;
        this.$currentAnimateScroll$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallCaptionsKt$rememberCaptionScrollState$3$1(this.$scroll, this.$autoScroll, this.$currentAnimateScroll$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$scroll));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$autoScroll, this.$scroll, this.$currentAnimateScroll$delegate, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass2, c05663ulA01) == enumC10460Hji) {
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
        return ((VoiceCallCaptionsKt$rememberCaptionScrollState$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
