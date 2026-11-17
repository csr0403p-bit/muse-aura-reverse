package X;

/* renamed from: X.Aat, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1123Aat implements Aay {
    public final Aau[] A00;

    @Override // X.Aay
    public final /* bridge */ /* synthetic */ Aar ABu(int i) {
        return this.A00[i];
    }

    /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
    public C1123Aat(AOd aOd, float f, float f2) {
        int iA02 = aOd.A02();
        Aau[] aauArr = new Aau[iA02];
        for (int i = 0; i < iA02; i++) {
            aauArr[i] = new Aau(f, f2, aOd.A01(i));
        }
        this.A00 = aauArr;
    }
}
