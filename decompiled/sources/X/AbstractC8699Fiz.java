package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.Fiz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8699Fiz {
    public static final PointF A00 = new PointF();

    public static int A00(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!C8j3.A1Q(i ^ i2) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void A01(Path path, C10447Hid c10447Hid) {
        path.reset();
        PointF pointF = c10447Hid.A00;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = A00;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            List<HjF> list = c10447Hid.A02;
            if (i >= list.size()) {
                break;
            }
            HjF hjF = list.get(i);
            PointF pointF3 = hjF.A00;
            PointF pointF4 = hjF.A01;
            PointF pointF5 = hjF.A02;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
        }
        if (c10447Hid.A01) {
            path.close();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;LX/FkW;)V */
    public static void A02(InterfaceC8792FkW interfaceC8792FkW, C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        if (c8669FiV.A01(interfaceC8792FkW.getName(), i)) {
            String name = interfaceC8792FkW.getName();
            C8669FiV c8669FiV3 = new C8669FiV(c8669FiV2);
            c8669FiV3.A01.add(name);
            C8669FiV c8669FiV4 = new C8669FiV(c8669FiV3);
            c8669FiV4.A00 = interfaceC8792FkW;
            list.add(c8669FiV4);
        }
    }
}
