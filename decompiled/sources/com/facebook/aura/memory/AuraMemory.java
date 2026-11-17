package com.facebook.aura.memory;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C05663ul;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HzR;
import android.app.ActivityManager;
import android.content.Context;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AuraMemory {
    public static final long DEFAULT_MIN_AVAILABLE_MEMORY_BYTES = 524288000;
    public static final AuraMemory INSTANCE = new AuraMemory();

    @DebugMetadata(c = "com.facebook.aura.memory.AuraMemory$observe$1", f = "AuraMemory.kt", l = {57, 59, 66}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.memory.AuraMemory$observe$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C20Z<? super AuraMemoryState>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.memory.AuraMemory$observe$1$1", f = "AuraMemory.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.memory.AuraMemory$observe$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02381 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ HzR<Unit> $pressureSignals;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02381(HzR<Unit> hzR, HtJ<? super C02381> htJ) {
                super(2, htJ);
                this.$pressureSignals = hzR;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02381(this.$pressureSignals, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HzR<Unit> hzR = this.$pressureSignals;
                    this.label = 1;
                    if (hzR.AZg(this) == enumC10460Hji) {
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
                return new C02381(this.$pressureSignals, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$applicationContext, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:24:0x0080, B:26:0x0083], limit reached: 59 */
        /* JADX WARN: Path cross not found for [B:26:0x0083, B:24:0x0080], limit reached: 59 */
        /* JADX WARN: Path cross not found for [B:30:0x008a, B:32:0x008d], limit reached: 59 */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[PHI: r3 r4
  0x0056: PHI (r3v6 X.HzR) = (r3v0 X.HzR), (r3v7 X.HzR) binds: [B:16:0x0042, B:42:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v6 com.facebook.aura.memory.AuraTrimmable) = (r4v0 com.facebook.aura.memory.AuraTrimmable), (r4v7 com.facebook.aura.memory.AuraTrimmable) binds: [B:16:0x0042, B:42:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:22:0x0074, B:28:0x0086, B:34:0x0091, B:35:0x009a, B:21:0x0071), top: B:54:0x0071 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[Catch: all -> 0x00d5, TryCatch #2 {all -> 0x00d5, blocks: (B:41:0x00c7, B:18:0x0057, B:38:0x00ad, B:43:0x00cb), top: B:58:0x00c7 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c4 -> B:58:0x00c7). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.memory.AuraMemory.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super AuraMemoryState> c20z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.memory.AuraMemory$readState$2", f = "AuraMemory.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.memory.AuraMemory$readState$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraMemoryState>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            ActivityManager activityManager = (ActivityManager) this.$context.getApplicationContext().getSystemService(ActivityManager.class);
            if (activityManager == null) {
                return null;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return new AuraMemoryState(memoryInfo.availMem, activityManager.isLowRamDevice(), memoryInfo.lowMemory);
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AuraMemoryState> htJ) {
            return new AnonymousClass2(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C20Q<AuraMemoryState> observe(Context context) {
        C7384Etj.A0Y(context, 0);
        return GDB.A01(new C05663ul(new AnonymousClass1(context.getApplicationContext(), null)));
    }

    public final Object readState(Context context, HtJ<? super AuraMemoryState> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, null));
    }
}
