package com.facebook.aura.commands.alarm;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class MuseActivityTracker implements Application.ActivityLifecycleCallbacks {
    public final BLG<Boolean> resumed = AnonymousClass002.A0v(true);

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.MuseActivityTracker", f = "AlarmHandlers.kt", l = {376}, m = "awaitReturn", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MuseActivityTracker.this.awaitReturn(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$2", f = "AlarmHandlers.kt", l = {376}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$2$1", f = "AlarmHandlers.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$2$1, reason: invalid class name */
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

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MuseActivityTracker.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<Boolean> blg = MuseActivityTracker.this.resumed;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, blg);
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
            return MuseActivityTracker.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitReturn(long r6, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.commands.alarm.MuseActivityTracker.AnonymousClass1
            if (r0 == 0) goto L44
            r4 = r8
            com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$1 r4 = (com.facebook.aura.commands.alarm.MuseActivityTracker.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L4a
            X.Hwg.A00(r1)
        L20:
            if (r1 != 0) goto L23
            r2 = 0
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L28:
            X.Hwg.A00(r1)
            X.BLG<java.lang.Boolean> r0 = r5.resumed
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto L23
            r1 = 0
            com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$2 r0 = new com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$2
            r0.<init>(r1)
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r1 = X.GAX.A01(r4, r0, r6)
            if (r1 != r3) goto L20
            return r3
        L44:
            com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$1 r4 = new com.facebook.aura.commands.alarm.MuseActivityTracker$awaitReturn$1
            r4.<init>(r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.MuseActivityTracker.awaitReturn(long, X.HtJ):java.lang.Object");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AnonymousClass004.A1D(false, this.resumed);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AnonymousClass004.A1D(true, this.resumed);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
