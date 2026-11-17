package com.facebook.aura.ageverification;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.Bra;
import X.C2H;
import X.C2Kw;
import X.C3503CRd;
import X.C3555CTs;
import X.C3665CcL;
import X.C3cG;
import X.C4208CqE;
import X.C4209CqH;
import X.C60O;
import X.C7384Etj;
import X.CEF;
import X.CRy;
import X.CSA;
import X.CSC;
import X.CWM;
import X.Cbv;
import X.Cc0;
import X.F1F;
import X.G0U;
import X.InterfaceC2692Bhr;
import X.InterfaceC2873Bng;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import android.os.SystemClock;
import android.util.Size;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class FaceDetectionAnalyzer implements InterfaceC2692Bhr {
    public static final int $stable = 8;
    public final Bra detector;
    public RuntimeException initError;
    public final Executor mainExecutor;
    public final G0U<FaceFrame, Unit> onFrame;
    public final G0U<Exception, Unit> onUnavailable;
    public volatile boolean unavailable;

    @Override // X.InterfaceC2692Bhr
    public void analyze(final InterfaceC2873Bng interfaceC2873Bng) {
        final int height;
        final int width;
        C3665CcL c3665CcL;
        int iLimit;
        C7384Etj.A0Y(interfaceC2873Bng, 0);
        Image imageAGI = interfaceC2873Bng.AGI();
        C2Kw c2Kw = this.detector;
        if (this.unavailable || c2Kw == null || imageAGI == null) {
            interfaceC2873Bng.close();
            return;
        }
        int iAJr = interfaceC2873Bng.AGK().AJr();
        if (iAJr == 90 || iAJr == 270) {
            height = interfaceC2873Bng.getHeight();
            width = interfaceC2873Bng.getWidth();
        } else {
            height = interfaceC2873Bng.getWidth();
            width = interfaceC2873Bng.getHeight();
        }
        final float fMin = Math.min(interfaceC2873Bng.AEC().width(), interfaceC2873Bng.AEC().height());
        final float fAverageLuma = FaceDetectionAnalyzerKt.averageLuma(interfaceC2873Bng);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C3665CcL.A00(iAJr);
        boolean z = true;
        if (imageAGI.getFormat() != 256 && imageAGI.getFormat() != 35) {
            z = false;
        }
        CRy.A08(z, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = imageAGI.getPlanes();
        if (imageAGI.getFormat() == 256) {
            iLimit = imageAGI.getPlanes()[0].getBuffer().limit();
            CRy.A08(AnonymousClass002.A1Q(imageAGI.getFormat(), 256), "Only JPEG is supported now");
            Image.Plane[] planes2 = imageAGI.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                throw C60O.A0i("Unexpected image format, JPEG should have exactly 1 image plane");
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            c3665CcL = new C3665CcL(0, C2H.A00(bitmapDecodeByteArray, iAJr, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight()));
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            c3665CcL = new C3665CcL(imageAGI, imageAGI.getWidth(), imageAGI.getHeight(), iAJr);
            iLimit = (imageAGI.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        C3665CcL.A01(imageAGI.getFormat(), 5, imageAGI.getHeight(), imageAGI.getWidth(), iLimit, iAJr, jElapsedRealtime);
        ((C3503CRd) c2Kw).A00(c3665CcL).A09(new CEF() { // from class: com.facebook.aura.ageverification.FaceDetectionAnalyzer.analyze.1

            /* renamed from: com.facebook.aura.ageverification.FaceDetectionAnalyzer$analyze$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Float, FaceSnapshot> {
                public final /* synthetic */ List<C4208CqE> $faces;
                public final /* synthetic */ F1F $handedOff;
                public final /* synthetic */ InterfaceC2873Bng $image;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(List<C4208CqE> list, InterfaceC2873Bng interfaceC2873Bng, F1F f1f) {
                    super(1);
                    this.$faces = list;
                    this.$image = interfaceC2873Bng;
                    this.$handedOff = f1f;
                }

                public final FaceSnapshot invoke(float f) {
                    List<C4208CqE> list = this.$faces;
                    C7384Etj.A0X(list);
                    C4208CqE c4208CqE = (C4208CqE) AbstractC0878AGe.A0K(list);
                    if (c4208CqE == null) {
                        return null;
                    }
                    InterfaceC2873Bng interfaceC2873Bng = this.$image;
                    Rect rect = c4208CqE.A03;
                    C7384Etj.A0U(rect);
                    FaceSnapshot faceSnapshot = SelfieSnapshotKt.faceSnapshot(interfaceC2873Bng, rect, f);
                    if (faceSnapshot == null) {
                        return null;
                    }
                    this.$handedOff.element = true;
                    return faceSnapshot;
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ FaceSnapshot invoke(Float f) {
                    return invoke(AnonymousClass001.A02(f));
                }
            }

            @Override // X.CEF
            public final void onComplete(CSA<List<C4208CqE>> csa) {
                G0U g0u;
                Object objA07;
                C7384Etj.A0Y(csa, 0);
                F1F f1f = new F1F();
                try {
                    if (!FaceDetectionAnalyzer.this.unavailable && !((CSC) csa).A05) {
                        if (csa.A0C()) {
                            List<C4208CqE> listA08 = csa.A08();
                            g0u = FaceDetectionAnalyzer.this.onFrame;
                            C7384Etj.A0X(listA08);
                            int i = height;
                            int i2 = width;
                            float f = fMin;
                            ArrayList arrayListA0i = AnonymousClass003.A0i(listA08);
                            for (C4208CqE c4208CqE : listA08) {
                                C7384Etj.A0X(c4208CqE);
                                arrayListA0i.add(FaceDetectionAnalyzerKt.normalized(c4208CqE, i, i2, f));
                            }
                            objA07 = new FaceFrame(arrayListA0i, fAverageLuma, new AnonymousClass2(listA08, interfaceC2873Bng, f1f));
                        } else {
                            FaceDetectionAnalyzer.this.unavailable = true;
                            g0u = FaceDetectionAnalyzer.this.onUnavailable;
                            objA07 = csa.A07();
                            if (objA07 == null) {
                                objA07 = C3cG.A0Q("Face detection failed");
                            }
                        }
                        g0u.invoke(objA07);
                    }
                } finally {
                    if (!f1f.element) {
                        interfaceC2873Bng.close();
                    }
                }
            }
        }, this.mainExecutor);
    }

    public final void close() {
        this.unavailable = true;
        Bra bra = this.detector;
        if (bra != null) {
            bra.close();
        }
    }

    public /* synthetic */ Size getDefaultTargetResolution() {
        return null;
    }

    public final RuntimeException getInitError() {
        return this.initError;
    }

    public /* synthetic */ int getTargetCoordinateSystem() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceDetectionAnalyzer(Context context, G0U<? super FaceFrame, Unit> g0u, G0U<? super Exception, Unit> g0u2) {
        Cbv cbv;
        AnonymousClass005.A0x(context, g0u, g0u2);
        this.onFrame = g0u;
        this.onUnavailable = g0u2;
        Executor mainExecutor = context.getMainExecutor();
        C7384Etj.A0U(mainExecutor);
        this.mainExecutor = mainExecutor;
        try {
            C4209CqH c4209CqH = FaceDetectionEngineKt.FACE_DETECTOR_OPTIONS;
            CRy.A04(c4209CqH, "You must provide a valid FaceDetectorOptions.");
            CWM cwm = (CWM) C3555CTs.A00().A02(CWM.class);
            CRy.A04(c4209CqH, "You must provide a valid FaceDetectorOptions.");
            cbv = new Cbv(cwm.A00, (Cc0) cwm.A01.A00(c4209CqH));
        } catch (RuntimeException e) {
            this.initError = e;
            cbv = null;
        }
        this.detector = cbv;
        this.unavailable = AnonymousClass002.A1Y(cbv);
    }

    public /* synthetic */ void updateTransform(Matrix matrix) {
    }
}
