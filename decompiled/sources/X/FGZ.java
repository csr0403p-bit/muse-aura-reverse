package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FGZ {
    public static final FGT<Object> A00 = new HlT();

    public static final FGW A00(C7764FDr c7764FDr, InterfaceC7823FGe interfaceC7823FGe, long j) {
        C7384Etj.A0Y(interfaceC7823FGe, 1);
        ArrayList arrayListA0h = C3cG.A0h();
        RenderTreeNode renderTreeNodeA01 = A01(new Rect(0, 0, interfaceC7823FGe.getWidth(), interfaceC7823FGe.getHeight()), interfaceC7823FGe, null, A00);
        arrayListA0h.add(renderTreeNodeA01);
        A02(c7764FDr.A03, interfaceC7823FGe, renderTreeNodeA01, arrayListA0h, 0, 0);
        return new FGW(renderTreeNodeA01, c7764FDr.A04, (RenderTreeNode[]) arrayListA0h.toArray(new RenderTreeNode[0]), j);
    }

    public static final void A02(Context context, InterfaceC7823FGe interfaceC7823FGe, RenderTreeNode renderTreeNode, ArrayList arrayList, int i, int i2) {
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (interfaceC7823FGe != null) {
            Rect rect = new Rect(i, i2, interfaceC7823FGe.getWidth() + i, interfaceC7823FGe.getHeight() + i2);
            arrayList.size();
            FGT<?> fgtAJY = interfaceC7823FGe.AJY();
            if (fgtAJY != null) {
                int iADd = interfaceC7823FGe.ADd();
                RenderTreeNode renderTreeNodeA01 = A01(rect, interfaceC7823FGe, renderTreeNode, fgtAJY);
                arrayList.add(renderTreeNodeA01);
                List list = (List) renderTreeNode.A09.getValue();
                if (iADd > 0) {
                    list.add(renderTreeNodeA01);
                    renderTreeNode2 = renderTreeNodeA01;
                } else {
                    list.add(renderTreeNodeA01);
                }
                i = 0;
                i2 = 0;
            }
            int iADd2 = interfaceC7823FGe.ADd();
            for (int i3 = 0; i3 < iADd2; i3++) {
                A02(context, interfaceC7823FGe.ADY(i3), renderTreeNode2, arrayList, interfaceC7823FGe.AMu(i3) + i, interfaceC7823FGe.AMv(i3) + i2);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FGe;LX/FGT<Ljava/lang/Object;>;Landroid/graphics/Rect;Lcom/facebook/rendercore/RenderTreeNode;)Lcom/facebook/rendercore/RenderTreeNode; */
    public static final RenderTreeNode A01(Rect rect, InterfaceC7823FGe interfaceC7823FGe, RenderTreeNode renderTreeNode, FGT fgt) {
        int iAIP = interfaceC7823FGe.AIP();
        return new RenderTreeNode(rect, (iAIP == 0 && interfaceC7823FGe.AIR() == 0 && interfaceC7823FGe.AIQ() == 0 && interfaceC7823FGe.AIO() == 0) ? null : new Rect(iAIP, interfaceC7823FGe.AIR(), interfaceC7823FGe.AIQ(), interfaceC7823FGe.AIO()), Hra.A00, renderTreeNode, fgt, interfaceC7823FGe.AGy(), renderTreeNode != null ? AbstractC7607F5u.A0G(renderTreeNode.A09.getValue()) : 0);
    }
}
