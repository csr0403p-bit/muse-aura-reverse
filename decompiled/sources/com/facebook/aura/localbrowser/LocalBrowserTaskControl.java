package com.facebook.aura.localbrowser;

import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C9258GBl;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.facebook.aura.browsertask.control.BrowserControlLease;
import com.facebook.aura.browsertask.control.BrowserTaskControlClient;
import com.facebook.aura.browsertask.control.BrowserViewerPreference;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserTaskControl {
    public static final int $stable = 8;
    public static final long REQUEST_TIMEOUT_MS = 15000;
    public static final long TRANSITION_TIMEOUT_MS = 400000;
    public final BrowserTaskControlClient client;
    public boolean closed;
    public final C1BN<Boolean> conflict;
    public long epoch;
    public long expiresAt;
    public HoC expiry;
    public final C1BN<Boolean> failed;
    public final C1BN<Boolean> granted;
    public boolean heartbeatPending;
    public LocalBrowserTarget.HostLease host;
    public final BLG<Boolean> mutableConflict;
    public final BLG<Boolean> mutableFailed;
    public final BLG<Boolean> mutableGranted;
    public final BLG<Boolean> mutableReady;
    public final InterfaceC2261BLa mutations;
    public final C1BN<Boolean> ready;
    public boolean releasePending;
    public HoC renewal;
    public final BrowserTaskRepository repository;
    public final C3UX scope;
    public String takeoverId;
    public final LocalBrowserTask task;
    public boolean wantsControl;
    public static final Companion Companion = new Companion();
    public static final long[] RETRY_MS = {500, 1000};

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$accept$1", f = "LocalBrowserTaskControl.kt", l = {325}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$accept$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $current;
        public final /* synthetic */ long $end;
        public final /* synthetic */ String $token;
        public int label;
        public final /* synthetic */ LocalBrowserTaskControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, LocalBrowserTaskControl localBrowserTaskControl, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$end = j;
            this.$current = j2;
            this.this$0 = localBrowserTaskControl;
            this.$token = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$end, this.$current, this.this$0, this.$token, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long jCurrentTimeMillis = this.$end - System.currentTimeMillis();
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                this.label = 1;
                if (C7Bq.A01(jCurrentTimeMillis, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            long j = this.$current;
            LocalBrowserTaskControl localBrowserTaskControl = this.this$0;
            if (j == localBrowserTaskControl.epoch && C7384Etj.areEqual(localBrowserTaskControl.takeoverId, this.$token)) {
                LocalBrowserTaskControl.fail$default(this.this$0, false, 1, null);
                this.this$0.scheduleRelease();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$accept$2", f = "LocalBrowserTaskControl.kt", l = {333}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$accept$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $current;
        public final /* synthetic */ long $end;
        public final /* synthetic */ String $token;
        public int label;
        public final /* synthetic */ LocalBrowserTaskControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, LocalBrowserTaskControl localBrowserTaskControl, long j2, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$end = j;
            this.this$0 = localBrowserTaskControl;
            this.$current = j2;
            this.$token = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$end, this.this$0, this.$current, this.$token, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long jA07 = ATD.A07((this.$end - System.currentTimeMillis()) / 2, 0L, 600000L);
                this.label = 1;
                if (C7Bq.A01(jA07, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.this$0.renewControl(this.$current, this.$token);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$present$1", f = "LocalBrowserTaskControl.kt", l = {350, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 155, 155, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 155, 155, 130, 155, 155, 155}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$present$1, reason: invalid class name and case insensitive filesystem */
    public final class C124681 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $current;
        public final /* synthetic */ boolean $takeover;
        public final /* synthetic */ BrowserViewerPreference $viewer;
        public int I$0;
        public int I$1;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124681(long j, boolean z, BrowserViewerPreference browserViewerPreference, HtJ<? super C124681> htJ) {
            super(2, htJ);
            this.$current = j;
            this.$takeover = z;
            this.$viewer = browserViewerPreference;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskControl.this.new C124681(this.$current, this.$takeover, this.$viewer, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x0210 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0215 A[Catch: all -> 0x02d9, TryCatch #6 {all -> 0x02d9, blocks: (B:105:0x0211, B:107:0x0215, B:109:0x0219, B:111:0x0222, B:112:0x0225, B:119:0x0235, B:120:0x0239, B:122:0x0245, B:123:0x0247, B:133:0x0272, B:136:0x0278, B:139:0x027f, B:141:0x0285, B:142:0x0289, B:143:0x028f, B:145:0x0297, B:146:0x02a6, B:148:0x02ae, B:157:0x02d4, B:158:0x02d8), top: B:197:0x0211 }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0222 A[Catch: all -> 0x02d9, TryCatch #6 {all -> 0x02d9, blocks: (B:105:0x0211, B:107:0x0215, B:109:0x0219, B:111:0x0222, B:112:0x0225, B:119:0x0235, B:120:0x0239, B:122:0x0245, B:123:0x0247, B:133:0x0272, B:136:0x0278, B:139:0x027f, B:141:0x0285, B:142:0x0289, B:143:0x028f, B:145:0x0297, B:146:0x02a6, B:148:0x02ae, B:157:0x02d4, B:158:0x02d8), top: B:197:0x0211 }] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x022d  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0272 A[Catch: all -> 0x02d9, TRY_ENTER, TryCatch #6 {all -> 0x02d9, blocks: (B:105:0x0211, B:107:0x0215, B:109:0x0219, B:111:0x0222, B:112:0x0225, B:119:0x0235, B:120:0x0239, B:122:0x0245, B:123:0x0247, B:133:0x0272, B:136:0x0278, B:139:0x027f, B:141:0x0285, B:142:0x0289, B:143:0x028f, B:145:0x0297, B:146:0x02a6, B:148:0x02ae, B:157:0x02d4, B:158:0x02d8), top: B:197:0x0211 }] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0289 A[Catch: all -> 0x02d9, TryCatch #6 {all -> 0x02d9, blocks: (B:105:0x0211, B:107:0x0215, B:109:0x0219, B:111:0x0222, B:112:0x0225, B:119:0x0235, B:120:0x0239, B:122:0x0245, B:123:0x0247, B:133:0x0272, B:136:0x0278, B:139:0x027f, B:141:0x0285, B:142:0x0289, B:143:0x028f, B:145:0x0297, B:146:0x02a6, B:148:0x02ae, B:157:0x02d4, B:158:0x02d8), top: B:197:0x0211 }] */
        /* JADX WARN: Removed duplicated region for block: B:169:0x02e8 A[Catch: all -> 0x0312, TryCatch #1 {all -> 0x0312, blocks: (B:176:0x0305, B:177:0x0308, B:178:0x0309, B:179:0x030c, B:126:0x024f, B:128:0x0255, B:130:0x025d, B:150:0x02b3, B:152:0x02b9, B:154:0x02c1, B:167:0x02e2, B:169:0x02e8, B:171:0x02f0, B:17:0x0083), top: B:188:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:173:0x0302 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x00ba A[EXC_TOP_SPLITTER, PHI: r0 r2 r4 r5 r6 r7 r8
  0x00ba: PHI (r0v12 com.facebook.aura.browsertask.control.BrowserViewerPreference) = 
  (r0v8 com.facebook.aura.browsertask.control.BrowserViewerPreference)
  (r0v22 com.facebook.aura.browsertask.control.BrowserViewerPreference)
  (r0v22 com.facebook.aura.browsertask.control.BrowserViewerPreference)
 binds: [B:22:0x0096, B:27:0x00b5, B:28:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r2v5 long) = (r2v3 long), (r2v6 long), (r2v6 long) binds: [B:22:0x0096, B:27:0x00b5, B:28:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r4v5 int) = (r4v3 int), (r4v9 int), (r4v9 int) binds: [B:22:0x0096, B:27:0x00b5, B:28:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r5v2 int) = (r5v0 int), (r5v3 int), (r5v3 int) binds: [B:22:0x0096, B:27:0x00b5, B:28:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r6v8 X.BLa) = (r6v5 X.BLa), (r6v9 X.BLa), (r6v9 X.BLa) binds: [B:22:0x0096, B:27:0x00b5, B:28:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r7v6 com.facebook.aura.localbrowser.LocalBrowserTaskControl) = 
  (r7v3 com.facebook.aura.localbrowser.LocalBrowserTaskControl)
  (r7v7 com.facebook.aura.localbrowser.LocalBrowserTaskControl)
  (r7v7 com.facebook.aura.localbrowser.LocalBrowserTaskControl)
 binds: [B:22:0x0096, B:27:0x00b5, B:28:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r8v3 boolean) = (r8v1 boolean), (r8v4 boolean), (r8v4 boolean) binds: [B:22:0x0096, B:27:0x00b5, B:28:0x00b7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 822
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskControl.C124681.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124681) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl", f = "LocalBrowserTaskControl.kt", l = {252, 257, 263}, m = "releaseHeldControl", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$releaseHeldControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C124691 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124691(HtJ<? super C124691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTaskControl.this.releaseHeldControl(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$releaseHeldControl$2", f = "LocalBrowserTaskControl.kt", l = {263}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$releaseHeldControl$2, reason: invalid class name and case insensitive filesystem */
    public final class C124702 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C124702(HtJ<? super C124702> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskControl.this.new C124702(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTaskControl localBrowserTaskControl = LocalBrowserTaskControl.this;
                BrowserTaskControlClient browserTaskControlClient = localBrowserTaskControl.client;
                String strA0b = C3cH.A0b(localBrowserTaskControl.task);
                this.label = 1;
                obj = browserTaskControlClient.releaseControl(strA0b, this);
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
            return LocalBrowserTaskControl.this.new C124702(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$renewControl$1", f = "LocalBrowserTaskControl.kt", l = {350, 201, 208}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$renewControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C124711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $current;
        public final /* synthetic */ String $token;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124711(long j, String str, HtJ<? super C124711> htJ) {
            super(2, htJ);
            this.$current = j;
            this.$token = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskControl.this.new C124711(this.$current, this.$token, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:26:0x0092, B:27:0x0095, B:29:0x009d, B:31:0x00a1, B:33:0x00a5, B:34:0x00a7, B:36:0x00ad), top: B:56:0x0092 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskControl.C124711.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124711) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl", f = "LocalBrowserTaskControl.kt", l = {183, 186, 188}, m = "request", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$request$1, reason: invalid class name and case insensitive filesystem */
    public final class C124721<T> extends HzP {
        public int I$0;
        public int I$1;
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C124721(HtJ<? super C124721> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTaskControl.this.request(0L, null, 0L, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$request$3", f = "LocalBrowserTaskControl.kt", l = {188}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$request$3, reason: invalid class name */
    public final class AnonymousClass3<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ G0U<HtJ<? super T>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$block = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$block, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super T>, Object> g0u = this.$block;
                this.label = 1;
                obj = g0u.invoke(this);
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
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return new AnonymousClass3(this.$block, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$scheduleRelease$1", f = "LocalBrowserTaskControl.kt", l = {350, 243}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$scheduleRelease$1, reason: invalid class name and case insensitive filesystem */
    public final class C124731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $current;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124731(long j, HtJ<? super C124731> htJ) {
            super(2, htJ);
            this.$current = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskControl.this.new C124731(this.$current, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            LocalBrowserTaskControl localBrowserTaskControl;
            InterfaceC2261BLa interfaceC2261BLa;
            long j;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    localBrowserTaskControl = LocalBrowserTaskControl.this;
                    interfaceC2261BLa = localBrowserTaskControl.mutations;
                    j = this.$current;
                    this.L$0 = interfaceC2261BLa;
                    this.L$1 = localBrowserTaskControl;
                    this.J$0 = j;
                    this.label = 1;
                    if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                        try {
                            Hwg.A00(obj);
                            Unit unit = Unit.INSTANCE;
                            interfaceC2261BLa.Ahe(null);
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC2261BLa.Ahe(null);
                            throw th;
                        }
                    }
                    j = this.J$0;
                    localBrowserTaskControl = (LocalBrowserTaskControl) this.L$1;
                    interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                    Hwg.A00(obj);
                }
                if (j == localBrowserTaskControl.epoch) {
                    this.L$0 = interfaceC2261BLa;
                    this.L$1 = null;
                    this.label = 2;
                    if (localBrowserTaskControl.releaseHeldControl(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                interfaceC2261BLa.Ahe(null);
                return unit2;
            } catch (Throwable th2) {
                th = th2;
                interfaceC2261BLa.Ahe(null);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124731) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl", f = "LocalBrowserTaskControl.kt", l = {172}, m = "transition", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$transition$1, reason: invalid class name and case insensitive filesystem */
    public final class C124741<T> extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C124741(HtJ<? super C124741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTaskControl.this.transition(0L, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskControl$transition$2", f = "LocalBrowserTaskControl.kt", l = {173}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskControl$transition$2, reason: invalid class name and case insensitive filesystem */
    public final class C124752<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ G0U<HtJ<? super T>, Object> $block;
        public final /* synthetic */ long $current;
        public final /* synthetic */ T $retry;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C124752(long j, T t, G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super C124752> htJ) {
            super(2, htJ);
            this.$current = j;
            this.$retry = t;
            this.$block = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTaskControl.this.new C124752(this.$current, this.$retry, this.$block, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTaskControl localBrowserTaskControl = LocalBrowserTaskControl.this;
                long j = this.$current;
                T t = this.$retry;
                G0U<HtJ<? super T>, Object> g0u = this.$block;
                this.label = 1;
                obj = LocalBrowserTaskControl.request$default(localBrowserTaskControl, j, t, LocalBrowserTaskControl.TRANSITION_TIMEOUT_MS, null, g0u, this, 8, null);
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
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return ((C124752) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean accept(BrowserControlLease browserControlLease) {
        Long l;
        boolean z = false;
        if (browserControlLease != null && (l = browserControlLease.controlExpiresAtMs) != null) {
            long jLongValue = l.longValue();
            String str = browserControlLease.takeoverId;
            if (str != null && !C7BY.A0j(str) && C7384Etj.areEqual(browserControlLease.taskId, C3cH.A0b(this.task)) && "user".equals(browserControlLease.controlOwner) && jLongValue > System.currentTimeMillis()) {
                this.takeoverId = str;
                this.expiresAt = jLongValue;
                z = true;
                AnonymousClass003.A14(this.mutableGranted, true);
                LocalBrowserSession session = this.task.getSession();
                if (session != null) {
                    session.refreshRendering();
                }
                long j = this.epoch;
                HoC hoC = this.expiry;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                C3UX c3ux = this.scope;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(jLongValue, j, this, str, null);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                this.expiry = GAo.A02(num, c6ys, anonymousClass1, c3ux);
                HoC hoC2 = this.renewal;
                if (hoC2 != null) {
                    hoC2.A5w(null);
                }
                this.renewal = GAo.A02(num, c6ys, new AnonymousClass2(jLongValue, this, j, str, null), this.scope);
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renewControl(long j, String str) {
        if (this.heartbeatPending || !canRenew(j, str)) {
            return;
        }
        this.heartbeatPending = true;
        AnonymousClass001.A1J(new C124711(j, str, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (r15 == r17) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a7 -> B:14:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object request(long r12, T r14, long r15, kotlin.jvm.functions.Function0<java.lang.Boolean> r17, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r18, X.HtJ<? super T> r19) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskControl.request(long, java.lang.Object, long, kotlin.jvm.functions.Function0, X.G0U, X.HtJ):java.lang.Object");
    }

    public final void present(LocalBrowserTarget.HostLease hostLease, boolean z) {
        LocalBrowserTarget localBrowserTarget;
        LocalBrowserRendering localBrowserRendering;
        LocalBrowserAutomationViewport localBrowserAutomationViewport;
        BrowserViewerPreference browserViewerPreference;
        Resources resources;
        DisplayMetrics displayMetrics;
        C7384Etj.A0Y(hostLease, 0);
        if (this.closed) {
            return;
        }
        if ((z && allows(hostLease)) || this.repository.previewRevokedTaskIds.getValue().contains(C3cH.A0b(this.task)) || this.task.getSession() == null) {
            return;
        }
        if (z) {
            ViewGroup viewGroup = hostLease.slot.container;
            ComponentActivity componentActivity = hostLease.activity;
            if (componentActivity == null || (resources = componentActivity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                return;
            }
            double d = displayMetrics.density;
            if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
                return;
            } else {
                browserViewerPreference = new BrowserViewerPreference(viewGroup.getWidth(), viewGroup.getHeight(), d);
            }
        } else {
            LocalBrowserSession session = this.task.getSession();
            if (session == null || (localBrowserTarget = session.target) == null || (localBrowserRendering = localBrowserTarget.rendering) == null || (localBrowserAutomationViewport = localBrowserRendering.viewport) == null) {
                return;
            }
            long j = localBrowserAutomationViewport.size;
            browserViewerPreference = new BrowserViewerPreference((int) (j >> 32), AnonymousClass002.A09(j), localBrowserAutomationViewport.density);
        }
        long j2 = this.epoch + 1;
        this.epoch = j2;
        revokeInput();
        HtJ htJA14 = C3cI.A14(this.mutableReady, false);
        AnonymousClass001.A1E(this.mutableFailed, htJA14, false);
        AnonymousClass001.A1E(this.mutableConflict, htJA14, false);
        this.host = hostLease;
        this.wantsControl = z;
        AnonymousClass001.A1J(new C124681(j2, z, browserViewerPreference, htJA14), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRenew(long j, String str) {
        return !this.closed && j == this.epoch && C7384Etj.areEqual(str, this.takeoverId) && AnonymousClass003.A1Z(this.mutableGranted) && this.task.isAvailable() && this.task.getControl() == LocalBrowserControl.USER && System.currentTimeMillis() < this.expiresAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(boolean z) {
        C3cJ.A0C(this.mutableFailed, true);
        AnonymousClass003.A14(this.mutableConflict, z);
        AnonymousClass003.A14(this.mutableReady, false);
        revokeInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrent(long j) {
        LocalBrowserSession session;
        LocalBrowserTarget localBrowserTarget;
        return !this.closed && j == this.epoch && this.task.isAvailable() && (session = this.task.getSession()) != null && (localBrowserTarget = session.target) != null && localBrowserTarget.isUserHost(this.host);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (X.AnonymousClass001.A1X(r13) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a1 -> B:39:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b9 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object releaseHeldControl(X.HtJ<? super java.lang.Boolean> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.facebook.aura.localbrowser.LocalBrowserTaskControl.C124691
            if (r0 == 0) goto Lbc
            r11 = r15
            com.facebook.aura.localbrowser.LocalBrowserTaskControl$releaseHeldControl$1 r11 = (com.facebook.aura.localbrowser.LocalBrowserTaskControl.C124691) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbc
            int r2 = r2 - r1
            r11.label = r2
        L12:
            java.lang.Object r13 = r11.result
            X.Hji r12 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r10 = 0
            r3 = 15000(0x3a98, double:7.411E-320)
            r9 = 3
            r8 = 2
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L3b
            if (r0 == r6) goto L6e
            if (r0 == r8) goto L96
            if (r0 != r9) goto Lc3
            int r2 = r11.I$1
            int r5 = r11.I$0
            X.Hwg.A00(r13)
        L2e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.C7384Etj.areEqual(r13, r1)
            if (r0 == 0) goto La3
            r14.releasePending = r7
            return r1
        L3b:
            X.Hwg.A00(r13)
            long[] r0 = com.facebook.aura.localbrowser.LocalBrowserTaskControl.RETRY_MS
            int r2 = r0.length
            r5 = 0
        L42:
            boolean r0 = r14.releasePending
            if (r0 != 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            return r1
        L4b:
            boolean r0 = r14.closed
            if (r0 != 0) goto Lcd
            com.facebook.aura.localbrowser.LocalBrowserTask r0 = r14.task
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto Lcd
            if (r5 <= 0) goto L75
            long[] r1 = com.facebook.aura.localbrowser.LocalBrowserTaskControl.RETRY_MS
            int r0 = r5 + (-1)
            r0 = r1[r0]
            r11.L$0 = r10
            r11.I$0 = r5
            r11.I$1 = r2
            r11.label = r6
            java.lang.Object r0 = X.C7Bq.A01(r0, r11)
            if (r0 != r12) goto L75
            return r12
        L6e:
            int r2 = r11.I$1
            int r5 = r11.I$0
            X.Hwg.A00(r13)
        L75:
            com.facebook.aura.localbrowser.LocalBrowserTask r0 = r14.task
            com.facebook.aura.localbrowser.LocalBrowserSession r0 = r0.getSession()
            if (r0 == 0) goto La8
            r0.markAgentActivity()
            com.facebook.aura.localbrowser.LocalBrowserTarget r13 = r0.target
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r3
            r11.L$0 = r10
            r11.I$0 = r5
            r11.I$1 = r2
            r11.label = r8
            java.lang.Object r13 = r13.awaitAutomationViewport(r0, r11)
            if (r13 != r12) goto L9d
            return r12
        L96:
            int r2 = r11.I$1
            int r5 = r11.I$0
            X.Hwg.A00(r13)
        L9d:
            boolean r0 = X.AnonymousClass001.A1X(r13)
            if (r0 != 0) goto La8
        La3:
            if (r5 == r2) goto Lc8
            int r5 = r5 + 1
            goto L42
        La8:
            com.facebook.aura.localbrowser.LocalBrowserTaskControl$releaseHeldControl$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserTaskControl$releaseHeldControl$2
            r0.<init>(r10)
            r11.L$0 = r10
            r11.I$0 = r5
            r11.I$1 = r2
            r11.label = r9
            java.lang.Object r13 = X.GAX.A01(r11, r0, r3)
            if (r13 != r12) goto L2e
            return r12
        Lbc:
            com.facebook.aura.localbrowser.LocalBrowserTaskControl$releaseHeldControl$1 r11 = new com.facebook.aura.localbrowser.LocalBrowserTaskControl$releaseHeldControl$1
            r11.<init>(r15)
            goto L12
        Lc3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lc8:
            X.BLG<java.lang.Boolean> r0 = r14.mutableFailed
            X.AnonymousClass003.A14(r0, r6)
        Lcd:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskControl.releaseHeldControl(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object request$default(final LocalBrowserTaskControl localBrowserTaskControl, final long j, Object obj, long j2, Function0 function0, G0U g0u, HtJ htJ, int i, Object obj2) {
        if ((i & 4) != 0) {
            j2 = 15000;
        }
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskControl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.f$0.isCurrent(j));
                }
            };
        }
        return localBrowserTaskControl.request(j, obj, j2, function0, g0u, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleRelease() {
        long j = this.epoch;
        if (this.closed) {
            return;
        }
        AnonymousClass001.A1J(new C124731(j, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object transition(long r7, T r9, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r10, X.HtJ<? super T> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.facebook.aura.localbrowser.LocalBrowserTaskControl.C124741
            if (r0 == 0) goto L40
            r4 = r11
            com.facebook.aura.localbrowser.LocalBrowserTaskControl$transition$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserTaskControl.C124741) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L25
            if (r1 != r0) goto L47
            java.lang.Object r9 = r4.L$0
            X.Hwg.A00(r3)
        L22:
            if (r3 != 0) goto L46
            return r9
        L25:
            X.Hwg.A00(r3)
            r11 = 0
            com.facebook.aura.localbrowser.LocalBrowserTaskControl$transition$2 r5 = new com.facebook.aura.localbrowser.LocalBrowserTaskControl$transition$2
            r5.<init>(r7, r9, r10, r11)
            r4.L$0 = r9
            r4.L$1 = r11
            r4.J$0 = r7
            r4.label = r0
            r0 = 400000(0x61a80, double:1.976263E-318)
            java.lang.Object r3 = X.GAX.A01(r4, r5, r0)
            if (r3 != r2) goto L22
            return r2
        L40:
            com.facebook.aura.localbrowser.LocalBrowserTaskControl$transition$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserTaskControl$transition$1
            r4.<init>(r11)
            goto L12
        L46:
            return r3
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskControl.transition(long, java.lang.Object, X.G0U, X.HtJ):java.lang.Object");
    }

    public final boolean allows(LocalBrowserTarget.HostLease hostLease) {
        return this.task.isAvailable() && this.task.getControl() == LocalBrowserControl.USER && this.host == hostLease && hostLease != null && AnonymousClass003.A1Z(this.mutableGranted) && System.currentTimeMillis() < this.expiresAt;
    }

    public final void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.repository.revokePreview(C3cH.A0b(this.task));
        this.epoch++;
        this.host = null;
        revokeInput();
        AnonymousClass003.A14(this.mutableReady, false);
        Hxb.A03(null, this.scope);
    }

    public final C1BN<Boolean> getConflict() {
        return this.conflict;
    }

    public final C1BN<Boolean> getFailed() {
        return this.failed;
    }

    public final C1BN<Boolean> getGranted() {
        return this.granted;
    }

    public final C1BN<Boolean> getReady() {
        return this.ready;
    }

    public final void release() {
        this.epoch++;
        this.host = null;
        revokeInput();
        AnonymousClass003.A14(this.mutableReady, false);
        scheduleRelease();
    }

    public final void retry() {
        LocalBrowserTarget.HostLease hostLease = this.host;
        if (hostLease != null) {
            present(hostLease, this.wantsControl);
        }
    }

    public final void retryPendingRelease() {
        if (this.releasePending) {
            if (this.host == null || !this.wantsControl) {
                scheduleRelease();
            }
        }
    }

    public final void revokeInput() {
        LocalBrowserSession session;
        LocalBrowserTarget localBrowserTarget;
        LocalBrowserSession session2;
        LocalBrowserTarget localBrowserTarget2;
        LocalBrowserRendering localBrowserRendering;
        boolean z = AnonymousClass003.A1Z(this.mutableGranted) || !((session2 = this.task.getSession()) == null || (localBrowserTarget2 = session2.target) == null || (localBrowserRendering = localBrowserTarget2.rendering) == null || !localBrowserRendering.isTakeover);
        C9286GCn.A00(null, false, (C9286GCn) this.mutableGranted);
        this.takeoverId = null;
        this.expiresAt = 0L;
        HoC hoC = this.expiry;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.expiry = null;
        HoC hoC2 = this.renewal;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.renewal = null;
        if (z && (session = this.task.getSession()) != null && (localBrowserTarget = session.target) != null) {
            localBrowserTarget.releaseUserInput();
        }
        LocalBrowserSession session3 = this.task.getSession();
        if (session3 != null) {
            session3.refreshRendering();
        }
    }

    public final void stop() {
        if (this.closed) {
            return;
        }
        this.task.interrupt(LocalBrowserTaskOutcome.STOPPED);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LocalBrowserTaskControl(LocalBrowserTask localBrowserTask, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1b = AnonymousClass004.A1b(localBrowserTask, abstractC3358CGz);
        this.task = localBrowserTask;
        this.client = new BrowserTaskControlClient(abstractC3358CGz);
        this.repository = BrowserTaskRepository.Companion.getInstance(abstractC3358CGz);
        this.scope = C3cH.A0y(C3cH.A0u(), new LocalBrowserTaskControl$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this));
        Boolean boolValueOf = Boolean.valueOf(zA1b);
        this.mutations = new C9258GBl();
        C9286GCn c9286GCnA14 = C3cG.A14(boolValueOf);
        this.mutableGranted = c9286GCnA14;
        this.granted = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(boolValueOf);
        this.mutableConflict = c9286GCnA142;
        this.conflict = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(boolValueOf);
        this.mutableFailed = c9286GCnA143;
        this.failed = C3cG.A11(c9286GCnA143);
        C9286GCn c9286GCnA144 = C3cG.A14(boolValueOf);
        this.mutableReady = c9286GCnA144;
        this.ready = C3cG.A11(c9286GCnA144);
    }

    public static /* synthetic */ void fail$default(LocalBrowserTaskControl localBrowserTaskControl, boolean z, int i, Object obj) {
        localBrowserTaskControl.fail(AnonymousClass001.A1P(i, z));
    }
}
