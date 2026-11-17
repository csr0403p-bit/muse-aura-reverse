package X;

/* renamed from: X.CVb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3580CVb extends CIH<C3581CVc> {
    public final DQZ<Class<? extends AbstractC3582CVd>, CIH> A02 = new DQZ<>(0);
    public final DQZ<Long, CIH> A01 = new DQZ<>(0);
    public final DQZ<Long, Class<? extends AbstractC3582CVd>> A00 = new DQZ<>(0);

    /* JADX WARN: Incorrect return type in method signature: <T:LX/CVd<TT;>;>(Ljava/lang/Class<TT;>;LX/CIH<TT;>;)LX/CVb; */
    public final void A03(CIH cih, Class cls) {
        DQZ<Long, Class<? extends AbstractC3582CVd>> dqz = this.A00;
        long jA00 = cih.A00();
        Long lValueOf = Long.valueOf(jA00);
        Class<? extends AbstractC3582CVd> cls2 = dqz.get(lValueOf);
        if (cls2 == null || cls2 == cls) {
            this.A02.put(cls, cih);
            this.A01.put(lValueOf, cih);
            dqz.put(lValueOf, cls);
        } else {
            StringBuilder sbA0x = C60O.A0x("Serializers ");
            sbA0x.append(cls2.getCanonicalName());
            sbA0x.append(" and ");
            sbA0x.append(cls.getCanonicalName());
            sbA0x.append(" have a conflicting tag: `");
            sbA0x.append(jA00);
            throw BV4.A0c(AnonymousClass001.A0v("`.", sbA0x));
        }
    }
}
