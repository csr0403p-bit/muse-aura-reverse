package X;

import android.widget.RemoteViews;

/* renamed from: X.75S, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75S {
    public static final void A00(RemoteViews remoteViews, C72e c72e, int i) {
        C75Y.A00(i, remoteViews);
        if (!(c72e instanceof C72R)) {
            throw C3cG.A0Q(FGI.A0M("Rounded corners should not be ", C60Q.A0f(c72e)));
        }
        remoteViews.setViewOutlinePreferredRadius(i, ((C72R) c72e).A00, 1);
    }

    public static final void A01(RemoteViews remoteViews, C72e c72e, int i) {
        float f;
        if (c72e instanceof AnonymousClass735) {
            f = -2.0f;
        } else if (c72e instanceof C72T) {
            f = 0.0f;
        } else if (c72e instanceof C72R) {
            remoteViews.setViewLayoutHeight(i, ((C72R) c72e).A00, 1);
            return;
        } else {
            if (!c72e.equals(C72U.A00)) {
                throw C3cG.A0q();
            }
            f = -1.0f;
        }
        remoteViews.setViewLayoutHeight(i, f, 0);
    }

    public static final void A02(RemoteViews remoteViews, C72e c72e, int i) {
        float f;
        if (c72e instanceof AnonymousClass735) {
            f = -2.0f;
        } else if (c72e instanceof C72T) {
            f = 0.0f;
        } else if (c72e instanceof C72R) {
            remoteViews.setViewLayoutWidth(i, ((C72R) c72e).A00, 1);
            return;
        } else {
            if (!c72e.equals(C72U.A00)) {
                throw C3cG.A0q();
            }
            f = -1.0f;
        }
        remoteViews.setViewLayoutWidth(i, f, 0);
    }
}
