package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FTr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8103FTr implements FUJ {
    public final /* synthetic */ RecyclerView A00;

    public C8103FTr(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    @Override // X.FUJ
    public final void ATo(View view) {
        FTV ftvA08 = RecyclerView.A08(view);
        if (ftvA08 != null) {
            RecyclerView recyclerView = this.A00;
            int i = ftvA08.A06;
            if (recyclerView.A03 > 0) {
                ftvA08.A03 = i;
                recyclerView.A1A.add(ftvA08);
            } else {
                ftvA08.A0I.setImportantForAccessibility(i);
            }
            ftvA08.A06 = 0;
        }
    }
}
