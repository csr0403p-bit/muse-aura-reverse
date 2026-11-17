package X;

import android.view.View;

/* renamed from: X.AnE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1638AnE {
    public static final C1539Aky A00 = new C1539Aky();

    public static final void A00(View view, C1453AjM c1453AjM) {
        long jAPo = c1453AjM.A0f.A07.APo(0L);
        int iRound = Math.round(AnonymousClass003.A03(jAPo));
        int iRound2 = Math.round(AnonymousClass004.A00(jAPo));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}
