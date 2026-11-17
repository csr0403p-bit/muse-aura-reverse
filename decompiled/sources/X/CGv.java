package X;

/* loaded from: classes5.dex */
public final class CGv implements CGu {
    public final CGu[] A00;

    @Override // X.CGu
    public final void AVV(C4019Ck1 c4019Ck1, C7416EvJ c7416EvJ) {
        CGu[] cGuArr = this.A00;
        int i = 0;
        do {
            cGuArr[i].AVV(c4019Ck1, c7416EvJ);
            i++;
        } while (i < 2);
    }

    public CGv(CGu[] cGuArr) {
        this.A00 = cGuArr;
    }
}
