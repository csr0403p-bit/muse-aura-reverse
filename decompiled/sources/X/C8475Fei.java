package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: X.Fei, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8475Fei extends View {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C8474Feh A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8475Fei(Context context, ViewGroup viewGroup, C8474Feh c8474Feh) {
        super(context);
        this.A01 = c8474Feh;
        this.A00 = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.A00.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        C8474Feh c8474Feh = this.A01;
        if (c8474Feh.A00 == color) {
            return;
        }
        c8474Feh.A00 = color;
        ArrayList<InterfaceC8476Fej> arrayList = c8474Feh.A04;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ArrayList<C8480Fen> arrayList2 = ((C8479Fem) arrayList.get(size)).A05;
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    C8480Fen c8480Fen = arrayList2.get(size2);
                    if (!c8480Fen.A04) {
                        C8480Fen.A00(c8480Fen, color);
                    }
                }
            }
        }
    }
}
