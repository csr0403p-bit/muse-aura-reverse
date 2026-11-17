package X;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.FbM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8297FbM implements Runnable {
    public static final String __redex_internal_original_name = "Toolbar$2";
    public final /* synthetic */ Toolbar A00;

    public RunnableC8297FbM(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8243FaJ c8243FaJ;
        ActionMenuView actionMenuView = this.A00.A0A;
        if (actionMenuView == null || (c8243FaJ = actionMenuView.A04) == null) {
            return;
        }
        c8243FaJ.A04();
    }
}
