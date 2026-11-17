package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.F4p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7576F4p implements BeM {
    public final int $t;
    public final Object A00;

    public C7576F4p(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.BeM
    public final void accept(Object obj) {
        C2701BiJ c2701BiJ;
        Executor executor;
        Runnable runnable;
        switch (this.$t) {
            case 0:
                ((Bi6) this.A00).A01((Bi7) obj);
                break;
            case 1:
                Bi6 bi6 = (Bi6) this.A00;
                Bi7 bi7 = (Bi7) obj;
                bi6.A01(bi7);
                C2862BnM c2862BnM = bi6.A02;
                BeS.A07(AnonymousClass002.A1Y(c2862BnM.A00), "Pending request should be null");
                c2862BnM.A00 = bi7;
                break;
            case 2:
                ((Bi6) this.A00).A02((AbstractC2816Blt) obj);
                break;
            case 3:
                final BiF biF = (BiF) this.A00;
                final AbstractC2815Bls abstractC2815Bls = (AbstractC2815Bls) obj;
                c2701BiJ = (C2701BiJ) abstractC2815Bls;
                if (!((Bi2) c2701BiJ.A01.A07).A03) {
                    executor = biF.A0A;
                    runnable = new Runnable() { // from class: X.BiD
                        public static final String __redex_internal_original_name = "ProcessingNode$$ExternalSyntheticLambda7";

                        @Override // java.lang.Runnable
                        public final void run() {
                            final ImageCaptureException e;
                            ScheduledExecutorService scheduledExecutorServiceA00;
                            Runnable runnable2;
                            BiF biF2 = biF;
                            AbstractC2815Bls abstractC2815Bls2 = abstractC2815Bls;
                            final Bi7 bi72 = ((C2701BiJ) abstractC2815Bls2).A01;
                            try {
                                C2771Bkn c2771Bkn = bi72.A06;
                                if (c2771Bkn == null) {
                                    AbstractC2866BnZ<InterfaceC2873Bng> abstractC2866BnZApply = biF2.A04.apply(abstractC2815Bls2);
                                    if ((((BnX) abstractC2866BnZApply).A00 == 35 || biF2.A0B) && ((Bi8) biF2.A00).A01 == 256) {
                                        abstractC2866BnZApply = biF2.A07.apply(biF2.A03.apply(new BiI(abstractC2866BnZApply, bi72.A01)));
                                    }
                                    final InterfaceC2873Bng interfaceC2873BngApply = biF2.A08.apply(abstractC2866BnZApply);
                                    scheduledExecutorServiceA00 = BoS.A00();
                                    runnable2 = new Runnable() { // from class: X.BiB
                                        public static final String __redex_internal_original_name = "ProcessingNode$$ExternalSyntheticLambda4";

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Bi7 bi73 = bi72;
                                            final InterfaceC2873Bng interfaceC2873Bng = interfaceC2873BngApply;
                                            Bi2 bi2 = (Bi2) bi73.A07;
                                            BoT.A00();
                                            if (bi2.A03) {
                                                interfaceC2873Bng.close();
                                                return;
                                            }
                                            BeS.A07(bi2.A07.isDone(), "onImageCaptured() must be called before onFinalResult()");
                                            Bi2.A01(bi2);
                                            final AbstractC2401BaE abstractC2401BaE = bi2.A06;
                                            ((C2699Bi3) abstractC2401BaE).A08.execute(new Runnable() { // from class: X.BiQ
                                                public static final String __redex_internal_original_name = "TakePictureRequest$$ExternalSyntheticLambda0";

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object obj2 = null;
                                                    obj2.getClass();
                                                    throw F60.createAndThrow();
                                                }
                                            });
                                        }
                                    };
                                } else {
                                    int i = ((Bi8) biF2.A00).A01;
                                    BeS.A06(AbstractC2797BlZ.A00(i), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(i)));
                                    AbstractC2866BnZ<InterfaceC2873Bng> abstractC2866BnZApply2 = biF2.A04.apply(abstractC2815Bls2);
                                    BpR<AbstractC2812Blp, AbstractC2866BnZ<byte[]>> bpR = biF2.A03;
                                    int i2 = bi72.A01;
                                    AbstractC2866BnZ<byte[]> abstractC2866BnZApply3 = bpR.apply(new BiI(abstractC2866BnZApply2, i2));
                                    BnX bnX = (BnX) abstractC2866BnZApply3;
                                    Rect rect = bnX.A03;
                                    Size size = bnX.A04;
                                    RectF rectF = BfO.A00;
                                    if (rect.left != 0 || rect.top != 0 || rect.width() != size.getWidth() || rect.height() != size.getHeight()) {
                                        BeS.A07(AbstractC2797BlZ.A00(bnX.A00), null);
                                        abstractC2866BnZApply3 = biF2.A01.apply(new BiH(biF2.A05.apply(abstractC2866BnZApply3), i2));
                                    }
                                    final C2796BlX c2796BlXApply = biF2.A06.apply(new BiG(c2771Bkn, abstractC2866BnZApply3));
                                    scheduledExecutorServiceA00 = BoS.A00();
                                    runnable2 = new Runnable() { // from class: X.BiC
                                        public static final String __redex_internal_original_name = "ProcessingNode$$ExternalSyntheticLambda5";

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Bi7 bi73 = bi72;
                                            final C2796BlX c2796BlX = c2796BlXApply;
                                            Bi2 bi2 = (Bi2) bi73.A07;
                                            BoT.A00();
                                            if (bi2.A03) {
                                                return;
                                            }
                                            BeS.A07(bi2.A07.isDone(), "onImageCaptured() must be called before onFinalResult()");
                                            Bi2.A01(bi2);
                                            final AbstractC2401BaE abstractC2401BaE = bi2.A06;
                                            ((C2699Bi3) abstractC2401BaE).A08.execute(new Runnable() { // from class: X.BiN
                                                public static final String __redex_internal_original_name = "TakePictureRequest$$ExternalSyntheticLambda2";

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    AbstractC2401BaE abstractC2401BaE2 = abstractC2401BaE;
                                                    C2796BlX c2796BlX2 = c2796BlX;
                                                    BiW biW = ((C2699Bi3) abstractC2401BaE2).A05;
                                                    biW.getClass();
                                                    c2796BlX2.getClass();
                                                    biW.onImageSaved(c2796BlX2);
                                                }
                                            });
                                        }
                                    };
                                }
                                scheduledExecutorServiceA00.execute(runnable2);
                            } catch (ImageCaptureException e2) {
                                e = e2;
                                BoS.A00().execute(new Runnable() { // from class: X.BiA
                                    public static final String __redex_internal_original_name = "ProcessingNode$$ExternalSyntheticLambda3";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Bi7 bi73 = bi72;
                                        ImageCaptureException imageCaptureException = e;
                                        Bi2 bi2 = (Bi2) bi73.A07;
                                        BoT.A00();
                                        if (bi2.A03) {
                                            return;
                                        }
                                        BeS.A07(bi2.A07.isDone(), "onImageCaptured() must be called before onFinalResult()");
                                        Bi2.A01(bi2);
                                        Bi2.A00(imageCaptureException, bi2);
                                    }
                                });
                            } catch (OutOfMemoryError e3) {
                                e = new ImageCaptureException(0, "Processing failed due to low memory.", e3);
                                BoS.A00().execute(new Runnable() { // from class: X.BiA
                                    public static final String __redex_internal_original_name = "ProcessingNode$$ExternalSyntheticLambda3";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Bi7 bi73 = bi72;
                                        ImageCaptureException imageCaptureException = e;
                                        Bi2 bi2 = (Bi2) bi73.A07;
                                        BoT.A00();
                                        if (bi2.A03) {
                                            return;
                                        }
                                        BeS.A07(bi2.A07.isDone(), "onImageCaptured() must be called before onFinalResult()");
                                        Bi2.A01(bi2);
                                        Bi2.A00(imageCaptureException, bi2);
                                    }
                                });
                            } catch (RuntimeException e4) {
                                e = new ImageCaptureException(0, "Processing failed.", e4);
                                BoS.A00().execute(new Runnable() { // from class: X.BiA
                                    public static final String __redex_internal_original_name = "ProcessingNode$$ExternalSyntheticLambda3";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Bi7 bi73 = bi72;
                                        ImageCaptureException imageCaptureException = e;
                                        Bi2 bi2 = (Bi2) bi73.A07;
                                        BoT.A00();
                                        if (bi2.A03) {
                                            return;
                                        }
                                        BeS.A07(bi2.A07.isDone(), "onImageCaptured() must be called before onFinalResult()");
                                        Bi2.A01(bi2);
                                        Bi2.A00(imageCaptureException, bi2);
                                    }
                                });
                            }
                        }
                    };
                    executor.execute(runnable);
                    break;
                }
                c2701BiJ.A00.close();
                break;
            case 4:
                final BiF biF2 = (BiF) this.A00;
                final AbstractC2815Bls abstractC2815Bls2 = (AbstractC2815Bls) obj;
                c2701BiJ = (C2701BiJ) abstractC2815Bls2;
                if (!((Bi2) c2701BiJ.A01.A07).A03) {
                    executor = biF2.A0A;
                    runnable = new Runnable() { // from class: X.BiE
                        public static final String __redex_internal_original_name = "ProcessingNode$$ExternalSyntheticLambda0";

                        /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r7 = this;
                                X.BiF r6 = r2
                                X.Bls r5 = r1
                                X.Blr r0 = r6.A00
                                X.Bi8 r0 = (X.Bi8) r0
                                int r1 = r0.A01
                                r0 = 35
                                if (r1 == r0) goto L13
                                r0 = 256(0x100, float:3.59E-43)
                                r2 = 0
                                if (r1 != r0) goto L14
                            L13:
                                r2 = 1
                            L14:
                                java.lang.Object[] r1 = X.BV5.A1Y(r1)
                                java.lang.String r0 = "Postview only support YUV and JPEG output formats. Output format: %s"
                                java.lang.String r0 = java.lang.String.format(r0, r1)
                                X.BeS.A06(r2, r0)
                                r4 = r5
                                X.BiJ r4 = (X.C2701BiJ) r4
                                X.Bi7 r3 = r4.A01
                                X.BpR<X.Bls, X.BnZ<X.Bng>> r0 = r6.A04     // Catch: java.lang.Exception -> L43
                                java.lang.Object r1 = r0.apply(r5)     // Catch: java.lang.Exception -> L43
                                X.BnZ r1 = (X.AbstractC2866BnZ) r1     // Catch: java.lang.Exception -> L43
                                X.BpR<X.BnZ<X.Bng>, android.graphics.Bitmap> r0 = r6.A02     // Catch: java.lang.Exception -> L43
                                java.lang.Object r2 = r0.apply(r1)     // Catch: java.lang.Exception -> L43
                                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Exception -> L43
                                java.util.concurrent.ScheduledExecutorService r1 = X.BoS.A00()     // Catch: java.lang.Exception -> L43
                                X.BiK r0 = new X.BiK     // Catch: java.lang.Exception -> L43
                                r0.<init>()     // Catch: java.lang.Exception -> L43
                                r1.execute(r0)     // Catch: java.lang.Exception -> L43
                                return
                            L43:
                                r2 = move-exception
                                X.Bng r0 = r4.A00
                                r0.close()
                                java.lang.String r1 = "ProcessingNode"
                                java.lang.String r0 = "process postview input packet failed."
                                X.AbstractC2875Bni.A05(r1, r0, r2)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.BiE.run():void");
                        }
                    };
                    executor.execute(runnable);
                    break;
                } else {
                    AbstractC2875Bni.A03("ProcessingNode", "The postview image is closed due to request aborted");
                    c2701BiJ.A00.close();
                    break;
                }
            case 5:
                BhO bhO = (BhO) obj;
                Iterator itA0n = AnonymousClass002.A0n((Map) this.A00);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    int i = ((BfX) bhO).A00 - ((BfT) ((BhW) entryA0l.getKey())).A01;
                    if (((BfT) ((BhW) entryA0l.getKey())).A06) {
                        i = -i;
                    }
                    RectF rectF = BfO.A00;
                    BoT.A01(new RunnableC2629Bfw((BfK) entryA0l.getValue(), ((i % 360) + 360) % 360, -1));
                }
                break;
            case 6:
                Bm7 bm7 = (Bm7) this.A00;
                Surface surface = ((BmJ) ((Bn0) obj)).A01;
                AbstractC2875Bni.A01("VideoEncoderSession", FGI.A0H("Surface can be closed: ", surface.hashCode()));
                if (surface != bm7.A00) {
                    surface.release();
                    break;
                } else {
                    bm7.A00 = null;
                    bm7.A04.A03(bm7.A03);
                    Bm7.A00(bm7);
                    break;
                }
            case 7:
                InterfaceC2921Bom interfaceC2921Bom = (InterfaceC2921Bom) this.A00;
                AbstractC2875Bni.A01("SurfaceViewImpl", "Safe to release surface.");
                if (interfaceC2921Bom != null) {
                    interfaceC2921Bom.AWP();
                    break;
                }
                break;
            case 8:
                ((C3010Brs) this.A00).A03(obj);
                break;
            default:
                CMB cmb = (CMB) obj;
                if (cmb == null) {
                    cmb = new CMB(-3);
                }
                ((CM6) this.A00).A00(cmb);
                break;
        }
    }
}
