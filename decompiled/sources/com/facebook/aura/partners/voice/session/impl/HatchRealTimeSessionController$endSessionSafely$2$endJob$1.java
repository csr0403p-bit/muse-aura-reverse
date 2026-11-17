package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C57m;
import X.C60O;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2$endJob$1", f = "HatchRealTimeSessionController.kt", l = {374}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$endSessionSafely$2$endJob$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ String $reason;
    public final /* synthetic */ C57m $session;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2$endJob$1$1", f = "HatchRealTimeSessionController.kt", l = {374}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$endSessionSafely$2$endJob$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $reason;
        public final /* synthetic */ C57m $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C57m c57m, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$session = c57m;
            this.$reason = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$session, this.$reason, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C57m c57m = this.$session;
                String str = this.$reason;
                this.label = 1;
                if (c57m.AAY(str, this, 1, false) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRealTimeSessionController$endSessionSafely$2$endJob$1(String str, C57m c57m, HtJ<? super HatchRealTimeSessionController$endSessionSafely$2$endJob$1> htJ) {
        super(2, htJ);
        this.$reason = str;
        this.$session = c57m;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchRealTimeSessionController$endSessionSafely$2$endJob$1(this.$reason, this.$session, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$session, this.$reason, null);
                this.label = 1;
                if (GAX.A00(this, anonymousClass1, 60000L) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
        } catch (Exception e) {
            CFK.A0A("HatchRTSessionController", C60O.A0r("Failed to end session (", this.$reason), e);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((HatchRealTimeSessionController$endSessionSafely$2$endJob$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
