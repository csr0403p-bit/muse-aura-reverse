package com.facebook.aura.composer.camera;

import X.AGE;
import X.AGF;
import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC2467Bbu;
import X.AbstractC2791BlL;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV6;
import X.BV7;
import X.Bf5;
import X.Bf6;
import X.BfA;
import X.BfD;
import X.BkB;
import X.BlM;
import X.BoT;
import X.BoY;
import X.C00r;
import X.C10543Hqv;
import X.C2599Bex;
import X.C2605BfM;
import X.C2678Bha;
import X.C2770Bkg;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7Bm;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.G0V;
import X.GBL;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC2551Bdc;
import X.InterfaceC2586Bei;
import X.InterfaceC2622Bfo;
import X.InterfaceC2779Bkw;
import X.InterfaceC2783Bl3;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.media.MediaActionSound;
import android.util.Rational;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes5.dex */
public final class HatchCameraSession {
    public static final int $stable = 8;
    public final MutableState busy$delegate;
    public InterfaceC2783Bl3 camera;
    public final MutableState canSwitch$delegate;
    public final C2605BfM capture;
    public HoC captureJob;
    public final Context context;
    public boolean disposed;
    public final Executor executor;
    public final MutableState failed$delegate;
    public final MutableState front$delegate;
    public final MutableState photo$delegate;
    public final BfA preview;
    public C2678Bha provider;
    public final C3UX scope;
    public final AbstractC3358CGz session;
    public final C00r shutterCount$delegate;
    public final MediaActionSound sound;

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraSession", f = "HatchCameraSession.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "bind", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraSession$bind$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCameraSession.this.bind(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraSession", f = "HatchCameraSession.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "capture", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraSession$capture$1, reason: invalid class name and case insensitive filesystem */
    public final class C111481 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C111481(HtJ<? super C111481> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCameraSession.this.capture(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraSession$takePhoto$1", f = "HatchCameraSession.kt", l = {125, 127, 135, 135, 135}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraSession$takePhoto$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C111491 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraSession$takePhoto$1$1", f = "HatchCameraSession.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.camera.HatchCameraSession$takePhoto$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C10543Hqv<File> $output;
            public int label;
            public final /* synthetic */ HatchCameraSession this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00701(C10543Hqv<File> c10543Hqv, HatchCameraSession hatchCameraSession, HtJ<? super C00701> htJ) {
                super(2, htJ);
                this.$output = c10543Hqv;
                this.this$0 = hatchCameraSession;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00701(this.$output, this.this$0, htJ);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.io.File] */
            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.$output.element = HatchCameraFiles.INSTANCE.create$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(this.this$0.session);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C00701) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraSession$takePhoto$1$2", f = "HatchCameraSession.kt", l = {127}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.camera.HatchCameraSession$takePhoto$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ File $file;
            public int label;
            public final /* synthetic */ HatchCameraSession this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchCameraSession hatchCameraSession, File file, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = hatchCameraSession;
                this.$file = file;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.this$0, this.$file, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchCameraSession hatchCameraSession = this.this$0;
                    File file = this.$file;
                    this.label = 1;
                    if (hatchCameraSession.capture(file, this) == enumC10460Hji) {
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
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraSession$takePhoto$1$3", f = "HatchCameraSession.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.camera.HatchCameraSession$takePhoto$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C10543Hqv<File> $output;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C10543Hqv<File> c10543Hqv, HtJ<? super AnonymousClass3> htJ) {
                super(2, htJ);
                this.$output = c10543Hqv;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass3(this.$output, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                File file = this.$output.element;
                if (file == null) {
                    return null;
                }
                HatchCameraFiles.INSTANCE.delete$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(file);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass3(this.$output, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C111491(HtJ<? super C111491> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCameraSession.this.new C111491(htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[Catch: all -> 0x0098, Exception -> 0x009a, TryCatch #5 {Exception -> 0x009a, all -> 0x0098, blocks: (B:20:0x0049, B:22:0x004d, B:34:0x0091, B:35:0x0097, B:17:0x0033), top: B:61:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: all -> 0x0098, Exception -> 0x009a, TRY_ENTER, TryCatch #5 {Exception -> 0x009a, all -> 0x0098, blocks: (B:20:0x0049, B:22:0x004d, B:34:0x0091, B:35:0x0097, B:17:0x0033), top: B:61:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00d9 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.camera.HatchCameraSession.C111491.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchCameraSession.this.new C111491(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchCameraSession(Context context, AbstractC3358CGz abstractC3358CGz, C3UX c3ux) {
        boolean zA1Z = AnonymousClass005.A1Z(context, abstractC3358CGz, c3ux);
        this.context = context;
        this.session = abstractC3358CGz;
        this.scope = c3ux;
        Executor mainExecutor = context.getMainExecutor();
        C7384Etj.A0U(mainExecutor);
        this.executor = mainExecutor;
        MediaActionSound mediaActionSound = new MediaActionSound();
        mediaActionSound.load(0);
        this.sound = mediaActionSound;
        this.preview = new C2599Bex().A00();
        Bf5 bf5 = new Bf5();
        BV6.A11(Bf6.A05, bf5.A00, zA1Z ? 1 : 0);
        this.capture = bf5.A00();
        AGE ageA01 = AGF.A01();
        this.photo$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.busy$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.failed$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.front$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.canSwitch$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.shutterCount$delegate = new ParcelableSnapshotMutableIntState(0);
    }

    public final void close() {
        this.disposed = true;
        AnonymousClass002.A1K(this.captureJob);
        C2678Bha c2678Bha = this.provider;
        if (c2678Bha != null) {
            c2678Bha.A04(this.preview, this.capture);
        }
        this.sound.release();
        retake();
    }

    public final void focus(BoY boY, float f, float f2) {
        PointF pointF;
        InterfaceC2622Bfo interfaceC2622BfoADF;
        C7384Etj.A0Y(boY, 0);
        if (MutableState.A0A(this.busy$delegate) || getPhoto() != null) {
            return;
        }
        BoT.A00();
        BlM blM = boY.A05;
        float[] fArr = {f, f2};
        synchronized (blM) {
            Matrix matrix = blM.A00;
            if (matrix == null) {
                pointF = BlM.A03;
            } else {
                matrix.mapPoints(fArr);
                pointF = new PointF(fArr[0], fArr[1]);
            }
        }
        float f3 = pointF.x;
        float f4 = pointF.y;
        Rational rational = ((AbstractC2791BlL) blM).A00;
        C2770Bkg c2770Bkg = new C2770Bkg();
        c2770Bkg.A00 = f3;
        c2770Bkg.A01 = f4;
        c2770Bkg.A02 = 0.15f;
        c2770Bkg.A03 = rational;
        InterfaceC2783Bl3 interfaceC2783Bl3 = this.camera;
        if (interfaceC2783Bl3 == null || (interfaceC2622BfoADF = interfaceC2783Bl3.ADF()) == null) {
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        ArrayList arrayListA0h3 = C3cG.A0h();
        arrayListA0h.add(c2770Bkg);
        arrayListA0h2.add(c2770Bkg);
        arrayListA0h3.add(c2770Bkg);
        interfaceC2622BfoADF.Ag2(new BkB(arrayListA0h2, arrayListA0h, arrayListA0h3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object capture(final java.io.File r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.composer.camera.HatchCameraSession.C111481
            if (r0 == 0) goto L53
            r3 = r8
            com.facebook.aura.composer.camera.HatchCameraSession$capture$1 r3 = (com.facebook.aura.composer.camera.HatchCameraSession.C111481) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L59
            X.Hwg.A00(r2)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r2)
            r3.L$0 = r7
            r3.label = r0
            X.GBL r4 = X.C7Bm.A04(r3)
            X.Be8 r1 = new X.Be8
            r1.<init>()
            androidx.compose.runtime.MutableState r0 = r6.front$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            r1.A00 = r0
            X.BfM r3 = r6.capture
            X.Bkn r2 = new X.Bkn
            r2.<init>(r1, r7)
            java.util.concurrent.Executor r1 = r6.executor
            com.facebook.aura.composer.camera.HatchCameraSession$capture$2$1 r0 = new com.facebook.aura.composer.camera.HatchCameraSession$capture$2$1
            r0.<init>()
            r3.A0X(r0, r2, r1)
            java.lang.Object r0 = r4.A0F()
            if (r0 != r5) goto L20
            return r5
        L53:
            com.facebook.aura.composer.camera.HatchCameraSession$capture$1 r3 = new com.facebook.aura.composer.camera.HatchCameraSession$capture$1
            r3.<init>(r8)
            goto L12
        L59:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.camera.HatchCameraSession.capture(java.io.File, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Exception exc) throws Exception {
        if ((exc instanceof CancellationException) && !(exc instanceof TimeoutCancellationException)) {
            throw exc;
        }
        CFK.A08("HatchCameraSession", "Camera capture failed", exc);
        setFailed(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBusy(boolean z) {
        MutableState.A09(z, this.busy$delegate);
    }

    private final void setCanSwitch(boolean z) {
        MutableState.A09(z, this.canSwitch$delegate);
    }

    private final void setFailed(boolean z) {
        MutableState.A09(z, this.failed$delegate);
    }

    private final void setFront(boolean z) {
        MutableState.A09(z, this.front$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPhoto(File file) {
        this.photo$delegate.Af8(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShutterCount(int i) {
        this.shutterCount$delegate.AdX(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:20:0x0055, B:21:0x0058, B:22:0x005a, B:24:0x005e, B:26:0x0061, B:31:0x0075, B:33:0x007a, B:34:0x007d, B:37:0x009c, B:39:0x00c2, B:41:0x00c9, B:42:0x00cc, B:15:0x003c, B:17:0x0040, B:38:0x00ac), top: B:47:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:20:0x0055, B:21:0x0058, B:22:0x005a, B:24:0x005e, B:26:0x0061, B:31:0x0075, B:33:0x007a, B:34:0x007d, B:37:0x009c, B:39:0x00c2, B:41:0x00c9, B:42:0x00cc, B:15:0x003c, B:17:0x0040, B:38:0x00ac), top: B:47:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bind(X.BoY r15, X.C1HY r16, X.HtJ<? super kotlin.Unit> r17) throws java.lang.Exception {
        /*
            r14 = this;
            r3 = r17
            r11 = r16
            boolean r0 = r3 instanceof com.facebook.aura.composer.camera.HatchCameraSession.AnonymousClass1
            if (r0 == 0) goto L2b
            r6 = r3
            com.facebook.aura.composer.camera.HatchCameraSession$bind$1 r6 = (com.facebook.aura.composer.camera.HatchCameraSession.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r6.label = r2
        L16:
            java.lang.Object r10 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L36
            if (r0 != r5) goto L31
            java.lang.Object r11 = r6.L$1
            X.1HY r11 = (X.C1HY) r11
            java.lang.Object r15 = r6.L$0
            X.BoY r15 = (X.BoY) r15
            goto L55
        L2b:
            com.facebook.aura.composer.camera.HatchCameraSession$bind$1 r6 = new com.facebook.aura.composer.camera.HatchCameraSession$bind$1
            r6.<init>(r3)
            goto L16
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L36:
            X.Hwg.A00(r10)
            r14.setFailed(r3)
            X.Bha r10 = r14.provider     // Catch: java.lang.Exception -> Lcd
            if (r10 != 0) goto L5a
            r0 = 0
            com.facebook.aura.composer.camera.HatchCameraSession$bind$cameras$1 r2 = new com.facebook.aura.composer.camera.HatchCameraSession$bind$cameras$1     // Catch: java.lang.Exception -> Lcd
            r2.<init>(r14, r0)     // Catch: java.lang.Exception -> Lcd
            r6.L$0 = r15     // Catch: java.lang.Exception -> Lcd
            r6.L$1 = r11     // Catch: java.lang.Exception -> Lcd
            r6.label = r5     // Catch: java.lang.Exception -> Lcd
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r10 = X.GAX.A00(r6, r2, r0)     // Catch: java.lang.Exception -> Lcd
            if (r10 != r4) goto L58
            return r4
        L55:
            X.Hwg.A00(r10)     // Catch: java.lang.Exception -> Lcd
        L58:
            X.Bha r10 = (X.C2678Bha) r10     // Catch: java.lang.Exception -> Lcd
        L5a:
            boolean r0 = r14.disposed     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L61
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> Lcd
            return r4
        L61:
            r14.provider = r10     // Catch: java.lang.Exception -> Lcd
            X.Bdt r6 = X.C2565Bdt.A01     // Catch: java.lang.Exception -> Lcd
            boolean r2 = r10.A05(r6)     // Catch: java.lang.Exception -> Lcd
            X.Bdt r4 = X.C2565Bdt.A02     // Catch: java.lang.Exception -> Lcd
            boolean r1 = r10.A05(r4)     // Catch: java.lang.Exception -> Lcd
            if (r2 == 0) goto L74
            r0 = 1
            if (r1 != 0) goto L75
        L74:
            r0 = 0
        L75:
            r14.setCanSwitch(r0)     // Catch: java.lang.Exception -> Lcd
            if (r2 != 0) goto L7d
            r14.setFront(r5)     // Catch: java.lang.Exception -> Lcd
        L7d:
            r2 = 2
            X.BfA r1 = r14.preview     // Catch: java.lang.Exception -> Lcd
            X.BfM r0 = r14.capture     // Catch: java.lang.Exception -> Lcd
            X.BfD[] r0 = new X.BfD[]{r1, r0}     // Catch: java.lang.Exception -> Lcd
            r10.A04(r0)     // Catch: java.lang.Exception -> Lcd
            X.BfA r1 = r14.preview     // Catch: java.lang.Exception -> Lcd
            X.BoT.A00()     // Catch: java.lang.Exception -> Lcd
            X.BgO r0 = r15.A09     // Catch: java.lang.Exception -> Lcd
            r1.A0X(r0)     // Catch: java.lang.Exception -> Lcd
            androidx.compose.runtime.MutableState r0 = r14.front$delegate     // Catch: java.lang.Exception -> Lcd
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L9c
            r6 = r4
        L9c:
            X.BfA r1 = r14.preview     // Catch: java.lang.Exception -> Lcd
            X.BfM r0 = r14.capture     // Catch: java.lang.Exception -> Lcd
            X.BfD[] r1 = new X.BfD[]{r1, r0}     // Catch: java.lang.Exception -> Lcd
            X.C7384Etj.A0Y(r11, r3)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r0 = "CX:bindToLifecycle"
            X.AbstractC3136BzG.A00(r0)     // Catch: java.lang.Exception -> Lcd
            X.C2678Bha.A02(r10)     // Catch: java.lang.Throwable -> Lc8
            X.C2678Bha.A03(r10)     // Catch: java.lang.Throwable -> Lc8
            X.Bht r7 = X.C2693Bht.A00     // Catch: java.lang.Throwable -> Lc8
            X.AGi r12 = X.C0881AGi.A00     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r1, r2)     // Catch: java.lang.Throwable -> Lc8
            X.BfD[] r13 = (X.BfD[]) r13     // Catch: java.lang.Throwable -> Lc8
            r9 = 0
            r8 = r7
            X.Bhf r0 = X.C2678Bha.A01(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lc8
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> Lcd
            r14.camera = r0     // Catch: java.lang.Exception -> Lcd
            goto Ld1
        Lc8:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> Lcd
            throw r0     // Catch: java.lang.Exception -> Lcd
        Lcd:
            r0 = move-exception
            r14.fail(r0)
        Ld1:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.camera.HatchCameraSession.bind(X.BoY, X.1HY, X.HtJ):java.lang.Object");
    }

    public final boolean getBusy() {
        return MutableState.A0A(this.busy$delegate);
    }

    public final boolean getCanSwitch() {
        return MutableState.A0A(this.canSwitch$delegate);
    }

    public final boolean getFailed() {
        return MutableState.A0A(this.failed$delegate);
    }

    public final boolean getFront() {
        return MutableState.A0A(this.front$delegate);
    }

    public final File getPhoto() {
        return (File) this.photo$delegate.getValue();
    }

    public final int getShutterCount() {
        return this.shutterCount$delegate.AGd();
    }

    public final void switchCamera() {
        if (!MutableState.A0A(this.busy$delegate) && getPhoto() == null && MutableState.A0A(this.canSwitch$delegate)) {
            setFront(!MutableState.A0A(this.front$delegate));
        }
    }

    public final void takePhoto(int i) {
        Rational rational;
        int denominator;
        int numerator;
        if (MutableState.A0A(this.busy$delegate) || getPhoto() != null || this.camera == null || this.disposed) {
            return;
        }
        setBusy(true);
        setFailed(false);
        C2605BfM c2605BfM = this.capture;
        int iA00 = InterfaceC2586Bei.A00(InterfaceC2551Bdc.A09, (InterfaceC2551Bdc) ((BfD) c2605BfM).A05, 0);
        if (c2605BfM.A0V(i) && (rational = c2605BfM.A00) != null) {
            int iAbs = Math.abs(AbstractC2467Bbu.A00(i) - AbstractC2467Bbu.A00(iA00));
            if (iAbs == 90 || iAbs == 270) {
                denominator = rational.getDenominator();
                numerator = rational.getNumerator();
            } else {
                denominator = rational.getNumerator();
                numerator = rational.getDenominator();
            }
            c2605BfM.A00 = new Rational(denominator, numerator);
        }
        this.captureJob = AnonymousClass001.A11(new C111491(null), this.scope);
    }

    public final File takeResult() {
        if (!AuraSessionManager.INSTANCE.isCurrentSession(this.session)) {
            return null;
        }
        File photo = getPhoto();
        setPhoto(null);
        return photo;
    }

    public final void zoom(float f) {
        InterfaceC2783Bl3 interfaceC2783Bl3;
        InterfaceC2779Bkw interfaceC2779BkwA02;
        if (MutableState.A0A(this.busy$delegate) || getPhoto() != null || (interfaceC2783Bl3 = this.camera) == null || (interfaceC2779BkwA02 = interfaceC2783Bl3.ADI().AMz().A02()) == null) {
            return;
        }
        interfaceC2783Bl3.ADF().AfI(ATD.A03(interfaceC2779BkwA02.AMy() * f, interfaceC2779BkwA02.AHl(), interfaceC2779BkwA02.AHV()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cameraProvider(HtJ<? super C2678Bha> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        final ListenableFuture<C2678Bha> listenableFutureA00 = C2678Bha.A00(this.context);
        listenableFutureA00.addListener(new Runnable() { // from class: com.facebook.aura.composer.camera.HatchCameraSession$cameraProvider$2$1
            @Override // java.lang.Runnable
            public final void run() {
                if (gblA03.isActive()) {
                    try {
                        gblA03.resumeWith(listenableFutureA00.get());
                    } catch (Exception e) {
                        BV7.A1K(e, gblA03);
                    }
                }
            }
        }, this.executor);
        return gblA03.A0F();
    }

    public final void retake() {
        final File photo = getPhoto();
        if (photo != null) {
            F0C.A05().execute(new Runnable() { // from class: com.facebook.aura.composer.camera.HatchCameraSession$retake$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    HatchCameraFiles.INSTANCE.delete$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(photo);
                }
            });
        }
        setPhoto(null);
        setFailed(false);
    }
}
