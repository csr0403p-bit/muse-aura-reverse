package X;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;

/* loaded from: classes4.dex */
public abstract class BAC {
    public static BAE A00;

    public static /* synthetic */ void A00(ComponentActivity componentActivity) {
        BAD bad = new BAD(C2278BSe.A00(0));
        BAD bad2 = new BAD(C2278BSe.A00(0));
        View decorView = componentActivity.getWindow().getDecorView();
        C7384Etj.A0U(decorView);
        G0U<Resources, Boolean> g0u = bad.A00;
        Resources resources = decorView.getResources();
        C7384Etj.A0U(resources);
        boolean zA1X = AnonymousClass001.A1X(((C2278BSe) g0u).invoke(resources));
        boolean zA1X2 = AnonymousClass001.A1X(((C2278BSe) bad2.A00).invoke(resources));
        BAE ba7 = A00;
        if (ba7 == null) {
            int i = Build.VERSION.SDK_INT;
            ba7 = i >= 35 ? new BA7() : i >= 30 ? new BAB() : new BA6();
            A00 = ba7;
        }
        Window window = componentActivity.getWindow();
        C7384Etj.A0U(window);
        ba7.Af7(decorView, window, bad, bad2, zA1X, zA1X2);
        Window window2 = componentActivity.getWindow();
        C7384Etj.A0U(window2);
        ba7.A45(window2);
    }

    static {
        Color.argb(230, 255, 255, 255);
        Color.argb(128, 27, 27, 27);
    }
}
