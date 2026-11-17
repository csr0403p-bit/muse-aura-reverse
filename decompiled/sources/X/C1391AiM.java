package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Build;

/* renamed from: X.AiM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1391AiM implements InterfaceC1410Aif {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public Matrix A0E;
    public Paint A0F;
    public AbstractC1408Aid A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final RenderNode A0L;
    public final C1404AiZ A0M;
    public final C1325AhC A0N;

    public /* synthetic */ C1391AiM() {
        C1404AiZ c1404AiZ = new C1404AiZ();
        C1325AhC c1325AhC = new C1325AhC();
        this.A0M = c1404AiZ;
        this.A0N = c1325AhC;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.A0L = renderNode;
        this.A0C = 0L;
        renderNode.setClipToBounds(false);
        renderNode.setUseCompositingLayer(false, this.A0F);
        renderNode.setHasOverlappingRendering(true);
        this.A00 = 1.0f;
        this.A09 = 3;
        this.A04 = 1.0f;
        this.A05 = 1.0f;
        long j = B6A.A01;
        this.A0B = j;
        this.A0D = j;
        this.A01 = 8.0f;
        this.A0A = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028 A[PHI: r1
  0x0028: PHI (r1v1 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:7:0x000b, B:9:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[PHI: r1
  0x000d: PHI (r1v3 boolean) = (r1v0 boolean), (r1v4 boolean) binds: [B:7:0x000b, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1391AiM r4) {
        /*
            boolean r3 = r4.A0H
            r2 = 1
            if (r3 == 0) goto La
            boolean r0 = r4.A0I
            r1 = 1
            if (r0 == 0) goto Ld
        La:
            r1 = 0
            if (r3 == 0) goto L28
        Ld:
            boolean r0 = r4.A0I
            if (r0 == 0) goto L28
        L11:
            boolean r0 = r4.A0J
            if (r1 == r0) goto L1c
            r4.A0J = r1
            android.graphics.RenderNode r0 = r4.A0L
            r0.setClipToBounds(r1)
        L1c:
            boolean r0 = r4.A0K
            if (r2 == r0) goto L27
            r4.A0K = r2
            android.graphics.RenderNode r0 = r4.A0L
            r0.setClipToOutline(r2)
        L27:
            return
        L28:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1391AiM.A00(X.AiM):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C1391AiM r5) {
        /*
            int r2 = r5.A0A
            r0 = 1
            r4 = 1
            if (r2 == r0) goto L10
            int r1 = r5.A09
            r0 = 3
            if (r1 != r0) goto L10
            X.Aid r0 = r5.A0G
            r1 = 0
            if (r0 == 0) goto L11
        L10:
            r1 = 1
        L11:
            android.graphics.RenderNode r3 = r5.A0L
            if (r1 != 0) goto L2c
            if (r2 == r4) goto L2c
            r0 = 2
            boolean r2 = X.AnonymousClass002.A1Q(r2, r0)
            android.graphics.Paint r1 = r5.A0F
            r0 = 0
            if (r2 == 0) goto L28
            r3.setUseCompositingLayer(r0, r1)
            r3.setHasOverlappingRendering(r0)
            return
        L28:
            r3.setUseCompositingLayer(r0, r1)
            goto L31
        L2c:
            android.graphics.Paint r0 = r5.A0F
            r3.setUseCompositingLayer(r4, r0)
        L31:
            r3.setHasOverlappingRendering(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1391AiM.A01(X.AiM):void");
    }

    @Override // X.InterfaceC1410Aif
    public final void AeM(AbstractC1408Aid abstractC1408Aid) {
        this.A0G = abstractC1408Aid;
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC1405Aia.A00(this.A0L, abstractC1408Aid);
        }
    }
}
