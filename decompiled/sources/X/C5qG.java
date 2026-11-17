package X;

import java.util.List;

/* renamed from: X.5qG, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5qG implements C5qH {
    public final /* synthetic */ C5qH A00;
    public final /* synthetic */ C5qH A01;

    @Override // X.C5qH
    public final AMP calculateScene(C5r1 c5r1, List list) {
        C5qH c5qH = this.A00;
        C5qH c5qH2 = this.A01;
        AMP ampCalculateScene = c5qH.calculateScene(c5r1, list);
        return ampCalculateScene == null ? c5qH2.calculateScene(c5r1, list) : ampCalculateScene;
    }

    public /* synthetic */ C5qG(C5qH c5qH, C5qH c5qH2) {
        this.A00 = c5qH;
        this.A01 = c5qH2;
    }
}
