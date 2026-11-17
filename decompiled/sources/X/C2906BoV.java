package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.BoV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2906BoV implements BgO {
    public final /* synthetic */ BoY A00;

    public C2906BoV(BoY boY) {
        this.A00 = boY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BgO
    public final void AWR(final BmM bmM) {
        C2932Boy c2932Boy;
        if (!AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread())) {
            this.A00.getContext().getMainExecutor().execute(new Runnable() { // from class: X.Boh
                public static final String __redex_internal_original_name = "PreviewView$1$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    C2906BoV c2906BoV = this;
                    c2906BoV.A00.A09.AWR(bmM);
                }
            });
            return;
        }
        AbstractC2875Bni.A01("PreviewView", "Surface requested by Preview.");
        final InterfaceC2610Bfb interfaceC2610Bfb = bmM.A06;
        BoY boY = this.A00;
        InterfaceC2544BdV interfaceC2544BdVADJ = interfaceC2610Bfb.ADJ();
        boY.A00 = interfaceC2544BdVADJ;
        BlM blM = boY.A05;
        Rect rectAKM = interfaceC2610Bfb.ADG().AKM();
        ((AbstractC2791BlL) blM).A00 = new Rational(rectAKM.width(), rectAKM.height());
        synchronized (blM) {
            blM.A01 = rectAKM;
        }
        Context context = boY.getContext();
        bmM.A02(new BgP() { // from class: X.BoW
            @Override // X.BgP
            public final void AWn(BhO bhO) {
                AbstractC2908BoZ abstractC2908BoZ;
                C2906BoV c2906BoV = this;
                InterfaceC2610Bfb interfaceC2610Bfb2 = interfaceC2610Bfb;
                BmM bmM2 = bmM;
                AbstractC2875Bni.A01("PreviewView", AnonymousClass007.A0a("Preview transformation info updated. ", bhO));
                boolean zA1M = AnonymousClass002.A1M(interfaceC2610Bfb2.ADJ().AH3());
                BoY boY2 = c2906BoV.A00;
                C2907BoX c2907BoX = boY2.A0A;
                Size size = bmM2.A04;
                StringBuilder sbA0f = C3cG.A0f(bhO, "Transformation info set: ");
                sbA0f.append(InviteCodeScratcherKt.CODE_SEPARATOR);
                sbA0f.append(size);
                AbstractC2875Bni.A01("PreviewTransform", C60P.A1P(InviteCodeScratcherKt.CODE_SEPARATOR, sbA0f, zA1M));
                BfX bfX = (BfX) bhO;
                c2907BoX.A03 = bfX.A03;
                c2907BoX.A00 = bfX.A00;
                int i = bfX.A01;
                c2907BoX.A01 = i;
                c2907BoX.A04 = size;
                c2907BoX.A07 = zA1M;
                c2907BoX.A06 = bfX.A04;
                c2907BoX.A02 = bfX.A02;
                if (i == -1 || ((abstractC2908BoZ = boY2.A04) != null && (abstractC2908BoZ instanceof C2932Boy))) {
                    boY2.A07 = true;
                } else {
                    boY2.A07 = false;
                }
                boY2.A01();
            }
        }, context.getMainExecutor());
        AbstractC2908BoZ abstractC2908BoZ = boY.A04;
        Ev4 ev4 = boY.A02;
        if (!(abstractC2908BoZ instanceof C2932Boy) || BoY.A00(bmM, ev4)) {
            boolean zA00 = BoY.A00(bmM, boY.A02);
            C2907BoX c2907BoX = boY.A0A;
            if (zA00) {
                C2910Bob c2910Bob = new C2910Bob(boY, c2907BoX);
                c2910Bob.A09 = false;
                c2910Bob.A08 = BV4.A15();
                c2932Boy = c2910Bob;
            } else {
                c2932Boy = new C2932Boy(boY, c2907BoX);
            }
            boY.A04 = c2932Boy;
        }
        final C2820Blx c2820Blx = new C2820Blx(interfaceC2544BdVADJ, boY.A04, boY.A0E);
        boY.A0F.set(c2820Blx);
        interfaceC2610Bfb.ADL().A3j(c2820Blx, context.getMainExecutor());
        AbstractC2908BoZ abstractC2908BoZ2 = boY.A04;
        final InterfaceC2921Bom interfaceC2921Bom = new InterfaceC2921Bom() { // from class: X.BoU
            @Override // X.InterfaceC2921Bom
            public final void AWP() {
                C2906BoV c2906BoV = this;
                C2820Blx c2820Blx2 = c2820Blx;
                InterfaceC2610Bfb interfaceC2610Bfb2 = interfaceC2610Bfb;
                if (Bs8.A00(c2820Blx2, null, c2906BoV.A00.A0F)) {
                    c2820Blx2.A00(EvM.IDLE);
                }
                ListenableFuture<Void> listenableFuture = c2820Blx2.A00;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                    c2820Blx2.A00 = null;
                }
                interfaceC2610Bfb2.ADL().Aau(c2820Blx2);
            }
        };
        if (abstractC2908BoZ2 instanceof C2910Bob) {
            final C2910Bob c2910Bob2 = (C2910Bob) abstractC2908BoZ2;
            Size size = bmM.A04;
            ((AbstractC2908BoZ) c2910Bob2).A00 = size;
            c2910Bob2.A05 = interfaceC2921Bom;
            FrameLayout frameLayout = ((AbstractC2908BoZ) c2910Bob2).A01;
            size.getClass();
            TextureView textureView = new TextureView(frameLayout.getContext());
            c2910Bob2.A02 = textureView;
            textureView.setLayoutParams(new FrameLayout.LayoutParams(((AbstractC2908BoZ) c2910Bob2).A00.getWidth(), ((AbstractC2908BoZ) c2910Bob2).A00.getHeight()));
            c2910Bob2.A02.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2909Boa(c2910Bob2));
            frameLayout.removeAllViews();
            frameLayout.addView(c2910Bob2.A02);
            BmM bmM2 = c2910Bob2.A03;
            if (bmM2 != null) {
                bmM2.A00();
            }
            c2910Bob2.A03 = bmM;
            Executor mainExecutor = c2910Bob2.A02.getContext().getMainExecutor();
            C3010Brs.A00(bmM.A08, new Runnable() { // from class: X.Bof
                public static final String __redex_internal_original_name = "TextureViewImplementation$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    C2910Bob c2910Bob3 = c2910Bob2;
                    BmM bmM3 = bmM;
                    BmM bmM4 = c2910Bob3.A03;
                    if (bmM4 != null && bmM4 == bmM3) {
                        c2910Bob3.A03 = null;
                        c2910Bob3.A06 = null;
                    }
                    InterfaceC2921Bom interfaceC2921Bom2 = c2910Bob3.A05;
                    if (interfaceC2921Bom2 != null) {
                        interfaceC2921Bom2.AWP();
                        c2910Bob3.A05 = null;
                    }
                }
            }, mainExecutor);
            c2910Bob2.A01();
        } else {
            final C2932Boy c2932Boy2 = (C2932Boy) abstractC2908BoZ2;
            SurfaceView surfaceView = c2932Boy2.A00;
            Size size2 = ((AbstractC2908BoZ) c2932Boy2).A00;
            Size size3 = bmM.A04;
            boolean zA002 = C6xC.A00(size2, size3);
            if (surfaceView == null || !zA002) {
                ((AbstractC2908BoZ) c2932Boy2).A00 = size3;
                FrameLayout frameLayout2 = ((AbstractC2908BoZ) c2932Boy2).A01;
                size3.getClass();
                SurfaceView surfaceView2 = new SurfaceView(frameLayout2.getContext());
                c2932Boy2.A00 = surfaceView2;
                surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((AbstractC2908BoZ) c2932Boy2).A00.getWidth(), ((AbstractC2908BoZ) c2932Boy2).A00.getHeight()));
                frameLayout2.removeAllViews();
                frameLayout2.addView(c2932Boy2.A00);
                c2932Boy2.A00.getHolder().addCallback(c2932Boy2.A01);
            }
            Executor mainExecutor2 = c2932Boy2.A00.getContext().getMainExecutor();
            C3010Brs.A00(bmM.A08, new Runnable() { // from class: X.Bp1
                public static final String __redex_internal_original_name = "SurfaceViewImplementation$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2921Bom.AWP();
                }
            }, mainExecutor2);
            c2932Boy2.A00.post(new Runnable() { // from class: X.Boz
                public static final String __redex_internal_original_name = "SurfaceViewImplementation$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    C2932Boy c2932Boy3 = c2932Boy2;
                    BmM bmM3 = bmM;
                    InterfaceC2921Bom interfaceC2921Bom2 = interfaceC2921Bom;
                    SurfaceHolderCallbackC2931Box surfaceHolderCallbackC2931Box = c2932Boy3.A01;
                    BmM bmM4 = surfaceHolderCallbackC2931Box.A02;
                    if (bmM4 != null) {
                        AbstractC2875Bni.A01("SurfaceViewImpl", AnonymousClass007.A0a("Request canceled: ", bmM4));
                        surfaceHolderCallbackC2931Box.A02.A00();
                    }
                    if (surfaceHolderCallbackC2931Box.A04) {
                        surfaceHolderCallbackC2931Box.A04 = false;
                        bmM3.A00();
                        bmM3.A09.A03(null);
                        return;
                    }
                    surfaceHolderCallbackC2931Box.A02 = bmM3;
                    surfaceHolderCallbackC2931Box.A03 = interfaceC2921Bom2;
                    Size size4 = bmM3.A04;
                    surfaceHolderCallbackC2931Box.A01 = size4;
                    surfaceHolderCallbackC2931Box.A05 = false;
                    if (SurfaceHolderCallbackC2931Box.A00(surfaceHolderCallbackC2931Box)) {
                        return;
                    }
                    AbstractC2875Bni.A01("SurfaceViewImpl", "Wait for new Surface creation.");
                    surfaceHolderCallbackC2931Box.A07.A00.getHolder().setFixedSize(size4.getWidth(), size4.getHeight());
                }
            });
        }
        C2919Bok c2919Bok = boY.A0C;
        if (boY.indexOfChild(c2919Bok) == -1) {
            boY.addView(c2919Bok);
        }
    }
}
