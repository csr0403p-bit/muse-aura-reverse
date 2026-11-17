package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: X.FbH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8292FbH implements FT0 {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ ActionBarContextView A02;

    @Override // X.FT0
    public final void onAnimationCancel(View view) {
        this.A01 = true;
    }

    public C8292FbH(ActionBarContextView actionBarContextView) {
        this.A02 = actionBarContextView;
    }

    @Override // X.FT0
    public final void onAnimationEnd(View view) {
        if (this.A01) {
            return;
        }
        ActionBarContextView actionBarContextView = this.A02;
        actionBarContextView.A06 = null;
        super/*android.view.View*/.setVisibility(this.A00);
    }

    @Override // X.FT0
    public final void onAnimationStart(View view) {
        super/*android.view.View*/.setVisibility(0);
        this.A01 = false;
    }
}
