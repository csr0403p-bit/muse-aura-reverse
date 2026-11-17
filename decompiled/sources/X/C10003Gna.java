package X;

/* renamed from: X.Gna, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10003Gna {
    public static final C10003Gna A05 = new C10003Gna(C10009Gnh.A00, Object.class, null, null, false);
    public final C10009Gnh A00;
    public final Class<? extends AbstractC9848Gir<?>> A01;
    public final Class<? extends InterfaceC9851Giv> A02;
    public final Class<?> A03;
    public final boolean A04;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ObjectIdInfo: propName=");
        sbA0x.append(this.A00);
        sbA0x.append(", scope=");
        sbA0x.append(AbstractC9855Gj3.A06(this.A03));
        sbA0x.append(", generatorType=");
        sbA0x.append(AbstractC9855Gj3.A06(this.A01));
        sbA0x.append(", alwaysAsId=");
        sbA0x.append(this.A04);
        return sbA0x.toString();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gnh;Ljava/lang/Class<*>;Ljava/lang/Class<+LX/Gir<*>;>;ZLjava/lang/Class<+LX/Giv;>;)V */
    public C10003Gna(C10009Gnh c10009Gnh, Class cls, Class cls2, Class cls3, boolean z) {
        this.A00 = c10009Gnh;
        this.A03 = cls;
        this.A01 = cls2;
        this.A04 = z;
        this.A02 = cls3 == null ? C10160GqT.class : cls3;
    }
}
