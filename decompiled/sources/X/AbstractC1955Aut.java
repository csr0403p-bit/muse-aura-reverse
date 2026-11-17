package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Aut, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1955Aut {
    public static final void A00(C1EQ c1eq, InterfaceC1327AhE interfaceC1327AhE, C1780Aqg c1780Aqg, C16b c16b, C1956Auv c1956Auv, BG3 bg3, float f) {
        interfaceC1327AhE.Ac2();
        List<C1960Auz> list = c1956Auv.A05;
        if (list.size() <= 1 || (c1eq instanceof C1326AhD)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                InterfaceC2006AwF interfaceC2006AwF = C8j3.A0i(list, i).A06;
                interfaceC2006AwF.AXa(c1eq, interfaceC1327AhE, c1780Aqg, c16b, bg3, f, 3);
                interfaceC1327AhE.AhL(0.0f, interfaceC2006AwF.AGD());
            }
        } else {
            if (!(c1eq instanceof AbstractC1336AhN)) {
                throw C3cG.A0q();
            }
            int size2 = list.size();
            float fMax = 0.0f;
            float fAGD = 0.0f;
            for (int i2 = 0; i2 < size2; i2++) {
                fAGD += C8j3.A0i(list, i2).A06.AGD();
                fMax = Math.max(fMax, Constraints.A01(((C1957Auw) r1).A00));
            }
            Shader shaderA08 = ((AbstractC1336AhN) c1eq).A08(AnonymousClass007.A0A(fMax, fAGD));
            Matrix matrix = new Matrix();
            shaderA08.getLocalMatrix(matrix);
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                InterfaceC2006AwF interfaceC2006AwF2 = C8j3.A0i(list, i3).A06;
                interfaceC2006AwF2.AXa(new C1552AlH(shaderA08), interfaceC1327AhE, c1780Aqg, c16b, bg3, f, 3);
                interfaceC1327AhE.AhL(0.0f, interfaceC2006AwF2.AGD());
                matrix.setTranslate(0.0f, -interfaceC2006AwF2.AGD());
                shaderA08.setLocalMatrix(matrix);
            }
        }
        interfaceC1327AhE.Abc();
    }
}
