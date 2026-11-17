package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.E8p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class EnumC6485E8p {
    public static final EnumC6485E8p[] A00;
    public static final /* synthetic */ EnumC6485E8p[] A01;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6485E8p EF1;

    static {
        F4C f4c = new F4C(0);
        F4C f4c2 = new F4C(1);
        F4C f4c3 = new F4C(2);
        F4C f4c4 = new F4C(3);
        F4C f4c5 = new F4C(4);
        F4C f4c6 = new F4C(5);
        F4C f4c7 = new F4C(6);
        F4C f4c8 = new F4C(7);
        A01 = new EnumC6485E8p[]{f4c, f4c2, f4c3, f4c4, f4c5, f4c6, f4c7, f4c8};
        A00 = new EnumC6485E8p[]{f4c, f4c2, f4c3, f4c4, f4c5, f4c6, f4c7, f4c8};
    }

    public static EnumC6485E8p valueOf(String name) {
        return (EnumC6485E8p) Enum.valueOf(EnumC6485E8p.class, name);
    }

    public static EnumC6485E8p[] values() {
        return (EnumC6485E8p[]) A01.clone();
    }

    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(LX/E8T<TK;TV;>;TK;ILX/E8b<TK;TV;>;)LX/E8b<TK;TV;>; */
    public final E8b A01(E8T segment, E8b key, Object hash, int next) {
        switch (((F4C) this).$t) {
            case 0:
                return new E8i(key, hash, next);
            case 1:
                C6492E8w c6492E8w = new C6492E8w(key, hash, next);
                c6492E8w.A02 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                E8k e8k = E8k.A01;
                c6492E8w.A00 = e8k;
                c6492E8w.A01 = e8k;
                return c6492E8w;
            case 2:
                C6491E8v c6491E8v = new C6491E8v(key, hash, next);
                c6491E8v.A02 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                E8k e8k2 = E8k.A01;
                c6491E8v.A00 = e8k2;
                c6491E8v.A01 = e8k2;
                return c6491E8v;
            case 3:
                C6488E8s c6488E8s = new C6488E8s(key, hash, next);
                c6488E8s.A04 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                E8k e8k3 = E8k.A01;
                c6488E8s.A00 = e8k3;
                c6488E8s.A02 = e8k3;
                c6488E8s.A05 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                c6488E8s.A01 = e8k3;
                c6488E8s.A03 = e8k3;
                return c6488E8s;
            case 4:
                return new E8X(key, hash, segment.keyReferenceQueue, next);
            case 5:
                C6490E8u c6490E8u = new C6490E8u(key, hash, segment.keyReferenceQueue, next);
                c6490E8u.A02 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                E8k e8k4 = E8k.A01;
                c6490E8u.A00 = e8k4;
                c6490E8u.A01 = e8k4;
                return c6490E8u;
            case 6:
                C6489E8t c6489E8t = new C6489E8t(key, hash, segment.keyReferenceQueue, next);
                c6489E8t.A02 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                E8k e8k5 = E8k.A01;
                c6489E8t.A00 = e8k5;
                c6489E8t.A01 = e8k5;
                return c6489E8t;
            default:
                C6487E8r c6487E8r = new C6487E8r(key, hash, segment.keyReferenceQueue, next);
                c6487E8r.A04 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                E8k e8k6 = E8k.A01;
                c6487E8r.A00 = e8k6;
                c6487E8r.A02 = e8k6;
                c6487E8r.A05 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                c6487E8r.A01 = e8k6;
                c6487E8r.A03 = e8k6;
                return c6487E8r;
        }
    }

    public static final <K, V> void A00(E8b<K, V> original, E8b<K, V> newEntry) {
        newEntry.Ace(original.ACB());
        E8b<K, V> e8bAIz = original.AIz();
        e8bAIz.Adp(newEntry);
        newEntry.AeD(e8bAIz);
        E8b<K, V> e8bAI3 = original.AI3();
        newEntry.Adp(e8bAI3);
        e8bAI3.AeD(newEntry);
        E8k e8k = E8k.A01;
        original.Adp(e8k);
        original.AeD(e8k);
    }

    public EnumC6485E8p(String $enum$name, int $enum$ordinal) {
    }
}
