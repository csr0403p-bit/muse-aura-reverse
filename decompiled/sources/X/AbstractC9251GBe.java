package X;

/* renamed from: X.GBe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9251GBe {
    public static final HrH A02 = HrH.A00("COMPLETING_ALREADY");
    public static final HrH A04 = HrH.A00("COMPLETING_WAITING_CHILDREN");
    public static final HrH A03 = HrH.A00("COMPLETING_RETRY");
    public static final HrH A06 = HrH.A00("TOO_LATE_TO_CANCEL");
    public static final HrH A05 = HrH.A00("SEALED");
    public static final C9257GBk A01 = new C9257GBk(false);
    public static final C9257GBk A00 = new C9257GBk(true);

    public static final Object A00(Object obj) {
        C9271GBy c9271GBy;
        InterfaceC9269GBw interfaceC9269GBw;
        return (!(obj instanceof C9271GBy) || (c9271GBy = (C9271GBy) obj) == null || (interfaceC9269GBw = c9271GBy.A00) == null) ? obj : interfaceC9269GBw;
    }
}
