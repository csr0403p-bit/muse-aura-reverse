package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.Ahj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1358Ahj {
    public static final int A00(AbstractC1493Ak0 abstractC1493Ak0, AbstractC1424Ait abstractC1424Ait) {
        AbstractC1424Ait abstractC1424AitA0l;
        boolean z = abstractC1424Ait instanceof AbstractC1387AiH;
        if (!z) {
            AbstractC1387AiH abstractC1387AiH = ((AbstractC1383AiD) abstractC1424Ait).A05.A08;
            if (abstractC1387AiH != null) {
                abstractC1424AitA0l = abstractC1387AiH.A0l();
            }
            ASP.A01(AnonymousClass001.A0v(" cannot be null when calculating alignment line", C3cG.A0f(abstractC1424Ait, "Child of ")));
            throw F60.createAndThrow();
        }
        abstractC1424AitA0l = ((AbstractC1387AiH) abstractC1424Ait).A08;
        if (abstractC1424AitA0l != null) {
            if (abstractC1424Ait.A0e().ACJ().containsKey(abstractC1493Ak0)) {
                Integer num = abstractC1424Ait.A0e().ACJ().get(abstractC1493Ak0);
                if (num != null) {
                    return num.intValue();
                }
                return Integer.MIN_VALUE;
            }
            int iABt = abstractC1424AitA0l.ABt(abstractC1493Ak0);
            if (iABt == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            abstractC1424AitA0l.A06 = true;
            abstractC1424Ait.A05 = true;
            if (z) {
                AbstractC1387AiH abstractC1387AiH2 = (AbstractC1387AiH) abstractC1424Ait;
                GraphicsLayer graphicsLayer = abstractC1387AiH2.A06;
                if (graphicsLayer != null) {
                    abstractC1387AiH2.A0a(graphicsLayer, abstractC1387AiH2.A00, abstractC1387AiH2.A01);
                } else {
                    abstractC1387AiH2.A0b(abstractC1387AiH2.A0C, abstractC1387AiH2.A00, abstractC1387AiH2.A01);
                }
            } else {
                AbstractC1383AiD abstractC1383AiD = (AbstractC1383AiD) abstractC1424Ait;
                abstractC1383AiD.A0b(null, 0.0f, abstractC1383AiD.A00);
            }
            abstractC1424AitA0l.A06 = false;
            abstractC1424Ait.A05 = false;
            return iABt + C8j5.A07(abstractC1424AitA0l instanceof AbstractC1387AiH ? ((AbstractC1387AiH) abstractC1424AitA0l).A01 : ((AbstractC1383AiD) abstractC1424AitA0l).A00, abstractC1493Ak0 instanceof C3Tx ? 1 : 0);
        }
        ASP.A01(AnonymousClass001.A0v(" cannot be null when calculating alignment line", C3cG.A0f(abstractC1424Ait, "Child of ")));
        throw F60.createAndThrow();
    }
}
