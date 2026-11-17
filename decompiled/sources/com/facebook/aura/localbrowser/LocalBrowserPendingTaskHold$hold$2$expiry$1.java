package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C20Q;
import X.C3UX;
import X.C3pU;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$expiry$1", f = "LocalBrowserPendingTaskHold.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class LocalBrowserPendingTaskHold$hold$2$expiry$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HoC $pending;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$expiry$1$1", f = "LocalBrowserPendingTaskHold.kt", l = {97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$expiry$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HoC $pending;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HoC hoC, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$pending = hoC;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pending, htJ);
            anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (!z) {
                    this.Z$0 = z;
                    this.label = 1;
                    if (C7Bq.A01(60000L, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$pending.A5w(null);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserPendingTaskHold$hold$2$expiry$1(HoC hoC, HtJ<? super LocalBrowserPendingTaskHold$hold$2$expiry$1> htJ) {
        super(2, htJ);
        this.$pending = hoC;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserPendingTaskHold$hold$2$expiry$1(this.$pending, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pending, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass1, c20q) == enumC10460Hji) {
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
        return new LocalBrowserPendingTaskHold$hold$2$expiry$1(this.$pending, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
