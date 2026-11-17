package X;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dda, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5218Dda {
    public static final C5218Dda A00 = new C5218Dda();

    /* JADX WARN: Incorrect types in method signature: (Landroid/graphics/RuntimeShader;LX/Ddb;Ljava/util/List<LX/Dd4;>;IIILX/Ddc;)V */
    public final void A02(RuntimeShader runtimeShader, C5220Ddc c5220Ddc, C5219Ddb c5219Ddb, List list, int i, int i2, int i3) {
        boolean zA1Y = C60P.A1Y(runtimeShader, c5219Ddb);
        C7384Etj.A0Y(list, 2);
        if (c5219Ddb.A05) {
            runtimeShader.setIntUniform("passIndex", i);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5193Dd4 c5193Dd4 = (C5193Dd4) it.next();
            float[] fArr = c5193Dd4.A01;
            String str = c5193Dd4.A00;
            try {
                int length = fArr.length;
                if (length == zA1Y) {
                    runtimeShader.setFloatUniform(str, fArr[0]);
                } else if (length == 2) {
                    runtimeShader.setFloatUniform(str, fArr[0], fArr[zA1Y ? 1 : 0]);
                } else if (length == 3) {
                    runtimeShader.setFloatUniform(str, fArr[0], fArr[zA1Y ? 1 : 0], fArr[2]);
                } else if (length == 4) {
                    runtimeShader.setFloatUniform(str, fArr[0], fArr[zA1Y ? 1 : 0], fArr[2], fArr[3]);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (c5219Ddb.A04 && i2 > 0 && i3 > 0) {
            runtimeShader.setFloatUniform("bkResolution", i2, i3);
        }
        if (c5219Ddb.A03) {
            runtimeShader.setFloatUniform("bkRenderMargin", c5220Ddc.A01, c5220Ddc.A03, c5220Ddc.A02, c5220Ddc.A00);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ddb;Ljava/util/List<+Landroid/graphics/RuntimeShader;>;Ljava/util/List<LX/Dd4;>;IILX/Ddc;I)Landroid/graphics/RenderEffect; */
    public final RenderEffect A01(C5220Ddc c5220Ddc, C5219Ddb c5219Ddb, List list, List list2, int i, int i2, int i3) {
        int i4 = i3;
        C7384Etj.A0Y(list2, 2);
        int i5 = c5219Ddb.A01;
        RenderEffect renderEffectCreateChainEffect = null;
        if (list != null && list.size() == i5 && i4 < i5) {
            while (i4 < i5) {
                RuntimeShader runtimeShader = (RuntimeShader) list.get(i4);
                A02(runtimeShader, c5220Ddc, c5219Ddb, list2, i4, i, i2);
                RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "inputImage");
                C7384Etj.A0U(renderEffectCreateRuntimeShaderEffect);
                renderEffectCreateChainEffect = renderEffectCreateChainEffect == null ? renderEffectCreateRuntimeShaderEffect : RenderEffect.createChainEffect(renderEffectCreateRuntimeShaderEffect, renderEffectCreateChainEffect);
                i4++;
            }
        }
        return renderEffectCreateChainEffect;
    }
}
