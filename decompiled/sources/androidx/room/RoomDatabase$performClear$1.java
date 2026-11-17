package androidx.room;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EIN;
import X.EIO;
import X.EJA;
import X.EJE;
import X.EnumC10460Hji;
import X.F60;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.commands.health.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", l = {MC.wearables_hatch_health_connectors.__CONFIG__}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class RoomDatabase$performClear$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $hasForeignKeys;
    public final /* synthetic */ String[] $tableNames;
    public int label;
    public final /* synthetic */ EIN this$0;

    @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", l = {532, 533, 535, 541, 542, 543}, m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<EJA, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $hasForeignKeys;
        public final /* synthetic */ String[] $tableNames;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ EIN this$0;

        @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", l = {537, 539}, m = "invokeSuspend")
        /* renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00001 extends AbstractC07127nr implements G0V<EJE<Unit>, HtJ<? super Unit>, Object> {
            public final /* synthetic */ boolean $hasForeignKeys;
            public final /* synthetic */ String[] $tableNames;
            public int I$0;
            public int I$1;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Z[Ljava/lang/String;LX/HtJ<-Landroidx/room/RoomDatabase$performClear$1$1$1;>;)V */
            public C00001(HtJ htJ, String[] strArr, boolean z) {
                super(2, htJ);
                this.$hasForeignKeys = z;
                this.$tableNames = strArr;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C00001 c00001 = new C00001(htJ, this.$tableNames, this.$hasForeignKeys);
                c00001.L$0 = obj;
                return c00001;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:7:0x001b). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    X.Hji r8 = X.EnumC10460Hji.A02
                    int r0 = r9.label
                    r7 = 2
                    r2 = 1
                    if (r0 == 0) goto L3a
                    if (r0 == r2) goto L52
                    if (r0 != r7) goto L61
                    int r0 = r9.I$1
                    int r6 = r9.I$0
                    java.lang.Object r5 = r9.L$1
                    java.lang.String[] r5 = (java.lang.String[]) r5
                    java.lang.Object r1 = r9.L$0
                    X.EJD r1 = (X.EJD) r1
                    X.Hwg.A00(r10)
                L1b:
                    int r6 = r6 + 1
                L1d:
                    if (r6 >= r0) goto L5e
                    r4 = r5[r6]
                    java.lang.String r3 = "DELETE FROM `"
                    r2 = 96
                    java.lang.String r2 = X.FGI.A0N(r3, r4, r2)
                    r9.L$0 = r1
                    r9.L$1 = r5
                    r9.I$0 = r6
                    r9.I$1 = r0
                    r9.label = r7
                    java.lang.Object r2 = X.EJC.A00(r1, r2, r9)
                    if (r2 != r8) goto L1b
                    return r8
                L3a:
                    X.Hwg.A00(r10)
                    java.lang.Object r1 = r9.L$0
                    X.EJD r1 = (X.EJD) r1
                    boolean r0 = r9.$hasForeignKeys
                    if (r0 == 0) goto L59
                    r9.L$0 = r1
                    r9.label = r2
                    java.lang.String r0 = "PRAGMA defer_foreign_keys = TRUE"
                    java.lang.Object r0 = X.EJC.A00(r1, r0, r9)
                    if (r0 != r8) goto L59
                    return r8
                L52:
                    java.lang.Object r1 = r9.L$0
                    X.EJD r1 = (X.EJD) r1
                    X.Hwg.A00(r10)
                L59:
                    java.lang.String[] r5 = r9.$tableNames
                    int r0 = r5.length
                    r6 = 0
                    goto L1d
                L5e:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                L61:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00001.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final /* bridge */ /* synthetic */ Object invoke(EJE<Unit> eje, HtJ<? super Unit> htJ) {
                return ((C00001) AbstractC07127nr.A09(htJ, eje, this)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (LX/EIN;Z[Ljava/lang/String;LX/HtJ<-Landroidx/room/RoomDatabase$performClear$1$1;>;)V */
        public AnonymousClass1(EIN ein, HtJ htJ, String[] strArr, boolean z) {
            super(2, htJ);
            this.this$0 = ein;
            this.$hasForeignKeys = z;
            this.$tableNames = strArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ, this.$tableNames, this.$hasForeignKeys);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r6 = 0
                switch(r0) {
                    case 0: goto Ld;
                    case 1: goto L20;
                    case 2: goto L3f;
                    case 3: goto L5d;
                    case 4: goto L70;
                    case 5: goto L8b;
                    case 6: goto La0;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Ld:
                X.Hwg.A00(r8)
                java.lang.Object r4 = r7.L$0
                X.EJA r4 = (X.EJA) r4
                r7.L$0 = r4
                r0 = 1
                r7.label = r0
                java.lang.Boolean r8 = r4.ANS(r7)
                if (r8 != r3) goto L27
                return r3
            L20:
                java.lang.Object r4 = r7.L$0
                X.EJA r4 = (X.EJA) r4
                X.Hwg.A00(r8)
            L27:
                boolean r0 = X.AnonymousClass001.A1X(r8)
                if (r0 != 0) goto L46
                X.EIN r0 = r7.this$0
                X.EIR r1 = r0.getInvalidationTracker()
                r7.L$0 = r4
                r0 = 2
                r7.label = r0
                java.lang.Object r0 = r1.A00(r7)
                if (r0 != r3) goto L46
                return r3
            L3f:
                java.lang.Object r4 = r7.L$0
                X.EJA r4 = (X.EJA) r4
                X.Hwg.A00(r8)
            L46:
                X.EJ9 r5 = X.EJ9.A03
                boolean r2 = r7.$hasForeignKeys
                java.lang.String[] r0 = r7.$tableNames
                androidx.room.RoomDatabase$performClear$1$1$1 r1 = new androidx.room.RoomDatabase$performClear$1$1$1
                r1.<init>(r6, r0, r2)
                r7.L$0 = r4
                r0 = 3
                r7.label = r0
                java.lang.Object r0 = r4.AiV(r5, r7, r1)
                if (r0 != r3) goto L64
                return r3
            L5d:
                java.lang.Object r4 = r7.L$0
                X.EJA r4 = (X.EJA) r4
                X.Hwg.A00(r8)
            L64:
                r7.L$0 = r4
                r0 = 4
                r7.label = r0
                java.lang.Boolean r8 = r4.ANS(r7)
                if (r8 != r3) goto L77
                return r3
            L70:
                java.lang.Object r4 = r7.L$0
                X.EJD r4 = (X.EJD) r4
                X.Hwg.A00(r8)
            L77:
                boolean r0 = X.AnonymousClass001.A1X(r8)
                if (r0 != 0) goto Lbe
                r7.L$0 = r4
                r0 = 5
                r7.label = r0
                java.lang.String r0 = "PRAGMA wal_checkpoint(FULL)"
                java.lang.Object r0 = X.EJC.A00(r4, r0, r7)
                if (r0 != r3) goto L92
                return r3
            L8b:
                java.lang.Object r4 = r7.L$0
                X.EJD r4 = (X.EJD) r4
                X.Hwg.A00(r8)
            L92:
                r7.L$0 = r6
                r0 = 6
                r7.label = r0
                java.lang.String r0 = "VACUUM"
                java.lang.Object r0 = X.EJC.A00(r4, r0, r7)
                if (r0 != r3) goto La3
                return r3
            La0:
                X.Hwg.A00(r8)
            La3:
                X.EIN r0 = r7.this$0
                X.EIR r3 = r0.getInvalidationTracker()
                X.EIN r0 = r3.A02
                X.EIU r0 = r0.closeBarrier
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
                boolean r0 = r0.get()
                if (r0 != 0) goto Lbe
                androidx.room.TriggerBasedInvalidationTracker r2 = r3.A03
                kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r3.A09
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3.A08
                r2.A06(r1, r0)
            Lbe:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase$performClear$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final /* bridge */ /* synthetic */ Object invoke(EJA eja, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) AbstractC07127nr.A09(htJ, eja, this)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/EIN;Z[Ljava/lang/String;LX/HtJ<-Landroidx/room/RoomDatabase$performClear$1;>;)V */
    public RoomDatabase$performClear$1(EIN ein, HtJ htJ, String[] strArr, boolean z) {
        super(2, htJ);
        this.this$0 = ein;
        this.$hasForeignKeys = z;
        this.$tableNames = strArr;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new RoomDatabase$performClear$1(this.this$0, htJ, this.$tableNames, this.$hasForeignKeys);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            EIN ein = this.this$0;
            EIO eio = ein.connectionManager;
            if (eio == null) {
                C7384Etj.A0b("connectionManager");
                throw F60.createAndThrow();
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ein, null, this.$tableNames, this.$hasForeignKeys);
            this.label = 1;
            if (eio.A05.AiC(false, anonymousClass1, this) == enumC10460Hji) {
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
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((RoomDatabase$performClear$1) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
