package com.facebook.aura.startup.readiness;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class BackgroundReadyState {
    public static final BackgroundReadyState INSTANCE = new BackgroundReadyState();
    public static final BLG<Boolean> _state;
    public static final C1BN<Boolean> state;

    @DebugMetadata(c = "com.facebook.aura.startup.readiness.BackgroundReadyState", f = "BackgroundReadyState.kt", l = {42}, m = "awaitReady", v = 2)
    /* renamed from: com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReady$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BackgroundReadyState.this.awaitReady(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReady$2", f = "BackgroundReadyState.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReady$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
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
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.readiness.BackgroundReadyState", f = "BackgroundReadyState.kt", l = {52}, m = "awaitReadyOrTimeout", v = 2)
    /* renamed from: com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$1, reason: invalid class name and case insensitive filesystem */
    public final class C140121 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C140121(HtJ<? super C140121> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BackgroundReadyState.this.awaitReadyOrTimeout(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$2", f = "BackgroundReadyState.kt", l = {53}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$2, reason: invalid class name and case insensitive filesystem */
    public final class C140132 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$2$1", f = "BackgroundReadyState.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$2$1, reason: invalid class name */
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

        public C140132(HtJ<? super C140132> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140132(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<Boolean> blg = BackgroundReadyState._state;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, anonymousClass1, blg) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return true;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new C140132(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        _state = c9286GCnA0v;
        state = C3Pi.A00(c9286GCnA0v);
    }

    public static /* synthetic */ Object awaitReadyOrTimeout$default(BackgroundReadyState backgroundReadyState, long j, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 30000;
        }
        return backgroundReadyState.awaitReadyOrTimeout(j, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitReady(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.startup.readiness.BackgroundReadyState.AnonymousClass1
            if (r0 == 0) goto L3d
            r5 = r7
            com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReady$1 r5 = (com.facebook.aura.startup.readiness.BackgroundReadyState.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L43
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.BLG<java.lang.Boolean> r2 = com.facebook.aura.startup.readiness.BackgroundReadyState._state
            boolean r0 = X.AnonymousClass003.A1Z(r2)
            if (r0 != 0) goto L20
            r1 = 0
            com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReady$2 r0 = new com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReady$2
            r0.<init>(r1)
            r5.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r5, r0, r2)
            if (r0 != r4) goto L20
            return r4
        L3d:
            com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReady$1 r5 = new com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReady$1
            r5.<init>(r7)
            goto L12
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.readiness.BackgroundReadyState.awaitReady(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitReadyOrTimeout(long r6, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.startup.readiness.BackgroundReadyState.C140121
            if (r0 == 0) goto L50
            r4 = r8
            com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$1 r4 = (com.facebook.aura.startup.readiness.BackgroundReadyState.C140121) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L56
            X.Hwg.A00(r1)
        L20:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L2d
            boolean r0 = r1.booleanValue()
        L28:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L2d:
            r0 = 0
            goto L28
        L2f:
            X.Hwg.A00(r1)
            X.BLG<java.lang.Boolean> r0 = com.facebook.aura.startup.readiness.BackgroundReadyState._state
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 == 0) goto L3f
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            return r3
        L3f:
            r1 = 0
            com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$2 r0 = new com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$2
            r0.<init>(r1)
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r1 = X.GAX.A01(r4, r0, r6)
            if (r1 != r3) goto L20
            return r3
        L50:
            com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$1 r4 = new com.facebook.aura.startup.readiness.BackgroundReadyState$awaitReadyOrTimeout$1
            r4.<init>(r8)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.readiness.BackgroundReadyState.awaitReadyOrTimeout(long, X.HtJ):java.lang.Object");
    }

    public final C1BN<Boolean> getState() {
        return state;
    }

    public final void setReady(boolean z) {
        BLG<Boolean> blg = _state;
        if (blg.getValue().booleanValue() != z) {
            C9286GCn.A00(null, Boolean.valueOf(z), (C9286GCn) blg);
        }
    }
}
