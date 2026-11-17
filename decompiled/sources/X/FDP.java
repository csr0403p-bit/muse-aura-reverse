package X;

import android.content.Context;
import android.view.MotionEvent;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public abstract class FDP {
    public static final int A00(Context context, float f) {
        return f > 0.0f ? (int) ((f / C60Q.A0B(context).density) + 0.5f) : -((int) (((-f) / C60Q.A0B(context).density) + 0.5f));
    }

    public static final Hj6 A01(MotionEvent motionEvent, FSU fsu, FBB fbb, FDW fdw) {
        C9115Fyg c9115FygA01 = C9115Fyg.A01(fdw);
        c9115FygA01.A06(fbb, 1);
        Context contextA00 = FBB.A00(fbb);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        linkedHashMapA0j.put("x", Integer.valueOf(A00(contextA00, motionEvent.getX())));
        linkedHashMapA0j.put("y", Integer.valueOf(A00(contextA00, motionEvent.getY())));
        linkedHashMapA0j.put("content_width", Integer.valueOf(A00(contextA00, AbstractC7607F5u.A02(fsu))));
        linkedHashMapA0j.put("content_height", Integer.valueOf(A00(contextA00, AbstractC7607F5u.A03(fsu))));
        linkedHashMapA0j.put("screen_width", Integer.valueOf(A00(contextA00, C60Q.A0B(contextA00).widthPixels)));
        linkedHashMapA0j.put("screen_height", Integer.valueOf(A00(contextA00, C60Q.A0B(contextA00).heightPixels)));
        return C9115Fyg.A03(c9115FygA01, linkedHashMapA0j, 2);
    }
}
