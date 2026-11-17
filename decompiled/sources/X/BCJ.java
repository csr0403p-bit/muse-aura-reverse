package X;

/* loaded from: classes4.dex */
public abstract class BCJ {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/BBe;ITT;)V */
    public static final void A00(BBe bBe, Object obj, int i) {
        bBe.A05[(bBe.A01 - bBe.A04[bBe.A02 - 1].A01) + i] = obj;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;U:Ljava/lang/Object;>(LX/BBe;ITT;ITU;)V */
    public static final void A01(BBe bBe, Object obj, Object obj2, int i, int i2) {
        int i3 = bBe.A01 - bBe.A04[bBe.A02 - 1].A01;
        Object[] objArr = bBe.A05;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }
}
