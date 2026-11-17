package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.InterfaceC10560Hsz;
import android.content.Context;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.common.coroutines.SingleFlight;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist$install$1$2", f = "LocalBrowserBlocklist.kt", l = {94, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklist$install$1$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ InterfaceC10560Hsz<Unit> $firstAttempt;
    public final /* synthetic */ HoC $previousRefresh;
    public int label;
    public final /* synthetic */ LocalBrowserBlocklist this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist$install$1$2$1", f = "LocalBrowserBlocklist.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlocklist$install$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ InterfaceC10560Hsz<Unit> $firstAttempt;
        public int label;
        public final /* synthetic */ LocalBrowserBlocklist this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalBrowserBlocklist localBrowserBlocklist, Context context, InterfaceC10560Hsz<Unit> interfaceC10560Hsz, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = localBrowserBlocklist;
            this.$appContext = context;
            this.$firstAttempt = interfaceC10560Hsz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$appContext, this.$firstAttempt, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserBlocklist localBrowserBlocklist = this.this$0;
                Context context = this.$appContext;
                C7384Etj.A0X(context);
                InterfaceC10560Hsz<Unit> interfaceC10560Hsz = this.$firstAttempt;
                this.label = 1;
                if (localBrowserBlocklist.maintain(context, interfaceC10560Hsz, this) == enumC10460Hji) {
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserBlocklist$install$1$2(HoC hoC, LocalBrowserBlocklist localBrowserBlocklist, InterfaceC10560Hsz<Unit> interfaceC10560Hsz, Context context, HtJ<? super LocalBrowserBlocklist$install$1$2> htJ) {
        super(2, htJ);
        this.$previousRefresh = hoC;
        this.this$0 = localBrowserBlocklist;
        this.$firstAttempt = interfaceC10560Hsz;
        this.$appContext = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserBlocklist$install$1$2(this.$previousRefresh, this.this$0, this.$firstAttempt, this.$appContext, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                HoC hoC = this.$previousRefresh;
                if (hoC != null) {
                    this.label = 1;
                    if (hoC.APQ(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
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
            LocalBrowserBlocklist localBrowserBlocklist = this.this$0;
            int i2 = LocalBrowserBlocklist.$stable;
            SingleFlight singleFlight = localBrowserBlocklist.refreshes;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(localBrowserBlocklist, this.$appContext, this.$firstAttempt, null);
            this.label = 2;
            if (singleFlight.invoke(Unit.INSTANCE, anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        } finally {
            C3cG.A1F(this.$firstAttempt, Unit.INSTANCE);
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((LocalBrowserBlocklist$install$1$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
