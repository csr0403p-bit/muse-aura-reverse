package X;

import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.FvH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8969FvH {
    public final UUID A00;
    public final List<String> A01;
    public final List<C8964Fuh> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8969FvH) {
                C8969FvH c8969FvH = (C8969FvH) obj;
                if (!this.A02.equals(c8969FvH.A02) || !this.A01.equals(c8969FvH.A01) || !this.A00.equals(c8969FvH.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final HxE<Instant, Instant> A00() {
        Instant instant;
        List<C8964Fuh> list = this.A02;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<C8964Fuh> it = list.iterator();
        if (!it.hasNext()) {
            throw C8j3.A1D();
        }
        Instant instant2 = it.next().A07;
        loop0: while (true) {
            instant = instant2;
            while (it.hasNext()) {
                instant2 = it.next().A07;
                if (instant.compareTo(instant2) > 0) {
                    break;
                }
            }
        }
        Iterator<C8964Fuh> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw C8j3.A1D();
        }
        Instant instant3 = it2.next().A06;
        while (true) {
            Instant instant4 = instant3;
            while (it2.hasNext()) {
                instant3 = it2.next().A06;
                if (instant4.compareTo(instant3) < 0) {
                    break;
                }
            }
            return C3cG.A0r(instant, instant4);
        }
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)));
    }

    public final String toString() {
        List<C8964Fuh> list = this.A02;
        List<String> list2 = this.A01;
        UUID uuid = this.A00;
        StringBuilder sbA0f = C3cG.A0f(list, "MetaHealthObserverBatch(samples=");
        sbA0f.append(", deletedSampleIds=");
        sbA0f.append(list2);
        return C3cJ.A0L(uuid, ", token=", sbA0f);
    }

    public C8969FvH(List<C8964Fuh> list, List<String> list2, UUID uuid) {
        AnonymousClass003.A0u(list, list2);
        this.A02 = list;
        this.A01 = list2;
        this.A00 = uuid;
    }
}
