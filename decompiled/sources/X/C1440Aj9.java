package X;

/* renamed from: X.Aj9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1440Aj9 {
    public int A00;
    public C0910AHm<AbB> A01;
    public C0910AHm<AbB> A02;
    public AbstractC1439Aj8 A03;
    public boolean A04;
    public final /* synthetic */ C1438Aj7 A05;

    /* JADX WARN: Multi-variable type inference failed */
    public C1440Aj9(C0910AHm c0910AHm, AbstractC1439Aj8 abstractC1439Aj8, int i, C0910AHm<AbB> c0910AHm2, C0910AHm<AbB> c0910AHm3, boolean z) {
        this.A05 = c0910AHm2;
        this.A03 = i;
        this.A00 = c0910AHm3;
        this.A02 = c0910AHm;
        this.A01 = abstractC1439Aj8;
        this.A04 = z;
    }

    public final boolean A00(int i, int i2) {
        C0910AHm<AbB> c0910AHm = this.A02;
        int i3 = this.A00;
        AbB abB = c0910AHm.A01[i3 + i];
        AbB abB2 = this.A01.A01[i3 + i2];
        return C7384Etj.areEqual(abB, abB2) || abB.getClass() == abB2.getClass();
    }
}
