package X;

import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.75L, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75L {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.67v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(final android.widget.RemoteViews r23, X.C76B r24, final X.C75T r25, final X.C75P r26) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75L.A01(android.widget.RemoteViews, X.76B, X.75T, X.75P):void");
    }

    public static final void A02(RemoteViews remoteViews, C062775h c062775h, int i) {
        C72e c72e = c062775h.A00;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            List listAsList = Arrays.asList(AnonymousClass735.A00, C72U.A00, C72T.A00);
            int i3 = C75c.A01;
            if (!listAsList.contains(c72e)) {
                throw C60O.A0i(AnonymousClass001.A0v(" requires a complex layout before API 31", C3cG.A0f(c72e, "Using a height of ")));
            }
            return;
        }
        if (i2 >= 33 || !Arrays.asList(AnonymousClass735.A00, C72T.A00).contains(c72e)) {
            C75S.A01(remoteViews, c72e, i);
        }
    }

    public static final void A03(RemoteViews remoteViews, C062875i c062875i, int i) {
        C72e c72e = c062875i.A00;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            List listAsList = Arrays.asList(AnonymousClass735.A00, C72U.A00, C72T.A00);
            int i3 = C75c.A01;
            if (!listAsList.contains(c72e)) {
                throw C60O.A0i(AnonymousClass001.A0v(" requires a complex layout before API 31", C3cG.A0f(c72e, "Using a width of ")));
            }
            return;
        }
        if (i2 >= 33 || !Arrays.asList(AnonymousClass735.A00, C72T.A00).contains(c72e)) {
            C75S.A02(remoteViews, c72e, i);
        }
    }

    public static final boolean A04(C72e c72e) {
        if (c72e instanceof C72R) {
            return true;
        }
        if (C7384Etj.areEqual(c72e, C72T.A00) || C7384Etj.areEqual(c72e, C72U.A00) || C7384Etj.areEqual(c72e, AnonymousClass735.A00) || c72e == null) {
            return false;
        }
        throw C3cG.A0q();
    }

    public static void A00(Intent intent, C75P c75p, int i) {
        if (intent.getData() == null) {
            intent.setData(AnonymousClass779.A00(c75p, C79.A0P, String.valueOf(intent.getFlags()), i));
        }
    }
}
