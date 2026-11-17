package com.facebook.aura.crashreporting;

import X.AbstractC05623ug;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BV4;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3pS;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.CFK;
import X.EnumC10460Hji;
import X.F1F;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.breakpad.BreakpadManager;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class StandardVmMinidumpGate {
    public static final String TAG = "StandardVmMinidumpGate";
    public static final StandardVmMinidumpGate INSTANCE = new StandardVmMinidumpGate();
    public static final AtomicBoolean started = C60O.A1E();

    @DebugMetadata(c = "com.facebook.aura.crashreporting.StandardVmMinidumpGate$start$1", f = "StandardVmMinidumpGate.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.crashreporting.StandardVmMinidumpGate$start$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<AbstractC3358CGz> $userSessions;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C20Q<? extends AbstractC3358CGz> c20q, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSessions = c20q;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSessions, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        final F1F f1f = new F1F();
                        C3pS c3pSA00 = AbstractC05633ui.A00(new StandardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1(null), AbstractC05623ug.A00(AnonymousClass001.A0y(), new StandardVmMinidumpGate$start$1$invokeSuspend$$inlined$map$1(GDB.A01(this.$userSessions))));
                        C20Z c20z = new C20Z() { // from class: com.facebook.aura.crashreporting.StandardVmMinidumpGate.start.1.3
                            @Override // X.C20Z
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                                return emit((HxE<Boolean, Boolean>) obj2, (HtJ<? super Unit>) htJ);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(X.HxE<java.lang.Boolean, java.lang.Boolean> r4, X.HtJ<? super kotlin.Unit> r5) {
                                /*
                                    r3 = this;
                                    A r0 = r4.first
                                    boolean r5 = X.AnonymousClass001.A1X(r0)
                                    B r0 = r4.second
                                    boolean r4 = X.AnonymousClass001.A1X(r0)
                                    X.F1F r3 = r1
                                    boolean r0 = r3.element
                                    r2 = 0
                                    if (r0 != 0) goto L16
                                    r1 = 0
                                    if (r4 == 0) goto L17
                                L16:
                                    r1 = 1
                                L17:
                                    r3.element = r1
                                    com.facebook.aura.crashreporting.StandardVmMinidumpGate r0 = com.facebook.aura.crashreporting.StandardVmMinidumpGate.INSTANCE
                                    if (r5 == 0) goto L20
                                    if (r1 != 0) goto L20
                                    r2 = 1
                                L20:
                                    com.facebook.aura.crashreporting.StandardVmMinidumpGate.access$setMinidumpsEnabled(r0, r2)
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.crashreporting.StandardVmMinidumpGate.AnonymousClass1.AnonymousClass3.emit(X.HxE, X.HtJ):java.lang.Object");
                            }
                        };
                        this.L$0 = null;
                        this.label = 1;
                        if (c3pSA00.collect(c20z, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A08(StandardVmMinidumpGate.TAG, "Minidump gate stopped; minidumps stay off", e2);
                }
                StandardVmMinidumpGate.INSTANCE.setMinidumpsEnabled(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                StandardVmMinidumpGate.INSTANCE.setMinidumpsEnabled(false);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$userSessions, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void start(C20Q<? extends AbstractC3358CGz> c20q) {
        C7384Etj.A0Y(c20q, 0);
        if (BreakpadManager.isActive() && BV4.A1V(started)) {
            AnonymousClass001.A1J(new AnonymousClass1(c20q, null), C78W.A05(new C8eO(null), AuraDispatchers.unconfinedUndispatched));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMinidumpsEnabled(boolean z) {
        BreakpadManager.ensureLoadLibrary();
        long jNativeGetMinidumpFlags = BreakpadManager.nativeGetMinidumpFlags();
        long j = z ? jNativeGetMinidumpFlags & (-17) : jNativeGetMinidumpFlags | 16;
        BreakpadManager.ensureLoadLibrary();
        BreakpadManager.nativeSetMinidumpFlags(j);
    }
}
