package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.HzR;
import com.facebook.aura.partners.voice.api.PlayoutInjection;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class RtcPreviewFramer {
    public static final int $stable = 8;
    public final HzR<Unit> available;
    public int buffered;
    public final ArrayDeque<short[]> chunks;
    public boolean finished;
    public int headOffset;
    public final G0U<short[], PlayoutInjection> inject;
    public final Object lock;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.RtcPreviewFramer", f = "RtcPreviewPlayout.kt", l = {184, 194, 208, 211}, m = "run", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.RtcPreviewFramer$run$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RtcPreviewFramer.this.run(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.RtcPreviewFramer$run$2", f = "RtcPreviewPlayout.kt", l = {184}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.RtcPreviewFramer$run$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return RtcPreviewFramer.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return RtcPreviewFramer.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HzR<Unit> hzR = RtcPreviewFramer.this.available;
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
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RtcPreviewFramer(G0U<? super short[], ? extends PlayoutInjection> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.inject = g0u;
        this.lock = C3cG.A0T();
        this.chunks = new ArrayDeque<>();
        this.available = AbstractC10623Hzj.A00(C79.A00, -1);
    }

    public final boolean append(short[] sArr) {
        C7384Etj.A0Y(sArr, 0);
        int length = sArr.length;
        if (length == 0) {
            return true;
        }
        synchronized (this.lock) {
            if (this.buffered + length > 2880000) {
                return false;
            }
            this.chunks.addLast(sArr);
            this.buffered += length;
            this.available.AhZ(Unit.INSTANCE);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayoutInjection.values().length];
            try {
                AnonymousClass002.A13(PlayoutInjection.REJECTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PlayoutInjection.BUFFER_FULL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PlayoutInjection.ACCEPTED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isDrained() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.lock
            monitor-enter(r2)
            boolean r0 = r3.finished     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lc
            int r1 = r3.buffered     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            if (r1 == 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.RtcPreviewFramer.isDrained():boolean");
    }

    private final short[] takeFrame() {
        synchronized (this.lock) {
            int i = this.buffered;
            if (i != 0 && (i >= 480 || this.finished)) {
                short[] sArr = new short[480];
                int i2 = 0;
                while (i2 < 480 && !this.chunks.isEmpty()) {
                    short[] sArrPeekFirst = this.chunks.peekFirst();
                    if (sArrPeekFirst == null) {
                        throw C60O.A0i("Required value was null.");
                    }
                    short[] sArr2 = sArrPeekFirst;
                    int length = sArr2.length;
                    int i3 = this.headOffset;
                    int iA0F = C8j3.A0F(length, i3, 480 - i2);
                    System.arraycopy(sArr2, i3, sArr, i2, iA0F);
                    i2 += iA0F;
                    int i4 = this.headOffset + iA0F;
                    this.headOffset = i4;
                    if (i4 == length) {
                        this.chunks.pollFirst();
                        this.headOffset = 0;
                    }
                }
                this.buffered -= i2;
                return sArr;
            }
            return null;
        }
    }

    public final void finish() {
        Unit unit;
        synchronized (this.lock) {
            this.finished = true;
            unit = Unit.INSTANCE;
        }
        this.available.AhZ(unit);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x0058, B:10:0x0029], limit reached: 86 */
    /* JADX WARN: Path cross not found for [B:23:0x0067, B:84:?], limit reached: 86 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0103 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object run(kotlin.jvm.functions.Function0<kotlin.Unit> r22, X.HtJ<? super com.facebook.aura.partners.voice.viewmodel.RtcPlayoutResult> r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.RtcPreviewFramer.run(kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }
}
