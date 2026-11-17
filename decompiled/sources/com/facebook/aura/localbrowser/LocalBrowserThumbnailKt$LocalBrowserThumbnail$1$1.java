package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.Awn;
import X.C3UX;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1", f = "LocalBrowserThumbnail.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Bitmap> $bitmap$delegate;
    public final /* synthetic */ boolean $fullResolution;
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ LocalBrowserTarget $target;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1$1", f = "LocalBrowserThumbnail.kt", l = {72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Bitmap> $bitmap$delegate;
        public final /* synthetic */ boolean $fullResolution;
        public final /* synthetic */ LocalBrowserTarget $target;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1$1$1", f = "LocalBrowserThumbnail.kt", l = {74, 75}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02171 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ C3UX $$this$repeatOnLifecycle;
            public final /* synthetic */ MutableState<Bitmap> $bitmap$delegate;
            public final /* synthetic */ boolean $fullResolution;
            public final /* synthetic */ LocalBrowserTarget $target;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02171(C3UX c3ux, LocalBrowserTarget localBrowserTarget, boolean z, MutableState<Bitmap> mutableState, HtJ<? super C02171> htJ) {
                super(1, htJ);
                this.$$this$repeatOnLifecycle = c3ux;
                this.$target = localBrowserTarget;
                this.$fullResolution = z;
                this.$bitmap$delegate = mutableState;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02171(this.$$this$repeatOnLifecycle, this.$target, this.$fullResolution, this.$bitmap$delegate, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003b -> B:9:0x0014). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) throws kotlinx.coroutines.DispatchException {
                /*
                    r5 = this;
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r0 = r5.label
                    r3 = 2
                    r2 = 1
                    if (r0 == 0) goto L11
                    if (r0 == r2) goto L29
                    if (r0 == r3) goto L11
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L11:
                    X.Hwg.A00(r6)
                L14:
                    X.3UX r0 = r5.$$this$repeatOnLifecycle
                    boolean r0 = X.Hxb.A04(r0)
                    if (r0 == 0) goto L3e
                    com.facebook.aura.localbrowser.LocalBrowserTarget r1 = r5.$target
                    boolean r0 = r5.$fullResolution
                    r5.label = r2
                    java.lang.Object r6 = r1.captureUserThumbnail(r0, r5)
                    if (r6 != r4) goto L2c
                    return r4
                L29:
                    X.Hwg.A00(r6)
                L2c:
                    if (r6 == 0) goto L33
                    androidx.compose.runtime.MutableState<android.graphics.Bitmap> r0 = r5.$bitmap$delegate
                    r0.Af8(r6)
                L33:
                    r5.label = r3
                    r0 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r0 = X.C7Bq.A01(r0, r5)
                    if (r0 != r4) goto L14
                    return r4
                L3e:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1.AnonymousClass1.C02171.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C02171) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalBrowserTarget localBrowserTarget, boolean z, MutableState<Bitmap> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$target = localBrowserTarget;
            this.$fullResolution = z;
            this.$bitmap$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$target, this.$fullResolution, this.$bitmap$delegate, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTarget localBrowserTarget = this.$target;
                C02171 c02171 = new C02171(c3ux, localBrowserTarget, this.$fullResolution, this.$bitmap$delegate, null);
                this.L$0 = null;
                this.label = 1;
                if (localBrowserTarget.watchPreview(c02171, this) == enumC10460Hji) {
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
    public LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1(F2N f2n, MutableState<Boolean> mutableState, LocalBrowserTarget localBrowserTarget, boolean z, MutableState<Bitmap> mutableState2, HtJ<? super LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1> htJ) {
        super(2, htJ);
        this.$lifecycle = f2n;
        this.$visible$delegate = mutableState;
        this.$target = localBrowserTarget;
        this.$fullResolution = z;
        this.$bitmap$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1(this.$lifecycle, this.$visible$delegate, this.$target, this.$fullResolution, this.$bitmap$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (MutableState.A0A((MutableState) this.$visible$delegate)) {
                F2N f2n = this.$lifecycle;
                EnumC10573Huf enumC10573Huf = EnumC10573Huf.A05;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$target, this.$fullResolution, this.$bitmap$delegate, null);
                this.label = 1;
                if (Awn.A00(enumC10573Huf, f2n, this, anonymousClass1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
